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

public class Base64_init_1040921088105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97946;

    public Base64_init_1040921088105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18296 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term18296, term18296.getClass(), "lineLength", 0);
        setField(term18296, term18296.getClass(), "lineSeparator", null);
        setIntField(term18296, term18296.getClass(), "encodeSize", 0);
        setIntField(term18296, term18296.getClass(), "decodeSize", 0);
        term97946 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term97947 = (byte[]) newByteArray(64);
        byte[] term97948 = (byte[]) newByteArray(2);
        setByteElement(term97947, 0, (byte) 65);
        setByteElement(term97947, 1, (byte) 66);
        setByteElement(term97947, 2, (byte) 67);
        setByteElement(term97947, 3, (byte) 68);
        setByteElement(term97947, 4, (byte) 69);
        setByteElement(term97947, 5, (byte) 70);
        setByteElement(term97947, 6, (byte) 71);
        setByteElement(term97947, 7, (byte) 72);
        setByteElement(term97947, 8, (byte) 73);
        setByteElement(term97947, 9, (byte) 74);
        setByteElement(term97947, 10, (byte) 75);
        setByteElement(term97947, 11, (byte) 76);
        setByteElement(term97947, 12, (byte) 77);
        setByteElement(term97947, 13, (byte) 78);
        setByteElement(term97947, 14, (byte) 79);
        setByteElement(term97947, 15, (byte) 80);
        setByteElement(term97947, 16, (byte) 81);
        setByteElement(term97947, 17, (byte) 82);
        setByteElement(term97947, 18, (byte) 83);
        setByteElement(term97947, 19, (byte) 84);
        setByteElement(term97947, 20, (byte) 85);
        setByteElement(term97947, 21, (byte) 86);
        setByteElement(term97947, 22, (byte) 87);
        setByteElement(term97947, 23, (byte) 88);
        setByteElement(term97947, 24, (byte) 89);
        setByteElement(term97947, 25, (byte) 90);
        setByteElement(term97947, 26, (byte) 97);
        setByteElement(term97947, 27, (byte) 98);
        setByteElement(term97947, 28, (byte) 99);
        setByteElement(term97947, 29, (byte) 100);
        setByteElement(term97947, 30, (byte) 101);
        setByteElement(term97947, 31, (byte) 102);
        setByteElement(term97947, 32, (byte) 103);
        setByteElement(term97947, 33, (byte) 104);
        setByteElement(term97947, 34, (byte) 105);
        setByteElement(term97947, 35, (byte) 106);
        setByteElement(term97947, 36, (byte) 107);
        setByteElement(term97947, 37, (byte) 108);
        setByteElement(term97947, 38, (byte) 109);
        setByteElement(term97947, 39, (byte) 110);
        setByteElement(term97947, 40, (byte) 111);
        setByteElement(term97947, 41, (byte) 112);
        setByteElement(term97947, 42, (byte) 113);
        setByteElement(term97947, 43, (byte) 114);
        setByteElement(term97947, 44, (byte) 115);
        setByteElement(term97947, 45, (byte) 116);
        setByteElement(term97947, 46, (byte) 117);
        setByteElement(term97947, 47, (byte) 118);
        setByteElement(term97947, 48, (byte) 119);
        setByteElement(term97947, 49, (byte) 120);
        setByteElement(term97947, 50, (byte) 121);
        setByteElement(term97947, 51, (byte) 122);
        setByteElement(term97947, 52, (byte) 48);
        setByteElement(term97947, 53, (byte) 49);
        setByteElement(term97947, 54, (byte) 50);
        setByteElement(term97947, 55, (byte) 51);
        setByteElement(term97947, 56, (byte) 52);
        setByteElement(term97947, 57, (byte) 53);
        setByteElement(term97947, 58, (byte) 54);
        setByteElement(term97947, 59, (byte) 55);
        setByteElement(term97947, 60, (byte) 56);
        setByteElement(term97947, 61, (byte) 57);
        setByteElement(term97947, 62, (byte) 43);
        setByteElement(term97947, 63, (byte) 47);
        setField(term97946, term97946.getClass(), "encodeTable", term97947);
        setIntField(term97946, term97946.getClass(), "lineLength", 76);
        setByteElement(term97948, 0, (byte) 13);
        setByteElement(term97948, 1, (byte) 10);
        setField(term97946, term97946.getClass(), "lineSeparator", term97948);
        setIntField(term97946, term97946.getClass(), "decodeSize", 5);
        setIntField(term97946, term97946.getClass(), "encodeSize", 6);
        setField(term97946, term97946.getClass(), "buffer", null);
        setIntField(term97946, term97946.getClass(), "pos", 0);
        setIntField(term97946, term97946.getClass(), "readPos", 0);
        setIntField(term97946, term97946.getClass(), "currentLinePos", 0);
        setIntField(term97946, term97946.getClass(), "modulus", 0);
        setBooleanField(term97946, term97946.getClass(), "eof", false);
        setIntField(term97946, term97946.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term97946));
    }

};


