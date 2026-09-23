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

public class Base64InputStream_init_79931988059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term706566;
     Object term678856;
     Object term757898;
     Object term757904;
     Object term757905;

    public Base64InputStream_init_79931988059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term706446 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term706510 = newInstance(Class.forName("java.io.LineNumberInputStream"));
        setField(term706446, term706446.getClass(), "in", term706510);
        setField(term706446, term706446.getClass(), "singleByte", null);
        setBooleanField(term706446, term706446.getClass(), "doEncode", false);
        term706566 = newInstance(Class.forName("java.io.FilterInputStream"));
        term678856 = (byte[]) newByteArray(507);
        setByteElement(term678856, 26, (byte) -128);
        term757898 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term757899 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term757900 = (byte[]) newByteArray(64);
        byte[] term757901 = (byte[]) newByteArray(507);
        byte[] term757902 = (byte[]) newByteArray(1);
        Object term757903 = newInstance(Class.forName("java.io.FilterInputStream"));
        setBooleanField(term757898, term757898.getClass(), "doEncode", true);
        setByteElement(term757900, 0, (byte) 65);
        setByteElement(term757900, 1, (byte) 66);
        setByteElement(term757900, 2, (byte) 67);
        setByteElement(term757900, 3, (byte) 68);
        setByteElement(term757900, 4, (byte) 69);
        setByteElement(term757900, 5, (byte) 70);
        setByteElement(term757900, 6, (byte) 71);
        setByteElement(term757900, 7, (byte) 72);
        setByteElement(term757900, 8, (byte) 73);
        setByteElement(term757900, 9, (byte) 74);
        setByteElement(term757900, 10, (byte) 75);
        setByteElement(term757900, 11, (byte) 76);
        setByteElement(term757900, 12, (byte) 77);
        setByteElement(term757900, 13, (byte) 78);
        setByteElement(term757900, 14, (byte) 79);
        setByteElement(term757900, 15, (byte) 80);
        setByteElement(term757900, 16, (byte) 81);
        setByteElement(term757900, 17, (byte) 82);
        setByteElement(term757900, 18, (byte) 83);
        setByteElement(term757900, 19, (byte) 84);
        setByteElement(term757900, 20, (byte) 85);
        setByteElement(term757900, 21, (byte) 86);
        setByteElement(term757900, 22, (byte) 87);
        setByteElement(term757900, 23, (byte) 88);
        setByteElement(term757900, 24, (byte) 89);
        setByteElement(term757900, 25, (byte) 90);
        setByteElement(term757900, 26, (byte) 97);
        setByteElement(term757900, 27, (byte) 98);
        setByteElement(term757900, 28, (byte) 99);
        setByteElement(term757900, 29, (byte) 100);
        setByteElement(term757900, 30, (byte) 101);
        setByteElement(term757900, 31, (byte) 102);
        setByteElement(term757900, 32, (byte) 103);
        setByteElement(term757900, 33, (byte) 104);
        setByteElement(term757900, 34, (byte) 105);
        setByteElement(term757900, 35, (byte) 106);
        setByteElement(term757900, 36, (byte) 107);
        setByteElement(term757900, 37, (byte) 108);
        setByteElement(term757900, 38, (byte) 109);
        setByteElement(term757900, 39, (byte) 110);
        setByteElement(term757900, 40, (byte) 111);
        setByteElement(term757900, 41, (byte) 112);
        setByteElement(term757900, 42, (byte) 113);
        setByteElement(term757900, 43, (byte) 114);
        setByteElement(term757900, 44, (byte) 115);
        setByteElement(term757900, 45, (byte) 116);
        setByteElement(term757900, 46, (byte) 117);
        setByteElement(term757900, 47, (byte) 118);
        setByteElement(term757900, 48, (byte) 119);
        setByteElement(term757900, 49, (byte) 120);
        setByteElement(term757900, 50, (byte) 121);
        setByteElement(term757900, 51, (byte) 122);
        setByteElement(term757900, 52, (byte) 48);
        setByteElement(term757900, 53, (byte) 49);
        setByteElement(term757900, 54, (byte) 50);
        setByteElement(term757900, 55, (byte) 51);
        setByteElement(term757900, 56, (byte) 52);
        setByteElement(term757900, 57, (byte) 53);
        setByteElement(term757900, 58, (byte) 54);
        setByteElement(term757900, 59, (byte) 55);
        setByteElement(term757900, 60, (byte) 56);
        setByteElement(term757900, 61, (byte) 57);
        setByteElement(term757900, 62, (byte) 43);
        setByteElement(term757900, 63, (byte) 47);
        setField(term757899, term757899.getClass(), "encodeTable", term757900);
        setIntField(term757899, term757899.getClass(), "lineLength", 0);
        setByteElement(term757901, 26, (byte) -128);
        setField(term757899, term757899.getClass(), "lineSeparator", term757901);
        setIntField(term757899, term757899.getClass(), "decodeSize", 3);
        setIntField(term757899, term757899.getClass(), "encodeSize", 4);
        setField(term757899, term757899.getClass(), "buffer", null);
        setIntField(term757899, term757899.getClass(), "pos", 0);
        setIntField(term757899, term757899.getClass(), "readPos", 0);
        setIntField(term757899, term757899.getClass(), "currentLinePos", 0);
        setIntField(term757899, term757899.getClass(), "modulus", 0);
        setBooleanField(term757899, term757899.getClass(), "eof", false);
        setIntField(term757899, term757899.getClass(), "x", 0);
        setField(term757898, term757898.getClass(), "base64", term757899);
        setField(term757898, term757898.getClass(), "singleByte", term757902);
        setField(term757903, term757903.getClass(), "in", null);
        setField(term757898, term757898.getClass(), "in", term757903);
        term757904 = (byte[]) newByteArray(507);
        setByteElement(term757904, 26, (byte) -128);
        term757905 = newInstance(Class.forName("java.io.FilterInputStream"));
        setField(term757905, term757905.getClass(), "in", null);
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
        args[0] = term706566;
        args[1] = true;
        args[2] = 0;
        args[3] = term678856;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term757898));
        assertTrue(recursiveEquals(term706566, 0));
        assertTrue(recursiveEquals(term678856, true));
    }

};


