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

public class Base64_init_104280464887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33867;
     Object term34117;
     Object term34120;

    public Base64_init_104280464887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term34009 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term34009, term34009.getClass(), "lineLength", 0);
        setField(term34009, term34009.getClass(), "lineSeparator", null);
        setIntField(term34009, term34009.getClass(), "encodeSize", 0);
        setIntField(term34009, term34009.getClass(), "decodeSize", 0);
        term33867 = (byte[]) newByteArray(2);
        setByteElement(term33867, 0, (byte) -128);
        setByteElement(term33867, 1, (byte) -128);
        term34117 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term34118 = (byte[]) newByteArray(64);
        byte[] term34119 = (byte[]) newByteArray(2);
        setByteElement(term34118, 0, (byte) 65);
        setByteElement(term34118, 1, (byte) 66);
        setByteElement(term34118, 2, (byte) 67);
        setByteElement(term34118, 3, (byte) 68);
        setByteElement(term34118, 4, (byte) 69);
        setByteElement(term34118, 5, (byte) 70);
        setByteElement(term34118, 6, (byte) 71);
        setByteElement(term34118, 7, (byte) 72);
        setByteElement(term34118, 8, (byte) 73);
        setByteElement(term34118, 9, (byte) 74);
        setByteElement(term34118, 10, (byte) 75);
        setByteElement(term34118, 11, (byte) 76);
        setByteElement(term34118, 12, (byte) 77);
        setByteElement(term34118, 13, (byte) 78);
        setByteElement(term34118, 14, (byte) 79);
        setByteElement(term34118, 15, (byte) 80);
        setByteElement(term34118, 16, (byte) 81);
        setByteElement(term34118, 17, (byte) 82);
        setByteElement(term34118, 18, (byte) 83);
        setByteElement(term34118, 19, (byte) 84);
        setByteElement(term34118, 20, (byte) 85);
        setByteElement(term34118, 21, (byte) 86);
        setByteElement(term34118, 22, (byte) 87);
        setByteElement(term34118, 23, (byte) 88);
        setByteElement(term34118, 24, (byte) 89);
        setByteElement(term34118, 25, (byte) 90);
        setByteElement(term34118, 26, (byte) 97);
        setByteElement(term34118, 27, (byte) 98);
        setByteElement(term34118, 28, (byte) 99);
        setByteElement(term34118, 29, (byte) 100);
        setByteElement(term34118, 30, (byte) 101);
        setByteElement(term34118, 31, (byte) 102);
        setByteElement(term34118, 32, (byte) 103);
        setByteElement(term34118, 33, (byte) 104);
        setByteElement(term34118, 34, (byte) 105);
        setByteElement(term34118, 35, (byte) 106);
        setByteElement(term34118, 36, (byte) 107);
        setByteElement(term34118, 37, (byte) 108);
        setByteElement(term34118, 38, (byte) 109);
        setByteElement(term34118, 39, (byte) 110);
        setByteElement(term34118, 40, (byte) 111);
        setByteElement(term34118, 41, (byte) 112);
        setByteElement(term34118, 42, (byte) 113);
        setByteElement(term34118, 43, (byte) 114);
        setByteElement(term34118, 44, (byte) 115);
        setByteElement(term34118, 45, (byte) 116);
        setByteElement(term34118, 46, (byte) 117);
        setByteElement(term34118, 47, (byte) 118);
        setByteElement(term34118, 48, (byte) 119);
        setByteElement(term34118, 49, (byte) 120);
        setByteElement(term34118, 50, (byte) 121);
        setByteElement(term34118, 51, (byte) 122);
        setByteElement(term34118, 52, (byte) 48);
        setByteElement(term34118, 53, (byte) 49);
        setByteElement(term34118, 54, (byte) 50);
        setByteElement(term34118, 55, (byte) 51);
        setByteElement(term34118, 56, (byte) 52);
        setByteElement(term34118, 57, (byte) 53);
        setByteElement(term34118, 58, (byte) 54);
        setByteElement(term34118, 59, (byte) 55);
        setByteElement(term34118, 60, (byte) 56);
        setByteElement(term34118, 61, (byte) 57);
        setByteElement(term34118, 62, (byte) 43);
        setByteElement(term34118, 63, (byte) 47);
        setField(term34117, term34117.getClass(), "encodeTable", term34118);
        setIntField(term34117, term34117.getClass(), "lineLength", 0);
        setByteElement(term34119, 0, (byte) -128);
        setByteElement(term34119, 1, (byte) -128);
        setField(term34117, term34117.getClass(), "lineSeparator", term34119);
        setIntField(term34117, term34117.getClass(), "decodeSize", 5);
        setIntField(term34117, term34117.getClass(), "encodeSize", 6);
        setField(term34117, term34117.getClass(), "buffer", null);
        setIntField(term34117, term34117.getClass(), "pos", 0);
        setIntField(term34117, term34117.getClass(), "readPos", 0);
        setIntField(term34117, term34117.getClass(), "currentLinePos", 0);
        setIntField(term34117, term34117.getClass(), "modulus", 0);
        setBooleanField(term34117, term34117.getClass(), "eof", false);
        setIntField(term34117, term34117.getClass(), "x", 0);
        term34120 = (byte[]) newByteArray(2);
        setByteElement(term34120, 0, (byte) -128);
        setByteElement(term34120, 1, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = 1;
        args[1] = term33867;
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34117));
        assertTrue(recursiveEquals(term33867, term34120));
    }

};


