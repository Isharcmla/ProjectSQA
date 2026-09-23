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

public class Base64_init_104092208092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44845;

    public Base64_init_104092208092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15073 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term15073, term15073.getClass(), "lineLength", 0);
        setField(term15073, term15073.getClass(), "lineSeparator", null);
        setIntField(term15073, term15073.getClass(), "encodeSize", 0);
        setIntField(term15073, term15073.getClass(), "decodeSize", 0);
        term44845 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term44846 = (byte[]) newByteArray(64);
        byte[] term44847 = (byte[]) newByteArray(2);
        setByteElement(term44846, 0, (byte) 65);
        setByteElement(term44846, 1, (byte) 66);
        setByteElement(term44846, 2, (byte) 67);
        setByteElement(term44846, 3, (byte) 68);
        setByteElement(term44846, 4, (byte) 69);
        setByteElement(term44846, 5, (byte) 70);
        setByteElement(term44846, 6, (byte) 71);
        setByteElement(term44846, 7, (byte) 72);
        setByteElement(term44846, 8, (byte) 73);
        setByteElement(term44846, 9, (byte) 74);
        setByteElement(term44846, 10, (byte) 75);
        setByteElement(term44846, 11, (byte) 76);
        setByteElement(term44846, 12, (byte) 77);
        setByteElement(term44846, 13, (byte) 78);
        setByteElement(term44846, 14, (byte) 79);
        setByteElement(term44846, 15, (byte) 80);
        setByteElement(term44846, 16, (byte) 81);
        setByteElement(term44846, 17, (byte) 82);
        setByteElement(term44846, 18, (byte) 83);
        setByteElement(term44846, 19, (byte) 84);
        setByteElement(term44846, 20, (byte) 85);
        setByteElement(term44846, 21, (byte) 86);
        setByteElement(term44846, 22, (byte) 87);
        setByteElement(term44846, 23, (byte) 88);
        setByteElement(term44846, 24, (byte) 89);
        setByteElement(term44846, 25, (byte) 90);
        setByteElement(term44846, 26, (byte) 97);
        setByteElement(term44846, 27, (byte) 98);
        setByteElement(term44846, 28, (byte) 99);
        setByteElement(term44846, 29, (byte) 100);
        setByteElement(term44846, 30, (byte) 101);
        setByteElement(term44846, 31, (byte) 102);
        setByteElement(term44846, 32, (byte) 103);
        setByteElement(term44846, 33, (byte) 104);
        setByteElement(term44846, 34, (byte) 105);
        setByteElement(term44846, 35, (byte) 106);
        setByteElement(term44846, 36, (byte) 107);
        setByteElement(term44846, 37, (byte) 108);
        setByteElement(term44846, 38, (byte) 109);
        setByteElement(term44846, 39, (byte) 110);
        setByteElement(term44846, 40, (byte) 111);
        setByteElement(term44846, 41, (byte) 112);
        setByteElement(term44846, 42, (byte) 113);
        setByteElement(term44846, 43, (byte) 114);
        setByteElement(term44846, 44, (byte) 115);
        setByteElement(term44846, 45, (byte) 116);
        setByteElement(term44846, 46, (byte) 117);
        setByteElement(term44846, 47, (byte) 118);
        setByteElement(term44846, 48, (byte) 119);
        setByteElement(term44846, 49, (byte) 120);
        setByteElement(term44846, 50, (byte) 121);
        setByteElement(term44846, 51, (byte) 122);
        setByteElement(term44846, 52, (byte) 48);
        setByteElement(term44846, 53, (byte) 49);
        setByteElement(term44846, 54, (byte) 50);
        setByteElement(term44846, 55, (byte) 51);
        setByteElement(term44846, 56, (byte) 52);
        setByteElement(term44846, 57, (byte) 53);
        setByteElement(term44846, 58, (byte) 54);
        setByteElement(term44846, 59, (byte) 55);
        setByteElement(term44846, 60, (byte) 56);
        setByteElement(term44846, 61, (byte) 57);
        setByteElement(term44846, 62, (byte) 43);
        setByteElement(term44846, 63, (byte) 47);
        setField(term44845, term44845.getClass(), "encodeTable", term44846);
        setIntField(term44845, term44845.getClass(), "lineLength", 0);
        setByteElement(term44847, 0, (byte) 13);
        setByteElement(term44847, 1, (byte) 10);
        setField(term44845, term44845.getClass(), "lineSeparator", term44847);
        setIntField(term44845, term44845.getClass(), "decodeSize", 5);
        setIntField(term44845, term44845.getClass(), "encodeSize", 6);
        setField(term44845, term44845.getClass(), "buffer", null);
        setIntField(term44845, term44845.getClass(), "pos", 0);
        setIntField(term44845, term44845.getClass(), "readPos", 0);
        setIntField(term44845, term44845.getClass(), "currentLinePos", 0);
        setIntField(term44845, term44845.getClass(), "modulus", 0);
        setBooleanField(term44845, term44845.getClass(), "eof", false);
        setIntField(term44845, term44845.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term44845));
    }

};


