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

public class Base64_init_104092208083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23354;

    public Base64_init_104092208083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18641 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term18641, term18641.getClass(), "lineLength", 0);
        setField(term18641, term18641.getClass(), "lineSeparator", null);
        setIntField(term18641, term18641.getClass(), "encodeSize", 0);
        setIntField(term18641, term18641.getClass(), "decodeSize", 0);
        term23354 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term23355 = (byte[]) newByteArray(64);
        byte[] term23356 = (byte[]) newByteArray(2);
        setByteElement(term23355, 0, (byte) 65);
        setByteElement(term23355, 1, (byte) 66);
        setByteElement(term23355, 2, (byte) 67);
        setByteElement(term23355, 3, (byte) 68);
        setByteElement(term23355, 4, (byte) 69);
        setByteElement(term23355, 5, (byte) 70);
        setByteElement(term23355, 6, (byte) 71);
        setByteElement(term23355, 7, (byte) 72);
        setByteElement(term23355, 8, (byte) 73);
        setByteElement(term23355, 9, (byte) 74);
        setByteElement(term23355, 10, (byte) 75);
        setByteElement(term23355, 11, (byte) 76);
        setByteElement(term23355, 12, (byte) 77);
        setByteElement(term23355, 13, (byte) 78);
        setByteElement(term23355, 14, (byte) 79);
        setByteElement(term23355, 15, (byte) 80);
        setByteElement(term23355, 16, (byte) 81);
        setByteElement(term23355, 17, (byte) 82);
        setByteElement(term23355, 18, (byte) 83);
        setByteElement(term23355, 19, (byte) 84);
        setByteElement(term23355, 20, (byte) 85);
        setByteElement(term23355, 21, (byte) 86);
        setByteElement(term23355, 22, (byte) 87);
        setByteElement(term23355, 23, (byte) 88);
        setByteElement(term23355, 24, (byte) 89);
        setByteElement(term23355, 25, (byte) 90);
        setByteElement(term23355, 26, (byte) 97);
        setByteElement(term23355, 27, (byte) 98);
        setByteElement(term23355, 28, (byte) 99);
        setByteElement(term23355, 29, (byte) 100);
        setByteElement(term23355, 30, (byte) 101);
        setByteElement(term23355, 31, (byte) 102);
        setByteElement(term23355, 32, (byte) 103);
        setByteElement(term23355, 33, (byte) 104);
        setByteElement(term23355, 34, (byte) 105);
        setByteElement(term23355, 35, (byte) 106);
        setByteElement(term23355, 36, (byte) 107);
        setByteElement(term23355, 37, (byte) 108);
        setByteElement(term23355, 38, (byte) 109);
        setByteElement(term23355, 39, (byte) 110);
        setByteElement(term23355, 40, (byte) 111);
        setByteElement(term23355, 41, (byte) 112);
        setByteElement(term23355, 42, (byte) 113);
        setByteElement(term23355, 43, (byte) 114);
        setByteElement(term23355, 44, (byte) 115);
        setByteElement(term23355, 45, (byte) 116);
        setByteElement(term23355, 46, (byte) 117);
        setByteElement(term23355, 47, (byte) 118);
        setByteElement(term23355, 48, (byte) 119);
        setByteElement(term23355, 49, (byte) 120);
        setByteElement(term23355, 50, (byte) 121);
        setByteElement(term23355, 51, (byte) 122);
        setByteElement(term23355, 52, (byte) 48);
        setByteElement(term23355, 53, (byte) 49);
        setByteElement(term23355, 54, (byte) 50);
        setByteElement(term23355, 55, (byte) 51);
        setByteElement(term23355, 56, (byte) 52);
        setByteElement(term23355, 57, (byte) 53);
        setByteElement(term23355, 58, (byte) 54);
        setByteElement(term23355, 59, (byte) 55);
        setByteElement(term23355, 60, (byte) 56);
        setByteElement(term23355, 61, (byte) 57);
        setByteElement(term23355, 62, (byte) 43);
        setByteElement(term23355, 63, (byte) 47);
        setField(term23354, term23354.getClass(), "encodeTable", term23355);
        setIntField(term23354, term23354.getClass(), "lineLength", 0);
        setByteElement(term23356, 0, (byte) 13);
        setByteElement(term23356, 1, (byte) 10);
        setField(term23354, term23354.getClass(), "lineSeparator", term23356);
        setIntField(term23354, term23354.getClass(), "decodeSize", 5);
        setIntField(term23354, term23354.getClass(), "encodeSize", 6);
        setField(term23354, term23354.getClass(), "buffer", null);
        setIntField(term23354, term23354.getClass(), "pos", 0);
        setIntField(term23354, term23354.getClass(), "readPos", 0);
        setIntField(term23354, term23354.getClass(), "currentLinePos", 0);
        setIntField(term23354, term23354.getClass(), "modulus", 0);
        setBooleanField(term23354, term23354.getClass(), "eof", false);
        setIntField(term23354, term23354.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term23354));
    }

};


