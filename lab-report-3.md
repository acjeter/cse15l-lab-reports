# Lab Report 3 | Researching Commands
## Andrew Jeter | May 10, 2023 | CSE 15L Politz, J.

### The `Grep` Command
Hello and welcome back to another post! I am excited to talk about the `grep` command today, and give you some interesting command-line options for the `grep` command! After learning about the `grep` command and some interesting command-line options for it, I'm confident you all will have an extremely easy time using the command, and will find them very useful!

For the purposes of this post, we're going to outline four interesting options for the `grep` command. So that I did, and like a curious student, I asked OpenAI's ChatGPT "What are four interesting command-line options or alternate ways to use the bash find command?" and the response listed details about the `-r`, `-v`, `-w`, and using regular expressions to search for lines in files.

### The `grep -r` Command-Line Modifier | Directory Recursive Search
According to ChatGPT, "the `-r` or `--recursive` option allows `grep` to perform a recursive search through directories. This is useful when you want to search for a pattern in multiple files within a directory hierarchy. For example, to search for the word "example" in all files within a directory and its subdirectories, you can use the following command:"
```
grep -r "example" /path/to/directory
```

Using the `./technical` files and directories, we can use `grep -r` to do some nifty things:

**Command-Line Input:**
```
grep -r "erroneous payments" technical/
```
**Output:**
```
technical//government/Gen_Account_Office/d0269g.txt:the extent of erroneous payments and require agencies to include,
technical//government/Gen_Account_Office/d0269g.txt:work with agencies to establish goals to reduce erroneous payments
technical//government/Gen_Account_Office/d0269g.txt:identify possible duplicate or erroneous payments. For instance,
technical//government/Gen_Account_Office/d0269g.txt:obtaining reimbursements for the erroneous payments or taking other
```
We can also look through and output all the lines containing a pattern in specific files as well using `grep -r`.

**Command-Line Input**
```
grep -r "biological response" technical/biomed/
```
**Output**
```
technical/biomed//1472-6769-1-1.txt:          The primary biological response following activation of
technical/biomed//1471-2474-2-2.txt:        genes prior to an adequate biological response suggests the
technical/biomed//1471-2172-2-4.txt:          A major biological response of B cells to BCR
technical/biomed//1471-2172-2-4.txt:          Apoptosis is a major biological response of B cells to
technical/biomed//1471-2172-2-4.txt:          eliciting a biological response, may be due to the
technical/biomed//1477-7827-1-9.txt:        biological responses are mediated by Ser/Thr kinase
technical/biomed//1471-2202-2-20.txt:        receptors and alter many of the biological responses that
technical/biomed//1471-244X-3-5.txt:          was used both because the biological response may be
technical/biomed//1477-5956-1-1.txt:        TNFR2-specific biological response. Overall, these data
technical/biomed//1478-1336-1-3.txt:        pathways to regulate a variety of biological responses,
technical/biomed//1471-2407-3-16.txt:        with regard to the classification of biological response of
technical/biomed//1471-2407-3-16.txt:        biological response to radiation injury. Thus, an
```

Overall, the `grep` `-r` command-line option is extremely useful for finding and listing specific patterns in directories and their subdirectories. Here, the command searches for the pattern in all files within the directory path that I specified, which was simply technical/ for the first command, and more restrictively technical/biomed/ for the second command.

### The `grep -v` Command-Line Modifier.

