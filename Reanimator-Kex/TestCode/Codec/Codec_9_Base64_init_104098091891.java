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

public class Base64_init_104098091891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12875;
     Object term43199;
     Object term43202;

    public Base64_init_104098091891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14465 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term14465, term14465.getClass(), "lineLength", 0);
        setField(term14465, term14465.getClass(), "lineSeparator", null);
        setIntField(term14465, term14465.getClass(), "encodeSize", 0);
        setIntField(term14465, term14465.getClass(), "decodeSize", 0);
        term12875 = (byte[]) newByteArray(489);
        setByteElement(term12875, 0, (byte) -128);
        term43199 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term43200 = (byte[]) newByteArray(64);
        byte[] term43201 = (byte[]) newByteArray(489);
        setByteElement(term43200, 0, (byte) 65);
        setByteElement(term43200, 1, (byte) 66);
        setByteElement(term43200, 2, (byte) 67);
        setByteElement(term43200, 3, (byte) 68);
        setByteElement(term43200, 4, (byte) 69);
        setByteElement(term43200, 5, (byte) 70);
        setByteElement(term43200, 6, (byte) 71);
        setByteElement(term43200, 7, (byte) 72);
        setByteElement(term43200, 8, (byte) 73);
        setByteElement(term43200, 9, (byte) 74);
        setByteElement(term43200, 10, (byte) 75);
        setByteElement(term43200, 11, (byte) 76);
        setByteElement(term43200, 12, (byte) 77);
        setByteElement(term43200, 13, (byte) 78);
        setByteElement(term43200, 14, (byte) 79);
        setByteElement(term43200, 15, (byte) 80);
        setByteElement(term43200, 16, (byte) 81);
        setByteElement(term43200, 17, (byte) 82);
        setByteElement(term43200, 18, (byte) 83);
        setByteElement(term43200, 19, (byte) 84);
        setByteElement(term43200, 20, (byte) 85);
        setByteElement(term43200, 21, (byte) 86);
        setByteElement(term43200, 22, (byte) 87);
        setByteElement(term43200, 23, (byte) 88);
        setByteElement(term43200, 24, (byte) 89);
        setByteElement(term43200, 25, (byte) 90);
        setByteElement(term43200, 26, (byte) 97);
        setByteElement(term43200, 27, (byte) 98);
        setByteElement(term43200, 28, (byte) 99);
        setByteElement(term43200, 29, (byte) 100);
        setByteElement(term43200, 30, (byte) 101);
        setByteElement(term43200, 31, (byte) 102);
        setByteElement(term43200, 32, (byte) 103);
        setByteElement(term43200, 33, (byte) 104);
        setByteElement(term43200, 34, (byte) 105);
        setByteElement(term43200, 35, (byte) 106);
        setByteElement(term43200, 36, (byte) 107);
        setByteElement(term43200, 37, (byte) 108);
        setByteElement(term43200, 38, (byte) 109);
        setByteElement(term43200, 39, (byte) 110);
        setByteElement(term43200, 40, (byte) 111);
        setByteElement(term43200, 41, (byte) 112);
        setByteElement(term43200, 42, (byte) 113);
        setByteElement(term43200, 43, (byte) 114);
        setByteElement(term43200, 44, (byte) 115);
        setByteElement(term43200, 45, (byte) 116);
        setByteElement(term43200, 46, (byte) 117);
        setByteElement(term43200, 47, (byte) 118);
        setByteElement(term43200, 48, (byte) 119);
        setByteElement(term43200, 49, (byte) 120);
        setByteElement(term43200, 50, (byte) 121);
        setByteElement(term43200, 51, (byte) 122);
        setByteElement(term43200, 52, (byte) 48);
        setByteElement(term43200, 53, (byte) 49);
        setByteElement(term43200, 54, (byte) 50);
        setByteElement(term43200, 55, (byte) 51);
        setByteElement(term43200, 56, (byte) 52);
        setByteElement(term43200, 57, (byte) 53);
        setByteElement(term43200, 58, (byte) 54);
        setByteElement(term43200, 59, (byte) 55);
        setByteElement(term43200, 60, (byte) 56);
        setByteElement(term43200, 61, (byte) 57);
        setByteElement(term43200, 62, (byte) 43);
        setByteElement(term43200, 63, (byte) 47);
        setField(term43199, term43199.getClass(), "encodeTable", term43200);
        setIntField(term43199, term43199.getClass(), "lineLength", 0);
        setByteElement(term43201, 0, (byte) -128);
        setField(term43199, term43199.getClass(), "lineSeparator", term43201);
        setIntField(term43199, term43199.getClass(), "decodeSize", 492);
        setIntField(term43199, term43199.getClass(), "encodeSize", 493);
        setField(term43199, term43199.getClass(), "buffer", null);
        setIntField(term43199, term43199.getClass(), "pos", 0);
        setIntField(term43199, term43199.getClass(), "readPos", 0);
        setIntField(term43199, term43199.getClass(), "currentLinePos", 0);
        setIntField(term43199, term43199.getClass(), "modulus", 0);
        setBooleanField(term43199, term43199.getClass(), "eof", false);
        setIntField(term43199, term43199.getClass(), "x", 0);
        term43202 = (byte[]) newByteArray(489);
        setByteElement(term43202, 0, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = 1;
        args[1] = term12875;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term43199));
        assertTrue(recursiveEquals(term12875, term43202));
    }

};


