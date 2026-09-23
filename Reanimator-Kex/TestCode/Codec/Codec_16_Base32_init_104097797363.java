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

public class Base32_init_104097797363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45381;

    public Base32_init_104097797363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45228 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term45115 = (byte[]) newByteArray(0);
        setByteField(term45228, term45228.getClass(), "PAD", (byte) 0);
        setIntField(term45228, term45228.getClass(), "unencodedBlockSize", 0);
        setIntField(term45228, term45228.getClass(), "encodedBlockSize", 0);
        setIntField(term45228, term45228.getClass(), "lineLength", 0);
        setIntField(term45228, term45228.getClass(), "chunkSeparatorLength", 0);
        setByteField(term45228, term45228.getClass(), "pad", (byte) 0);
        setField(term45228, term45228.getClass(), "encodeTable", null);
        setField(term45228, term45228.getClass(), "decodeTable", term45115);
        setIntField(term45228, term45228.getClass(), "encodeSize", 0);
        setField(term45228, term45228.getClass(), "lineSeparator", term45115);
        setIntField(term45228, term45228.getClass(), "decodeSize", 0);
        term45381 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term45382 = (byte[]) newByteArray(91);
        byte[] term45383 = (byte[]) newByteArray(32);
        setIntField(term45381, term45381.getClass(), "decodeSize", 7);
        setByteElement(term45382, 0, (byte) -1);
        setByteElement(term45382, 1, (byte) -1);
        setByteElement(term45382, 2, (byte) -1);
        setByteElement(term45382, 3, (byte) -1);
        setByteElement(term45382, 4, (byte) -1);
        setByteElement(term45382, 5, (byte) -1);
        setByteElement(term45382, 6, (byte) -1);
        setByteElement(term45382, 7, (byte) -1);
        setByteElement(term45382, 8, (byte) -1);
        setByteElement(term45382, 9, (byte) -1);
        setByteElement(term45382, 10, (byte) -1);
        setByteElement(term45382, 11, (byte) -1);
        setByteElement(term45382, 12, (byte) -1);
        setByteElement(term45382, 13, (byte) -1);
        setByteElement(term45382, 14, (byte) -1);
        setByteElement(term45382, 15, (byte) -1);
        setByteElement(term45382, 16, (byte) -1);
        setByteElement(term45382, 17, (byte) -1);
        setByteElement(term45382, 18, (byte) -1);
        setByteElement(term45382, 19, (byte) -1);
        setByteElement(term45382, 20, (byte) -1);
        setByteElement(term45382, 21, (byte) -1);
        setByteElement(term45382, 22, (byte) -1);
        setByteElement(term45382, 23, (byte) -1);
        setByteElement(term45382, 24, (byte) -1);
        setByteElement(term45382, 25, (byte) -1);
        setByteElement(term45382, 26, (byte) -1);
        setByteElement(term45382, 27, (byte) -1);
        setByteElement(term45382, 28, (byte) -1);
        setByteElement(term45382, 29, (byte) -1);
        setByteElement(term45382, 30, (byte) -1);
        setByteElement(term45382, 31, (byte) -1);
        setByteElement(term45382, 32, (byte) -1);
        setByteElement(term45382, 33, (byte) -1);
        setByteElement(term45382, 34, (byte) -1);
        setByteElement(term45382, 35, (byte) -1);
        setByteElement(term45382, 36, (byte) -1);
        setByteElement(term45382, 37, (byte) -1);
        setByteElement(term45382, 38, (byte) -1);
        setByteElement(term45382, 39, (byte) -1);
        setByteElement(term45382, 40, (byte) -1);
        setByteElement(term45382, 41, (byte) -1);
        setByteElement(term45382, 42, (byte) -1);
        setByteElement(term45382, 43, (byte) -1);
        setByteElement(term45382, 44, (byte) -1);
        setByteElement(term45382, 45, (byte) -1);
        setByteElement(term45382, 46, (byte) -1);
        setByteElement(term45382, 47, (byte) -1);
        setByteElement(term45382, 48, (byte) -1);
        setByteElement(term45382, 49, (byte) -1);
        setByteElement(term45382, 50, (byte) 26);
        setByteElement(term45382, 51, (byte) 27);
        setByteElement(term45382, 52, (byte) 28);
        setByteElement(term45382, 53, (byte) 29);
        setByteElement(term45382, 54, (byte) 30);
        setByteElement(term45382, 55, (byte) 31);
        setByteElement(term45382, 56, (byte) -1);
        setByteElement(term45382, 57, (byte) -1);
        setByteElement(term45382, 58, (byte) -1);
        setByteElement(term45382, 59, (byte) -1);
        setByteElement(term45382, 60, (byte) -1);
        setByteElement(term45382, 61, (byte) -1);
        setByteElement(term45382, 62, (byte) -1);
        setByteElement(term45382, 63, (byte) -1);
        setByteElement(term45382, 64, (byte) -1);
        setByteElement(term45382, 66, (byte) 1);
        setByteElement(term45382, 67, (byte) 2);
        setByteElement(term45382, 68, (byte) 3);
        setByteElement(term45382, 69, (byte) 4);
        setByteElement(term45382, 70, (byte) 5);
        setByteElement(term45382, 71, (byte) 6);
        setByteElement(term45382, 72, (byte) 7);
        setByteElement(term45382, 73, (byte) 8);
        setByteElement(term45382, 74, (byte) 9);
        setByteElement(term45382, 75, (byte) 10);
        setByteElement(term45382, 76, (byte) 11);
        setByteElement(term45382, 77, (byte) 12);
        setByteElement(term45382, 78, (byte) 13);
        setByteElement(term45382, 79, (byte) 14);
        setByteElement(term45382, 80, (byte) 15);
        setByteElement(term45382, 81, (byte) 16);
        setByteElement(term45382, 82, (byte) 17);
        setByteElement(term45382, 83, (byte) 18);
        setByteElement(term45382, 84, (byte) 19);
        setByteElement(term45382, 85, (byte) 20);
        setByteElement(term45382, 86, (byte) 21);
        setByteElement(term45382, 87, (byte) 22);
        setByteElement(term45382, 88, (byte) 23);
        setByteElement(term45382, 89, (byte) 24);
        setByteElement(term45382, 90, (byte) 25);
        setField(term45381, term45381.getClass(), "decodeTable", term45382);
        setIntField(term45381, term45381.getClass(), "encodeSize", 8);
        setByteElement(term45383, 0, (byte) 65);
        setByteElement(term45383, 1, (byte) 66);
        setByteElement(term45383, 2, (byte) 67);
        setByteElement(term45383, 3, (byte) 68);
        setByteElement(term45383, 4, (byte) 69);
        setByteElement(term45383, 5, (byte) 70);
        setByteElement(term45383, 6, (byte) 71);
        setByteElement(term45383, 7, (byte) 72);
        setByteElement(term45383, 8, (byte) 73);
        setByteElement(term45383, 9, (byte) 74);
        setByteElement(term45383, 10, (byte) 75);
        setByteElement(term45383, 11, (byte) 76);
        setByteElement(term45383, 12, (byte) 77);
        setByteElement(term45383, 13, (byte) 78);
        setByteElement(term45383, 14, (byte) 79);
        setByteElement(term45383, 15, (byte) 80);
        setByteElement(term45383, 16, (byte) 81);
        setByteElement(term45383, 17, (byte) 82);
        setByteElement(term45383, 18, (byte) 83);
        setByteElement(term45383, 19, (byte) 84);
        setByteElement(term45383, 20, (byte) 85);
        setByteElement(term45383, 21, (byte) 86);
        setByteElement(term45383, 22, (byte) 87);
        setByteElement(term45383, 23, (byte) 88);
        setByteElement(term45383, 24, (byte) 89);
        setByteElement(term45383, 25, (byte) 90);
        setByteElement(term45383, 26, (byte) 50);
        setByteElement(term45383, 27, (byte) 51);
        setByteElement(term45383, 28, (byte) 52);
        setByteElement(term45383, 29, (byte) 53);
        setByteElement(term45383, 30, (byte) 54);
        setByteElement(term45383, 31, (byte) 55);
        setField(term45381, term45381.getClass(), "encodeTable", term45383);
        setField(term45381, term45381.getClass(), "lineSeparator", null);
        setByteField(term45381, term45381.getClass(), "PAD", (byte) 61);
        setByteField(term45381, term45381.getClass(), "pad", (byte) 61);
        setIntField(term45381, term45381.getClass(), "unencodedBlockSize", 5);
        setIntField(term45381, term45381.getClass(), "encodedBlockSize", 8);
        setIntField(term45381, term45381.getClass(), "lineLength", 0);
        setIntField(term45381, term45381.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45381));
    }

};


