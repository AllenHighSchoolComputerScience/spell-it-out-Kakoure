/**
 * Created by 230645 on 10/4/2017.
 */
public class Level1 {
    public int prob1(){
        int a;
        int b;
        int c;
        for (int i = 0; i < 10;i++){
            a = i;
            for (int j = 0; j < 10;j++){
                b = j;
                for (int f = 0; f < 10;f++){
                    c = f;
                    if (((a*100)+(b*10)+c) * 8 ==( (a*1000)+(c*111)) && a!= c && a!= b && b != c){
    return a+b+c+8;
                    }
                }
            }
        }
    return -999;
    }
    public int prob2(){
        int a;
        int b;
        int c;
        int d;
        int max = 0;
        for (int i = 0; i < 10;i++){
            a = i;
            for (int j = 0; j < 10;j++){
                b = j;
                for (int f = 0; f < 10;f++){
                    c = f;
                    for(int g = 0; g <10;g++) {
                        d = g;

                        if (a != b && a != c && b != c && a!=d && b != d && c != d) {
                            max = Math.max(max, (((a * 10) + b) + ((c * 10) + d)));
                        }
                        }
                    }
                }
            }
       return max;
    }
    public int prob3(){
        int x;
        for (int i = 0; i < 10;i++){
            x=i;
            if ((11409+(x*10)) * (10821 + (x*1000)) == 123456789){
                return x;
            }
        }
        return -999;
    }
    public int prob4(){
        int a;
        int b;
        int c;
        int d;
        int e;
        for (a = 0; a < 10; a++){

            for (b = 0; b < 10; b++){

                for (c = 0; c < 10; c++){

                    for (d = 0;d < 10;d++){
                        for (e = 0; e < 10; e++){
                            if((a*300)+((b+c+d)*10)+(e*3) == 2011){
                                return a+b+c+d+e;
                            }
                        }
                    }
                }
            }
        }
        return -999;
    }

}
