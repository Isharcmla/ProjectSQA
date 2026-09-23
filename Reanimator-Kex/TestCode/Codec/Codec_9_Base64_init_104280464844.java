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

public class Base64_init_104280464844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18;
     Object term20;
     Object term25;
     Object term3616;
     Object term3619;

    public Base64_init_104280464844() {
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
        term3616 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term3617 = (byte[]) newByteArray(64);
        byte[] term3618 = (byte[]) newByteArray(4);
        setByteElement(term3617, 0, (byte) 65);
        setByteElement(term3617, 1, (byte) 66);
        setByteElement(term3617, 2, (byte) 67);
        setByteElement(term3617, 3, (byte) 68);
        setByteElement(term3617, 4, (byte) 69);
        setByteElement(term3617, 5, (byte) 70);
        setByteElement(term3617, 6, (byte) 71);
        setByteElement(term3617, 7, (byte) 72);
        setByteElement(term3617, 8, (byte) 73);
        setByteElement(term3617, 9, (byte) 74);
        setByteElement(term3617, 10, (byte) 75);
        setByteElement(term3617, 11, (byte) 76);
        setByteElement(term3617, 12, (byte) 77);
        setByteElement(term3617, 13, (byte) 78);
        setByteElement(term3617, 14, (byte) 79);
        setByteElement(term3617, 15, (byte) 80);
        setByteElement(term3617, 16, (byte) 81);
        setByteElement(term3617, 17, (byte) 82);
        setByteElement(term3617, 18, (byte) 83);
        setByteElement(term3617, 19, (byte) 84);
        setByteElement(term3617, 20, (byte) 85);
        setByteElement(term3617, 21, (byte) 86);
        setByteElement(term3617, 22, (byte) 87);
        setByteElement(term3617, 23, (byte) 88);
        setByteElement(term3617, 24, (byte) 89);
        setByteElement(term3617, 25, (byte) 90);
        setByteElement(term3617, 26, (byte) 97);
        setByteElement(term3617, 27, (byte) 98);
        setByteElement(term3617, 28, (byte) 99);
        setByteElement(term3617, 29, (byte) 100);
        setByteElement(term3617, 30, (byte) 101);
        setByteElement(term3617, 31, (byte) 102);
        setByteElement(term3617, 32, (byte) 103);
        setByteElement(term3617, 33, (byte) 104);
        setByteElement(term3617, 34, (byte) 105);
        setByteElement(term3617, 35, (byte) 106);
        setByteElement(term3617, 36, (byte) 107);
        setByteElement(term3617, 37, (byte) 108);
        setByteElement(term3617, 38, (byte) 109);
        setByteElement(term3617, 39, (byte) 110);
        setByteElement(term3617, 40, (byte) 111);
        setByteElement(term3617, 41, (byte) 112);
        setByteElement(term3617, 42, (byte) 113);
        setByteElement(term3617, 43, (byte) 114);
        setByteElement(term3617, 44, (byte) 115);
        setByteElement(term3617, 45, (byte) 116);
        setByteElement(term3617, 46, (byte) 117);
        setByteElement(term3617, 47, (byte) 118);
        setByteElement(term3617, 48, (byte) 119);
        setByteElement(term3617, 49, (byte) 120);
        setByteElement(term3617, 50, (byte) 121);
        setByteElement(term3617, 51, (byte) 122);
        setByteElement(term3617, 52, (byte) 48);
        setByteElement(term3617, 53, (byte) 49);
        setByteElement(term3617, 54, (byte) 50);
        setByteElement(term3617, 55, (byte) 51);
        setByteElement(term3617, 56, (byte) 52);
        setByteElement(term3617, 57, (byte) 53);
        setByteElement(term3617, 58, (byte) 54);
        setByteElement(term3617, 59, (byte) 55);
        setByteElement(term3617, 60, (byte) 56);
        setByteElement(term3617, 61, (byte) 57);
        setByteElement(term3617, 62, (byte) 43);
        setByteElement(term3617, 63, (byte) 47);
        setField(term3616, term3616.getClass(), "encodeTable", term3617);
        setIntField(term3616, term3616.getClass(), "lineLength", 1484323160);
        setByteElement(term3618, 0, (byte) -58);
        setByteElement(term3618, 1, (byte) -29);
        setByteElement(term3618, 2, (byte) -54);
        setByteElement(term3618, 3, (byte) -10);
        setField(term3616, term3616.getClass(), "lineSeparator", term3618);
        setIntField(term3616, term3616.getClass(), "decodeSize", 7);
        setIntField(term3616, term3616.getClass(), "encodeSize", 8);
        setField(term3616, term3616.getClass(), "buffer", null);
        setIntField(term3616, term3616.getClass(), "pos", 0);
        setIntField(term3616, term3616.getClass(), "readPos", 0);
        setIntField(term3616, term3616.getClass(), "currentLinePos", 0);
        setIntField(term3616, term3616.getClass(), "modulus", 0);
        setBooleanField(term3616, term3616.getClass(), "eof", false);
        setIntField(term3616, term3616.getClass(), "x", 0);
        term3619 = (byte[]) newByteArray(4);
        setByteElement(term3619, 0, (byte) -58);
        setByteElement(term3619, 1, (byte) -29);
        setByteElement(term3619, 2, (byte) -54);
        setByteElement(term3619, 3, (byte) -10);
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
        assertTrue(recursiveEquals(instance, term3616));
        assertTrue(recursiveEquals(term18, 1484323161));
        assertTrue(recursiveEquals(term20, term3619));
        assertTrue(recursiveEquals(term25, false));
    }

};


