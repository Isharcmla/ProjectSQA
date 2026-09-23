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

public class Base32_init_1042801703313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term593412;
     Object term602563;
     Object term602567;

    public Base32_init_1042801703313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term602043 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term602043, term602043.getClass(), "PAD", (byte) -128);
        setIntField(term602043, term602043.getClass(), "unencodedBlockSize", 0);
        setIntField(term602043, term602043.getClass(), "encodedBlockSize", 0);
        setIntField(term602043, term602043.getClass(), "lineLength", 0);
        setIntField(term602043, term602043.getClass(), "chunkSeparatorLength", 0);
        setByteField(term602043, term602043.getClass(), "pad", (byte) -128);
        setField(term602043, term602043.getClass(), "encodeTable", null);
        setField(term602043, term602043.getClass(), "decodeTable", null);
        term593412 = (byte[]) newByteArray(8);
        term602563 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term602564 = (byte[]) newByteArray(88);
        byte[] term602565 = (byte[]) newByteArray(32);
        byte[] term602566 = (byte[]) newByteArray(8);
        setIntField(term602563, term602563.getClass(), "decodeSize", 15);
        setByteElement(term602564, 0, (byte) -1);
        setByteElement(term602564, 1, (byte) -1);
        setByteElement(term602564, 2, (byte) -1);
        setByteElement(term602564, 3, (byte) -1);
        setByteElement(term602564, 4, (byte) -1);
        setByteElement(term602564, 5, (byte) -1);
        setByteElement(term602564, 6, (byte) -1);
        setByteElement(term602564, 7, (byte) -1);
        setByteElement(term602564, 8, (byte) -1);
        setByteElement(term602564, 9, (byte) -1);
        setByteElement(term602564, 10, (byte) -1);
        setByteElement(term602564, 11, (byte) -1);
        setByteElement(term602564, 12, (byte) -1);
        setByteElement(term602564, 13, (byte) -1);
        setByteElement(term602564, 14, (byte) -1);
        setByteElement(term602564, 15, (byte) -1);
        setByteElement(term602564, 16, (byte) -1);
        setByteElement(term602564, 17, (byte) -1);
        setByteElement(term602564, 18, (byte) -1);
        setByteElement(term602564, 19, (byte) -1);
        setByteElement(term602564, 20, (byte) -1);
        setByteElement(term602564, 21, (byte) -1);
        setByteElement(term602564, 22, (byte) -1);
        setByteElement(term602564, 23, (byte) -1);
        setByteElement(term602564, 24, (byte) -1);
        setByteElement(term602564, 25, (byte) -1);
        setByteElement(term602564, 26, (byte) -1);
        setByteElement(term602564, 27, (byte) -1);
        setByteElement(term602564, 28, (byte) -1);
        setByteElement(term602564, 29, (byte) -1);
        setByteElement(term602564, 30, (byte) -1);
        setByteElement(term602564, 31, (byte) -1);
        setByteElement(term602564, 32, (byte) -1);
        setByteElement(term602564, 33, (byte) -1);
        setByteElement(term602564, 34, (byte) -1);
        setByteElement(term602564, 35, (byte) -1);
        setByteElement(term602564, 36, (byte) -1);
        setByteElement(term602564, 37, (byte) -1);
        setByteElement(term602564, 38, (byte) -1);
        setByteElement(term602564, 39, (byte) -1);
        setByteElement(term602564, 40, (byte) -1);
        setByteElement(term602564, 41, (byte) -1);
        setByteElement(term602564, 42, (byte) -1);
        setByteElement(term602564, 43, (byte) -1);
        setByteElement(term602564, 44, (byte) -1);
        setByteElement(term602564, 45, (byte) -1);
        setByteElement(term602564, 46, (byte) -1);
        setByteElement(term602564, 47, (byte) -1);
        setByteElement(term602564, 49, (byte) 1);
        setByteElement(term602564, 50, (byte) 2);
        setByteElement(term602564, 51, (byte) 3);
        setByteElement(term602564, 52, (byte) 4);
        setByteElement(term602564, 53, (byte) 5);
        setByteElement(term602564, 54, (byte) 6);
        setByteElement(term602564, 55, (byte) 7);
        setByteElement(term602564, 56, (byte) 8);
        setByteElement(term602564, 57, (byte) 9);
        setByteElement(term602564, 58, (byte) -1);
        setByteElement(term602564, 59, (byte) -1);
        setByteElement(term602564, 60, (byte) -1);
        setByteElement(term602564, 61, (byte) -1);
        setByteElement(term602564, 62, (byte) -1);
        setByteElement(term602564, 63, (byte) -1);
        setByteElement(term602564, 64, (byte) -1);
        setByteElement(term602564, 65, (byte) 10);
        setByteElement(term602564, 66, (byte) 11);
        setByteElement(term602564, 67, (byte) 12);
        setByteElement(term602564, 68, (byte) 13);
        setByteElement(term602564, 69, (byte) 14);
        setByteElement(term602564, 70, (byte) 15);
        setByteElement(term602564, 71, (byte) 16);
        setByteElement(term602564, 72, (byte) 17);
        setByteElement(term602564, 73, (byte) 18);
        setByteElement(term602564, 74, (byte) 19);
        setByteElement(term602564, 75, (byte) 20);
        setByteElement(term602564, 76, (byte) 21);
        setByteElement(term602564, 77, (byte) 22);
        setByteElement(term602564, 78, (byte) 23);
        setByteElement(term602564, 79, (byte) 24);
        setByteElement(term602564, 80, (byte) 25);
        setByteElement(term602564, 81, (byte) 26);
        setByteElement(term602564, 82, (byte) 27);
        setByteElement(term602564, 83, (byte) 28);
        setByteElement(term602564, 84, (byte) 29);
        setByteElement(term602564, 85, (byte) 30);
        setByteElement(term602564, 86, (byte) 31);
        setByteElement(term602564, 87, (byte) 32);
        setField(term602563, term602563.getClass(), "decodeTable", term602564);
        setIntField(term602563, term602563.getClass(), "encodeSize", 16);
        setByteElement(term602565, 0, (byte) 48);
        setByteElement(term602565, 1, (byte) 49);
        setByteElement(term602565, 2, (byte) 50);
        setByteElement(term602565, 3, (byte) 51);
        setByteElement(term602565, 4, (byte) 52);
        setByteElement(term602565, 5, (byte) 53);
        setByteElement(term602565, 6, (byte) 54);
        setByteElement(term602565, 7, (byte) 55);
        setByteElement(term602565, 8, (byte) 56);
        setByteElement(term602565, 9, (byte) 57);
        setByteElement(term602565, 10, (byte) 65);
        setByteElement(term602565, 11, (byte) 66);
        setByteElement(term602565, 12, (byte) 67);
        setByteElement(term602565, 13, (byte) 68);
        setByteElement(term602565, 14, (byte) 69);
        setByteElement(term602565, 15, (byte) 70);
        setByteElement(term602565, 16, (byte) 71);
        setByteElement(term602565, 17, (byte) 72);
        setByteElement(term602565, 18, (byte) 73);
        setByteElement(term602565, 19, (byte) 74);
        setByteElement(term602565, 20, (byte) 75);
        setByteElement(term602565, 21, (byte) 76);
        setByteElement(term602565, 22, (byte) 77);
        setByteElement(term602565, 23, (byte) 78);
        setByteElement(term602565, 24, (byte) 79);
        setByteElement(term602565, 25, (byte) 80);
        setByteElement(term602565, 26, (byte) 81);
        setByteElement(term602565, 27, (byte) 82);
        setByteElement(term602565, 28, (byte) 83);
        setByteElement(term602565, 29, (byte) 84);
        setByteElement(term602565, 30, (byte) 85);
        setByteElement(term602565, 31, (byte) 86);
        setField(term602563, term602563.getClass(), "encodeTable", term602565);
        setField(term602563, term602563.getClass(), "lineSeparator", term602566);
        setByteField(term602563, term602563.getClass(), "PAD", (byte) 61);
        setByteField(term602563, term602563.getClass(), "pad", (byte) 61);
        setIntField(term602563, term602563.getClass(), "unencodedBlockSize", 5);
        setIntField(term602563, term602563.getClass(), "encodedBlockSize", 8);
        setIntField(term602563, term602563.getClass(), "lineLength", 0);
        setIntField(term602563, term602563.getClass(), "chunkSeparatorLength", 8);
        term602567 = (byte[]) newByteArray(8);
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
        args[1] = term593412;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term602563));
        assertTrue(recursiveEquals(term593412, term602567));
    }

};


