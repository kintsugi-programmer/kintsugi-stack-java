// package com.kintsugistack.javaessentials.datatypes; 
public class App {// Class
    public static void main(String[] args){ // Main Method/Runner/Driver Code

        byte a = 12;
        // byte a = 200; // out of range (-128 to 127)
        System.out.println("Byte Range");
        System.out.println("---");
        System.out.println("Example Byte Value:"+a);
        System.out.println("Minimum Byte Value:"+Byte.MIN_VALUE);
        System.out.println("Maximum Byte Value:"+Byte.MAX_VALUE);
        System.out.println();
        // Byte Range
        // ---
        // Example Byte Value:12
        // Minimum Byte Value:-128
        // Maximum Byte Value:127

        short b = 1222;
        System.out.println("Short Range");
        System.out.println("---");
        System.out.println("Example Short Value:" +b);
        System.out.println("Minimum Short Value:"+Short.MIN_VALUE);
        System.out.println("Maximum Short Value:"+Short.MAX_VALUE);
        System.out.println();
        // Short Range
        // ---
        // Example Short Value:1222
        // Minimum Short Value:-32768
        // Maximum Short Value:32767

        int c = 1222222;

        System.out.println("Integer Range");
        System.out.println("---");
        System.out.println("Example Integer Value:"+c);
        System.out.println("Minimum Integer Value:"+ Integer.MIN_VALUE);
        System.out.println("Maximum Integer Value:"+Integer.MAX_VALUE);
        System.out.println();
        // Integer Range
        // ---
        // Example Integer Value:1222222
        // Minimum Integer Value:-2147483648
        // Maximum Integer Value:2147483647

        long d = 1222222222222222222L;
        System.out.println("Long Range");
        System.out.println("---");
        System.out.println("Example Long Value:"+d);
        System.out.println("Minimum Long Value:"+Long.MIN_VALUE);
        System.out.println("Maximum Long Value:"+ Long.MAX_VALUE);
        System.out.println();
        // Long Range
        // ---
        // Example Long Value:1222222222222222222
        // Minimum Long Value:-9223372036854775808
        // Maximum Long Value:9223372036854775807
        
        float e = 1234567.1234567f ; 
        System.out.println("Float Range");
        System.out.println("---");
        System.out.println("Example Float Value:"+e);
        System.out.println("Smallest Float Value:"+Float.MIN_VALUE);
        System.out.println("Largerst Float Value:"+Float.MAX_VALUE);
        System.out.println("Smallest (-ve) Float Value:-"+Float.MIN_VALUE);
        System.out.println("Largerst (-ve) Float Value:-"+Float.MAX_VALUE);
        System.out.println();
        // Float Range
        // ---
        // Example Float Value:1234567.1
        // Smallest Float Value:1.4E-45
        // Largerst Float Value:3.4028235E38
        // Smallest (-ve) Float Value:-1.4E-45
        // Largerst (-ve) Float Value:-3.4028235E38

        double f = 12.123456789012345 ; 
        System.out.println("Double Range");
        System.out.println("---");
        System.out.println("Example Double Value:"+f);
        System.out.println("Smallest Double Value:"+Double.MIN_VALUE);
        System.out.println("Largerst Double Value:"+Double.MAX_VALUE);
        System.out.println("Smallest (-ve) Double Value:-"+Double.MIN_VALUE);
        System.out.println("Largerst (-ve) Double Value:-"+Double.MAX_VALUE);
        System.out.println();
        // Double Range
        // ---
        // Example Double Value:12.123456789012344
        // Smallest Double Value:4.9E-324
        // Largerst Double Value:1.7976931348623157E308
        // Smallest (-ve) Double Value:-4.9E-324
        // Largerst (-ve) Double Value:-1.7976931348623157E308

        boolean isAdult;
        isAdult = false;
        System.out.println("Boolean Range (Just true, false)");
        System.out.println("---");
        System.out.println("Example Boolean Value:"+isAdult);
        isAdult = true;
        System.out.println("Example Boolean Value:"+isAdult);
        System.out.println();
        // Boolean Range (Just true, false)
        // ---
        // Example Boolean Value:false
        // Example Boolean Value:true

        char g = 'अ';
        System.out.println("Character Range");
        System.out.println("---");
        System.out.println("Example Character Value:"+g);// 2bytes
        System.out.println("Example (int) Character Value:"+(int)g);
        System.out.println("Smallest (int) Character Value:"+(int) Character.MIN_VALUE);
        System.out.println("Largerst (int) Character Value:"+(int) Character.MAX_VALUE);  
        System.out.println("Example (char) Integer Value:"+ (char)10084 );      
        System.out.println();
        // Common ASCII Range: 0-127 , Contain Alphabets, Backspace, Enter, other chars
        // Character Range
        // ---
        // Example Character Value:अ
        // Example (int) Character Value:2309
        // Smallest (int) Character Value:0
        // Largerst (int) Character Value:65535
        // Example (char) Integer Value:❤        

        // int != Integer
        // primitive != Wrapper

        // Widening Conversion
        // automatic, implicit, no overflow, safe, like putting cup water in bucket(not bucket water in cup !!!)
        byte h = 11;
        short i = h;
        int j = i;
        long k = j;
        float l = k;
        double m = l;
        System.out.println("Widening Conversion Example");
        System.out.println("---");
        System.out.println("byte:"+h);
        System.out.println("short:"+i);
        System.out.println("int:"+j);
        System.out.println("long:"+k);
        System.out.println("float:"+l);
        System.out.println("double:"+m);
        System.out.println();
        // Widening Conversion Example
        // ---
        // byte:11
        // short:11
        // int:11
        // long:11
        // float:11.0
        // double:11.0

        // Narrowing Conversion
        // Explicit/ Manual
        // It's Putting Jug's water into cup, there will be overflow, there will be trim of water
        // It's Manual Process because if you write this code then you are okay with the trim, removing the overflow, ok with loss
        double n = 129.456;
        float o = (float) n;
        long p = (long) o;
        int q = (int) p;
        short r = (short) q;
        byte s = (byte) r;
        System.out.println("Narrowing Conversion Example");
        System.out.println("---");
        System.out.println("double:"+n);
        System.out.println("float:"+o);
        System.out.println("long:"+p);
        System.out.println("int:"+q);
        System.out.println("short:"+r);
        System.out.println("byte:"+s); // way too much overflow, don't narrow blindly
        System.out.println();
        // Narrowing Conversion Example
        // ---
        // double:129.456
        // float:129.456
        // long:129
        // int:129
        // short:129
        // byte:-127

        // String
        String t = "Hi"; // Using String Literal
        String u = new String("Hi"); // Using Constructer
        String v = "Hi";
        System.out.println("String Datatype")
        System.out.println("Same Reference/Address of 1&3:same pool ? :"+(t==v));
        System.out.println("Same Reference/Address of 1:pool 2:heap ? :"+(t==u));




        
        

    }
}