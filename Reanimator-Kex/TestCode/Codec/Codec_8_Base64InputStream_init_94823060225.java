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

public class Base64InputStream_init_94823060225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12693;
     Object term13153;
     Object term13159;

    public Base64InputStream_init_94823060225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12573 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term12641 = newInstance(Class.forName("java.io.StringBufferInputStream"));
        setField(term12573, term12573.getClass(), "in", term12641);
        setField(term12573, term12573.getClass(), "singleByte", null);
        setBooleanField(term12573, term12573.getClass(), "doEncode", false);
        term12693 = newInstance(Class.forName("java.io.DataInputStream"));
        term13153 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term13154 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term13155 = (byte[]) newByteArray(64);
        byte[] term13156 = (byte[]) newByteArray(2);
        byte[] term13157 = (byte[]) newByteArray(1);
        Object term13158 = newInstance(Class.forName("java.io.DataInputStream"));
        setBooleanField(term13153, term13153.getClass(), "doEncode", false);
        setByteElement(term13155, 0, (byte) 65);
        setByteElement(term13155, 1, (byte) 66);
        setByteElement(term13155, 2, (byte) 67);
        setByteElement(term13155, 3, (byte) 68);
        setByteElement(term13155, 4, (byte) 69);
        setByteElement(term13155, 5, (byte) 70);
        setByteElement(term13155, 6, (byte) 71);
        setByteElement(term13155, 7, (byte) 72);
        setByteElement(term13155, 8, (byte) 73);
        setByteElement(term13155, 9, (byte) 74);
        setByteElement(term13155, 10, (byte) 75);
        setByteElement(term13155, 11, (byte) 76);
        setByteElement(term13155, 12, (byte) 77);
        setByteElement(term13155, 13, (byte) 78);
        setByteElement(term13155, 14, (byte) 79);
        setByteElement(term13155, 15, (byte) 80);
        setByteElement(term13155, 16, (byte) 81);
        setByteElement(term13155, 17, (byte) 82);
        setByteElement(term13155, 18, (byte) 83);
        setByteElement(term13155, 19, (byte) 84);
        setByteElement(term13155, 20, (byte) 85);
        setByteElement(term13155, 21, (byte) 86);
        setByteElement(term13155, 22, (byte) 87);
        setByteElement(term13155, 23, (byte) 88);
        setByteElement(term13155, 24, (byte) 89);
        setByteElement(term13155, 25, (byte) 90);
        setByteElement(term13155, 26, (byte) 97);
        setByteElement(term13155, 27, (byte) 98);
        setByteElement(term13155, 28, (byte) 99);
        setByteElement(term13155, 29, (byte) 100);
        setByteElement(term13155, 30, (byte) 101);
        setByteElement(term13155, 31, (byte) 102);
        setByteElement(term13155, 32, (byte) 103);
        setByteElement(term13155, 33, (byte) 104);
        setByteElement(term13155, 34, (byte) 105);
        setByteElement(term13155, 35, (byte) 106);
        setByteElement(term13155, 36, (byte) 107);
        setByteElement(term13155, 37, (byte) 108);
        setByteElement(term13155, 38, (byte) 109);
        setByteElement(term13155, 39, (byte) 110);
        setByteElement(term13155, 40, (byte) 111);
        setByteElement(term13155, 41, (byte) 112);
        setByteElement(term13155, 42, (byte) 113);
        setByteElement(term13155, 43, (byte) 114);
        setByteElement(term13155, 44, (byte) 115);
        setByteElement(term13155, 45, (byte) 116);
        setByteElement(term13155, 46, (byte) 117);
        setByteElement(term13155, 47, (byte) 118);
        setByteElement(term13155, 48, (byte) 119);
        setByteElement(term13155, 49, (byte) 120);
        setByteElement(term13155, 50, (byte) 121);
        setByteElement(term13155, 51, (byte) 122);
        setByteElement(term13155, 52, (byte) 48);
        setByteElement(term13155, 53, (byte) 49);
        setByteElement(term13155, 54, (byte) 50);
        setByteElement(term13155, 55, (byte) 51);
        setByteElement(term13155, 56, (byte) 52);
        setByteElement(term13155, 57, (byte) 53);
        setByteElement(term13155, 58, (byte) 54);
        setByteElement(term13155, 59, (byte) 55);
        setByteElement(term13155, 60, (byte) 56);
        setByteElement(term13155, 61, (byte) 57);
        setByteElement(term13155, 62, (byte) 43);
        setByteElement(term13155, 63, (byte) 47);
        setField(term13154, term13154.getClass(), "encodeTable", term13155);
        setIntField(term13154, term13154.getClass(), "lineLength", 76);
        setByteElement(term13156, 0, (byte) 13);
        setByteElement(term13156, 1, (byte) 10);
        setField(term13154, term13154.getClass(), "lineSeparator", term13156);
        setIntField(term13154, term13154.getClass(), "decodeSize", 5);
        setIntField(term13154, term13154.getClass(), "encodeSize", 6);
        setField(term13154, term13154.getClass(), "buffer", null);
        setIntField(term13154, term13154.getClass(), "pos", 0);
        setIntField(term13154, term13154.getClass(), "readPos", 0);
        setIntField(term13154, term13154.getClass(), "currentLinePos", 0);
        setIntField(term13154, term13154.getClass(), "modulus", 0);
        setBooleanField(term13154, term13154.getClass(), "eof", false);
        setIntField(term13154, term13154.getClass(), "x", 0);
        setField(term13153, term13153.getClass(), "base64", term13154);
        setField(term13153, term13153.getClass(), "singleByte", term13157);
        setField(term13158, term13158.getClass(), "bytearr", null);
        setField(term13158, term13158.getClass(), "chararr", null);
        setField(term13158, term13158.getClass(), "readBuffer", null);
        setField(term13158, term13158.getClass(), "lineBuffer", null);
        setField(term13158, term13158.getClass(), "in", null);
        setField(term13153, term13153.getClass(), "in", term13158);
        term13159 = newInstance(Class.forName("java.io.DataInputStream"));
        setField(term13159, term13159.getClass(), "bytearr", null);
        setField(term13159, term13159.getClass(), "chararr", null);
        setField(term13159, term13159.getClass(), "readBuffer", null);
        setField(term13159, term13159.getClass(), "lineBuffer", null);
        setField(term13159, term13159.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = term12693;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13153));
        assertTrue(recursiveEquals(term12693, term13159));
    }

};


