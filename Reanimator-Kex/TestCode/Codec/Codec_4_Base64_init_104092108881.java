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
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.binary.EqualityUtils.*;
import java.lang.Object;

public class Base64_init_104092108881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31653;

    public Base64_init_104092108881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15145 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term15145, term15145.getClass(), "lineLength", 0);
        setField(term15145, term15145.getClass(), "lineSeparator", null);
        setIntField(term15145, term15145.getClass(), "encodeSize", 0);
        setIntField(term15145, term15145.getClass(), "decodeSize", 0);
        term31653 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term31654 = (byte[]) newByteArray(64);
        byte[] term31655 = (byte[]) newByteArray(2);
        setByteElement(term31654, 0, (byte) 65);
        setByteElement(term31654, 1, (byte) 66);
        setByteElement(term31654, 2, (byte) 67);
        setByteElement(term31654, 3, (byte) 68);
        setByteElement(term31654, 4, (byte) 69);
        setByteElement(term31654, 5, (byte) 70);
        setByteElement(term31654, 6, (byte) 71);
        setByteElement(term31654, 7, (byte) 72);
        setByteElement(term31654, 8, (byte) 73);
        setByteElement(term31654, 9, (byte) 74);
        setByteElement(term31654, 10, (byte) 75);
        setByteElement(term31654, 11, (byte) 76);
        setByteElement(term31654, 12, (byte) 77);
        setByteElement(term31654, 13, (byte) 78);
        setByteElement(term31654, 14, (byte) 79);
        setByteElement(term31654, 15, (byte) 80);
        setByteElement(term31654, 16, (byte) 81);
        setByteElement(term31654, 17, (byte) 82);
        setByteElement(term31654, 18, (byte) 83);
        setByteElement(term31654, 19, (byte) 84);
        setByteElement(term31654, 20, (byte) 85);
        setByteElement(term31654, 21, (byte) 86);
        setByteElement(term31654, 22, (byte) 87);
        setByteElement(term31654, 23, (byte) 88);
        setByteElement(term31654, 24, (byte) 89);
        setByteElement(term31654, 25, (byte) 90);
        setByteElement(term31654, 26, (byte) 97);
        setByteElement(term31654, 27, (byte) 98);
        setByteElement(term31654, 28, (byte) 99);
        setByteElement(term31654, 29, (byte) 100);
        setByteElement(term31654, 30, (byte) 101);
        setByteElement(term31654, 31, (byte) 102);
        setByteElement(term31654, 32, (byte) 103);
        setByteElement(term31654, 33, (byte) 104);
        setByteElement(term31654, 34, (byte) 105);
        setByteElement(term31654, 35, (byte) 106);
        setByteElement(term31654, 36, (byte) 107);
        setByteElement(term31654, 37, (byte) 108);
        setByteElement(term31654, 38, (byte) 109);
        setByteElement(term31654, 39, (byte) 110);
        setByteElement(term31654, 40, (byte) 111);
        setByteElement(term31654, 41, (byte) 112);
        setByteElement(term31654, 42, (byte) 113);
        setByteElement(term31654, 43, (byte) 114);
        setByteElement(term31654, 44, (byte) 115);
        setByteElement(term31654, 45, (byte) 116);
        setByteElement(term31654, 46, (byte) 117);
        setByteElement(term31654, 47, (byte) 118);
        setByteElement(term31654, 48, (byte) 119);
        setByteElement(term31654, 49, (byte) 120);
        setByteElement(term31654, 50, (byte) 121);
        setByteElement(term31654, 51, (byte) 122);
        setByteElement(term31654, 52, (byte) 48);
        setByteElement(term31654, 53, (byte) 49);
        setByteElement(term31654, 54, (byte) 50);
        setByteElement(term31654, 55, (byte) 51);
        setByteElement(term31654, 56, (byte) 52);
        setByteElement(term31654, 57, (byte) 53);
        setByteElement(term31654, 58, (byte) 54);
        setByteElement(term31654, 59, (byte) 55);
        setByteElement(term31654, 60, (byte) 56);
        setByteElement(term31654, 61, (byte) 57);
        setByteElement(term31654, 62, (byte) 45);
        setByteElement(term31654, 63, (byte) 95);
        setField(term31653, term31653.getClass(), "encodeTable", term31654);
        setIntField(term31653, term31653.getClass(), "lineLength", 76);
        setByteElement(term31655, 0, (byte) 13);
        setByteElement(term31655, 1, (byte) 10);
        setField(term31653, term31653.getClass(), "lineSeparator", term31655);
        setIntField(term31653, term31653.getClass(), "decodeSize", 5);
        setIntField(term31653, term31653.getClass(), "encodeSize", 6);
        setField(term31653, term31653.getClass(), "buffer", null);
        setIntField(term31653, term31653.getClass(), "pos", 0);
        setIntField(term31653, term31653.getClass(), "readPos", 0);
        setIntField(term31653, term31653.getClass(), "currentLinePos", 0);
        setIntField(term31653, term31653.getClass(), "modulus", 0);
        setBooleanField(term31653, term31653.getClass(), "eof", false);
        setIntField(term31653, term31653.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term31653));
    }

};


