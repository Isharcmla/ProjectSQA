package org.apache.commons.codec.binary;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Base64_encode_68437418043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term971;
     Object term1056;
     Object term1062;
     Object term1064;

    public Base64_encode_68437418043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term971 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term972 = (byte[]) newByteArray(64);
        byte[] term1038 = (byte[]) newByteArray(2);
        byte[] term1043 = (byte[]) newByteArray(6);
        setByteElement(term972, 0, (byte) 65);
        setByteElement(term972, 1, (byte) 66);
        setByteElement(term972, 2, (byte) 67);
        setByteElement(term972, 3, (byte) 68);
        setByteElement(term972, 4, (byte) 69);
        setByteElement(term972, 5, (byte) 70);
        setByteElement(term972, 6, (byte) 71);
        setByteElement(term972, 7, (byte) 72);
        setByteElement(term972, 8, (byte) 73);
        setByteElement(term972, 9, (byte) 74);
        setByteElement(term972, 10, (byte) 75);
        setByteElement(term972, 11, (byte) 76);
        setByteElement(term972, 12, (byte) 77);
        setByteElement(term972, 13, (byte) 78);
        setByteElement(term972, 14, (byte) 79);
        setByteElement(term972, 15, (byte) 80);
        setByteElement(term972, 16, (byte) 81);
        setByteElement(term972, 17, (byte) 82);
        setByteElement(term972, 18, (byte) 83);
        setByteElement(term972, 19, (byte) 84);
        setByteElement(term972, 20, (byte) 85);
        setByteElement(term972, 21, (byte) 86);
        setByteElement(term972, 22, (byte) 87);
        setByteElement(term972, 23, (byte) 88);
        setByteElement(term972, 24, (byte) 89);
        setByteElement(term972, 25, (byte) 90);
        setByteElement(term972, 26, (byte) 97);
        setByteElement(term972, 27, (byte) 98);
        setByteElement(term972, 28, (byte) 99);
        setByteElement(term972, 29, (byte) 100);
        setByteElement(term972, 30, (byte) 101);
        setByteElement(term972, 31, (byte) 102);
        setByteElement(term972, 32, (byte) 103);
        setByteElement(term972, 33, (byte) 104);
        setByteElement(term972, 34, (byte) 105);
        setByteElement(term972, 35, (byte) 106);
        setByteElement(term972, 36, (byte) 107);
        setByteElement(term972, 37, (byte) 108);
        setByteElement(term972, 38, (byte) 109);
        setByteElement(term972, 39, (byte) 110);
        setByteElement(term972, 40, (byte) 111);
        setByteElement(term972, 41, (byte) 112);
        setByteElement(term972, 42, (byte) 113);
        setByteElement(term972, 43, (byte) 114);
        setByteElement(term972, 44, (byte) 115);
        setByteElement(term972, 45, (byte) 116);
        setByteElement(term972, 46, (byte) 117);
        setByteElement(term972, 47, (byte) 118);
        setByteElement(term972, 48, (byte) 119);
        setByteElement(term972, 49, (byte) 120);
        setByteElement(term972, 50, (byte) 121);
        setByteElement(term972, 51, (byte) 122);
        setByteElement(term972, 52, (byte) 48);
        setByteElement(term972, 53, (byte) 49);
        setByteElement(term972, 54, (byte) 50);
        setByteElement(term972, 55, (byte) 51);
        setByteElement(term972, 56, (byte) 52);
        setByteElement(term972, 57, (byte) 53);
        setByteElement(term972, 58, (byte) 54);
        setByteElement(term972, 59, (byte) 55);
        setByteElement(term972, 60, (byte) 56);
        setByteElement(term972, 61, (byte) 57);
        setByteElement(term972, 62, (byte) 43);
        setByteElement(term972, 63, (byte) 47);
        setField(term971, term971.getClass(), "encodeTable", term972);
        setIntField(term971, term971.getClass(), "lineLength", 76);
        setByteElement(term1038, 0, (byte) 13);
        setByteElement(term1038, 1, (byte) 10);
        setField(term971, term971.getClass(), "lineSeparator", term1038);
        setIntField(term971, term971.getClass(), "decodeSize", 5);
        setIntField(term971, term971.getClass(), "encodeSize", 6);
        setByteElement(term1043, 0, (byte) 72);
        setByteElement(term1043, 1, (byte) 111);
        setByteElement(term1043, 2, (byte) 99);
        setByteElement(term1043, 3, (byte) -12);
        setByteElement(term1043, 4, (byte) -61);
        setByteElement(term1043, 5, (byte) -85);
        setField(term971, term971.getClass(), "buf", term1043);
        setIntField(term971, term971.getClass(), "pos", -469968304);
        setIntField(term971, term971.getClass(), "readPos", -1145578966);
        setIntField(term971, term971.getClass(), "currentLinePos", 679763016);
        setIntField(term971, term971.getClass(), "modulus", 1962444399);
        setBooleanField(term971, term971.getClass(), "eof", false);
        setIntField(term971, term971.getClass(), "x", 767834723);
        term1056 = (byte[]) newByteArray(5);
        setByteElement(term1056, 0, (byte) -22);
        setByteElement(term1056, 1, (byte) 93);
        setByteElement(term1056, 2, (byte) 69);
        setByteElement(term1056, 3, (byte) -74);
        setByteElement(term1056, 4, (byte) -123);
        term1062 = new Integer(-602026508);
        term1064 = new Integer(-157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1056;
        args[1] = term1062;
        args[2] = term1064;
        try {
            callMethod(klass, "encode", argTypes, term971, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


