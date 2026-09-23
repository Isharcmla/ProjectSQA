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

public class Base32_init_104091814357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40482;

    public Base32_init_104091814357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term34921 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term33105 = (byte[]) newByteArray(8);
        setByteField(term34921, term34921.getClass(), "PAD", (byte) 0);
        setIntField(term34921, term34921.getClass(), "unencodedBlockSize", 0);
        setIntField(term34921, term34921.getClass(), "encodedBlockSize", 0);
        setIntField(term34921, term34921.getClass(), "lineLength", 0);
        setIntField(term34921, term34921.getClass(), "chunkSeparatorLength", 0);
        setByteField(term34921, term34921.getClass(), "pad", (byte) 0);
        setField(term34921, term34921.getClass(), "encodeTable", term33105);
        setField(term34921, term34921.getClass(), "decodeTable", term33105);
        setIntField(term34921, term34921.getClass(), "encodeSize", 0);
        setField(term34921, term34921.getClass(), "lineSeparator", term33105);
        setIntField(term34921, term34921.getClass(), "decodeSize", 0);
        term40482 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term40483 = (byte[]) newByteArray(91);
        byte[] term40484 = (byte[]) newByteArray(32);
        setIntField(term40482, term40482.getClass(), "decodeSize", 7);
        setByteElement(term40483, 0, (byte) -1);
        setByteElement(term40483, 1, (byte) -1);
        setByteElement(term40483, 2, (byte) -1);
        setByteElement(term40483, 3, (byte) -1);
        setByteElement(term40483, 4, (byte) -1);
        setByteElement(term40483, 5, (byte) -1);
        setByteElement(term40483, 6, (byte) -1);
        setByteElement(term40483, 7, (byte) -1);
        setByteElement(term40483, 8, (byte) -1);
        setByteElement(term40483, 9, (byte) -1);
        setByteElement(term40483, 10, (byte) -1);
        setByteElement(term40483, 11, (byte) -1);
        setByteElement(term40483, 12, (byte) -1);
        setByteElement(term40483, 13, (byte) -1);
        setByteElement(term40483, 14, (byte) -1);
        setByteElement(term40483, 15, (byte) -1);
        setByteElement(term40483, 16, (byte) -1);
        setByteElement(term40483, 17, (byte) -1);
        setByteElement(term40483, 18, (byte) -1);
        setByteElement(term40483, 19, (byte) -1);
        setByteElement(term40483, 20, (byte) -1);
        setByteElement(term40483, 21, (byte) -1);
        setByteElement(term40483, 22, (byte) -1);
        setByteElement(term40483, 23, (byte) -1);
        setByteElement(term40483, 24, (byte) -1);
        setByteElement(term40483, 25, (byte) -1);
        setByteElement(term40483, 26, (byte) -1);
        setByteElement(term40483, 27, (byte) -1);
        setByteElement(term40483, 28, (byte) -1);
        setByteElement(term40483, 29, (byte) -1);
        setByteElement(term40483, 30, (byte) -1);
        setByteElement(term40483, 31, (byte) -1);
        setByteElement(term40483, 32, (byte) -1);
        setByteElement(term40483, 33, (byte) -1);
        setByteElement(term40483, 34, (byte) -1);
        setByteElement(term40483, 35, (byte) -1);
        setByteElement(term40483, 36, (byte) -1);
        setByteElement(term40483, 37, (byte) -1);
        setByteElement(term40483, 38, (byte) -1);
        setByteElement(term40483, 39, (byte) -1);
        setByteElement(term40483, 40, (byte) -1);
        setByteElement(term40483, 41, (byte) -1);
        setByteElement(term40483, 42, (byte) -1);
        setByteElement(term40483, 43, (byte) -1);
        setByteElement(term40483, 44, (byte) -1);
        setByteElement(term40483, 45, (byte) -1);
        setByteElement(term40483, 46, (byte) -1);
        setByteElement(term40483, 47, (byte) -1);
        setByteElement(term40483, 48, (byte) -1);
        setByteElement(term40483, 49, (byte) -1);
        setByteElement(term40483, 50, (byte) 26);
        setByteElement(term40483, 51, (byte) 27);
        setByteElement(term40483, 52, (byte) 28);
        setByteElement(term40483, 53, (byte) 29);
        setByteElement(term40483, 54, (byte) 30);
        setByteElement(term40483, 55, (byte) 31);
        setByteElement(term40483, 56, (byte) -1);
        setByteElement(term40483, 57, (byte) -1);
        setByteElement(term40483, 58, (byte) -1);
        setByteElement(term40483, 59, (byte) -1);
        setByteElement(term40483, 60, (byte) -1);
        setByteElement(term40483, 61, (byte) -1);
        setByteElement(term40483, 62, (byte) -1);
        setByteElement(term40483, 63, (byte) -1);
        setByteElement(term40483, 64, (byte) -1);
        setByteElement(term40483, 66, (byte) 1);
        setByteElement(term40483, 67, (byte) 2);
        setByteElement(term40483, 68, (byte) 3);
        setByteElement(term40483, 69, (byte) 4);
        setByteElement(term40483, 70, (byte) 5);
        setByteElement(term40483, 71, (byte) 6);
        setByteElement(term40483, 72, (byte) 7);
        setByteElement(term40483, 73, (byte) 8);
        setByteElement(term40483, 74, (byte) 9);
        setByteElement(term40483, 75, (byte) 10);
        setByteElement(term40483, 76, (byte) 11);
        setByteElement(term40483, 77, (byte) 12);
        setByteElement(term40483, 78, (byte) 13);
        setByteElement(term40483, 79, (byte) 14);
        setByteElement(term40483, 80, (byte) 15);
        setByteElement(term40483, 81, (byte) 16);
        setByteElement(term40483, 82, (byte) 17);
        setByteElement(term40483, 83, (byte) 18);
        setByteElement(term40483, 84, (byte) 19);
        setByteElement(term40483, 85, (byte) 20);
        setByteElement(term40483, 86, (byte) 21);
        setByteElement(term40483, 87, (byte) 22);
        setByteElement(term40483, 88, (byte) 23);
        setByteElement(term40483, 89, (byte) 24);
        setByteElement(term40483, 90, (byte) 25);
        setField(term40482, term40482.getClass(), "decodeTable", term40483);
        setIntField(term40482, term40482.getClass(), "encodeSize", 8);
        setByteElement(term40484, 0, (byte) 65);
        setByteElement(term40484, 1, (byte) 66);
        setByteElement(term40484, 2, (byte) 67);
        setByteElement(term40484, 3, (byte) 68);
        setByteElement(term40484, 4, (byte) 69);
        setByteElement(term40484, 5, (byte) 70);
        setByteElement(term40484, 6, (byte) 71);
        setByteElement(term40484, 7, (byte) 72);
        setByteElement(term40484, 8, (byte) 73);
        setByteElement(term40484, 9, (byte) 74);
        setByteElement(term40484, 10, (byte) 75);
        setByteElement(term40484, 11, (byte) 76);
        setByteElement(term40484, 12, (byte) 77);
        setByteElement(term40484, 13, (byte) 78);
        setByteElement(term40484, 14, (byte) 79);
        setByteElement(term40484, 15, (byte) 80);
        setByteElement(term40484, 16, (byte) 81);
        setByteElement(term40484, 17, (byte) 82);
        setByteElement(term40484, 18, (byte) 83);
        setByteElement(term40484, 19, (byte) 84);
        setByteElement(term40484, 20, (byte) 85);
        setByteElement(term40484, 21, (byte) 86);
        setByteElement(term40484, 22, (byte) 87);
        setByteElement(term40484, 23, (byte) 88);
        setByteElement(term40484, 24, (byte) 89);
        setByteElement(term40484, 25, (byte) 90);
        setByteElement(term40484, 26, (byte) 50);
        setByteElement(term40484, 27, (byte) 51);
        setByteElement(term40484, 28, (byte) 52);
        setByteElement(term40484, 29, (byte) 53);
        setByteElement(term40484, 30, (byte) 54);
        setByteElement(term40484, 31, (byte) 55);
        setField(term40482, term40482.getClass(), "encodeTable", term40484);
        setField(term40482, term40482.getClass(), "lineSeparator", null);
        setByteField(term40482, term40482.getClass(), "PAD", (byte) 61);
        setByteField(term40482, term40482.getClass(), "pad", (byte) 61);
        setIntField(term40482, term40482.getClass(), "unencodedBlockSize", 5);
        setIntField(term40482, term40482.getClass(), "encodedBlockSize", 8);
        setIntField(term40482, term40482.getClass(), "lineLength", 0);
        setIntField(term40482, term40482.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term40482));
    }

};


