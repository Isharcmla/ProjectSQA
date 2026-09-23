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

public class Base64InputStream_init_9482306026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710;

    public Base64InputStream_init_9482306026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term710 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term711 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term712 = (byte[]) newByteArray(64);
        byte[] term713 = (byte[]) newByteArray(2);
        byte[] term714 = (byte[]) newByteArray(1);
        setBooleanField(term710, term710.getClass(), "doEncode", false);
        setByteElement(term712, 0, (byte) 65);
        setByteElement(term712, 1, (byte) 66);
        setByteElement(term712, 2, (byte) 67);
        setByteElement(term712, 3, (byte) 68);
        setByteElement(term712, 4, (byte) 69);
        setByteElement(term712, 5, (byte) 70);
        setByteElement(term712, 6, (byte) 71);
        setByteElement(term712, 7, (byte) 72);
        setByteElement(term712, 8, (byte) 73);
        setByteElement(term712, 9, (byte) 74);
        setByteElement(term712, 10, (byte) 75);
        setByteElement(term712, 11, (byte) 76);
        setByteElement(term712, 12, (byte) 77);
        setByteElement(term712, 13, (byte) 78);
        setByteElement(term712, 14, (byte) 79);
        setByteElement(term712, 15, (byte) 80);
        setByteElement(term712, 16, (byte) 81);
        setByteElement(term712, 17, (byte) 82);
        setByteElement(term712, 18, (byte) 83);
        setByteElement(term712, 19, (byte) 84);
        setByteElement(term712, 20, (byte) 85);
        setByteElement(term712, 21, (byte) 86);
        setByteElement(term712, 22, (byte) 87);
        setByteElement(term712, 23, (byte) 88);
        setByteElement(term712, 24, (byte) 89);
        setByteElement(term712, 25, (byte) 90);
        setByteElement(term712, 26, (byte) 97);
        setByteElement(term712, 27, (byte) 98);
        setByteElement(term712, 28, (byte) 99);
        setByteElement(term712, 29, (byte) 100);
        setByteElement(term712, 30, (byte) 101);
        setByteElement(term712, 31, (byte) 102);
        setByteElement(term712, 32, (byte) 103);
        setByteElement(term712, 33, (byte) 104);
        setByteElement(term712, 34, (byte) 105);
        setByteElement(term712, 35, (byte) 106);
        setByteElement(term712, 36, (byte) 107);
        setByteElement(term712, 37, (byte) 108);
        setByteElement(term712, 38, (byte) 109);
        setByteElement(term712, 39, (byte) 110);
        setByteElement(term712, 40, (byte) 111);
        setByteElement(term712, 41, (byte) 112);
        setByteElement(term712, 42, (byte) 113);
        setByteElement(term712, 43, (byte) 114);
        setByteElement(term712, 44, (byte) 115);
        setByteElement(term712, 45, (byte) 116);
        setByteElement(term712, 46, (byte) 117);
        setByteElement(term712, 47, (byte) 118);
        setByteElement(term712, 48, (byte) 119);
        setByteElement(term712, 49, (byte) 120);
        setByteElement(term712, 50, (byte) 121);
        setByteElement(term712, 51, (byte) 122);
        setByteElement(term712, 52, (byte) 48);
        setByteElement(term712, 53, (byte) 49);
        setByteElement(term712, 54, (byte) 50);
        setByteElement(term712, 55, (byte) 51);
        setByteElement(term712, 56, (byte) 52);
        setByteElement(term712, 57, (byte) 53);
        setByteElement(term712, 58, (byte) 54);
        setByteElement(term712, 59, (byte) 55);
        setByteElement(term712, 60, (byte) 56);
        setByteElement(term712, 61, (byte) 57);
        setByteElement(term712, 62, (byte) 43);
        setByteElement(term712, 63, (byte) 47);
        setField(term711, term711.getClass(), "encodeTable", term712);
        setIntField(term711, term711.getClass(), "lineLength", 76);
        setByteElement(term713, 0, (byte) 13);
        setByteElement(term713, 1, (byte) 10);
        setField(term711, term711.getClass(), "lineSeparator", term713);
        setIntField(term711, term711.getClass(), "decodeSize", 5);
        setIntField(term711, term711.getClass(), "encodeSize", 6);
        setField(term711, term711.getClass(), "buffer", null);
        setIntField(term711, term711.getClass(), "pos", 0);
        setIntField(term711, term711.getClass(), "readPos", 0);
        setIntField(term711, term711.getClass(), "currentLinePos", 0);
        setIntField(term711, term711.getClass(), "modulus", 0);
        setBooleanField(term711, term711.getClass(), "eof", false);
        setIntField(term711, term711.getClass(), "x", 0);
        setField(term710, term710.getClass(), "base64", term711);
        setField(term710, term710.getClass(), "singleByte", term714);
        setField(term710, term710.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term710));
    }

};


