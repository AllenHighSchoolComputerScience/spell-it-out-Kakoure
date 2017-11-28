/**
 * Created by 230645 on 11/28/2017.
 */
public class helpers {
    public String[] splitString(String str){
        int arrayCount = 1;
        for(int i = 0; i < str.length();i++){
            if (str.charAt(i) == ' '){
                arrayCount++;
            }
        }
        String[] ret = new String[arrayCount];
        int j = 0;
        int clipInit = 0;
        for (int i = 0; i < str.length();i++){
            if (str.charAt(i) == ' '){
                ret[j] = str.substring(clipInit, i);
                clipInit = i+1;
                j++;
            }
        }
        ret[j] = str.substring(clipInit,str.length());

        return ret;
    }
}
