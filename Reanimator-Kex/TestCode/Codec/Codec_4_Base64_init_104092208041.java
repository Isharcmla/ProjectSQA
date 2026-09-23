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
     Object term3091;

    public Base64_init_104092208041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = new Integer(568599855);
        term3091 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term3092 = (byte[]) newByteArray(64);
        byte[] term3093 = (byte[]) newByteArray(2);
        setByteElement(term3092, 0, (byte) 65);
        setByteElement(term3092, 1, (byte) 66);
        setByteElement(term3092, 2, (byte) 67);
        setByteElement(term3092, 3, (byte) 68);
        setByteElement(term3092, 4, (byte) 69);
        setByteElement(term3092, 5, (byte) 70);
        setByteElement(term3092, 6, (byte) 71);
        setByteElement(term3092, 7, (byte) 72);
        setByteElement(term3092, 8, (byte) 73);
        setByteElement(term3092, 9, (byte) 74);
        setByteElement(term3092, 10, (byte) 75);
        setByteElement(term3092, 11, (byte) 76);
        setByteElement(term3092, 12, (byte) 77);
        setByteElement(term3092, 13, (byte) 78);
        setByteElement(term3092, 14, (byte) 79);
        setByteElement(term3092, 15, (byte) 80);
        setByteElement(term3092, 16, (byte) 81);
        setByteElement(term3092, 17, (byte) 82);
        setByteElement(term3092, 18, (byte) 83);
        setByteElement(term3092, 19, (byte) 84);
        setByteElement(term3092, 20, (byte) 85);
        setByteElement(term3092, 21, (byte) 86);
        setByteElement(term3092, 22, (byte) 87);
        setByteElement(term3092, 23, (byte) 88);
        setByteElement(term3092, 24, (byte) 89);
        setByteElement(term3092, 25, (byte) 90);
        setByteElement(term3092, 26, (byte) 97);
        setByteElement(term3092, 27, (byte) 98);
        setByteElement(term3092, 28, (byte) 99);
        setByteElement(term3092, 29, (byte) 100);
        setByteElement(term3092, 30, (byte) 101);
        setByteElement(term3092, 31, (byte) 102);
        setByteElement(term3092, 32, (byte) 103);
        setByteElement(term3092, 33, (byte) 104);
        setByteElement(term3092, 34, (byte) 105);
        setByteElement(term3092, 35, (byte) 106);
        setByteElement(term3092, 36, (byte) 107);
        setByteElement(term3092, 37, (byte) 108);
        setByteElement(term3092, 38, (byte) 109);
        setByteElement(term3092, 39, (byte) 110);
        setByteElement(term3092, 40, (byte) 111);
        setByteElement(term3092, 41, (byte) 112);
        setByteElement(term3092, 42, (byte) 113);
        setByteElement(term3092, 43, (byte) 114);
        setByteElement(term3092, 44, (byte) 115);
        setByteElement(term3092, 45, (byte) 116);
        setByteElement(term3092, 46, (byte) 117);
        setByteElement(term3092, 47, (byte) 118);
        setByteElement(term3092, 48, (byte) 119);
        setByteElement(term3092, 49, (byte) 120);
        setByteElement(term3092, 50, (byte) 121);
        setByteElement(term3092, 51, (byte) 122);
        setByteElement(term3092, 52, (byte) 48);
        setByteElement(term3092, 53, (byte) 49);
        setByteElement(term3092, 54, (byte) 50);
        setByteElement(term3092, 55, (byte) 51);
        setByteElement(term3092, 56, (byte) 52);
        setByteElement(term3092, 57, (byte) 53);
        setByteElement(term3092, 58, (byte) 54);
        setByteElement(term3092, 59, (byte) 55);
        setByteElement(term3092, 60, (byte) 56);
        setByteElement(term3092, 61, (byte) 57);
        setByteElement(term3092, 62, (byte) 43);
        setByteElement(term3092, 63, (byte) 47);
        setField(term3091, term3091.getClass(), "encodeTable", term3092);
        setIntField(term3091, term3091.getClass(), "lineLength", 568599852);
        setByteElement(term3093, 0, (byte) 13);
        setByteElement(term3093, 1, (byte) 10);
        setField(term3091, term3091.getClass(), "lineSeparator", term3093);
        setIntField(term3091, term3091.getClass(), "decodeSize", 5);
        setIntField(term3091, term3091.getClass(), "encodeSize", 6);
        setField(term3091, term3091.getClass(), "buffer", null);
        setIntField(term3091, term3091.getClass(), "pos", 0);
        setIntField(term3091, term3091.getClass(), "readPos", 0);
        setIntField(term3091, term3091.getClass(), "currentLinePos", 0);
        setIntField(term3091, term3091.getClass(), "modulus", 0);
        setBooleanField(term3091, term3091.getClass(), "eof", false);
        setIntField(term3091, term3091.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3091));
        assertTrue(recursiveEquals(term3, 568599855));
    }

};


