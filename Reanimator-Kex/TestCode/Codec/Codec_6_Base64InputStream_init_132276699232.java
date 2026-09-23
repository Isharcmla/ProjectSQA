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

public class Base64InputStream_init_132276699232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11784;
     Object term17236;
     Object term17242;

    public Base64InputStream_init_132276699232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11604 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term11664 = newInstance(Class.forName("java.io.PushbackInputStream"));
        setField(term11604, term11604.getClass(), "in", term11664);
        setField(term11604, term11604.getClass(), "singleByte", null);
        setBooleanField(term11604, term11604.getClass(), "doEncode", false);
        term11784 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseProcessPipeInputStream"));
        term17236 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term17237 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term17238 = (byte[]) newByteArray(64);
        byte[] term17239 = (byte[]) newByteArray(2);
        byte[] term17240 = (byte[]) newByteArray(1);
        Object term17241 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseProcessPipeInputStream"));
        setBooleanField(term17236, term17236.getClass(), "doEncode", true);
        setByteElement(term17238, 0, (byte) 65);
        setByteElement(term17238, 1, (byte) 66);
        setByteElement(term17238, 2, (byte) 67);
        setByteElement(term17238, 3, (byte) 68);
        setByteElement(term17238, 4, (byte) 69);
        setByteElement(term17238, 5, (byte) 70);
        setByteElement(term17238, 6, (byte) 71);
        setByteElement(term17238, 7, (byte) 72);
        setByteElement(term17238, 8, (byte) 73);
        setByteElement(term17238, 9, (byte) 74);
        setByteElement(term17238, 10, (byte) 75);
        setByteElement(term17238, 11, (byte) 76);
        setByteElement(term17238, 12, (byte) 77);
        setByteElement(term17238, 13, (byte) 78);
        setByteElement(term17238, 14, (byte) 79);
        setByteElement(term17238, 15, (byte) 80);
        setByteElement(term17238, 16, (byte) 81);
        setByteElement(term17238, 17, (byte) 82);
        setByteElement(term17238, 18, (byte) 83);
        setByteElement(term17238, 19, (byte) 84);
        setByteElement(term17238, 20, (byte) 85);
        setByteElement(term17238, 21, (byte) 86);
        setByteElement(term17238, 22, (byte) 87);
        setByteElement(term17238, 23, (byte) 88);
        setByteElement(term17238, 24, (byte) 89);
        setByteElement(term17238, 25, (byte) 90);
        setByteElement(term17238, 26, (byte) 97);
        setByteElement(term17238, 27, (byte) 98);
        setByteElement(term17238, 28, (byte) 99);
        setByteElement(term17238, 29, (byte) 100);
        setByteElement(term17238, 30, (byte) 101);
        setByteElement(term17238, 31, (byte) 102);
        setByteElement(term17238, 32, (byte) 103);
        setByteElement(term17238, 33, (byte) 104);
        setByteElement(term17238, 34, (byte) 105);
        setByteElement(term17238, 35, (byte) 106);
        setByteElement(term17238, 36, (byte) 107);
        setByteElement(term17238, 37, (byte) 108);
        setByteElement(term17238, 38, (byte) 109);
        setByteElement(term17238, 39, (byte) 110);
        setByteElement(term17238, 40, (byte) 111);
        setByteElement(term17238, 41, (byte) 112);
        setByteElement(term17238, 42, (byte) 113);
        setByteElement(term17238, 43, (byte) 114);
        setByteElement(term17238, 44, (byte) 115);
        setByteElement(term17238, 45, (byte) 116);
        setByteElement(term17238, 46, (byte) 117);
        setByteElement(term17238, 47, (byte) 118);
        setByteElement(term17238, 48, (byte) 119);
        setByteElement(term17238, 49, (byte) 120);
        setByteElement(term17238, 50, (byte) 121);
        setByteElement(term17238, 51, (byte) 122);
        setByteElement(term17238, 52, (byte) 48);
        setByteElement(term17238, 53, (byte) 49);
        setByteElement(term17238, 54, (byte) 50);
        setByteElement(term17238, 55, (byte) 51);
        setByteElement(term17238, 56, (byte) 52);
        setByteElement(term17238, 57, (byte) 53);
        setByteElement(term17238, 58, (byte) 54);
        setByteElement(term17238, 59, (byte) 55);
        setByteElement(term17238, 60, (byte) 56);
        setByteElement(term17238, 61, (byte) 57);
        setByteElement(term17238, 62, (byte) 43);
        setByteElement(term17238, 63, (byte) 47);
        setField(term17237, term17237.getClass(), "encodeTable", term17238);
        setIntField(term17237, term17237.getClass(), "lineLength", 76);
        setByteElement(term17239, 0, (byte) 13);
        setByteElement(term17239, 1, (byte) 10);
        setField(term17237, term17237.getClass(), "lineSeparator", term17239);
        setIntField(term17237, term17237.getClass(), "decodeSize", 5);
        setIntField(term17237, term17237.getClass(), "encodeSize", 6);
        setField(term17237, term17237.getClass(), "buffer", null);
        setIntField(term17237, term17237.getClass(), "pos", 0);
        setIntField(term17237, term17237.getClass(), "readPos", 0);
        setIntField(term17237, term17237.getClass(), "currentLinePos", 0);
        setIntField(term17237, term17237.getClass(), "modulus", 0);
        setBooleanField(term17237, term17237.getClass(), "eof", false);
        setIntField(term17237, term17237.getClass(), "x", 0);
        setField(term17236, term17236.getClass(), "base64", term17237);
        setField(term17236, term17236.getClass(), "singleByte", term17240);
        setField(term17241, term17241.getClass(), "closeLock", null);
        setIntField(term17241, term17241.getClass(), "useCount", 0);
        setBooleanField(term17241, term17241.getClass(), "closePending", false);
        setField(term17241, term17241.getClass(), "buf", null);
        setIntField(term17241, term17241.getClass(), "count", 0);
        setIntField(term17241, term17241.getClass(), "pos", 0);
        setIntField(term17241, term17241.getClass(), "markpos", 0);
        setIntField(term17241, term17241.getClass(), "marklimit", 0);
        setField(term17241, term17241.getClass(), "in", null);
        setField(term17236, term17236.getClass(), "in", term17241);
        term17242 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseProcessPipeInputStream"));
        setField(term17242, term17242.getClass(), "closeLock", null);
        setIntField(term17242, term17242.getClass(), "useCount", 0);
        setBooleanField(term17242, term17242.getClass(), "closePending", false);
        setField(term17242, term17242.getClass(), "buf", null);
        setIntField(term17242, term17242.getClass(), "count", 0);
        setIntField(term17242, term17242.getClass(), "pos", 0);
        setIntField(term17242, term17242.getClass(), "markpos", 0);
        setIntField(term17242, term17242.getClass(), "marklimit", 0);
        setField(term17242, term17242.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term11784;
        args[1] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17236));
        assertTrue(recursiveEquals(term11784, term17242));
    }

};


