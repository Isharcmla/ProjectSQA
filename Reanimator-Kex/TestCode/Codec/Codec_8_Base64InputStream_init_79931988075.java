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

public class Base64InputStream_init_79931988075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1975937;
     Object term1641147;
     Object term1987824;
     Object term1987830;
     Object term1987831;

    public Base64InputStream_init_79931988075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1975825 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term1975877 = newInstance(Class.forName("java.io.FileInputStream"));
        setField(term1975825, term1975825.getClass(), "in", term1975877);
        setField(term1975825, term1975825.getClass(), "singleByte", null);
        setBooleanField(term1975825, term1975825.getClass(), "doEncode", false);
        term1975937 = newInstance(Class.forName("java.io.PushbackInputStream"));
        term1641147 = (byte[]) newByteArray(511);
        setByteElement(term1641147, 334, (byte) -128);
        term1987824 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term1987825 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term1987826 = (byte[]) newByteArray(64);
        byte[] term1987827 = (byte[]) newByteArray(511);
        byte[] term1987828 = (byte[]) newByteArray(1);
        Object term1987829 = newInstance(Class.forName("java.io.PushbackInputStream"));
        setBooleanField(term1987824, term1987824.getClass(), "doEncode", true);
        setByteElement(term1987826, 0, (byte) 65);
        setByteElement(term1987826, 1, (byte) 66);
        setByteElement(term1987826, 2, (byte) 67);
        setByteElement(term1987826, 3, (byte) 68);
        setByteElement(term1987826, 4, (byte) 69);
        setByteElement(term1987826, 5, (byte) 70);
        setByteElement(term1987826, 6, (byte) 71);
        setByteElement(term1987826, 7, (byte) 72);
        setByteElement(term1987826, 8, (byte) 73);
        setByteElement(term1987826, 9, (byte) 74);
        setByteElement(term1987826, 10, (byte) 75);
        setByteElement(term1987826, 11, (byte) 76);
        setByteElement(term1987826, 12, (byte) 77);
        setByteElement(term1987826, 13, (byte) 78);
        setByteElement(term1987826, 14, (byte) 79);
        setByteElement(term1987826, 15, (byte) 80);
        setByteElement(term1987826, 16, (byte) 81);
        setByteElement(term1987826, 17, (byte) 82);
        setByteElement(term1987826, 18, (byte) 83);
        setByteElement(term1987826, 19, (byte) 84);
        setByteElement(term1987826, 20, (byte) 85);
        setByteElement(term1987826, 21, (byte) 86);
        setByteElement(term1987826, 22, (byte) 87);
        setByteElement(term1987826, 23, (byte) 88);
        setByteElement(term1987826, 24, (byte) 89);
        setByteElement(term1987826, 25, (byte) 90);
        setByteElement(term1987826, 26, (byte) 97);
        setByteElement(term1987826, 27, (byte) 98);
        setByteElement(term1987826, 28, (byte) 99);
        setByteElement(term1987826, 29, (byte) 100);
        setByteElement(term1987826, 30, (byte) 101);
        setByteElement(term1987826, 31, (byte) 102);
        setByteElement(term1987826, 32, (byte) 103);
        setByteElement(term1987826, 33, (byte) 104);
        setByteElement(term1987826, 34, (byte) 105);
        setByteElement(term1987826, 35, (byte) 106);
        setByteElement(term1987826, 36, (byte) 107);
        setByteElement(term1987826, 37, (byte) 108);
        setByteElement(term1987826, 38, (byte) 109);
        setByteElement(term1987826, 39, (byte) 110);
        setByteElement(term1987826, 40, (byte) 111);
        setByteElement(term1987826, 41, (byte) 112);
        setByteElement(term1987826, 42, (byte) 113);
        setByteElement(term1987826, 43, (byte) 114);
        setByteElement(term1987826, 44, (byte) 115);
        setByteElement(term1987826, 45, (byte) 116);
        setByteElement(term1987826, 46, (byte) 117);
        setByteElement(term1987826, 47, (byte) 118);
        setByteElement(term1987826, 48, (byte) 119);
        setByteElement(term1987826, 49, (byte) 120);
        setByteElement(term1987826, 50, (byte) 121);
        setByteElement(term1987826, 51, (byte) 122);
        setByteElement(term1987826, 52, (byte) 48);
        setByteElement(term1987826, 53, (byte) 49);
        setByteElement(term1987826, 54, (byte) 50);
        setByteElement(term1987826, 55, (byte) 51);
        setByteElement(term1987826, 56, (byte) 52);
        setByteElement(term1987826, 57, (byte) 53);
        setByteElement(term1987826, 58, (byte) 54);
        setByteElement(term1987826, 59, (byte) 55);
        setByteElement(term1987826, 60, (byte) 56);
        setByteElement(term1987826, 61, (byte) 57);
        setByteElement(term1987826, 62, (byte) 43);
        setByteElement(term1987826, 63, (byte) 47);
        setField(term1987825, term1987825.getClass(), "encodeTable", term1987826);
        setIntField(term1987825, term1987825.getClass(), "lineLength", 0);
        setByteElement(term1987827, 334, (byte) -128);
        setField(term1987825, term1987825.getClass(), "lineSeparator", term1987827);
        setIntField(term1987825, term1987825.getClass(), "decodeSize", 3);
        setIntField(term1987825, term1987825.getClass(), "encodeSize", 4);
        setField(term1987825, term1987825.getClass(), "buffer", null);
        setIntField(term1987825, term1987825.getClass(), "pos", 0);
        setIntField(term1987825, term1987825.getClass(), "readPos", 0);
        setIntField(term1987825, term1987825.getClass(), "currentLinePos", 0);
        setIntField(term1987825, term1987825.getClass(), "modulus", 0);
        setBooleanField(term1987825, term1987825.getClass(), "eof", false);
        setIntField(term1987825, term1987825.getClass(), "x", 0);
        setField(term1987824, term1987824.getClass(), "base64", term1987825);
        setField(term1987824, term1987824.getClass(), "singleByte", term1987828);
        setField(term1987829, term1987829.getClass(), "buf", null);
        setIntField(term1987829, term1987829.getClass(), "pos", 0);
        setField(term1987829, term1987829.getClass(), "in", null);
        setField(term1987824, term1987824.getClass(), "in", term1987829);
        term1987830 = (byte[]) newByteArray(511);
        setByteElement(term1987830, 334, (byte) -128);
        term1987831 = newInstance(Class.forName("java.io.PushbackInputStream"));
        setField(term1987831, term1987831.getClass(), "buf", null);
        setIntField(term1987831, term1987831.getClass(), "pos", 0);
        setField(term1987831, term1987831.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = term1975937;
        args[1] = true;
        args[2] = 0;
        args[3] = term1641147;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1987824));
        assertTrue(recursiveEquals(term1975937, 0));
        assertTrue(recursiveEquals(term1641147, true));
    }

};


