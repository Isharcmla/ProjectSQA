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

public class Base64_init_104092208042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term2963;

    public Base64_init_104092208042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = new Integer(568599855);
        term2963 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term2964 = (byte[]) newByteArray(64);
        byte[] term2965 = (byte[]) newByteArray(2);
        setByteElement(term2964, 0, (byte) 65);
        setByteElement(term2964, 1, (byte) 66);
        setByteElement(term2964, 2, (byte) 67);
        setByteElement(term2964, 3, (byte) 68);
        setByteElement(term2964, 4, (byte) 69);
        setByteElement(term2964, 5, (byte) 70);
        setByteElement(term2964, 6, (byte) 71);
        setByteElement(term2964, 7, (byte) 72);
        setByteElement(term2964, 8, (byte) 73);
        setByteElement(term2964, 9, (byte) 74);
        setByteElement(term2964, 10, (byte) 75);
        setByteElement(term2964, 11, (byte) 76);
        setByteElement(term2964, 12, (byte) 77);
        setByteElement(term2964, 13, (byte) 78);
        setByteElement(term2964, 14, (byte) 79);
        setByteElement(term2964, 15, (byte) 80);
        setByteElement(term2964, 16, (byte) 81);
        setByteElement(term2964, 17, (byte) 82);
        setByteElement(term2964, 18, (byte) 83);
        setByteElement(term2964, 19, (byte) 84);
        setByteElement(term2964, 20, (byte) 85);
        setByteElement(term2964, 21, (byte) 86);
        setByteElement(term2964, 22, (byte) 87);
        setByteElement(term2964, 23, (byte) 88);
        setByteElement(term2964, 24, (byte) 89);
        setByteElement(term2964, 25, (byte) 90);
        setByteElement(term2964, 26, (byte) 97);
        setByteElement(term2964, 27, (byte) 98);
        setByteElement(term2964, 28, (byte) 99);
        setByteElement(term2964, 29, (byte) 100);
        setByteElement(term2964, 30, (byte) 101);
        setByteElement(term2964, 31, (byte) 102);
        setByteElement(term2964, 32, (byte) 103);
        setByteElement(term2964, 33, (byte) 104);
        setByteElement(term2964, 34, (byte) 105);
        setByteElement(term2964, 35, (byte) 106);
        setByteElement(term2964, 36, (byte) 107);
        setByteElement(term2964, 37, (byte) 108);
        setByteElement(term2964, 38, (byte) 109);
        setByteElement(term2964, 39, (byte) 110);
        setByteElement(term2964, 40, (byte) 111);
        setByteElement(term2964, 41, (byte) 112);
        setByteElement(term2964, 42, (byte) 113);
        setByteElement(term2964, 43, (byte) 114);
        setByteElement(term2964, 44, (byte) 115);
        setByteElement(term2964, 45, (byte) 116);
        setByteElement(term2964, 46, (byte) 117);
        setByteElement(term2964, 47, (byte) 118);
        setByteElement(term2964, 48, (byte) 119);
        setByteElement(term2964, 49, (byte) 120);
        setByteElement(term2964, 50, (byte) 121);
        setByteElement(term2964, 51, (byte) 122);
        setByteElement(term2964, 52, (byte) 48);
        setByteElement(term2964, 53, (byte) 49);
        setByteElement(term2964, 54, (byte) 50);
        setByteElement(term2964, 55, (byte) 51);
        setByteElement(term2964, 56, (byte) 52);
        setByteElement(term2964, 57, (byte) 53);
        setByteElement(term2964, 58, (byte) 54);
        setByteElement(term2964, 59, (byte) 55);
        setByteElement(term2964, 60, (byte) 56);
        setByteElement(term2964, 61, (byte) 57);
        setByteElement(term2964, 62, (byte) 43);
        setByteElement(term2964, 63, (byte) 47);
        setField(term2963, term2963.getClass(), "encodeTable", term2964);
        setIntField(term2963, term2963.getClass(), "lineLength", 568599852);
        setByteElement(term2965, 0, (byte) 13);
        setByteElement(term2965, 1, (byte) 10);
        setField(term2963, term2963.getClass(), "lineSeparator", term2965);
        setIntField(term2963, term2963.getClass(), "decodeSize", 5);
        setIntField(term2963, term2963.getClass(), "encodeSize", 6);
        setField(term2963, term2963.getClass(), "buffer", null);
        setIntField(term2963, term2963.getClass(), "pos", 0);
        setIntField(term2963, term2963.getClass(), "readPos", 0);
        setIntField(term2963, term2963.getClass(), "currentLinePos", 0);
        setIntField(term2963, term2963.getClass(), "modulus", 0);
        setBooleanField(term2963, term2963.getClass(), "eof", false);
        setIntField(term2963, term2963.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2963));
        assertTrue(recursiveEquals(term3, 568599855));
    }

};


