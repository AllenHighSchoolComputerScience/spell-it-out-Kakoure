/**
 * Created by 230645 on 10/6/2017.
 */
public class Bonus {
    public int bonusprob1(){
       return 0;
    }
    public String NumToString(int num){
        String ret = "";
        int temp;
        if (num >= 1000000000){
            temp = num % 1000000000;
            ret += shortNumToString(temp);
            ret += " Million";
            if (num - ((num / 1000000000) * 1000000000) != 0){
                ret += " ";
            }
            num -= ((num / 1000000000) * 1000000000);
        }
        if (num >= 1000000){
            temp = num % 1000000;
            ret += shortNumToString(temp);
            ret += " Thousand";
            if (num - ((num / 1000000) * 1000000) != 0){
                ret += " ";
            }
            num -= ((num / 1000000) * 1000000);
        }
        if (num >= 1000){
            temp = num % 1000;
            ret += shortNumToString(temp);
            ret += " Thousand";
            if (num - ((num / 1000) * 1000) != 0){
                ret += " ";
            }
            num -= ((num / 1000) * 1000);
        }
        ret += shortNumToString(num);
        return ret;
    }
    //For numbers between 1-100
    public String shortNumToString(int num){
        String ret = "";
        if (num == 0){
            return "Zero";
        }
        boolean teen = false;
        if (num >= 100) {
            switch (num / 100) {
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
            if (num % 100 != 0) {
                ret += "and ";
            }
            num = num - ((num / 100) * 100);
        }
            if (num >= 10){

                switch(num / 10){
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
                        ret += "Ninety";
                        break;
                    }
                    if (num % 10 != 0 && !teen) {
                    ret += " ";
                    }
                num = num - ((num / 10) * 10);
                }
            if (teen){
                switch(num){
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
                        ret += "Nineteen";
                        break;
                }
                }else {
                switch(num){
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
    public String lengthfinder (double num){
        return "";
    }
}
