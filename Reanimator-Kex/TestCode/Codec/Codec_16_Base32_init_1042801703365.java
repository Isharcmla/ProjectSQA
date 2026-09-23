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

public class Base32_init_1042801703365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term704212;
     Object term763887;
     Object term763891;

    public Base32_init_1042801703365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term706886 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term704715 = (byte[]) newByteArray(0);
        byte[] term704822 = (byte[]) newByteArray(0);
        setByteField(term706886, term706886.getClass(), "PAD", (byte) 0);
        setIntField(term706886, term706886.getClass(), "unencodedBlockSize", 0);
        setIntField(term706886, term706886.getClass(), "encodedBlockSize", 0);
        setIntField(term706886, term706886.getClass(), "lineLength", 0);
        setIntField(term706886, term706886.getClass(), "chunkSeparatorLength", 0);
        setByteField(term706886, term706886.getClass(), "pad", (byte) -128);
        setField(term706886, term706886.getClass(), "encodeTable", term704715);
        setField(term706886, term706886.getClass(), "decodeTable", term704822);
        term704212 = (byte[]) newByteArray(495);
        setByteElement(term704212, 8, (byte) 112);
        term763887 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term763888 = (byte[]) newByteArray(88);
        byte[] term763889 = (byte[]) newByteArray(32);
        byte[] term763890 = (byte[]) newByteArray(495);
        setIntField(term763887, term763887.getClass(), "decodeSize", 502);
        setByteElement(term763888, 0, (byte) -1);
        setByteElement(term763888, 1, (byte) -1);
        setByteElement(term763888, 2, (byte) -1);
        setByteElement(term763888, 3, (byte) -1);
        setByteElement(term763888, 4, (byte) -1);
        setByteElement(term763888, 5, (byte) -1);
        setByteElement(term763888, 6, (byte) -1);
        setByteElement(term763888, 7, (byte) -1);
        setByteElement(term763888, 8, (byte) -1);
        setByteElement(term763888, 9, (byte) -1);
        setByteElement(term763888, 10, (byte) -1);
        setByteElement(term763888, 11, (byte) -1);
        setByteElement(term763888, 12, (byte) -1);
        setByteElement(term763888, 13, (byte) -1);
        setByteElement(term763888, 14, (byte) -1);
        setByteElement(term763888, 15, (byte) -1);
        setByteElement(term763888, 16, (byte) -1);
        setByteElement(term763888, 17, (byte) -1);
        setByteElement(term763888, 18, (byte) -1);
        setByteElement(term763888, 19, (byte) -1);
        setByteElement(term763888, 20, (byte) -1);
        setByteElement(term763888, 21, (byte) -1);
        setByteElement(term763888, 22, (byte) -1);
        setByteElement(term763888, 23, (byte) -1);
        setByteElement(term763888, 24, (byte) -1);
        setByteElement(term763888, 25, (byte) -1);
        setByteElement(term763888, 26, (byte) -1);
        setByteElement(term763888, 27, (byte) -1);
        setByteElement(term763888, 28, (byte) -1);
        setByteElement(term763888, 29, (byte) -1);
        setByteElement(term763888, 30, (byte) -1);
        setByteElement(term763888, 31, (byte) -1);
        setByteElement(term763888, 32, (byte) -1);
        setByteElement(term763888, 33, (byte) -1);
        setByteElement(term763888, 34, (byte) -1);
        setByteElement(term763888, 35, (byte) -1);
        setByteElement(term763888, 36, (byte) -1);
        setByteElement(term763888, 37, (byte) -1);
        setByteElement(term763888, 38, (byte) -1);
        setByteElement(term763888, 39, (byte) -1);
        setByteElement(term763888, 40, (byte) -1);
        setByteElement(term763888, 41, (byte) -1);
        setByteElement(term763888, 42, (byte) -1);
        setByteElement(term763888, 43, (byte) -1);
        setByteElement(term763888, 44, (byte) -1);
        setByteElement(term763888, 45, (byte) -1);
        setByteElement(term763888, 46, (byte) -1);
        setByteElement(term763888, 47, (byte) -1);
        setByteElement(term763888, 49, (byte) 1);
        setByteElement(term763888, 50, (byte) 2);
        setByteElement(term763888, 51, (byte) 3);
        setByteElement(term763888, 52, (byte) 4);
        setByteElement(term763888, 53, (byte) 5);
        setByteElement(term763888, 54, (byte) 6);
        setByteElement(term763888, 55, (byte) 7);
        setByteElement(term763888, 56, (byte) 8);
        setByteElement(term763888, 57, (byte) 9);
        setByteElement(term763888, 58, (byte) -1);
        setByteElement(term763888, 59, (byte) -1);
        setByteElement(term763888, 60, (byte) -1);
        setByteElement(term763888, 61, (byte) -1);
        setByteElement(term763888, 62, (byte) -1);
        setByteElement(term763888, 63, (byte) -1);
        setByteElement(term763888, 64, (byte) -1);
        setByteElement(term763888, 65, (byte) 10);
        setByteElement(term763888, 66, (byte) 11);
        setByteElement(term763888, 67, (byte) 12);
        setByteElement(term763888, 68, (byte) 13);
        setByteElement(term763888, 69, (byte) 14);
        setByteElement(term763888, 70, (byte) 15);
        setByteElement(term763888, 71, (byte) 16);
        setByteElement(term763888, 72, (byte) 17);
        setByteElement(term763888, 73, (byte) 18);
        setByteElement(term763888, 74, (byte) 19);
        setByteElement(term763888, 75, (byte) 20);
        setByteElement(term763888, 76, (byte) 21);
        setByteElement(term763888, 77, (byte) 22);
        setByteElement(term763888, 78, (byte) 23);
        setByteElement(term763888, 79, (byte) 24);
        setByteElement(term763888, 80, (byte) 25);
        setByteElement(term763888, 81, (byte) 26);
        setByteElement(term763888, 82, (byte) 27);
        setByteElement(term763888, 83, (byte) 28);
        setByteElement(term763888, 84, (byte) 29);
        setByteElement(term763888, 85, (byte) 30);
        setByteElement(term763888, 86, (byte) 31);
        setByteElement(term763888, 87, (byte) 32);
        setField(term763887, term763887.getClass(), "decodeTable", term763888);
        setIntField(term763887, term763887.getClass(), "encodeSize", 503);
        setByteElement(term763889, 0, (byte) 48);
        setByteElement(term763889, 1, (byte) 49);
        setByteElement(term763889, 2, (byte) 50);
        setByteElement(term763889, 3, (byte) 51);
        setByteElement(term763889, 4, (byte) 52);
        setByteElement(term763889, 5, (byte) 53);
        setByteElement(term763889, 6, (byte) 54);
        setByteElement(term763889, 7, (byte) 55);
        setByteElement(term763889, 8, (byte) 56);
        setByteElement(term763889, 9, (byte) 57);
        setByteElement(term763889, 10, (byte) 65);
        setByteElement(term763889, 11, (byte) 66);
        setByteElement(term763889, 12, (byte) 67);
        setByteElement(term763889, 13, (byte) 68);
        setByteElement(term763889, 14, (byte) 69);
        setByteElement(term763889, 15, (byte) 70);
        setByteElement(term763889, 16, (byte) 71);
        setByteElement(term763889, 17, (byte) 72);
        setByteElement(term763889, 18, (byte) 73);
        setByteElement(term763889, 19, (byte) 74);
        setByteElement(term763889, 20, (byte) 75);
        setByteElement(term763889, 21, (byte) 76);
        setByteElement(term763889, 22, (byte) 77);
        setByteElement(term763889, 23, (byte) 78);
        setByteElement(term763889, 24, (byte) 79);
        setByteElement(term763889, 25, (byte) 80);
        setByteElement(term763889, 26, (byte) 81);
        setByteElement(term763889, 27, (byte) 82);
        setByteElement(term763889, 28, (byte) 83);
        setByteElement(term763889, 29, (byte) 84);
        setByteElement(term763889, 30, (byte) 85);
        setByteElement(term763889, 31, (byte) 86);
        setField(term763887, term763887.getClass(), "encodeTable", term763889);
        setByteElement(term763890, 8, (byte) 112);
        setField(term763887, term763887.getClass(), "lineSeparator", term763890);
        setByteField(term763887, term763887.getClass(), "PAD", (byte) 61);
        setByteField(term763887, term763887.getClass(), "pad", (byte) 61);
        setIntField(term763887, term763887.getClass(), "unencodedBlockSize", 5);
        setIntField(term763887, term763887.getClass(), "encodedBlockSize", 8);
        setIntField(term763887, term763887.getClass(), "lineLength", 0);
        setIntField(term763887, term763887.getClass(), "chunkSeparatorLength", 495);
        term763891 = (byte[]) newByteArray(495);
        setByteElement(term763891, 8, (byte) 112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = 1;
        args[1] = term704212;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term763887));
        assertTrue(recursiveEquals(term704212, term763891));
    }

};


