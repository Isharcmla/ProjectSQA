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

public class Base64_readResults_183263774248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term639;
     Object term720;
     Object term727;
     Object term729;

    public Base64_readResults_183263774248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term639 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term640 = (byte[]) newByteArray(64);
        byte[] term706 = (byte[]) newByteArray(2);
        byte[] term711 = (byte[]) newByteArray(2);
        setByteElement(term640, 0, (byte) 65);
        setByteElement(term640, 1, (byte) 66);
        setByteElement(term640, 2, (byte) 67);
        setByteElement(term640, 3, (byte) 68);
        setByteElement(term640, 4, (byte) 69);
        setByteElement(term640, 5, (byte) 70);
        setByteElement(term640, 6, (byte) 71);
        setByteElement(term640, 7, (byte) 72);
        setByteElement(term640, 8, (byte) 73);
        setByteElement(term640, 9, (byte) 74);
        setByteElement(term640, 10, (byte) 75);
        setByteElement(term640, 11, (byte) 76);
        setByteElement(term640, 12, (byte) 77);
        setByteElement(term640, 13, (byte) 78);
        setByteElement(term640, 14, (byte) 79);
        setByteElement(term640, 15, (byte) 80);
        setByteElement(term640, 16, (byte) 81);
        setByteElement(term640, 17, (byte) 82);
        setByteElement(term640, 18, (byte) 83);
        setByteElement(term640, 19, (byte) 84);
        setByteElement(term640, 20, (byte) 85);
        setByteElement(term640, 21, (byte) 86);
        setByteElement(term640, 22, (byte) 87);
        setByteElement(term640, 23, (byte) 88);
        setByteElement(term640, 24, (byte) 89);
        setByteElement(term640, 25, (byte) 90);
        setByteElement(term640, 26, (byte) 97);
        setByteElement(term640, 27, (byte) 98);
        setByteElement(term640, 28, (byte) 99);
        setByteElement(term640, 29, (byte) 100);
        setByteElement(term640, 30, (byte) 101);
        setByteElement(term640, 31, (byte) 102);
        setByteElement(term640, 32, (byte) 103);
        setByteElement(term640, 33, (byte) 104);
        setByteElement(term640, 34, (byte) 105);
        setByteElement(term640, 35, (byte) 106);
        setByteElement(term640, 36, (byte) 107);
        setByteElement(term640, 37, (byte) 108);
        setByteElement(term640, 38, (byte) 109);
        setByteElement(term640, 39, (byte) 110);
        setByteElement(term640, 40, (byte) 111);
        setByteElement(term640, 41, (byte) 112);
        setByteElement(term640, 42, (byte) 113);
        setByteElement(term640, 43, (byte) 114);
        setByteElement(term640, 44, (byte) 115);
        setByteElement(term640, 45, (byte) 116);
        setByteElement(term640, 46, (byte) 117);
        setByteElement(term640, 47, (byte) 118);
        setByteElement(term640, 48, (byte) 119);
        setByteElement(term640, 49, (byte) 120);
        setByteElement(term640, 50, (byte) 121);
        setByteElement(term640, 51, (byte) 122);
        setByteElement(term640, 52, (byte) 48);
        setByteElement(term640, 53, (byte) 49);
        setByteElement(term640, 54, (byte) 50);
        setByteElement(term640, 55, (byte) 51);
        setByteElement(term640, 56, (byte) 52);
        setByteElement(term640, 57, (byte) 53);
        setByteElement(term640, 58, (byte) 54);
        setByteElement(term640, 59, (byte) 55);
        setByteElement(term640, 60, (byte) 56);
        setByteElement(term640, 61, (byte) 57);
        setByteElement(term640, 62, (byte) 43);
        setByteElement(term640, 63, (byte) 47);
        setField(term639, term639.getClass(), "encodeTable", term640);
        setIntField(term639, term639.getClass(), "lineLength", 76);
        setByteElement(term706, 0, (byte) 13);
        setByteElement(term706, 1, (byte) 10);
        setField(term639, term639.getClass(), "lineSeparator", term706);
        setIntField(term639, term639.getClass(), "decodeSize", 5);
        setIntField(term639, term639.getClass(), "encodeSize", 6);
        setByteElement(term711, 0, (byte) -16);
        setByteElement(term711, 1, (byte) -112);
        setField(term639, term639.getClass(), "buffer", term711);
        setIntField(term639, term639.getClass(), "pos", -117576464);
        setIntField(term639, term639.getClass(), "readPos", -1007160944);
        setIntField(term639, term639.getClass(), "currentLinePos", 1135664017);
        setIntField(term639, term639.getClass(), "modulus", 590364439);
        setBooleanField(term639, term639.getClass(), "eof", true);
        setIntField(term639, term639.getClass(), "x", 865208305);
        term720 = (byte[]) newByteArray(6);
        setByteElement(term720, 0, (byte) -111);
        setByteElement(term720, 1, (byte) 23);
        setByteElement(term720, 2, (byte) -15);
        setByteElement(term720, 3, (byte) 36);
        setByteElement(term720, 4, (byte) 118);
        setByteElement(term720, 5, (byte) 106);
        term727 = new Integer(-1275173084);
        term729 = new Integer(-244121226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term720;
        args[1] = term727;
        args[2] = term729;
        try {
            callMethod(klass, "readResults", argTypes, term639, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


