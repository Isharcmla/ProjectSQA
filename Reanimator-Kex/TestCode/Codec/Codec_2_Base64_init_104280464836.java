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
import java.lang.Boolean;

public class Base64_init_104280464836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18;
     Object term20;
     Object term25;
     Object term3158;
     Object term3161;

    public Base64_init_104280464836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18 = new Integer(1484323161);
        term20 = (byte[]) newByteArray(4);
        setByteElement(term20, 0, (byte) -58);
        setByteElement(term20, 1, (byte) -29);
        setByteElement(term20, 2, (byte) -54);
        setByteElement(term20, 3, (byte) -10);
        term25 = new Boolean(false);
        term3158 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term3159 = (byte[]) newByteArray(64);
        byte[] term3160 = (byte[]) newByteArray(4);
        setByteElement(term3159, 0, (byte) 65);
        setByteElement(term3159, 1, (byte) 66);
        setByteElement(term3159, 2, (byte) 67);
        setByteElement(term3159, 3, (byte) 68);
        setByteElement(term3159, 4, (byte) 69);
        setByteElement(term3159, 5, (byte) 70);
        setByteElement(term3159, 6, (byte) 71);
        setByteElement(term3159, 7, (byte) 72);
        setByteElement(term3159, 8, (byte) 73);
        setByteElement(term3159, 9, (byte) 74);
        setByteElement(term3159, 10, (byte) 75);
        setByteElement(term3159, 11, (byte) 76);
        setByteElement(term3159, 12, (byte) 77);
        setByteElement(term3159, 13, (byte) 78);
        setByteElement(term3159, 14, (byte) 79);
        setByteElement(term3159, 15, (byte) 80);
        setByteElement(term3159, 16, (byte) 81);
        setByteElement(term3159, 17, (byte) 82);
        setByteElement(term3159, 18, (byte) 83);
        setByteElement(term3159, 19, (byte) 84);
        setByteElement(term3159, 20, (byte) 85);
        setByteElement(term3159, 21, (byte) 86);
        setByteElement(term3159, 22, (byte) 87);
        setByteElement(term3159, 23, (byte) 88);
        setByteElement(term3159, 24, (byte) 89);
        setByteElement(term3159, 25, (byte) 90);
        setByteElement(term3159, 26, (byte) 97);
        setByteElement(term3159, 27, (byte) 98);
        setByteElement(term3159, 28, (byte) 99);
        setByteElement(term3159, 29, (byte) 100);
        setByteElement(term3159, 30, (byte) 101);
        setByteElement(term3159, 31, (byte) 102);
        setByteElement(term3159, 32, (byte) 103);
        setByteElement(term3159, 33, (byte) 104);
        setByteElement(term3159, 34, (byte) 105);
        setByteElement(term3159, 35, (byte) 106);
        setByteElement(term3159, 36, (byte) 107);
        setByteElement(term3159, 37, (byte) 108);
        setByteElement(term3159, 38, (byte) 109);
        setByteElement(term3159, 39, (byte) 110);
        setByteElement(term3159, 40, (byte) 111);
        setByteElement(term3159, 41, (byte) 112);
        setByteElement(term3159, 42, (byte) 113);
        setByteElement(term3159, 43, (byte) 114);
        setByteElement(term3159, 44, (byte) 115);
        setByteElement(term3159, 45, (byte) 116);
        setByteElement(term3159, 46, (byte) 117);
        setByteElement(term3159, 47, (byte) 118);
        setByteElement(term3159, 48, (byte) 119);
        setByteElement(term3159, 49, (byte) 120);
        setByteElement(term3159, 50, (byte) 121);
        setByteElement(term3159, 51, (byte) 122);
        setByteElement(term3159, 52, (byte) 48);
        setByteElement(term3159, 53, (byte) 49);
        setByteElement(term3159, 54, (byte) 50);
        setByteElement(term3159, 55, (byte) 51);
        setByteElement(term3159, 56, (byte) 52);
        setByteElement(term3159, 57, (byte) 53);
        setByteElement(term3159, 58, (byte) 54);
        setByteElement(term3159, 59, (byte) 55);
        setByteElement(term3159, 60, (byte) 56);
        setByteElement(term3159, 61, (byte) 57);
        setByteElement(term3159, 62, (byte) 43);
        setByteElement(term3159, 63, (byte) 47);
        setField(term3158, term3158.getClass(), "encodeTable", term3159);
        setIntField(term3158, term3158.getClass(), "lineLength", 1484323161);
        setByteElement(term3160, 0, (byte) -58);
        setByteElement(term3160, 1, (byte) -29);
        setByteElement(term3160, 2, (byte) -54);
        setByteElement(term3160, 3, (byte) -10);
        setField(term3158, term3158.getClass(), "lineSeparator", term3160);
        setIntField(term3158, term3158.getClass(), "decodeSize", 7);
        setIntField(term3158, term3158.getClass(), "encodeSize", 8);
        setField(term3158, term3158.getClass(), "buf", null);
        setIntField(term3158, term3158.getClass(), "pos", 0);
        setIntField(term3158, term3158.getClass(), "readPos", 0);
        setIntField(term3158, term3158.getClass(), "currentLinePos", 0);
        setIntField(term3158, term3158.getClass(), "modulus", 0);
        setBooleanField(term3158, term3158.getClass(), "eof", false);
        setIntField(term3158, term3158.getClass(), "x", 0);
        term3161 = (byte[]) newByteArray(4);
        setByteElement(term3161, 0, (byte) -58);
        setByteElement(term3161, 1, (byte) -29);
        setByteElement(term3161, 2, (byte) -54);
        setByteElement(term3161, 3, (byte) -10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term18;
        args[1] = term20;
        args[2] = term25;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3158));
        assertTrue(recursiveEquals(term18, term3161));
        assertTrue(recursiveEquals(term20, 1484323161));
        assertTrue(recursiveEquals(term25, false));
    }

};


