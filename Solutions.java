public class Solutions {

    //max3
    public static double max3(double a, double b, double c){
        if (a>b&&a>c){
            return a;
        }
        if (b>a&&b>c){
            return b;
        }
        return c;
    }
    //overload max3
    public static int max3(int a, int b, int c){
        if (a>b&&a>c){
            return a;
        }
        if (b>a&&b>c){
            return b;
        }
        return c;
    }

    //odd
    public static boolean odd(boolean a,boolean b, boolean c){
        int truenum = 0;
        if (a){
            truenum+=1;
        }
        if (b){
            truenum+=1;
        }
        if (c){
            truenum+=1;
        }
        if (truenum==1||truenum==3){
            return true;
        }
        return false;
    }

    //majority
    // BUG: majority(true, false, true) -> false
    public static boolean majority(boolean a,boolean b, boolean c){
        while (a){
            while(b){
                while(c){
                    return true;
                }
                return true;
            }
            return false;
        }
        while (!a){
            while(b){
                while(c){
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    //trigIdentity
    public static double trigIdentity(double x){
        double result = Math.pow(Math.sin(x),2)+Math.pow(Math.cos(x),2);
        return result;
    }

    
    public static void main(String[] args) {
        System.out.println(max3(2,4,1));
        System.out.println(odd(true,true,true));
        System.out.println(majority(false, true, true));
        System.out.println(trigIdentity(23.2));



    }
} // javac Solutions.java;java Solutions