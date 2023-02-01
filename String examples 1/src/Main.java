import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       String example1="COmpUTEr";
        String[] array={"key board","house key"," composition  "};
        String example2="clash of clans";
        String isCopied="NaOrNaOrNaOrNaOrNaOrNaOr";
        String original="NAOR";
        String phoneNumber="053-3338688";



        int num1=-1;
       //separateByChar(example1);
       //separateByReplaceAll(example1);
       //separateBySplit(example1);
       //System.out.println(longestWithoutSpace(array)); //מדפיס את המילה הארוכה ביותר במערך ללא רווחים
        //System.out.println(initials(example2));  // עושה ראשי תיבות  למילים כל עוד יש בינהם רווח אחד
        //System.out.println(isCopied(original,isCopied,num1));//בודק עם קיים העתק של המחרוזת המקורית במחרוזת אחרת (מחזיר 1 אם קיים ו 1- אם לא קיים)
        //System.out.println(isCopiedByContain(original,isCopied,num1));
        //String input=scanner.nextLine(); //קשור לפונקציה למטה
        //isValid(input);// הכנס שלושה מספרים כשאר הפעולות היחידות שניתן לעשות בינהם הם מינוס ופלוס למשל - 3+4-5
        //isValidPhoneNumber(phoneNumber);
    }
    public static int[] separateByChar(String example1){
        int count1=0;
        for(int i=0;i<example1.length();i++){
            char separate=example1.charAt(i);
            if(Character.isUpperCase(separate)){
                count1++;
            }
        }
        int count2=0;
        for(int i=0;i<example1.length();i++){
            char separate=example1.charAt(i);
            if(Character.isLowerCase(separate)){
                count2++;
            }
        }
        int[] separated={count1,count2};
        System.out.println(separated[0]+" "+separated[1]);
        return separated;
    }
    public static int[] separateByReplaceAll(String example1){
        String capitalLetters=example1.replaceAll("[^A-Z]","");
        String smallLetters=example1.replaceAll("[^a-z]","");
        int[] separated={smallLetters.length(),capitalLetters.length()};
        System.out.println(separated[0]+", "+separated[1]);
        return separated;
    }
    public static int[] separateBySplit(String example1){
        String[] smallLetters = example1.split("[^A-Z]+");
        String[] capitalLetters=example1.split("[^a-z]+");
        int count1 = 0;
        for (int i = 0; i < smallLetters.length; i++) {
            count1 += smallLetters[i].length();
        }
        int count2=0;
        for(int i=0;i<capitalLetters.length;i++){
            count2+=capitalLetters[i].length();
        }

        int[] separated={count1,count2};
        System.out.println(separated[0]+" "+separated[1]);
        return separated;
    }
    public static String longestWithoutSpace(String[] array){
        int[] length=new int[array.length];
        int longest=0;
        String longestWord="";
        for(int i=0;i<array.length;i++){
            int spaceCounter=0;
            char[] trim=array[i].toCharArray();
            for(int j=0;j< trim.length;j++){
                if(trim[j]==' '){
                    spaceCounter++;
                }
            }
            length[i]=array[i].length()-spaceCounter;
            if(length[i]>longest){
                longest=length[i];
                longestWord=array[i];
            }
        }
        return longestWord;
    }
    public static String initials(String example1){
        String initials="";
        String[] test=example1.split(" ");
        for(int i=0;i<test.length;i++){
            if(i!= test.length-1) {
                initials += test[i].charAt(0) + ".";
            }else {
                initials += test[i].charAt(0);
            }
        }
        return initials;
    }
    public static int isCopied(String original,String isCopied,int num1){
        String organizedIsCopied=isCopied.toLowerCase();
        String organizedOriginal=original.toLowerCase();
        int count=0;
        int counter=0;
        for(int i=0;i<organizedIsCopied.length();i++){
            if(count==organizedOriginal.length()){
                count=0;
            }
            if(organizedIsCopied.charAt(i)==organizedOriginal.charAt(count)){
                counter++;
                count++;
                if(counter>=organizedOriginal.length()){
                    num1=1;
                    break;
                }
            }else {
                count=0;
                counter=0;
            }
        }
        return num1;
    }
    public static int isCopiedByContain(String original,String isCopied,int num1){
        String organizedIsCopied=isCopied.toLowerCase();
        String organizedOriginal=original.toLowerCase();
        if(organizedIsCopied.contains(organizedOriginal)){
            num1 = 1;
        }
        return num1;
    }
    public static void isValid(String input){
        if(!input.matches("-?\\d+[-+]\\d+[-+]\\d+")) {
            System.out.println("invalid");
            System.exit(0);
        }else {
            System.out.println("valid");
        }
    }
    public static void isValidPhoneNumber(String phoneNumber){
        if(!phoneNumber.matches("05[0-9]-[0-9]{7}")){
            System.out.println("invalid");
        }else {
            System.out.println("valid");
        }
    }


}