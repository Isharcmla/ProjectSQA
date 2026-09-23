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

public class Base64InputStream_init_79931988053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term572403;
     Object term296038;
     Object term1023243;
     Object term1023249;
     Object term1023250;

    public Base64InputStream_init_79931988053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term572211 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term572283 = newInstance(Class.forName("java.util.zip.DeflaterInputStream"));
        setField(term572211, term572211.getClass(), "in", term572283);
        setField(term572211, term572211.getClass(), "singleByte", null);
        setBooleanField(term572211, term572211.getClass(), "doEncode", false);
        term572403 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseProcessPipeInputStream"));
        term296038 = (byte[]) newByteArray(278);
        setByteElement(term296038, 0, (byte) -128);
        setByteElement(term296038, 4, (byte) -128);
        term1023243 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term1023244 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term1023245 = (byte[]) newByteArray(64);
        byte[] term1023246 = (byte[]) newByteArray(278);
        byte[] term1023247 = (byte[]) newByteArray(1);
        Object term1023248 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseProcessPipeInputStream"));
        setBooleanField(term1023243, term1023243.getClass(), "doEncode", true);
        setByteElement(term1023245, 0, (byte) 65);
        setByteElement(term1023245, 1, (byte) 66);
        setByteElement(term1023245, 2, (byte) 67);
        setByteElement(term1023245, 3, (byte) 68);
        setByteElement(term1023245, 4, (byte) 69);
        setByteElement(term1023245, 5, (byte) 70);
        setByteElement(term1023245, 6, (byte) 71);
        setByteElement(term1023245, 7, (byte) 72);
        setByteElement(term1023245, 8, (byte) 73);
        setByteElement(term1023245, 9, (byte) 74);
        setByteElement(term1023245, 10, (byte) 75);
        setByteElement(term1023245, 11, (byte) 76);
        setByteElement(term1023245, 12, (byte) 77);
        setByteElement(term1023245, 13, (byte) 78);
        setByteElement(term1023245, 14, (byte) 79);
        setByteElement(term1023245, 15, (byte) 80);
        setByteElement(term1023245, 16, (byte) 81);
        setByteElement(term1023245, 17, (byte) 82);
        setByteElement(term1023245, 18, (byte) 83);
        setByteElement(term1023245, 19, (byte) 84);
        setByteElement(term1023245, 20, (byte) 85);
        setByteElement(term1023245, 21, (byte) 86);
        setByteElement(term1023245, 22, (byte) 87);
        setByteElement(term1023245, 23, (byte) 88);
        setByteElement(term1023245, 24, (byte) 89);
        setByteElement(term1023245, 25, (byte) 90);
        setByteElement(term1023245, 26, (byte) 97);
        setByteElement(term1023245, 27, (byte) 98);
        setByteElement(term1023245, 28, (byte) 99);
        setByteElement(term1023245, 29, (byte) 100);
        setByteElement(term1023245, 30, (byte) 101);
        setByteElement(term1023245, 31, (byte) 102);
        setByteElement(term1023245, 32, (byte) 103);
        setByteElement(term1023245, 33, (byte) 104);
        setByteElement(term1023245, 34, (byte) 105);
        setByteElement(term1023245, 35, (byte) 106);
        setByteElement(term1023245, 36, (byte) 107);
        setByteElement(term1023245, 37, (byte) 108);
        setByteElement(term1023245, 38, (byte) 109);
        setByteElement(term1023245, 39, (byte) 110);
        setByteElement(term1023245, 40, (byte) 111);
        setByteElement(term1023245, 41, (byte) 112);
        setByteElement(term1023245, 42, (byte) 113);
        setByteElement(term1023245, 43, (byte) 114);
        setByteElement(term1023245, 44, (byte) 115);
        setByteElement(term1023245, 45, (byte) 116);
        setByteElement(term1023245, 46, (byte) 117);
        setByteElement(term1023245, 47, (byte) 118);
        setByteElement(term1023245, 48, (byte) 119);
        setByteElement(term1023245, 49, (byte) 120);
        setByteElement(term1023245, 50, (byte) 121);
        setByteElement(term1023245, 51, (byte) 122);
        setByteElement(term1023245, 52, (byte) 48);
        setByteElement(term1023245, 53, (byte) 49);
        setByteElement(term1023245, 54, (byte) 50);
        setByteElement(term1023245, 55, (byte) 51);
        setByteElement(term1023245, 56, (byte) 52);
        setByteElement(term1023245, 57, (byte) 53);
        setByteElement(term1023245, 58, (byte) 54);
        setByteElement(term1023245, 59, (byte) 55);
        setByteElement(term1023245, 60, (byte) 56);
        setByteElement(term1023245, 61, (byte) 57);
        setByteElement(term1023245, 62, (byte) 43);
        setByteElement(term1023245, 63, (byte) 47);
        setField(term1023244, term1023244.getClass(), "encodeTable", term1023245);
        setIntField(term1023244, term1023244.getClass(), "lineLength", 0);
        setByteElement(term1023246, 0, (byte) -128);
        setByteElement(term1023246, 4, (byte) -128);
        setField(term1023244, term1023244.getClass(), "lineSeparator", term1023246);
        setIntField(term1023244, term1023244.getClass(), "decodeSize", 281);
        setIntField(term1023244, term1023244.getClass(), "encodeSize", 282);
        setField(term1023244, term1023244.getClass(), "buffer", null);
        setIntField(term1023244, term1023244.getClass(), "pos", 0);
        setIntField(term1023244, term1023244.getClass(), "readPos", 0);
        setIntField(term1023244, term1023244.getClass(), "currentLinePos", 0);
        setIntField(term1023244, term1023244.getClass(), "modulus", 0);
        setBooleanField(term1023244, term1023244.getClass(), "eof", false);
        setIntField(term1023244, term1023244.getClass(), "x", 0);
        setField(term1023243, term1023243.getClass(), "base64", term1023244);
        setField(term1023243, term1023243.getClass(), "singleByte", term1023247);
        setField(term1023248, term1023248.getClass(), "closeLock", null);
        setIntField(term1023248, term1023248.getClass(), "useCount", 0);
        setBooleanField(term1023248, term1023248.getClass(), "closePending", false);
        setField(term1023248, term1023248.getClass(), "buf", null);
        setIntField(term1023248, term1023248.getClass(), "count", 0);
        setIntField(term1023248, term1023248.getClass(), "pos", 0);
        setIntField(term1023248, term1023248.getClass(), "markpos", 0);
        setIntField(term1023248, term1023248.getClass(), "marklimit", 0);
        setField(term1023248, term1023248.getClass(), "in", null);
        setField(term1023243, term1023243.getClass(), "in", term1023248);
        term1023249 = (byte[]) newByteArray(278);
        setByteElement(term1023249, 0, (byte) -128);
        setByteElement(term1023249, 4, (byte) -128);
        term1023250 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseProcessPipeInputStream"));
        setField(term1023250, term1023250.getClass(), "closeLock", null);
        setIntField(term1023250, term1023250.getClass(), "useCount", 0);
        setBooleanField(term1023250, term1023250.getClass(), "closePending", false);
        setField(term1023250, term1023250.getClass(), "buf", null);
        setIntField(term1023250, term1023250.getClass(), "count", 0);
        setIntField(term1023250, term1023250.getClass(), "pos", 0);
        setIntField(term1023250, term1023250.getClass(), "markpos", 0);
        setIntField(term1023250, term1023250.getClass(), "marklimit", 0);
        setField(term1023250, term1023250.getClass(), "in", null);
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
        args[0] = term572403;
        args[1] = true;
        args[2] = 1;
        args[3] = term296038;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1023243));
        assertTrue(recursiveEquals(term572403, 1));
        assertTrue(recursiveEquals(term296038, true));
    }

};


