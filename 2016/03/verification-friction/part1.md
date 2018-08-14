## Verification Lab, Part 1

Note: This is a two-part lab. This first part should take you 2-2.5 hours.

Imagine you are working for Oxy's [Office of Marketing & Communications](https://www.oxy.edu/office-marketing-communications), and they want to know who is walking around campus and why. They've asked you to write a program where visitors can type in their information and get entered into a raffle for Oxy gear. To make sure they are getting useful data, however, they want you to make sure that whatever information entered into the survey is valid.

1. Write a `Visitor` class to store the relevant data of each visitor. Decide what member variables to use, then for each member variable, write getter and setter functions. An example for emails have been written. In each setter function, you should perform appropriate error checking to make sure the data is valid. I have written two functions, `hasAnyOf` and `hasOnly`, to help you with this.

2. Write a `inputNewVisitor()` that will ask the user for data to create a new `Visitor` instance. Look at the comments for how to get integer and string input.

3. Write a `main()` that will call `inputNewVisitor`, then print out the information from that visitor.

4. Make sure your program works for the following visitor vignettes. (All names and contact information are made up.)

	* Beverly (55) and Robert (52) Deason is bringing their daughter Marylee (17) for a college visit. Marylee is a junior in high school, and is thinking about Oxy because of the DWA program. Coming from Cambridge, MA, the family is also taking the opportunity to tour the west coast. Marylee suggested that you can send emails to [mlpd01610@mac.com](mailto:mlpd01610@mac.com) or text her directly [(617) 412-0850](tel:16174120850).

	* Terrell Hughes is on campus to interview for the tenure-track African American Studies faculty position. He is currently a visiting scholar at Cornell University in Ithaca, NY, having been there since he got his PhD from New York University (NYU) a year ago. You have Terrell's business card, which lists his contact information [thughes@cornell.edu](mailto:thughes@cornell.edu) and [607 254 5705](16072545705). Terrell laughed when you asked for his age, and just asked you to put down 30.

	* Rudy Feierabend has lived in Eagle Rock/north-east LA since 1961, when his parents immigrated to the US, bringing then-seventeen Rolf in tow. He has been retired for a couple years now, and takes his Labrador-Husky Winston on walks through campus every so often. Although he has an email account [feierabend44@aol.com](mailto:feierabend44@aol.com), Rolf says he doesn't check it anymore and should just call him at home [+1 323 827 6316](tel:13238276316).

Once you are done with this, demonstrate to me that your program works. Once I've checked your work, I will send you part 2 of this lab.
