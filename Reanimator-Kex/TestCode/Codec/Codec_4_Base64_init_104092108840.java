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
import java.lang.Boolean;

public class Base64_init_104092108840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2913;

    public Base64_init_104092108840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        term2913 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term2914 = (byte[]) newByteArray(64);
        byte[] term2915 = (byte[]) newByteArray(2);
        setByteElement(term2914, 0, (byte) 65);
        setByteElement(term2914, 1, (byte) 66);
        setByteElement(term2914, 2, (byte) 67);
        setByteElement(term2914, 3, (byte) 68);
        setByteElement(term2914, 4, (byte) 69);
        setByteElement(term2914, 5, (byte) 70);
        setByteElement(term2914, 6, (byte) 71);
        setByteElement(term2914, 7, (byte) 72);
        setByteElement(term2914, 8, (byte) 73);
        setByteElement(term2914, 9, (byte) 74);
        setByteElement(term2914, 10, (byte) 75);
        setByteElement(term2914, 11, (byte) 76);
        setByteElement(term2914, 12, (byte) 77);
        setByteElement(term2914, 13, (byte) 78);
        setByteElement(term2914, 14, (byte) 79);
        setByteElement(term2914, 15, (byte) 80);
        setByteElement(term2914, 16, (byte) 81);
        setByteElement(term2914, 17, (byte) 82);
        setByteElement(term2914, 18, (byte) 83);
        setByteElement(term2914, 19, (byte) 84);
        setByteElement(term2914, 20, (byte) 85);
        setByteElement(term2914, 21, (byte) 86);
        setByteElement(term2914, 22, (byte) 87);
        setByteElement(term2914, 23, (byte) 88);
        setByteElement(term2914, 24, (byte) 89);
        setByteElement(term2914, 25, (byte) 90);
        setByteElement(term2914, 26, (byte) 97);
        setByteElement(term2914, 27, (byte) 98);
        setByteElement(term2914, 28, (byte) 99);
        setByteElement(term2914, 29, (byte) 100);
        setByteElement(term2914, 30, (byte) 101);
        setByteElement(term2914, 31, (byte) 102);
        setByteElement(term2914, 32, (byte) 103);
        setByteElement(term2914, 33, (byte) 104);
        setByteElement(term2914, 34, (byte) 105);
        setByteElement(term2914, 35, (byte) 106);
        setByteElement(term2914, 36, (byte) 107);
        setByteElement(term2914, 37, (byte) 108);
        setByteElement(term2914, 38, (byte) 109);
        setByteElement(term2914, 39, (byte) 110);
        setByteElement(term2914, 40, (byte) 111);
        setByteElement(term2914, 41, (byte) 112);
        setByteElement(term2914, 42, (byte) 113);
        setByteElement(term2914, 43, (byte) 114);
        setByteElement(term2914, 44, (byte) 115);
        setByteElement(term2914, 45, (byte) 116);
        setByteElement(term2914, 46, (byte) 117);
        setByteElement(term2914, 47, (byte) 118);
        setByteElement(term2914, 48, (byte) 119);
        setByteElement(term2914, 49, (byte) 120);
        setByteElement(term2914, 50, (byte) 121);
        setByteElement(term2914, 51, (byte) 122);
        setByteElement(term2914, 52, (byte) 48);
        setByteElement(term2914, 53, (byte) 49);
        setByteElement(term2914, 54, (byte) 50);
        setByteElement(term2914, 55, (byte) 51);
        setByteElement(term2914, 56, (byte) 52);
        setByteElement(term2914, 57, (byte) 53);
        setByteElement(term2914, 58, (byte) 54);
        setByteElement(term2914, 59, (byte) 55);
        setByteElement(term2914, 60, (byte) 56);
        setByteElement(term2914, 61, (byte) 57);
        setByteElement(term2914, 62, (byte) 43);
        setByteElement(term2914, 63, (byte) 47);
        setField(term2913, term2913.getClass(), "encodeTable", term2914);
        setIntField(term2913, term2913.getClass(), "lineLength", 76);
        setByteElement(term2915, 0, (byte) 13);
        setByteElement(term2915, 1, (byte) 10);
        setField(term2913, term2913.getClass(), "lineSeparator", term2915);
        setIntField(term2913, term2913.getClass(), "decodeSize", 5);
        setIntField(term2913, term2913.getClass(), "encodeSize", 6);
        setField(term2913, term2913.getClass(), "buffer", null);
        setIntField(term2913, term2913.getClass(), "pos", 0);
        setIntField(term2913, term2913.getClass(), "readPos", 0);
        setIntField(term2913, term2913.getClass(), "currentLinePos", 0);
        setIntField(term2913, term2913.getClass(), "modulus", 0);
        setBooleanField(term2913, term2913.getClass(), "eof", false);
        setIntField(term2913, term2913.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2913));
        assertTrue(recursiveEquals(term1, false));
    }

};


