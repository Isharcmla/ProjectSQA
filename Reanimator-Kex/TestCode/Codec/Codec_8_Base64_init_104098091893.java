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

public class Base64_init_104098091893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13020;
     Object term32678;
     Object term32681;

    public Base64_init_104098091893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15599 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term15599, term15599.getClass(), "lineLength", 0);
        setField(term15599, term15599.getClass(), "lineSeparator", null);
        setIntField(term15599, term15599.getClass(), "encodeSize", 0);
        setIntField(term15599, term15599.getClass(), "decodeSize", 0);
        term13020 = (byte[]) newByteArray(489);
        term32678 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term32679 = (byte[]) newByteArray(64);
        byte[] term32680 = (byte[]) newByteArray(489);
        setByteElement(term32679, 0, (byte) 65);
        setByteElement(term32679, 1, (byte) 66);
        setByteElement(term32679, 2, (byte) 67);
        setByteElement(term32679, 3, (byte) 68);
        setByteElement(term32679, 4, (byte) 69);
        setByteElement(term32679, 5, (byte) 70);
        setByteElement(term32679, 6, (byte) 71);
        setByteElement(term32679, 7, (byte) 72);
        setByteElement(term32679, 8, (byte) 73);
        setByteElement(term32679, 9, (byte) 74);
        setByteElement(term32679, 10, (byte) 75);
        setByteElement(term32679, 11, (byte) 76);
        setByteElement(term32679, 12, (byte) 77);
        setByteElement(term32679, 13, (byte) 78);
        setByteElement(term32679, 14, (byte) 79);
        setByteElement(term32679, 15, (byte) 80);
        setByteElement(term32679, 16, (byte) 81);
        setByteElement(term32679, 17, (byte) 82);
        setByteElement(term32679, 18, (byte) 83);
        setByteElement(term32679, 19, (byte) 84);
        setByteElement(term32679, 20, (byte) 85);
        setByteElement(term32679, 21, (byte) 86);
        setByteElement(term32679, 22, (byte) 87);
        setByteElement(term32679, 23, (byte) 88);
        setByteElement(term32679, 24, (byte) 89);
        setByteElement(term32679, 25, (byte) 90);
        setByteElement(term32679, 26, (byte) 97);
        setByteElement(term32679, 27, (byte) 98);
        setByteElement(term32679, 28, (byte) 99);
        setByteElement(term32679, 29, (byte) 100);
        setByteElement(term32679, 30, (byte) 101);
        setByteElement(term32679, 31, (byte) 102);
        setByteElement(term32679, 32, (byte) 103);
        setByteElement(term32679, 33, (byte) 104);
        setByteElement(term32679, 34, (byte) 105);
        setByteElement(term32679, 35, (byte) 106);
        setByteElement(term32679, 36, (byte) 107);
        setByteElement(term32679, 37, (byte) 108);
        setByteElement(term32679, 38, (byte) 109);
        setByteElement(term32679, 39, (byte) 110);
        setByteElement(term32679, 40, (byte) 111);
        setByteElement(term32679, 41, (byte) 112);
        setByteElement(term32679, 42, (byte) 113);
        setByteElement(term32679, 43, (byte) 114);
        setByteElement(term32679, 44, (byte) 115);
        setByteElement(term32679, 45, (byte) 116);
        setByteElement(term32679, 46, (byte) 117);
        setByteElement(term32679, 47, (byte) 118);
        setByteElement(term32679, 48, (byte) 119);
        setByteElement(term32679, 49, (byte) 120);
        setByteElement(term32679, 50, (byte) 121);
        setByteElement(term32679, 51, (byte) 122);
        setByteElement(term32679, 52, (byte) 48);
        setByteElement(term32679, 53, (byte) 49);
        setByteElement(term32679, 54, (byte) 50);
        setByteElement(term32679, 55, (byte) 51);
        setByteElement(term32679, 56, (byte) 52);
        setByteElement(term32679, 57, (byte) 53);
        setByteElement(term32679, 58, (byte) 54);
        setByteElement(term32679, 59, (byte) 55);
        setByteElement(term32679, 60, (byte) 56);
        setByteElement(term32679, 61, (byte) 57);
        setByteElement(term32679, 62, (byte) 43);
        setByteElement(term32679, 63, (byte) 47);
        setField(term32678, term32678.getClass(), "encodeTable", term32679);
        setIntField(term32678, term32678.getClass(), "lineLength", 0);
        setField(term32678, term32678.getClass(), "lineSeparator", term32680);
        setIntField(term32678, term32678.getClass(), "decodeSize", 492);
        setIntField(term32678, term32678.getClass(), "encodeSize", 493);
        setField(term32678, term32678.getClass(), "buffer", null);
        setIntField(term32678, term32678.getClass(), "pos", 0);
        setIntField(term32678, term32678.getClass(), "readPos", 0);
        setIntField(term32678, term32678.getClass(), "currentLinePos", 0);
        setIntField(term32678, term32678.getClass(), "modulus", 0);
        setBooleanField(term32678, term32678.getClass(), "eof", false);
        setIntField(term32678, term32678.getClass(), "x", 0);
        term32681 = (byte[]) newByteArray(489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = 1;
        args[1] = term13020;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32678));
        assertTrue(recursiveEquals(term13020, term32681));
    }

};


