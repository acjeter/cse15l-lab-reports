# Lab Report 3 | Researching Commands
## Andrew Jeter | May 10, 2023 | CSE 15L Politz, J.

### The `Grep` Command
Hello and welcome back to another post! I am excited to talk about the `grep` command today, and give you some interesting command-line options for the `grep` command! After learning about the `grep` command and some interesting command-line options for it, I'm confident you all will have an extremely easy time using the command, and will find them very useful!

For the purposes of this post, we're going to outline four interesting options for the `grep` command. So that I did, and like a curious student, I asked OpenAI's ChatGPT "What are four interesting command-line options or alternate ways to use the bash find command?" and the response listed details about the `-r`, `-v`, `-w`, and using regular expressions to search for lines in files.

### The `grep` `-r` Command-Line Modifier
According to ChatGPT, "the `-r` or `--recursive` option allows `grep` to perform a recursive search through directories. This is useful when you want to search for a pattern in multiple files within a directory hierarchy. For example, to search for the word "example" in all files within a directory and its subdirectories, you can use the following command:"
```
grep -r "example" /path/to/directory
```

Using the `./technical` files and directories, we can use `grep -r` to do some nifty things:

Command-Line Input:
```
grep -r "erroneous" technical/
```
Output:
```
technical//government/About_LSC/LegalServCorp_v_VelazquezOpinion.txt:argued that an agency made an erroneous factual determination or
technical//government/Env_Prot_Agen/section-by-section_summary.txt:correction of an erroneous crossreference.
technical//government/Gen_Account_Office/d0269g.txt:the extent of erroneous payments and require agencies to include,
technical//government/Gen_Account_Office/d0269g.txt:erroneous payment rates, including actual and target rates, where
technical//government/Gen_Account_Office/d0269g.txt:work with agencies to establish goals to reduce erroneous payments
technical//government/Gen_Account_Office/d0269g.txt:from erroneous benefit awards and fraud by claimants. Further, the
technical//government/Gen_Account_Office/d0269g.txt:identify possible duplicate or erroneous payments. For instance,
technical//government/Gen_Account_Office/d0269g.txt:obtaining reimbursements for the erroneous payments or taking other
technical//government/Gen_Account_Office/d0269g.txt:erroneous benefit awards and fraud by claimants. After considering
technical//government/Gen_Account_Office/d0269g.txt:erroneous and fraudulent billings.
technical//government/Gen_Account_Office/Statements_Feb28-1997_volume.txt:erroneously assume that this category should include any PP&E
technical//government/Media/It_Pays_to_Know.txt:by the company, they erroneously told her she could go ahead and
technical//plos/pmed.0020206.txt:        well aware that some postings were erroneous, and in fact seemed to substantially
technical//plos/pmed.0020206.txt:        contain erroneous material, online groups of patients who share an illness engage in a
technical//plos/journal.pbio.0020047.txt:        generalizations, and careless misstatements. Perhaps most shocking and most erroneous, we
technical//plos/journal.pbio.0030056.txt:        do not adhere to all the criteria, and also enable the publication of erroneous results
technical//plos/journal.pbio.0020116.txt:        longevity and fertility, thereby leaving the reader with the distinct but erroneous
technical//plos/journal.pbio.0020116.txt:        a widespread public discussion can include—and take care not to leave an erroneous
technical//plos/pmed.0020181.txt:        erroneous conclusion that leanness carries increased risk of death. Statistical adjustment
technical//biomed/gb-2003-4-4-r24.txt:          After excluding erroneous pedigrees, the 187
technical//biomed/ar331.txt:        expression profile and lead to erroneous conclusions. We
technical//biomed/1471-2288-2-4.txt:        large impact on the PVP. It is erroneous to directly
technical//biomed/gb-2002-3-11-research0065.txt:        use of a constant cutoff leads to erroneous assignment of
technical//biomed/1471-244X-2-9.txt:        erroneously diagnosed as ADHD. Several disorders common in
technical//biomed/1471-2164-3-28.txt:          hypotheses than the probability of one single erroneous
technical//biomed/gb-2002-3-6-software0001.txt:        multiple filter criteria reduces the risk of erroneously
technical//biomed/gb-2002-3-12-research0087.txt:          erroneous inclusion of ESTs which are not full-length,
technical//biomed/gb-2002-3-12-research0079.txt:          additional 62,000 reads that had been erroneously removed
technical//biomed/1471-2105-3-14.txt:        previously erroneously annotated sequences; insufficient
technical//biomed/1472-6890-3-2.txt:            is present then ISH can lead to erroneous typing data.
technical//biomed/gb-2002-3-12-research0083.txt:            neighboring or nested gene; second, erroneous splice
technical//biomed/1471-2180-3-13.txt:        incorrect annotations can be made as well as erroneous
technical//biomed/1471-2180-3-13.txt:          gene sequences can provide erroneous results. However the
technical//biomed/1471-2350-3-1.txt:            erroneously believe that a sibling never had a stroke,
technical//biomed/1471-2350-3-1.txt:          methods that assume a genetic model may provide erroneous
technical//biomed/gb-2003-4-1-r5.txt:          erroneously suggested that these genes were not
technical//biomed/1475-9268-1-1.txt:          missegregating chromosomes to correct their erroneous
technical//biomed/1471-2164-3-4.txt:          these probably erroneous groupings can be high. In most
technical//biomed/1471-2091-3-17.txt:        an erroneous interpretation" [ 11 ] . Such systems, which
technical//biomed/gb-2002-3-12-research0088.txt:          erroneous pattern assignment.
technical//biomed/gb-2002-3-6-research0029.txt:          erroneous data.) In most of the other cases, the
technical//biomed/gb-2001-2-12-research0055.txt:        this assumption is invalid and may result in erroneous
technical//biomed/gb-2001-2-12-research0055.txt:          arrays will give erroneous results because the mean
technical//biomed/gb-2001-2-12-research0055.txt:          cRNA impurities would result in erroneous normalization
technical//biomed/1472-6947-1-2.txt:        time frame involved and may be erroneously interpreted as
technical//biomed/gb-2001-2-12-research0051.txt:        apparently erroneous computational analysis were supported
technical//biomed/1471-2334-1-10.txt:        the erroneous treatment of millions of non-malaria cases
technical//biomed/1471-2202-3-16.txt:          < 0.001; 0.01, 0.05) helps distinguish erroneous
technical//911report/chapter-13.2.txt:                believe this report was erroneous for a number of reasons- there is no evidence that
technical//911report/chapter-1.txt:    The airlines bore responsibility, too. They were facing an escalating number of conflicting and, for the most part, erroneous reports about other flights, as well as a continuing lack of vital information from the FAA about the hijacked flights. We found no evidence, however, that American Airlines sent any cockpit warnings to its aircraft on 9/11. United's first decisive action to notify its airborne aircraft to take defensive action did not come until 9:19, when a United flight dispatcher, Ed Ballinger, took the initiative to begin transmitting warnings to his 16 transcontinental flights: "Beware any cockpit intrusion- Two a/c [aircraft] hit World Trade Center." One of the flights that received the warning was United 93. Because Ballinger was still responsible for his other flights as well as Flight 175, his warning message was not transmitted to Flight 93 until 9:23.
technical//911report/chapter-1.txt:    Right after the Pentagon was hit, NEADS learned of another possible hijacked aircraft. It was an aircraft that in fact had not been hijacked at all. After the second World Trade Center crash, Boston Center managers recognized that both aircraft were transcontinental 767 jetliners that had departed Logan Airport. Remembering the "we have some planes" remark, Boston Center guessed that Delta 1989 might also be hijacked. Boston Center called NEADS at 9:41 and identified Delta 1989, a 767 jet that had left Logan Airport for Las Vegas, as a possible hijack. NEADS warned the FAA's Cleveland Center to watch Delta 1989. The Command Center and FAA headquarters watched it too. During the course of the morning, there were multiple erroneous reports of hijacked aircraft. The report of American 11 heading south was the first; Delta 1989 was the second.
technical//911report/chapter-1.txt:    Inside the NMCC, the deputy director for operations called for an allpurpose "significant event" conference. It began at 9:29, with a brief recap: two aircraft had struck the World Trade Center, there was a confirmed hijacking of American 11, and Otis fighters had been scrambled. The FAA was asked to provide an update, but the line was silent because the FAA had not been added to the call. A minute later, the deputy director stated that it had just been confirmed that American 11 was still airborne and heading toward D.C. He directed the transition to an air threat conference call. NORAD confirmed that American 11 was airborne and heading toward Washington, relaying the erroneous FAA information already mentioned. The call then ended, at about 9:34.
```

