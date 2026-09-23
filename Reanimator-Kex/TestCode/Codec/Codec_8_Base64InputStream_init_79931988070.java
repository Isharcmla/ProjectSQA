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

public class Base64InputStream_init_79931988070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1063299;
     Object term844027;
     Object term1313833;
     Object term1313839;
     Object term1313840;

    public Base64InputStream_init_79931988070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1063167 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term1063239 = newInstance(Class.forName("java.util.zip.DeflaterInputStream"));
        setField(term1063167, term1063167.getClass(), "in", term1063239);
        setField(term1063167, term1063167.getClass(), "singleByte", null);
        setBooleanField(term1063167, term1063167.getClass(), "doEncode", false);
        term1063299 = newInstance(Class.forName("java.io.PushbackInputStream"));
        term844027 = (byte[]) newByteArray(219);
        term1313833 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term1313834 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term1313835 = (byte[]) newByteArray(64);
        byte[] term1313836 = (byte[]) newByteArray(219);
        byte[] term1313837 = (byte[]) newByteArray(1);
        Object term1313838 = newInstance(Class.forName("java.io.PushbackInputStream"));
        setBooleanField(term1313833, term1313833.getClass(), "doEncode", true);
        setByteElement(term1313835, 0, (byte) 65);
        setByteElement(term1313835, 1, (byte) 66);
        setByteElement(term1313835, 2, (byte) 67);
        setByteElement(term1313835, 3, (byte) 68);
        setByteElement(term1313835, 4, (byte) 69);
        setByteElement(term1313835, 5, (byte) 70);
        setByteElement(term1313835, 6, (byte) 71);
        setByteElement(term1313835, 7, (byte) 72);
        setByteElement(term1313835, 8, (byte) 73);
        setByteElement(term1313835, 9, (byte) 74);
        setByteElement(term1313835, 10, (byte) 75);
        setByteElement(term1313835, 11, (byte) 76);
        setByteElement(term1313835, 12, (byte) 77);
        setByteElement(term1313835, 13, (byte) 78);
        setByteElement(term1313835, 14, (byte) 79);
        setByteElement(term1313835, 15, (byte) 80);
        setByteElement(term1313835, 16, (byte) 81);
        setByteElement(term1313835, 17, (byte) 82);
        setByteElement(term1313835, 18, (byte) 83);
        setByteElement(term1313835, 19, (byte) 84);
        setByteElement(term1313835, 20, (byte) 85);
        setByteElement(term1313835, 21, (byte) 86);
        setByteElement(term1313835, 22, (byte) 87);
        setByteElement(term1313835, 23, (byte) 88);
        setByteElement(term1313835, 24, (byte) 89);
        setByteElement(term1313835, 25, (byte) 90);
        setByteElement(term1313835, 26, (byte) 97);
        setByteElement(term1313835, 27, (byte) 98);
        setByteElement(term1313835, 28, (byte) 99);
        setByteElement(term1313835, 29, (byte) 100);
        setByteElement(term1313835, 30, (byte) 101);
        setByteElement(term1313835, 31, (byte) 102);
        setByteElement(term1313835, 32, (byte) 103);
        setByteElement(term1313835, 33, (byte) 104);
        setByteElement(term1313835, 34, (byte) 105);
        setByteElement(term1313835, 35, (byte) 106);
        setByteElement(term1313835, 36, (byte) 107);
        setByteElement(term1313835, 37, (byte) 108);
        setByteElement(term1313835, 38, (byte) 109);
        setByteElement(term1313835, 39, (byte) 110);
        setByteElement(term1313835, 40, (byte) 111);
        setByteElement(term1313835, 41, (byte) 112);
        setByteElement(term1313835, 42, (byte) 113);
        setByteElement(term1313835, 43, (byte) 114);
        setByteElement(term1313835, 44, (byte) 115);
        setByteElement(term1313835, 45, (byte) 116);
        setByteElement(term1313835, 46, (byte) 117);
        setByteElement(term1313835, 47, (byte) 118);
        setByteElement(term1313835, 48, (byte) 119);
        setByteElement(term1313835, 49, (byte) 120);
        setByteElement(term1313835, 50, (byte) 121);
        setByteElement(term1313835, 51, (byte) 122);
        setByteElement(term1313835, 52, (byte) 48);
        setByteElement(term1313835, 53, (byte) 49);
        setByteElement(term1313835, 54, (byte) 50);
        setByteElement(term1313835, 55, (byte) 51);
        setByteElement(term1313835, 56, (byte) 52);
        setByteElement(term1313835, 57, (byte) 53);
        setByteElement(term1313835, 58, (byte) 54);
        setByteElement(term1313835, 59, (byte) 55);
        setByteElement(term1313835, 60, (byte) 56);
        setByteElement(term1313835, 61, (byte) 57);
        setByteElement(term1313835, 62, (byte) 43);
        setByteElement(term1313835, 63, (byte) 47);
        setField(term1313834, term1313834.getClass(), "encodeTable", term1313835);
        setIntField(term1313834, term1313834.getClass(), "lineLength", 0);
        setField(term1313834, term1313834.getClass(), "lineSeparator", term1313836);
        setIntField(term1313834, term1313834.getClass(), "decodeSize", 3);
        setIntField(term1313834, term1313834.getClass(), "encodeSize", 4);
        setField(term1313834, term1313834.getClass(), "buffer", null);
        setIntField(term1313834, term1313834.getClass(), "pos", 0);
        setIntField(term1313834, term1313834.getClass(), "readPos", 0);
        setIntField(term1313834, term1313834.getClass(), "currentLinePos", 0);
        setIntField(term1313834, term1313834.getClass(), "modulus", 0);
        setBooleanField(term1313834, term1313834.getClass(), "eof", false);
        setIntField(term1313834, term1313834.getClass(), "x", 0);
        setField(term1313833, term1313833.getClass(), "base64", term1313834);
        setField(term1313833, term1313833.getClass(), "singleByte", term1313837);
        setField(term1313838, term1313838.getClass(), "buf", null);
        setIntField(term1313838, term1313838.getClass(), "pos", 0);
        setField(term1313838, term1313838.getClass(), "in", null);
        setField(term1313833, term1313833.getClass(), "in", term1313838);
        term1313839 = (byte[]) newByteArray(219);
        term1313840 = newInstance(Class.forName("java.io.PushbackInputStream"));
        setField(term1313840, term1313840.getClass(), "buf", null);
        setIntField(term1313840, term1313840.getClass(), "pos", 0);
        setField(term1313840, term1313840.getClass(), "in", null);
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
        args[0] = term1063299;
        args[1] = true;
        args[2] = 0;
        args[3] = term844027;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1313833));
        assertTrue(recursiveEquals(term1063299, 0));
        assertTrue(recursiveEquals(term844027, true));
    }

};


