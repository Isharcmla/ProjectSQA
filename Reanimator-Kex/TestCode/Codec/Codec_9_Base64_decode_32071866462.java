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
import org.apache.commons.codec.DecoderException;
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Base64_decode_32071866462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1229;
     Object term1310;

    public Base64_decode_32071866462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1229 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term1230 = (byte[]) newByteArray(64);
        byte[] term1296 = (byte[]) newByteArray(2);
        byte[] term1301 = (byte[]) newByteArray(2);
        setByteElement(term1230, 0, (byte) 65);
        setByteElement(term1230, 1, (byte) 66);
        setByteElement(term1230, 2, (byte) 67);
        setByteElement(term1230, 3, (byte) 68);
        setByteElement(term1230, 4, (byte) 69);
        setByteElement(term1230, 5, (byte) 70);
        setByteElement(term1230, 6, (byte) 71);
        setByteElement(term1230, 7, (byte) 72);
        setByteElement(term1230, 8, (byte) 73);
        setByteElement(term1230, 9, (byte) 74);
        setByteElement(term1230, 10, (byte) 75);
        setByteElement(term1230, 11, (byte) 76);
        setByteElement(term1230, 12, (byte) 77);
        setByteElement(term1230, 13, (byte) 78);
        setByteElement(term1230, 14, (byte) 79);
        setByteElement(term1230, 15, (byte) 80);
        setByteElement(term1230, 16, (byte) 81);
        setByteElement(term1230, 17, (byte) 82);
        setByteElement(term1230, 18, (byte) 83);
        setByteElement(term1230, 19, (byte) 84);
        setByteElement(term1230, 20, (byte) 85);
        setByteElement(term1230, 21, (byte) 86);
        setByteElement(term1230, 22, (byte) 87);
        setByteElement(term1230, 23, (byte) 88);
        setByteElement(term1230, 24, (byte) 89);
        setByteElement(term1230, 25, (byte) 90);
        setByteElement(term1230, 26, (byte) 97);
        setByteElement(term1230, 27, (byte) 98);
        setByteElement(term1230, 28, (byte) 99);
        setByteElement(term1230, 29, (byte) 100);
        setByteElement(term1230, 30, (byte) 101);
        setByteElement(term1230, 31, (byte) 102);
        setByteElement(term1230, 32, (byte) 103);
        setByteElement(term1230, 33, (byte) 104);
        setByteElement(term1230, 34, (byte) 105);
        setByteElement(term1230, 35, (byte) 106);
        setByteElement(term1230, 36, (byte) 107);
        setByteElement(term1230, 37, (byte) 108);
        setByteElement(term1230, 38, (byte) 109);
        setByteElement(term1230, 39, (byte) 110);
        setByteElement(term1230, 40, (byte) 111);
        setByteElement(term1230, 41, (byte) 112);
        setByteElement(term1230, 42, (byte) 113);
        setByteElement(term1230, 43, (byte) 114);
        setByteElement(term1230, 44, (byte) 115);
        setByteElement(term1230, 45, (byte) 116);
        setByteElement(term1230, 46, (byte) 117);
        setByteElement(term1230, 47, (byte) 118);
        setByteElement(term1230, 48, (byte) 119);
        setByteElement(term1230, 49, (byte) 120);
        setByteElement(term1230, 50, (byte) 121);
        setByteElement(term1230, 51, (byte) 122);
        setByteElement(term1230, 52, (byte) 48);
        setByteElement(term1230, 53, (byte) 49);
        setByteElement(term1230, 54, (byte) 50);
        setByteElement(term1230, 55, (byte) 51);
        setByteElement(term1230, 56, (byte) 52);
        setByteElement(term1230, 57, (byte) 53);
        setByteElement(term1230, 58, (byte) 54);
        setByteElement(term1230, 59, (byte) 55);
        setByteElement(term1230, 60, (byte) 56);
        setByteElement(term1230, 61, (byte) 57);
        setByteElement(term1230, 62, (byte) 43);
        setByteElement(term1230, 63, (byte) 47);
        setField(term1229, term1229.getClass(), "encodeTable", term1230);
        setIntField(term1229, term1229.getClass(), "lineLength", 454281060);
        setByteElement(term1296, 0, (byte) 13);
        setByteElement(term1296, 1, (byte) 10);
        setField(term1229, term1229.getClass(), "lineSeparator", term1296);
        setIntField(term1229, term1229.getClass(), "decodeSize", 3);
        setIntField(term1229, term1229.getClass(), "encodeSize", 4);
        setByteElement(term1301, 0, (byte) -101);
        setByteElement(term1301, 1, (byte) 35);
        setField(term1229, term1229.getClass(), "buffer", term1301);
        setIntField(term1229, term1229.getClass(), "pos", -1786399638);
        setIntField(term1229, term1229.getClass(), "readPos", 2055867847);
        setIntField(term1229, term1229.getClass(), "currentLinePos", -1048298087);
        setIntField(term1229, term1229.getClass(), "modulus", 292681826);
        setBooleanField(term1229, term1229.getClass(), "eof", true);
        setIntField(term1229, term1229.getClass(), "x", 458147407);
        term1310 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1310;
        try {
            callMethod(klass, "decode", argTypes, term1229, args);
            assertTrue(false);
        }
        catch (DecoderException e) {
        }

    }

};


