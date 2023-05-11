# Lab Report 2 | Servers and Bugs
## Andrew Jeter | April 22, 2023 | CSE 15L Politz, J.

Welcome back CSE15L students! I know what it has been only a few weeks since the last post, but I am excited for what we will be talking about today! I'm confident that if you did well during the first tutorial you'll do even better on this one! We will be writing a web server called `StringServer` that supports the specified path and behavior that I will describe below. The web server that we develop will be able to keep track of a string that gets added to by incoming url requests.

![image](https://github.com/acjeter/cse15l-lab-reports/assets/119645659/4a20ab05-64b8-47ea-82f2-af4048c1233a)
*credit: [https://www.yourtango.com/2018320275/30-motivational-quotes-memes-when-you-need-inspiration](https://www.yourtango.com/2018320275/30-motivational-quotes-memes-when-you-need-inspiration)*

## Part 1: StringServer

The specific request that the web server will handle is:

`/add-message?s=<string>`

This url request will concatenate a new line (`\n`) and the string given after the `=` in the query to the running string in the web server, and the server will then output the entire sting so far.

For example, after

`/add-message?=Hi!`

The page should display

> `Hi!`

and after

`/add-message?s=How are you doing today?`

the page should show

> `Hi!`
> 
> `How are you doing today?`

When writing this web server, it is important to note the criterion of the writeup. Here, you will need to create `runningString`, a passive variable of type `String` that will be added to. This is because the web server needs to be able to handle multiple requests, and they are to be concatenated together on new lines for each string given through a new request. The implemented code for `StringServer` will look like this.

![image](StringServer-Code.png)

***

**IMPORTANT**
Something that I *painfully* discovered while working on this lab report for two weeks, I was having duplication issues on the web server on `Safari`. I came to realize that I was having issues _because_ I was using `Safari`. I guess it was random, but I'm not really sure. All I know is that it **works on `Google Chrome`**. So for the purposes of my writing below, I was using the `Google Chrome` browser.

***

When using the `/add-message?s=Hello` url request, here is what the web server should do:

![image](StrServ2.png)

In this screenshot, `handleRequest` is called to actually *do* something with the url inputted. This depends on the path inputted, and depending on this, the `query` inputted. For this screenshot, `Hello` is part of the query after the `?s=`. The relevent fields include `runningString`, `port`, `URI`, `urlStrings`, and `query`. 

For this screenshot:

1. `int port = 4092`
2. `URI url = http://localhost:4092/add-message?s=Hello`
3. `String runningString = "Hello + \n"`
4. `String query = s=Hello`
5. `String[] urlStrings = {s=, Hello}`


Originally, the value of port is null, the value of `runningString` is an empty string, the value of `query` is an empty string, and the value of `urlStrings` is an empty string. The changes of the relevant fields of the class are made when you input the one string in the query of the `/add-message?s=<string>` request, which triggers the if statement to update the `runningString`.

***

When using the `/add-message?s=How are you?` url request, here is what the web server should do:

![image](StrServ3.png)

In this screenshot, `handleRequest` is again called to handle the request. This url request has `path /add-message` and `query ?s=How are you?`. This means that runningString will need to be updated, along with other values for the fields mentioned below.

1. `int port = 4092` (Port remains the same since there isn't a new server started.)
2. `URI url = http://localhost:4092/add-message?s=How are you?`
3. `String runningString = "Hello + \n + How are you? + \n"`
4. `String query = s=How are you?`
5. `String[] urlStrings = {s=, Hello}`


Before this request the values of the fields above were as I stated in the outline of the previous screenshot.

## Part 2: Bugs

Lab 3 had oddly, lots of 🐛s! Through working with my lab group on the bug fixing, I learned that even if some of the most important parts of the code are working, it is **extremely** important to test _all_ of your code thoroughly! Think about the context: you are developing a security system software for a hostpital's medical files. You **have** to make sure that the code has no possible way to break into the personal medical data, otherwise confidential patient information could get spread into the public! This is not only scary, but _illegal_. I will walkthrough information for one of the bugs we resolved from Lab 3 here. 

This bug is inside of the `ArrayExamples.java` file in the `CSE15L-SP23-LAB3` repository.

The failure-inducing JUnit test was:
```
@Test
public void testReversed2() {
  int[] input2 = {1, 2, 3};
  assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input2));
}
```

The JUnit test that didn't cause any errors:
```
@Test
  public void testReversed() {
    int[] input4 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input4));
  }
```
The reason that this test didn't cause an error is because there is only an empty string as input to the reverse() method, therefore since the original buggy method returns the input array instead of the new array, the old array is returned, which is the same as what the new array is supposed to be.

The symptom that resulted from the failure-inducing test was as below, the returned array was just the improperly modified original array.

![image](https://github.com/acjeter/cse15l-lab-reports/assets/119645659/5e3acb95-6f9e-49e1-820e-654f268dbc78)

The original code was:
```
static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }
```

The fixed code is here below:
```
static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length ];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }
```
The errors are that the returned array is the parameter array `arr`, not the new array `newArray`. This is a problem because right off the bat, nothing that is being changed is actually being returned after `reversed()` is called. Also, in line 4, `arr` and `newArray` are swapped, and it should be:
```
newArray[i] = arr[arr.length - i - 1];
```
Now, all of the bugs in `reversed()` are fixed, and you hopefully gained some skills in seeking out those pesky 🐞s!

I knew you could do it no problem! :)

## Part 3: New Skills

During lab 2 I learned TONS of significant information about Git commands and GitHub! My favorite part of the lab was experimenting with cloning with Github Desktop, and learning how to leverage that tool for use during programming projects. We also learned in the lab how to start a server, and how to start a server remotely. To access the server, we learned about running requests through a local browser, or on the remote `ieng6` computer through `ssh`. Alternatively, you can also access URLs through the Command Line with the `curl` command, but I personally prefer running the requests through the browser route.

***

Thanks for reading about Servers and Bugs in my Lab Report 2! I hope that you could gain some useful skills or learn how to utilize new skills to your advantage in this blog post! As always, have a great day and I'll see you in the next one! :)


