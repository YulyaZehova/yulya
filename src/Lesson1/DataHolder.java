package Lesson1;


public class DataHolder {
    private byte byteValue;
    private short shortValue;
    private int intValue;
    private long longValue;
    private float floatValue;
    private double doubleValue;
    private char charValue;
    private boolean booleanValue;

    private Byte b;
    private Short s;
    private Integer i;
    private Long l;
    private Float f;
    private Double d;
    private Character c;
    private Boolean bool;


    @Override 
    public String toString() {
        return "1.2.3";
    }


    public int getIntValue() {
        return intValue;
    }
    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public byte getByteValue() {
        return byteValue;
    }
    public void setByteValue(byte byteValue) {
        this.byteValue = byteValue;
    }

    public short getShortValue(){
        return shortValue;
    }
    public void setShortValue(short shortValue) {
        this.shortValue = shortValue;
    }

    public long getLongValue() {
        return longValue;
    }
    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public float getFloatValue(){
        return floatValue;
    }
    public void setfloatValue(float floatValue) {
        this.floatValue=floatValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }
    public void setDoubleValue(double doubleValue) {
        this.doubleValue=doubleValue;
    }

    public char getCharValue() {
        return charValue;
    }
    public void setCharValue(char charValue) {
        this.charValue=charValue;
    }

    public boolean getBooleanValue() {
        return booleanValue;
    }
    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue=booleanValue;
    }

    //---
    public Byte getByteb() {
        return b;
    }

    public void setByteb(Byte byte1) {
        this.b=byte1;
    }

    public Integer getIntegeri() {
        return i;
    }

    public void setIntegeri(Integer int1) {
        this.i=int1;
    }

    public Short geShortS() {
        return s;
    }

    public void setShortS(Short short1) {
        this.s = short1;
    }

    public Long getLongL() {
        return l;
    }

    public void setLongL(Long long1) {
        this.l = long1;
    }

    public Float getFloatF() {
        return f;
    }
    
    public void setFloatF(Float float1) {
        this.f=float1;
    }

    public Double getDoubleD() {
        return d;
    }

    public void setDoubleD(Double double1) {
        this.d=double1;
    }

    public Character getCharacterC() {
        return c;
    }
    
    public void setCharacterC(Character char1) {
        this.c=char1;
    }

    public Boolean getBooleanBool() {
        return bool;
    }
    public void setBooleanBool(Boolean boolean1) {
        this.bool=boolean1;
    }
}