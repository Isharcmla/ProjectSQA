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

public class Base32_init_1042801703437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896283;
     Object term930676;
     Object term930680;

    public Base32_init_1042801703437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term910963 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term897304 = (byte[]) newByteArray(0);
        setByteField(term910963, term910963.getClass(), "PAD", (byte) 0);
        setIntField(term910963, term910963.getClass(), "unencodedBlockSize", 0);
        setIntField(term910963, term910963.getClass(), "encodedBlockSize", 0);
        setIntField(term910963, term910963.getClass(), "lineLength", 0);
        setIntField(term910963, term910963.getClass(), "chunkSeparatorLength", 0);
        setByteField(term910963, term910963.getClass(), "pad", (byte) -128);
        setField(term910963, term910963.getClass(), "encodeTable", null);
        setField(term910963, term910963.getClass(), "decodeTable", term897304);
        setIntField(term910963, term910963.getClass(), "encodeSize", 0);
        setField(term910963, term910963.getClass(), "lineSeparator", null);
        setIntField(term910963, term910963.getClass(), "decodeSize", 0);
        term896283 = (byte[]) newByteArray(12);
        term930676 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term930677 = (byte[]) newByteArray(88);
        byte[] term930678 = (byte[]) newByteArray(32);
        byte[] term930679 = (byte[]) newByteArray(12);
        setIntField(term930676, term930676.getClass(), "decodeSize", 19);
        setByteElement(term930677, 0, (byte) -1);
        setByteElement(term930677, 1, (byte) -1);
        setByteElement(term930677, 2, (byte) -1);
        setByteElement(term930677, 3, (byte) -1);
        setByteElement(term930677, 4, (byte) -1);
        setByteElement(term930677, 5, (byte) -1);
        setByteElement(term930677, 6, (byte) -1);
        setByteElement(term930677, 7, (byte) -1);
        setByteElement(term930677, 8, (byte) -1);
        setByteElement(term930677, 9, (byte) -1);
        setByteElement(term930677, 10, (byte) -1);
        setByteElement(term930677, 11, (byte) -1);
        setByteElement(term930677, 12, (byte) -1);
        setByteElement(term930677, 13, (byte) -1);
        setByteElement(term930677, 14, (byte) -1);
        setByteElement(term930677, 15, (byte) -1);
        setByteElement(term930677, 16, (byte) -1);
        setByteElement(term930677, 17, (byte) -1);
        setByteElement(term930677, 18, (byte) -1);
        setByteElement(term930677, 19, (byte) -1);
        setByteElement(term930677, 20, (byte) -1);
        setByteElement(term930677, 21, (byte) -1);
        setByteElement(term930677, 22, (byte) -1);
        setByteElement(term930677, 23, (byte) -1);
        setByteElement(term930677, 24, (byte) -1);
        setByteElement(term930677, 25, (byte) -1);
        setByteElement(term930677, 26, (byte) -1);
        setByteElement(term930677, 27, (byte) -1);
        setByteElement(term930677, 28, (byte) -1);
        setByteElement(term930677, 29, (byte) -1);
        setByteElement(term930677, 30, (byte) -1);
        setByteElement(term930677, 31, (byte) -1);
        setByteElement(term930677, 32, (byte) -1);
        setByteElement(term930677, 33, (byte) -1);
        setByteElement(term930677, 34, (byte) -1);
        setByteElement(term930677, 35, (byte) -1);
        setByteElement(term930677, 36, (byte) -1);
        setByteElement(term930677, 37, (byte) -1);
        setByteElement(term930677, 38, (byte) -1);
        setByteElement(term930677, 39, (byte) -1);
        setByteElement(term930677, 40, (byte) -1);
        setByteElement(term930677, 41, (byte) -1);
        setByteElement(term930677, 42, (byte) -1);
        setByteElement(term930677, 43, (byte) -1);
        setByteElement(term930677, 44, (byte) -1);
        setByteElement(term930677, 45, (byte) -1);
        setByteElement(term930677, 46, (byte) -1);
        setByteElement(term930677, 47, (byte) -1);
        setByteElement(term930677, 49, (byte) 1);
        setByteElement(term930677, 50, (byte) 2);
        setByteElement(term930677, 51, (byte) 3);
        setByteElement(term930677, 52, (byte) 4);
        setByteElement(term930677, 53, (byte) 5);
        setByteElement(term930677, 54, (byte) 6);
        setByteElement(term930677, 55, (byte) 7);
        setByteElement(term930677, 56, (byte) 8);
        setByteElement(term930677, 57, (byte) 9);
        setByteElement(term930677, 58, (byte) -1);
        setByteElement(term930677, 59, (byte) -1);
        setByteElement(term930677, 60, (byte) -1);
        setByteElement(term930677, 61, (byte) -1);
        setByteElement(term930677, 62, (byte) -1);
        setByteElement(term930677, 63, (byte) -1);
        setByteElement(term930677, 64, (byte) -1);
        setByteElement(term930677, 65, (byte) 10);
        setByteElement(term930677, 66, (byte) 11);
        setByteElement(term930677, 67, (byte) 12);
        setByteElement(term930677, 68, (byte) 13);
        setByteElement(term930677, 69, (byte) 14);
        setByteElement(term930677, 70, (byte) 15);
        setByteElement(term930677, 71, (byte) 16);
        setByteElement(term930677, 72, (byte) 17);
        setByteElement(term930677, 73, (byte) 18);
        setByteElement(term930677, 74, (byte) 19);
        setByteElement(term930677, 75, (byte) 20);
        setByteElement(term930677, 76, (byte) 21);
        setByteElement(term930677, 77, (byte) 22);
        setByteElement(term930677, 78, (byte) 23);
        setByteElement(term930677, 79, (byte) 24);
        setByteElement(term930677, 80, (byte) 25);
        setByteElement(term930677, 81, (byte) 26);
        setByteElement(term930677, 82, (byte) 27);
        setByteElement(term930677, 83, (byte) 28);
        setByteElement(term930677, 84, (byte) 29);
        setByteElement(term930677, 85, (byte) 30);
        setByteElement(term930677, 86, (byte) 31);
        setByteElement(term930677, 87, (byte) 32);
        setField(term930676, term930676.getClass(), "decodeTable", term930677);
        setIntField(term930676, term930676.getClass(), "encodeSize", 20);
        setByteElement(term930678, 0, (byte) 48);
        setByteElement(term930678, 1, (byte) 49);
        setByteElement(term930678, 2, (byte) 50);
        setByteElement(term930678, 3, (byte) 51);
        setByteElement(term930678, 4, (byte) 52);
        setByteElement(term930678, 5, (byte) 53);
        setByteElement(term930678, 6, (byte) 54);
        setByteElement(term930678, 7, (byte) 55);
        setByteElement(term930678, 8, (byte) 56);
        setByteElement(term930678, 9, (byte) 57);
        setByteElement(term930678, 10, (byte) 65);
        setByteElement(term930678, 11, (byte) 66);
        setByteElement(term930678, 12, (byte) 67);
        setByteElement(term930678, 13, (byte) 68);
        setByteElement(term930678, 14, (byte) 69);
        setByteElement(term930678, 15, (byte) 70);
        setByteElement(term930678, 16, (byte) 71);
        setByteElement(term930678, 17, (byte) 72);
        setByteElement(term930678, 18, (byte) 73);
        setByteElement(term930678, 19, (byte) 74);
        setByteElement(term930678, 20, (byte) 75);
        setByteElement(term930678, 21, (byte) 76);
        setByteElement(term930678, 22, (byte) 77);
        setByteElement(term930678, 23, (byte) 78);
        setByteElement(term930678, 24, (byte) 79);
        setByteElement(term930678, 25, (byte) 80);
        setByteElement(term930678, 26, (byte) 81);
        setByteElement(term930678, 27, (byte) 82);
        setByteElement(term930678, 28, (byte) 83);
        setByteElement(term930678, 29, (byte) 84);
        setByteElement(term930678, 30, (byte) 85);
        setByteElement(term930678, 31, (byte) 86);
        setField(term930676, term930676.getClass(), "encodeTable", term930678);
        setField(term930676, term930676.getClass(), "lineSeparator", term930679);
        setByteField(term930676, term930676.getClass(), "PAD", (byte) 61);
        setByteField(term930676, term930676.getClass(), "pad", (byte) 61);
        setIntField(term930676, term930676.getClass(), "unencodedBlockSize", 5);
        setIntField(term930676, term930676.getClass(), "encodedBlockSize", 8);
        setIntField(term930676, term930676.getClass(), "lineLength", 0);
        setIntField(term930676, term930676.getClass(), "chunkSeparatorLength", 12);
        term930680 = (byte[]) newByteArray(12);
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
        args[1] = term896283;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term930676));
        assertTrue(recursiveEquals(term896283, term930680));
    }

};


