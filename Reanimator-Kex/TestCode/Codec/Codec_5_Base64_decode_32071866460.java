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

public class Base64_decode_32071866460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1360;
     Object term1440;

    public Base64_decode_32071866460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1360 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term1361 = (byte[]) newByteArray(64);
        byte[] term1427 = (byte[]) newByteArray(2);
        byte[] term1432 = (byte[]) newByteArray(1);
        setByteElement(term1361, 0, (byte) 65);
        setByteElement(term1361, 1, (byte) 66);
        setByteElement(term1361, 2, (byte) 67);
        setByteElement(term1361, 3, (byte) 68);
        setByteElement(term1361, 4, (byte) 69);
        setByteElement(term1361, 5, (byte) 70);
        setByteElement(term1361, 6, (byte) 71);
        setByteElement(term1361, 7, (byte) 72);
        setByteElement(term1361, 8, (byte) 73);
        setByteElement(term1361, 9, (byte) 74);
        setByteElement(term1361, 10, (byte) 75);
        setByteElement(term1361, 11, (byte) 76);
        setByteElement(term1361, 12, (byte) 77);
        setByteElement(term1361, 13, (byte) 78);
        setByteElement(term1361, 14, (byte) 79);
        setByteElement(term1361, 15, (byte) 80);
        setByteElement(term1361, 16, (byte) 81);
        setByteElement(term1361, 17, (byte) 82);
        setByteElement(term1361, 18, (byte) 83);
        setByteElement(term1361, 19, (byte) 84);
        setByteElement(term1361, 20, (byte) 85);
        setByteElement(term1361, 21, (byte) 86);
        setByteElement(term1361, 22, (byte) 87);
        setByteElement(term1361, 23, (byte) 88);
        setByteElement(term1361, 24, (byte) 89);
        setByteElement(term1361, 25, (byte) 90);
        setByteElement(term1361, 26, (byte) 97);
        setByteElement(term1361, 27, (byte) 98);
        setByteElement(term1361, 28, (byte) 99);
        setByteElement(term1361, 29, (byte) 100);
        setByteElement(term1361, 30, (byte) 101);
        setByteElement(term1361, 31, (byte) 102);
        setByteElement(term1361, 32, (byte) 103);
        setByteElement(term1361, 33, (byte) 104);
        setByteElement(term1361, 34, (byte) 105);
        setByteElement(term1361, 35, (byte) 106);
        setByteElement(term1361, 36, (byte) 107);
        setByteElement(term1361, 37, (byte) 108);
        setByteElement(term1361, 38, (byte) 109);
        setByteElement(term1361, 39, (byte) 110);
        setByteElement(term1361, 40, (byte) 111);
        setByteElement(term1361, 41, (byte) 112);
        setByteElement(term1361, 42, (byte) 113);
        setByteElement(term1361, 43, (byte) 114);
        setByteElement(term1361, 44, (byte) 115);
        setByteElement(term1361, 45, (byte) 116);
        setByteElement(term1361, 46, (byte) 117);
        setByteElement(term1361, 47, (byte) 118);
        setByteElement(term1361, 48, (byte) 119);
        setByteElement(term1361, 49, (byte) 120);
        setByteElement(term1361, 50, (byte) 121);
        setByteElement(term1361, 51, (byte) 122);
        setByteElement(term1361, 52, (byte) 48);
        setByteElement(term1361, 53, (byte) 49);
        setByteElement(term1361, 54, (byte) 50);
        setByteElement(term1361, 55, (byte) 51);
        setByteElement(term1361, 56, (byte) 52);
        setByteElement(term1361, 57, (byte) 53);
        setByteElement(term1361, 58, (byte) 54);
        setByteElement(term1361, 59, (byte) 55);
        setByteElement(term1361, 60, (byte) 56);
        setByteElement(term1361, 61, (byte) 57);
        setByteElement(term1361, 62, (byte) 43);
        setByteElement(term1361, 63, (byte) 47);
        setField(term1360, term1360.getClass(), "encodeTable", term1361);
        setIntField(term1360, term1360.getClass(), "lineLength", 1328271830);
        setByteElement(term1427, 0, (byte) 13);
        setByteElement(term1427, 1, (byte) 10);
        setField(term1360, term1360.getClass(), "lineSeparator", term1427);
        setIntField(term1360, term1360.getClass(), "decodeSize", 3);
        setIntField(term1360, term1360.getClass(), "encodeSize", 4);
        setByteElement(term1432, 0, (byte) 66);
        setField(term1360, term1360.getClass(), "buffer", term1432);
        setIntField(term1360, term1360.getClass(), "pos", 1596070772);
        setIntField(term1360, term1360.getClass(), "readPos", 97029295);
        setIntField(term1360, term1360.getClass(), "currentLinePos", -1371869594);
        setIntField(term1360, term1360.getClass(), "modulus", -2095575670);
        setBooleanField(term1360, term1360.getClass(), "eof", false);
        setIntField(term1360, term1360.getClass(), "x", 1225272962);
        term1440 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1440;
        try {
            callMethod(klass, "decode", argTypes, term1360, args);
            assertTrue(false);
        }
        catch (DecoderException e) {
        }

    }

};


