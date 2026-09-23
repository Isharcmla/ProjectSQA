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

public class Base64_init_104092208095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45242;

    public Base64_init_104092208095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17944 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term17944, term17944.getClass(), "lineLength", 0);
        setField(term17944, term17944.getClass(), "lineSeparator", null);
        setIntField(term17944, term17944.getClass(), "encodeSize", 0);
        setIntField(term17944, term17944.getClass(), "decodeSize", 0);
        term45242 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term45243 = (byte[]) newByteArray(64);
        byte[] term45244 = (byte[]) newByteArray(2);
        setByteElement(term45243, 0, (byte) 65);
        setByteElement(term45243, 1, (byte) 66);
        setByteElement(term45243, 2, (byte) 67);
        setByteElement(term45243, 3, (byte) 68);
        setByteElement(term45243, 4, (byte) 69);
        setByteElement(term45243, 5, (byte) 70);
        setByteElement(term45243, 6, (byte) 71);
        setByteElement(term45243, 7, (byte) 72);
        setByteElement(term45243, 8, (byte) 73);
        setByteElement(term45243, 9, (byte) 74);
        setByteElement(term45243, 10, (byte) 75);
        setByteElement(term45243, 11, (byte) 76);
        setByteElement(term45243, 12, (byte) 77);
        setByteElement(term45243, 13, (byte) 78);
        setByteElement(term45243, 14, (byte) 79);
        setByteElement(term45243, 15, (byte) 80);
        setByteElement(term45243, 16, (byte) 81);
        setByteElement(term45243, 17, (byte) 82);
        setByteElement(term45243, 18, (byte) 83);
        setByteElement(term45243, 19, (byte) 84);
        setByteElement(term45243, 20, (byte) 85);
        setByteElement(term45243, 21, (byte) 86);
        setByteElement(term45243, 22, (byte) 87);
        setByteElement(term45243, 23, (byte) 88);
        setByteElement(term45243, 24, (byte) 89);
        setByteElement(term45243, 25, (byte) 90);
        setByteElement(term45243, 26, (byte) 97);
        setByteElement(term45243, 27, (byte) 98);
        setByteElement(term45243, 28, (byte) 99);
        setByteElement(term45243, 29, (byte) 100);
        setByteElement(term45243, 30, (byte) 101);
        setByteElement(term45243, 31, (byte) 102);
        setByteElement(term45243, 32, (byte) 103);
        setByteElement(term45243, 33, (byte) 104);
        setByteElement(term45243, 34, (byte) 105);
        setByteElement(term45243, 35, (byte) 106);
        setByteElement(term45243, 36, (byte) 107);
        setByteElement(term45243, 37, (byte) 108);
        setByteElement(term45243, 38, (byte) 109);
        setByteElement(term45243, 39, (byte) 110);
        setByteElement(term45243, 40, (byte) 111);
        setByteElement(term45243, 41, (byte) 112);
        setByteElement(term45243, 42, (byte) 113);
        setByteElement(term45243, 43, (byte) 114);
        setByteElement(term45243, 44, (byte) 115);
        setByteElement(term45243, 45, (byte) 116);
        setByteElement(term45243, 46, (byte) 117);
        setByteElement(term45243, 47, (byte) 118);
        setByteElement(term45243, 48, (byte) 119);
        setByteElement(term45243, 49, (byte) 120);
        setByteElement(term45243, 50, (byte) 121);
        setByteElement(term45243, 51, (byte) 122);
        setByteElement(term45243, 52, (byte) 48);
        setByteElement(term45243, 53, (byte) 49);
        setByteElement(term45243, 54, (byte) 50);
        setByteElement(term45243, 55, (byte) 51);
        setByteElement(term45243, 56, (byte) 52);
        setByteElement(term45243, 57, (byte) 53);
        setByteElement(term45243, 58, (byte) 54);
        setByteElement(term45243, 59, (byte) 55);
        setByteElement(term45243, 60, (byte) 56);
        setByteElement(term45243, 61, (byte) 57);
        setByteElement(term45243, 62, (byte) 43);
        setByteElement(term45243, 63, (byte) 47);
        setField(term45242, term45242.getClass(), "encodeTable", term45243);
        setIntField(term45242, term45242.getClass(), "lineLength", 0);
        setByteElement(term45244, 0, (byte) 13);
        setByteElement(term45244, 1, (byte) 10);
        setField(term45242, term45242.getClass(), "lineSeparator", term45244);
        setIntField(term45242, term45242.getClass(), "decodeSize", 5);
        setIntField(term45242, term45242.getClass(), "encodeSize", 6);
        setField(term45242, term45242.getClass(), "buffer", null);
        setIntField(term45242, term45242.getClass(), "pos", 0);
        setIntField(term45242, term45242.getClass(), "readPos", 0);
        setIntField(term45242, term45242.getClass(), "currentLinePos", 0);
        setIntField(term45242, term45242.getClass(), "modulus", 0);
        setBooleanField(term45242, term45242.getClass(), "eof", false);
        setIntField(term45242, term45242.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45242));
    }

};


