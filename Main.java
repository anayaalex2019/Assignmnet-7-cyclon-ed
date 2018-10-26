public class Main {

    public static double R, totalDistance, deltaPhi1, deltaPhi2, deltaPhi3, deltaPhi4, deltaPhi5, deltaPhi6, deltaPhi7, deltaPhi8, deltaPhi9, deltaPhi10, deltaPhi11, deltaPhi12, deltaLambda1, deltaLambda2, deltaLambda3, deltaLambda4, deltaLambda5, deltaLambda6, deltaLambda7,deltaLambda8, deltaLambda9, deltaLambda10, deltaLambda11, deltaLambda12, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
    public static double a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
    public static double c1, c2, c3, c4, c5, c6, c7 ,c8 ,c9, c10, c11, c12;
    public static double d1, d2, d3, d4, d5, d6, d7 ,d8 ,d9, d10, d11, d12;

    public static void main(String[] args) {
	// variables
        R = 6371;

        //break
        p1 = 25*(Math.PI/180);
        p2 = 23*(Math.PI/180);
        p3 = 21*(Math.PI/180);
        p4 = 20*(Math.PI/180);
        p5 = 19*(Math.PI/180);
        p6 = 21*(Math.PI/180);
        p7 = 23*(Math.PI/180);
        p8 = 25*(Math.PI/180);
        p9 = 28*(Math.PI/180);
        p10 = 32*(Math.PI/180);
        p11 = 34*(Math.PI/180);
        p12 = 36*(Math.PI/180);
        p13 = 39*(Math.PI/180);

        //break
        l1 = -15*(Math.PI/180);
        l2 = -20*(Math.PI/180);
        l3 = -24*(Math.PI/180);
        l4 = -27*(Math.PI/180);
        l5 = -35*(Math.PI/180);
        l6 = -46*(Math.PI/180);
        l7 = -56*(Math.PI/180);
        l8 = -65*(Math.PI/180);
        l9 = -70*(Math.PI/180);
        l10 = -73*(Math.PI/180);
        l11 = -74*(Math.PI/180);
        l12 = -74*(Math.PI/180);
        l13 = -74*(Math.PI/180);

        //break
        deltaPhi1 = ((p2-p1)/2);
        deltaPhi2 = ((p3-p2)/2);
        deltaPhi3 = ((p4-p3)/2);
        deltaPhi4 = ((p5-p4)/2);
        deltaPhi5 = ((p6-p5)/2);
        deltaPhi6 = ((p7-p6)/2);
        deltaPhi7 = ((p8-p7)/2);
        deltaPhi8 = ((p9-p8)/2);
        deltaPhi9 = ((p10-p9)/2);
        deltaPhi10 = ((p11-p10)/2);
        deltaPhi11 = ((p12-p11)/2);
        deltaPhi12 = ((p13-p12)/2);

        //break
        deltaLambda1 = ((l2-l1)/2);
        deltaLambda2 = ((l3-l2)/2);
        deltaLambda3 = ((l4-l3)/2);
        deltaLambda4 = ((l5-l4)/2);
        deltaLambda5 = ((l6-l5)/2);
        deltaLambda6 = ((l7-l6)/2);
        deltaLambda7 = ((l8-l7)/2);
        deltaLambda8 = ((l9-l8)/2);
        deltaLambda9 = ((l10-l9)/2);
        deltaLambda10 = ((l11-l10)/2);
        deltaLambda11 = ((l12-l11)/2);
        deltaLambda12 = ((l13-l12)/2);

        run();
        calcTotalDistance();
        displayTime();
    }
    public static void run() {
        a1 = calcA1();
        a2 = calcA2();
        a3 = calcA3();
        a4 = calcA4();
        a5 = calcA5();
        a6 = calcA6();
        a7 = calcA7();
        a8 = calcA8();
        a9 = calcA9();
        a10 = calcA10();
        a11 = calcA11();
        a12 = calcA12();

        c1 = calcC1();
        c2 = calcC2();
        c3 = calcC3();
        c4 = calcC4();
        c5 = calcC5();
        c6 = calcC6();
        c7 = calcC7();
        c8 = calcC8();
        c9 = calcC9();
        c10 = calcC10();
        c11= calcC11();
        c12 = calcC12();

        d1 = calcD1();
        d2 = calcD2();
        d3 = calcD3();
        d4 = calcD4();
        d5 = calcD5();
        d6 = calcD6();
        d7 = calcD7();
        d8 = calcD8();
        d9 = calcD9();
        d10 = calcD10();
        d11 = calcD11();
        d12 = calcD12();

        totalDistance = calcTotalDistance();
    }

    //break
    public static double calcA1() {return(Math.sin(deltaPhi1) * Math.sin(deltaPhi1) + Math.cos(p1) * Math.cos(p2) * Math.sin(deltaLambda1) * Math.sin(deltaLambda1));}
    public static double calcA2() {return((Math.sin(deltaPhi2)*Math.sin(deltaPhi2))+(Math.cos(p2)*Math.cos(p3)*(Math.sin(deltaLambda2)*Math.sin(deltaLambda2))));}
    public static double calcA3() {return((Math.sin(deltaPhi1)*Math.sin(deltaPhi1))+(Math.cos(p3)*Math.cos(p4)*(Math.sin(deltaLambda3)*Math.sin(deltaLambda3))));}
    public static double calcA4() {return((Math.sin(deltaPhi1)*Math.sin(deltaPhi1))+(Math.cos(p4)*Math.cos(p5)*(Math.sin(deltaLambda4)*Math.sin(deltaLambda4))));}
    public static double calcA5() {return((Math.sin(deltaPhi1)*Math.sin(deltaPhi1))+(Math.cos(p5)*Math.cos(p6)*(Math.sin(deltaLambda5)*Math.sin(deltaLambda5))));}
    public static double calcA6() {return((Math.sin(deltaPhi1)*Math.sin(deltaPhi1))+(Math.cos(p6)*Math.cos(p7)*(Math.sin(deltaLambda6)*Math.sin(deltaLambda6))));}
    public static double calcA7() {return((Math.sin(deltaPhi1)*Math.sin(deltaPhi1))+(Math.cos(p7)*Math.cos(p8)*(Math.sin(deltaLambda7)*Math.sin(deltaLambda7))));}
    public static double calcA8() {return((Math.sin(deltaPhi1)*Math.sin(deltaPhi1))+(Math.cos(p8)*Math.cos(p9)*(Math.sin(deltaLambda8)*Math.sin(deltaLambda8))));}
    public static double calcA9() {return((Math.sin(deltaPhi1)*Math.sin(deltaPhi1))+(Math.cos(p9)*Math.cos(p10)*(Math.sin(deltaLambda9)*Math.sin(deltaLambda9))));}
    public static double calcA10() {return((Math.sin(deltaPhi1)*Math.sin(deltaPhi1))+(Math.cos(p10)*Math.cos(p11)*(Math.sin(deltaLambda10)*Math.sin(deltaLambda10))));}
    public static double calcA11() {return((Math.sin(deltaPhi1)*Math.sin(deltaPhi1))+(Math.cos(p11)*Math.cos(p12)*(Math.sin(deltaLambda11)*Math.sin(deltaLambda11))));}
    public static double calcA12() {return((Math.sin(deltaPhi1)*Math.sin(deltaPhi1))+(Math.cos(p12)*Math.cos(p13)*(Math.sin(deltaLambda12)*Math.sin(deltaLambda12))));}

    //break
    public static double calcC1() {return(2*Math.atan2(Math.sqrt(a1),Math.sqrt(1-a1)));}
    public static double calcC2() {return(2*(Math.atan2(Math.sqrt(a2),Math.sqrt(1-a2))));}
    public static double calcC3() {return(2*(Math.atan2(Math.sqrt(a3),Math.sqrt(1-a3))));}
    public static double calcC4() {return(2*(Math.atan2(Math.sqrt(a4),Math.sqrt(1-a4))));}
    public static double calcC5() {return(2*(Math.atan2(Math.sqrt(a5),Math.sqrt(1-a5))));}
    public static double calcC6() {return(2*(Math.atan2(Math.sqrt(a6),Math.sqrt(1-a6))));}
    public static double calcC7() {return(2*(Math.atan2(Math.sqrt(a7),Math.sqrt(1-a7))));}
    public static double calcC8() {return(2*(Math.atan2(Math.sqrt(a8),Math.sqrt(1-a8))));}
    public static double calcC9() {return(2*(Math.atan2(Math.sqrt(a9),Math.sqrt(1-a9))));}
    public static double calcC10() {return(2*(Math.atan2(Math.sqrt(a10),Math.sqrt(1-a10))));}
    public static double calcC11() {return(2*(Math.atan2(Math.sqrt(a11),Math.sqrt(1-a11))));}
    public static double calcC12() {return(2*(Math.atan2(Math.sqrt(a12),Math.sqrt(1-a12))));}

    //break
    public static double calcD1() {return(R*c1);}
    public static double calcD2() {return(R*c2);}
    public static double calcD3() {return(R*c3);}
    public static double calcD4() {return(R*c4);}
    public static double calcD5() {return(R*c5);}
    public static double calcD6() {return(R*c6);}
    public static double calcD7() {return(R*c7);}
    public static double calcD8() {return(R*c8);}
    public static double calcD9() {return(R*c9);}
    public static double calcD10() {return(R*c10);}
    public static double calcD11() {return(R*c11);}
    public static double calcD12() {return(R*c12);}

    //add up all of the distances
    public static double calcTotalDistance() {return(d1+d2+d3+d4+d5+d6+d7+d8+d9+d10+d11+d12);}

    //display the total distance traveled by the hurricane in kilometers
    public static void displayTime() {System.out.println("The total distance traveled by the hurricane was " + totalDistance + " kilometers"); }
}
