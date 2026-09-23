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
     Object term45420;

    public Base64_init_104092108896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18065 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term18065, term18065.getClass(), "lineLength", 0);
        setField(term18065, term18065.getClass(), "lineSeparator", null);
        setIntField(term18065, term18065.getClass(), "encodeSize", 0);
        setIntField(term18065, term18065.getClass(), "decodeSize", 0);
        term45420 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term45421 = (byte[]) newByteArray(64);
        byte[] term45422 = (byte[]) newByteArray(2);
        setByteElement(term45421, 0, (byte) 65);
        setByteElement(term45421, 1, (byte) 66);
        setByteElement(term45421, 2, (byte) 67);
        setByteElement(term45421, 3, (byte) 68);
        setByteElement(term45421, 4, (byte) 69);
        setByteElement(term45421, 5, (byte) 70);
        setByteElement(term45421, 6, (byte) 71);
        setByteElement(term45421, 7, (byte) 72);
        setByteElement(term45421, 8, (byte) 73);
        setByteElement(term45421, 9, (byte) 74);
        setByteElement(term45421, 10, (byte) 75);
        setByteElement(term45421, 11, (byte) 76);
        setByteElement(term45421, 12, (byte) 77);
        setByteElement(term45421, 13, (byte) 78);
        setByteElement(term45421, 14, (byte) 79);
        setByteElement(term45421, 15, (byte) 80);
        setByteElement(term45421, 16, (byte) 81);
        setByteElement(term45421, 17, (byte) 82);
        setByteElement(term45421, 18, (byte) 83);
        setByteElement(term45421, 19, (byte) 84);
        setByteElement(term45421, 20, (byte) 85);
        setByteElement(term45421, 21, (byte) 86);
        setByteElement(term45421, 22, (byte) 87);
        setByteElement(term45421, 23, (byte) 88);
        setByteElement(term45421, 24, (byte) 89);
        setByteElement(term45421, 25, (byte) 90);
        setByteElement(term45421, 26, (byte) 97);
        setByteElement(term45421, 27, (byte) 98);
        setByteElement(term45421, 28, (byte) 99);
        setByteElement(term45421, 29, (byte) 100);
        setByteElement(term45421, 30, (byte) 101);
        setByteElement(term45421, 31, (byte) 102);
        setByteElement(term45421, 32, (byte) 103);
        setByteElement(term45421, 33, (byte) 104);
        setByteElement(term45421, 34, (byte) 105);
        setByteElement(term45421, 35, (byte) 106);
        setByteElement(term45421, 36, (byte) 107);
        setByteElement(term45421, 37, (byte) 108);
        setByteElement(term45421, 38, (byte) 109);
        setByteElement(term45421, 39, (byte) 110);
        setByteElement(term45421, 40, (byte) 111);
        setByteElement(term45421, 41, (byte) 112);
        setByteElement(term45421, 42, (byte) 113);
        setByteElement(term45421, 43, (byte) 114);
        setByteElement(term45421, 44, (byte) 115);
        setByteElement(term45421, 45, (byte) 116);
        setByteElement(term45421, 46, (byte) 117);
        setByteElement(term45421, 47, (byte) 118);
        setByteElement(term45421, 48, (byte) 119);
        setByteElement(term45421, 49, (byte) 120);
        setByteElement(term45421, 50, (byte) 121);
        setByteElement(term45421, 51, (byte) 122);
        setByteElement(term45421, 52, (byte) 48);
        setByteElement(term45421, 53, (byte) 49);
        setByteElement(term45421, 54, (byte) 50);
        setByteElement(term45421, 55, (byte) 51);
        setByteElement(term45421, 56, (byte) 52);
        setByteElement(term45421, 57, (byte) 53);
        setByteElement(term45421, 58, (byte) 54);
        setByteElement(term45421, 59, (byte) 55);
        setByteElement(term45421, 60, (byte) 56);
        setByteElement(term45421, 61, (byte) 57);
        setByteElement(term45421, 62, (byte) 43);
        setByteElement(term45421, 63, (byte) 47);
        setField(term45420, term45420.getClass(), "encodeTable", term45421);
        setIntField(term45420, term45420.getClass(), "lineLength", 76);
        setByteElement(term45422, 0, (byte) 13);
        setByteElement(term45422, 1, (byte) 10);
        setField(term45420, term45420.getClass(), "lineSeparator", term45422);
        setIntField(term45420, term45420.getClass(), "decodeSize", 5);
        setIntField(term45420, term45420.getClass(), "encodeSize", 6);
        setField(term45420, term45420.getClass(), "buffer", null);
        setIntField(term45420, term45420.getClass(), "pos", 0);
        setIntField(term45420, term45420.getClass(), "readPos", 0);
        setIntField(term45420, term45420.getClass(), "currentLinePos", 0);
        setIntField(term45420, term45420.getClass(), "modulus", 0);
        setBooleanField(term45420, term45420.getClass(), "eof", false);
        setIntField(term45420, term45420.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45420));
    }

};


