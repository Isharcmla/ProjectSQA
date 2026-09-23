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

public class Base64InputStream_init_79931988037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21275;
     Object term20961;
     Object term30867;
     Object term30873;
     Object term30874;

    public Base64InputStream_init_79931988037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21141 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term21211 = newInstance(Class.forName("java.util.zip.CheckedInputStream"));
        setField(term21141, term21141.getClass(), "in", term21211);
        setField(term21141, term21141.getClass(), "singleByte", null);
        setBooleanField(term21141, term21141.getClass(), "doEncode", false);
        term21275 = newInstance(Class.forName("java.util.zip.GZIPInputStream"));
        term20961 = (byte[]) newByteArray(8);
        setByteElement(term20961, 0, (byte) -128);
        term30867 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term30868 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term30869 = (byte[]) newByteArray(64);
        byte[] term30870 = (byte[]) newByteArray(8);
        byte[] term30871 = (byte[]) newByteArray(1);
        Object term30872 = newInstance(Class.forName("java.util.zip.GZIPInputStream"));
        setBooleanField(term30867, term30867.getClass(), "doEncode", true);
        setByteElement(term30869, 0, (byte) 65);
        setByteElement(term30869, 1, (byte) 66);
        setByteElement(term30869, 2, (byte) 67);
        setByteElement(term30869, 3, (byte) 68);
        setByteElement(term30869, 4, (byte) 69);
        setByteElement(term30869, 5, (byte) 70);
        setByteElement(term30869, 6, (byte) 71);
        setByteElement(term30869, 7, (byte) 72);
        setByteElement(term30869, 8, (byte) 73);
        setByteElement(term30869, 9, (byte) 74);
        setByteElement(term30869, 10, (byte) 75);
        setByteElement(term30869, 11, (byte) 76);
        setByteElement(term30869, 12, (byte) 77);
        setByteElement(term30869, 13, (byte) 78);
        setByteElement(term30869, 14, (byte) 79);
        setByteElement(term30869, 15, (byte) 80);
        setByteElement(term30869, 16, (byte) 81);
        setByteElement(term30869, 17, (byte) 82);
        setByteElement(term30869, 18, (byte) 83);
        setByteElement(term30869, 19, (byte) 84);
        setByteElement(term30869, 20, (byte) 85);
        setByteElement(term30869, 21, (byte) 86);
        setByteElement(term30869, 22, (byte) 87);
        setByteElement(term30869, 23, (byte) 88);
        setByteElement(term30869, 24, (byte) 89);
        setByteElement(term30869, 25, (byte) 90);
        setByteElement(term30869, 26, (byte) 97);
        setByteElement(term30869, 27, (byte) 98);
        setByteElement(term30869, 28, (byte) 99);
        setByteElement(term30869, 29, (byte) 100);
        setByteElement(term30869, 30, (byte) 101);
        setByteElement(term30869, 31, (byte) 102);
        setByteElement(term30869, 32, (byte) 103);
        setByteElement(term30869, 33, (byte) 104);
        setByteElement(term30869, 34, (byte) 105);
        setByteElement(term30869, 35, (byte) 106);
        setByteElement(term30869, 36, (byte) 107);
        setByteElement(term30869, 37, (byte) 108);
        setByteElement(term30869, 38, (byte) 109);
        setByteElement(term30869, 39, (byte) 110);
        setByteElement(term30869, 40, (byte) 111);
        setByteElement(term30869, 41, (byte) 112);
        setByteElement(term30869, 42, (byte) 113);
        setByteElement(term30869, 43, (byte) 114);
        setByteElement(term30869, 44, (byte) 115);
        setByteElement(term30869, 45, (byte) 116);
        setByteElement(term30869, 46, (byte) 117);
        setByteElement(term30869, 47, (byte) 118);
        setByteElement(term30869, 48, (byte) 119);
        setByteElement(term30869, 49, (byte) 120);
        setByteElement(term30869, 50, (byte) 121);
        setByteElement(term30869, 51, (byte) 122);
        setByteElement(term30869, 52, (byte) 48);
        setByteElement(term30869, 53, (byte) 49);
        setByteElement(term30869, 54, (byte) 50);
        setByteElement(term30869, 55, (byte) 51);
        setByteElement(term30869, 56, (byte) 52);
        setByteElement(term30869, 57, (byte) 53);
        setByteElement(term30869, 58, (byte) 54);
        setByteElement(term30869, 59, (byte) 55);
        setByteElement(term30869, 60, (byte) 56);
        setByteElement(term30869, 61, (byte) 57);
        setByteElement(term30869, 62, (byte) 43);
        setByteElement(term30869, 63, (byte) 47);
        setField(term30868, term30868.getClass(), "encodeTable", term30869);
        setIntField(term30868, term30868.getClass(), "lineLength", 0);
        setByteElement(term30870, 0, (byte) -128);
        setField(term30868, term30868.getClass(), "lineSeparator", term30870);
        setIntField(term30868, term30868.getClass(), "decodeSize", 11);
        setIntField(term30868, term30868.getClass(), "encodeSize", 12);
        setField(term30868, term30868.getClass(), "buffer", null);
        setIntField(term30868, term30868.getClass(), "pos", 0);
        setIntField(term30868, term30868.getClass(), "readPos", 0);
        setIntField(term30868, term30868.getClass(), "currentLinePos", 0);
        setIntField(term30868, term30868.getClass(), "modulus", 0);
        setBooleanField(term30868, term30868.getClass(), "eof", false);
        setIntField(term30868, term30868.getClass(), "x", 0);
        setField(term30867, term30867.getClass(), "base64", term30868);
        setField(term30867, term30867.getClass(), "singleByte", term30871);
        setField(term30872, term30872.getClass(), "crc", null);
        setBooleanField(term30872, term30872.getClass(), "eos", false);
        setBooleanField(term30872, term30872.getClass(), "closed", false);
        setField(term30872, term30872.getClass(), "tmpbuf", null);
        setField(term30872, term30872.getClass(), "inf", null);
        setField(term30872, term30872.getClass(), "buf", null);
        setIntField(term30872, term30872.getClass(), "len", 0);
        setBooleanField(term30872, term30872.getClass(), "reachEOF", false);
        setBooleanField(term30872, term30872.getClass(), "usesDefaultInflater", false);
        setField(term30872, term30872.getClass(), "singleByteBuf", null);
        setField(term30872, term30872.getClass(), "b", null);
        setField(term30872, term30872.getClass(), "in", null);
        setField(term30867, term30867.getClass(), "in", term30872);
        term30873 = (byte[]) newByteArray(8);
        setByteElement(term30873, 0, (byte) -128);
        term30874 = newInstance(Class.forName("java.util.zip.GZIPInputStream"));
        setField(term30874, term30874.getClass(), "crc", null);
        setBooleanField(term30874, term30874.getClass(), "eos", false);
        setBooleanField(term30874, term30874.getClass(), "closed", false);
        setField(term30874, term30874.getClass(), "tmpbuf", null);
        setField(term30874, term30874.getClass(), "inf", null);
        setField(term30874, term30874.getClass(), "buf", null);
        setIntField(term30874, term30874.getClass(), "len", 0);
        setBooleanField(term30874, term30874.getClass(), "reachEOF", false);
        setBooleanField(term30874, term30874.getClass(), "usesDefaultInflater", false);
        setField(term30874, term30874.getClass(), "singleByteBuf", null);
        setField(term30874, term30874.getClass(), "b", null);
        setField(term30874, term30874.getClass(), "in", null);
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
        args[0] = term21275;
        args[1] = true;
        args[2] = 1;
        args[3] = term20961;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30867));
        assertTrue(recursiveEquals(term21275, 1));
        assertTrue(recursiveEquals(term20961, true));
    }

};


