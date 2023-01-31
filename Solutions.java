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
    public static boolean majority(boolean a,boolean b, boolean c){

    }


    
    public static void main(String[] args) {
        System.out.println(max3(2.5,4,2.5));
        System.out.println(odd(true,true,true));




    }
} // javac Solutions.java;java Solutions