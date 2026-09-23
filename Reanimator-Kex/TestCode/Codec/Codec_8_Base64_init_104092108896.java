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

public class Base64_init_104092108896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34505;

    public Base64_init_104092108896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19123 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term19123, term19123.getClass(), "lineLength", 0);
        setField(term19123, term19123.getClass(), "lineSeparator", null);
        setIntField(term19123, term19123.getClass(), "encodeSize", 0);
        setIntField(term19123, term19123.getClass(), "decodeSize", 0);
        term34505 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term34506 = (byte[]) newByteArray(64);
        byte[] term34507 = (byte[]) newByteArray(2);
        setByteElement(term34506, 0, (byte) 65);
        setByteElement(term34506, 1, (byte) 66);
        setByteElement(term34506, 2, (byte) 67);
        setByteElement(term34506, 3, (byte) 68);
        setByteElement(term34506, 4, (byte) 69);
        setByteElement(term34506, 5, (byte) 70);
        setByteElement(term34506, 6, (byte) 71);
        setByteElement(term34506, 7, (byte) 72);
        setByteElement(term34506, 8, (byte) 73);
        setByteElement(term34506, 9, (byte) 74);
        setByteElement(term34506, 10, (byte) 75);
        setByteElement(term34506, 11, (byte) 76);
        setByteElement(term34506, 12, (byte) 77);
        setByteElement(term34506, 13, (byte) 78);
        setByteElement(term34506, 14, (byte) 79);
        setByteElement(term34506, 15, (byte) 80);
        setByteElement(term34506, 16, (byte) 81);
        setByteElement(term34506, 17, (byte) 82);
        setByteElement(term34506, 18, (byte) 83);
        setByteElement(term34506, 19, (byte) 84);
        setByteElement(term34506, 20, (byte) 85);
        setByteElement(term34506, 21, (byte) 86);
        setByteElement(term34506, 22, (byte) 87);
        setByteElement(term34506, 23, (byte) 88);
        setByteElement(term34506, 24, (byte) 89);
        setByteElement(term34506, 25, (byte) 90);
        setByteElement(term34506, 26, (byte) 97);
        setByteElement(term34506, 27, (byte) 98);
        setByteElement(term34506, 28, (byte) 99);
        setByteElement(term34506, 29, (byte) 100);
        setByteElement(term34506, 30, (byte) 101);
        setByteElement(term34506, 31, (byte) 102);
        setByteElement(term34506, 32, (byte) 103);
        setByteElement(term34506, 33, (byte) 104);
        setByteElement(term34506, 34, (byte) 105);
        setByteElement(term34506, 35, (byte) 106);
        setByteElement(term34506, 36, (byte) 107);
        setByteElement(term34506, 37, (byte) 108);
        setByteElement(term34506, 38, (byte) 109);
        setByteElement(term34506, 39, (byte) 110);
        setByteElement(term34506, 40, (byte) 111);
        setByteElement(term34506, 41, (byte) 112);
        setByteElement(term34506, 42, (byte) 113);
        setByteElement(term34506, 43, (byte) 114);
        setByteElement(term34506, 44, (byte) 115);
        setByteElement(term34506, 45, (byte) 116);
        setByteElement(term34506, 46, (byte) 117);
        setByteElement(term34506, 47, (byte) 118);
        setByteElement(term34506, 48, (byte) 119);
        setByteElement(term34506, 49, (byte) 120);
        setByteElement(term34506, 50, (byte) 121);
        setByteElement(term34506, 51, (byte) 122);
        setByteElement(term34506, 52, (byte) 48);
        setByteElement(term34506, 53, (byte) 49);
        setByteElement(term34506, 54, (byte) 50);
        setByteElement(term34506, 55, (byte) 51);
        setByteElement(term34506, 56, (byte) 52);
        setByteElement(term34506, 57, (byte) 53);
        setByteElement(term34506, 58, (byte) 54);
        setByteElement(term34506, 59, (byte) 55);
        setByteElement(term34506, 60, (byte) 56);
        setByteElement(term34506, 61, (byte) 57);
        setByteElement(term34506, 62, (byte) 43);
        setByteElement(term34506, 63, (byte) 47);
        setField(term34505, term34505.getClass(), "encodeTable", term34506);
        setIntField(term34505, term34505.getClass(), "lineLength", 76);
        setByteElement(term34507, 0, (byte) 13);
        setByteElement(term34507, 1, (byte) 10);
        setField(term34505, term34505.getClass(), "lineSeparator", term34507);
        setIntField(term34505, term34505.getClass(), "decodeSize", 5);
        setIntField(term34505, term34505.getClass(), "encodeSize", 6);
        setField(term34505, term34505.getClass(), "buffer", null);
        setIntField(term34505, term34505.getClass(), "pos", 0);
        setIntField(term34505, term34505.getClass(), "readPos", 0);
        setIntField(term34505, term34505.getClass(), "currentLinePos", 0);
        setIntField(term34505, term34505.getClass(), "modulus", 0);
        setBooleanField(term34505, term34505.getClass(), "eof", false);
        setIntField(term34505, term34505.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34505));
    }

};


