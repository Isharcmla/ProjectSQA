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

public class Base32_init_1099337581316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606477;

    public Base32_init_1099337581316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term605067 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term603279 = (byte[]) newByteArray(0);
        byte[] term602722 = (byte[]) newByteArray(556);
        setByteField(term605067, term605067.getClass(), "PAD", (byte) 0);
        setIntField(term605067, term605067.getClass(), "unencodedBlockSize", 0);
        setIntField(term605067, term605067.getClass(), "encodedBlockSize", 0);
        setIntField(term605067, term605067.getClass(), "lineLength", 0);
        setIntField(term605067, term605067.getClass(), "chunkSeparatorLength", 0);
        setByteField(term605067, term605067.getClass(), "pad", (byte) 0);
        setField(term605067, term605067.getClass(), "encodeTable", term603279);
        setField(term605067, term605067.getClass(), "decodeTable", term602722);
        setIntField(term605067, term605067.getClass(), "encodeSize", 0);
        setField(term605067, term605067.getClass(), "lineSeparator", term603279);
        setIntField(term605067, term605067.getClass(), "decodeSize", 0);
        term606477 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term606478 = (byte[]) newByteArray(88);
        byte[] term606479 = (byte[]) newByteArray(32);
        setIntField(term606477, term606477.getClass(), "decodeSize", 7);
        setByteElement(term606478, 0, (byte) -1);
        setByteElement(term606478, 1, (byte) -1);
        setByteElement(term606478, 2, (byte) -1);
        setByteElement(term606478, 3, (byte) -1);
        setByteElement(term606478, 4, (byte) -1);
        setByteElement(term606478, 5, (byte) -1);
        setByteElement(term606478, 6, (byte) -1);
        setByteElement(term606478, 7, (byte) -1);
        setByteElement(term606478, 8, (byte) -1);
        setByteElement(term606478, 9, (byte) -1);
        setByteElement(term606478, 10, (byte) -1);
        setByteElement(term606478, 11, (byte) -1);
        setByteElement(term606478, 12, (byte) -1);
        setByteElement(term606478, 13, (byte) -1);
        setByteElement(term606478, 14, (byte) -1);
        setByteElement(term606478, 15, (byte) -1);
        setByteElement(term606478, 16, (byte) -1);
        setByteElement(term606478, 17, (byte) -1);
        setByteElement(term606478, 18, (byte) -1);
        setByteElement(term606478, 19, (byte) -1);
        setByteElement(term606478, 20, (byte) -1);
        setByteElement(term606478, 21, (byte) -1);
        setByteElement(term606478, 22, (byte) -1);
        setByteElement(term606478, 23, (byte) -1);
        setByteElement(term606478, 24, (byte) -1);
        setByteElement(term606478, 25, (byte) -1);
        setByteElement(term606478, 26, (byte) -1);
        setByteElement(term606478, 27, (byte) -1);
        setByteElement(term606478, 28, (byte) -1);
        setByteElement(term606478, 29, (byte) -1);
        setByteElement(term606478, 30, (byte) -1);
        setByteElement(term606478, 31, (byte) -1);
        setByteElement(term606478, 32, (byte) -1);
        setByteElement(term606478, 33, (byte) -1);
        setByteElement(term606478, 34, (byte) -1);
        setByteElement(term606478, 35, (byte) -1);
        setByteElement(term606478, 36, (byte) -1);
        setByteElement(term606478, 37, (byte) -1);
        setByteElement(term606478, 38, (byte) -1);
        setByteElement(term606478, 39, (byte) -1);
        setByteElement(term606478, 40, (byte) -1);
        setByteElement(term606478, 41, (byte) -1);
        setByteElement(term606478, 42, (byte) -1);
        setByteElement(term606478, 43, (byte) -1);
        setByteElement(term606478, 44, (byte) -1);
        setByteElement(term606478, 45, (byte) -1);
        setByteElement(term606478, 46, (byte) -1);
        setByteElement(term606478, 47, (byte) -1);
        setByteElement(term606478, 49, (byte) 1);
        setByteElement(term606478, 50, (byte) 2);
        setByteElement(term606478, 51, (byte) 3);
        setByteElement(term606478, 52, (byte) 4);
        setByteElement(term606478, 53, (byte) 5);
        setByteElement(term606478, 54, (byte) 6);
        setByteElement(term606478, 55, (byte) 7);
        setByteElement(term606478, 56, (byte) 8);
        setByteElement(term606478, 57, (byte) 9);
        setByteElement(term606478, 58, (byte) -1);
        setByteElement(term606478, 59, (byte) -1);
        setByteElement(term606478, 60, (byte) -1);
        setByteElement(term606478, 61, (byte) -1);
        setByteElement(term606478, 62, (byte) -1);
        setByteElement(term606478, 63, (byte) -1);
        setByteElement(term606478, 64, (byte) -1);
        setByteElement(term606478, 65, (byte) 10);
        setByteElement(term606478, 66, (byte) 11);
        setByteElement(term606478, 67, (byte) 12);
        setByteElement(term606478, 68, (byte) 13);
        setByteElement(term606478, 69, (byte) 14);
        setByteElement(term606478, 70, (byte) 15);
        setByteElement(term606478, 71, (byte) 16);
        setByteElement(term606478, 72, (byte) 17);
        setByteElement(term606478, 73, (byte) 18);
        setByteElement(term606478, 74, (byte) 19);
        setByteElement(term606478, 75, (byte) 20);
        setByteElement(term606478, 76, (byte) 21);
        setByteElement(term606478, 77, (byte) 22);
        setByteElement(term606478, 78, (byte) 23);
        setByteElement(term606478, 79, (byte) 24);
        setByteElement(term606478, 80, (byte) 25);
        setByteElement(term606478, 81, (byte) 26);
        setByteElement(term606478, 82, (byte) 27);
        setByteElement(term606478, 83, (byte) 28);
        setByteElement(term606478, 84, (byte) 29);
        setByteElement(term606478, 85, (byte) 30);
        setByteElement(term606478, 86, (byte) 31);
        setByteElement(term606478, 87, (byte) 32);
        setField(term606477, term606477.getClass(), "decodeTable", term606478);
        setIntField(term606477, term606477.getClass(), "encodeSize", 8);
        setByteElement(term606479, 0, (byte) 48);
        setByteElement(term606479, 1, (byte) 49);
        setByteElement(term606479, 2, (byte) 50);
        setByteElement(term606479, 3, (byte) 51);
        setByteElement(term606479, 4, (byte) 52);
        setByteElement(term606479, 5, (byte) 53);
        setByteElement(term606479, 6, (byte) 54);
        setByteElement(term606479, 7, (byte) 55);
        setByteElement(term606479, 8, (byte) 56);
        setByteElement(term606479, 9, (byte) 57);
        setByteElement(term606479, 10, (byte) 65);
        setByteElement(term606479, 11, (byte) 66);
        setByteElement(term606479, 12, (byte) 67);
        setByteElement(term606479, 13, (byte) 68);
        setByteElement(term606479, 14, (byte) 69);
        setByteElement(term606479, 15, (byte) 70);
        setByteElement(term606479, 16, (byte) 71);
        setByteElement(term606479, 17, (byte) 72);
        setByteElement(term606479, 18, (byte) 73);
        setByteElement(term606479, 19, (byte) 74);
        setByteElement(term606479, 20, (byte) 75);
        setByteElement(term606479, 21, (byte) 76);
        setByteElement(term606479, 22, (byte) 77);
        setByteElement(term606479, 23, (byte) 78);
        setByteElement(term606479, 24, (byte) 79);
        setByteElement(term606479, 25, (byte) 80);
        setByteElement(term606479, 26, (byte) 81);
        setByteElement(term606479, 27, (byte) 82);
        setByteElement(term606479, 28, (byte) 83);
        setByteElement(term606479, 29, (byte) 84);
        setByteElement(term606479, 30, (byte) 85);
        setByteElement(term606479, 31, (byte) 86);
        setField(term606477, term606477.getClass(), "encodeTable", term606479);
        setField(term606477, term606477.getClass(), "lineSeparator", null);
        setByteField(term606477, term606477.getClass(), "PAD", (byte) 61);
        setByteField(term606477, term606477.getClass(), "pad", (byte) 110);
        setIntField(term606477, term606477.getClass(), "unencodedBlockSize", 5);
        setIntField(term606477, term606477.getClass(), "encodedBlockSize", 8);
        setIntField(term606477, term606477.getClass(), "lineLength", 0);
        setIntField(term606477, term606477.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        argTypes[3] = byte.class;
        Object[] args = new Object[4];
        args[0] = 0;
        args[1] = null;
        args[2] = true;
        args[3] = (byte) 110;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term606477));
    }

};


