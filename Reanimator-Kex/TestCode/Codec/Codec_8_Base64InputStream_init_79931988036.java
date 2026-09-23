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

public class Base64InputStream_init_79931988036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20201;
     Object term19407;
     Object term29059;
     Object term29065;
     Object term29066;

    public Base64InputStream_init_79931988036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20021 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term20081 = newInstance(Class.forName("java.io.PushbackInputStream"));
        setField(term20021, term20021.getClass(), "in", term20081);
        setField(term20021, term20021.getClass(), "singleByte", null);
        setBooleanField(term20021, term20021.getClass(), "doEncode", false);
        term20201 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseProcessPipeInputStream"));
        term19407 = (byte[]) newByteArray(489);
        term29059 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term29060 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term29061 = (byte[]) newByteArray(64);
        byte[] term29062 = (byte[]) newByteArray(489);
        byte[] term29063 = (byte[]) newByteArray(1);
        Object term29064 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseProcessPipeInputStream"));
        setBooleanField(term29059, term29059.getClass(), "doEncode", true);
        setByteElement(term29061, 0, (byte) 65);
        setByteElement(term29061, 1, (byte) 66);
        setByteElement(term29061, 2, (byte) 67);
        setByteElement(term29061, 3, (byte) 68);
        setByteElement(term29061, 4, (byte) 69);
        setByteElement(term29061, 5, (byte) 70);
        setByteElement(term29061, 6, (byte) 71);
        setByteElement(term29061, 7, (byte) 72);
        setByteElement(term29061, 8, (byte) 73);
        setByteElement(term29061, 9, (byte) 74);
        setByteElement(term29061, 10, (byte) 75);
        setByteElement(term29061, 11, (byte) 76);
        setByteElement(term29061, 12, (byte) 77);
        setByteElement(term29061, 13, (byte) 78);
        setByteElement(term29061, 14, (byte) 79);
        setByteElement(term29061, 15, (byte) 80);
        setByteElement(term29061, 16, (byte) 81);
        setByteElement(term29061, 17, (byte) 82);
        setByteElement(term29061, 18, (byte) 83);
        setByteElement(term29061, 19, (byte) 84);
        setByteElement(term29061, 20, (byte) 85);
        setByteElement(term29061, 21, (byte) 86);
        setByteElement(term29061, 22, (byte) 87);
        setByteElement(term29061, 23, (byte) 88);
        setByteElement(term29061, 24, (byte) 89);
        setByteElement(term29061, 25, (byte) 90);
        setByteElement(term29061, 26, (byte) 97);
        setByteElement(term29061, 27, (byte) 98);
        setByteElement(term29061, 28, (byte) 99);
        setByteElement(term29061, 29, (byte) 100);
        setByteElement(term29061, 30, (byte) 101);
        setByteElement(term29061, 31, (byte) 102);
        setByteElement(term29061, 32, (byte) 103);
        setByteElement(term29061, 33, (byte) 104);
        setByteElement(term29061, 34, (byte) 105);
        setByteElement(term29061, 35, (byte) 106);
        setByteElement(term29061, 36, (byte) 107);
        setByteElement(term29061, 37, (byte) 108);
        setByteElement(term29061, 38, (byte) 109);
        setByteElement(term29061, 39, (byte) 110);
        setByteElement(term29061, 40, (byte) 111);
        setByteElement(term29061, 41, (byte) 112);
        setByteElement(term29061, 42, (byte) 113);
        setByteElement(term29061, 43, (byte) 114);
        setByteElement(term29061, 44, (byte) 115);
        setByteElement(term29061, 45, (byte) 116);
        setByteElement(term29061, 46, (byte) 117);
        setByteElement(term29061, 47, (byte) 118);
        setByteElement(term29061, 48, (byte) 119);
        setByteElement(term29061, 49, (byte) 120);
        setByteElement(term29061, 50, (byte) 121);
        setByteElement(term29061, 51, (byte) 122);
        setByteElement(term29061, 52, (byte) 48);
        setByteElement(term29061, 53, (byte) 49);
        setByteElement(term29061, 54, (byte) 50);
        setByteElement(term29061, 55, (byte) 51);
        setByteElement(term29061, 56, (byte) 52);
        setByteElement(term29061, 57, (byte) 53);
        setByteElement(term29061, 58, (byte) 54);
        setByteElement(term29061, 59, (byte) 55);
        setByteElement(term29061, 60, (byte) 56);
        setByteElement(term29061, 61, (byte) 57);
        setByteElement(term29061, 62, (byte) 43);
        setByteElement(term29061, 63, (byte) 47);
        setField(term29060, term29060.getClass(), "encodeTable", term29061);
        setIntField(term29060, term29060.getClass(), "lineLength", 0);
        setField(term29060, term29060.getClass(), "lineSeparator", term29062);
        setIntField(term29060, term29060.getClass(), "decodeSize", 3);
        setIntField(term29060, term29060.getClass(), "encodeSize", 4);
        setField(term29060, term29060.getClass(), "buffer", null);
        setIntField(term29060, term29060.getClass(), "pos", 0);
        setIntField(term29060, term29060.getClass(), "readPos", 0);
        setIntField(term29060, term29060.getClass(), "currentLinePos", 0);
        setIntField(term29060, term29060.getClass(), "modulus", 0);
        setBooleanField(term29060, term29060.getClass(), "eof", false);
        setIntField(term29060, term29060.getClass(), "x", 0);
        setField(term29059, term29059.getClass(), "base64", term29060);
        setField(term29059, term29059.getClass(), "singleByte", term29063);
        setField(term29064, term29064.getClass(), "closeLock", null);
        setIntField(term29064, term29064.getClass(), "useCount", 0);
        setBooleanField(term29064, term29064.getClass(), "closePending", false);
        setField(term29064, term29064.getClass(), "buf", null);
        setIntField(term29064, term29064.getClass(), "count", 0);
        setIntField(term29064, term29064.getClass(), "pos", 0);
        setIntField(term29064, term29064.getClass(), "markpos", 0);
        setIntField(term29064, term29064.getClass(), "marklimit", 0);
        setField(term29064, term29064.getClass(), "in", null);
        setField(term29059, term29059.getClass(), "in", term29064);
        term29065 = (byte[]) newByteArray(489);
        term29066 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseProcessPipeInputStream"));
        setField(term29066, term29066.getClass(), "closeLock", null);
        setIntField(term29066, term29066.getClass(), "useCount", 0);
        setBooleanField(term29066, term29066.getClass(), "closePending", false);
        setField(term29066, term29066.getClass(), "buf", null);
        setIntField(term29066, term29066.getClass(), "count", 0);
        setIntField(term29066, term29066.getClass(), "pos", 0);
        setIntField(term29066, term29066.getClass(), "markpos", 0);
        setIntField(term29066, term29066.getClass(), "marklimit", 0);
        setField(term29066, term29066.getClass(), "in", null);
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
        args[0] = term20201;
        args[1] = true;
        args[2] = 0;
        args[3] = term19407;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term29059));
        assertTrue(recursiveEquals(term20201, 0));
        assertTrue(recursiveEquals(term19407, true));
    }

};


