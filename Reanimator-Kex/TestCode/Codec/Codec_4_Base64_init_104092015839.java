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

public class Base64_init_104092015839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2735;

    public Base64_init_104092015839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2735 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term2736 = (byte[]) newByteArray(64);
        byte[] term2737 = (byte[]) newByteArray(2);
        setByteElement(term2736, 0, (byte) 65);
        setByteElement(term2736, 1, (byte) 66);
        setByteElement(term2736, 2, (byte) 67);
        setByteElement(term2736, 3, (byte) 68);
        setByteElement(term2736, 4, (byte) 69);
        setByteElement(term2736, 5, (byte) 70);
        setByteElement(term2736, 6, (byte) 71);
        setByteElement(term2736, 7, (byte) 72);
        setByteElement(term2736, 8, (byte) 73);
        setByteElement(term2736, 9, (byte) 74);
        setByteElement(term2736, 10, (byte) 75);
        setByteElement(term2736, 11, (byte) 76);
        setByteElement(term2736, 12, (byte) 77);
        setByteElement(term2736, 13, (byte) 78);
        setByteElement(term2736, 14, (byte) 79);
        setByteElement(term2736, 15, (byte) 80);
        setByteElement(term2736, 16, (byte) 81);
        setByteElement(term2736, 17, (byte) 82);
        setByteElement(term2736, 18, (byte) 83);
        setByteElement(term2736, 19, (byte) 84);
        setByteElement(term2736, 20, (byte) 85);
        setByteElement(term2736, 21, (byte) 86);
        setByteElement(term2736, 22, (byte) 87);
        setByteElement(term2736, 23, (byte) 88);
        setByteElement(term2736, 24, (byte) 89);
        setByteElement(term2736, 25, (byte) 90);
        setByteElement(term2736, 26, (byte) 97);
        setByteElement(term2736, 27, (byte) 98);
        setByteElement(term2736, 28, (byte) 99);
        setByteElement(term2736, 29, (byte) 100);
        setByteElement(term2736, 30, (byte) 101);
        setByteElement(term2736, 31, (byte) 102);
        setByteElement(term2736, 32, (byte) 103);
        setByteElement(term2736, 33, (byte) 104);
        setByteElement(term2736, 34, (byte) 105);
        setByteElement(term2736, 35, (byte) 106);
        setByteElement(term2736, 36, (byte) 107);
        setByteElement(term2736, 37, (byte) 108);
        setByteElement(term2736, 38, (byte) 109);
        setByteElement(term2736, 39, (byte) 110);
        setByteElement(term2736, 40, (byte) 111);
        setByteElement(term2736, 41, (byte) 112);
        setByteElement(term2736, 42, (byte) 113);
        setByteElement(term2736, 43, (byte) 114);
        setByteElement(term2736, 44, (byte) 115);
        setByteElement(term2736, 45, (byte) 116);
        setByteElement(term2736, 46, (byte) 117);
        setByteElement(term2736, 47, (byte) 118);
        setByteElement(term2736, 48, (byte) 119);
        setByteElement(term2736, 49, (byte) 120);
        setByteElement(term2736, 50, (byte) 121);
        setByteElement(term2736, 51, (byte) 122);
        setByteElement(term2736, 52, (byte) 48);
        setByteElement(term2736, 53, (byte) 49);
        setByteElement(term2736, 54, (byte) 50);
        setByteElement(term2736, 55, (byte) 51);
        setByteElement(term2736, 56, (byte) 52);
        setByteElement(term2736, 57, (byte) 53);
        setByteElement(term2736, 58, (byte) 54);
        setByteElement(term2736, 59, (byte) 55);
        setByteElement(term2736, 60, (byte) 56);
        setByteElement(term2736, 61, (byte) 57);
        setByteElement(term2736, 62, (byte) 43);
        setByteElement(term2736, 63, (byte) 47);
        setField(term2735, term2735.getClass(), "encodeTable", term2736);
        setIntField(term2735, term2735.getClass(), "lineLength", 76);
        setByteElement(term2737, 0, (byte) 13);
        setByteElement(term2737, 1, (byte) 10);
        setField(term2735, term2735.getClass(), "lineSeparator", term2737);
        setIntField(term2735, term2735.getClass(), "decodeSize", 5);
        setIntField(term2735, term2735.getClass(), "encodeSize", 6);
        setField(term2735, term2735.getClass(), "buffer", null);
        setIntField(term2735, term2735.getClass(), "pos", 0);
        setIntField(term2735, term2735.getClass(), "readPos", 0);
        setIntField(term2735, term2735.getClass(), "currentLinePos", 0);
        setIntField(term2735, term2735.getClass(), "modulus", 0);
        setBooleanField(term2735, term2735.getClass(), "eof", false);
        setIntField(term2735, term2735.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2735));
    }

};


