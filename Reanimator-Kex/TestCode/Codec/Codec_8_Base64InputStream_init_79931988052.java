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

public class Base64InputStream_init_79931988052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660600;
     Object term329754;
     Object term676980;
     Object term676986;
     Object term676987;

    public Base64InputStream_init_79931988052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term660444 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term660498 = newInstance(Class.forName("java.io.PipedInputStream"));
        setField(term660444, term660444.getClass(), "in", term660498);
        setField(term660444, term660444.getClass(), "singleByte", null);
        setBooleanField(term660444, term660444.getClass(), "doEncode", false);
        term660600 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInflaterInputStream"));
        term329754 = (byte[]) newByteArray(511);
        setByteElement(term329754, 330, (byte) -128);
        term676980 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term676981 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term676982 = (byte[]) newByteArray(64);
        byte[] term676983 = (byte[]) newByteArray(511);
        byte[] term676984 = (byte[]) newByteArray(1);
        Object term676985 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInflaterInputStream"));
        setBooleanField(term676980, term676980.getClass(), "doEncode", true);
        setByteElement(term676982, 0, (byte) 65);
        setByteElement(term676982, 1, (byte) 66);
        setByteElement(term676982, 2, (byte) 67);
        setByteElement(term676982, 3, (byte) 68);
        setByteElement(term676982, 4, (byte) 69);
        setByteElement(term676982, 5, (byte) 70);
        setByteElement(term676982, 6, (byte) 71);
        setByteElement(term676982, 7, (byte) 72);
        setByteElement(term676982, 8, (byte) 73);
        setByteElement(term676982, 9, (byte) 74);
        setByteElement(term676982, 10, (byte) 75);
        setByteElement(term676982, 11, (byte) 76);
        setByteElement(term676982, 12, (byte) 77);
        setByteElement(term676982, 13, (byte) 78);
        setByteElement(term676982, 14, (byte) 79);
        setByteElement(term676982, 15, (byte) 80);
        setByteElement(term676982, 16, (byte) 81);
        setByteElement(term676982, 17, (byte) 82);
        setByteElement(term676982, 18, (byte) 83);
        setByteElement(term676982, 19, (byte) 84);
        setByteElement(term676982, 20, (byte) 85);
        setByteElement(term676982, 21, (byte) 86);
        setByteElement(term676982, 22, (byte) 87);
        setByteElement(term676982, 23, (byte) 88);
        setByteElement(term676982, 24, (byte) 89);
        setByteElement(term676982, 25, (byte) 90);
        setByteElement(term676982, 26, (byte) 97);
        setByteElement(term676982, 27, (byte) 98);
        setByteElement(term676982, 28, (byte) 99);
        setByteElement(term676982, 29, (byte) 100);
        setByteElement(term676982, 30, (byte) 101);
        setByteElement(term676982, 31, (byte) 102);
        setByteElement(term676982, 32, (byte) 103);
        setByteElement(term676982, 33, (byte) 104);
        setByteElement(term676982, 34, (byte) 105);
        setByteElement(term676982, 35, (byte) 106);
        setByteElement(term676982, 36, (byte) 107);
        setByteElement(term676982, 37, (byte) 108);
        setByteElement(term676982, 38, (byte) 109);
        setByteElement(term676982, 39, (byte) 110);
        setByteElement(term676982, 40, (byte) 111);
        setByteElement(term676982, 41, (byte) 112);
        setByteElement(term676982, 42, (byte) 113);
        setByteElement(term676982, 43, (byte) 114);
        setByteElement(term676982, 44, (byte) 115);
        setByteElement(term676982, 45, (byte) 116);
        setByteElement(term676982, 46, (byte) 117);
        setByteElement(term676982, 47, (byte) 118);
        setByteElement(term676982, 48, (byte) 119);
        setByteElement(term676982, 49, (byte) 120);
        setByteElement(term676982, 50, (byte) 121);
        setByteElement(term676982, 51, (byte) 122);
        setByteElement(term676982, 52, (byte) 48);
        setByteElement(term676982, 53, (byte) 49);
        setByteElement(term676982, 54, (byte) 50);
        setByteElement(term676982, 55, (byte) 51);
        setByteElement(term676982, 56, (byte) 52);
        setByteElement(term676982, 57, (byte) 53);
        setByteElement(term676982, 58, (byte) 54);
        setByteElement(term676982, 59, (byte) 55);
        setByteElement(term676982, 60, (byte) 56);
        setByteElement(term676982, 61, (byte) 57);
        setByteElement(term676982, 62, (byte) 43);
        setByteElement(term676982, 63, (byte) 47);
        setField(term676981, term676981.getClass(), "encodeTable", term676982);
        setIntField(term676981, term676981.getClass(), "lineLength", 0);
        setByteElement(term676983, 330, (byte) -128);
        setField(term676981, term676981.getClass(), "lineSeparator", term676983);
        setIntField(term676981, term676981.getClass(), "decodeSize", 3);
        setIntField(term676981, term676981.getClass(), "encodeSize", 4);
        setField(term676981, term676981.getClass(), "buffer", null);
        setIntField(term676981, term676981.getClass(), "pos", 0);
        setIntField(term676981, term676981.getClass(), "readPos", 0);
        setIntField(term676981, term676981.getClass(), "currentLinePos", 0);
        setIntField(term676981, term676981.getClass(), "modulus", 0);
        setBooleanField(term676981, term676981.getClass(), "eof", false);
        setIntField(term676981, term676981.getClass(), "x", 0);
        setField(term676980, term676980.getClass(), "base64", term676981);
        setField(term676980, term676980.getClass(), "singleByte", term676984);
        setBooleanField(term676985, term676985.getClass(), "closeRequested", false);
        setBooleanField(term676985, term676985.getClass(), "eof", false);
        setField(term676985, term676985.getClass(), "cleanable", null);
        setField(term676985, term676985.getClass(), "this$0", null);
        setField(term676985, term676985.getClass(), "inf", null);
        setField(term676985, term676985.getClass(), "buf", null);
        setIntField(term676985, term676985.getClass(), "len", 0);
        setBooleanField(term676985, term676985.getClass(), "closed", false);
        setBooleanField(term676985, term676985.getClass(), "reachEOF", false);
        setBooleanField(term676985, term676985.getClass(), "usesDefaultInflater", false);
        setField(term676985, term676985.getClass(), "singleByteBuf", null);
        setField(term676985, term676985.getClass(), "b", null);
        setField(term676985, term676985.getClass(), "in", null);
        setField(term676980, term676980.getClass(), "in", term676985);
        term676986 = (byte[]) newByteArray(511);
        setByteElement(term676986, 330, (byte) -128);
        term676987 = newInstance(Class.forName("java.util.zip.ZipFile$ZipFileInflaterInputStream"));
        setBooleanField(term676987, term676987.getClass(), "closeRequested", false);
        setBooleanField(term676987, term676987.getClass(), "eof", false);
        setField(term676987, term676987.getClass(), "cleanable", null);
        setField(term676987, term676987.getClass(), "this$0", null);
        setField(term676987, term676987.getClass(), "inf", null);
        setField(term676987, term676987.getClass(), "buf", null);
        setIntField(term676987, term676987.getClass(), "len", 0);
        setBooleanField(term676987, term676987.getClass(), "closed", false);
        setBooleanField(term676987, term676987.getClass(), "reachEOF", false);
        setBooleanField(term676987, term676987.getClass(), "usesDefaultInflater", false);
        setField(term676987, term676987.getClass(), "singleByteBuf", null);
        setField(term676987, term676987.getClass(), "b", null);
        setField(term676987, term676987.getClass(), "in", null);
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
        args[0] = term660600;
        args[1] = true;
        args[2] = 0;
        args[3] = term329754;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term676980));
        assertTrue(recursiveEquals(term660600, 0));
        assertTrue(recursiveEquals(term329754, true));
    }

};


