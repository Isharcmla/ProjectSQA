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

public class Base32_init_104094722139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15288;

    public Base32_init_104094722139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13878 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term11710 = (byte[]) newByteArray(512);
        setByteField(term13878, term13878.getClass(), "PAD", (byte) 0);
        setIntField(term13878, term13878.getClass(), "unencodedBlockSize", 0);
        setIntField(term13878, term13878.getClass(), "encodedBlockSize", 0);
        setIntField(term13878, term13878.getClass(), "lineLength", 0);
        setIntField(term13878, term13878.getClass(), "chunkSeparatorLength", 0);
        setByteField(term13878, term13878.getClass(), "pad", (byte) 0);
        setField(term13878, term13878.getClass(), "encodeTable", term11710);
        setField(term13878, term13878.getClass(), "decodeTable", term11710);
        setIntField(term13878, term13878.getClass(), "encodeSize", 0);
        setField(term13878, term13878.getClass(), "lineSeparator", term11710);
        setIntField(term13878, term13878.getClass(), "decodeSize", 0);
        term15288 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term15289 = (byte[]) newByteArray(91);
        byte[] term15290 = (byte[]) newByteArray(32);
        setIntField(term15288, term15288.getClass(), "decodeSize", 7);
        setByteElement(term15289, 0, (byte) -1);
        setByteElement(term15289, 1, (byte) -1);
        setByteElement(term15289, 2, (byte) -1);
        setByteElement(term15289, 3, (byte) -1);
        setByteElement(term15289, 4, (byte) -1);
        setByteElement(term15289, 5, (byte) -1);
        setByteElement(term15289, 6, (byte) -1);
        setByteElement(term15289, 7, (byte) -1);
        setByteElement(term15289, 8, (byte) -1);
        setByteElement(term15289, 9, (byte) -1);
        setByteElement(term15289, 10, (byte) -1);
        setByteElement(term15289, 11, (byte) -1);
        setByteElement(term15289, 12, (byte) -1);
        setByteElement(term15289, 13, (byte) -1);
        setByteElement(term15289, 14, (byte) -1);
        setByteElement(term15289, 15, (byte) -1);
        setByteElement(term15289, 16, (byte) -1);
        setByteElement(term15289, 17, (byte) -1);
        setByteElement(term15289, 18, (byte) -1);
        setByteElement(term15289, 19, (byte) -1);
        setByteElement(term15289, 20, (byte) -1);
        setByteElement(term15289, 21, (byte) -1);
        setByteElement(term15289, 22, (byte) -1);
        setByteElement(term15289, 23, (byte) -1);
        setByteElement(term15289, 24, (byte) -1);
        setByteElement(term15289, 25, (byte) -1);
        setByteElement(term15289, 26, (byte) -1);
        setByteElement(term15289, 27, (byte) -1);
        setByteElement(term15289, 28, (byte) -1);
        setByteElement(term15289, 29, (byte) -1);
        setByteElement(term15289, 30, (byte) -1);
        setByteElement(term15289, 31, (byte) -1);
        setByteElement(term15289, 32, (byte) -1);
        setByteElement(term15289, 33, (byte) -1);
        setByteElement(term15289, 34, (byte) -1);
        setByteElement(term15289, 35, (byte) -1);
        setByteElement(term15289, 36, (byte) -1);
        setByteElement(term15289, 37, (byte) -1);
        setByteElement(term15289, 38, (byte) -1);
        setByteElement(term15289, 39, (byte) -1);
        setByteElement(term15289, 40, (byte) -1);
        setByteElement(term15289, 41, (byte) -1);
        setByteElement(term15289, 42, (byte) -1);
        setByteElement(term15289, 43, (byte) -1);
        setByteElement(term15289, 44, (byte) -1);
        setByteElement(term15289, 45, (byte) -1);
        setByteElement(term15289, 46, (byte) -1);
        setByteElement(term15289, 47, (byte) -1);
        setByteElement(term15289, 48, (byte) -1);
        setByteElement(term15289, 49, (byte) -1);
        setByteElement(term15289, 50, (byte) 26);
        setByteElement(term15289, 51, (byte) 27);
        setByteElement(term15289, 52, (byte) 28);
        setByteElement(term15289, 53, (byte) 29);
        setByteElement(term15289, 54, (byte) 30);
        setByteElement(term15289, 55, (byte) 31);
        setByteElement(term15289, 56, (byte) -1);
        setByteElement(term15289, 57, (byte) -1);
        setByteElement(term15289, 58, (byte) -1);
        setByteElement(term15289, 59, (byte) -1);
        setByteElement(term15289, 60, (byte) -1);
        setByteElement(term15289, 61, (byte) -1);
        setByteElement(term15289, 62, (byte) -1);
        setByteElement(term15289, 63, (byte) -1);
        setByteElement(term15289, 64, (byte) -1);
        setByteElement(term15289, 66, (byte) 1);
        setByteElement(term15289, 67, (byte) 2);
        setByteElement(term15289, 68, (byte) 3);
        setByteElement(term15289, 69, (byte) 4);
        setByteElement(term15289, 70, (byte) 5);
        setByteElement(term15289, 71, (byte) 6);
        setByteElement(term15289, 72, (byte) 7);
        setByteElement(term15289, 73, (byte) 8);
        setByteElement(term15289, 74, (byte) 9);
        setByteElement(term15289, 75, (byte) 10);
        setByteElement(term15289, 76, (byte) 11);
        setByteElement(term15289, 77, (byte) 12);
        setByteElement(term15289, 78, (byte) 13);
        setByteElement(term15289, 79, (byte) 14);
        setByteElement(term15289, 80, (byte) 15);
        setByteElement(term15289, 81, (byte) 16);
        setByteElement(term15289, 82, (byte) 17);
        setByteElement(term15289, 83, (byte) 18);
        setByteElement(term15289, 84, (byte) 19);
        setByteElement(term15289, 85, (byte) 20);
        setByteElement(term15289, 86, (byte) 21);
        setByteElement(term15289, 87, (byte) 22);
        setByteElement(term15289, 88, (byte) 23);
        setByteElement(term15289, 89, (byte) 24);
        setByteElement(term15289, 90, (byte) 25);
        setField(term15288, term15288.getClass(), "decodeTable", term15289);
        setIntField(term15288, term15288.getClass(), "encodeSize", 8);
        setByteElement(term15290, 0, (byte) 65);
        setByteElement(term15290, 1, (byte) 66);
        setByteElement(term15290, 2, (byte) 67);
        setByteElement(term15290, 3, (byte) 68);
        setByteElement(term15290, 4, (byte) 69);
        setByteElement(term15290, 5, (byte) 70);
        setByteElement(term15290, 6, (byte) 71);
        setByteElement(term15290, 7, (byte) 72);
        setByteElement(term15290, 8, (byte) 73);
        setByteElement(term15290, 9, (byte) 74);
        setByteElement(term15290, 10, (byte) 75);
        setByteElement(term15290, 11, (byte) 76);
        setByteElement(term15290, 12, (byte) 77);
        setByteElement(term15290, 13, (byte) 78);
        setByteElement(term15290, 14, (byte) 79);
        setByteElement(term15290, 15, (byte) 80);
        setByteElement(term15290, 16, (byte) 81);
        setByteElement(term15290, 17, (byte) 82);
        setByteElement(term15290, 18, (byte) 83);
        setByteElement(term15290, 19, (byte) 84);
        setByteElement(term15290, 20, (byte) 85);
        setByteElement(term15290, 21, (byte) 86);
        setByteElement(term15290, 22, (byte) 87);
        setByteElement(term15290, 23, (byte) 88);
        setByteElement(term15290, 24, (byte) 89);
        setByteElement(term15290, 25, (byte) 90);
        setByteElement(term15290, 26, (byte) 50);
        setByteElement(term15290, 27, (byte) 51);
        setByteElement(term15290, 28, (byte) 52);
        setByteElement(term15290, 29, (byte) 53);
        setByteElement(term15290, 30, (byte) 54);
        setByteElement(term15290, 31, (byte) 55);
        setField(term15288, term15288.getClass(), "encodeTable", term15290);
        setField(term15288, term15288.getClass(), "lineSeparator", null);
        setByteField(term15288, term15288.getClass(), "PAD", (byte) 61);
        setByteField(term15288, term15288.getClass(), "pad", (byte) 126);
        setIntField(term15288, term15288.getClass(), "unencodedBlockSize", 5);
        setIntField(term15288, term15288.getClass(), "encodedBlockSize", 8);
        setIntField(term15288, term15288.getClass(), "lineLength", 0);
        setIntField(term15288, term15288.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = false;
        args[1] = (byte) 126;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15288));
    }

};


