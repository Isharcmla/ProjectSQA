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
import java.lang.Boolean;
import java.lang.Object;

public class Base64InputStream_init_13227669927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term974;

    public Base64InputStream_init_13227669927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        term974 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term975 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term976 = (byte[]) newByteArray(64);
        byte[] term977 = (byte[]) newByteArray(2);
        byte[] term978 = (byte[]) newByteArray(1);
        setBooleanField(term974, term974.getClass(), "doEncode", false);
        setByteElement(term976, 0, (byte) 65);
        setByteElement(term976, 1, (byte) 66);
        setByteElement(term976, 2, (byte) 67);
        setByteElement(term976, 3, (byte) 68);
        setByteElement(term976, 4, (byte) 69);
        setByteElement(term976, 5, (byte) 70);
        setByteElement(term976, 6, (byte) 71);
        setByteElement(term976, 7, (byte) 72);
        setByteElement(term976, 8, (byte) 73);
        setByteElement(term976, 9, (byte) 74);
        setByteElement(term976, 10, (byte) 75);
        setByteElement(term976, 11, (byte) 76);
        setByteElement(term976, 12, (byte) 77);
        setByteElement(term976, 13, (byte) 78);
        setByteElement(term976, 14, (byte) 79);
        setByteElement(term976, 15, (byte) 80);
        setByteElement(term976, 16, (byte) 81);
        setByteElement(term976, 17, (byte) 82);
        setByteElement(term976, 18, (byte) 83);
        setByteElement(term976, 19, (byte) 84);
        setByteElement(term976, 20, (byte) 85);
        setByteElement(term976, 21, (byte) 86);
        setByteElement(term976, 22, (byte) 87);
        setByteElement(term976, 23, (byte) 88);
        setByteElement(term976, 24, (byte) 89);
        setByteElement(term976, 25, (byte) 90);
        setByteElement(term976, 26, (byte) 97);
        setByteElement(term976, 27, (byte) 98);
        setByteElement(term976, 28, (byte) 99);
        setByteElement(term976, 29, (byte) 100);
        setByteElement(term976, 30, (byte) 101);
        setByteElement(term976, 31, (byte) 102);
        setByteElement(term976, 32, (byte) 103);
        setByteElement(term976, 33, (byte) 104);
        setByteElement(term976, 34, (byte) 105);
        setByteElement(term976, 35, (byte) 106);
        setByteElement(term976, 36, (byte) 107);
        setByteElement(term976, 37, (byte) 108);
        setByteElement(term976, 38, (byte) 109);
        setByteElement(term976, 39, (byte) 110);
        setByteElement(term976, 40, (byte) 111);
        setByteElement(term976, 41, (byte) 112);
        setByteElement(term976, 42, (byte) 113);
        setByteElement(term976, 43, (byte) 114);
        setByteElement(term976, 44, (byte) 115);
        setByteElement(term976, 45, (byte) 116);
        setByteElement(term976, 46, (byte) 117);
        setByteElement(term976, 47, (byte) 118);
        setByteElement(term976, 48, (byte) 119);
        setByteElement(term976, 49, (byte) 120);
        setByteElement(term976, 50, (byte) 121);
        setByteElement(term976, 51, (byte) 122);
        setByteElement(term976, 52, (byte) 48);
        setByteElement(term976, 53, (byte) 49);
        setByteElement(term976, 54, (byte) 50);
        setByteElement(term976, 55, (byte) 51);
        setByteElement(term976, 56, (byte) 52);
        setByteElement(term976, 57, (byte) 53);
        setByteElement(term976, 58, (byte) 54);
        setByteElement(term976, 59, (byte) 55);
        setByteElement(term976, 60, (byte) 56);
        setByteElement(term976, 61, (byte) 57);
        setByteElement(term976, 62, (byte) 43);
        setByteElement(term976, 63, (byte) 47);
        setField(term975, term975.getClass(), "encodeTable", term976);
        setIntField(term975, term975.getClass(), "lineLength", 76);
        setByteElement(term977, 0, (byte) 13);
        setByteElement(term977, 1, (byte) 10);
        setField(term975, term975.getClass(), "lineSeparator", term977);
        setIntField(term975, term975.getClass(), "decodeSize", 5);
        setIntField(term975, term975.getClass(), "encodeSize", 6);
        setField(term975, term975.getClass(), "buffer", null);
        setIntField(term975, term975.getClass(), "pos", 0);
        setIntField(term975, term975.getClass(), "readPos", 0);
        setIntField(term975, term975.getClass(), "currentLinePos", 0);
        setIntField(term975, term975.getClass(), "modulus", 0);
        setBooleanField(term975, term975.getClass(), "eof", false);
        setIntField(term975, term975.getClass(), "x", 0);
        setField(term974, term974.getClass(), "base64", term975);
        setField(term974, term974.getClass(), "singleByte", term978);
        setField(term974, term974.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term974));
        assertTrue(recursiveEquals(term1, false));
    }

};


