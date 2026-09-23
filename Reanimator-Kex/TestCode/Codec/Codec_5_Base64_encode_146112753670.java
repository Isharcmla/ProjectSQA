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
import org.apache.commons.codec.EncoderException;
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Base64_encode_146112753670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1942;
     Object term2027;

    public Base64_encode_146112753670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1942 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term1943 = (byte[]) newByteArray(64);
        byte[] term2009 = (byte[]) newByteArray(2);
        byte[] term2014 = (byte[]) newByteArray(6);
        setByteElement(term1943, 0, (byte) 65);
        setByteElement(term1943, 1, (byte) 66);
        setByteElement(term1943, 2, (byte) 67);
        setByteElement(term1943, 3, (byte) 68);
        setByteElement(term1943, 4, (byte) 69);
        setByteElement(term1943, 5, (byte) 70);
        setByteElement(term1943, 6, (byte) 71);
        setByteElement(term1943, 7, (byte) 72);
        setByteElement(term1943, 8, (byte) 73);
        setByteElement(term1943, 9, (byte) 74);
        setByteElement(term1943, 10, (byte) 75);
        setByteElement(term1943, 11, (byte) 76);
        setByteElement(term1943, 12, (byte) 77);
        setByteElement(term1943, 13, (byte) 78);
        setByteElement(term1943, 14, (byte) 79);
        setByteElement(term1943, 15, (byte) 80);
        setByteElement(term1943, 16, (byte) 81);
        setByteElement(term1943, 17, (byte) 82);
        setByteElement(term1943, 18, (byte) 83);
        setByteElement(term1943, 19, (byte) 84);
        setByteElement(term1943, 20, (byte) 85);
        setByteElement(term1943, 21, (byte) 86);
        setByteElement(term1943, 22, (byte) 87);
        setByteElement(term1943, 23, (byte) 88);
        setByteElement(term1943, 24, (byte) 89);
        setByteElement(term1943, 25, (byte) 90);
        setByteElement(term1943, 26, (byte) 97);
        setByteElement(term1943, 27, (byte) 98);
        setByteElement(term1943, 28, (byte) 99);
        setByteElement(term1943, 29, (byte) 100);
        setByteElement(term1943, 30, (byte) 101);
        setByteElement(term1943, 31, (byte) 102);
        setByteElement(term1943, 32, (byte) 103);
        setByteElement(term1943, 33, (byte) 104);
        setByteElement(term1943, 34, (byte) 105);
        setByteElement(term1943, 35, (byte) 106);
        setByteElement(term1943, 36, (byte) 107);
        setByteElement(term1943, 37, (byte) 108);
        setByteElement(term1943, 38, (byte) 109);
        setByteElement(term1943, 39, (byte) 110);
        setByteElement(term1943, 40, (byte) 111);
        setByteElement(term1943, 41, (byte) 112);
        setByteElement(term1943, 42, (byte) 113);
        setByteElement(term1943, 43, (byte) 114);
        setByteElement(term1943, 44, (byte) 115);
        setByteElement(term1943, 45, (byte) 116);
        setByteElement(term1943, 46, (byte) 117);
        setByteElement(term1943, 47, (byte) 118);
        setByteElement(term1943, 48, (byte) 119);
        setByteElement(term1943, 49, (byte) 120);
        setByteElement(term1943, 50, (byte) 121);
        setByteElement(term1943, 51, (byte) 122);
        setByteElement(term1943, 52, (byte) 48);
        setByteElement(term1943, 53, (byte) 49);
        setByteElement(term1943, 54, (byte) 50);
        setByteElement(term1943, 55, (byte) 51);
        setByteElement(term1943, 56, (byte) 52);
        setByteElement(term1943, 57, (byte) 53);
        setByteElement(term1943, 58, (byte) 54);
        setByteElement(term1943, 59, (byte) 55);
        setByteElement(term1943, 60, (byte) 56);
        setByteElement(term1943, 61, (byte) 57);
        setByteElement(term1943, 62, (byte) 43);
        setByteElement(term1943, 63, (byte) 47);
        setField(term1942, term1942.getClass(), "encodeTable", term1943);
        setIntField(term1942, term1942.getClass(), "lineLength", 1375330971);
        setByteElement(term2009, 0, (byte) 13);
        setByteElement(term2009, 1, (byte) 10);
        setField(term1942, term1942.getClass(), "lineSeparator", term2009);
        setIntField(term1942, term1942.getClass(), "decodeSize", 3);
        setIntField(term1942, term1942.getClass(), "encodeSize", 4);
        setByteElement(term2014, 0, (byte) -53);
        setByteElement(term2014, 1, (byte) -8);
        setByteElement(term2014, 2, (byte) -9);
        setByteElement(term2014, 3, (byte) 97);
        setByteElement(term2014, 4, (byte) -46);
        setByteElement(term2014, 5, (byte) 14);
        setField(term1942, term1942.getClass(), "buffer", term2014);
        setIntField(term1942, term1942.getClass(), "pos", -478195677);
        setIntField(term1942, term1942.getClass(), "readPos", 972867650);
        setIntField(term1942, term1942.getClass(), "currentLinePos", 1655935355);
        setIntField(term1942, term1942.getClass(), "modulus", -481533957);
        setBooleanField(term1942, term1942.getClass(), "eof", false);
        setIntField(term1942, term1942.getClass(), "x", 1240914516);
        term2027 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2027;
        try {
            callMethod(klass, "encode", argTypes, term1942, args);
            assertTrue(false);
        }
        catch (EncoderException e) {
        }

    }

};


