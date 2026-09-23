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

public class Base64_init_1040921088106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98124;

    public Base64_init_1040921088106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21890 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term21890, term21890.getClass(), "lineLength", 0);
        setField(term21890, term21890.getClass(), "lineSeparator", null);
        setIntField(term21890, term21890.getClass(), "encodeSize", 0);
        setIntField(term21890, term21890.getClass(), "decodeSize", 0);
        term98124 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term98125 = (byte[]) newByteArray(64);
        byte[] term98126 = (byte[]) newByteArray(2);
        setByteElement(term98125, 0, (byte) 65);
        setByteElement(term98125, 1, (byte) 66);
        setByteElement(term98125, 2, (byte) 67);
        setByteElement(term98125, 3, (byte) 68);
        setByteElement(term98125, 4, (byte) 69);
        setByteElement(term98125, 5, (byte) 70);
        setByteElement(term98125, 6, (byte) 71);
        setByteElement(term98125, 7, (byte) 72);
        setByteElement(term98125, 8, (byte) 73);
        setByteElement(term98125, 9, (byte) 74);
        setByteElement(term98125, 10, (byte) 75);
        setByteElement(term98125, 11, (byte) 76);
        setByteElement(term98125, 12, (byte) 77);
        setByteElement(term98125, 13, (byte) 78);
        setByteElement(term98125, 14, (byte) 79);
        setByteElement(term98125, 15, (byte) 80);
        setByteElement(term98125, 16, (byte) 81);
        setByteElement(term98125, 17, (byte) 82);
        setByteElement(term98125, 18, (byte) 83);
        setByteElement(term98125, 19, (byte) 84);
        setByteElement(term98125, 20, (byte) 85);
        setByteElement(term98125, 21, (byte) 86);
        setByteElement(term98125, 22, (byte) 87);
        setByteElement(term98125, 23, (byte) 88);
        setByteElement(term98125, 24, (byte) 89);
        setByteElement(term98125, 25, (byte) 90);
        setByteElement(term98125, 26, (byte) 97);
        setByteElement(term98125, 27, (byte) 98);
        setByteElement(term98125, 28, (byte) 99);
        setByteElement(term98125, 29, (byte) 100);
        setByteElement(term98125, 30, (byte) 101);
        setByteElement(term98125, 31, (byte) 102);
        setByteElement(term98125, 32, (byte) 103);
        setByteElement(term98125, 33, (byte) 104);
        setByteElement(term98125, 34, (byte) 105);
        setByteElement(term98125, 35, (byte) 106);
        setByteElement(term98125, 36, (byte) 107);
        setByteElement(term98125, 37, (byte) 108);
        setByteElement(term98125, 38, (byte) 109);
        setByteElement(term98125, 39, (byte) 110);
        setByteElement(term98125, 40, (byte) 111);
        setByteElement(term98125, 41, (byte) 112);
        setByteElement(term98125, 42, (byte) 113);
        setByteElement(term98125, 43, (byte) 114);
        setByteElement(term98125, 44, (byte) 115);
        setByteElement(term98125, 45, (byte) 116);
        setByteElement(term98125, 46, (byte) 117);
        setByteElement(term98125, 47, (byte) 118);
        setByteElement(term98125, 48, (byte) 119);
        setByteElement(term98125, 49, (byte) 120);
        setByteElement(term98125, 50, (byte) 121);
        setByteElement(term98125, 51, (byte) 122);
        setByteElement(term98125, 52, (byte) 48);
        setByteElement(term98125, 53, (byte) 49);
        setByteElement(term98125, 54, (byte) 50);
        setByteElement(term98125, 55, (byte) 51);
        setByteElement(term98125, 56, (byte) 52);
        setByteElement(term98125, 57, (byte) 53);
        setByteElement(term98125, 58, (byte) 54);
        setByteElement(term98125, 59, (byte) 55);
        setByteElement(term98125, 60, (byte) 56);
        setByteElement(term98125, 61, (byte) 57);
        setByteElement(term98125, 62, (byte) 43);
        setByteElement(term98125, 63, (byte) 47);
        setField(term98124, term98124.getClass(), "encodeTable", term98125);
        setIntField(term98124, term98124.getClass(), "lineLength", 76);
        setByteElement(term98126, 0, (byte) 13);
        setByteElement(term98126, 1, (byte) 10);
        setField(term98124, term98124.getClass(), "lineSeparator", term98126);
        setIntField(term98124, term98124.getClass(), "decodeSize", 5);
        setIntField(term98124, term98124.getClass(), "encodeSize", 6);
        setField(term98124, term98124.getClass(), "buffer", null);
        setIntField(term98124, term98124.getClass(), "pos", 0);
        setIntField(term98124, term98124.getClass(), "readPos", 0);
        setIntField(term98124, term98124.getClass(), "currentLinePos", 0);
        setIntField(term98124, term98124.getClass(), "modulus", 0);
        setBooleanField(term98124, term98124.getClass(), "eof", false);
        setIntField(term98124, term98124.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term98124));
    }

};


