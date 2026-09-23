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

public class Base64InputStream_init_79931988028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8492;
     Object term11097;
     Object term11103;

    public Base64InputStream_init_79931988028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8350 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term8436 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInputStream"));
        setField(term8350, term8350.getClass(), "in", term8436);
        setField(term8350, term8350.getClass(), "singleByte", null);
        setBooleanField(term8350, term8350.getClass(), "doEncode", false);
        term8492 = newInstance(Class.forName("java.io.FilterInputStream"));
        term11097 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term11098 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term11099 = (byte[]) newByteArray(64);
        byte[] term11100 = (byte[]) newByteArray(2);
        byte[] term11101 = (byte[]) newByteArray(1);
        Object term11102 = newInstance(Class.forName("java.io.FilterInputStream"));
        setBooleanField(term11097, term11097.getClass(), "doEncode", true);
        setByteElement(term11099, 0, (byte) 65);
        setByteElement(term11099, 1, (byte) 66);
        setByteElement(term11099, 2, (byte) 67);
        setByteElement(term11099, 3, (byte) 68);
        setByteElement(term11099, 4, (byte) 69);
        setByteElement(term11099, 5, (byte) 70);
        setByteElement(term11099, 6, (byte) 71);
        setByteElement(term11099, 7, (byte) 72);
        setByteElement(term11099, 8, (byte) 73);
        setByteElement(term11099, 9, (byte) 74);
        setByteElement(term11099, 10, (byte) 75);
        setByteElement(term11099, 11, (byte) 76);
        setByteElement(term11099, 12, (byte) 77);
        setByteElement(term11099, 13, (byte) 78);
        setByteElement(term11099, 14, (byte) 79);
        setByteElement(term11099, 15, (byte) 80);
        setByteElement(term11099, 16, (byte) 81);
        setByteElement(term11099, 17, (byte) 82);
        setByteElement(term11099, 18, (byte) 83);
        setByteElement(term11099, 19, (byte) 84);
        setByteElement(term11099, 20, (byte) 85);
        setByteElement(term11099, 21, (byte) 86);
        setByteElement(term11099, 22, (byte) 87);
        setByteElement(term11099, 23, (byte) 88);
        setByteElement(term11099, 24, (byte) 89);
        setByteElement(term11099, 25, (byte) 90);
        setByteElement(term11099, 26, (byte) 97);
        setByteElement(term11099, 27, (byte) 98);
        setByteElement(term11099, 28, (byte) 99);
        setByteElement(term11099, 29, (byte) 100);
        setByteElement(term11099, 30, (byte) 101);
        setByteElement(term11099, 31, (byte) 102);
        setByteElement(term11099, 32, (byte) 103);
        setByteElement(term11099, 33, (byte) 104);
        setByteElement(term11099, 34, (byte) 105);
        setByteElement(term11099, 35, (byte) 106);
        setByteElement(term11099, 36, (byte) 107);
        setByteElement(term11099, 37, (byte) 108);
        setByteElement(term11099, 38, (byte) 109);
        setByteElement(term11099, 39, (byte) 110);
        setByteElement(term11099, 40, (byte) 111);
        setByteElement(term11099, 41, (byte) 112);
        setByteElement(term11099, 42, (byte) 113);
        setByteElement(term11099, 43, (byte) 114);
        setByteElement(term11099, 44, (byte) 115);
        setByteElement(term11099, 45, (byte) 116);
        setByteElement(term11099, 46, (byte) 117);
        setByteElement(term11099, 47, (byte) 118);
        setByteElement(term11099, 48, (byte) 119);
        setByteElement(term11099, 49, (byte) 120);
        setByteElement(term11099, 50, (byte) 121);
        setByteElement(term11099, 51, (byte) 122);
        setByteElement(term11099, 52, (byte) 48);
        setByteElement(term11099, 53, (byte) 49);
        setByteElement(term11099, 54, (byte) 50);
        setByteElement(term11099, 55, (byte) 51);
        setByteElement(term11099, 56, (byte) 52);
        setByteElement(term11099, 57, (byte) 53);
        setByteElement(term11099, 58, (byte) 54);
        setByteElement(term11099, 59, (byte) 55);
        setByteElement(term11099, 60, (byte) 56);
        setByteElement(term11099, 61, (byte) 57);
        setByteElement(term11099, 62, (byte) 43);
        setByteElement(term11099, 63, (byte) 47);
        setField(term11098, term11098.getClass(), "encodeTable", term11099);
        setIntField(term11098, term11098.getClass(), "lineLength", 0);
        setByteElement(term11100, 0, (byte) 13);
        setByteElement(term11100, 1, (byte) 10);
        setField(term11098, term11098.getClass(), "lineSeparator", term11100);
        setIntField(term11098, term11098.getClass(), "decodeSize", 3);
        setIntField(term11098, term11098.getClass(), "encodeSize", 4);
        setField(term11098, term11098.getClass(), "buffer", null);
        setIntField(term11098, term11098.getClass(), "pos", 0);
        setIntField(term11098, term11098.getClass(), "readPos", 0);
        setIntField(term11098, term11098.getClass(), "currentLinePos", 0);
        setIntField(term11098, term11098.getClass(), "modulus", 0);
        setBooleanField(term11098, term11098.getClass(), "eof", false);
        setIntField(term11098, term11098.getClass(), "x", 0);
        setField(term11097, term11097.getClass(), "base64", term11098);
        setField(term11097, term11097.getClass(), "singleByte", term11101);
        setField(term11102, term11102.getClass(), "in", null);
        setField(term11097, term11097.getClass(), "in", term11102);
        term11103 = newInstance(Class.forName("java.io.FilterInputStream"));
        setField(term11103, term11103.getClass(), "in", null);
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
        args[0] = term8492;
        args[1] = true;
        args[2] = 0;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11097));
        assertTrue(recursiveEquals(term8492, 0));
    }

};


