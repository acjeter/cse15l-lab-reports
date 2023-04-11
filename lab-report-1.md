# Lab Report 1 | Remote Access and FileSystem

## Andrew Jeter | April 10, 2023 | CSE 15L Politz, J.

Welcome new CSE 15L students! Throughout this post, I will go through the steps to log into your course-specific account on `ieng6`!
While it might seem a little bit daunting at first, once you go through these steps I'm confident that you'll be able to understand the remote access login process and some basic FileSystem commands to be able to do it yourself with no problem! :)

## Step 1: Installing Visual Studio Code
Before we begin, I'm going to address some terms below.

Q: What is Visual Studio Code (VSCode) and why do I need it?
> A: VSCode is an application that allows you to create programs using different programming languages, and for our purposes today, will allow you to login using `ssh`. To remotely access your acccount on `ieng6`, we will need to use `ssh` on VSCode using your account credentials.

Q: What is `ssh`?
> A: `ssh` stands for 'Secure Shell' which is a secure way to remotely access and/or operate a network system over an unsecure network. For our purposes today, we will be using your course-specific account information to log in remotely on `ieng6`!

Installing VSCode is pretty straightforward. 

1. You will need to go to the Visual Studio Code website [https://code.visualstudio.com](https://code.visualstudio.com) and follow the instructions specific to your operating system (macOS, Linux, or Windows).
2. After you've installed VSCode, open a new window that looks like this below. Mine is themed to look light, but yours might have any other combination of colors, which might depend on your operating system. ![Image](VScode-blank.png)

## Step 2: Remotely Connecting
Before we connect, you'll need to make sure you have your course-specific username and password to be able to use `ssh` to remotely connect to `ieng6`.

1. Make sure you visit this website [https://sdacs.ucsd.edu/~icc/index.php](https://sdacs.ucsd.edu/~icc/index.php) to view your username, and if needed, create a password on the same website.

Once you have your account credentials, using VScode, open a new terminal. You can do this by going to `Terminal` and then clicking `New Terminal`.

When you have the terminal open, you will initiate the `ssh` connection by entering the following command into the terminal and filling in the `__` with the corresponding characters of your username:

*(The `$` symbol is to show that this is a command you will type in)*

````
$ ssh cs15lsp23__@ieng6.ucsd.edu
````

If this is the first time that you are connecting to this server, the below message might pop up. Here is a screenshot of what it might look like: 

