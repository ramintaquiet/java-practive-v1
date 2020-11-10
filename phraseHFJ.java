public class phraseHFJ {

public static void main (String args[]){

String[] wordListOne = {"27/7", "multitier", "win win", "smart", "dynamic"};
String[] wordListTwo = {"sticky", "oriented", "focused", "shared", "clustered", "outside he box"};
String[] wordListThree = {"process", "solution", "space", "vision", "mission", "paradigm", "architecture"};

//how many words in each 
int oneLen = wordListOne.length;
int twoLen = wordListTwo.length;
int threeLen = wordListThree.length;

//generate three random numbers

int rand1 = (int) (Math.random() * oneLen);
int rand2 = (int) (Math.random() * twoLen);
int rand3 = (int) (Math.random() * threeLen);

//build a prase

String phrase = wordListOne[rand1] + "  " + wordListTwo[rand2] + "  " + wordListThree[rand3];

//print out

System.out.println("We need is a " + phrase);
 

}

}
