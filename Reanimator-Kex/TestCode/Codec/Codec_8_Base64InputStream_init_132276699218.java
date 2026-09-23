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

public class Base64InputStream_init_132276699218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5262;
     Object term5579;
     Object term5585;

    public Base64InputStream_init_132276699218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5136 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term5198 = newInstance(Class.forName("java.util.zip.ZipInputStream"));
        setField(term5136, term5136.getClass(), "in", term5198);
        setField(term5136, term5136.getClass(), "singleByte", null);
        setBooleanField(term5136, term5136.getClass(), "doEncode", false);
        term5262 = newInstance(Class.forName("java.io.LineNumberInputStream"));
        term5579 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term5580 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term5581 = (byte[]) newByteArray(64);
        byte[] term5582 = (byte[]) newByteArray(2);
        byte[] term5583 = (byte[]) newByteArray(1);
        Object term5584 = newInstance(Class.forName("java.io.LineNumberInputStream"));
        setBooleanField(term5579, term5579.getClass(), "doEncode", true);
        setByteElement(term5581, 0, (byte) 65);
        setByteElement(term5581, 1, (byte) 66);
        setByteElement(term5581, 2, (byte) 67);
        setByteElement(term5581, 3, (byte) 68);
        setByteElement(term5581, 4, (byte) 69);
        setByteElement(term5581, 5, (byte) 70);
        setByteElement(term5581, 6, (byte) 71);
        setByteElement(term5581, 7, (byte) 72);
        setByteElement(term5581, 8, (byte) 73);
        setByteElement(term5581, 9, (byte) 74);
        setByteElement(term5581, 10, (byte) 75);
        setByteElement(term5581, 11, (byte) 76);
        setByteElement(term5581, 12, (byte) 77);
        setByteElement(term5581, 13, (byte) 78);
        setByteElement(term5581, 14, (byte) 79);
        setByteElement(term5581, 15, (byte) 80);
        setByteElement(term5581, 16, (byte) 81);
        setByteElement(term5581, 17, (byte) 82);
        setByteElement(term5581, 18, (byte) 83);
        setByteElement(term5581, 19, (byte) 84);
        setByteElement(term5581, 20, (byte) 85);
        setByteElement(term5581, 21, (byte) 86);
        setByteElement(term5581, 22, (byte) 87);
        setByteElement(term5581, 23, (byte) 88);
        setByteElement(term5581, 24, (byte) 89);
        setByteElement(term5581, 25, (byte) 90);
        setByteElement(term5581, 26, (byte) 97);
        setByteElement(term5581, 27, (byte) 98);
        setByteElement(term5581, 28, (byte) 99);
        setByteElement(term5581, 29, (byte) 100);
        setByteElement(term5581, 30, (byte) 101);
        setByteElement(term5581, 31, (byte) 102);
        setByteElement(term5581, 32, (byte) 103);
        setByteElement(term5581, 33, (byte) 104);
        setByteElement(term5581, 34, (byte) 105);
        setByteElement(term5581, 35, (byte) 106);
        setByteElement(term5581, 36, (byte) 107);
        setByteElement(term5581, 37, (byte) 108);
        setByteElement(term5581, 38, (byte) 109);
        setByteElement(term5581, 39, (byte) 110);
        setByteElement(term5581, 40, (byte) 111);
        setByteElement(term5581, 41, (byte) 112);
        setByteElement(term5581, 42, (byte) 113);
        setByteElement(term5581, 43, (byte) 114);
        setByteElement(term5581, 44, (byte) 115);
        setByteElement(term5581, 45, (byte) 116);
        setByteElement(term5581, 46, (byte) 117);
        setByteElement(term5581, 47, (byte) 118);
        setByteElement(term5581, 48, (byte) 119);
        setByteElement(term5581, 49, (byte) 120);
        setByteElement(term5581, 50, (byte) 121);
        setByteElement(term5581, 51, (byte) 122);
        setByteElement(term5581, 52, (byte) 48);
        setByteElement(term5581, 53, (byte) 49);
        setByteElement(term5581, 54, (byte) 50);
        setByteElement(term5581, 55, (byte) 51);
        setByteElement(term5581, 56, (byte) 52);
        setByteElement(term5581, 57, (byte) 53);
        setByteElement(term5581, 58, (byte) 54);
        setByteElement(term5581, 59, (byte) 55);
        setByteElement(term5581, 60, (byte) 56);
        setByteElement(term5581, 61, (byte) 57);
        setByteElement(term5581, 62, (byte) 43);
        setByteElement(term5581, 63, (byte) 47);
        setField(term5580, term5580.getClass(), "encodeTable", term5581);
        setIntField(term5580, term5580.getClass(), "lineLength", 76);
        setByteElement(term5582, 0, (byte) 13);
        setByteElement(term5582, 1, (byte) 10);
        setField(term5580, term5580.getClass(), "lineSeparator", term5582);
        setIntField(term5580, term5580.getClass(), "decodeSize", 5);
        setIntField(term5580, term5580.getClass(), "encodeSize", 6);
        setField(term5580, term5580.getClass(), "buffer", null);
        setIntField(term5580, term5580.getClass(), "pos", 0);
        setIntField(term5580, term5580.getClass(), "readPos", 0);
        setIntField(term5580, term5580.getClass(), "currentLinePos", 0);
        setIntField(term5580, term5580.getClass(), "modulus", 0);
        setBooleanField(term5580, term5580.getClass(), "eof", false);
        setIntField(term5580, term5580.getClass(), "x", 0);
        setField(term5579, term5579.getClass(), "base64", term5580);
        setField(term5579, term5579.getClass(), "singleByte", term5583);
        setIntField(term5584, term5584.getClass(), "pushBack", 0);
        setIntField(term5584, term5584.getClass(), "lineNumber", 0);
        setIntField(term5584, term5584.getClass(), "markLineNumber", 0);
        setIntField(term5584, term5584.getClass(), "markPushBack", 0);
        setField(term5584, term5584.getClass(), "in", null);
        setField(term5579, term5579.getClass(), "in", term5584);
        term5585 = newInstance(Class.forName("java.io.LineNumberInputStream"));
        setIntField(term5585, term5585.getClass(), "pushBack", 0);
        setIntField(term5585, term5585.getClass(), "lineNumber", 0);
        setIntField(term5585, term5585.getClass(), "markLineNumber", 0);
        setIntField(term5585, term5585.getClass(), "markPushBack", 0);
        setField(term5585, term5585.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term5262;
        args[1] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5579));
        assertTrue(recursiveEquals(term5262, term5585));
    }

};


