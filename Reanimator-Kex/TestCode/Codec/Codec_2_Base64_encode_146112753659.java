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

public class Base64_encode_146112753659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1721;
     Object term1803;

    public Base64_encode_146112753659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1721 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term1722 = (byte[]) newByteArray(64);
        byte[] term1788 = (byte[]) newByteArray(2);
        byte[] term1793 = (byte[]) newByteArray(3);
        setByteElement(term1722, 0, (byte) 65);
        setByteElement(term1722, 1, (byte) 66);
        setByteElement(term1722, 2, (byte) 67);
        setByteElement(term1722, 3, (byte) 68);
        setByteElement(term1722, 4, (byte) 69);
        setByteElement(term1722, 5, (byte) 70);
        setByteElement(term1722, 6, (byte) 71);
        setByteElement(term1722, 7, (byte) 72);
        setByteElement(term1722, 8, (byte) 73);
        setByteElement(term1722, 9, (byte) 74);
        setByteElement(term1722, 10, (byte) 75);
        setByteElement(term1722, 11, (byte) 76);
        setByteElement(term1722, 12, (byte) 77);
        setByteElement(term1722, 13, (byte) 78);
        setByteElement(term1722, 14, (byte) 79);
        setByteElement(term1722, 15, (byte) 80);
        setByteElement(term1722, 16, (byte) 81);
        setByteElement(term1722, 17, (byte) 82);
        setByteElement(term1722, 18, (byte) 83);
        setByteElement(term1722, 19, (byte) 84);
        setByteElement(term1722, 20, (byte) 85);
        setByteElement(term1722, 21, (byte) 86);
        setByteElement(term1722, 22, (byte) 87);
        setByteElement(term1722, 23, (byte) 88);
        setByteElement(term1722, 24, (byte) 89);
        setByteElement(term1722, 25, (byte) 90);
        setByteElement(term1722, 26, (byte) 97);
        setByteElement(term1722, 27, (byte) 98);
        setByteElement(term1722, 28, (byte) 99);
        setByteElement(term1722, 29, (byte) 100);
        setByteElement(term1722, 30, (byte) 101);
        setByteElement(term1722, 31, (byte) 102);
        setByteElement(term1722, 32, (byte) 103);
        setByteElement(term1722, 33, (byte) 104);
        setByteElement(term1722, 34, (byte) 105);
        setByteElement(term1722, 35, (byte) 106);
        setByteElement(term1722, 36, (byte) 107);
        setByteElement(term1722, 37, (byte) 108);
        setByteElement(term1722, 38, (byte) 109);
        setByteElement(term1722, 39, (byte) 110);
        setByteElement(term1722, 40, (byte) 111);
        setByteElement(term1722, 41, (byte) 112);
        setByteElement(term1722, 42, (byte) 113);
        setByteElement(term1722, 43, (byte) 114);
        setByteElement(term1722, 44, (byte) 115);
        setByteElement(term1722, 45, (byte) 116);
        setByteElement(term1722, 46, (byte) 117);
        setByteElement(term1722, 47, (byte) 118);
        setByteElement(term1722, 48, (byte) 119);
        setByteElement(term1722, 49, (byte) 120);
        setByteElement(term1722, 50, (byte) 121);
        setByteElement(term1722, 51, (byte) 122);
        setByteElement(term1722, 52, (byte) 48);
        setByteElement(term1722, 53, (byte) 49);
        setByteElement(term1722, 54, (byte) 50);
        setByteElement(term1722, 55, (byte) 51);
        setByteElement(term1722, 56, (byte) 52);
        setByteElement(term1722, 57, (byte) 53);
        setByteElement(term1722, 58, (byte) 54);
        setByteElement(term1722, 59, (byte) 55);
        setByteElement(term1722, 60, (byte) 56);
        setByteElement(term1722, 61, (byte) 57);
        setByteElement(term1722, 62, (byte) 43);
        setByteElement(term1722, 63, (byte) 47);
        setField(term1721, term1721.getClass(), "encodeTable", term1722);
        setIntField(term1721, term1721.getClass(), "lineLength", 76);
        setByteElement(term1788, 0, (byte) 13);
        setByteElement(term1788, 1, (byte) 10);
        setField(term1721, term1721.getClass(), "lineSeparator", term1788);
        setIntField(term1721, term1721.getClass(), "decodeSize", 5);
        setIntField(term1721, term1721.getClass(), "encodeSize", 6);
        setByteElement(term1793, 0, (byte) 28);
        setByteElement(term1793, 1, (byte) 84);
        setByteElement(term1793, 2, (byte) 85);
        setField(term1721, term1721.getClass(), "buf", term1793);
        setIntField(term1721, term1721.getClass(), "pos", 97029295);
        setIntField(term1721, term1721.getClass(), "readPos", -1371869594);
        setIntField(term1721, term1721.getClass(), "currentLinePos", -2095575670);
        setIntField(term1721, term1721.getClass(), "modulus", 1225272962);
        setBooleanField(term1721, term1721.getClass(), "eof", false);
        setIntField(term1721, term1721.getClass(), "x", 1324040357);
        term1803 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1803;
        try {
            callMethod(klass, "encode", argTypes, term1721, args);
            assertTrue(false);
        }
        catch (EncoderException e) {
        }

    }

};


