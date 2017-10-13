/**
 * Created by 230645 on 10/4/2017.
 */
public class Level2 {
    public int prob1(){
        int a;
        int b;
        int c;
        for(a = 1; a < 10; a++){
            for (b = 0; b < 10;b++){
                if (b == a){
                    b++;
                }
                for (c = 0; c < 10;c++){
                    if (c == b || c == a){
                        c++;
                    }
                    if((a+b+c)*11 == (a*100)+(b*10)+c){
                        return (a*100)+(b*10)+c;
                    }
                }
            }
        }
        return -999;
    }
    public int prob2(){
        int a;
        int b;
        for (a = 1; a < 10; a++){
            for(b=1;b<10;b++){
                if (b==a){
                    b++;
                }
                if (((a*10)+b) * (a*11) == (b*1001)+a*110){
                    return (a*10) + b;
                }
            }
        }
        return -999;
    }
    public int prob3(){
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        for(a = 1; a < 10; a++){
            for (b = 0; b< 10; b++){
                for (c = 0; c < 10;c ++){
                    for (d = 1; d <10;d++){
                        for (e = 0; e < 10; e++){
                            for (f = 0; f <10 ; f++){
                                if (999*((a*100)+(b*10)+c) == (d*100000) + e*(10000)+f*(1000)+132){
                                    return a+b+c+d+e+f;
                                }
                            }
                        }
                    }
                }
            }
        }
        return -999;
    }
    public int prob4(){
        int s = -1;
        int e = -1;
        int n = -1;
        int d = -1;
        int m = -1;
        int r = -1;
        int y = -1;
        int o = 0;
        for (s = 1 ; s< 10; s++){
            for (e = 1; e < 10; e++){
                while (e == s){
                    e++;
                }
                for (n = 1; n < 10; n++){
                    while (n == e || n == s){
                        n++;
                    }
                    for (d = 1; d < 10; d++){
                        while (d == n || d == e || d == s){
                            d++;
                        }
                        for (m = 1; m < 10; m++){
                            while (m == d || m == n || m == e || m == s){
                                m++;
                            }
                            for (r = 1; r < 10;r++){
                                while (r == m || r == d || r == n || r== e || r == s){
                                    r++;
                                }
                                for (y = 1; y < 10; y++){
                                    while (y == r || y == m || y == d || y == n || y == e || y == s){
                                        y++;
                                    }
                                    if (s*1000 + e*101+n*10+d+r*10+m*1000+o*100 == m*10000+o*1000+n*100+e*10+y){
                                        /*int[] temp = {s, e, n ,d ,m , r,y};
                                        for (int i = 0; i < temp.length;i++) {
                                            System.out.println(temp[i]);
                                        }*/
                                        return m*10000+o*1000+n*100+e*10+y;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return -999;
    }
    public int prob5(){
        int a;
        int b;
        int c;
        int d;
        for (a = 1; a< 10;a++) {
            for (b = 0; b < 10; b++) {
                while (b == a) {
                    b++;
                }
                for (c = 0; c < 10; c++) {
                    while (c == b || c == a) {
                        c++;
                    }
                    for (d = 1; d < 10; d++) {
                        while (d == c || d == b || d == a) {
                            d++;
                        }
                        if (((a * 1000) + (b * 100) + (c * 10) + d) * d == (d * 1000) + (c * 100) + (b * 10) + a) {
                            return a + b + c + d;
                        }
                    }
                }
            }
        }
        return -999;
    }
}
