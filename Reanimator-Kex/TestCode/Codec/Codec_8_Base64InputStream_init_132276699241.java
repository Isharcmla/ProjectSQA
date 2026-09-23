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

public class Base64InputStream_init_132276699241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23015;
     Object term31929;
     Object term31935;

    public Base64InputStream_init_132276699241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22895 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term22943 = newInstance(Class.forName("java.io.InputStream$1"));
        setField(term22895, term22895.getClass(), "in", term22943);
        setField(term22895, term22895.getClass(), "singleByte", null);
        setBooleanField(term22895, term22895.getClass(), "doEncode", false);
        term23015 = newInstance(Class.forName("java.util.zip.DeflaterInputStream"));
        term31929 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term31930 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term31931 = (byte[]) newByteArray(64);
        byte[] term31932 = (byte[]) newByteArray(2);
        byte[] term31933 = (byte[]) newByteArray(1);
        Object term31934 = newInstance(Class.forName("java.util.zip.DeflaterInputStream"));
        setBooleanField(term31929, term31929.getClass(), "doEncode", true);
        setByteElement(term31931, 0, (byte) 65);
        setByteElement(term31931, 1, (byte) 66);
        setByteElement(term31931, 2, (byte) 67);
        setByteElement(term31931, 3, (byte) 68);
        setByteElement(term31931, 4, (byte) 69);
        setByteElement(term31931, 5, (byte) 70);
        setByteElement(term31931, 6, (byte) 71);
        setByteElement(term31931, 7, (byte) 72);
        setByteElement(term31931, 8, (byte) 73);
        setByteElement(term31931, 9, (byte) 74);
        setByteElement(term31931, 10, (byte) 75);
        setByteElement(term31931, 11, (byte) 76);
        setByteElement(term31931, 12, (byte) 77);
        setByteElement(term31931, 13, (byte) 78);
        setByteElement(term31931, 14, (byte) 79);
        setByteElement(term31931, 15, (byte) 80);
        setByteElement(term31931, 16, (byte) 81);
        setByteElement(term31931, 17, (byte) 82);
        setByteElement(term31931, 18, (byte) 83);
        setByteElement(term31931, 19, (byte) 84);
        setByteElement(term31931, 20, (byte) 85);
        setByteElement(term31931, 21, (byte) 86);
        setByteElement(term31931, 22, (byte) 87);
        setByteElement(term31931, 23, (byte) 88);
        setByteElement(term31931, 24, (byte) 89);
        setByteElement(term31931, 25, (byte) 90);
        setByteElement(term31931, 26, (byte) 97);
        setByteElement(term31931, 27, (byte) 98);
        setByteElement(term31931, 28, (byte) 99);
        setByteElement(term31931, 29, (byte) 100);
        setByteElement(term31931, 30, (byte) 101);
        setByteElement(term31931, 31, (byte) 102);
        setByteElement(term31931, 32, (byte) 103);
        setByteElement(term31931, 33, (byte) 104);
        setByteElement(term31931, 34, (byte) 105);
        setByteElement(term31931, 35, (byte) 106);
        setByteElement(term31931, 36, (byte) 107);
        setByteElement(term31931, 37, (byte) 108);
        setByteElement(term31931, 38, (byte) 109);
        setByteElement(term31931, 39, (byte) 110);
        setByteElement(term31931, 40, (byte) 111);
        setByteElement(term31931, 41, (byte) 112);
        setByteElement(term31931, 42, (byte) 113);
        setByteElement(term31931, 43, (byte) 114);
        setByteElement(term31931, 44, (byte) 115);
        setByteElement(term31931, 45, (byte) 116);
        setByteElement(term31931, 46, (byte) 117);
        setByteElement(term31931, 47, (byte) 118);
        setByteElement(term31931, 48, (byte) 119);
        setByteElement(term31931, 49, (byte) 120);
        setByteElement(term31931, 50, (byte) 121);
        setByteElement(term31931, 51, (byte) 122);
        setByteElement(term31931, 52, (byte) 48);
        setByteElement(term31931, 53, (byte) 49);
        setByteElement(term31931, 54, (byte) 50);
        setByteElement(term31931, 55, (byte) 51);
        setByteElement(term31931, 56, (byte) 52);
        setByteElement(term31931, 57, (byte) 53);
        setByteElement(term31931, 58, (byte) 54);
        setByteElement(term31931, 59, (byte) 55);
        setByteElement(term31931, 60, (byte) 56);
        setByteElement(term31931, 61, (byte) 57);
        setByteElement(term31931, 62, (byte) 43);
        setByteElement(term31931, 63, (byte) 47);
        setField(term31930, term31930.getClass(), "encodeTable", term31931);
        setIntField(term31930, term31930.getClass(), "lineLength", 76);
        setByteElement(term31932, 0, (byte) 13);
        setByteElement(term31932, 1, (byte) 10);
        setField(term31930, term31930.getClass(), "lineSeparator", term31932);
        setIntField(term31930, term31930.getClass(), "decodeSize", 5);
        setIntField(term31930, term31930.getClass(), "encodeSize", 6);
        setField(term31930, term31930.getClass(), "buffer", null);
        setIntField(term31930, term31930.getClass(), "pos", 0);
        setIntField(term31930, term31930.getClass(), "readPos", 0);
        setIntField(term31930, term31930.getClass(), "currentLinePos", 0);
        setIntField(term31930, term31930.getClass(), "modulus", 0);
        setBooleanField(term31930, term31930.getClass(), "eof", false);
        setIntField(term31930, term31930.getClass(), "x", 0);
        setField(term31929, term31929.getClass(), "base64", term31930);
        setField(term31929, term31929.getClass(), "singleByte", term31933);
        setField(term31934, term31934.getClass(), "def", null);
        setField(term31934, term31934.getClass(), "buf", null);
        setField(term31934, term31934.getClass(), "rbuf", null);
        setBooleanField(term31934, term31934.getClass(), "usesDefaultDeflater", false);
        setBooleanField(term31934, term31934.getClass(), "reachEOF", false);
        setField(term31934, term31934.getClass(), "in", null);
        setField(term31929, term31929.getClass(), "in", term31934);
        term31935 = newInstance(Class.forName("java.util.zip.DeflaterInputStream"));
        setField(term31935, term31935.getClass(), "def", null);
        setField(term31935, term31935.getClass(), "buf", null);
        setField(term31935, term31935.getClass(), "rbuf", null);
        setBooleanField(term31935, term31935.getClass(), "usesDefaultDeflater", false);
        setBooleanField(term31935, term31935.getClass(), "reachEOF", false);
        setField(term31935, term31935.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term23015;
        args[1] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term31929));
        assertTrue(recursiveEquals(term23015, term31935));
    }

};


