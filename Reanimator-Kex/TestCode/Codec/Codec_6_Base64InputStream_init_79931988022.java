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

public class Base64InputStream_init_79931988022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4258;
     Object term3894;
     Object term6658;
     Object term6664;
     Object term6665;

    public Base64InputStream_init_79931988022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4074 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term4172 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseInputStream"));
        setField(term4074, term4074.getClass(), "in", term4172);
        setField(term4074, term4074.getClass(), "singleByte", null);
        setBooleanField(term4074, term4074.getClass(), "doEncode", false);
        term4258 = newInstance(Class.forName("java.lang.ProcessBuilder$NullInputStream"));
        term3894 = (byte[]) newByteArray(8);
        setByteElement(term3894, 0, (byte) -128);
        term6658 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term6659 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term6660 = (byte[]) newByteArray(64);
        byte[] term6661 = (byte[]) newByteArray(8);
        byte[] term6662 = (byte[]) newByteArray(1);
        Object term6663 = newInstance(Class.forName("java.lang.ProcessBuilder$NullInputStream"));
        setBooleanField(term6658, term6658.getClass(), "doEncode", true);
        setByteElement(term6660, 0, (byte) 65);
        setByteElement(term6660, 1, (byte) 66);
        setByteElement(term6660, 2, (byte) 67);
        setByteElement(term6660, 3, (byte) 68);
        setByteElement(term6660, 4, (byte) 69);
        setByteElement(term6660, 5, (byte) 70);
        setByteElement(term6660, 6, (byte) 71);
        setByteElement(term6660, 7, (byte) 72);
        setByteElement(term6660, 8, (byte) 73);
        setByteElement(term6660, 9, (byte) 74);
        setByteElement(term6660, 10, (byte) 75);
        setByteElement(term6660, 11, (byte) 76);
        setByteElement(term6660, 12, (byte) 77);
        setByteElement(term6660, 13, (byte) 78);
        setByteElement(term6660, 14, (byte) 79);
        setByteElement(term6660, 15, (byte) 80);
        setByteElement(term6660, 16, (byte) 81);
        setByteElement(term6660, 17, (byte) 82);
        setByteElement(term6660, 18, (byte) 83);
        setByteElement(term6660, 19, (byte) 84);
        setByteElement(term6660, 20, (byte) 85);
        setByteElement(term6660, 21, (byte) 86);
        setByteElement(term6660, 22, (byte) 87);
        setByteElement(term6660, 23, (byte) 88);
        setByteElement(term6660, 24, (byte) 89);
        setByteElement(term6660, 25, (byte) 90);
        setByteElement(term6660, 26, (byte) 97);
        setByteElement(term6660, 27, (byte) 98);
        setByteElement(term6660, 28, (byte) 99);
        setByteElement(term6660, 29, (byte) 100);
        setByteElement(term6660, 30, (byte) 101);
        setByteElement(term6660, 31, (byte) 102);
        setByteElement(term6660, 32, (byte) 103);
        setByteElement(term6660, 33, (byte) 104);
        setByteElement(term6660, 34, (byte) 105);
        setByteElement(term6660, 35, (byte) 106);
        setByteElement(term6660, 36, (byte) 107);
        setByteElement(term6660, 37, (byte) 108);
        setByteElement(term6660, 38, (byte) 109);
        setByteElement(term6660, 39, (byte) 110);
        setByteElement(term6660, 40, (byte) 111);
        setByteElement(term6660, 41, (byte) 112);
        setByteElement(term6660, 42, (byte) 113);
        setByteElement(term6660, 43, (byte) 114);
        setByteElement(term6660, 44, (byte) 115);
        setByteElement(term6660, 45, (byte) 116);
        setByteElement(term6660, 46, (byte) 117);
        setByteElement(term6660, 47, (byte) 118);
        setByteElement(term6660, 48, (byte) 119);
        setByteElement(term6660, 49, (byte) 120);
        setByteElement(term6660, 50, (byte) 121);
        setByteElement(term6660, 51, (byte) 122);
        setByteElement(term6660, 52, (byte) 48);
        setByteElement(term6660, 53, (byte) 49);
        setByteElement(term6660, 54, (byte) 50);
        setByteElement(term6660, 55, (byte) 51);
        setByteElement(term6660, 56, (byte) 52);
        setByteElement(term6660, 57, (byte) 53);
        setByteElement(term6660, 58, (byte) 54);
        setByteElement(term6660, 59, (byte) 55);
        setByteElement(term6660, 60, (byte) 56);
        setByteElement(term6660, 61, (byte) 57);
        setByteElement(term6660, 62, (byte) 43);
        setByteElement(term6660, 63, (byte) 47);
        setField(term6659, term6659.getClass(), "encodeTable", term6660);
        setIntField(term6659, term6659.getClass(), "lineLength", 0);
        setByteElement(term6661, 0, (byte) -128);
        setField(term6659, term6659.getClass(), "lineSeparator", term6661);
        setIntField(term6659, term6659.getClass(), "decodeSize", 11);
        setIntField(term6659, term6659.getClass(), "encodeSize", 12);
        setField(term6659, term6659.getClass(), "buffer", null);
        setIntField(term6659, term6659.getClass(), "pos", 0);
        setIntField(term6659, term6659.getClass(), "readPos", 0);
        setIntField(term6659, term6659.getClass(), "currentLinePos", 0);
        setIntField(term6659, term6659.getClass(), "modulus", 0);
        setBooleanField(term6659, term6659.getClass(), "eof", false);
        setIntField(term6659, term6659.getClass(), "x", 0);
        setField(term6658, term6658.getClass(), "base64", term6659);
        setField(term6658, term6658.getClass(), "singleByte", term6662);
        setField(term6658, term6658.getClass(), "in", term6663);
        term6664 = (byte[]) newByteArray(8);
        setByteElement(term6664, 0, (byte) -128);
        term6665 = newInstance(Class.forName("java.lang.ProcessBuilder$NullInputStream"));
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
        args[0] = term4258;
        args[1] = true;
        args[2] = 1;
        args[3] = term3894;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6658));
        assertTrue(recursiveEquals(term4258, 1));
        assertTrue(recursiveEquals(term3894, true));
    }

};


