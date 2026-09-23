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

public class Base64_init_104098091898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21726;
     Object term34839;
     Object term34842;

    public Base64_init_104098091898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21839 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term21839, term21839.getClass(), "lineLength", 0);
        setField(term21839, term21839.getClass(), "lineSeparator", null);
        setIntField(term21839, term21839.getClass(), "encodeSize", 0);
        setIntField(term21839, term21839.getClass(), "decodeSize", 0);
        term21726 = (byte[]) newByteArray(0);
        term34839 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term34840 = (byte[]) newByteArray(64);
        byte[] term34841 = (byte[]) newByteArray(0);
        setByteElement(term34840, 0, (byte) 65);
        setByteElement(term34840, 1, (byte) 66);
        setByteElement(term34840, 2, (byte) 67);
        setByteElement(term34840, 3, (byte) 68);
        setByteElement(term34840, 4, (byte) 69);
        setByteElement(term34840, 5, (byte) 70);
        setByteElement(term34840, 6, (byte) 71);
        setByteElement(term34840, 7, (byte) 72);
        setByteElement(term34840, 8, (byte) 73);
        setByteElement(term34840, 9, (byte) 74);
        setByteElement(term34840, 10, (byte) 75);
        setByteElement(term34840, 11, (byte) 76);
        setByteElement(term34840, 12, (byte) 77);
        setByteElement(term34840, 13, (byte) 78);
        setByteElement(term34840, 14, (byte) 79);
        setByteElement(term34840, 15, (byte) 80);
        setByteElement(term34840, 16, (byte) 81);
        setByteElement(term34840, 17, (byte) 82);
        setByteElement(term34840, 18, (byte) 83);
        setByteElement(term34840, 19, (byte) 84);
        setByteElement(term34840, 20, (byte) 85);
        setByteElement(term34840, 21, (byte) 86);
        setByteElement(term34840, 22, (byte) 87);
        setByteElement(term34840, 23, (byte) 88);
        setByteElement(term34840, 24, (byte) 89);
        setByteElement(term34840, 25, (byte) 90);
        setByteElement(term34840, 26, (byte) 97);
        setByteElement(term34840, 27, (byte) 98);
        setByteElement(term34840, 28, (byte) 99);
        setByteElement(term34840, 29, (byte) 100);
        setByteElement(term34840, 30, (byte) 101);
        setByteElement(term34840, 31, (byte) 102);
        setByteElement(term34840, 32, (byte) 103);
        setByteElement(term34840, 33, (byte) 104);
        setByteElement(term34840, 34, (byte) 105);
        setByteElement(term34840, 35, (byte) 106);
        setByteElement(term34840, 36, (byte) 107);
        setByteElement(term34840, 37, (byte) 108);
        setByteElement(term34840, 38, (byte) 109);
        setByteElement(term34840, 39, (byte) 110);
        setByteElement(term34840, 40, (byte) 111);
        setByteElement(term34840, 41, (byte) 112);
        setByteElement(term34840, 42, (byte) 113);
        setByteElement(term34840, 43, (byte) 114);
        setByteElement(term34840, 44, (byte) 115);
        setByteElement(term34840, 45, (byte) 116);
        setByteElement(term34840, 46, (byte) 117);
        setByteElement(term34840, 47, (byte) 118);
        setByteElement(term34840, 48, (byte) 119);
        setByteElement(term34840, 49, (byte) 120);
        setByteElement(term34840, 50, (byte) 121);
        setByteElement(term34840, 51, (byte) 122);
        setByteElement(term34840, 52, (byte) 48);
        setByteElement(term34840, 53, (byte) 49);
        setByteElement(term34840, 54, (byte) 50);
        setByteElement(term34840, 55, (byte) 51);
        setByteElement(term34840, 56, (byte) 52);
        setByteElement(term34840, 57, (byte) 53);
        setByteElement(term34840, 58, (byte) 54);
        setByteElement(term34840, 59, (byte) 55);
        setByteElement(term34840, 60, (byte) 56);
        setByteElement(term34840, 61, (byte) 57);
        setByteElement(term34840, 62, (byte) 43);
        setByteElement(term34840, 63, (byte) 47);
        setField(term34839, term34839.getClass(), "encodeTable", term34840);
        setIntField(term34839, term34839.getClass(), "lineLength", 0);
        setField(term34839, term34839.getClass(), "lineSeparator", term34841);
        setIntField(term34839, term34839.getClass(), "decodeSize", 3);
        setIntField(term34839, term34839.getClass(), "encodeSize", 4);
        setField(term34839, term34839.getClass(), "buffer", null);
        setIntField(term34839, term34839.getClass(), "pos", 0);
        setIntField(term34839, term34839.getClass(), "readPos", 0);
        setIntField(term34839, term34839.getClass(), "currentLinePos", 0);
        setIntField(term34839, term34839.getClass(), "modulus", 0);
        setBooleanField(term34839, term34839.getClass(), "eof", false);
        setIntField(term34839, term34839.getClass(), "x", 0);
        term34842 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = 1;
        args[1] = term21726;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34839));
        assertTrue(recursiveEquals(term21726, term34842));
    }

};


