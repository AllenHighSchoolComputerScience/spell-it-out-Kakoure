/**
 * Created by 230645 on 10/6/2017.
 */
public class Bonus {
    public int bonusprob1(){
        //Find longest group of 3, then longest group of 2
        int maxnum3 = 0;
        int maxnum2 = 1;
        int maxnumB = 1;
        for (int i = 0; i < 1000;i++){
           if (NumToString(i).length()>NumToString(maxnum3).length()){
               maxnum3 = i;
           }
            if (i > 0 && i < 100){
                if (NumToString(i).length()>NumToString(maxnum2).length()){
                    maxnum2 = i;
                }
            }
            if ( i > 0 && i < 3){
                if (shortNumToString(i).length()>shortNumToString(maxnumB).length()){
                    maxnumB = i;
                }
            }
        }
       double longestNum = (maxnumB*1000000000) + (maxnum3 * 1001001) + ((double)(maxnum2)/100.0);
     // System.out.println("" + longestNum);
     //   System.out.println(NumToString(longestNum));
      return NumLength(longestNum);


    }
    public int bonusprob2(){
        int maxnum3 = 0;
        int maxnum2 = 1;
        int maxnumB = 1;
        for (int i = 0; i < 1000;i++){
            if (removeSpaces(NumToString(i)).length()>removeSpaces(NumToString(maxnum3)).length()){
                maxnum3 = i;
            }
            if (i > 0 && i < 100){
                if (removeSpaces(NumToString(i)).length()>removeSpaces(NumToString(maxnum2)).length()){
                    maxnum2 = i;
                }
            }
            if ( i > 0 && i < 3){
                if (shortNumToString(i).length()>shortNumToString(maxnumB).length()){
                    maxnumB = i;
                }
            }
        }
        double longestNum = (maxnumB*1000000000) + (maxnum3 * 1001001) + ((double)(maxnum2)/100.0);
        //System.out.println("" + longestNum);
       // System.out.println(removeSpaces(NumToString(longestNum)));
        return removeSpaces(NumToString(longestNum)).length();

    }
    public int NumLength(int num){
        return NumToString(num).length();
    }
    public int NumLength(double num){
        return NumToString(num).length();
    }
    public String NumToString(int num){
        String ret = "";
        int temp;
        if (num >= 1000000000){
            temp = num / 1000000000;
            ret += shortNumToString(temp);
            ret += " Billion";
            if (num - ((num / 1000000000) * 1000000000) != 0){
                ret += " ";
            }
            num -= ((num / 1000000000) * 1000000000);
        }
        if (num >= 1000000){
            temp = num / 1000000;
            ret += shortNumToString(temp);
            ret += " Million";
            if (num - ((num / 1000000) * 1000000) != 0){
                ret += " ";
            }
            num -= ((num / 1000000) * 1000000);
        }
        if (num >= 1000){
            temp = num / 1000;
            ret += shortNumToString(temp);
            ret += " Thousand";
            if (num - ((num / 1000) * 1000) != 0){
                ret += " ";
            }
            num -= ((num / 1000) * 1000);
        }

        ret += shortNumToString(num);
        ret += " Dollar";
        if (num != 1){
            ret += "s";
        }

        return ret;
    }
    public String NumToString(double dub){
        String ret = "";
        double newMoney = dub * 100.0;
        int DOLLARS = (int)(newMoney / 100);
        int CENTS = (int)(newMoney % 100);

        ret += NumToString(DOLLARS);




        if (CENTS > 0) {
            ret += " and ";
            ret += shortNumToString(CENTS);

            ret += " Cent";
            if (CENTS != 1){
                ret += "s";
            }
        }
        return ret;
    }
    //For numbers between 1-100
    public String shortNumToString(int number){
        String ret = "";
        if (number == 0){
            return "Zero";
        }
        boolean teen = false;
        if (number >= 100) {
            switch (number / 100) {
                case 1:
                    ret += "One";
                    break;
                case 2:
                    ret += "Two";
                    break;
                case 3:
                    ret += "Three";
                    break;
                case 4:
                    ret += "Four";
                    break;
                case 5:
                    ret += "Five";
                    break;
                case 6:
                    ret += "Six";
                    break;
                case 7:
                    ret += "Seven";
                    break;
                case 8:
                    ret += "Eight";
                    break;
                case 9:
                    ret += "Nine";
                    break;
            }
            ret += " Hundred ";
            if (number % 100 != 0) {
                ret += "and ";
            }
            number = number - ((number / 100) * 100);
        }
            if (number >= 10){

                switch(number / 10){
                    case 1:
                        teen = true;
                        break;
                    case 2:
                        ret += "Twenty";
                        break;
                    case 3:
                        ret += "Thirty";
                        break;
                    case 4:
                        ret += "Forty";
                        break;
                    case 5:
                        ret += "Fifty";
                        break;
                    case 6:
                        ret += "Sixty";
                        break;
                    case 7:
                        ret += "Seventy";
                        break;
                    case 8:
                        ret += "Eighty";
                        break;
                    case 9:
                        ret += "NIENty";
                        break;
                    }
                    if (number % 10 != 0 && !teen) {
                    ret += " ";
                    }
                number = number - ((number / 10) * 10);
                }
            if (teen){
                switch(number){
                    case 0:
                        ret += "Ten";
                        break;
                    case 1:
                        ret += "Eleven";
                        break;
                    case 2:
                        ret += "Twelve";
                        break;
                    case 3:
                        ret += "Thirteen";
                        break;
                    case 4:
                        ret += "Fourteen";
                        break;
                    case 5:
                        ret += "Fifteen";
                        break;
                    case 6:
                        ret += "Sixteen";
                        break;
                    case 7:
                        ret += "Seventeen";
                        break;
                    case 8:
                        ret += "Eighteen";
                        break;
                    case 9:
                        ret += "NIENteen";
                        break;
                }
                }else {
                switch(number){
                    case 1:
                        ret += "One";
                        break;
                    case 2:
                        ret += "Two";
                        break;
                    case 3:
                        ret += "Three";
                        break;
                    case 4:
                        ret += "Four";
                        break;
                    case 5:
                        ret += "Five";
                        break;
                    case 6:
                        ret += "Six";
                        break;
                    case 7:
                        ret += "Seven";
                        break;
                    case 8:
                        ret += "Eight";
                        break;
                    case 9:
                        ret += "NEIN";
                        break;

                }
            }
            return ret;

    }
    public String removeSpaces(String str){
        if (str.length() < 1){
            return "";
        }
        if (str.substring(0,1).equals(" ")){
            return removeSpaces(str.substring(1));
        } else return str.charAt(0)+removeSpaces(str.substring(1));
    }
}
