# score-with-stream-api

My solution for Chapter 10 Exercise 5 of “Introduction to Programming Using Java”.

Problem Description:
This is a short exercise in using the stream API. Suppose that the class Score is defined as
class ScoreInfo {
String firstName;
String lastName;
int score;
Score( String lName, String fName, int s ) {
firstName = fName;
lastName = lName;
score = s;
}
}
and that scoreData is an array of ScoreInfos containing information about the scores of
students on a test. Use the stream API to do each of the following tasks:
• print the number of students (without using scoreData.length)
• print the average score for all of the students
• print the number of students who got an A (score greater than or equal to 90)
• use the collect() stream operation to create a List<String> that contains the names
of students whose score was less than 70; the names should be in the form first name
followed by last name
• print the names from the List that was generated in the previous task
• print out the student’s names and scores, ordered last name
• print out the student’s names and scores, ordered by score
You can put all of the code in main() routine and include ScoreInfo as a static nested
class. Do not use any for loops or other control structures. Do everything using the
stream API. For testing your code, you can use this array:
private static ScoreInfo[] scoreData = new ScoreInfo[] {
new Score("Smith","John",70),
new Score("Doe","Mary",85),
new Score("Page","Alice",82),
new Score("Cooper","Jill",97),
new Score("Flintstone","Fred",66),
new Score("Rubble","Barney",80),
new Score("Smith","Judy",48),
new Score("Dean","James",90),
new Score("Russ","Joe",55),
new Score("Wolfe","Bill",73),
new Score("Dart","Mary",54),
new Score("Rogers","Chris",78),
new Score("Toole","Pat",51),
new Score("Khan","Omar",93),
new Score("Smith","Ann",95)
};
