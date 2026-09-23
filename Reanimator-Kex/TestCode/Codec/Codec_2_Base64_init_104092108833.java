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

public class Base64_init_104092108833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2357;

    public Base64_init_104092108833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        term2357 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term2358 = (byte[]) newByteArray(64);
        byte[] term2359 = (byte[]) newByteArray(2);
        setByteElement(term2358, 0, (byte) 65);
        setByteElement(term2358, 1, (byte) 66);
        setByteElement(term2358, 2, (byte) 67);
        setByteElement(term2358, 3, (byte) 68);
        setByteElement(term2358, 4, (byte) 69);
        setByteElement(term2358, 5, (byte) 70);
        setByteElement(term2358, 6, (byte) 71);
        setByteElement(term2358, 7, (byte) 72);
        setByteElement(term2358, 8, (byte) 73);
        setByteElement(term2358, 9, (byte) 74);
        setByteElement(term2358, 10, (byte) 75);
        setByteElement(term2358, 11, (byte) 76);
        setByteElement(term2358, 12, (byte) 77);
        setByteElement(term2358, 13, (byte) 78);
        setByteElement(term2358, 14, (byte) 79);
        setByteElement(term2358, 15, (byte) 80);
        setByteElement(term2358, 16, (byte) 81);
        setByteElement(term2358, 17, (byte) 82);
        setByteElement(term2358, 18, (byte) 83);
        setByteElement(term2358, 19, (byte) 84);
        setByteElement(term2358, 20, (byte) 85);
        setByteElement(term2358, 21, (byte) 86);
        setByteElement(term2358, 22, (byte) 87);
        setByteElement(term2358, 23, (byte) 88);
        setByteElement(term2358, 24, (byte) 89);
        setByteElement(term2358, 25, (byte) 90);
        setByteElement(term2358, 26, (byte) 97);
        setByteElement(term2358, 27, (byte) 98);
        setByteElement(term2358, 28, (byte) 99);
        setByteElement(term2358, 29, (byte) 100);
        setByteElement(term2358, 30, (byte) 101);
        setByteElement(term2358, 31, (byte) 102);
        setByteElement(term2358, 32, (byte) 103);
        setByteElement(term2358, 33, (byte) 104);
        setByteElement(term2358, 34, (byte) 105);
        setByteElement(term2358, 35, (byte) 106);
        setByteElement(term2358, 36, (byte) 107);
        setByteElement(term2358, 37, (byte) 108);
        setByteElement(term2358, 38, (byte) 109);
        setByteElement(term2358, 39, (byte) 110);
        setByteElement(term2358, 40, (byte) 111);
        setByteElement(term2358, 41, (byte) 112);
        setByteElement(term2358, 42, (byte) 113);
        setByteElement(term2358, 43, (byte) 114);
        setByteElement(term2358, 44, (byte) 115);
        setByteElement(term2358, 45, (byte) 116);
        setByteElement(term2358, 46, (byte) 117);
        setByteElement(term2358, 47, (byte) 118);
        setByteElement(term2358, 48, (byte) 119);
        setByteElement(term2358, 49, (byte) 120);
        setByteElement(term2358, 50, (byte) 121);
        setByteElement(term2358, 51, (byte) 122);
        setByteElement(term2358, 52, (byte) 48);
        setByteElement(term2358, 53, (byte) 49);
        setByteElement(term2358, 54, (byte) 50);
        setByteElement(term2358, 55, (byte) 51);
        setByteElement(term2358, 56, (byte) 52);
        setByteElement(term2358, 57, (byte) 53);
        setByteElement(term2358, 58, (byte) 54);
        setByteElement(term2358, 59, (byte) 55);
        setByteElement(term2358, 60, (byte) 56);
        setByteElement(term2358, 61, (byte) 57);
        setByteElement(term2358, 62, (byte) 43);
        setByteElement(term2358, 63, (byte) 47);
        setField(term2357, term2357.getClass(), "encodeTable", term2358);
        setIntField(term2357, term2357.getClass(), "lineLength", 76);
        setByteElement(term2359, 0, (byte) 13);
        setByteElement(term2359, 1, (byte) 10);
        setField(term2357, term2357.getClass(), "lineSeparator", term2359);
        setIntField(term2357, term2357.getClass(), "decodeSize", 5);
        setIntField(term2357, term2357.getClass(), "encodeSize", 6);
        setField(term2357, term2357.getClass(), "buf", null);
        setIntField(term2357, term2357.getClass(), "pos", 0);
        setIntField(term2357, term2357.getClass(), "readPos", 0);
        setIntField(term2357, term2357.getClass(), "currentLinePos", 0);
        setIntField(term2357, term2357.getClass(), "modulus", 0);
        setBooleanField(term2357, term2357.getClass(), "eof", false);
        setIntField(term2357, term2357.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2357));
        assertTrue(recursiveEquals(term1, false));
    }

};


