# Lab Report 4 | VIM
## Andrew Jeter | June 5, 2023 | CSE15L Politz, J.
  
For this lab report, I will be detailing the steps to the `vim` challenge in Lab 7. As we all know, `vim` is a very powerful yet quite controversial programming language, but after learning the basics and using it for the Skill Demonstration 2 practice, it actually proved itself very handy in my `ssh` `ieng6` login, where I didn't have access to anything but the command line in Visual Studio Code. A handy tool called `vimtutor` showed me the ropes, and it is very helpful at teaching you how to navigate such a daunting interface. Anyways, here is a fun little reminder of the many joys of Vim, although if this is your first time using Vim, please don't worry :)

***

![Image](Fun_vim_Meme.jpeg)

_Credit: [https://www.freecodecamp.org/news/how-i-learned-to-love-vim-ce3e058d57fb/](https://www.freecodecamp.org/news/how-i-learned-to-love-vim-ce3e058d57fb/)_

***

### Timing Tasks!
We will use this repository for the purposes of these tasks: [https://github.com/ucsd-cse15l-s23/lab7](https://github.com/ucsd-cse15l-s23/lab7)


1. **Setup** Delete any existing forks of the repository I have on my account
2. **Setup** Fork the repository
3. **Start the Timer!**
4. Log into `ieng6`
  - To get to this step, you just need to type `ssh cs15lsp23__@ieng6.ucsd.edu` into the command line, and if you don't have an `ssh key` on your local system, then just enter your password as well.
5. Clone my fork of the repository from my Github account
  - To clone the fork, use `git clone https://github.com/acjeter/lab7`
6. Run the tests, demonstrating that they fail
  - To run the tests, you must first make sure that you change the working directory by using `cd` to `lab7/` or wherever you put the cloned lab7.
  - After that, input `bash test.sh` to test the file, the output should show that `ListExamples.java` did not pass one of the JUnit testers.
7. Edit the code file `ListExamples.java` to fix the failing test (the error is that `index1` is used instead of `index2` in the final loop in `merge`
  - Now, to fix the code, we're going to enter `vim`. `Vim` allows us to make command-line edits to a file, and in this case, since there is a bug with `ListExamples.java`, we will need to enter `vim ListExamples.java` into the command-line. 
  - The screen that follows is the `vim` view of `ListExamples.java`! How cool! Now, while you might think that vim is able to be navigated by clicking with the curser and making edits just like Visual Studio Code, unfortunately that is not the case. 
  - With vim, you will need to use the `<H>` key to move right, `<J>` key to move down, `<K>` key to move up, and `<L>` key to move left. 
  - To make edits, you need to press `<i>` to enter insert mode. Alternatively, you can press `<R>` to replace one character, by typing the character you want to replace it with after. To exit `insert mode`, you simply need to press the `<esc>` key to enter `normal mode`. 
  - To exit vim altogether *without* saving your changes, you can type `:q`. To exit AND save your changes, make sure to type `:wq`.
  - Now, lets fix the bug. We will need to move the curser down to the line that contains the bug, which is in the second while loop. For me, I needed to press `<J><J><J><J><J><J><J><J><J><J><J><J><J><J><J><J><J><J><J><J><J><J><J><J><J><J><J><J><J><J><L><L><L><L><L><L><L><L><L><L><L> <R><2>` and then I saved and exited vim by typing: `:wq`.
  - Now, the second line down in the second while loop should read: `index2 += 2;`, and `ListExamples.java` should be all fixed!

8. Run the tests, demonstrating that they now succeed
  - After exiting vim, we will need to re-run the tests, by going up twice in our `bash` history. For me, I was able to re-enter `bash test.sh` quickly by typing `<up><up><enter>`. The result of the edits in vim are below:


9. Commit and push the resulting change to your Github account
  - Finally, to commit the changes you have made to your edited clone, you will need to type and enter `git commit`. This will begin the commit process. After you type this, you will need to input `git add <file>` for each of the files that bash is telling you need to be added. It looks like this:


After you've completed steps 1-3 on your own, follow along with me as I guide us through the rest! 


