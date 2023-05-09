# Lab Report 2 | Servers and Bugs
## Andrew Jeter | April 22, 2023 | CSE 15L Politz, J.

Welcome back CSE15L students! I know what it has been only a few weeks since the last post, but I am excited for what we will be talking about today! I'm confident that if you did well during the first tutorial you'll do even better on this one! We will be writing a web server called `StringServer` that supports the specified path and behavior that I will describe below. The web server that we develop will be able to keep track of a string that gets added to by incoming url requests.

![image](https://github.com/acjeter/cse15l-lab-reports/assets/119645659/4a20ab05-64b8-47ea-82f2-af4048c1233a)


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

<img width="541" alt="Screenshot 2023-05-09 at 12 49 58 PM" src="https://github.com/acjeter/cse15l-lab-reports/assets/119645659/fbfe48f4-3ed4-4f4f-af21-25426258e5db">

When using the `/add-message?s=<string>` url request, 
