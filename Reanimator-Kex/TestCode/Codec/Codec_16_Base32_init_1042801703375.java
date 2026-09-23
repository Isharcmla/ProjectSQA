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

public class Base32_init_1042801703375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746196;
     Object term777044;
     Object term777048;

    public Base32_init_1042801703375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term758285 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term746699 = (byte[]) newByteArray(0);
        byte[] term747190 = (byte[]) newByteArray(0);
        setByteField(term758285, term758285.getClass(), "PAD", (byte) 0);
        setIntField(term758285, term758285.getClass(), "unencodedBlockSize", 0);
        setIntField(term758285, term758285.getClass(), "encodedBlockSize", 0);
        setIntField(term758285, term758285.getClass(), "lineLength", 0);
        setIntField(term758285, term758285.getClass(), "chunkSeparatorLength", 0);
        setByteField(term758285, term758285.getClass(), "pad", (byte) -128);
        setField(term758285, term758285.getClass(), "encodeTable", term746699);
        setField(term758285, term758285.getClass(), "decodeTable", term747190);
        term746196 = (byte[]) newByteArray(495);
        setByteElement(term746196, 11, (byte) -128);
        term777044 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term777045 = (byte[]) newByteArray(88);
        byte[] term777046 = (byte[]) newByteArray(32);
        byte[] term777047 = (byte[]) newByteArray(495);
        setIntField(term777044, term777044.getClass(), "decodeSize", 502);
        setByteElement(term777045, 0, (byte) -1);
        setByteElement(term777045, 1, (byte) -1);
        setByteElement(term777045, 2, (byte) -1);
        setByteElement(term777045, 3, (byte) -1);
        setByteElement(term777045, 4, (byte) -1);
        setByteElement(term777045, 5, (byte) -1);
        setByteElement(term777045, 6, (byte) -1);
        setByteElement(term777045, 7, (byte) -1);
        setByteElement(term777045, 8, (byte) -1);
        setByteElement(term777045, 9, (byte) -1);
        setByteElement(term777045, 10, (byte) -1);
        setByteElement(term777045, 11, (byte) -1);
        setByteElement(term777045, 12, (byte) -1);
        setByteElement(term777045, 13, (byte) -1);
        setByteElement(term777045, 14, (byte) -1);
        setByteElement(term777045, 15, (byte) -1);
        setByteElement(term777045, 16, (byte) -1);
        setByteElement(term777045, 17, (byte) -1);
        setByteElement(term777045, 18, (byte) -1);
        setByteElement(term777045, 19, (byte) -1);
        setByteElement(term777045, 20, (byte) -1);
        setByteElement(term777045, 21, (byte) -1);
        setByteElement(term777045, 22, (byte) -1);
        setByteElement(term777045, 23, (byte) -1);
        setByteElement(term777045, 24, (byte) -1);
        setByteElement(term777045, 25, (byte) -1);
        setByteElement(term777045, 26, (byte) -1);
        setByteElement(term777045, 27, (byte) -1);
        setByteElement(term777045, 28, (byte) -1);
        setByteElement(term777045, 29, (byte) -1);
        setByteElement(term777045, 30, (byte) -1);
        setByteElement(term777045, 31, (byte) -1);
        setByteElement(term777045, 32, (byte) -1);
        setByteElement(term777045, 33, (byte) -1);
        setByteElement(term777045, 34, (byte) -1);
        setByteElement(term777045, 35, (byte) -1);
        setByteElement(term777045, 36, (byte) -1);
        setByteElement(term777045, 37, (byte) -1);
        setByteElement(term777045, 38, (byte) -1);
        setByteElement(term777045, 39, (byte) -1);
        setByteElement(term777045, 40, (byte) -1);
        setByteElement(term777045, 41, (byte) -1);
        setByteElement(term777045, 42, (byte) -1);
        setByteElement(term777045, 43, (byte) -1);
        setByteElement(term777045, 44, (byte) -1);
        setByteElement(term777045, 45, (byte) -1);
        setByteElement(term777045, 46, (byte) -1);
        setByteElement(term777045, 47, (byte) -1);
        setByteElement(term777045, 49, (byte) 1);
        setByteElement(term777045, 50, (byte) 2);
        setByteElement(term777045, 51, (byte) 3);
        setByteElement(term777045, 52, (byte) 4);
        setByteElement(term777045, 53, (byte) 5);
        setByteElement(term777045, 54, (byte) 6);
        setByteElement(term777045, 55, (byte) 7);
        setByteElement(term777045, 56, (byte) 8);
        setByteElement(term777045, 57, (byte) 9);
        setByteElement(term777045, 58, (byte) -1);
        setByteElement(term777045, 59, (byte) -1);
        setByteElement(term777045, 60, (byte) -1);
        setByteElement(term777045, 61, (byte) -1);
        setByteElement(term777045, 62, (byte) -1);
        setByteElement(term777045, 63, (byte) -1);
        setByteElement(term777045, 64, (byte) -1);
        setByteElement(term777045, 65, (byte) 10);
        setByteElement(term777045, 66, (byte) 11);
        setByteElement(term777045, 67, (byte) 12);
        setByteElement(term777045, 68, (byte) 13);
        setByteElement(term777045, 69, (byte) 14);
        setByteElement(term777045, 70, (byte) 15);
        setByteElement(term777045, 71, (byte) 16);
        setByteElement(term777045, 72, (byte) 17);
        setByteElement(term777045, 73, (byte) 18);
        setByteElement(term777045, 74, (byte) 19);
        setByteElement(term777045, 75, (byte) 20);
        setByteElement(term777045, 76, (byte) 21);
        setByteElement(term777045, 77, (byte) 22);
        setByteElement(term777045, 78, (byte) 23);
        setByteElement(term777045, 79, (byte) 24);
        setByteElement(term777045, 80, (byte) 25);
        setByteElement(term777045, 81, (byte) 26);
        setByteElement(term777045, 82, (byte) 27);
        setByteElement(term777045, 83, (byte) 28);
        setByteElement(term777045, 84, (byte) 29);
        setByteElement(term777045, 85, (byte) 30);
        setByteElement(term777045, 86, (byte) 31);
        setByteElement(term777045, 87, (byte) 32);
        setField(term777044, term777044.getClass(), "decodeTable", term777045);
        setIntField(term777044, term777044.getClass(), "encodeSize", 503);
        setByteElement(term777046, 0, (byte) 48);
        setByteElement(term777046, 1, (byte) 49);
        setByteElement(term777046, 2, (byte) 50);
        setByteElement(term777046, 3, (byte) 51);
        setByteElement(term777046, 4, (byte) 52);
        setByteElement(term777046, 5, (byte) 53);
        setByteElement(term777046, 6, (byte) 54);
        setByteElement(term777046, 7, (byte) 55);
        setByteElement(term777046, 8, (byte) 56);
        setByteElement(term777046, 9, (byte) 57);
        setByteElement(term777046, 10, (byte) 65);
        setByteElement(term777046, 11, (byte) 66);
        setByteElement(term777046, 12, (byte) 67);
        setByteElement(term777046, 13, (byte) 68);
        setByteElement(term777046, 14, (byte) 69);
        setByteElement(term777046, 15, (byte) 70);
        setByteElement(term777046, 16, (byte) 71);
        setByteElement(term777046, 17, (byte) 72);
        setByteElement(term777046, 18, (byte) 73);
        setByteElement(term777046, 19, (byte) 74);
        setByteElement(term777046, 20, (byte) 75);
        setByteElement(term777046, 21, (byte) 76);
        setByteElement(term777046, 22, (byte) 77);
        setByteElement(term777046, 23, (byte) 78);
        setByteElement(term777046, 24, (byte) 79);
        setByteElement(term777046, 25, (byte) 80);
        setByteElement(term777046, 26, (byte) 81);
        setByteElement(term777046, 27, (byte) 82);
        setByteElement(term777046, 28, (byte) 83);
        setByteElement(term777046, 29, (byte) 84);
        setByteElement(term777046, 30, (byte) 85);
        setByteElement(term777046, 31, (byte) 86);
        setField(term777044, term777044.getClass(), "encodeTable", term777046);
        setByteElement(term777047, 11, (byte) -128);
        setField(term777044, term777044.getClass(), "lineSeparator", term777047);
        setByteField(term777044, term777044.getClass(), "PAD", (byte) 61);
        setByteField(term777044, term777044.getClass(), "pad", (byte) 61);
        setIntField(term777044, term777044.getClass(), "unencodedBlockSize", 5);
        setIntField(term777044, term777044.getClass(), "encodedBlockSize", 8);
        setIntField(term777044, term777044.getClass(), "lineLength", 0);
        setIntField(term777044, term777044.getClass(), "chunkSeparatorLength", 495);
        term777048 = (byte[]) newByteArray(495);
        setByteElement(term777048, 11, (byte) -128);
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
        args[1] = term746196;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term777044));
        assertTrue(recursiveEquals(term746196, term777048));
    }

};


