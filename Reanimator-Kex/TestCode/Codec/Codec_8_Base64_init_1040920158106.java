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

public class Base64_init_1040920158106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58737;

    public Base64_init_1040920158106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term35185 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        term58737 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term58738 = (byte[]) newByteArray(64);
        byte[] term58739 = (byte[]) newByteArray(2);
        setByteElement(term58738, 0, (byte) 65);
        setByteElement(term58738, 1, (byte) 66);
        setByteElement(term58738, 2, (byte) 67);
        setByteElement(term58738, 3, (byte) 68);
        setByteElement(term58738, 4, (byte) 69);
        setByteElement(term58738, 5, (byte) 70);
        setByteElement(term58738, 6, (byte) 71);
        setByteElement(term58738, 7, (byte) 72);
        setByteElement(term58738, 8, (byte) 73);
        setByteElement(term58738, 9, (byte) 74);
        setByteElement(term58738, 10, (byte) 75);
        setByteElement(term58738, 11, (byte) 76);
        setByteElement(term58738, 12, (byte) 77);
        setByteElement(term58738, 13, (byte) 78);
        setByteElement(term58738, 14, (byte) 79);
        setByteElement(term58738, 15, (byte) 80);
        setByteElement(term58738, 16, (byte) 81);
        setByteElement(term58738, 17, (byte) 82);
        setByteElement(term58738, 18, (byte) 83);
        setByteElement(term58738, 19, (byte) 84);
        setByteElement(term58738, 20, (byte) 85);
        setByteElement(term58738, 21, (byte) 86);
        setByteElement(term58738, 22, (byte) 87);
        setByteElement(term58738, 23, (byte) 88);
        setByteElement(term58738, 24, (byte) 89);
        setByteElement(term58738, 25, (byte) 90);
        setByteElement(term58738, 26, (byte) 97);
        setByteElement(term58738, 27, (byte) 98);
        setByteElement(term58738, 28, (byte) 99);
        setByteElement(term58738, 29, (byte) 100);
        setByteElement(term58738, 30, (byte) 101);
        setByteElement(term58738, 31, (byte) 102);
        setByteElement(term58738, 32, (byte) 103);
        setByteElement(term58738, 33, (byte) 104);
        setByteElement(term58738, 34, (byte) 105);
        setByteElement(term58738, 35, (byte) 106);
        setByteElement(term58738, 36, (byte) 107);
        setByteElement(term58738, 37, (byte) 108);
        setByteElement(term58738, 38, (byte) 109);
        setByteElement(term58738, 39, (byte) 110);
        setByteElement(term58738, 40, (byte) 111);
        setByteElement(term58738, 41, (byte) 112);
        setByteElement(term58738, 42, (byte) 113);
        setByteElement(term58738, 43, (byte) 114);
        setByteElement(term58738, 44, (byte) 115);
        setByteElement(term58738, 45, (byte) 116);
        setByteElement(term58738, 46, (byte) 117);
        setByteElement(term58738, 47, (byte) 118);
        setByteElement(term58738, 48, (byte) 119);
        setByteElement(term58738, 49, (byte) 120);
        setByteElement(term58738, 50, (byte) 121);
        setByteElement(term58738, 51, (byte) 122);
        setByteElement(term58738, 52, (byte) 48);
        setByteElement(term58738, 53, (byte) 49);
        setByteElement(term58738, 54, (byte) 50);
        setByteElement(term58738, 55, (byte) 51);
        setByteElement(term58738, 56, (byte) 52);
        setByteElement(term58738, 57, (byte) 53);
        setByteElement(term58738, 58, (byte) 54);
        setByteElement(term58738, 59, (byte) 55);
        setByteElement(term58738, 60, (byte) 56);
        setByteElement(term58738, 61, (byte) 57);
        setByteElement(term58738, 62, (byte) 43);
        setByteElement(term58738, 63, (byte) 47);
        setField(term58737, term58737.getClass(), "encodeTable", term58738);
        setIntField(term58737, term58737.getClass(), "lineLength", 0);
        setByteElement(term58739, 0, (byte) 13);
        setByteElement(term58739, 1, (byte) 10);
        setField(term58737, term58737.getClass(), "lineSeparator", term58739);
        setIntField(term58737, term58737.getClass(), "decodeSize", 3);
        setIntField(term58737, term58737.getClass(), "encodeSize", 4);
        setField(term58737, term58737.getClass(), "buffer", null);
        setIntField(term58737, term58737.getClass(), "pos", 0);
        setIntField(term58737, term58737.getClass(), "readPos", 0);
        setIntField(term58737, term58737.getClass(), "currentLinePos", 0);
        setIntField(term58737, term58737.getClass(), "modulus", 0);
        setBooleanField(term58737, term58737.getClass(), "eof", false);
        setIntField(term58737, term58737.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term58737));
    }

};


