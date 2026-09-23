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

public class Base32_init_1040917213141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227938;

    public Base32_init_1040917213141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term223767 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term221951 = (byte[]) newByteArray(8);
        setByteField(term223767, term223767.getClass(), "PAD", (byte) 0);
        setIntField(term223767, term223767.getClass(), "unencodedBlockSize", 0);
        setIntField(term223767, term223767.getClass(), "encodedBlockSize", 0);
        setIntField(term223767, term223767.getClass(), "lineLength", 0);
        setIntField(term223767, term223767.getClass(), "chunkSeparatorLength", 0);
        setByteField(term223767, term223767.getClass(), "pad", (byte) 0);
        setField(term223767, term223767.getClass(), "encodeTable", term221951);
        setField(term223767, term223767.getClass(), "decodeTable", term221951);
        setIntField(term223767, term223767.getClass(), "encodeSize", 0);
        setField(term223767, term223767.getClass(), "lineSeparator", term221951);
        setIntField(term223767, term223767.getClass(), "decodeSize", 0);
        term227938 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term227939 = (byte[]) newByteArray(91);
        byte[] term227940 = (byte[]) newByteArray(32);
        setIntField(term227938, term227938.getClass(), "decodeSize", 7);
        setByteElement(term227939, 0, (byte) -1);
        setByteElement(term227939, 1, (byte) -1);
        setByteElement(term227939, 2, (byte) -1);
        setByteElement(term227939, 3, (byte) -1);
        setByteElement(term227939, 4, (byte) -1);
        setByteElement(term227939, 5, (byte) -1);
        setByteElement(term227939, 6, (byte) -1);
        setByteElement(term227939, 7, (byte) -1);
        setByteElement(term227939, 8, (byte) -1);
        setByteElement(term227939, 9, (byte) -1);
        setByteElement(term227939, 10, (byte) -1);
        setByteElement(term227939, 11, (byte) -1);
        setByteElement(term227939, 12, (byte) -1);
        setByteElement(term227939, 13, (byte) -1);
        setByteElement(term227939, 14, (byte) -1);
        setByteElement(term227939, 15, (byte) -1);
        setByteElement(term227939, 16, (byte) -1);
        setByteElement(term227939, 17, (byte) -1);
        setByteElement(term227939, 18, (byte) -1);
        setByteElement(term227939, 19, (byte) -1);
        setByteElement(term227939, 20, (byte) -1);
        setByteElement(term227939, 21, (byte) -1);
        setByteElement(term227939, 22, (byte) -1);
        setByteElement(term227939, 23, (byte) -1);
        setByteElement(term227939, 24, (byte) -1);
        setByteElement(term227939, 25, (byte) -1);
        setByteElement(term227939, 26, (byte) -1);
        setByteElement(term227939, 27, (byte) -1);
        setByteElement(term227939, 28, (byte) -1);
        setByteElement(term227939, 29, (byte) -1);
        setByteElement(term227939, 30, (byte) -1);
        setByteElement(term227939, 31, (byte) -1);
        setByteElement(term227939, 32, (byte) -1);
        setByteElement(term227939, 33, (byte) -1);
        setByteElement(term227939, 34, (byte) -1);
        setByteElement(term227939, 35, (byte) -1);
        setByteElement(term227939, 36, (byte) -1);
        setByteElement(term227939, 37, (byte) -1);
        setByteElement(term227939, 38, (byte) -1);
        setByteElement(term227939, 39, (byte) -1);
        setByteElement(term227939, 40, (byte) -1);
        setByteElement(term227939, 41, (byte) -1);
        setByteElement(term227939, 42, (byte) -1);
        setByteElement(term227939, 43, (byte) -1);
        setByteElement(term227939, 44, (byte) -1);
        setByteElement(term227939, 45, (byte) -1);
        setByteElement(term227939, 46, (byte) -1);
        setByteElement(term227939, 47, (byte) -1);
        setByteElement(term227939, 48, (byte) -1);
        setByteElement(term227939, 49, (byte) -1);
        setByteElement(term227939, 50, (byte) 26);
        setByteElement(term227939, 51, (byte) 27);
        setByteElement(term227939, 52, (byte) 28);
        setByteElement(term227939, 53, (byte) 29);
        setByteElement(term227939, 54, (byte) 30);
        setByteElement(term227939, 55, (byte) 31);
        setByteElement(term227939, 56, (byte) -1);
        setByteElement(term227939, 57, (byte) -1);
        setByteElement(term227939, 58, (byte) -1);
        setByteElement(term227939, 59, (byte) -1);
        setByteElement(term227939, 60, (byte) -1);
        setByteElement(term227939, 61, (byte) -1);
        setByteElement(term227939, 62, (byte) -1);
        setByteElement(term227939, 63, (byte) -1);
        setByteElement(term227939, 64, (byte) -1);
        setByteElement(term227939, 66, (byte) 1);
        setByteElement(term227939, 67, (byte) 2);
        setByteElement(term227939, 68, (byte) 3);
        setByteElement(term227939, 69, (byte) 4);
        setByteElement(term227939, 70, (byte) 5);
        setByteElement(term227939, 71, (byte) 6);
        setByteElement(term227939, 72, (byte) 7);
        setByteElement(term227939, 73, (byte) 8);
        setByteElement(term227939, 74, (byte) 9);
        setByteElement(term227939, 75, (byte) 10);
        setByteElement(term227939, 76, (byte) 11);
        setByteElement(term227939, 77, (byte) 12);
        setByteElement(term227939, 78, (byte) 13);
        setByteElement(term227939, 79, (byte) 14);
        setByteElement(term227939, 80, (byte) 15);
        setByteElement(term227939, 81, (byte) 16);
        setByteElement(term227939, 82, (byte) 17);
        setByteElement(term227939, 83, (byte) 18);
        setByteElement(term227939, 84, (byte) 19);
        setByteElement(term227939, 85, (byte) 20);
        setByteElement(term227939, 86, (byte) 21);
        setByteElement(term227939, 87, (byte) 22);
        setByteElement(term227939, 88, (byte) 23);
        setByteElement(term227939, 89, (byte) 24);
        setByteElement(term227939, 90, (byte) 25);
        setField(term227938, term227938.getClass(), "decodeTable", term227939);
        setIntField(term227938, term227938.getClass(), "encodeSize", 8);
        setByteElement(term227940, 0, (byte) 65);
        setByteElement(term227940, 1, (byte) 66);
        setByteElement(term227940, 2, (byte) 67);
        setByteElement(term227940, 3, (byte) 68);
        setByteElement(term227940, 4, (byte) 69);
        setByteElement(term227940, 5, (byte) 70);
        setByteElement(term227940, 6, (byte) 71);
        setByteElement(term227940, 7, (byte) 72);
        setByteElement(term227940, 8, (byte) 73);
        setByteElement(term227940, 9, (byte) 74);
        setByteElement(term227940, 10, (byte) 75);
        setByteElement(term227940, 11, (byte) 76);
        setByteElement(term227940, 12, (byte) 77);
        setByteElement(term227940, 13, (byte) 78);
        setByteElement(term227940, 14, (byte) 79);
        setByteElement(term227940, 15, (byte) 80);
        setByteElement(term227940, 16, (byte) 81);
        setByteElement(term227940, 17, (byte) 82);
        setByteElement(term227940, 18, (byte) 83);
        setByteElement(term227940, 19, (byte) 84);
        setByteElement(term227940, 20, (byte) 85);
        setByteElement(term227940, 21, (byte) 86);
        setByteElement(term227940, 22, (byte) 87);
        setByteElement(term227940, 23, (byte) 88);
        setByteElement(term227940, 24, (byte) 89);
        setByteElement(term227940, 25, (byte) 90);
        setByteElement(term227940, 26, (byte) 50);
        setByteElement(term227940, 27, (byte) 51);
        setByteElement(term227940, 28, (byte) 52);
        setByteElement(term227940, 29, (byte) 53);
        setByteElement(term227940, 30, (byte) 54);
        setByteElement(term227940, 31, (byte) 55);
        setField(term227938, term227938.getClass(), "encodeTable", term227940);
        setField(term227938, term227938.getClass(), "lineSeparator", null);
        setByteField(term227938, term227938.getClass(), "PAD", (byte) 61);
        setByteField(term227938, term227938.getClass(), "pad", (byte) 61);
        setIntField(term227938, term227938.getClass(), "unencodedBlockSize", 5);
        setIntField(term227938, term227938.getClass(), "encodedBlockSize", 8);
        setIntField(term227938, term227938.getClass(), "lineLength", 0);
        setIntField(term227938, term227938.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term227938));
    }

};


