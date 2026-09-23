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

public class Base64_init_104280464893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15092;
     Object term45037;
     Object term45040;

    public Base64_init_104280464893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15264 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term15264, term15264.getClass(), "lineLength", 0);
        setField(term15264, term15264.getClass(), "lineSeparator", null);
        setIntField(term15264, term15264.getClass(), "encodeSize", 0);
        setIntField(term15264, term15264.getClass(), "decodeSize", 0);
        term15092 = (byte[]) newByteArray(4);
        setByteElement(term15092, 0, (byte) -128);
        setByteElement(term15092, 1, (byte) -128);
        setByteElement(term15092, 2, (byte) -128);
        setByteElement(term15092, 3, (byte) -128);
        term45037 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term45038 = (byte[]) newByteArray(64);
        byte[] term45039 = (byte[]) newByteArray(4);
        setByteElement(term45038, 0, (byte) 65);
        setByteElement(term45038, 1, (byte) 66);
        setByteElement(term45038, 2, (byte) 67);
        setByteElement(term45038, 3, (byte) 68);
        setByteElement(term45038, 4, (byte) 69);
        setByteElement(term45038, 5, (byte) 70);
        setByteElement(term45038, 6, (byte) 71);
        setByteElement(term45038, 7, (byte) 72);
        setByteElement(term45038, 8, (byte) 73);
        setByteElement(term45038, 9, (byte) 74);
        setByteElement(term45038, 10, (byte) 75);
        setByteElement(term45038, 11, (byte) 76);
        setByteElement(term45038, 12, (byte) 77);
        setByteElement(term45038, 13, (byte) 78);
        setByteElement(term45038, 14, (byte) 79);
        setByteElement(term45038, 15, (byte) 80);
        setByteElement(term45038, 16, (byte) 81);
        setByteElement(term45038, 17, (byte) 82);
        setByteElement(term45038, 18, (byte) 83);
        setByteElement(term45038, 19, (byte) 84);
        setByteElement(term45038, 20, (byte) 85);
        setByteElement(term45038, 21, (byte) 86);
        setByteElement(term45038, 22, (byte) 87);
        setByteElement(term45038, 23, (byte) 88);
        setByteElement(term45038, 24, (byte) 89);
        setByteElement(term45038, 25, (byte) 90);
        setByteElement(term45038, 26, (byte) 97);
        setByteElement(term45038, 27, (byte) 98);
        setByteElement(term45038, 28, (byte) 99);
        setByteElement(term45038, 29, (byte) 100);
        setByteElement(term45038, 30, (byte) 101);
        setByteElement(term45038, 31, (byte) 102);
        setByteElement(term45038, 32, (byte) 103);
        setByteElement(term45038, 33, (byte) 104);
        setByteElement(term45038, 34, (byte) 105);
        setByteElement(term45038, 35, (byte) 106);
        setByteElement(term45038, 36, (byte) 107);
        setByteElement(term45038, 37, (byte) 108);
        setByteElement(term45038, 38, (byte) 109);
        setByteElement(term45038, 39, (byte) 110);
        setByteElement(term45038, 40, (byte) 111);
        setByteElement(term45038, 41, (byte) 112);
        setByteElement(term45038, 42, (byte) 113);
        setByteElement(term45038, 43, (byte) 114);
        setByteElement(term45038, 44, (byte) 115);
        setByteElement(term45038, 45, (byte) 116);
        setByteElement(term45038, 46, (byte) 117);
        setByteElement(term45038, 47, (byte) 118);
        setByteElement(term45038, 48, (byte) 119);
        setByteElement(term45038, 49, (byte) 120);
        setByteElement(term45038, 50, (byte) 121);
        setByteElement(term45038, 51, (byte) 122);
        setByteElement(term45038, 52, (byte) 48);
        setByteElement(term45038, 53, (byte) 49);
        setByteElement(term45038, 54, (byte) 50);
        setByteElement(term45038, 55, (byte) 51);
        setByteElement(term45038, 56, (byte) 52);
        setByteElement(term45038, 57, (byte) 53);
        setByteElement(term45038, 58, (byte) 54);
        setByteElement(term45038, 59, (byte) 55);
        setByteElement(term45038, 60, (byte) 56);
        setByteElement(term45038, 61, (byte) 57);
        setByteElement(term45038, 62, (byte) 45);
        setByteElement(term45038, 63, (byte) 95);
        setField(term45037, term45037.getClass(), "encodeTable", term45038);
        setIntField(term45037, term45037.getClass(), "lineLength", 0);
        setByteElement(term45039, 0, (byte) -128);
        setByteElement(term45039, 1, (byte) -128);
        setByteElement(term45039, 2, (byte) -128);
        setByteElement(term45039, 3, (byte) -128);
        setField(term45037, term45037.getClass(), "lineSeparator", term45039);
        setIntField(term45037, term45037.getClass(), "decodeSize", 7);
        setIntField(term45037, term45037.getClass(), "encodeSize", 8);
        setField(term45037, term45037.getClass(), "buffer", null);
        setIntField(term45037, term45037.getClass(), "pos", 0);
        setIntField(term45037, term45037.getClass(), "readPos", 0);
        setIntField(term45037, term45037.getClass(), "currentLinePos", 0);
        setIntField(term45037, term45037.getClass(), "modulus", 0);
        setBooleanField(term45037, term45037.getClass(), "eof", false);
        setIntField(term45037, term45037.getClass(), "x", 0);
        term45040 = (byte[]) newByteArray(4);
        setByteElement(term45040, 0, (byte) -128);
        setByteElement(term45040, 1, (byte) -128);
        setByteElement(term45040, 2, (byte) -128);
        setByteElement(term45040, 3, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = 1;
        args[1] = term15092;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45037));
        assertTrue(recursiveEquals(term15092, term45040));
    }

};


