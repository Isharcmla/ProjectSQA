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
     Object term2912;

    public Base64_init_104092108840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        term2912 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term2913 = (byte[]) newByteArray(64);
        byte[] term2914 = (byte[]) newByteArray(2);
        setByteElement(term2913, 0, (byte) 65);
        setByteElement(term2913, 1, (byte) 66);
        setByteElement(term2913, 2, (byte) 67);
        setByteElement(term2913, 3, (byte) 68);
        setByteElement(term2913, 4, (byte) 69);
        setByteElement(term2913, 5, (byte) 70);
        setByteElement(term2913, 6, (byte) 71);
        setByteElement(term2913, 7, (byte) 72);
        setByteElement(term2913, 8, (byte) 73);
        setByteElement(term2913, 9, (byte) 74);
        setByteElement(term2913, 10, (byte) 75);
        setByteElement(term2913, 11, (byte) 76);
        setByteElement(term2913, 12, (byte) 77);
        setByteElement(term2913, 13, (byte) 78);
        setByteElement(term2913, 14, (byte) 79);
        setByteElement(term2913, 15, (byte) 80);
        setByteElement(term2913, 16, (byte) 81);
        setByteElement(term2913, 17, (byte) 82);
        setByteElement(term2913, 18, (byte) 83);
        setByteElement(term2913, 19, (byte) 84);
        setByteElement(term2913, 20, (byte) 85);
        setByteElement(term2913, 21, (byte) 86);
        setByteElement(term2913, 22, (byte) 87);
        setByteElement(term2913, 23, (byte) 88);
        setByteElement(term2913, 24, (byte) 89);
        setByteElement(term2913, 25, (byte) 90);
        setByteElement(term2913, 26, (byte) 97);
        setByteElement(term2913, 27, (byte) 98);
        setByteElement(term2913, 28, (byte) 99);
        setByteElement(term2913, 29, (byte) 100);
        setByteElement(term2913, 30, (byte) 101);
        setByteElement(term2913, 31, (byte) 102);
        setByteElement(term2913, 32, (byte) 103);
        setByteElement(term2913, 33, (byte) 104);
        setByteElement(term2913, 34, (byte) 105);
        setByteElement(term2913, 35, (byte) 106);
        setByteElement(term2913, 36, (byte) 107);
        setByteElement(term2913, 37, (byte) 108);
        setByteElement(term2913, 38, (byte) 109);
        setByteElement(term2913, 39, (byte) 110);
        setByteElement(term2913, 40, (byte) 111);
        setByteElement(term2913, 41, (byte) 112);
        setByteElement(term2913, 42, (byte) 113);
        setByteElement(term2913, 43, (byte) 114);
        setByteElement(term2913, 44, (byte) 115);
        setByteElement(term2913, 45, (byte) 116);
        setByteElement(term2913, 46, (byte) 117);
        setByteElement(term2913, 47, (byte) 118);
        setByteElement(term2913, 48, (byte) 119);
        setByteElement(term2913, 49, (byte) 120);
        setByteElement(term2913, 50, (byte) 121);
        setByteElement(term2913, 51, (byte) 122);
        setByteElement(term2913, 52, (byte) 48);
        setByteElement(term2913, 53, (byte) 49);
        setByteElement(term2913, 54, (byte) 50);
        setByteElement(term2913, 55, (byte) 51);
        setByteElement(term2913, 56, (byte) 52);
        setByteElement(term2913, 57, (byte) 53);
        setByteElement(term2913, 58, (byte) 54);
        setByteElement(term2913, 59, (byte) 55);
        setByteElement(term2913, 60, (byte) 56);
        setByteElement(term2913, 61, (byte) 57);
        setByteElement(term2913, 62, (byte) 43);
        setByteElement(term2913, 63, (byte) 47);
        setField(term2912, term2912.getClass(), "encodeTable", term2913);
        setIntField(term2912, term2912.getClass(), "lineLength", 76);
        setByteElement(term2914, 0, (byte) 13);
        setByteElement(term2914, 1, (byte) 10);
        setField(term2912, term2912.getClass(), "lineSeparator", term2914);
        setIntField(term2912, term2912.getClass(), "decodeSize", 5);
        setIntField(term2912, term2912.getClass(), "encodeSize", 6);
        setField(term2912, term2912.getClass(), "buffer", null);
        setIntField(term2912, term2912.getClass(), "pos", 0);
        setIntField(term2912, term2912.getClass(), "readPos", 0);
        setIntField(term2912, term2912.getClass(), "currentLinePos", 0);
        setIntField(term2912, term2912.getClass(), "modulus", 0);
        setBooleanField(term2912, term2912.getClass(), "eof", false);
        setIntField(term2912, term2912.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2912));
        assertTrue(recursiveEquals(term1, false));
    }

};


