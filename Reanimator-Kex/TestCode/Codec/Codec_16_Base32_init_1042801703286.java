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

public class Base32_init_1042801703286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519022;

    public Base32_init_1042801703286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term515448 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term513281 = (byte[]) newByteArray(512);
        setByteField(term515448, term515448.getClass(), "PAD", (byte) 0);
        setIntField(term515448, term515448.getClass(), "unencodedBlockSize", 0);
        setIntField(term515448, term515448.getClass(), "encodedBlockSize", 0);
        setIntField(term515448, term515448.getClass(), "lineLength", 0);
        setIntField(term515448, term515448.getClass(), "chunkSeparatorLength", 0);
        setByteField(term515448, term515448.getClass(), "pad", (byte) 0);
        setField(term515448, term515448.getClass(), "encodeTable", term513281);
        setField(term515448, term515448.getClass(), "decodeTable", term513281);
        setIntField(term515448, term515448.getClass(), "encodeSize", 0);
        setField(term515448, term515448.getClass(), "lineSeparator", term513281);
        setIntField(term515448, term515448.getClass(), "decodeSize", 0);
        term519022 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term519023 = (byte[]) newByteArray(88);
        byte[] term519024 = (byte[]) newByteArray(32);
        setIntField(term519022, term519022.getClass(), "decodeSize", 7);
        setByteElement(term519023, 0, (byte) -1);
        setByteElement(term519023, 1, (byte) -1);
        setByteElement(term519023, 2, (byte) -1);
        setByteElement(term519023, 3, (byte) -1);
        setByteElement(term519023, 4, (byte) -1);
        setByteElement(term519023, 5, (byte) -1);
        setByteElement(term519023, 6, (byte) -1);
        setByteElement(term519023, 7, (byte) -1);
        setByteElement(term519023, 8, (byte) -1);
        setByteElement(term519023, 9, (byte) -1);
        setByteElement(term519023, 10, (byte) -1);
        setByteElement(term519023, 11, (byte) -1);
        setByteElement(term519023, 12, (byte) -1);
        setByteElement(term519023, 13, (byte) -1);
        setByteElement(term519023, 14, (byte) -1);
        setByteElement(term519023, 15, (byte) -1);
        setByteElement(term519023, 16, (byte) -1);
        setByteElement(term519023, 17, (byte) -1);
        setByteElement(term519023, 18, (byte) -1);
        setByteElement(term519023, 19, (byte) -1);
        setByteElement(term519023, 20, (byte) -1);
        setByteElement(term519023, 21, (byte) -1);
        setByteElement(term519023, 22, (byte) -1);
        setByteElement(term519023, 23, (byte) -1);
        setByteElement(term519023, 24, (byte) -1);
        setByteElement(term519023, 25, (byte) -1);
        setByteElement(term519023, 26, (byte) -1);
        setByteElement(term519023, 27, (byte) -1);
        setByteElement(term519023, 28, (byte) -1);
        setByteElement(term519023, 29, (byte) -1);
        setByteElement(term519023, 30, (byte) -1);
        setByteElement(term519023, 31, (byte) -1);
        setByteElement(term519023, 32, (byte) -1);
        setByteElement(term519023, 33, (byte) -1);
        setByteElement(term519023, 34, (byte) -1);
        setByteElement(term519023, 35, (byte) -1);
        setByteElement(term519023, 36, (byte) -1);
        setByteElement(term519023, 37, (byte) -1);
        setByteElement(term519023, 38, (byte) -1);
        setByteElement(term519023, 39, (byte) -1);
        setByteElement(term519023, 40, (byte) -1);
        setByteElement(term519023, 41, (byte) -1);
        setByteElement(term519023, 42, (byte) -1);
        setByteElement(term519023, 43, (byte) -1);
        setByteElement(term519023, 44, (byte) -1);
        setByteElement(term519023, 45, (byte) -1);
        setByteElement(term519023, 46, (byte) -1);
        setByteElement(term519023, 47, (byte) -1);
        setByteElement(term519023, 49, (byte) 1);
        setByteElement(term519023, 50, (byte) 2);
        setByteElement(term519023, 51, (byte) 3);
        setByteElement(term519023, 52, (byte) 4);
        setByteElement(term519023, 53, (byte) 5);
        setByteElement(term519023, 54, (byte) 6);
        setByteElement(term519023, 55, (byte) 7);
        setByteElement(term519023, 56, (byte) 8);
        setByteElement(term519023, 57, (byte) 9);
        setByteElement(term519023, 58, (byte) -1);
        setByteElement(term519023, 59, (byte) -1);
        setByteElement(term519023, 60, (byte) -1);
        setByteElement(term519023, 61, (byte) -1);
        setByteElement(term519023, 62, (byte) -1);
        setByteElement(term519023, 63, (byte) -1);
        setByteElement(term519023, 64, (byte) -1);
        setByteElement(term519023, 65, (byte) 10);
        setByteElement(term519023, 66, (byte) 11);
        setByteElement(term519023, 67, (byte) 12);
        setByteElement(term519023, 68, (byte) 13);
        setByteElement(term519023, 69, (byte) 14);
        setByteElement(term519023, 70, (byte) 15);
        setByteElement(term519023, 71, (byte) 16);
        setByteElement(term519023, 72, (byte) 17);
        setByteElement(term519023, 73, (byte) 18);
        setByteElement(term519023, 74, (byte) 19);
        setByteElement(term519023, 75, (byte) 20);
        setByteElement(term519023, 76, (byte) 21);
        setByteElement(term519023, 77, (byte) 22);
        setByteElement(term519023, 78, (byte) 23);
        setByteElement(term519023, 79, (byte) 24);
        setByteElement(term519023, 80, (byte) 25);
        setByteElement(term519023, 81, (byte) 26);
        setByteElement(term519023, 82, (byte) 27);
        setByteElement(term519023, 83, (byte) 28);
        setByteElement(term519023, 84, (byte) 29);
        setByteElement(term519023, 85, (byte) 30);
        setByteElement(term519023, 86, (byte) 31);
        setByteElement(term519023, 87, (byte) 32);
        setField(term519022, term519022.getClass(), "decodeTable", term519023);
        setIntField(term519022, term519022.getClass(), "encodeSize", 8);
        setByteElement(term519024, 0, (byte) 48);
        setByteElement(term519024, 1, (byte) 49);
        setByteElement(term519024, 2, (byte) 50);
        setByteElement(term519024, 3, (byte) 51);
        setByteElement(term519024, 4, (byte) 52);
        setByteElement(term519024, 5, (byte) 53);
        setByteElement(term519024, 6, (byte) 54);
        setByteElement(term519024, 7, (byte) 55);
        setByteElement(term519024, 8, (byte) 56);
        setByteElement(term519024, 9, (byte) 57);
        setByteElement(term519024, 10, (byte) 65);
        setByteElement(term519024, 11, (byte) 66);
        setByteElement(term519024, 12, (byte) 67);
        setByteElement(term519024, 13, (byte) 68);
        setByteElement(term519024, 14, (byte) 69);
        setByteElement(term519024, 15, (byte) 70);
        setByteElement(term519024, 16, (byte) 71);
        setByteElement(term519024, 17, (byte) 72);
        setByteElement(term519024, 18, (byte) 73);
        setByteElement(term519024, 19, (byte) 74);
        setByteElement(term519024, 20, (byte) 75);
        setByteElement(term519024, 21, (byte) 76);
        setByteElement(term519024, 22, (byte) 77);
        setByteElement(term519024, 23, (byte) 78);
        setByteElement(term519024, 24, (byte) 79);
        setByteElement(term519024, 25, (byte) 80);
        setByteElement(term519024, 26, (byte) 81);
        setByteElement(term519024, 27, (byte) 82);
        setByteElement(term519024, 28, (byte) 83);
        setByteElement(term519024, 29, (byte) 84);
        setByteElement(term519024, 30, (byte) 85);
        setByteElement(term519024, 31, (byte) 86);
        setField(term519022, term519022.getClass(), "encodeTable", term519024);
        setField(term519022, term519022.getClass(), "lineSeparator", null);
        setByteField(term519022, term519022.getClass(), "PAD", (byte) 61);
        setByteField(term519022, term519022.getClass(), "pad", (byte) 61);
        setIntField(term519022, term519022.getClass(), "unencodedBlockSize", 5);
        setIntField(term519022, term519022.getClass(), "encodedBlockSize", 8);
        setIntField(term519022, term519022.getClass(), "lineLength", 0);
        setIntField(term519022, term519022.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = null;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term519022));
    }

};


