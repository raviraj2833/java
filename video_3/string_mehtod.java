 public class string_mehtod {

    public static void main(String[] args) {
        // method of using string:
        // name.length()>>>>>returns length of string name ( 5 in this case)
        // name.toLowercase()>>>>>.returns a new string which has all the Lowerrcase
        // characters from the string name
        // name.toUppercase()>>>>>>returns a new string which has all the Uppercase
        // characters from the string name
        // name.trim()>>>> return a new string after removing
        /*
         * String s1="Ravi";
         * String s2=new String("Ravi raj");
         * System.out.printf("%s\n",s1);
         * System.out.println(s1);
         * System.out.println(s2);
         */

        String s1 = "Ravi";
        /*
         * String s2="thiruvananthapuram";
         * System.out.println(s1);
         * int value=s1.length();
         * String s4=s1.toUpperCase();
         * String s5=s1.toLowerCase();
         * String s6=s1.trim();
         * int s3=s2.length();
         * //string length of Ravi raj:
         * System.out.println(value);
         * // string length of thiruvananthapuram:
         * System.out.println(s3);
         * //uppercase :
         * System.out.println(s4);
         * //Lower case :
         * System.out.println(s5);
         * //trimmed string
         * String nontrimmedString="     Ravi    ";
         * System.out.println(nontrimmedString);
         * String trimmedString;
         * System.out.println(nontrimmedString.trim());
         * System.out.println(s6);
         */
        /*
         * System.out.println(s1.substring(0));
         * System.out.println(s1.substring(1));
         * System.out.println(s1.substring(2));
         * System.out.println(s1.substring(3));
         */

        System.out.println(s1.substring(0, 4));
        System.out.println(s1.replace('R', 'M'));
     

        // name.startsWith()....if name start with giving input name the the output is true while false

        System.out.println(s1.startsWith("Rav"));

        // name.endsWith().....if name ends with giving input name the output  will be true 

        System.out.println(s1.endsWith("vi"));

        // name.charAt(index):

        System.out.println(s1.charAt(3));

        // name.indexof(str):
         String modifiedString="ravikumar";
         System.err.println(modifiedString.indexOf("r"));
        System.err.println(s1.indexOf("vi"));

        // name.indexof("str",from index()):

        System.err.println(modifiedString.indexOf("a", 2));

        // name.lastindexof("str"):
        System.out.println(modifiedString.lastIndexOf("vi"));

        //name.lastindexof("str",fromindex):
        System.err.println(modifiedString.lastIndexOf("vi", 3));

        //name.equals("str")....if str===given name then it will be true otherwise it will be false:
        System.err.println(modifiedString.equals("ravikumar"));


        //name.equalsignorecase("str").......if str===same but ignore case if ravi=Ravi then it will be true:

        System.err.println(modifiedString.equalsIgnoreCase("Ravikumar"));



        //escape sequence:
        // \t>>>>> insert  a tab in the text at this point:
        // \b>>>>> insety a backspace in the text at this point:
        // \n>>>>> insert a newline in the at this point:
        // \r>>>>> insert a carruage return in the text at this point:
        // \f>>>>> insert a formfeed in the text at this point:
        // \'>>>>> insert a singl quote character int the text at this point:
        // \">>>>> insert a double quote character int the text at this point:
        // \\>>>>> insert a backslash character in the text at this point:

        System.err.println("I am good boy\tReally");
        System.err.println("I am good boy \b Really");
        System.err.println("I am good boy \n Really");
        System.err.println("I am good boy \r Really");
        System.err.println("I am good boy \f Really");
        System.err.println("I am good boy \' Really");
        System.err.println("I am good boy \" Really");
        System.err.println("I am good boy \\ Really");

    }
}