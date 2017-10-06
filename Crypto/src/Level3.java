/**
 * Created by 230645 on 10/6/2017.
 */
public class Level3 {
    public int prob1() {
        int a;
        int b;
        int c;
        for (a = 1; a < 10; a++) {
            for (b = 1; b < 10; b++) {
                if (b == a) {
                    b++;
                }
                for (c = 1; c < 10; c++) {
                    if (c == a || c == b) {
                        c++;
                    }
                    if ((a * 1111) + (b * 1111) + (c * 1111) == (b * 10000) + (a * 1110) + c) {
                        return c;
                    }
                }
            }
        }
        return -999;
    }

    public int prob2() {
        int a;
        int b;
        int c;
        int d;
        int e;
        for (a = 1; a < 10; a++) {
            for (b = 0; b < 10; b++) {
                for (c = 0; c < 10; c++) {
                    for (d = 0; d < 10; d++) {
                        for (e = 1; e < 10; e++) {
                            if (((a * 10000) + (b * 1000) + (c * 100) + (d * 10) + e) * 4 == (e * 10000) + (d * 1000) + (c * 100) + (b * 10) + a) {
                                return (a * 10000) + (b * 1000) + (c * 100) + (d * 10) + e;
                            }
                        }
                    }
                }
            }
        }
        return -999;
    }

    public int prob3() {
        int f;
        int o;
        int r;
        int t;
        int y;
        int e;
        int n;
        int s;
        int x;
        int i;
        for (f = 1; f < 10; f++) {
            for (o = 0; o < 10; o++) {
                while (o == f) {
                    o++;
                }
                for (r = 0; r < 10; r++) {
                    while (r == o || r == f) {
                        r++;
                    }
                    for (t = 1; t < 10; t++) {
                        while (t == f || t == o || t == r) {
                            t++;
                        }
                        for (y = 0; y < 10; y++) {
                            while (y == t || y == f || y == o || y == r) {
                                y++;
                            }
                            for (e = 0; e < 10; e++) {
                                while (e == f || e == o || e == r || e == t || e == y) {
                                    e++;
                                }
                                for (n = 0; n < 10; n++) {
                                    while (n == e || n == f || n == o || n == r || n == t || n == y) {
                                        n++;
                                    }
                                    for (s = 1; s < 10; s++) {
                                        while (s == e || s == f || s == o || s == r || s == t || s == y || s == n) {
                                            s++;
                                        }
                                        for (x = 0; x < 10; x++) {
                                            while (x == e || x == f || x == o || x == r || x == t || x == y || x == n || x == s) {
                                                x++;
                                            }
                                            for (i = 0; i < 10; i++) {
                                                while (i == e || i == f || i == o || i == r || i == t || i == y || i == n || i == s || i == x) {
                                                    i++;
                                                }
                                                if (((f * 10000) + (o * 1000) + (r * 100) + (t * 10) + y) + (2 * ((t * 100) + (e * 10) + n)) == (s * 10000) + (i * 1000) + (x * 100) + (t * 10) + y) {
                                                    return ((f * 10000) + (o * 1000) + (r * 100) + (t * 10) + y) + (2 * ((t * 100) + (e * 10) + n)) + (s * 10000) + (i * 1000) + (x * 100) + (t * 10) + y;
                                                }
                                            }
                                        }
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

    public int prob4() {
        int a;
        int b;
        int c;
        int d;
        int e;
        for (a = 1; a < 10; a++) {
            for (b = 0; b < 10; b++) {
                while (b == a) {
                    b++;
                }
                for (c = 1; c < 10; c++) {
                    while (c == b || c == a) {
                        c++;
                    }
                    for (d = 0; d < 10; d++) {
                        while (d == c || d == b || d == a) {
                            d++;
                        }
                        for (e = 0; e < 10; e++) {
                            while (e == d || e == c || e == b || e == a) {
                                e++;
                            }
                            if (((a * 10000) + (b * 1000) + (c * 100) + (d * 10) + e) * 12 == (c * 100000) + (d * 10000) + (e * 1000) + (a * 10) + b) {
                                return ((a * 10000) + (b * 1000) + (c * 100) + (d * 10) + e);
                            }
                        }
                    }
                }
            }
        }
        return -999;
    }

    public int prob5() {
        int dig1;
        int dig2;
        // index values are value index is multiplied by to match equation;
        int[] multivalues = {-99, -1010010, -90000, 10, 10100, 100, 0, 100000, 100010, 1000};
        int totalval = 0;
        for (int i = 0; i < 10; i++) {
            totalval += i * multivalues[i];
        }
        //System.out.println(totalval);
        for (dig1 = 0; dig1 < 10; dig1++) {
            for (dig2 = 0; dig2 < 10; dig2++) {
                if (dig2 == 0) {
                    if (dig1 == 7 || dig1 == 8 || dig1 == 1) {
                        dig2++;
                    }
                    if (dig1 == 0) {
                        while (dig2 == 7 || dig2 == 8 || dig2 == 1) {
                            dig2++;
                        }
                        if (totalval + (multivalues[dig2] * dig1) + (multivalues[dig1] * dig2) - (multivalues[dig1] * dig1) - (multivalues[dig2] * dig2) == 0) {
                            return dig1 + dig2;
                        }
                    }
                }
            }
        }
        return -999;
    }
}
