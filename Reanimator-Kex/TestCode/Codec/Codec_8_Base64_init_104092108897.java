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

public class Base64_init_104092108897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34683;

    public Base64_init_104092108897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21723 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term21723, term21723.getClass(), "lineLength", 0);
        setField(term21723, term21723.getClass(), "lineSeparator", null);
        setIntField(term21723, term21723.getClass(), "encodeSize", 0);
        setIntField(term21723, term21723.getClass(), "decodeSize", 0);
        term34683 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term34684 = (byte[]) newByteArray(64);
        byte[] term34685 = (byte[]) newByteArray(2);
        setByteElement(term34684, 0, (byte) 65);
        setByteElement(term34684, 1, (byte) 66);
        setByteElement(term34684, 2, (byte) 67);
        setByteElement(term34684, 3, (byte) 68);
        setByteElement(term34684, 4, (byte) 69);
        setByteElement(term34684, 5, (byte) 70);
        setByteElement(term34684, 6, (byte) 71);
        setByteElement(term34684, 7, (byte) 72);
        setByteElement(term34684, 8, (byte) 73);
        setByteElement(term34684, 9, (byte) 74);
        setByteElement(term34684, 10, (byte) 75);
        setByteElement(term34684, 11, (byte) 76);
        setByteElement(term34684, 12, (byte) 77);
        setByteElement(term34684, 13, (byte) 78);
        setByteElement(term34684, 14, (byte) 79);
        setByteElement(term34684, 15, (byte) 80);
        setByteElement(term34684, 16, (byte) 81);
        setByteElement(term34684, 17, (byte) 82);
        setByteElement(term34684, 18, (byte) 83);
        setByteElement(term34684, 19, (byte) 84);
        setByteElement(term34684, 20, (byte) 85);
        setByteElement(term34684, 21, (byte) 86);
        setByteElement(term34684, 22, (byte) 87);
        setByteElement(term34684, 23, (byte) 88);
        setByteElement(term34684, 24, (byte) 89);
        setByteElement(term34684, 25, (byte) 90);
        setByteElement(term34684, 26, (byte) 97);
        setByteElement(term34684, 27, (byte) 98);
        setByteElement(term34684, 28, (byte) 99);
        setByteElement(term34684, 29, (byte) 100);
        setByteElement(term34684, 30, (byte) 101);
        setByteElement(term34684, 31, (byte) 102);
        setByteElement(term34684, 32, (byte) 103);
        setByteElement(term34684, 33, (byte) 104);
        setByteElement(term34684, 34, (byte) 105);
        setByteElement(term34684, 35, (byte) 106);
        setByteElement(term34684, 36, (byte) 107);
        setByteElement(term34684, 37, (byte) 108);
        setByteElement(term34684, 38, (byte) 109);
        setByteElement(term34684, 39, (byte) 110);
        setByteElement(term34684, 40, (byte) 111);
        setByteElement(term34684, 41, (byte) 112);
        setByteElement(term34684, 42, (byte) 113);
        setByteElement(term34684, 43, (byte) 114);
        setByteElement(term34684, 44, (byte) 115);
        setByteElement(term34684, 45, (byte) 116);
        setByteElement(term34684, 46, (byte) 117);
        setByteElement(term34684, 47, (byte) 118);
        setByteElement(term34684, 48, (byte) 119);
        setByteElement(term34684, 49, (byte) 120);
        setByteElement(term34684, 50, (byte) 121);
        setByteElement(term34684, 51, (byte) 122);
        setByteElement(term34684, 52, (byte) 48);
        setByteElement(term34684, 53, (byte) 49);
        setByteElement(term34684, 54, (byte) 50);
        setByteElement(term34684, 55, (byte) 51);
        setByteElement(term34684, 56, (byte) 52);
        setByteElement(term34684, 57, (byte) 53);
        setByteElement(term34684, 58, (byte) 54);
        setByteElement(term34684, 59, (byte) 55);
        setByteElement(term34684, 60, (byte) 56);
        setByteElement(term34684, 61, (byte) 57);
        setByteElement(term34684, 62, (byte) 43);
        setByteElement(term34684, 63, (byte) 47);
        setField(term34683, term34683.getClass(), "encodeTable", term34684);
        setIntField(term34683, term34683.getClass(), "lineLength", 76);
        setByteElement(term34685, 0, (byte) 13);
        setByteElement(term34685, 1, (byte) 10);
        setField(term34683, term34683.getClass(), "lineSeparator", term34685);
        setIntField(term34683, term34683.getClass(), "decodeSize", 5);
        setIntField(term34683, term34683.getClass(), "encodeSize", 6);
        setField(term34683, term34683.getClass(), "buffer", null);
        setIntField(term34683, term34683.getClass(), "pos", 0);
        setIntField(term34683, term34683.getClass(), "readPos", 0);
        setIntField(term34683, term34683.getClass(), "currentLinePos", 0);
        setIntField(term34683, term34683.getClass(), "modulus", 0);
        setBooleanField(term34683, term34683.getClass(), "eof", false);
        setIntField(term34683, term34683.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34683));
    }

};


