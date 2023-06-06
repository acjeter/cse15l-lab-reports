# Lab Report 5 | Debugging Scenario
## Andrew Jeter | June 5, 2023 | CSE 15L Politz, J.

For this Lab Report, I will be writing a hypothetical debugging post that would be made on the class EdStem, and walking through the steps to fix and address the question on my end, providing screenshots along the way. This bug will be within the list-examples-grader repository used during Lab 7, and a bug in `grade.sh` will be to blame for the fauly outcome only seen if looking closely. For the purposes of this lab report, `grade.sh` is the correct bash script, and `bug_grade.sh` is the buggy bash script. When calling `grade.sh`, I will call `bug_grade.sh`. Additionally, this debugging post will provide screenshots using `bug_grade.sh`. As always, we got this :) 

### EdStem Debugging Post Screening Questions:

**What environment are you using (computer, operating system, web browser, terminal/editor, and so on)?**

_MacOS, Safari, Visual Studio Code; Code Repository: [https://github.com/acjeter/list-examples-grader](https://github.com/acjeter/list-examples-grader)

**Detail the symptom you're seeing. Be specific; include both what you're seeing and what you expected to see instead. Screenshots are great, copy-pasted terminal output is also great. Avoid saying “it doesn't work”.**

When using this 'student code' implementation, it has no errors, so it is expected to pass the compile and file check, and it does, with no errors. Here is the screenshot of a proper execution of `bug_grade.sh` using this line: ![Image](https://github.com/acjeter/cse15l-lab-reports/blob/main/LR5-SS1-bug-grade.png)


However, when using the lab files which are expected to cause a compile error, no such compile error is displayed by `bug_grade.sh` in the Terminal, and I'm not sure what's wrong with my code. Can you help me? Here is the buggy output: ![Image](https://github.com/acjeter/cse15l-lab-reports/blob/main/LR5-SS2.5-bug-grade.png)

**Detail the failure-inducing input and context. That might mean any or all of the command you're running, a test case, command-line arguments, working directory, even the last few commands you ran. Do your best to provide as much context as you can.**
