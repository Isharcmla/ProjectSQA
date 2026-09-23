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

public class Base64InputStream_init_132276699224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9953;
     Object term12887;
     Object term12893;

    public Base64InputStream_init_132276699224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9841 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term9897 = newInstance(Class.forName("java.io.FilterInputStream"));
        setField(term9841, term9841.getClass(), "in", term9897);
        setField(term9841, term9841.getClass(), "singleByte", null);
        setBooleanField(term9841, term9841.getClass(), "doEncode", false);
        term9953 = newInstance(Class.forName("java.io.FilterInputStream"));
        term12887 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term12888 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term12889 = (byte[]) newByteArray(64);
        byte[] term12890 = (byte[]) newByteArray(2);
        byte[] term12891 = (byte[]) newByteArray(1);
        Object term12892 = newInstance(Class.forName("java.io.FilterInputStream"));
        setBooleanField(term12887, term12887.getClass(), "doEncode", true);
        setByteElement(term12889, 0, (byte) 65);
        setByteElement(term12889, 1, (byte) 66);
        setByteElement(term12889, 2, (byte) 67);
        setByteElement(term12889, 3, (byte) 68);
        setByteElement(term12889, 4, (byte) 69);
        setByteElement(term12889, 5, (byte) 70);
        setByteElement(term12889, 6, (byte) 71);
        setByteElement(term12889, 7, (byte) 72);
        setByteElement(term12889, 8, (byte) 73);
        setByteElement(term12889, 9, (byte) 74);
        setByteElement(term12889, 10, (byte) 75);
        setByteElement(term12889, 11, (byte) 76);
        setByteElement(term12889, 12, (byte) 77);
        setByteElement(term12889, 13, (byte) 78);
        setByteElement(term12889, 14, (byte) 79);
        setByteElement(term12889, 15, (byte) 80);
        setByteElement(term12889, 16, (byte) 81);
        setByteElement(term12889, 17, (byte) 82);
        setByteElement(term12889, 18, (byte) 83);
        setByteElement(term12889, 19, (byte) 84);
        setByteElement(term12889, 20, (byte) 85);
        setByteElement(term12889, 21, (byte) 86);
        setByteElement(term12889, 22, (byte) 87);
        setByteElement(term12889, 23, (byte) 88);
        setByteElement(term12889, 24, (byte) 89);
        setByteElement(term12889, 25, (byte) 90);
        setByteElement(term12889, 26, (byte) 97);
        setByteElement(term12889, 27, (byte) 98);
        setByteElement(term12889, 28, (byte) 99);
        setByteElement(term12889, 29, (byte) 100);
        setByteElement(term12889, 30, (byte) 101);
        setByteElement(term12889, 31, (byte) 102);
        setByteElement(term12889, 32, (byte) 103);
        setByteElement(term12889, 33, (byte) 104);
        setByteElement(term12889, 34, (byte) 105);
        setByteElement(term12889, 35, (byte) 106);
        setByteElement(term12889, 36, (byte) 107);
        setByteElement(term12889, 37, (byte) 108);
        setByteElement(term12889, 38, (byte) 109);
        setByteElement(term12889, 39, (byte) 110);
        setByteElement(term12889, 40, (byte) 111);
        setByteElement(term12889, 41, (byte) 112);
        setByteElement(term12889, 42, (byte) 113);
        setByteElement(term12889, 43, (byte) 114);
        setByteElement(term12889, 44, (byte) 115);
        setByteElement(term12889, 45, (byte) 116);
        setByteElement(term12889, 46, (byte) 117);
        setByteElement(term12889, 47, (byte) 118);
        setByteElement(term12889, 48, (byte) 119);
        setByteElement(term12889, 49, (byte) 120);
        setByteElement(term12889, 50, (byte) 121);
        setByteElement(term12889, 51, (byte) 122);
        setByteElement(term12889, 52, (byte) 48);
        setByteElement(term12889, 53, (byte) 49);
        setByteElement(term12889, 54, (byte) 50);
        setByteElement(term12889, 55, (byte) 51);
        setByteElement(term12889, 56, (byte) 52);
        setByteElement(term12889, 57, (byte) 53);
        setByteElement(term12889, 58, (byte) 54);
        setByteElement(term12889, 59, (byte) 55);
        setByteElement(term12889, 60, (byte) 56);
        setByteElement(term12889, 61, (byte) 57);
        setByteElement(term12889, 62, (byte) 43);
        setByteElement(term12889, 63, (byte) 47);
        setField(term12888, term12888.getClass(), "encodeTable", term12889);
        setIntField(term12888, term12888.getClass(), "lineLength", 76);
        setByteElement(term12890, 0, (byte) 13);
        setByteElement(term12890, 1, (byte) 10);
        setField(term12888, term12888.getClass(), "lineSeparator", term12890);
        setIntField(term12888, term12888.getClass(), "decodeSize", 5);
        setIntField(term12888, term12888.getClass(), "encodeSize", 6);
        setField(term12888, term12888.getClass(), "buffer", null);
        setIntField(term12888, term12888.getClass(), "pos", 0);
        setIntField(term12888, term12888.getClass(), "readPos", 0);
        setIntField(term12888, term12888.getClass(), "currentLinePos", 0);
        setIntField(term12888, term12888.getClass(), "modulus", 0);
        setBooleanField(term12888, term12888.getClass(), "eof", false);
        setIntField(term12888, term12888.getClass(), "x", 0);
        setField(term12887, term12887.getClass(), "base64", term12888);
        setField(term12887, term12887.getClass(), "singleByte", term12891);
        setField(term12892, term12892.getClass(), "in", null);
        setField(term12887, term12887.getClass(), "in", term12892);
        term12893 = newInstance(Class.forName("java.io.FilterInputStream"));
        setField(term12893, term12893.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term9953;
        args[1] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12887));
        assertTrue(recursiveEquals(term9953, term12893));
    }

};


