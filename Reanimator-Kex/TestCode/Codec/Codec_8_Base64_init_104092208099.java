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

public class Base64_init_104092208099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35016;

    public Base64_init_104092208099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21946 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        term35016 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term35017 = (byte[]) newByteArray(64);
        byte[] term35018 = (byte[]) newByteArray(2);
        setByteElement(term35017, 0, (byte) 65);
        setByteElement(term35017, 1, (byte) 66);
        setByteElement(term35017, 2, (byte) 67);
        setByteElement(term35017, 3, (byte) 68);
        setByteElement(term35017, 4, (byte) 69);
        setByteElement(term35017, 5, (byte) 70);
        setByteElement(term35017, 6, (byte) 71);
        setByteElement(term35017, 7, (byte) 72);
        setByteElement(term35017, 8, (byte) 73);
        setByteElement(term35017, 9, (byte) 74);
        setByteElement(term35017, 10, (byte) 75);
        setByteElement(term35017, 11, (byte) 76);
        setByteElement(term35017, 12, (byte) 77);
        setByteElement(term35017, 13, (byte) 78);
        setByteElement(term35017, 14, (byte) 79);
        setByteElement(term35017, 15, (byte) 80);
        setByteElement(term35017, 16, (byte) 81);
        setByteElement(term35017, 17, (byte) 82);
        setByteElement(term35017, 18, (byte) 83);
        setByteElement(term35017, 19, (byte) 84);
        setByteElement(term35017, 20, (byte) 85);
        setByteElement(term35017, 21, (byte) 86);
        setByteElement(term35017, 22, (byte) 87);
        setByteElement(term35017, 23, (byte) 88);
        setByteElement(term35017, 24, (byte) 89);
        setByteElement(term35017, 25, (byte) 90);
        setByteElement(term35017, 26, (byte) 97);
        setByteElement(term35017, 27, (byte) 98);
        setByteElement(term35017, 28, (byte) 99);
        setByteElement(term35017, 29, (byte) 100);
        setByteElement(term35017, 30, (byte) 101);
        setByteElement(term35017, 31, (byte) 102);
        setByteElement(term35017, 32, (byte) 103);
        setByteElement(term35017, 33, (byte) 104);
        setByteElement(term35017, 34, (byte) 105);
        setByteElement(term35017, 35, (byte) 106);
        setByteElement(term35017, 36, (byte) 107);
        setByteElement(term35017, 37, (byte) 108);
        setByteElement(term35017, 38, (byte) 109);
        setByteElement(term35017, 39, (byte) 110);
        setByteElement(term35017, 40, (byte) 111);
        setByteElement(term35017, 41, (byte) 112);
        setByteElement(term35017, 42, (byte) 113);
        setByteElement(term35017, 43, (byte) 114);
        setByteElement(term35017, 44, (byte) 115);
        setByteElement(term35017, 45, (byte) 116);
        setByteElement(term35017, 46, (byte) 117);
        setByteElement(term35017, 47, (byte) 118);
        setByteElement(term35017, 48, (byte) 119);
        setByteElement(term35017, 49, (byte) 120);
        setByteElement(term35017, 50, (byte) 121);
        setByteElement(term35017, 51, (byte) 122);
        setByteElement(term35017, 52, (byte) 48);
        setByteElement(term35017, 53, (byte) 49);
        setByteElement(term35017, 54, (byte) 50);
        setByteElement(term35017, 55, (byte) 51);
        setByteElement(term35017, 56, (byte) 52);
        setByteElement(term35017, 57, (byte) 53);
        setByteElement(term35017, 58, (byte) 54);
        setByteElement(term35017, 59, (byte) 55);
        setByteElement(term35017, 60, (byte) 56);
        setByteElement(term35017, 61, (byte) 57);
        setByteElement(term35017, 62, (byte) 43);
        setByteElement(term35017, 63, (byte) 47);
        setField(term35016, term35016.getClass(), "encodeTable", term35017);
        setIntField(term35016, term35016.getClass(), "lineLength", 0);
        setByteElement(term35018, 0, (byte) 13);
        setByteElement(term35018, 1, (byte) 10);
        setField(term35016, term35016.getClass(), "lineSeparator", term35018);
        setIntField(term35016, term35016.getClass(), "decodeSize", 3);
        setIntField(term35016, term35016.getClass(), "encodeSize", 4);
        setField(term35016, term35016.getClass(), "buffer", null);
        setIntField(term35016, term35016.getClass(), "pos", 0);
        setIntField(term35016, term35016.getClass(), "readPos", 0);
        setIntField(term35016, term35016.getClass(), "currentLinePos", 0);
        setIntField(term35016, term35016.getClass(), "modulus", 0);
        setBooleanField(term35016, term35016.getClass(), "eof", false);
        setIntField(term35016, term35016.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term35016));
    }

};


