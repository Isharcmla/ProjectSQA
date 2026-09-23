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

public class Base32_init_1042801703471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term990911;
     Object term1026674;
     Object term1026678;

    public Base32_init_1042801703471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1000928 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term1000928, term1000928.getClass(), "PAD", (byte) 0);
        setIntField(term1000928, term1000928.getClass(), "unencodedBlockSize", 0);
        setIntField(term1000928, term1000928.getClass(), "encodedBlockSize", 0);
        setIntField(term1000928, term1000928.getClass(), "lineLength", 0);
        setIntField(term1000928, term1000928.getClass(), "chunkSeparatorLength", 0);
        setByteField(term1000928, term1000928.getClass(), "pad", (byte) -128);
        setField(term1000928, term1000928.getClass(), "encodeTable", null);
        setField(term1000928, term1000928.getClass(), "decodeTable", null);
        setIntField(term1000928, term1000928.getClass(), "encodeSize", 0);
        setField(term1000928, term1000928.getClass(), "lineSeparator", null);
        setIntField(term1000928, term1000928.getClass(), "decodeSize", 0);
        term990911 = (byte[]) newByteArray(8);
        term1026674 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term1026675 = (byte[]) newByteArray(88);
        byte[] term1026676 = (byte[]) newByteArray(32);
        byte[] term1026677 = (byte[]) newByteArray(8);
        setIntField(term1026674, term1026674.getClass(), "decodeSize", 15);
        setByteElement(term1026675, 0, (byte) -1);
        setByteElement(term1026675, 1, (byte) -1);
        setByteElement(term1026675, 2, (byte) -1);
        setByteElement(term1026675, 3, (byte) -1);
        setByteElement(term1026675, 4, (byte) -1);
        setByteElement(term1026675, 5, (byte) -1);
        setByteElement(term1026675, 6, (byte) -1);
        setByteElement(term1026675, 7, (byte) -1);
        setByteElement(term1026675, 8, (byte) -1);
        setByteElement(term1026675, 9, (byte) -1);
        setByteElement(term1026675, 10, (byte) -1);
        setByteElement(term1026675, 11, (byte) -1);
        setByteElement(term1026675, 12, (byte) -1);
        setByteElement(term1026675, 13, (byte) -1);
        setByteElement(term1026675, 14, (byte) -1);
        setByteElement(term1026675, 15, (byte) -1);
        setByteElement(term1026675, 16, (byte) -1);
        setByteElement(term1026675, 17, (byte) -1);
        setByteElement(term1026675, 18, (byte) -1);
        setByteElement(term1026675, 19, (byte) -1);
        setByteElement(term1026675, 20, (byte) -1);
        setByteElement(term1026675, 21, (byte) -1);
        setByteElement(term1026675, 22, (byte) -1);
        setByteElement(term1026675, 23, (byte) -1);
        setByteElement(term1026675, 24, (byte) -1);
        setByteElement(term1026675, 25, (byte) -1);
        setByteElement(term1026675, 26, (byte) -1);
        setByteElement(term1026675, 27, (byte) -1);
        setByteElement(term1026675, 28, (byte) -1);
        setByteElement(term1026675, 29, (byte) -1);
        setByteElement(term1026675, 30, (byte) -1);
        setByteElement(term1026675, 31, (byte) -1);
        setByteElement(term1026675, 32, (byte) -1);
        setByteElement(term1026675, 33, (byte) -1);
        setByteElement(term1026675, 34, (byte) -1);
        setByteElement(term1026675, 35, (byte) -1);
        setByteElement(term1026675, 36, (byte) -1);
        setByteElement(term1026675, 37, (byte) -1);
        setByteElement(term1026675, 38, (byte) -1);
        setByteElement(term1026675, 39, (byte) -1);
        setByteElement(term1026675, 40, (byte) -1);
        setByteElement(term1026675, 41, (byte) -1);
        setByteElement(term1026675, 42, (byte) -1);
        setByteElement(term1026675, 43, (byte) -1);
        setByteElement(term1026675, 44, (byte) -1);
        setByteElement(term1026675, 45, (byte) -1);
        setByteElement(term1026675, 46, (byte) -1);
        setByteElement(term1026675, 47, (byte) -1);
        setByteElement(term1026675, 49, (byte) 1);
        setByteElement(term1026675, 50, (byte) 2);
        setByteElement(term1026675, 51, (byte) 3);
        setByteElement(term1026675, 52, (byte) 4);
        setByteElement(term1026675, 53, (byte) 5);
        setByteElement(term1026675, 54, (byte) 6);
        setByteElement(term1026675, 55, (byte) 7);
        setByteElement(term1026675, 56, (byte) 8);
        setByteElement(term1026675, 57, (byte) 9);
        setByteElement(term1026675, 58, (byte) -1);
        setByteElement(term1026675, 59, (byte) -1);
        setByteElement(term1026675, 60, (byte) -1);
        setByteElement(term1026675, 61, (byte) -1);
        setByteElement(term1026675, 62, (byte) -1);
        setByteElement(term1026675, 63, (byte) -1);
        setByteElement(term1026675, 64, (byte) -1);
        setByteElement(term1026675, 65, (byte) 10);
        setByteElement(term1026675, 66, (byte) 11);
        setByteElement(term1026675, 67, (byte) 12);
        setByteElement(term1026675, 68, (byte) 13);
        setByteElement(term1026675, 69, (byte) 14);
        setByteElement(term1026675, 70, (byte) 15);
        setByteElement(term1026675, 71, (byte) 16);
        setByteElement(term1026675, 72, (byte) 17);
        setByteElement(term1026675, 73, (byte) 18);
        setByteElement(term1026675, 74, (byte) 19);
        setByteElement(term1026675, 75, (byte) 20);
        setByteElement(term1026675, 76, (byte) 21);
        setByteElement(term1026675, 77, (byte) 22);
        setByteElement(term1026675, 78, (byte) 23);
        setByteElement(term1026675, 79, (byte) 24);
        setByteElement(term1026675, 80, (byte) 25);
        setByteElement(term1026675, 81, (byte) 26);
        setByteElement(term1026675, 82, (byte) 27);
        setByteElement(term1026675, 83, (byte) 28);
        setByteElement(term1026675, 84, (byte) 29);
        setByteElement(term1026675, 85, (byte) 30);
        setByteElement(term1026675, 86, (byte) 31);
        setByteElement(term1026675, 87, (byte) 32);
        setField(term1026674, term1026674.getClass(), "decodeTable", term1026675);
        setIntField(term1026674, term1026674.getClass(), "encodeSize", 16);
        setByteElement(term1026676, 0, (byte) 48);
        setByteElement(term1026676, 1, (byte) 49);
        setByteElement(term1026676, 2, (byte) 50);
        setByteElement(term1026676, 3, (byte) 51);
        setByteElement(term1026676, 4, (byte) 52);
        setByteElement(term1026676, 5, (byte) 53);
        setByteElement(term1026676, 6, (byte) 54);
        setByteElement(term1026676, 7, (byte) 55);
        setByteElement(term1026676, 8, (byte) 56);
        setByteElement(term1026676, 9, (byte) 57);
        setByteElement(term1026676, 10, (byte) 65);
        setByteElement(term1026676, 11, (byte) 66);
        setByteElement(term1026676, 12, (byte) 67);
        setByteElement(term1026676, 13, (byte) 68);
        setByteElement(term1026676, 14, (byte) 69);
        setByteElement(term1026676, 15, (byte) 70);
        setByteElement(term1026676, 16, (byte) 71);
        setByteElement(term1026676, 17, (byte) 72);
        setByteElement(term1026676, 18, (byte) 73);
        setByteElement(term1026676, 19, (byte) 74);
        setByteElement(term1026676, 20, (byte) 75);
        setByteElement(term1026676, 21, (byte) 76);
        setByteElement(term1026676, 22, (byte) 77);
        setByteElement(term1026676, 23, (byte) 78);
        setByteElement(term1026676, 24, (byte) 79);
        setByteElement(term1026676, 25, (byte) 80);
        setByteElement(term1026676, 26, (byte) 81);
        setByteElement(term1026676, 27, (byte) 82);
        setByteElement(term1026676, 28, (byte) 83);
        setByteElement(term1026676, 29, (byte) 84);
        setByteElement(term1026676, 30, (byte) 85);
        setByteElement(term1026676, 31, (byte) 86);
        setField(term1026674, term1026674.getClass(), "encodeTable", term1026676);
        setField(term1026674, term1026674.getClass(), "lineSeparator", term1026677);
        setByteField(term1026674, term1026674.getClass(), "PAD", (byte) 61);
        setByteField(term1026674, term1026674.getClass(), "pad", (byte) 61);
        setIntField(term1026674, term1026674.getClass(), "unencodedBlockSize", 5);
        setIntField(term1026674, term1026674.getClass(), "encodedBlockSize", 8);
        setIntField(term1026674, term1026674.getClass(), "lineLength", 0);
        setIntField(term1026674, term1026674.getClass(), "chunkSeparatorLength", 8);
        term1026678 = (byte[]) newByteArray(8);
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
        args[1] = term990911;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1026674));
        assertTrue(recursiveEquals(term990911, term1026678));
    }

};


