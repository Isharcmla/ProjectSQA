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

public class Base32_init_1042801703371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term738659;
     Object term768811;
     Object term768815;

    public Base32_init_1042801703371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term744509 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term739182 = (byte[]) newByteArray(0);
        setByteField(term744509, term744509.getClass(), "PAD", (byte) 0);
        setIntField(term744509, term744509.getClass(), "unencodedBlockSize", 0);
        setIntField(term744509, term744509.getClass(), "encodedBlockSize", 0);
        setIntField(term744509, term744509.getClass(), "lineLength", 0);
        setIntField(term744509, term744509.getClass(), "chunkSeparatorLength", 0);
        setByteField(term744509, term744509.getClass(), "pad", (byte) 0);
        setField(term744509, term744509.getClass(), "encodeTable", null);
        setField(term744509, term744509.getClass(), "decodeTable", term739182);
        setIntField(term744509, term744509.getClass(), "encodeSize", 0);
        setField(term744509, term744509.getClass(), "lineSeparator", null);
        setIntField(term744509, term744509.getClass(), "decodeSize", 0);
        term738659 = (byte[]) newByteArray(4);
        term768811 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term768812 = (byte[]) newByteArray(88);
        byte[] term768813 = (byte[]) newByteArray(32);
        byte[] term768814 = (byte[]) newByteArray(4);
        setIntField(term768811, term768811.getClass(), "decodeSize", 11);
        setByteElement(term768812, 0, (byte) -1);
        setByteElement(term768812, 1, (byte) -1);
        setByteElement(term768812, 2, (byte) -1);
        setByteElement(term768812, 3, (byte) -1);
        setByteElement(term768812, 4, (byte) -1);
        setByteElement(term768812, 5, (byte) -1);
        setByteElement(term768812, 6, (byte) -1);
        setByteElement(term768812, 7, (byte) -1);
        setByteElement(term768812, 8, (byte) -1);
        setByteElement(term768812, 9, (byte) -1);
        setByteElement(term768812, 10, (byte) -1);
        setByteElement(term768812, 11, (byte) -1);
        setByteElement(term768812, 12, (byte) -1);
        setByteElement(term768812, 13, (byte) -1);
        setByteElement(term768812, 14, (byte) -1);
        setByteElement(term768812, 15, (byte) -1);
        setByteElement(term768812, 16, (byte) -1);
        setByteElement(term768812, 17, (byte) -1);
        setByteElement(term768812, 18, (byte) -1);
        setByteElement(term768812, 19, (byte) -1);
        setByteElement(term768812, 20, (byte) -1);
        setByteElement(term768812, 21, (byte) -1);
        setByteElement(term768812, 22, (byte) -1);
        setByteElement(term768812, 23, (byte) -1);
        setByteElement(term768812, 24, (byte) -1);
        setByteElement(term768812, 25, (byte) -1);
        setByteElement(term768812, 26, (byte) -1);
        setByteElement(term768812, 27, (byte) -1);
        setByteElement(term768812, 28, (byte) -1);
        setByteElement(term768812, 29, (byte) -1);
        setByteElement(term768812, 30, (byte) -1);
        setByteElement(term768812, 31, (byte) -1);
        setByteElement(term768812, 32, (byte) -1);
        setByteElement(term768812, 33, (byte) -1);
        setByteElement(term768812, 34, (byte) -1);
        setByteElement(term768812, 35, (byte) -1);
        setByteElement(term768812, 36, (byte) -1);
        setByteElement(term768812, 37, (byte) -1);
        setByteElement(term768812, 38, (byte) -1);
        setByteElement(term768812, 39, (byte) -1);
        setByteElement(term768812, 40, (byte) -1);
        setByteElement(term768812, 41, (byte) -1);
        setByteElement(term768812, 42, (byte) -1);
        setByteElement(term768812, 43, (byte) -1);
        setByteElement(term768812, 44, (byte) -1);
        setByteElement(term768812, 45, (byte) -1);
        setByteElement(term768812, 46, (byte) -1);
        setByteElement(term768812, 47, (byte) -1);
        setByteElement(term768812, 49, (byte) 1);
        setByteElement(term768812, 50, (byte) 2);
        setByteElement(term768812, 51, (byte) 3);
        setByteElement(term768812, 52, (byte) 4);
        setByteElement(term768812, 53, (byte) 5);
        setByteElement(term768812, 54, (byte) 6);
        setByteElement(term768812, 55, (byte) 7);
        setByteElement(term768812, 56, (byte) 8);
        setByteElement(term768812, 57, (byte) 9);
        setByteElement(term768812, 58, (byte) -1);
        setByteElement(term768812, 59, (byte) -1);
        setByteElement(term768812, 60, (byte) -1);
        setByteElement(term768812, 61, (byte) -1);
        setByteElement(term768812, 62, (byte) -1);
        setByteElement(term768812, 63, (byte) -1);
        setByteElement(term768812, 64, (byte) -1);
        setByteElement(term768812, 65, (byte) 10);
        setByteElement(term768812, 66, (byte) 11);
        setByteElement(term768812, 67, (byte) 12);
        setByteElement(term768812, 68, (byte) 13);
        setByteElement(term768812, 69, (byte) 14);
        setByteElement(term768812, 70, (byte) 15);
        setByteElement(term768812, 71, (byte) 16);
        setByteElement(term768812, 72, (byte) 17);
        setByteElement(term768812, 73, (byte) 18);
        setByteElement(term768812, 74, (byte) 19);
        setByteElement(term768812, 75, (byte) 20);
        setByteElement(term768812, 76, (byte) 21);
        setByteElement(term768812, 77, (byte) 22);
        setByteElement(term768812, 78, (byte) 23);
        setByteElement(term768812, 79, (byte) 24);
        setByteElement(term768812, 80, (byte) 25);
        setByteElement(term768812, 81, (byte) 26);
        setByteElement(term768812, 82, (byte) 27);
        setByteElement(term768812, 83, (byte) 28);
        setByteElement(term768812, 84, (byte) 29);
        setByteElement(term768812, 85, (byte) 30);
        setByteElement(term768812, 86, (byte) 31);
        setByteElement(term768812, 87, (byte) 32);
        setField(term768811, term768811.getClass(), "decodeTable", term768812);
        setIntField(term768811, term768811.getClass(), "encodeSize", 12);
        setByteElement(term768813, 0, (byte) 48);
        setByteElement(term768813, 1, (byte) 49);
        setByteElement(term768813, 2, (byte) 50);
        setByteElement(term768813, 3, (byte) 51);
        setByteElement(term768813, 4, (byte) 52);
        setByteElement(term768813, 5, (byte) 53);
        setByteElement(term768813, 6, (byte) 54);
        setByteElement(term768813, 7, (byte) 55);
        setByteElement(term768813, 8, (byte) 56);
        setByteElement(term768813, 9, (byte) 57);
        setByteElement(term768813, 10, (byte) 65);
        setByteElement(term768813, 11, (byte) 66);
        setByteElement(term768813, 12, (byte) 67);
        setByteElement(term768813, 13, (byte) 68);
        setByteElement(term768813, 14, (byte) 69);
        setByteElement(term768813, 15, (byte) 70);
        setByteElement(term768813, 16, (byte) 71);
        setByteElement(term768813, 17, (byte) 72);
        setByteElement(term768813, 18, (byte) 73);
        setByteElement(term768813, 19, (byte) 74);
        setByteElement(term768813, 20, (byte) 75);
        setByteElement(term768813, 21, (byte) 76);
        setByteElement(term768813, 22, (byte) 77);
        setByteElement(term768813, 23, (byte) 78);
        setByteElement(term768813, 24, (byte) 79);
        setByteElement(term768813, 25, (byte) 80);
        setByteElement(term768813, 26, (byte) 81);
        setByteElement(term768813, 27, (byte) 82);
        setByteElement(term768813, 28, (byte) 83);
        setByteElement(term768813, 29, (byte) 84);
        setByteElement(term768813, 30, (byte) 85);
        setByteElement(term768813, 31, (byte) 86);
        setField(term768811, term768811.getClass(), "encodeTable", term768813);
        setField(term768811, term768811.getClass(), "lineSeparator", term768814);
        setByteField(term768811, term768811.getClass(), "PAD", (byte) 61);
        setByteField(term768811, term768811.getClass(), "pad", (byte) 61);
        setIntField(term768811, term768811.getClass(), "unencodedBlockSize", 5);
        setIntField(term768811, term768811.getClass(), "encodedBlockSize", 8);
        setIntField(term768811, term768811.getClass(), "lineLength", 0);
        setIntField(term768811, term768811.getClass(), "chunkSeparatorLength", 4);
        term768815 = (byte[]) newByteArray(4);
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
        args[1] = term738659;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term768811));
        assertTrue(recursiveEquals(term738659, term768815));
    }

};


