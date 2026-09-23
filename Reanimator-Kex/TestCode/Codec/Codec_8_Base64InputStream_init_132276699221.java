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

public class Base64InputStream_init_132276699221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9431;
     Object term9639;
     Object term9645;

    public Base64InputStream_init_132276699221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9281 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term9375 = newInstance(Class.forName("java.lang.ProcessImpl$ProcessPipeInputStream"));
        setField(term9281, term9281.getClass(), "in", term9375);
        setField(term9281, term9281.getClass(), "singleByte", null);
        setBooleanField(term9281, term9281.getClass(), "doEncode", false);
        term9431 = newInstance(Class.forName("java.io.FilterInputStream"));
        term9639 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term9640 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term9641 = (byte[]) newByteArray(64);
        byte[] term9642 = (byte[]) newByteArray(2);
        byte[] term9643 = (byte[]) newByteArray(1);
        Object term9644 = newInstance(Class.forName("java.io.FilterInputStream"));
        setBooleanField(term9639, term9639.getClass(), "doEncode", true);
        setByteElement(term9641, 0, (byte) 65);
        setByteElement(term9641, 1, (byte) 66);
        setByteElement(term9641, 2, (byte) 67);
        setByteElement(term9641, 3, (byte) 68);
        setByteElement(term9641, 4, (byte) 69);
        setByteElement(term9641, 5, (byte) 70);
        setByteElement(term9641, 6, (byte) 71);
        setByteElement(term9641, 7, (byte) 72);
        setByteElement(term9641, 8, (byte) 73);
        setByteElement(term9641, 9, (byte) 74);
        setByteElement(term9641, 10, (byte) 75);
        setByteElement(term9641, 11, (byte) 76);
        setByteElement(term9641, 12, (byte) 77);
        setByteElement(term9641, 13, (byte) 78);
        setByteElement(term9641, 14, (byte) 79);
        setByteElement(term9641, 15, (byte) 80);
        setByteElement(term9641, 16, (byte) 81);
        setByteElement(term9641, 17, (byte) 82);
        setByteElement(term9641, 18, (byte) 83);
        setByteElement(term9641, 19, (byte) 84);
        setByteElement(term9641, 20, (byte) 85);
        setByteElement(term9641, 21, (byte) 86);
        setByteElement(term9641, 22, (byte) 87);
        setByteElement(term9641, 23, (byte) 88);
        setByteElement(term9641, 24, (byte) 89);
        setByteElement(term9641, 25, (byte) 90);
        setByteElement(term9641, 26, (byte) 97);
        setByteElement(term9641, 27, (byte) 98);
        setByteElement(term9641, 28, (byte) 99);
        setByteElement(term9641, 29, (byte) 100);
        setByteElement(term9641, 30, (byte) 101);
        setByteElement(term9641, 31, (byte) 102);
        setByteElement(term9641, 32, (byte) 103);
        setByteElement(term9641, 33, (byte) 104);
        setByteElement(term9641, 34, (byte) 105);
        setByteElement(term9641, 35, (byte) 106);
        setByteElement(term9641, 36, (byte) 107);
        setByteElement(term9641, 37, (byte) 108);
        setByteElement(term9641, 38, (byte) 109);
        setByteElement(term9641, 39, (byte) 110);
        setByteElement(term9641, 40, (byte) 111);
        setByteElement(term9641, 41, (byte) 112);
        setByteElement(term9641, 42, (byte) 113);
        setByteElement(term9641, 43, (byte) 114);
        setByteElement(term9641, 44, (byte) 115);
        setByteElement(term9641, 45, (byte) 116);
        setByteElement(term9641, 46, (byte) 117);
        setByteElement(term9641, 47, (byte) 118);
        setByteElement(term9641, 48, (byte) 119);
        setByteElement(term9641, 49, (byte) 120);
        setByteElement(term9641, 50, (byte) 121);
        setByteElement(term9641, 51, (byte) 122);
        setByteElement(term9641, 52, (byte) 48);
        setByteElement(term9641, 53, (byte) 49);
        setByteElement(term9641, 54, (byte) 50);
        setByteElement(term9641, 55, (byte) 51);
        setByteElement(term9641, 56, (byte) 52);
        setByteElement(term9641, 57, (byte) 53);
        setByteElement(term9641, 58, (byte) 54);
        setByteElement(term9641, 59, (byte) 55);
        setByteElement(term9641, 60, (byte) 56);
        setByteElement(term9641, 61, (byte) 57);
        setByteElement(term9641, 62, (byte) 43);
        setByteElement(term9641, 63, (byte) 47);
        setField(term9640, term9640.getClass(), "encodeTable", term9641);
        setIntField(term9640, term9640.getClass(), "lineLength", 76);
        setByteElement(term9642, 0, (byte) 13);
        setByteElement(term9642, 1, (byte) 10);
        setField(term9640, term9640.getClass(), "lineSeparator", term9642);
        setIntField(term9640, term9640.getClass(), "decodeSize", 5);
        setIntField(term9640, term9640.getClass(), "encodeSize", 6);
        setField(term9640, term9640.getClass(), "buffer", null);
        setIntField(term9640, term9640.getClass(), "pos", 0);
        setIntField(term9640, term9640.getClass(), "readPos", 0);
        setIntField(term9640, term9640.getClass(), "currentLinePos", 0);
        setIntField(term9640, term9640.getClass(), "modulus", 0);
        setBooleanField(term9640, term9640.getClass(), "eof", false);
        setIntField(term9640, term9640.getClass(), "x", 0);
        setField(term9639, term9639.getClass(), "base64", term9640);
        setField(term9639, term9639.getClass(), "singleByte", term9643);
        setField(term9644, term9644.getClass(), "in", null);
        setField(term9639, term9639.getClass(), "in", term9644);
        term9645 = newInstance(Class.forName("java.io.FilterInputStream"));
        setField(term9645, term9645.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term9431;
        args[1] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9639));
        assertTrue(recursiveEquals(term9431, term9645));
    }

};


