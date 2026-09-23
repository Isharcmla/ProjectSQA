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

public class Base64_init_104092015879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14802;

    public Base64_init_104092015879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14693 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term14693, term14693.getClass(), "lineLength", 0);
        setField(term14693, term14693.getClass(), "lineSeparator", null);
        setIntField(term14693, term14693.getClass(), "encodeSize", 0);
        setIntField(term14693, term14693.getClass(), "decodeSize", 0);
        term14802 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term14803 = (byte[]) newByteArray(64);
        byte[] term14804 = (byte[]) newByteArray(2);
        setByteElement(term14803, 0, (byte) 65);
        setByteElement(term14803, 1, (byte) 66);
        setByteElement(term14803, 2, (byte) 67);
        setByteElement(term14803, 3, (byte) 68);
        setByteElement(term14803, 4, (byte) 69);
        setByteElement(term14803, 5, (byte) 70);
        setByteElement(term14803, 6, (byte) 71);
        setByteElement(term14803, 7, (byte) 72);
        setByteElement(term14803, 8, (byte) 73);
        setByteElement(term14803, 9, (byte) 74);
        setByteElement(term14803, 10, (byte) 75);
        setByteElement(term14803, 11, (byte) 76);
        setByteElement(term14803, 12, (byte) 77);
        setByteElement(term14803, 13, (byte) 78);
        setByteElement(term14803, 14, (byte) 79);
        setByteElement(term14803, 15, (byte) 80);
        setByteElement(term14803, 16, (byte) 81);
        setByteElement(term14803, 17, (byte) 82);
        setByteElement(term14803, 18, (byte) 83);
        setByteElement(term14803, 19, (byte) 84);
        setByteElement(term14803, 20, (byte) 85);
        setByteElement(term14803, 21, (byte) 86);
        setByteElement(term14803, 22, (byte) 87);
        setByteElement(term14803, 23, (byte) 88);
        setByteElement(term14803, 24, (byte) 89);
        setByteElement(term14803, 25, (byte) 90);
        setByteElement(term14803, 26, (byte) 97);
        setByteElement(term14803, 27, (byte) 98);
        setByteElement(term14803, 28, (byte) 99);
        setByteElement(term14803, 29, (byte) 100);
        setByteElement(term14803, 30, (byte) 101);
        setByteElement(term14803, 31, (byte) 102);
        setByteElement(term14803, 32, (byte) 103);
        setByteElement(term14803, 33, (byte) 104);
        setByteElement(term14803, 34, (byte) 105);
        setByteElement(term14803, 35, (byte) 106);
        setByteElement(term14803, 36, (byte) 107);
        setByteElement(term14803, 37, (byte) 108);
        setByteElement(term14803, 38, (byte) 109);
        setByteElement(term14803, 39, (byte) 110);
        setByteElement(term14803, 40, (byte) 111);
        setByteElement(term14803, 41, (byte) 112);
        setByteElement(term14803, 42, (byte) 113);
        setByteElement(term14803, 43, (byte) 114);
        setByteElement(term14803, 44, (byte) 115);
        setByteElement(term14803, 45, (byte) 116);
        setByteElement(term14803, 46, (byte) 117);
        setByteElement(term14803, 47, (byte) 118);
        setByteElement(term14803, 48, (byte) 119);
        setByteElement(term14803, 49, (byte) 120);
        setByteElement(term14803, 50, (byte) 121);
        setByteElement(term14803, 51, (byte) 122);
        setByteElement(term14803, 52, (byte) 48);
        setByteElement(term14803, 53, (byte) 49);
        setByteElement(term14803, 54, (byte) 50);
        setByteElement(term14803, 55, (byte) 51);
        setByteElement(term14803, 56, (byte) 52);
        setByteElement(term14803, 57, (byte) 53);
        setByteElement(term14803, 58, (byte) 54);
        setByteElement(term14803, 59, (byte) 55);
        setByteElement(term14803, 60, (byte) 56);
        setByteElement(term14803, 61, (byte) 57);
        setByteElement(term14803, 62, (byte) 43);
        setByteElement(term14803, 63, (byte) 47);
        setField(term14802, term14802.getClass(), "encodeTable", term14803);
        setIntField(term14802, term14802.getClass(), "lineLength", 0);
        setByteElement(term14804, 0, (byte) 13);
        setByteElement(term14804, 1, (byte) 10);
        setField(term14802, term14802.getClass(), "lineSeparator", term14804);
        setIntField(term14802, term14802.getClass(), "decodeSize", 3);
        setIntField(term14802, term14802.getClass(), "encodeSize", 4);
        setField(term14802, term14802.getClass(), "buffer", null);
        setIntField(term14802, term14802.getClass(), "pos", 0);
        setIntField(term14802, term14802.getClass(), "readPos", 0);
        setIntField(term14802, term14802.getClass(), "currentLinePos", 0);
        setIntField(term14802, term14802.getClass(), "modulus", 0);
        setBooleanField(term14802, term14802.getClass(), "eof", false);
        setIntField(term14802, term14802.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14802));
    }

};


