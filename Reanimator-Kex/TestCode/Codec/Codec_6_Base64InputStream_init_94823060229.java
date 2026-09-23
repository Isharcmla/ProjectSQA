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

public class Base64InputStream_init_94823060229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10637;
     Object term11365;
     Object term11371;

    public Base64InputStream_init_94823060229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10467 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term10569 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInflaterInputStream"));
        setField(term10467, term10467.getClass(), "in", term10569);
        setField(term10467, term10467.getClass(), "singleByte", null);
        setBooleanField(term10467, term10467.getClass(), "doEncode", false);
        term10637 = newInstance(Class.forName("java.io.StringBufferInputStream"));
        term11365 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term11366 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term11367 = (byte[]) newByteArray(64);
        byte[] term11368 = (byte[]) newByteArray(2);
        byte[] term11369 = (byte[]) newByteArray(1);
        Object term11370 = newInstance(Class.forName("java.io.StringBufferInputStream"));
        setBooleanField(term11365, term11365.getClass(), "doEncode", false);
        setByteElement(term11367, 0, (byte) 65);
        setByteElement(term11367, 1, (byte) 66);
        setByteElement(term11367, 2, (byte) 67);
        setByteElement(term11367, 3, (byte) 68);
        setByteElement(term11367, 4, (byte) 69);
        setByteElement(term11367, 5, (byte) 70);
        setByteElement(term11367, 6, (byte) 71);
        setByteElement(term11367, 7, (byte) 72);
        setByteElement(term11367, 8, (byte) 73);
        setByteElement(term11367, 9, (byte) 74);
        setByteElement(term11367, 10, (byte) 75);
        setByteElement(term11367, 11, (byte) 76);
        setByteElement(term11367, 12, (byte) 77);
        setByteElement(term11367, 13, (byte) 78);
        setByteElement(term11367, 14, (byte) 79);
        setByteElement(term11367, 15, (byte) 80);
        setByteElement(term11367, 16, (byte) 81);
        setByteElement(term11367, 17, (byte) 82);
        setByteElement(term11367, 18, (byte) 83);
        setByteElement(term11367, 19, (byte) 84);
        setByteElement(term11367, 20, (byte) 85);
        setByteElement(term11367, 21, (byte) 86);
        setByteElement(term11367, 22, (byte) 87);
        setByteElement(term11367, 23, (byte) 88);
        setByteElement(term11367, 24, (byte) 89);
        setByteElement(term11367, 25, (byte) 90);
        setByteElement(term11367, 26, (byte) 97);
        setByteElement(term11367, 27, (byte) 98);
        setByteElement(term11367, 28, (byte) 99);
        setByteElement(term11367, 29, (byte) 100);
        setByteElement(term11367, 30, (byte) 101);
        setByteElement(term11367, 31, (byte) 102);
        setByteElement(term11367, 32, (byte) 103);
        setByteElement(term11367, 33, (byte) 104);
        setByteElement(term11367, 34, (byte) 105);
        setByteElement(term11367, 35, (byte) 106);
        setByteElement(term11367, 36, (byte) 107);
        setByteElement(term11367, 37, (byte) 108);
        setByteElement(term11367, 38, (byte) 109);
        setByteElement(term11367, 39, (byte) 110);
        setByteElement(term11367, 40, (byte) 111);
        setByteElement(term11367, 41, (byte) 112);
        setByteElement(term11367, 42, (byte) 113);
        setByteElement(term11367, 43, (byte) 114);
        setByteElement(term11367, 44, (byte) 115);
        setByteElement(term11367, 45, (byte) 116);
        setByteElement(term11367, 46, (byte) 117);
        setByteElement(term11367, 47, (byte) 118);
        setByteElement(term11367, 48, (byte) 119);
        setByteElement(term11367, 49, (byte) 120);
        setByteElement(term11367, 50, (byte) 121);
        setByteElement(term11367, 51, (byte) 122);
        setByteElement(term11367, 52, (byte) 48);
        setByteElement(term11367, 53, (byte) 49);
        setByteElement(term11367, 54, (byte) 50);
        setByteElement(term11367, 55, (byte) 51);
        setByteElement(term11367, 56, (byte) 52);
        setByteElement(term11367, 57, (byte) 53);
        setByteElement(term11367, 58, (byte) 54);
        setByteElement(term11367, 59, (byte) 55);
        setByteElement(term11367, 60, (byte) 56);
        setByteElement(term11367, 61, (byte) 57);
        setByteElement(term11367, 62, (byte) 43);
        setByteElement(term11367, 63, (byte) 47);
        setField(term11366, term11366.getClass(), "encodeTable", term11367);
        setIntField(term11366, term11366.getClass(), "lineLength", 76);
        setByteElement(term11368, 0, (byte) 13);
        setByteElement(term11368, 1, (byte) 10);
        setField(term11366, term11366.getClass(), "lineSeparator", term11368);
        setIntField(term11366, term11366.getClass(), "decodeSize", 5);
        setIntField(term11366, term11366.getClass(), "encodeSize", 6);
        setField(term11366, term11366.getClass(), "buffer", null);
        setIntField(term11366, term11366.getClass(), "pos", 0);
        setIntField(term11366, term11366.getClass(), "readPos", 0);
        setIntField(term11366, term11366.getClass(), "currentLinePos", 0);
        setIntField(term11366, term11366.getClass(), "modulus", 0);
        setBooleanField(term11366, term11366.getClass(), "eof", false);
        setIntField(term11366, term11366.getClass(), "x", 0);
        setField(term11365, term11365.getClass(), "base64", term11366);
        setField(term11365, term11365.getClass(), "singleByte", term11369);
        setField(term11370, term11370.getClass(), "buffer", null);
        setIntField(term11370, term11370.getClass(), "pos", 0);
        setIntField(term11370, term11370.getClass(), "count", 0);
        setField(term11365, term11365.getClass(), "in", term11370);
        term11371 = newInstance(Class.forName("java.io.StringBufferInputStream"));
        setField(term11371, term11371.getClass(), "buffer", null);
        setIntField(term11371, term11371.getClass(), "pos", 0);
        setIntField(term11371, term11371.getClass(), "count", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = term10637;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11365));
        assertTrue(recursiveEquals(term10637, term11371));
    }

};


