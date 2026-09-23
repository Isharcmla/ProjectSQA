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
import org.apache.commons.codec.EncoderException;
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Base64_encode_146112753672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1811;
     Object term1892;

    public Base64_encode_146112753672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1811 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term1812 = (byte[]) newByteArray(64);
        byte[] term1878 = (byte[]) newByteArray(2);
        byte[] term1883 = (byte[]) newByteArray(2);
        setByteElement(term1812, 0, (byte) 65);
        setByteElement(term1812, 1, (byte) 66);
        setByteElement(term1812, 2, (byte) 67);
        setByteElement(term1812, 3, (byte) 68);
        setByteElement(term1812, 4, (byte) 69);
        setByteElement(term1812, 5, (byte) 70);
        setByteElement(term1812, 6, (byte) 71);
        setByteElement(term1812, 7, (byte) 72);
        setByteElement(term1812, 8, (byte) 73);
        setByteElement(term1812, 9, (byte) 74);
        setByteElement(term1812, 10, (byte) 75);
        setByteElement(term1812, 11, (byte) 76);
        setByteElement(term1812, 12, (byte) 77);
        setByteElement(term1812, 13, (byte) 78);
        setByteElement(term1812, 14, (byte) 79);
        setByteElement(term1812, 15, (byte) 80);
        setByteElement(term1812, 16, (byte) 81);
        setByteElement(term1812, 17, (byte) 82);
        setByteElement(term1812, 18, (byte) 83);
        setByteElement(term1812, 19, (byte) 84);
        setByteElement(term1812, 20, (byte) 85);
        setByteElement(term1812, 21, (byte) 86);
        setByteElement(term1812, 22, (byte) 87);
        setByteElement(term1812, 23, (byte) 88);
        setByteElement(term1812, 24, (byte) 89);
        setByteElement(term1812, 25, (byte) 90);
        setByteElement(term1812, 26, (byte) 97);
        setByteElement(term1812, 27, (byte) 98);
        setByteElement(term1812, 28, (byte) 99);
        setByteElement(term1812, 29, (byte) 100);
        setByteElement(term1812, 30, (byte) 101);
        setByteElement(term1812, 31, (byte) 102);
        setByteElement(term1812, 32, (byte) 103);
        setByteElement(term1812, 33, (byte) 104);
        setByteElement(term1812, 34, (byte) 105);
        setByteElement(term1812, 35, (byte) 106);
        setByteElement(term1812, 36, (byte) 107);
        setByteElement(term1812, 37, (byte) 108);
        setByteElement(term1812, 38, (byte) 109);
        setByteElement(term1812, 39, (byte) 110);
        setByteElement(term1812, 40, (byte) 111);
        setByteElement(term1812, 41, (byte) 112);
        setByteElement(term1812, 42, (byte) 113);
        setByteElement(term1812, 43, (byte) 114);
        setByteElement(term1812, 44, (byte) 115);
        setByteElement(term1812, 45, (byte) 116);
        setByteElement(term1812, 46, (byte) 117);
        setByteElement(term1812, 47, (byte) 118);
        setByteElement(term1812, 48, (byte) 119);
        setByteElement(term1812, 49, (byte) 120);
        setByteElement(term1812, 50, (byte) 121);
        setByteElement(term1812, 51, (byte) 122);
        setByteElement(term1812, 52, (byte) 48);
        setByteElement(term1812, 53, (byte) 49);
        setByteElement(term1812, 54, (byte) 50);
        setByteElement(term1812, 55, (byte) 51);
        setByteElement(term1812, 56, (byte) 52);
        setByteElement(term1812, 57, (byte) 53);
        setByteElement(term1812, 58, (byte) 54);
        setByteElement(term1812, 59, (byte) 55);
        setByteElement(term1812, 60, (byte) 56);
        setByteElement(term1812, 61, (byte) 57);
        setByteElement(term1812, 62, (byte) 43);
        setByteElement(term1812, 63, (byte) 47);
        setField(term1811, term1811.getClass(), "encodeTable", term1812);
        setIntField(term1811, term1811.getClass(), "lineLength", 287287233);
        setByteElement(term1878, 0, (byte) 13);
        setByteElement(term1878, 1, (byte) 10);
        setField(term1811, term1811.getClass(), "lineSeparator", term1878);
        setIntField(term1811, term1811.getClass(), "decodeSize", 3);
        setIntField(term1811, term1811.getClass(), "encodeSize", 4);
        setByteElement(term1883, 0, (byte) 96);
        setByteElement(term1883, 1, (byte) 51);
        setField(term1811, term1811.getClass(), "buffer", term1883);
        setIntField(term1811, term1811.getClass(), "pos", 962840079);
        setIntField(term1811, term1811.getClass(), "readPos", 1540719661);
        setIntField(term1811, term1811.getClass(), "currentLinePos", 1265463001);
        setIntField(term1811, term1811.getClass(), "modulus", 335112684);
        setBooleanField(term1811, term1811.getClass(), "eof", true);
        setIntField(term1811, term1811.getClass(), "x", 1551099402);
        term1892 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1892;
        try {
            callMethod(klass, "encode", argTypes, term1811, args);
            assertTrue(false);
        }
        catch (EncoderException e) {
        }

    }

};


