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

public class Base64InputStream_init_132276699243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26373;
     Object term44550;
     Object term44556;

    public Base64InputStream_init_132276699243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26243 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term26311 = newInstance(Class.forName("java.util.zip.GZIPInputStream$1"));
        setField(term26243, term26243.getClass(), "in", term26311);
        setField(term26243, term26243.getClass(), "singleByte", null);
        setBooleanField(term26243, term26243.getClass(), "doEncode", false);
        term26373 = newInstance(Class.forName("java.nio.channels.Channels$2"));
        term44550 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term44551 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term44552 = (byte[]) newByteArray(64);
        byte[] term44553 = (byte[]) newByteArray(2);
        byte[] term44554 = (byte[]) newByteArray(1);
        Object term44555 = newInstance(Class.forName("java.nio.channels.Channels$2"));
        setBooleanField(term44550, term44550.getClass(), "doEncode", true);
        setByteElement(term44552, 0, (byte) 65);
        setByteElement(term44552, 1, (byte) 66);
        setByteElement(term44552, 2, (byte) 67);
        setByteElement(term44552, 3, (byte) 68);
        setByteElement(term44552, 4, (byte) 69);
        setByteElement(term44552, 5, (byte) 70);
        setByteElement(term44552, 6, (byte) 71);
        setByteElement(term44552, 7, (byte) 72);
        setByteElement(term44552, 8, (byte) 73);
        setByteElement(term44552, 9, (byte) 74);
        setByteElement(term44552, 10, (byte) 75);
        setByteElement(term44552, 11, (byte) 76);
        setByteElement(term44552, 12, (byte) 77);
        setByteElement(term44552, 13, (byte) 78);
        setByteElement(term44552, 14, (byte) 79);
        setByteElement(term44552, 15, (byte) 80);
        setByteElement(term44552, 16, (byte) 81);
        setByteElement(term44552, 17, (byte) 82);
        setByteElement(term44552, 18, (byte) 83);
        setByteElement(term44552, 19, (byte) 84);
        setByteElement(term44552, 20, (byte) 85);
        setByteElement(term44552, 21, (byte) 86);
        setByteElement(term44552, 22, (byte) 87);
        setByteElement(term44552, 23, (byte) 88);
        setByteElement(term44552, 24, (byte) 89);
        setByteElement(term44552, 25, (byte) 90);
        setByteElement(term44552, 26, (byte) 97);
        setByteElement(term44552, 27, (byte) 98);
        setByteElement(term44552, 28, (byte) 99);
        setByteElement(term44552, 29, (byte) 100);
        setByteElement(term44552, 30, (byte) 101);
        setByteElement(term44552, 31, (byte) 102);
        setByteElement(term44552, 32, (byte) 103);
        setByteElement(term44552, 33, (byte) 104);
        setByteElement(term44552, 34, (byte) 105);
        setByteElement(term44552, 35, (byte) 106);
        setByteElement(term44552, 36, (byte) 107);
        setByteElement(term44552, 37, (byte) 108);
        setByteElement(term44552, 38, (byte) 109);
        setByteElement(term44552, 39, (byte) 110);
        setByteElement(term44552, 40, (byte) 111);
        setByteElement(term44552, 41, (byte) 112);
        setByteElement(term44552, 42, (byte) 113);
        setByteElement(term44552, 43, (byte) 114);
        setByteElement(term44552, 44, (byte) 115);
        setByteElement(term44552, 45, (byte) 116);
        setByteElement(term44552, 46, (byte) 117);
        setByteElement(term44552, 47, (byte) 118);
        setByteElement(term44552, 48, (byte) 119);
        setByteElement(term44552, 49, (byte) 120);
        setByteElement(term44552, 50, (byte) 121);
        setByteElement(term44552, 51, (byte) 122);
        setByteElement(term44552, 52, (byte) 48);
        setByteElement(term44552, 53, (byte) 49);
        setByteElement(term44552, 54, (byte) 50);
        setByteElement(term44552, 55, (byte) 51);
        setByteElement(term44552, 56, (byte) 52);
        setByteElement(term44552, 57, (byte) 53);
        setByteElement(term44552, 58, (byte) 54);
        setByteElement(term44552, 59, (byte) 55);
        setByteElement(term44552, 60, (byte) 56);
        setByteElement(term44552, 61, (byte) 57);
        setByteElement(term44552, 62, (byte) 43);
        setByteElement(term44552, 63, (byte) 47);
        setField(term44551, term44551.getClass(), "encodeTable", term44552);
        setIntField(term44551, term44551.getClass(), "lineLength", 76);
        setByteElement(term44553, 0, (byte) 13);
        setByteElement(term44553, 1, (byte) 10);
        setField(term44551, term44551.getClass(), "lineSeparator", term44553);
        setIntField(term44551, term44551.getClass(), "decodeSize", 5);
        setIntField(term44551, term44551.getClass(), "encodeSize", 6);
        setField(term44551, term44551.getClass(), "buffer", null);
        setIntField(term44551, term44551.getClass(), "pos", 0);
        setIntField(term44551, term44551.getClass(), "readPos", 0);
        setIntField(term44551, term44551.getClass(), "currentLinePos", 0);
        setIntField(term44551, term44551.getClass(), "modulus", 0);
        setBooleanField(term44551, term44551.getClass(), "eof", false);
        setIntField(term44551, term44551.getClass(), "x", 0);
        setField(term44550, term44550.getClass(), "base64", term44551);
        setField(term44550, term44550.getClass(), "singleByte", term44554);
        setField(term44555, term44555.getClass(), "bb", null);
        setField(term44555, term44555.getClass(), "bs", null);
        setField(term44555, term44555.getClass(), "b1", null);
        setField(term44555, term44555.getClass(), "val$ch", null);
        setField(term44550, term44550.getClass(), "in", term44555);
        term44556 = newInstance(Class.forName("java.nio.channels.Channels$2"));
        setField(term44556, term44556.getClass(), "bb", null);
        setField(term44556, term44556.getClass(), "bs", null);
        setField(term44556, term44556.getClass(), "b1", null);
        setField(term44556, term44556.getClass(), "val$ch", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term26373;
        args[1] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term44550));
        assertTrue(recursiveEquals(term26373, term44556));
    }

};


