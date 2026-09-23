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

public class Base64_init_104092208085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33796;

    public Base64_init_104092208085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33686 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setIntField(term33686, term33686.getClass(), "lineLength", 0);
        setField(term33686, term33686.getClass(), "lineSeparator", null);
        setIntField(term33686, term33686.getClass(), "encodeSize", 0);
        setIntField(term33686, term33686.getClass(), "decodeSize", 0);
        term33796 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term33797 = (byte[]) newByteArray(64);
        byte[] term33798 = (byte[]) newByteArray(2);
        setByteElement(term33797, 0, (byte) 65);
        setByteElement(term33797, 1, (byte) 66);
        setByteElement(term33797, 2, (byte) 67);
        setByteElement(term33797, 3, (byte) 68);
        setByteElement(term33797, 4, (byte) 69);
        setByteElement(term33797, 5, (byte) 70);
        setByteElement(term33797, 6, (byte) 71);
        setByteElement(term33797, 7, (byte) 72);
        setByteElement(term33797, 8, (byte) 73);
        setByteElement(term33797, 9, (byte) 74);
        setByteElement(term33797, 10, (byte) 75);
        setByteElement(term33797, 11, (byte) 76);
        setByteElement(term33797, 12, (byte) 77);
        setByteElement(term33797, 13, (byte) 78);
        setByteElement(term33797, 14, (byte) 79);
        setByteElement(term33797, 15, (byte) 80);
        setByteElement(term33797, 16, (byte) 81);
        setByteElement(term33797, 17, (byte) 82);
        setByteElement(term33797, 18, (byte) 83);
        setByteElement(term33797, 19, (byte) 84);
        setByteElement(term33797, 20, (byte) 85);
        setByteElement(term33797, 21, (byte) 86);
        setByteElement(term33797, 22, (byte) 87);
        setByteElement(term33797, 23, (byte) 88);
        setByteElement(term33797, 24, (byte) 89);
        setByteElement(term33797, 25, (byte) 90);
        setByteElement(term33797, 26, (byte) 97);
        setByteElement(term33797, 27, (byte) 98);
        setByteElement(term33797, 28, (byte) 99);
        setByteElement(term33797, 29, (byte) 100);
        setByteElement(term33797, 30, (byte) 101);
        setByteElement(term33797, 31, (byte) 102);
        setByteElement(term33797, 32, (byte) 103);
        setByteElement(term33797, 33, (byte) 104);
        setByteElement(term33797, 34, (byte) 105);
        setByteElement(term33797, 35, (byte) 106);
        setByteElement(term33797, 36, (byte) 107);
        setByteElement(term33797, 37, (byte) 108);
        setByteElement(term33797, 38, (byte) 109);
        setByteElement(term33797, 39, (byte) 110);
        setByteElement(term33797, 40, (byte) 111);
        setByteElement(term33797, 41, (byte) 112);
        setByteElement(term33797, 42, (byte) 113);
        setByteElement(term33797, 43, (byte) 114);
        setByteElement(term33797, 44, (byte) 115);
        setByteElement(term33797, 45, (byte) 116);
        setByteElement(term33797, 46, (byte) 117);
        setByteElement(term33797, 47, (byte) 118);
        setByteElement(term33797, 48, (byte) 119);
        setByteElement(term33797, 49, (byte) 120);
        setByteElement(term33797, 50, (byte) 121);
        setByteElement(term33797, 51, (byte) 122);
        setByteElement(term33797, 52, (byte) 48);
        setByteElement(term33797, 53, (byte) 49);
        setByteElement(term33797, 54, (byte) 50);
        setByteElement(term33797, 55, (byte) 51);
        setByteElement(term33797, 56, (byte) 52);
        setByteElement(term33797, 57, (byte) 53);
        setByteElement(term33797, 58, (byte) 54);
        setByteElement(term33797, 59, (byte) 55);
        setByteElement(term33797, 60, (byte) 56);
        setByteElement(term33797, 61, (byte) 57);
        setByteElement(term33797, 62, (byte) 43);
        setByteElement(term33797, 63, (byte) 47);
        setField(term33796, term33796.getClass(), "encodeTable", term33797);
        setIntField(term33796, term33796.getClass(), "lineLength", 0);
        setByteElement(term33798, 0, (byte) 13);
        setByteElement(term33798, 1, (byte) 10);
        setField(term33796, term33796.getClass(), "lineSeparator", term33798);
        setIntField(term33796, term33796.getClass(), "decodeSize", 5);
        setIntField(term33796, term33796.getClass(), "encodeSize", 6);
        setField(term33796, term33796.getClass(), "buffer", null);
        setIntField(term33796, term33796.getClass(), "pos", 0);
        setIntField(term33796, term33796.getClass(), "readPos", 0);
        setIntField(term33796, term33796.getClass(), "currentLinePos", 0);
        setIntField(term33796, term33796.getClass(), "modulus", 0);
        setBooleanField(term33796, term33796.getClass(), "eof", false);
        setIntField(term33796, term33796.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33796));
    }

};


