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

public class Base64_init_104280464882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16212;

    public Base64_init_104280464882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13017 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        term16212 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term16213 = (byte[]) newByteArray(64);
        byte[] term16214 = (byte[]) newByteArray(2);
        setByteElement(term16213, 0, (byte) 65);
        setByteElement(term16213, 1, (byte) 66);
        setByteElement(term16213, 2, (byte) 67);
        setByteElement(term16213, 3, (byte) 68);
        setByteElement(term16213, 4, (byte) 69);
        setByteElement(term16213, 5, (byte) 70);
        setByteElement(term16213, 6, (byte) 71);
        setByteElement(term16213, 7, (byte) 72);
        setByteElement(term16213, 8, (byte) 73);
        setByteElement(term16213, 9, (byte) 74);
        setByteElement(term16213, 10, (byte) 75);
        setByteElement(term16213, 11, (byte) 76);
        setByteElement(term16213, 12, (byte) 77);
        setByteElement(term16213, 13, (byte) 78);
        setByteElement(term16213, 14, (byte) 79);
        setByteElement(term16213, 15, (byte) 80);
        setByteElement(term16213, 16, (byte) 81);
        setByteElement(term16213, 17, (byte) 82);
        setByteElement(term16213, 18, (byte) 83);
        setByteElement(term16213, 19, (byte) 84);
        setByteElement(term16213, 20, (byte) 85);
        setByteElement(term16213, 21, (byte) 86);
        setByteElement(term16213, 22, (byte) 87);
        setByteElement(term16213, 23, (byte) 88);
        setByteElement(term16213, 24, (byte) 89);
        setByteElement(term16213, 25, (byte) 90);
        setByteElement(term16213, 26, (byte) 97);
        setByteElement(term16213, 27, (byte) 98);
        setByteElement(term16213, 28, (byte) 99);
        setByteElement(term16213, 29, (byte) 100);
        setByteElement(term16213, 30, (byte) 101);
        setByteElement(term16213, 31, (byte) 102);
        setByteElement(term16213, 32, (byte) 103);
        setByteElement(term16213, 33, (byte) 104);
        setByteElement(term16213, 34, (byte) 105);
        setByteElement(term16213, 35, (byte) 106);
        setByteElement(term16213, 36, (byte) 107);
        setByteElement(term16213, 37, (byte) 108);
        setByteElement(term16213, 38, (byte) 109);
        setByteElement(term16213, 39, (byte) 110);
        setByteElement(term16213, 40, (byte) 111);
        setByteElement(term16213, 41, (byte) 112);
        setByteElement(term16213, 42, (byte) 113);
        setByteElement(term16213, 43, (byte) 114);
        setByteElement(term16213, 44, (byte) 115);
        setByteElement(term16213, 45, (byte) 116);
        setByteElement(term16213, 46, (byte) 117);
        setByteElement(term16213, 47, (byte) 118);
        setByteElement(term16213, 48, (byte) 119);
        setByteElement(term16213, 49, (byte) 120);
        setByteElement(term16213, 50, (byte) 121);
        setByteElement(term16213, 51, (byte) 122);
        setByteElement(term16213, 52, (byte) 48);
        setByteElement(term16213, 53, (byte) 49);
        setByteElement(term16213, 54, (byte) 50);
        setByteElement(term16213, 55, (byte) 51);
        setByteElement(term16213, 56, (byte) 52);
        setByteElement(term16213, 57, (byte) 53);
        setByteElement(term16213, 58, (byte) 54);
        setByteElement(term16213, 59, (byte) 55);
        setByteElement(term16213, 60, (byte) 56);
        setByteElement(term16213, 61, (byte) 57);
        setByteElement(term16213, 62, (byte) 43);
        setByteElement(term16213, 63, (byte) 47);
        setField(term16212, term16212.getClass(), "encodeTable", term16213);
        setIntField(term16212, term16212.getClass(), "lineLength", 0);
        setByteElement(term16214, 0, (byte) 13);
        setByteElement(term16214, 1, (byte) 10);
        setField(term16212, term16212.getClass(), "lineSeparator", term16214);
        setIntField(term16212, term16212.getClass(), "decodeSize", 3);
        setIntField(term16212, term16212.getClass(), "encodeSize", 4);
        setField(term16212, term16212.getClass(), "buffer", null);
        setIntField(term16212, term16212.getClass(), "pos", 0);
        setIntField(term16212, term16212.getClass(), "readPos", 0);
        setIntField(term16212, term16212.getClass(), "currentLinePos", 0);
        setIntField(term16212, term16212.getClass(), "modulus", 0);
        setBooleanField(term16212, term16212.getClass(), "eof", false);
        setIntField(term16212, term16212.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = null;
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16212));
    }

};


