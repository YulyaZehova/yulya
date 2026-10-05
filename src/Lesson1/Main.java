package Lesson1;

import java.util.List;

public class Main {

    public static int globalint;
    public static char globalchar;
    public static byte globalbyte;
    public static double globaldouble;
    public static float globalfloat;
    public static long globallong;
    public static short globalshoart;
    public static boolean globalboolean;

    public static Integer globalintWR;
    public static Character globalcharWR;
    public static Byte globalbyteWR;
    public static Double globaldoubleWR;
    public static Float globalfloatWR;
    public static Long globallongWR;
    public static Short globalshoartWR;
    public static Boolean globalbooleanWR;

    public static void main(String[] args) throws Exception {

        byte localbyte=10;
        char  localchar='j';
        double localdouble=2.31;
        float localfloat=5F;
        //long locallong=45L;          not used
        //short localshort=76;         not used
        //int localint=756855;         not used
        //boolean localboolean=true;   not used

        //Byte localbyteWR=10;        not used
        // Character localcharWR='y';   not used
        // Double localdoubleWR=2.31;  not used
        Float localfloaWRt= 5F;
        Long locallongWR = 5L;    
        Short localshortWR=76;   
        Integer localintWR=756855;
        Boolean localbooleanWR=true;
        
    
        DataHolder holder = new DataHolder();
        holder.setIntValue(90);
        holder.setByteValue(localbyte);
        holder.setCharValue('k');
        holder.setDoubleValue(localdouble);
        holder.setBooleanValue(localbooleanWR);
        holder.setLongValue(locallongWR);
        holder.setShortS(localshortWR);
        holder.setfloatValue(localfloat);

        holder.setDoubleD(14.41);
        holder.setCharacterC(localchar);
        holder.setFloatF(localfloaWRt);
        holder.setBooleanBool(false);
        holder.setIntValue(localintWR);

        globalint = holder.getIntValue();
        globalchar = holder.getCharValue();
        globalbyte = holder.getByteValue();
        globaldouble = holder.getDoubleValue();
        globalbooleanWR = holder.getBooleanBool();
        globallongWR = holder.getLongValue();
  
        byte byte1 = holder.getByteValue();
        int int2 = holder.getIntValue();
        double double2=holder.getDoubleD();
        
        byte b = 10;
        int i = b;        // byte → int
        long l = i;       // int → long
        double d = l;     // long → double

        double d2 = 9.99;
        int i2 = (int) d2;  // 9 — дробная часть отбрасывается

        long big = 300L;
        byte small = (byte) big;  // переполнение
        
        Integer boxed = 100;      // autoboxing: int → Integer
        int unboxed = boxed;      // unboxing:  Integer → int

       // Integer nullable = null;
       // int x = nullable;         // ❌ NullPointerException во время выполнения

       System.out.println(holder);

        System.out.println("Global Variables:");       
        System.out.println("Global Int: " + globalint);
        System.out.println("Global Double: " + globaldouble);
        System.out.println("Global Boolean Wrapper class: " + globalbooleanWR);
        System.out.println("Global Short: " + holder.geShortS());
        System.out.println("Global Float: " + holder.getFloatValue());
        System.out.println("Global Long Wrapper class: " + globallongWR); 

        System.out.println("Local Variables:");   
        System.out.println("Local Byte variable from Main: " + byte1);
        System.out.println("Local Int variable from Main: " + int2);
        System.out.println("Local Double variable from Main: " + double2);
        System.out.println("Local Float variable from Main: " + localfloat);

        System.out.println("Experiments with types:");   
        System.out.println("Byte to Int: " + i);
        System.out.println("Int to Long: " +l);
        System.out.println("Long to Double: " + d);

        System.out.println("Double to Int: " + i2);
        System.out.println("Overfull: " +small);

        System.out.println("Integer to int: " +unboxed);

        //System.out.println("Null: " +x);



    }}
