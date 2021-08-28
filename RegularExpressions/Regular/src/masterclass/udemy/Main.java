package masterclass.udemy;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".","Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        String secondString= "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY")); //^ means to match only the start

        System.out.println(alphanumeric.matches("^hello")); //false
        System.out.println(alphanumeric.matches("^abcDeee")); //false
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z")); // true

        System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END") );
        System.out.println(alphanumeric.replaceAll("[aei]", "X") );
        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letter here"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));



    }
}
