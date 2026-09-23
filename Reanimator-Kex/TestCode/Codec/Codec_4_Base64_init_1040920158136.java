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

public class Base64_init_1040920158136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221731;

    public Base64_init_1040920158136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term81582 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        term221731 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term221732 = (byte[]) newByteArray(64);
        byte[] term221733 = (byte[]) newByteArray(2);
        setByteElement(term221732, 0, (byte) 65);
        setByteElement(term221732, 1, (byte) 66);
        setByteElement(term221732, 2, (byte) 67);
        setByteElement(term221732, 3, (byte) 68);
        setByteElement(term221732, 4, (byte) 69);
        setByteElement(term221732, 5, (byte) 70);
        setByteElement(term221732, 6, (byte) 71);
        setByteElement(term221732, 7, (byte) 72);
        setByteElement(term221732, 8, (byte) 73);
        setByteElement(term221732, 9, (byte) 74);
        setByteElement(term221732, 10, (byte) 75);
        setByteElement(term221732, 11, (byte) 76);
        setByteElement(term221732, 12, (byte) 77);
        setByteElement(term221732, 13, (byte) 78);
        setByteElement(term221732, 14, (byte) 79);
        setByteElement(term221732, 15, (byte) 80);
        setByteElement(term221732, 16, (byte) 81);
        setByteElement(term221732, 17, (byte) 82);
        setByteElement(term221732, 18, (byte) 83);
        setByteElement(term221732, 19, (byte) 84);
        setByteElement(term221732, 20, (byte) 85);
        setByteElement(term221732, 21, (byte) 86);
        setByteElement(term221732, 22, (byte) 87);
        setByteElement(term221732, 23, (byte) 88);
        setByteElement(term221732, 24, (byte) 89);
        setByteElement(term221732, 25, (byte) 90);
        setByteElement(term221732, 26, (byte) 97);
        setByteElement(term221732, 27, (byte) 98);
        setByteElement(term221732, 28, (byte) 99);
        setByteElement(term221732, 29, (byte) 100);
        setByteElement(term221732, 30, (byte) 101);
        setByteElement(term221732, 31, (byte) 102);
        setByteElement(term221732, 32, (byte) 103);
        setByteElement(term221732, 33, (byte) 104);
        setByteElement(term221732, 34, (byte) 105);
        setByteElement(term221732, 35, (byte) 106);
        setByteElement(term221732, 36, (byte) 107);
        setByteElement(term221732, 37, (byte) 108);
        setByteElement(term221732, 38, (byte) 109);
        setByteElement(term221732, 39, (byte) 110);
        setByteElement(term221732, 40, (byte) 111);
        setByteElement(term221732, 41, (byte) 112);
        setByteElement(term221732, 42, (byte) 113);
        setByteElement(term221732, 43, (byte) 114);
        setByteElement(term221732, 44, (byte) 115);
        setByteElement(term221732, 45, (byte) 116);
        setByteElement(term221732, 46, (byte) 117);
        setByteElement(term221732, 47, (byte) 118);
        setByteElement(term221732, 48, (byte) 119);
        setByteElement(term221732, 49, (byte) 120);
        setByteElement(term221732, 50, (byte) 121);
        setByteElement(term221732, 51, (byte) 122);
        setByteElement(term221732, 52, (byte) 48);
        setByteElement(term221732, 53, (byte) 49);
        setByteElement(term221732, 54, (byte) 50);
        setByteElement(term221732, 55, (byte) 51);
        setByteElement(term221732, 56, (byte) 52);
        setByteElement(term221732, 57, (byte) 53);
        setByteElement(term221732, 58, (byte) 54);
        setByteElement(term221732, 59, (byte) 55);
        setByteElement(term221732, 60, (byte) 56);
        setByteElement(term221732, 61, (byte) 57);
        setByteElement(term221732, 62, (byte) 43);
        setByteElement(term221732, 63, (byte) 47);
        setField(term221731, term221731.getClass(), "encodeTable", term221732);
        setIntField(term221731, term221731.getClass(), "lineLength", 76);
        setByteElement(term221733, 0, (byte) 13);
        setByteElement(term221733, 1, (byte) 10);
        setField(term221731, term221731.getClass(), "lineSeparator", term221733);
        setIntField(term221731, term221731.getClass(), "decodeSize", 5);
        setIntField(term221731, term221731.getClass(), "encodeSize", 6);
        setField(term221731, term221731.getClass(), "buffer", null);
        setIntField(term221731, term221731.getClass(), "pos", 0);
        setIntField(term221731, term221731.getClass(), "readPos", 0);
        setIntField(term221731, term221731.getClass(), "currentLinePos", 0);
        setIntField(term221731, term221731.getClass(), "modulus", 0);
        setBooleanField(term221731, term221731.getClass(), "eof", false);
        setIntField(term221731, term221731.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term221731));
    }

};


