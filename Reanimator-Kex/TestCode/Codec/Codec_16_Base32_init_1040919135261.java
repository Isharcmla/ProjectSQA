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

public class Base32_init_1040919135261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486937;

    public Base32_init_1040919135261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term453268 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term453149 = (byte[]) newByteArray(0);
        setByteField(term453268, term453268.getClass(), "PAD", (byte) 0);
        setIntField(term453268, term453268.getClass(), "unencodedBlockSize", 0);
        setIntField(term453268, term453268.getClass(), "encodedBlockSize", 0);
        setIntField(term453268, term453268.getClass(), "lineLength", 0);
        setIntField(term453268, term453268.getClass(), "chunkSeparatorLength", 0);
        setByteField(term453268, term453268.getClass(), "pad", (byte) 0);
        setField(term453268, term453268.getClass(), "encodeTable", term453149);
        setField(term453268, term453268.getClass(), "decodeTable", term453149);
        setIntField(term453268, term453268.getClass(), "encodeSize", 0);
        setField(term453268, term453268.getClass(), "lineSeparator", term453149);
        setIntField(term453268, term453268.getClass(), "decodeSize", 0);
        term486937 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term486938 = (byte[]) newByteArray(91);
        byte[] term486939 = (byte[]) newByteArray(32);
        setIntField(term486937, term486937.getClass(), "decodeSize", 7);
        setByteElement(term486938, 0, (byte) -1);
        setByteElement(term486938, 1, (byte) -1);
        setByteElement(term486938, 2, (byte) -1);
        setByteElement(term486938, 3, (byte) -1);
        setByteElement(term486938, 4, (byte) -1);
        setByteElement(term486938, 5, (byte) -1);
        setByteElement(term486938, 6, (byte) -1);
        setByteElement(term486938, 7, (byte) -1);
        setByteElement(term486938, 8, (byte) -1);
        setByteElement(term486938, 9, (byte) -1);
        setByteElement(term486938, 10, (byte) -1);
        setByteElement(term486938, 11, (byte) -1);
        setByteElement(term486938, 12, (byte) -1);
        setByteElement(term486938, 13, (byte) -1);
        setByteElement(term486938, 14, (byte) -1);
        setByteElement(term486938, 15, (byte) -1);
        setByteElement(term486938, 16, (byte) -1);
        setByteElement(term486938, 17, (byte) -1);
        setByteElement(term486938, 18, (byte) -1);
        setByteElement(term486938, 19, (byte) -1);
        setByteElement(term486938, 20, (byte) -1);
        setByteElement(term486938, 21, (byte) -1);
        setByteElement(term486938, 22, (byte) -1);
        setByteElement(term486938, 23, (byte) -1);
        setByteElement(term486938, 24, (byte) -1);
        setByteElement(term486938, 25, (byte) -1);
        setByteElement(term486938, 26, (byte) -1);
        setByteElement(term486938, 27, (byte) -1);
        setByteElement(term486938, 28, (byte) -1);
        setByteElement(term486938, 29, (byte) -1);
        setByteElement(term486938, 30, (byte) -1);
        setByteElement(term486938, 31, (byte) -1);
        setByteElement(term486938, 32, (byte) -1);
        setByteElement(term486938, 33, (byte) -1);
        setByteElement(term486938, 34, (byte) -1);
        setByteElement(term486938, 35, (byte) -1);
        setByteElement(term486938, 36, (byte) -1);
        setByteElement(term486938, 37, (byte) -1);
        setByteElement(term486938, 38, (byte) -1);
        setByteElement(term486938, 39, (byte) -1);
        setByteElement(term486938, 40, (byte) -1);
        setByteElement(term486938, 41, (byte) -1);
        setByteElement(term486938, 42, (byte) -1);
        setByteElement(term486938, 43, (byte) -1);
        setByteElement(term486938, 44, (byte) -1);
        setByteElement(term486938, 45, (byte) -1);
        setByteElement(term486938, 46, (byte) -1);
        setByteElement(term486938, 47, (byte) -1);
        setByteElement(term486938, 48, (byte) -1);
        setByteElement(term486938, 49, (byte) -1);
        setByteElement(term486938, 50, (byte) 26);
        setByteElement(term486938, 51, (byte) 27);
        setByteElement(term486938, 52, (byte) 28);
        setByteElement(term486938, 53, (byte) 29);
        setByteElement(term486938, 54, (byte) 30);
        setByteElement(term486938, 55, (byte) 31);
        setByteElement(term486938, 56, (byte) -1);
        setByteElement(term486938, 57, (byte) -1);
        setByteElement(term486938, 58, (byte) -1);
        setByteElement(term486938, 59, (byte) -1);
        setByteElement(term486938, 60, (byte) -1);
        setByteElement(term486938, 61, (byte) -1);
        setByteElement(term486938, 62, (byte) -1);
        setByteElement(term486938, 63, (byte) -1);
        setByteElement(term486938, 64, (byte) -1);
        setByteElement(term486938, 66, (byte) 1);
        setByteElement(term486938, 67, (byte) 2);
        setByteElement(term486938, 68, (byte) 3);
        setByteElement(term486938, 69, (byte) 4);
        setByteElement(term486938, 70, (byte) 5);
        setByteElement(term486938, 71, (byte) 6);
        setByteElement(term486938, 72, (byte) 7);
        setByteElement(term486938, 73, (byte) 8);
        setByteElement(term486938, 74, (byte) 9);
        setByteElement(term486938, 75, (byte) 10);
        setByteElement(term486938, 76, (byte) 11);
        setByteElement(term486938, 77, (byte) 12);
        setByteElement(term486938, 78, (byte) 13);
        setByteElement(term486938, 79, (byte) 14);
        setByteElement(term486938, 80, (byte) 15);
        setByteElement(term486938, 81, (byte) 16);
        setByteElement(term486938, 82, (byte) 17);
        setByteElement(term486938, 83, (byte) 18);
        setByteElement(term486938, 84, (byte) 19);
        setByteElement(term486938, 85, (byte) 20);
        setByteElement(term486938, 86, (byte) 21);
        setByteElement(term486938, 87, (byte) 22);
        setByteElement(term486938, 88, (byte) 23);
        setByteElement(term486938, 89, (byte) 24);
        setByteElement(term486938, 90, (byte) 25);
        setField(term486937, term486937.getClass(), "decodeTable", term486938);
        setIntField(term486937, term486937.getClass(), "encodeSize", 8);
        setByteElement(term486939, 0, (byte) 65);
        setByteElement(term486939, 1, (byte) 66);
        setByteElement(term486939, 2, (byte) 67);
        setByteElement(term486939, 3, (byte) 68);
        setByteElement(term486939, 4, (byte) 69);
        setByteElement(term486939, 5, (byte) 70);
        setByteElement(term486939, 6, (byte) 71);
        setByteElement(term486939, 7, (byte) 72);
        setByteElement(term486939, 8, (byte) 73);
        setByteElement(term486939, 9, (byte) 74);
        setByteElement(term486939, 10, (byte) 75);
        setByteElement(term486939, 11, (byte) 76);
        setByteElement(term486939, 12, (byte) 77);
        setByteElement(term486939, 13, (byte) 78);
        setByteElement(term486939, 14, (byte) 79);
        setByteElement(term486939, 15, (byte) 80);
        setByteElement(term486939, 16, (byte) 81);
        setByteElement(term486939, 17, (byte) 82);
        setByteElement(term486939, 18, (byte) 83);
        setByteElement(term486939, 19, (byte) 84);
        setByteElement(term486939, 20, (byte) 85);
        setByteElement(term486939, 21, (byte) 86);
        setByteElement(term486939, 22, (byte) 87);
        setByteElement(term486939, 23, (byte) 88);
        setByteElement(term486939, 24, (byte) 89);
        setByteElement(term486939, 25, (byte) 90);
        setByteElement(term486939, 26, (byte) 50);
        setByteElement(term486939, 27, (byte) 51);
        setByteElement(term486939, 28, (byte) 52);
        setByteElement(term486939, 29, (byte) 53);
        setByteElement(term486939, 30, (byte) 54);
        setByteElement(term486939, 31, (byte) 55);
        setField(term486937, term486937.getClass(), "encodeTable", term486939);
        setField(term486937, term486937.getClass(), "lineSeparator", null);
        setByteField(term486937, term486937.getClass(), "PAD", (byte) 61);
        setByteField(term486937, term486937.getClass(), "pad", (byte) 61);
        setIntField(term486937, term486937.getClass(), "unencodedBlockSize", 5);
        setIntField(term486937, term486937.getClass(), "encodedBlockSize", 8);
        setIntField(term486937, term486937.getClass(), "lineLength", 0);
        setIntField(term486937, term486937.getClass(), "chunkSeparatorLength", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term486937));
    }

};


