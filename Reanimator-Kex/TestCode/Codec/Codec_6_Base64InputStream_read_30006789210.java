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
import java.lang.IndexOutOfBoundsException;
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Base64InputStream_read_30006789210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180;
     Object term267;
     Object term274;
     Object term276;

    public Base64InputStream_read_30006789210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term182 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term183 = (byte[]) newByteArray(64);
        byte[] term249 = (byte[]) newByteArray(2);
        byte[] term254 = (byte[]) newByteArray(4);
        byte[] term265 = (byte[]) newByteArray(1);
        setBooleanField(term180, term180.getClass(), "doEncode", true);
        setByteElement(term183, 0, (byte) 65);
        setByteElement(term183, 1, (byte) 66);
        setByteElement(term183, 2, (byte) 67);
        setByteElement(term183, 3, (byte) 68);
        setByteElement(term183, 4, (byte) 69);
        setByteElement(term183, 5, (byte) 70);
        setByteElement(term183, 6, (byte) 71);
        setByteElement(term183, 7, (byte) 72);
        setByteElement(term183, 8, (byte) 73);
        setByteElement(term183, 9, (byte) 74);
        setByteElement(term183, 10, (byte) 75);
        setByteElement(term183, 11, (byte) 76);
        setByteElement(term183, 12, (byte) 77);
        setByteElement(term183, 13, (byte) 78);
        setByteElement(term183, 14, (byte) 79);
        setByteElement(term183, 15, (byte) 80);
        setByteElement(term183, 16, (byte) 81);
        setByteElement(term183, 17, (byte) 82);
        setByteElement(term183, 18, (byte) 83);
        setByteElement(term183, 19, (byte) 84);
        setByteElement(term183, 20, (byte) 85);
        setByteElement(term183, 21, (byte) 86);
        setByteElement(term183, 22, (byte) 87);
        setByteElement(term183, 23, (byte) 88);
        setByteElement(term183, 24, (byte) 89);
        setByteElement(term183, 25, (byte) 90);
        setByteElement(term183, 26, (byte) 97);
        setByteElement(term183, 27, (byte) 98);
        setByteElement(term183, 28, (byte) 99);
        setByteElement(term183, 29, (byte) 100);
        setByteElement(term183, 30, (byte) 101);
        setByteElement(term183, 31, (byte) 102);
        setByteElement(term183, 32, (byte) 103);
        setByteElement(term183, 33, (byte) 104);
        setByteElement(term183, 34, (byte) 105);
        setByteElement(term183, 35, (byte) 106);
        setByteElement(term183, 36, (byte) 107);
        setByteElement(term183, 37, (byte) 108);
        setByteElement(term183, 38, (byte) 109);
        setByteElement(term183, 39, (byte) 110);
        setByteElement(term183, 40, (byte) 111);
        setByteElement(term183, 41, (byte) 112);
        setByteElement(term183, 42, (byte) 113);
        setByteElement(term183, 43, (byte) 114);
        setByteElement(term183, 44, (byte) 115);
        setByteElement(term183, 45, (byte) 116);
        setByteElement(term183, 46, (byte) 117);
        setByteElement(term183, 47, (byte) 118);
        setByteElement(term183, 48, (byte) 119);
        setByteElement(term183, 49, (byte) 120);
        setByteElement(term183, 50, (byte) 121);
        setByteElement(term183, 51, (byte) 122);
        setByteElement(term183, 52, (byte) 48);
        setByteElement(term183, 53, (byte) 49);
        setByteElement(term183, 54, (byte) 50);
        setByteElement(term183, 55, (byte) 51);
        setByteElement(term183, 56, (byte) 52);
        setByteElement(term183, 57, (byte) 53);
        setByteElement(term183, 58, (byte) 54);
        setByteElement(term183, 59, (byte) 55);
        setByteElement(term183, 60, (byte) 56);
        setByteElement(term183, 61, (byte) 57);
        setByteElement(term183, 62, (byte) 43);
        setByteElement(term183, 63, (byte) 47);
        setField(term182, term182.getClass(), "encodeTable", term183);
        setIntField(term182, term182.getClass(), "lineLength", -2038273078);
        setByteElement(term249, 0, (byte) 13);
        setByteElement(term249, 1, (byte) 10);
        setField(term182, term182.getClass(), "lineSeparator", term249);
        setIntField(term182, term182.getClass(), "decodeSize", 3);
        setIntField(term182, term182.getClass(), "encodeSize", 4);
        setByteElement(term254, 0, (byte) 83);
        setByteElement(term254, 1, (byte) 74);
        setByteElement(term254, 2, (byte) -71);
        setByteElement(term254, 3, (byte) 49);
        setField(term182, term182.getClass(), "buffer", term254);
        setIntField(term182, term182.getClass(), "pos", 1227103734);
        setIntField(term182, term182.getClass(), "readPos", -1339778481);
        setIntField(term182, term182.getClass(), "currentLinePos", 1725571209);
        setIntField(term182, term182.getClass(), "modulus", -522618178);
        setBooleanField(term182, term182.getClass(), "eof", true);
        setIntField(term182, term182.getClass(), "x", 1134449235);
        setField(term180, term180.getClass(), "base64", term182);
        setByteElement(term265, 0, (byte) -54);
        setField(term180, term180.getClass(), "singleByte", term265);
        setField(term180, term180.getClass(), "in", null);
        term267 = (byte[]) newByteArray(6);
        setByteElement(term267, 0, (byte) 67);
        setByteElement(term267, 1, (byte) 78);
        setByteElement(term267, 2, (byte) 87);
        setByteElement(term267, 3, (byte) 121);
        setByteElement(term267, 4, (byte) -99);
        setByteElement(term267, 5, (byte) -2);
        term274 = new Integer(-883034806);
        term276 = new Integer(1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term267;
        args[1] = term274;
        args[2] = term276;
        try {
            callMethod(klass, "read", argTypes, term180, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


