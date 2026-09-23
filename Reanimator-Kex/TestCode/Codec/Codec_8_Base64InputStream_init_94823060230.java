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

public class Base64InputStream_init_94823060230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18147;
     Object term20883;
     Object term20889;

    public Base64InputStream_init_94823060230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17989 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term18091 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInflaterInputStream"));
        setField(term17989, term17989.getClass(), "in", term18091);
        setField(term17989, term17989.getClass(), "singleByte", null);
        setBooleanField(term17989, term17989.getClass(), "doEncode", false);
        term18147 = newInstance(Class.forName("java.io.FilterInputStream"));
        term20883 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term20884 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term20885 = (byte[]) newByteArray(64);
        byte[] term20886 = (byte[]) newByteArray(2);
        byte[] term20887 = (byte[]) newByteArray(1);
        Object term20888 = newInstance(Class.forName("java.io.FilterInputStream"));
        setBooleanField(term20883, term20883.getClass(), "doEncode", false);
        setByteElement(term20885, 0, (byte) 65);
        setByteElement(term20885, 1, (byte) 66);
        setByteElement(term20885, 2, (byte) 67);
        setByteElement(term20885, 3, (byte) 68);
        setByteElement(term20885, 4, (byte) 69);
        setByteElement(term20885, 5, (byte) 70);
        setByteElement(term20885, 6, (byte) 71);
        setByteElement(term20885, 7, (byte) 72);
        setByteElement(term20885, 8, (byte) 73);
        setByteElement(term20885, 9, (byte) 74);
        setByteElement(term20885, 10, (byte) 75);
        setByteElement(term20885, 11, (byte) 76);
        setByteElement(term20885, 12, (byte) 77);
        setByteElement(term20885, 13, (byte) 78);
        setByteElement(term20885, 14, (byte) 79);
        setByteElement(term20885, 15, (byte) 80);
        setByteElement(term20885, 16, (byte) 81);
        setByteElement(term20885, 17, (byte) 82);
        setByteElement(term20885, 18, (byte) 83);
        setByteElement(term20885, 19, (byte) 84);
        setByteElement(term20885, 20, (byte) 85);
        setByteElement(term20885, 21, (byte) 86);
        setByteElement(term20885, 22, (byte) 87);
        setByteElement(term20885, 23, (byte) 88);
        setByteElement(term20885, 24, (byte) 89);
        setByteElement(term20885, 25, (byte) 90);
        setByteElement(term20885, 26, (byte) 97);
        setByteElement(term20885, 27, (byte) 98);
        setByteElement(term20885, 28, (byte) 99);
        setByteElement(term20885, 29, (byte) 100);
        setByteElement(term20885, 30, (byte) 101);
        setByteElement(term20885, 31, (byte) 102);
        setByteElement(term20885, 32, (byte) 103);
        setByteElement(term20885, 33, (byte) 104);
        setByteElement(term20885, 34, (byte) 105);
        setByteElement(term20885, 35, (byte) 106);
        setByteElement(term20885, 36, (byte) 107);
        setByteElement(term20885, 37, (byte) 108);
        setByteElement(term20885, 38, (byte) 109);
        setByteElement(term20885, 39, (byte) 110);
        setByteElement(term20885, 40, (byte) 111);
        setByteElement(term20885, 41, (byte) 112);
        setByteElement(term20885, 42, (byte) 113);
        setByteElement(term20885, 43, (byte) 114);
        setByteElement(term20885, 44, (byte) 115);
        setByteElement(term20885, 45, (byte) 116);
        setByteElement(term20885, 46, (byte) 117);
        setByteElement(term20885, 47, (byte) 118);
        setByteElement(term20885, 48, (byte) 119);
        setByteElement(term20885, 49, (byte) 120);
        setByteElement(term20885, 50, (byte) 121);
        setByteElement(term20885, 51, (byte) 122);
        setByteElement(term20885, 52, (byte) 48);
        setByteElement(term20885, 53, (byte) 49);
        setByteElement(term20885, 54, (byte) 50);
        setByteElement(term20885, 55, (byte) 51);
        setByteElement(term20885, 56, (byte) 52);
        setByteElement(term20885, 57, (byte) 53);
        setByteElement(term20885, 58, (byte) 54);
        setByteElement(term20885, 59, (byte) 55);
        setByteElement(term20885, 60, (byte) 56);
        setByteElement(term20885, 61, (byte) 57);
        setByteElement(term20885, 62, (byte) 43);
        setByteElement(term20885, 63, (byte) 47);
        setField(term20884, term20884.getClass(), "encodeTable", term20885);
        setIntField(term20884, term20884.getClass(), "lineLength", 76);
        setByteElement(term20886, 0, (byte) 13);
        setByteElement(term20886, 1, (byte) 10);
        setField(term20884, term20884.getClass(), "lineSeparator", term20886);
        setIntField(term20884, term20884.getClass(), "decodeSize", 5);
        setIntField(term20884, term20884.getClass(), "encodeSize", 6);
        setField(term20884, term20884.getClass(), "buffer", null);
        setIntField(term20884, term20884.getClass(), "pos", 0);
        setIntField(term20884, term20884.getClass(), "readPos", 0);
        setIntField(term20884, term20884.getClass(), "currentLinePos", 0);
        setIntField(term20884, term20884.getClass(), "modulus", 0);
        setBooleanField(term20884, term20884.getClass(), "eof", false);
        setIntField(term20884, term20884.getClass(), "x", 0);
        setField(term20883, term20883.getClass(), "base64", term20884);
        setField(term20883, term20883.getClass(), "singleByte", term20887);
        setField(term20888, term20888.getClass(), "in", null);
        setField(term20883, term20883.getClass(), "in", term20888);
        term20889 = newInstance(Class.forName("java.io.FilterInputStream"));
        setField(term20889, term20889.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = term18147;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term20883));
        assertTrue(recursiveEquals(term18147, term20889));
    }

};


