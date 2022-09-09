/**
 * Create programs of all the string methods like charAt(), concat(), equals() etc.
 * @author Darshit Patel
 * @version 1.01 2022-09-07
 */

public class StringMethod {

    public static void main(String[] args) {
        String string = "Darshit";
        String stringOne = "Patel";
        String stringTwo = "Darshit";

        // String charAt() method
        System.out.println(string.charAt(0));
        // Print String s1 char index
        System.out.println(stringOne.charAt(0));

        // String concate() method
        String stringThree = string.concat(stringOne);
        System.out.println(stringThree);

        // String is equal() method
        System.out.println(string.equals(stringTwo)); // true because content and case is same
        System.out.println(stringTwo.equals(stringThree)); // false because case is not same
        System.out.println(string.equalsIgnoreCase(stringTwo)); //equalIgnore Case

        // String split() method
        String splitString = "java string split method";
        String[] splitWords = splitString.split("\\s"); //Splits the string based on whitespace  
        // Using java foreach loop to print elements of string array  
        for (String splitWord: splitWords) {
            System.out.println(splitWord);
        }

        // String length() method
        String stringLength = "javatpoint";
        System.out.println("string length is: " + stringLength.length());

        // String replace() Method.
        String stringReplace = "javatis a very good programming language";
        String replaceString = stringReplace.replace('a', 'e'); //Replaces all occurrences of 'a' to 'e'  
        System.out.println(replaceString);

        // String compareTo() method.
        String compareStringOne = "hello";
        String compareStringTwo = "hello";
        String compareStringThree = "hii";
        System.out.println(compareStringOne.compareTo(compareStringTwo));
        System.out.println(compareStringOne.compareTo(compareStringThree));

        // String contains() method
        String stringContains = "what do you know about me";
        System.out.println(stringContains.contains("do you know"));

        // String endsWith() method
        String StringEndsWith = "java is programming language";
        System.out.println(StringEndsWith.endsWith("g"));
        System.out.println(StringEndsWith.endsWith("language"));

        // String format() method
        String formetName = "Darshit";
        String stringFormet = String.format("name is %s", formetName);
        System.out.println(stringFormet);

        // String getByte() method
        String stringByte = "ABCDEFG";
        byte[] byteNo = stringByte.getBytes();
        for (int i = 0; i < byteNo.length; i++) {
            System.out.println(byteNo[i]);
        }

        // String getChars() method
        String stringCharactor = new String("hello how r u");
        char[] charactor = new char[10];
        try {
            stringCharactor.getChars(6, 16, charactor, 0);
            System.out.println(charactor);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        // String indexOf() method
        String stringIndex = "this is index of example";
        int stringIndexOf = stringIndex.indexOf("is");
        System.out.println(stringIndexOf + "  ");

        // String intern() method
        String stringIntern = new String("hello");
        String stringInternOne = new String("how are u");
        String Intern = stringIntern.intern();
        System.out.println(stringIntern == stringInternOne);
        System.out.println(stringInternOne == Intern);

        // String isEmpty() method
        String emptyString = "";
        System.out.println(emptyString.isEmpty());

        // String join() method
        String joinString = String.join("-", "welcome", "to", "Darshit");
        System.out.println(joinString);

        // String lastIndexOf() method
        String lastIndex = "this is index of example";
        int stringLastIndex = lastIndex.lastIndexOf('s');
        System.out.println(stringLastIndex);

        // String replaceAll() method
        String replaceWord = "java is a very good programming language";
        String stringReplaceAll = replaceWord.replaceAll("a", "e"); //replaces all occurrences of "a" to "e"  
        System.out.println(stringReplaceAll);

        // String startWith() method
        String stringStartWith = "java string starts with";
        System.out.println(stringStartWith.startsWith("ja"));

        // String subString() method
        String subString = "java";
        System.out.println(subString.substring(2));

        // String lowerSase() and upperCase() method
        String lowerCaseWord = "HELLO stRIng";
        String upperrCaseWord = "HELLO stRIng";
        String stringLowerCase = lowerCaseWord.toLowerCase();
        System.out.println(stringLowerCase);
        String stringUpperCase = upperrCaseWord.toUpperCase();
        System.out.println(stringUpperCase);

        // String trim() method
        String stringTrim = "hello string";
        System.out.println(stringTrim + "java"); //without trim()  
        System.out.println(stringTrim.trim() + "java"); //with trim()  

        // String valueOf() method
        int value = 30;
        String stringValue = String.valueOf(value);
        System.out.println(stringValue + 10); //concatenating string with 10  
    }

}