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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Base64InputStream_read_3012614549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18;

    public Base64InputStream_read_3012614549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term20 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term21 = (byte[]) newByteArray(64);
        byte[] term87 = (byte[]) newByteArray(2);
        byte[] term92 = (byte[]) newByteArray(4);
        byte[] term103 = (byte[]) newByteArray(3);
        setBooleanField(term18, term18.getClass(), "doEncode", false);
        setByteElement(term21, 0, (byte) 65);
        setByteElement(term21, 1, (byte) 66);
        setByteElement(term21, 2, (byte) 67);
        setByteElement(term21, 3, (byte) 68);
        setByteElement(term21, 4, (byte) 69);
        setByteElement(term21, 5, (byte) 70);
        setByteElement(term21, 6, (byte) 71);
        setByteElement(term21, 7, (byte) 72);
        setByteElement(term21, 8, (byte) 73);
        setByteElement(term21, 9, (byte) 74);
        setByteElement(term21, 10, (byte) 75);
        setByteElement(term21, 11, (byte) 76);
        setByteElement(term21, 12, (byte) 77);
        setByteElement(term21, 13, (byte) 78);
        setByteElement(term21, 14, (byte) 79);
        setByteElement(term21, 15, (byte) 80);
        setByteElement(term21, 16, (byte) 81);
        setByteElement(term21, 17, (byte) 82);
        setByteElement(term21, 18, (byte) 83);
        setByteElement(term21, 19, (byte) 84);
        setByteElement(term21, 20, (byte) 85);
        setByteElement(term21, 21, (byte) 86);
        setByteElement(term21, 22, (byte) 87);
        setByteElement(term21, 23, (byte) 88);
        setByteElement(term21, 24, (byte) 89);
        setByteElement(term21, 25, (byte) 90);
        setByteElement(term21, 26, (byte) 97);
        setByteElement(term21, 27, (byte) 98);
        setByteElement(term21, 28, (byte) 99);
        setByteElement(term21, 29, (byte) 100);
        setByteElement(term21, 30, (byte) 101);
        setByteElement(term21, 31, (byte) 102);
        setByteElement(term21, 32, (byte) 103);
        setByteElement(term21, 33, (byte) 104);
        setByteElement(term21, 34, (byte) 105);
        setByteElement(term21, 35, (byte) 106);
        setByteElement(term21, 36, (byte) 107);
        setByteElement(term21, 37, (byte) 108);
        setByteElement(term21, 38, (byte) 109);
        setByteElement(term21, 39, (byte) 110);
        setByteElement(term21, 40, (byte) 111);
        setByteElement(term21, 41, (byte) 112);
        setByteElement(term21, 42, (byte) 113);
        setByteElement(term21, 43, (byte) 114);
        setByteElement(term21, 44, (byte) 115);
        setByteElement(term21, 45, (byte) 116);
        setByteElement(term21, 46, (byte) 117);
        setByteElement(term21, 47, (byte) 118);
        setByteElement(term21, 48, (byte) 119);
        setByteElement(term21, 49, (byte) 120);
        setByteElement(term21, 50, (byte) 121);
        setByteElement(term21, 51, (byte) 122);
        setByteElement(term21, 52, (byte) 48);
        setByteElement(term21, 53, (byte) 49);
        setByteElement(term21, 54, (byte) 50);
        setByteElement(term21, 55, (byte) 51);
        setByteElement(term21, 56, (byte) 52);
        setByteElement(term21, 57, (byte) 53);
        setByteElement(term21, 58, (byte) 54);
        setByteElement(term21, 59, (byte) 55);
        setByteElement(term21, 60, (byte) 56);
        setByteElement(term21, 61, (byte) 57);
        setByteElement(term21, 62, (byte) 43);
        setByteElement(term21, 63, (byte) 47);
        setField(term20, term20.getClass(), "encodeTable", term21);
        setIntField(term20, term20.getClass(), "lineLength", 1162663216);
        setByteElement(term87, 0, (byte) 13);
        setByteElement(term87, 1, (byte) 10);
        setField(term20, term20.getClass(), "lineSeparator", term87);
        setIntField(term20, term20.getClass(), "decodeSize", 3);
        setIntField(term20, term20.getClass(), "encodeSize", 4);
        setByteElement(term92, 0, (byte) -58);
        setByteElement(term92, 1, (byte) -29);
        setByteElement(term92, 2, (byte) -54);
        setByteElement(term92, 3, (byte) -10);
        setField(term20, term20.getClass(), "buffer", term92);
        setIntField(term20, term20.getClass(), "pos", 1484323161);
        setIntField(term20, term20.getClass(), "readPos", 391863371);
        setIntField(term20, term20.getClass(), "currentLinePos", -1922583790);
        setIntField(term20, term20.getClass(), "modulus", -616727354);
        setBooleanField(term20, term20.getClass(), "eof", false);
        setIntField(term20, term20.getClass(), "x", -1955890973);
        setField(term18, term18.getClass(), "base64", term20);
        setByteElement(term103, 0, (byte) 79);
        setByteElement(term103, 1, (byte) -119);
        setByteElement(term103, 2, (byte) -66);
        setField(term18, term18.getClass(), "singleByte", term103);
        setField(term18, term18.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term18, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


