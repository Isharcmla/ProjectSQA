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

public class Base64_init_104092208094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34322;

    public Base64_init_104092208094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17986 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term17986, term17986.getClass(), "lineLength", 0);
        setField(term17986, term17986.getClass(), "lineSeparator", null);
        setIntField(term17986, term17986.getClass(), "encodeSize", 0);
        setIntField(term17986, term17986.getClass(), "decodeSize", 0);
        term34322 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term34323 = (byte[]) newByteArray(64);
        byte[] term34324 = (byte[]) newByteArray(2);
        setByteElement(term34323, 0, (byte) 65);
        setByteElement(term34323, 1, (byte) 66);
        setByteElement(term34323, 2, (byte) 67);
        setByteElement(term34323, 3, (byte) 68);
        setByteElement(term34323, 4, (byte) 69);
        setByteElement(term34323, 5, (byte) 70);
        setByteElement(term34323, 6, (byte) 71);
        setByteElement(term34323, 7, (byte) 72);
        setByteElement(term34323, 8, (byte) 73);
        setByteElement(term34323, 9, (byte) 74);
        setByteElement(term34323, 10, (byte) 75);
        setByteElement(term34323, 11, (byte) 76);
        setByteElement(term34323, 12, (byte) 77);
        setByteElement(term34323, 13, (byte) 78);
        setByteElement(term34323, 14, (byte) 79);
        setByteElement(term34323, 15, (byte) 80);
        setByteElement(term34323, 16, (byte) 81);
        setByteElement(term34323, 17, (byte) 82);
        setByteElement(term34323, 18, (byte) 83);
        setByteElement(term34323, 19, (byte) 84);
        setByteElement(term34323, 20, (byte) 85);
        setByteElement(term34323, 21, (byte) 86);
        setByteElement(term34323, 22, (byte) 87);
        setByteElement(term34323, 23, (byte) 88);
        setByteElement(term34323, 24, (byte) 89);
        setByteElement(term34323, 25, (byte) 90);
        setByteElement(term34323, 26, (byte) 97);
        setByteElement(term34323, 27, (byte) 98);
        setByteElement(term34323, 28, (byte) 99);
        setByteElement(term34323, 29, (byte) 100);
        setByteElement(term34323, 30, (byte) 101);
        setByteElement(term34323, 31, (byte) 102);
        setByteElement(term34323, 32, (byte) 103);
        setByteElement(term34323, 33, (byte) 104);
        setByteElement(term34323, 34, (byte) 105);
        setByteElement(term34323, 35, (byte) 106);
        setByteElement(term34323, 36, (byte) 107);
        setByteElement(term34323, 37, (byte) 108);
        setByteElement(term34323, 38, (byte) 109);
        setByteElement(term34323, 39, (byte) 110);
        setByteElement(term34323, 40, (byte) 111);
        setByteElement(term34323, 41, (byte) 112);
        setByteElement(term34323, 42, (byte) 113);
        setByteElement(term34323, 43, (byte) 114);
        setByteElement(term34323, 44, (byte) 115);
        setByteElement(term34323, 45, (byte) 116);
        setByteElement(term34323, 46, (byte) 117);
        setByteElement(term34323, 47, (byte) 118);
        setByteElement(term34323, 48, (byte) 119);
        setByteElement(term34323, 49, (byte) 120);
        setByteElement(term34323, 50, (byte) 121);
        setByteElement(term34323, 51, (byte) 122);
        setByteElement(term34323, 52, (byte) 48);
        setByteElement(term34323, 53, (byte) 49);
        setByteElement(term34323, 54, (byte) 50);
        setByteElement(term34323, 55, (byte) 51);
        setByteElement(term34323, 56, (byte) 52);
        setByteElement(term34323, 57, (byte) 53);
        setByteElement(term34323, 58, (byte) 54);
        setByteElement(term34323, 59, (byte) 55);
        setByteElement(term34323, 60, (byte) 56);
        setByteElement(term34323, 61, (byte) 57);
        setByteElement(term34323, 62, (byte) 43);
        setByteElement(term34323, 63, (byte) 47);
        setField(term34322, term34322.getClass(), "encodeTable", term34323);
        setIntField(term34322, term34322.getClass(), "lineLength", 0);
        setByteElement(term34324, 0, (byte) 13);
        setByteElement(term34324, 1, (byte) 10);
        setField(term34322, term34322.getClass(), "lineSeparator", term34324);
        setIntField(term34322, term34322.getClass(), "decodeSize", 5);
        setIntField(term34322, term34322.getClass(), "encodeSize", 6);
        setField(term34322, term34322.getClass(), "buffer", null);
        setIntField(term34322, term34322.getClass(), "pos", 0);
        setIntField(term34322, term34322.getClass(), "readPos", 0);
        setIntField(term34322, term34322.getClass(), "currentLinePos", 0);
        setIntField(term34322, term34322.getClass(), "modulus", 0);
        setBooleanField(term34322, term34322.getClass(), "eof", false);
        setIntField(term34322, term34322.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34322));
    }

};


