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
import java.lang.Integer;

public class Base64_init_104092208041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term3090;

    public Base64_init_104092208041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = new Integer(568599855);
        term3090 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term3091 = (byte[]) newByteArray(64);
        byte[] term3092 = (byte[]) newByteArray(2);
        setByteElement(term3091, 0, (byte) 65);
        setByteElement(term3091, 1, (byte) 66);
        setByteElement(term3091, 2, (byte) 67);
        setByteElement(term3091, 3, (byte) 68);
        setByteElement(term3091, 4, (byte) 69);
        setByteElement(term3091, 5, (byte) 70);
        setByteElement(term3091, 6, (byte) 71);
        setByteElement(term3091, 7, (byte) 72);
        setByteElement(term3091, 8, (byte) 73);
        setByteElement(term3091, 9, (byte) 74);
        setByteElement(term3091, 10, (byte) 75);
        setByteElement(term3091, 11, (byte) 76);
        setByteElement(term3091, 12, (byte) 77);
        setByteElement(term3091, 13, (byte) 78);
        setByteElement(term3091, 14, (byte) 79);
        setByteElement(term3091, 15, (byte) 80);
        setByteElement(term3091, 16, (byte) 81);
        setByteElement(term3091, 17, (byte) 82);
        setByteElement(term3091, 18, (byte) 83);
        setByteElement(term3091, 19, (byte) 84);
        setByteElement(term3091, 20, (byte) 85);
        setByteElement(term3091, 21, (byte) 86);
        setByteElement(term3091, 22, (byte) 87);
        setByteElement(term3091, 23, (byte) 88);
        setByteElement(term3091, 24, (byte) 89);
        setByteElement(term3091, 25, (byte) 90);
        setByteElement(term3091, 26, (byte) 97);
        setByteElement(term3091, 27, (byte) 98);
        setByteElement(term3091, 28, (byte) 99);
        setByteElement(term3091, 29, (byte) 100);
        setByteElement(term3091, 30, (byte) 101);
        setByteElement(term3091, 31, (byte) 102);
        setByteElement(term3091, 32, (byte) 103);
        setByteElement(term3091, 33, (byte) 104);
        setByteElement(term3091, 34, (byte) 105);
        setByteElement(term3091, 35, (byte) 106);
        setByteElement(term3091, 36, (byte) 107);
        setByteElement(term3091, 37, (byte) 108);
        setByteElement(term3091, 38, (byte) 109);
        setByteElement(term3091, 39, (byte) 110);
        setByteElement(term3091, 40, (byte) 111);
        setByteElement(term3091, 41, (byte) 112);
        setByteElement(term3091, 42, (byte) 113);
        setByteElement(term3091, 43, (byte) 114);
        setByteElement(term3091, 44, (byte) 115);
        setByteElement(term3091, 45, (byte) 116);
        setByteElement(term3091, 46, (byte) 117);
        setByteElement(term3091, 47, (byte) 118);
        setByteElement(term3091, 48, (byte) 119);
        setByteElement(term3091, 49, (byte) 120);
        setByteElement(term3091, 50, (byte) 121);
        setByteElement(term3091, 51, (byte) 122);
        setByteElement(term3091, 52, (byte) 48);
        setByteElement(term3091, 53, (byte) 49);
        setByteElement(term3091, 54, (byte) 50);
        setByteElement(term3091, 55, (byte) 51);
        setByteElement(term3091, 56, (byte) 52);
        setByteElement(term3091, 57, (byte) 53);
        setByteElement(term3091, 58, (byte) 54);
        setByteElement(term3091, 59, (byte) 55);
        setByteElement(term3091, 60, (byte) 56);
        setByteElement(term3091, 61, (byte) 57);
        setByteElement(term3091, 62, (byte) 43);
        setByteElement(term3091, 63, (byte) 47);
        setField(term3090, term3090.getClass(), "encodeTable", term3091);
        setIntField(term3090, term3090.getClass(), "lineLength", 568599852);
        setByteElement(term3092, 0, (byte) 13);
        setByteElement(term3092, 1, (byte) 10);
        setField(term3090, term3090.getClass(), "lineSeparator", term3092);
        setIntField(term3090, term3090.getClass(), "decodeSize", 5);
        setIntField(term3090, term3090.getClass(), "encodeSize", 6);
        setField(term3090, term3090.getClass(), "buffer", null);
        setIntField(term3090, term3090.getClass(), "pos", 0);
        setIntField(term3090, term3090.getClass(), "readPos", 0);
        setIntField(term3090, term3090.getClass(), "currentLinePos", 0);
        setIntField(term3090, term3090.getClass(), "modulus", 0);
        setBooleanField(term3090, term3090.getClass(), "eof", false);
        setIntField(term3090, term3090.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3090));
        assertTrue(recursiveEquals(term3, 568599855));
    }

};


