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
import org.apache.commons.codec.DecoderException;
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Base64_decode_32071866451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1342;
     Object term1427;

    public Base64_decode_32071866451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1342 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term1343 = (byte[]) newByteArray(64);
        byte[] term1409 = (byte[]) newByteArray(2);
        byte[] term1414 = (byte[]) newByteArray(6);
        setByteElement(term1343, 0, (byte) 65);
        setByteElement(term1343, 1, (byte) 66);
        setByteElement(term1343, 2, (byte) 67);
        setByteElement(term1343, 3, (byte) 68);
        setByteElement(term1343, 4, (byte) 69);
        setByteElement(term1343, 5, (byte) 70);
        setByteElement(term1343, 6, (byte) 71);
        setByteElement(term1343, 7, (byte) 72);
        setByteElement(term1343, 8, (byte) 73);
        setByteElement(term1343, 9, (byte) 74);
        setByteElement(term1343, 10, (byte) 75);
        setByteElement(term1343, 11, (byte) 76);
        setByteElement(term1343, 12, (byte) 77);
        setByteElement(term1343, 13, (byte) 78);
        setByteElement(term1343, 14, (byte) 79);
        setByteElement(term1343, 15, (byte) 80);
        setByteElement(term1343, 16, (byte) 81);
        setByteElement(term1343, 17, (byte) 82);
        setByteElement(term1343, 18, (byte) 83);
        setByteElement(term1343, 19, (byte) 84);
        setByteElement(term1343, 20, (byte) 85);
        setByteElement(term1343, 21, (byte) 86);
        setByteElement(term1343, 22, (byte) 87);
        setByteElement(term1343, 23, (byte) 88);
        setByteElement(term1343, 24, (byte) 89);
        setByteElement(term1343, 25, (byte) 90);
        setByteElement(term1343, 26, (byte) 97);
        setByteElement(term1343, 27, (byte) 98);
        setByteElement(term1343, 28, (byte) 99);
        setByteElement(term1343, 29, (byte) 100);
        setByteElement(term1343, 30, (byte) 101);
        setByteElement(term1343, 31, (byte) 102);
        setByteElement(term1343, 32, (byte) 103);
        setByteElement(term1343, 33, (byte) 104);
        setByteElement(term1343, 34, (byte) 105);
        setByteElement(term1343, 35, (byte) 106);
        setByteElement(term1343, 36, (byte) 107);
        setByteElement(term1343, 37, (byte) 108);
        setByteElement(term1343, 38, (byte) 109);
        setByteElement(term1343, 39, (byte) 110);
        setByteElement(term1343, 40, (byte) 111);
        setByteElement(term1343, 41, (byte) 112);
        setByteElement(term1343, 42, (byte) 113);
        setByteElement(term1343, 43, (byte) 114);
        setByteElement(term1343, 44, (byte) 115);
        setByteElement(term1343, 45, (byte) 116);
        setByteElement(term1343, 46, (byte) 117);
        setByteElement(term1343, 47, (byte) 118);
        setByteElement(term1343, 48, (byte) 119);
        setByteElement(term1343, 49, (byte) 120);
        setByteElement(term1343, 50, (byte) 121);
        setByteElement(term1343, 51, (byte) 122);
        setByteElement(term1343, 52, (byte) 48);
        setByteElement(term1343, 53, (byte) 49);
        setByteElement(term1343, 54, (byte) 50);
        setByteElement(term1343, 55, (byte) 51);
        setByteElement(term1343, 56, (byte) 52);
        setByteElement(term1343, 57, (byte) 53);
        setByteElement(term1343, 58, (byte) 54);
        setByteElement(term1343, 59, (byte) 55);
        setByteElement(term1343, 60, (byte) 56);
        setByteElement(term1343, 61, (byte) 57);
        setByteElement(term1343, 62, (byte) 43);
        setByteElement(term1343, 63, (byte) 47);
        setField(term1342, term1342.getClass(), "encodeTable", term1343);
        setIntField(term1342, term1342.getClass(), "lineLength", 76);
        setByteElement(term1409, 0, (byte) 13);
        setByteElement(term1409, 1, (byte) 10);
        setField(term1342, term1342.getClass(), "lineSeparator", term1409);
        setIntField(term1342, term1342.getClass(), "decodeSize", 5);
        setIntField(term1342, term1342.getClass(), "encodeSize", 6);
        setByteElement(term1414, 0, (byte) 45);
        setByteElement(term1414, 1, (byte) -39);
        setByteElement(term1414, 2, (byte) -20);
        setByteElement(term1414, 3, (byte) 10);
        setByteElement(term1414, 4, (byte) 77);
        setByteElement(term1414, 5, (byte) 14);
        setField(term1342, term1342.getClass(), "buf", term1414);
        setIntField(term1342, term1342.getClass(), "pos", 454281060);
        setIntField(term1342, term1342.getClass(), "readPos", -1786399638);
        setIntField(term1342, term1342.getClass(), "currentLinePos", 2055867847);
        setIntField(term1342, term1342.getClass(), "modulus", -1048298087);
        setBooleanField(term1342, term1342.getClass(), "eof", false);
        setIntField(term1342, term1342.getClass(), "x", 292681826);
        term1427 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1427;
        try {
            callMethod(klass, "decode", argTypes, term1342, args);
            assertTrue(false);
        }
        catch (DecoderException e) {
        }

    }

};


