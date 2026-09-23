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

public class Base64_init_104092208089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36237;

    public Base64_init_104092208089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term36127 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term36127, term36127.getClass(), "lineLength", 0);
        setField(term36127, term36127.getClass(), "lineSeparator", null);
        setIntField(term36127, term36127.getClass(), "encodeSize", 0);
        setIntField(term36127, term36127.getClass(), "decodeSize", 0);
        term36237 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term36238 = (byte[]) newByteArray(64);
        byte[] term36239 = (byte[]) newByteArray(2);
        setByteElement(term36238, 0, (byte) 65);
        setByteElement(term36238, 1, (byte) 66);
        setByteElement(term36238, 2, (byte) 67);
        setByteElement(term36238, 3, (byte) 68);
        setByteElement(term36238, 4, (byte) 69);
        setByteElement(term36238, 5, (byte) 70);
        setByteElement(term36238, 6, (byte) 71);
        setByteElement(term36238, 7, (byte) 72);
        setByteElement(term36238, 8, (byte) 73);
        setByteElement(term36238, 9, (byte) 74);
        setByteElement(term36238, 10, (byte) 75);
        setByteElement(term36238, 11, (byte) 76);
        setByteElement(term36238, 12, (byte) 77);
        setByteElement(term36238, 13, (byte) 78);
        setByteElement(term36238, 14, (byte) 79);
        setByteElement(term36238, 15, (byte) 80);
        setByteElement(term36238, 16, (byte) 81);
        setByteElement(term36238, 17, (byte) 82);
        setByteElement(term36238, 18, (byte) 83);
        setByteElement(term36238, 19, (byte) 84);
        setByteElement(term36238, 20, (byte) 85);
        setByteElement(term36238, 21, (byte) 86);
        setByteElement(term36238, 22, (byte) 87);
        setByteElement(term36238, 23, (byte) 88);
        setByteElement(term36238, 24, (byte) 89);
        setByteElement(term36238, 25, (byte) 90);
        setByteElement(term36238, 26, (byte) 97);
        setByteElement(term36238, 27, (byte) 98);
        setByteElement(term36238, 28, (byte) 99);
        setByteElement(term36238, 29, (byte) 100);
        setByteElement(term36238, 30, (byte) 101);
        setByteElement(term36238, 31, (byte) 102);
        setByteElement(term36238, 32, (byte) 103);
        setByteElement(term36238, 33, (byte) 104);
        setByteElement(term36238, 34, (byte) 105);
        setByteElement(term36238, 35, (byte) 106);
        setByteElement(term36238, 36, (byte) 107);
        setByteElement(term36238, 37, (byte) 108);
        setByteElement(term36238, 38, (byte) 109);
        setByteElement(term36238, 39, (byte) 110);
        setByteElement(term36238, 40, (byte) 111);
        setByteElement(term36238, 41, (byte) 112);
        setByteElement(term36238, 42, (byte) 113);
        setByteElement(term36238, 43, (byte) 114);
        setByteElement(term36238, 44, (byte) 115);
        setByteElement(term36238, 45, (byte) 116);
        setByteElement(term36238, 46, (byte) 117);
        setByteElement(term36238, 47, (byte) 118);
        setByteElement(term36238, 48, (byte) 119);
        setByteElement(term36238, 49, (byte) 120);
        setByteElement(term36238, 50, (byte) 121);
        setByteElement(term36238, 51, (byte) 122);
        setByteElement(term36238, 52, (byte) 48);
        setByteElement(term36238, 53, (byte) 49);
        setByteElement(term36238, 54, (byte) 50);
        setByteElement(term36238, 55, (byte) 51);
        setByteElement(term36238, 56, (byte) 52);
        setByteElement(term36238, 57, (byte) 53);
        setByteElement(term36238, 58, (byte) 54);
        setByteElement(term36238, 59, (byte) 55);
        setByteElement(term36238, 60, (byte) 56);
        setByteElement(term36238, 61, (byte) 57);
        setByteElement(term36238, 62, (byte) 43);
        setByteElement(term36238, 63, (byte) 47);
        setField(term36237, term36237.getClass(), "encodeTable", term36238);
        setIntField(term36237, term36237.getClass(), "lineLength", 0);
        setByteElement(term36239, 0, (byte) 13);
        setByteElement(term36239, 1, (byte) 10);
        setField(term36237, term36237.getClass(), "lineSeparator", term36239);
        setIntField(term36237, term36237.getClass(), "decodeSize", 5);
        setIntField(term36237, term36237.getClass(), "encodeSize", 6);
        setField(term36237, term36237.getClass(), "buffer", null);
        setIntField(term36237, term36237.getClass(), "pos", 0);
        setIntField(term36237, term36237.getClass(), "readPos", 0);
        setIntField(term36237, term36237.getClass(), "currentLinePos", 0);
        setIntField(term36237, term36237.getClass(), "modulus", 0);
        setBooleanField(term36237, term36237.getClass(), "eof", false);
        setIntField(term36237, term36237.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term36237));
    }

};


