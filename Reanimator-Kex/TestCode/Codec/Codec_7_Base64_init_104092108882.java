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

public class Base64_init_104092108882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23176;

    public Base64_init_104092108882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16935 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term16935, term16935.getClass(), "lineLength", 0);
        setField(term16935, term16935.getClass(), "lineSeparator", null);
        setIntField(term16935, term16935.getClass(), "encodeSize", 0);
        setIntField(term16935, term16935.getClass(), "decodeSize", 0);
        term23176 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term23177 = (byte[]) newByteArray(64);
        byte[] term23178 = (byte[]) newByteArray(2);
        setByteElement(term23177, 0, (byte) 65);
        setByteElement(term23177, 1, (byte) 66);
        setByteElement(term23177, 2, (byte) 67);
        setByteElement(term23177, 3, (byte) 68);
        setByteElement(term23177, 4, (byte) 69);
        setByteElement(term23177, 5, (byte) 70);
        setByteElement(term23177, 6, (byte) 71);
        setByteElement(term23177, 7, (byte) 72);
        setByteElement(term23177, 8, (byte) 73);
        setByteElement(term23177, 9, (byte) 74);
        setByteElement(term23177, 10, (byte) 75);
        setByteElement(term23177, 11, (byte) 76);
        setByteElement(term23177, 12, (byte) 77);
        setByteElement(term23177, 13, (byte) 78);
        setByteElement(term23177, 14, (byte) 79);
        setByteElement(term23177, 15, (byte) 80);
        setByteElement(term23177, 16, (byte) 81);
        setByteElement(term23177, 17, (byte) 82);
        setByteElement(term23177, 18, (byte) 83);
        setByteElement(term23177, 19, (byte) 84);
        setByteElement(term23177, 20, (byte) 85);
        setByteElement(term23177, 21, (byte) 86);
        setByteElement(term23177, 22, (byte) 87);
        setByteElement(term23177, 23, (byte) 88);
        setByteElement(term23177, 24, (byte) 89);
        setByteElement(term23177, 25, (byte) 90);
        setByteElement(term23177, 26, (byte) 97);
        setByteElement(term23177, 27, (byte) 98);
        setByteElement(term23177, 28, (byte) 99);
        setByteElement(term23177, 29, (byte) 100);
        setByteElement(term23177, 30, (byte) 101);
        setByteElement(term23177, 31, (byte) 102);
        setByteElement(term23177, 32, (byte) 103);
        setByteElement(term23177, 33, (byte) 104);
        setByteElement(term23177, 34, (byte) 105);
        setByteElement(term23177, 35, (byte) 106);
        setByteElement(term23177, 36, (byte) 107);
        setByteElement(term23177, 37, (byte) 108);
        setByteElement(term23177, 38, (byte) 109);
        setByteElement(term23177, 39, (byte) 110);
        setByteElement(term23177, 40, (byte) 111);
        setByteElement(term23177, 41, (byte) 112);
        setByteElement(term23177, 42, (byte) 113);
        setByteElement(term23177, 43, (byte) 114);
        setByteElement(term23177, 44, (byte) 115);
        setByteElement(term23177, 45, (byte) 116);
        setByteElement(term23177, 46, (byte) 117);
        setByteElement(term23177, 47, (byte) 118);
        setByteElement(term23177, 48, (byte) 119);
        setByteElement(term23177, 49, (byte) 120);
        setByteElement(term23177, 50, (byte) 121);
        setByteElement(term23177, 51, (byte) 122);
        setByteElement(term23177, 52, (byte) 48);
        setByteElement(term23177, 53, (byte) 49);
        setByteElement(term23177, 54, (byte) 50);
        setByteElement(term23177, 55, (byte) 51);
        setByteElement(term23177, 56, (byte) 52);
        setByteElement(term23177, 57, (byte) 53);
        setByteElement(term23177, 58, (byte) 54);
        setByteElement(term23177, 59, (byte) 55);
        setByteElement(term23177, 60, (byte) 56);
        setByteElement(term23177, 61, (byte) 57);
        setByteElement(term23177, 62, (byte) 43);
        setByteElement(term23177, 63, (byte) 47);
        setField(term23176, term23176.getClass(), "encodeTable", term23177);
        setIntField(term23176, term23176.getClass(), "lineLength", 76);
        setByteElement(term23178, 0, (byte) 13);
        setByteElement(term23178, 1, (byte) 10);
        setField(term23176, term23176.getClass(), "lineSeparator", term23178);
        setIntField(term23176, term23176.getClass(), "decodeSize", 5);
        setIntField(term23176, term23176.getClass(), "encodeSize", 6);
        setField(term23176, term23176.getClass(), "buffer", null);
        setIntField(term23176, term23176.getClass(), "pos", 0);
        setIntField(term23176, term23176.getClass(), "readPos", 0);
        setIntField(term23176, term23176.getClass(), "currentLinePos", 0);
        setIntField(term23176, term23176.getClass(), "modulus", 0);
        setBooleanField(term23176, term23176.getClass(), "eof", false);
        setIntField(term23176, term23176.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term23176));
    }

};


