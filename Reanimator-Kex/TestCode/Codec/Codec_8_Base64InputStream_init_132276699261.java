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

public class Base64InputStream_init_132276699261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741564;
     Object term763690;
     Object term763696;

    public Base64InputStream_init_132276699261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term741460 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term741508 = newInstance(Class.forName("java.io.InputStream$1"));
        setField(term741460, term741460.getClass(), "in", term741508);
        setField(term741460, term741460.getClass(), "singleByte", null);
        setBooleanField(term741460, term741460.getClass(), "doEncode", false);
        term741564 = newInstance(Class.forName("java.io.FilterInputStream"));
        term763690 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term763691 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term763692 = (byte[]) newByteArray(64);
        byte[] term763693 = (byte[]) newByteArray(2);
        byte[] term763694 = (byte[]) newByteArray(1);
        Object term763695 = newInstance(Class.forName("java.io.FilterInputStream"));
        setBooleanField(term763690, term763690.getClass(), "doEncode", true);
        setByteElement(term763692, 0, (byte) 65);
        setByteElement(term763692, 1, (byte) 66);
        setByteElement(term763692, 2, (byte) 67);
        setByteElement(term763692, 3, (byte) 68);
        setByteElement(term763692, 4, (byte) 69);
        setByteElement(term763692, 5, (byte) 70);
        setByteElement(term763692, 6, (byte) 71);
        setByteElement(term763692, 7, (byte) 72);
        setByteElement(term763692, 8, (byte) 73);
        setByteElement(term763692, 9, (byte) 74);
        setByteElement(term763692, 10, (byte) 75);
        setByteElement(term763692, 11, (byte) 76);
        setByteElement(term763692, 12, (byte) 77);
        setByteElement(term763692, 13, (byte) 78);
        setByteElement(term763692, 14, (byte) 79);
        setByteElement(term763692, 15, (byte) 80);
        setByteElement(term763692, 16, (byte) 81);
        setByteElement(term763692, 17, (byte) 82);
        setByteElement(term763692, 18, (byte) 83);
        setByteElement(term763692, 19, (byte) 84);
        setByteElement(term763692, 20, (byte) 85);
        setByteElement(term763692, 21, (byte) 86);
        setByteElement(term763692, 22, (byte) 87);
        setByteElement(term763692, 23, (byte) 88);
        setByteElement(term763692, 24, (byte) 89);
        setByteElement(term763692, 25, (byte) 90);
        setByteElement(term763692, 26, (byte) 97);
        setByteElement(term763692, 27, (byte) 98);
        setByteElement(term763692, 28, (byte) 99);
        setByteElement(term763692, 29, (byte) 100);
        setByteElement(term763692, 30, (byte) 101);
        setByteElement(term763692, 31, (byte) 102);
        setByteElement(term763692, 32, (byte) 103);
        setByteElement(term763692, 33, (byte) 104);
        setByteElement(term763692, 34, (byte) 105);
        setByteElement(term763692, 35, (byte) 106);
        setByteElement(term763692, 36, (byte) 107);
        setByteElement(term763692, 37, (byte) 108);
        setByteElement(term763692, 38, (byte) 109);
        setByteElement(term763692, 39, (byte) 110);
        setByteElement(term763692, 40, (byte) 111);
        setByteElement(term763692, 41, (byte) 112);
        setByteElement(term763692, 42, (byte) 113);
        setByteElement(term763692, 43, (byte) 114);
        setByteElement(term763692, 44, (byte) 115);
        setByteElement(term763692, 45, (byte) 116);
        setByteElement(term763692, 46, (byte) 117);
        setByteElement(term763692, 47, (byte) 118);
        setByteElement(term763692, 48, (byte) 119);
        setByteElement(term763692, 49, (byte) 120);
        setByteElement(term763692, 50, (byte) 121);
        setByteElement(term763692, 51, (byte) 122);
        setByteElement(term763692, 52, (byte) 48);
        setByteElement(term763692, 53, (byte) 49);
        setByteElement(term763692, 54, (byte) 50);
        setByteElement(term763692, 55, (byte) 51);
        setByteElement(term763692, 56, (byte) 52);
        setByteElement(term763692, 57, (byte) 53);
        setByteElement(term763692, 58, (byte) 54);
        setByteElement(term763692, 59, (byte) 55);
        setByteElement(term763692, 60, (byte) 56);
        setByteElement(term763692, 61, (byte) 57);
        setByteElement(term763692, 62, (byte) 43);
        setByteElement(term763692, 63, (byte) 47);
        setField(term763691, term763691.getClass(), "encodeTable", term763692);
        setIntField(term763691, term763691.getClass(), "lineLength", 76);
        setByteElement(term763693, 0, (byte) 13);
        setByteElement(term763693, 1, (byte) 10);
        setField(term763691, term763691.getClass(), "lineSeparator", term763693);
        setIntField(term763691, term763691.getClass(), "decodeSize", 5);
        setIntField(term763691, term763691.getClass(), "encodeSize", 6);
        setField(term763691, term763691.getClass(), "buffer", null);
        setIntField(term763691, term763691.getClass(), "pos", 0);
        setIntField(term763691, term763691.getClass(), "readPos", 0);
        setIntField(term763691, term763691.getClass(), "currentLinePos", 0);
        setIntField(term763691, term763691.getClass(), "modulus", 0);
        setBooleanField(term763691, term763691.getClass(), "eof", false);
        setIntField(term763691, term763691.getClass(), "x", 0);
        setField(term763690, term763690.getClass(), "base64", term763691);
        setField(term763690, term763690.getClass(), "singleByte", term763694);
        setField(term763695, term763695.getClass(), "in", null);
        setField(term763690, term763690.getClass(), "in", term763695);
        term763696 = newInstance(Class.forName("java.io.FilterInputStream"));
        setField(term763696, term763696.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term741564;
        args[1] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term763690));
        assertTrue(recursiveEquals(term741564, term763696));
    }

};


