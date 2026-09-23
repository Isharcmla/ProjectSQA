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

public class Base64InputStream_init_79931988038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16547;
     Object term11789;
     Object term32407;
     Object term32413;
     Object term32414;

    public Base64InputStream_init_79931988038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16415 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term16477 = newInstance(Class.forName("java.nio.channels.Channels$2"));
        setField(term16415, term16415.getClass(), "in", term16477);
        setField(term16415, term16415.getClass(), "singleByte", null);
        setBooleanField(term16415, term16415.getClass(), "doEncode", false);
        term16547 = newInstance(Class.forName("java.util.zip.CheckedInputStream"));
        term11789 = (byte[]) newByteArray(489);
        setByteElement(term11789, 0, (byte) -128);
        setByteElement(term11789, 4, (byte) -128);
        term32407 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term32408 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term32409 = (byte[]) newByteArray(64);
        byte[] term32410 = (byte[]) newByteArray(489);
        byte[] term32411 = (byte[]) newByteArray(1);
        Object term32412 = newInstance(Class.forName("java.util.zip.CheckedInputStream"));
        setBooleanField(term32407, term32407.getClass(), "doEncode", true);
        setByteElement(term32409, 0, (byte) 65);
        setByteElement(term32409, 1, (byte) 66);
        setByteElement(term32409, 2, (byte) 67);
        setByteElement(term32409, 3, (byte) 68);
        setByteElement(term32409, 4, (byte) 69);
        setByteElement(term32409, 5, (byte) 70);
        setByteElement(term32409, 6, (byte) 71);
        setByteElement(term32409, 7, (byte) 72);
        setByteElement(term32409, 8, (byte) 73);
        setByteElement(term32409, 9, (byte) 74);
        setByteElement(term32409, 10, (byte) 75);
        setByteElement(term32409, 11, (byte) 76);
        setByteElement(term32409, 12, (byte) 77);
        setByteElement(term32409, 13, (byte) 78);
        setByteElement(term32409, 14, (byte) 79);
        setByteElement(term32409, 15, (byte) 80);
        setByteElement(term32409, 16, (byte) 81);
        setByteElement(term32409, 17, (byte) 82);
        setByteElement(term32409, 18, (byte) 83);
        setByteElement(term32409, 19, (byte) 84);
        setByteElement(term32409, 20, (byte) 85);
        setByteElement(term32409, 21, (byte) 86);
        setByteElement(term32409, 22, (byte) 87);
        setByteElement(term32409, 23, (byte) 88);
        setByteElement(term32409, 24, (byte) 89);
        setByteElement(term32409, 25, (byte) 90);
        setByteElement(term32409, 26, (byte) 97);
        setByteElement(term32409, 27, (byte) 98);
        setByteElement(term32409, 28, (byte) 99);
        setByteElement(term32409, 29, (byte) 100);
        setByteElement(term32409, 30, (byte) 101);
        setByteElement(term32409, 31, (byte) 102);
        setByteElement(term32409, 32, (byte) 103);
        setByteElement(term32409, 33, (byte) 104);
        setByteElement(term32409, 34, (byte) 105);
        setByteElement(term32409, 35, (byte) 106);
        setByteElement(term32409, 36, (byte) 107);
        setByteElement(term32409, 37, (byte) 108);
        setByteElement(term32409, 38, (byte) 109);
        setByteElement(term32409, 39, (byte) 110);
        setByteElement(term32409, 40, (byte) 111);
        setByteElement(term32409, 41, (byte) 112);
        setByteElement(term32409, 42, (byte) 113);
        setByteElement(term32409, 43, (byte) 114);
        setByteElement(term32409, 44, (byte) 115);
        setByteElement(term32409, 45, (byte) 116);
        setByteElement(term32409, 46, (byte) 117);
        setByteElement(term32409, 47, (byte) 118);
        setByteElement(term32409, 48, (byte) 119);
        setByteElement(term32409, 49, (byte) 120);
        setByteElement(term32409, 50, (byte) 121);
        setByteElement(term32409, 51, (byte) 122);
        setByteElement(term32409, 52, (byte) 48);
        setByteElement(term32409, 53, (byte) 49);
        setByteElement(term32409, 54, (byte) 50);
        setByteElement(term32409, 55, (byte) 51);
        setByteElement(term32409, 56, (byte) 52);
        setByteElement(term32409, 57, (byte) 53);
        setByteElement(term32409, 58, (byte) 54);
        setByteElement(term32409, 59, (byte) 55);
        setByteElement(term32409, 60, (byte) 56);
        setByteElement(term32409, 61, (byte) 57);
        setByteElement(term32409, 62, (byte) 43);
        setByteElement(term32409, 63, (byte) 47);
        setField(term32408, term32408.getClass(), "encodeTable", term32409);
        setIntField(term32408, term32408.getClass(), "lineLength", 0);
        setByteElement(term32410, 0, (byte) -128);
        setByteElement(term32410, 4, (byte) -128);
        setField(term32408, term32408.getClass(), "lineSeparator", term32410);
        setIntField(term32408, term32408.getClass(), "decodeSize", 492);
        setIntField(term32408, term32408.getClass(), "encodeSize", 493);
        setField(term32408, term32408.getClass(), "buffer", null);
        setIntField(term32408, term32408.getClass(), "pos", 0);
        setIntField(term32408, term32408.getClass(), "readPos", 0);
        setIntField(term32408, term32408.getClass(), "currentLinePos", 0);
        setIntField(term32408, term32408.getClass(), "modulus", 0);
        setBooleanField(term32408, term32408.getClass(), "eof", false);
        setIntField(term32408, term32408.getClass(), "x", 0);
        setField(term32407, term32407.getClass(), "base64", term32408);
        setField(term32407, term32407.getClass(), "singleByte", term32411);
        setField(term32412, term32412.getClass(), "cksum", null);
        setField(term32412, term32412.getClass(), "in", null);
        setField(term32407, term32407.getClass(), "in", term32412);
        term32413 = (byte[]) newByteArray(489);
        setByteElement(term32413, 0, (byte) -128);
        setByteElement(term32413, 4, (byte) -128);
        term32414 = newInstance(Class.forName("java.util.zip.CheckedInputStream"));
        setField(term32414, term32414.getClass(), "cksum", null);
        setField(term32414, term32414.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = term16547;
        args[1] = true;
        args[2] = 1;
        args[3] = term11789;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32407));
        assertTrue(recursiveEquals(term16547, 1));
        assertTrue(recursiveEquals(term11789, true));
    }

};


