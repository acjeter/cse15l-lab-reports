# Lab Report 3 | Researching Commands
## Andrew Jeter | May 10, 2023 | CSE 15L Politz, J.

## The `Grep` Command
Hello and welcome back to another post! I am excited to talk about the `grep` command today, and give you some interesting command-line options for the `grep` command! After learning about the `grep` command and some interesting command-line options for it, I'm confident you all will have an extremely easy time using the command, and will find them very useful! You can do it!
***
![image](https://github.com/acjeter/cse15l-lab-reports/assets/119645659/bbe399a7-d3dd-49a4-95ea-11ac8a8da7df)

credit: [https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F17521886038545880%2F&psig=AOvVaw3I-Ki-JuDI9hBcYvo6UpFv&ust=1685081879254000&source=images&cd=vfe&ved=0CBIQjhxqFwoTCNCr0ajpj_8CFQAAAAAdAAAAABAS](https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F17521886038545880%2F&psig=AOvVaw3I-Ki-JuDI9hBcYvo6UpFv&ust=1685081879254000&source=images&cd=vfe&ved=0CBIQjhxqFwoTCNCr0ajpj_8CFQAAAAAdAAAAABAS)

***

For the purposes of this post, we're going to outline four interesting options for the `grep` command. So that I did, and like a curious student, I asked OpenAI's ChatGPT "What are four interesting command-line options or alternate ways to use the bash find command?" and the response listed details about the `-r`, `-v`, `-w`, and `-n` `grep` options.

### The `grep -r` Command-Line Modifier | Directory Recursive Search
According to ChatGPT's response to the question that I asked above: 
> the `-r` or `--recursive` option allows `grep` to perform a recursive search through directories. This is useful when you want to search for a pattern in multiple files within a directory hierarchy. For example, to search for the word "example" in all files within a directory and its subdirectories, you can use the following command:
```
grep -r "example" /path/to/directory
```

Using the `./technical` files and directories in the [https://github.com/ucsd-cse15l-s23/docsearch](https://github.com/ucsd-cse15l-s23/docsearch) repository, we can use `grep -r` to do some nifty things:

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

**Command-Line Input:**
```
grep -r "biological response" technical/biomed/
```
**Output:**
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

### The `grep -v` Command-Line Modifier | Find Everything But This
According to ChatGPT's response to my question in the introduction, another command-line modifier is `-v`. 
> The `-v` or `--invert-match` option inverts the match, i.e., it selects lines that **do not** match the specified pattern. This is useful when you want to find lines that do not contain a certain pattern. For example, to find all lines in a file that do not contain the word "example," you can use the following command:
```
grep -v "example" file.txt
```

Using the `./technical` directory and subdirectories, here are a few examples of searching for everything but the specified pattern.

**Command-Line Input:**
```
grep -v "a" technical/biomed/1471-230X-2-21.txt
```
**Output:**
```

  
    
      
        1°SS [ 3 4 5 6 ] .
        18 19 20 21 22 23 24 ] .
        1°SS.
      
      
        Methods
        
        
      
      
        Results
        ASMA in 2.
      
      
        Discussion
        in other previous series [ 2 3 4 5 6 7 ] . The true
        virus.
        33 ] .
        1°SS [ 12 ] , while others mention distinctive differences
        35 ] .
      
      
        Conclusions
        function.
      
      
        Competing interests
        None.
      
      
        Authors' contributions
      
    
```

Here's another example of `-v`:

**Command-Line Input:**
```
grep -v "," technical/plos/journal.pbio.0020067.txt
```
**Output**
```

  
    
      
        
        As the year-long celebration of the 50
        the engaging autobiography of one of the participants further enlivened the drama of this
        until the second half of the book. Recounting his background and interesting life before
        DNA (34 years) in plain but telling sentences brings to life a character that is almost as
        much out of the ordinary as those of the more flamboyant James Watson and Francis
        Crick.
        painful illness of his sister. Success in school physics was the key for getting into
        Perhaps too much involvement led to a low degree grade in 1938 and no hope of remaining at
        decades. The work there contributed to Randall's scheme for making radar practical in air
        defense—the cavity magnetron that may have turned the course of World War II.
        College London's physics department and director of a biophysics research unit sponsored by
        soon began.
        That X-ray diffraction might play a major role in this search rested on two pillars
        unique to England. One was the British lead in using X-ray diffraction to determine
        of helping to determine the structure. Wilkins confides that in 1950 he knew little of how
        such X-ray analysis might be done. But in that year he was presented with an opportunity in
        diagrams emerged.
        at a meeting in Cambridge in July 1951 that DNA chains were probably in a helical
        each other.
        studies with Crick. They quickly arrived at a three-stranded helical structure. But
        Kings agreed that DNA studies at Cambridge should stop and that the work should continue
        only at Kings. Mismanagement and noncooperation were taking their toll. Franklin was moving
        striking photo of the diffraction pattern of B-DNA (one of the two major structural forms
        of DNA) that emerged in early 1953 as a perfect signature of the helical form. But 1952
        continued downhill. Even Wilkins stopped DNA work that November.
        world's leading structural chemist into the race reawakened everyone to the centrality of
        diffraction photo of B-DNA that he and Franklin had taken in July 1952. Wilkins assumed
        announced she would be moving from Kings College to Birkbeck College to join Bernal's
        unit. This report contained Franklin's results that the phosphates were on the outside and
        that the A-form of DNA had a special crystalline arrangement called the monoclinic C2 space
        structure must be antiparallel and that there were probably two chains entwined. Watson
        genetic information to subsequent generations.
        Wilkins was invited to view the model in Cambridge. He found it stunning. Watson asked
        Birkbeck. She received the news of the discovery with equanimity. But a later examination
        of her notebooks showed that she had moved to favor helices and a two-chain (or possibly a
        one-chain) model.
        With the rather complicated story of the greatest discovery in biology in the century
        only three.
        The first is the key role played by model building. In fiber diffraction there is not
        building is a way of bringing into the picture previously determined bond distances and
        bond angles of components such as the purine and pyrimidine bases and the sugars that are
        unavailable from the fiber diagram. That this was not seen at Kings College left the
        researchers there well behind in a field that they had pioneered.
        A second lesson is the importance of bringing the full knowledge of single crystal
        analysis to fiber diagram interpretation. That Franklin and Wilkins missed noting that the
        monoclinic C2 space group meant that the chains in the fiber had to be antiparallel robbed
        them of an important clue to the structure.
        DNA research continued at Kings College in a gradually improving environment: important
        configured to accommodate proteins in the nucleus. Wilkins enjoyed being included in the
        rendering of events in 
        The Double Helix . The final chapter of his own autobiography addresses
        happiness in newfound family life. Research gradually gave way to the pursuit of pacifist
        goals in a number of organizations and to the popularization of science. His has been a
        have the insight that this book presents in a candid and personal way.
      
    
  
```

Essentially, this `grep` command-line tool `-v` just goes in a file and finds and returns all lines that **do not contain** the given pattern for these examples I used "a" for the first pattern, and "," for the second, to first find all lines that didn't contain the letter "a", and then for the second file, to find all lines that didn't contain a comma ",".

### The `grep -w` Command-Line Modifier | Search for Whole Words
According to the question that I asked ChatGPT in the introduction: 
> The `-w` or `--word-regexp` option allows `grep` to match only whole words, rather than partial matches. This is useful when you want to search for a specific word and avoid matching substrings. For example, to search for the word "example" as a whole word in a file, you can use the following command:
```
grep -w "example" file.txt
```

Using the `./technical` directory and files, here are a few examples of using the `grep -w` command to search for whole words:

**Command-Line Input:**
```
grep -w "Wilkins" technical/plos/journal.pbio.0020067.txt
```
**Output:**
```
        event. Maurice Wilkins, now 87, postpones the account of his involvement in the DNA affair
        Wilkins' first six years in New Zealand (a Garden of Eden) were followed by a long,
        Bernal. Given his leftist leanings, it was inevitable that Wilkins would become involved in
        and took Wilkins along. Life in Berkeley was exciting, but beneath the excitement of bomb
        work and mixed feelings upon its success at Hiroshima, Wilkins read Erwin Schrodinger's 
        the Medical Research Council (MRC), Wilkins was his deputy. The attack on DNA structure
        of helping to determine the structure. Wilkins confides that in 1950 he knew little of how
        management of the group. Without telling Wilkins, he wrote to Rosalind Franklin, who was on
        her way to join the DNA effort, that Wilkins was withdrawing from DNA work and that she
        would take over. Unaware of this, Wilkins and Alec Stokes continued their work and reported
        Wilkins, saying that he should stop his DNA work (as Randall had written would be the
        Franklin and Wilkins soon demolished it. Likewise, a three-stranded model at Kings College
        continued downhill. Even Wilkins stopped DNA work that November.
        DNA structure. In January, Raymond Gosling gave to Wilkins the very well-oriented
        diffraction photo of B-DNA that he and Franklin had taken in July 1952. Wilkins assumed
        Wilkins was invited to view the model in Cambridge. He found it stunning. Watson asked
        him to be a coauthor of the paper. Wilkins, true to his character, declined, as he had not
        analysis to fiber diagram interpretation. That Franklin and Wilkins missed noting that the
        lack of open congeniality, all so well described by Wilkins, who refers to it as Randall's
        configured to accommodate proteins in the nucleus. Wilkins enjoyed being included in the
```

Another example:

**Command-Line Input:**
```
grep -w "fee" technical/government/Media/Annual_Fee.txt
```
**Output:**
```
order, the base annual fee for active lawyers rises to $229 as of
Jan. 1. Last year, the high court raised that fee to $180 from
The fee increase is expected to generate $2.4 million for the
action raising the fee "is lifesaving for our grantees," Schmitt
The fee increase is "an important step that will give lawyers
Court regarding the fee increase had broad support from bar
years. The additional revenue generated by the fee hike will allow
```

Now, for the `-w` command, it is important to note that the command **will not** return lines that have extra text attached, it **only** returns lines that contain words that match the pattern exactly. For example, in the second example even though the pattern was "fee", no lines with the word "fees" were returned, because it is only looking for the word "fee". This tool is particularly useful to find and return lines that contain specific words, with a real-life application being finding specific names in an account database, for example.

### The `grep -n` Command-Line Modifier | Displaying Line Numbers
According to ChatGPT's response to the question that I asked in the introduction: 
> The `-n` or `--line-number` option displays line numbers along with the matching lines. This is useful when you want to know the line numbers of the matched lines within a file. For example, to search for the word "example" in a file and display the line numbers, you can use the following command:
```
grep -n "example" file.txt
```

Here are some examples using the `./technical` directory.

**Command-Line Input:**
```
grep -w -n "fee" technical/government/Media/Annual_Fee.txt
```
**Output:**
```  
12:order, the base annual fee for active lawyers rises to $229 as of
13:Jan. 1. Last year, the high court raised that fee to $180 from
33:The fee increase is expected to generate $2.4 million for the
47:action raising the fee "is lifesaving for our grantees," Schmitt
60:The fee increase is "an important step that will give lawyers
73:Court regarding the fee increase had broad support from bar
76:years. The additional revenue generated by the fee hike will allow
```

As you can see, here I used multiple modifiers at the same time. `-w` to find all the lines with the word 'fee' and `-n` to show the line numbers of those lines.

Here's another example:

**Command-Line Input:**
```
grep -w -n "in" technical/government/Media/Annual_Fee.txt
```
**Output:**
```
14:$140. Lawyers in their first three years of practice or who are
18:organizations that assist low- income residents in civil matters.
24:and to increase public confidence in the administration of justice,
26:"These two separate increases in the fees lawyers pay is a step
27:closer to achieving those two goals," McMorrow said in written
28:statement. "In times of a downturn in the economy, they demonstrate
29:a commitment by the full court, and by attorneys in Illinois, to
32:There are now more than 57,000 active attorneys in Illinois.
38:money, escrow funds, for instance, and that in turn generates
41:program. The deposits earned 2.5 percent in interest a year ago and
52:Assistance Foundation Inc., based in Springfield, and Prairie State
53:Legal Services, based in Rockford.
54:"This is a big step the Supreme Court has taken in demonstrating
55:for all attorneys in the state how important it is that lawyers be
59:said in a press release.
65:president, said in the release. More than two years ago, the high
69:additional resources for such programs in Illinois through
74:associations across the state," Bertschy said in the release.
77:LAP to establish offices in central and southern Illinois and
78:expand its outreach in law schools, according to Murphy. She added
```

As you can see, the `-n` command is a very useful command to be able to find the line number of the lines that are found by other commands. For example, if you are looking for a specific place in the file with a specific pattern, you can use `grep -w -n <pattern> <file>` to find it!

***

Overall, the `grep` command is an interesting and unique command which can be leveraged to do great things! I told you that you would be able to do it, and I can't wait for the next post!

***

## Sources:
### OpenAI's ChatGPT:

My initial first question to ChatGPT:

**What I asked:**
What are four interesting command-line options or alternate ways to use the grep command?

**What the response was:**
Certainly! Here are four interesting command-line options and alternate ways to use the `grep` command:

1. Recursive Search in Directories:
   The `-r` or `--recursive` option allows `grep` to perform a recursive search through directories. This is useful when you want to search for a pattern in multiple files within a directory hierarchy. For example, to search for the word "example" in all files within a directory and its subdirectories, you can use the following command:
   ```
   grep -r "example" /path/to/directory
   ```

2. Inverting the Match:
   The `-v` or `--invert-match` option inverts the match, i.e., it selects lines that do not match the specified pattern. This is useful when you want to find lines that do not contain a certain pattern. For example, to find all lines in a file that do not contain the word "example," you can use the following command:
   ```
   grep -v "example" file.txt
   ```

3. Searching for Whole Words:
   The `-w` or `--word-regexp` option allows `grep` to match only whole words, rather than partial matches. This is useful when you want to search for a specific word and avoid matching substrings. For example, to search for the word "example" as a whole word in a file, you can use the following command:
   ```
   grep -w "example" file.txt
   ```

4. Using Regular Expressions:
   `grep` supports regular expressions, which allows for more advanced pattern matching. Regular expressions provide powerful search capabilities, such as matching patterns with wildcards, character classes, quantifiers, and more. For example, to search for lines starting with "A" or "B" followed by any three digits in a file, you can use the following command:
   ```
   grep "^[AB][0-9]\{3\}" file.txt
   ```

These are just a few examples of the many powerful options and alternate ways to use the `grep` command. `grep` is a versatile tool for searching and matching patterns within files and is widely used in command-line operations and scripting.

***

I didn't want to use the fourth from above, so I asked it for one more `grep` command.

**What I asked:**
what is one more

**What the response was:**
Certainly! Here's one more interesting command-line option for the `grep` command:

1. Displaying Line Numbers:
   The `-n` or `--line-number` option displays line numbers along with the matching lines. This is useful when you want to know the line numbers of the matched lines within a file. For example, to search for the word "example" in a file and display the line numbers, you can use the following command:
   ```
   grep -n "example" file.txt
   ```
   This command will output the lines containing the word "example" along with their corresponding line numbers.

This option is helpful when you need to locate specific lines within a file or when you want to reference line numbers in further processing or analysis.

These are some of the interesting command-line options you can use with the `grep` command. `grep` provides a flexible and efficient way to search for patterns and manipulate text based on specific criteria, making it a valuable tool for various command-line tasks and scripting.

