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
import java.lang.Integer;

public class Base64_init_104092208034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term2530;

    public Base64_init_104092208034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = new Integer(568599855);
        term2530 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term2531 = (byte[]) newByteArray(64);
        byte[] term2532 = (byte[]) newByteArray(2);
        setByteElement(term2531, 0, (byte) 65);
        setByteElement(term2531, 1, (byte) 66);
        setByteElement(term2531, 2, (byte) 67);
        setByteElement(term2531, 3, (byte) 68);
        setByteElement(term2531, 4, (byte) 69);
        setByteElement(term2531, 5, (byte) 70);
        setByteElement(term2531, 6, (byte) 71);
        setByteElement(term2531, 7, (byte) 72);
        setByteElement(term2531, 8, (byte) 73);
        setByteElement(term2531, 9, (byte) 74);
        setByteElement(term2531, 10, (byte) 75);
        setByteElement(term2531, 11, (byte) 76);
        setByteElement(term2531, 12, (byte) 77);
        setByteElement(term2531, 13, (byte) 78);
        setByteElement(term2531, 14, (byte) 79);
        setByteElement(term2531, 15, (byte) 80);
        setByteElement(term2531, 16, (byte) 81);
        setByteElement(term2531, 17, (byte) 82);
        setByteElement(term2531, 18, (byte) 83);
        setByteElement(term2531, 19, (byte) 84);
        setByteElement(term2531, 20, (byte) 85);
        setByteElement(term2531, 21, (byte) 86);
        setByteElement(term2531, 22, (byte) 87);
        setByteElement(term2531, 23, (byte) 88);
        setByteElement(term2531, 24, (byte) 89);
        setByteElement(term2531, 25, (byte) 90);
        setByteElement(term2531, 26, (byte) 97);
        setByteElement(term2531, 27, (byte) 98);
        setByteElement(term2531, 28, (byte) 99);
        setByteElement(term2531, 29, (byte) 100);
        setByteElement(term2531, 30, (byte) 101);
        setByteElement(term2531, 31, (byte) 102);
        setByteElement(term2531, 32, (byte) 103);
        setByteElement(term2531, 33, (byte) 104);
        setByteElement(term2531, 34, (byte) 105);
        setByteElement(term2531, 35, (byte) 106);
        setByteElement(term2531, 36, (byte) 107);
        setByteElement(term2531, 37, (byte) 108);
        setByteElement(term2531, 38, (byte) 109);
        setByteElement(term2531, 39, (byte) 110);
        setByteElement(term2531, 40, (byte) 111);
        setByteElement(term2531, 41, (byte) 112);
        setByteElement(term2531, 42, (byte) 113);
        setByteElement(term2531, 43, (byte) 114);
        setByteElement(term2531, 44, (byte) 115);
        setByteElement(term2531, 45, (byte) 116);
        setByteElement(term2531, 46, (byte) 117);
        setByteElement(term2531, 47, (byte) 118);
        setByteElement(term2531, 48, (byte) 119);
        setByteElement(term2531, 49, (byte) 120);
        setByteElement(term2531, 50, (byte) 121);
        setByteElement(term2531, 51, (byte) 122);
        setByteElement(term2531, 52, (byte) 48);
        setByteElement(term2531, 53, (byte) 49);
        setByteElement(term2531, 54, (byte) 50);
        setByteElement(term2531, 55, (byte) 51);
        setByteElement(term2531, 56, (byte) 52);
        setByteElement(term2531, 57, (byte) 53);
        setByteElement(term2531, 58, (byte) 54);
        setByteElement(term2531, 59, (byte) 55);
        setByteElement(term2531, 60, (byte) 56);
        setByteElement(term2531, 61, (byte) 57);
        setByteElement(term2531, 62, (byte) 43);
        setByteElement(term2531, 63, (byte) 47);
        setField(term2530, term2530.getClass(), "encodeTable", term2531);
        setIntField(term2530, term2530.getClass(), "lineLength", 568599855);
        setByteElement(term2532, 0, (byte) 13);
        setByteElement(term2532, 1, (byte) 10);
        setField(term2530, term2530.getClass(), "lineSeparator", term2532);
        setIntField(term2530, term2530.getClass(), "decodeSize", 5);
        setIntField(term2530, term2530.getClass(), "encodeSize", 6);
        setField(term2530, term2530.getClass(), "buf", null);
        setIntField(term2530, term2530.getClass(), "pos", 0);
        setIntField(term2530, term2530.getClass(), "readPos", 0);
        setIntField(term2530, term2530.getClass(), "currentLinePos", 0);
        setIntField(term2530, term2530.getClass(), "modulus", 0);
        setBooleanField(term2530, term2530.getClass(), "eof", false);
        setIntField(term2530, term2530.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2530));
        assertTrue(recursiveEquals(term3, 568599855));
    }

};


