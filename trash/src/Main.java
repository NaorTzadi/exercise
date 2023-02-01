public class Main {
    public static void main(String[] args) {
        String separate="NEorSe";
        String string1="clash of clans";
        String rearrange="aassddddwwwc";
        String[] array1={"key board","house key","composition  "};
        String[] array2={"computer","desk","chair","bottle"};
        String isCopied="NaOrNaOrNaOrNaOrNaOrNaOr";
        String original="NAOR";
        int[] isMagical={21,30,3};
        int num1=-1;
        int[] array3={123,34,2,3,37};
        int[] array4={111,21,132,321,96,13,78,30,40,22};

        //seperated(separate);
        //divided(separate);
        //System.out.println(longestWithoutSpace(array));
        //System.out.println(isMagicalArray(isMagical));
        //evenOrOdd(array2);
        //System.out.println(initials(string1));
        //System.out.println(isCopied(original,isCopied,num1));
        //System.out.println(relatives(sumOfNumbers(array3),sumOfNumbers(array4))); //יצרנו פונקציה (sumOfNumbers) שמחזירה מערך של סכום הספרות בכל איבר
        //System.out.println(rearrange(rearrange));
    }

    public static int[] seperated(String separate){
        String capitalLetters=separate.replaceAll("[^A-Z]","");
        String smallLetters=separate.replaceAll("[^a-z]","");
        int[] separated={smallLetters.length(),capitalLetters.length()};
        System.out.println(separated[0]+", "+separated[1]);
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
    public static boolean isMagicalArray(int[] isMagical) {
        boolean valid = true;

        for (int i = 0; i < isMagical.length; i++) {
            int sum = 0;
            do {
                sum += isMagical[i] % 10;       //לדוגמא המספר 321%10 הוא 32 עם שארית 1 אז sum=1
                isMagical[i] /= 10;             //מחליפים את האיבר במערך באותו מספר חלקי 10 ומכיוון ואנחנו ב- int אז 321 יוצא 32 כי השארית נשללת
            } while (isMagical[i] > 0);         //ככה isMagical[i] מתחלף במספר הבא שצריך עד שיש לנו מצב לדוגמא של 3/10 שיוצא 0.1 שב-int זה 0
            if (sum != isMagical.length) {
                valid = false;
                break;
            }
        }
        return valid;
    }
    public static void evenOrOdd(String[] array2){
        /*  כתבו פונקציה המקבלת מערך של מחרוזות. עבור כל מחרוזת,
       אם אורכה של המחרוזת זוגי, תודפס האות הראשונה
       במחרוזת ואם אורכה הוא אי-זוגי, תודפס האות האחרונה במחרוזת.*/

        for(int i=0;i< array2.length;i++){

            if(array2[i].length()%2==0){
                System.out.println(array2[i].charAt(0));
            }else {
                System.out.println(array2[i].charAt(array2[i].length()-1));
            }
        }
    }
    public static String initials(String string1){
      /*  כתבו פונקציה המקבלת מחרוזת המורכבת משתי מילים או יותר
      (ניתן להניח שבין כל שתי מילים מפריד רווח יחיד)
          ומחזירה "מחרוזת מקוצרת" חדשה באופן הבא:
המחרוזת המקוצרת תכיל את התו הראשון בכל מילה,
         עם נקודה בין כל שתי אותיות (אך לא בסוף המחרוזת).
    לדוגמה, עבור המחרוזת Hello From Java, תוחזר המחרוזת המקוצרת H.F.J  */

        String initials="";
        String[] test=string1.split(" ");
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
                       /*מחרוזת s1 נקראת "העתק S" של מחרוזת s2,
       אם אפשר לקבל את המחרוזת s1 על ידי שרשור של s מחרוזות s2,
         כאשר s הוא מספר שלם וחיובי.
לדוגמה, המחרוזת ABCDABCDABCD היא "העתק 3" של המחרוזת ABCD.
יש להתייחס לאותיות קטנות וגדולות כאילו היו אותה אות.
כתבו פונקציה המקבלת שתי מחרוזות ובודקת אם אחת מהן היא "העתק S" של השנייה.
              על הפונקציה להחזיר את הערך של S, או את הערך 1- במידה ולא מדובר ב"העתק S". */


        String organizedIsCopied=isCopied.toLowerCase();
        String organizedOriginal=original.toLowerCase();
        int count=0;
        int counter=0;
        for(int i=0;i<organizedIsCopied.length();i++){
            if(count==4){
                count=0;
            }
            if(organizedIsCopied.charAt(i)==organizedOriginal.charAt(count)){
                counter++;
            }

            if(counter>=organizedOriginal.length()){
                num1=1;
                break;
            }
                count++;
        }
        return num1;
    }
    public static int relatives(int[] array3,int[] array4){
 /* הגדרה: שני מספרים שלמים נקראים "אחים" אם סכום הספרות של האחד שווה לסכום הספרות של האחר.
        לדוגמה, המספרים 156 ו-39 הם מספרים אחים.
הגדרה: "רמת הקרבה" בין מספר שלם number לבין מערך array היא מספר "האחים שיש ל-number במערך arr.
 אם ל-number אין אחים במערך, אז "רמת הקרבה שלו למערך היא 0.
כתבו פונקציה המקבלת שני מערכים של מספרים שלמים: array1 ו-array2.
 הפונקציה תחזיר את האינדקס של האיבר במערך array1 שרמת הקרבה שלו למערך array2 היא הגבוהה ביותר.
  אם יש כמה כמה כאלה, יש להחזיר אינדקס של אחד מהם.   */
        int max=0;
        int num=0;
        for(int i=0;i< array3.length;i++){
            int count=0;
            for(int j=0;j< array4.length;j++){
                if(array3[i]==array4[j]){
                    count++;
                }
            }
            if(count>max){
                max=count;
                num=i;
            }
        }
        return num;
    }
    public static int[] sumOfNumbers(int[] array){
        //פונקציה שנוצרה בכדי למנוע כפל קוד
        for(int i=0;i<array.length;i++){
            int sum=0;
            do{
                sum+=array[i]%10;
                array[i]/=10;
            }while (array[i]>0);
            array[i]=sum;
        }
        return array;
    }

    public static String rearrange(String rearrange){
        String newStr = "";
        int counter = 1;
        do {
            for (int i = 0; i < rearrange.length(); i++) {
                String ch = rearrange.substring(i, i + 1);
                if (countTimes(rearrange, rearrange.charAt(i)) == counter && !newStr.contains(ch)) {
                    newStr += rearrange.charAt(i);
                }
            }
            counter++;
        }while (counter < rearrange.length());
        newStr = replace(newStr);
        return newStr;
    }
    public static int countTimes(String str,char ch){
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)){
                counter++;
            }
        }
        return counter;
    }
    public static String replace(String str){
        String newStr = "";
        for (int i = str.length() -1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        return newStr;
    }

}
