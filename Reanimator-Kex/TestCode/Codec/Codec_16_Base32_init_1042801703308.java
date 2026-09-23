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

public class Base32_init_1042801703308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574282;
     Object term592778;
     Object term592782;

    public Base32_init_1042801703308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term586878 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term575301 = (byte[]) newByteArray(0);
        setByteField(term586878, term586878.getClass(), "PAD", (byte) 0);
        setIntField(term586878, term586878.getClass(), "unencodedBlockSize", 0);
        setIntField(term586878, term586878.getClass(), "encodedBlockSize", 0);
        setIntField(term586878, term586878.getClass(), "lineLength", 0);
        setIntField(term586878, term586878.getClass(), "chunkSeparatorLength", 0);
        setByteField(term586878, term586878.getClass(), "pad", (byte) -128);
        setField(term586878, term586878.getClass(), "encodeTable", null);
        setField(term586878, term586878.getClass(), "decodeTable", term575301);
        setIntField(term586878, term586878.getClass(), "encodeSize", 0);
        setField(term586878, term586878.getClass(), "lineSeparator", null);
        setIntField(term586878, term586878.getClass(), "decodeSize", 0);
        term574282 = (byte[]) newByteArray(10);
        term592778 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term592779 = (byte[]) newByteArray(88);
        byte[] term592780 = (byte[]) newByteArray(32);
        byte[] term592781 = (byte[]) newByteArray(10);
        setIntField(term592778, term592778.getClass(), "decodeSize", 17);
        setByteElement(term592779, 0, (byte) -1);
        setByteElement(term592779, 1, (byte) -1);
        setByteElement(term592779, 2, (byte) -1);
        setByteElement(term592779, 3, (byte) -1);
        setByteElement(term592779, 4, (byte) -1);
        setByteElement(term592779, 5, (byte) -1);
        setByteElement(term592779, 6, (byte) -1);
        setByteElement(term592779, 7, (byte) -1);
        setByteElement(term592779, 8, (byte) -1);
        setByteElement(term592779, 9, (byte) -1);
        setByteElement(term592779, 10, (byte) -1);
        setByteElement(term592779, 11, (byte) -1);
        setByteElement(term592779, 12, (byte) -1);
        setByteElement(term592779, 13, (byte) -1);
        setByteElement(term592779, 14, (byte) -1);
        setByteElement(term592779, 15, (byte) -1);
        setByteElement(term592779, 16, (byte) -1);
        setByteElement(term592779, 17, (byte) -1);
        setByteElement(term592779, 18, (byte) -1);
        setByteElement(term592779, 19, (byte) -1);
        setByteElement(term592779, 20, (byte) -1);
        setByteElement(term592779, 21, (byte) -1);
        setByteElement(term592779, 22, (byte) -1);
        setByteElement(term592779, 23, (byte) -1);
        setByteElement(term592779, 24, (byte) -1);
        setByteElement(term592779, 25, (byte) -1);
        setByteElement(term592779, 26, (byte) -1);
        setByteElement(term592779, 27, (byte) -1);
        setByteElement(term592779, 28, (byte) -1);
        setByteElement(term592779, 29, (byte) -1);
        setByteElement(term592779, 30, (byte) -1);
        setByteElement(term592779, 31, (byte) -1);
        setByteElement(term592779, 32, (byte) -1);
        setByteElement(term592779, 33, (byte) -1);
        setByteElement(term592779, 34, (byte) -1);
        setByteElement(term592779, 35, (byte) -1);
        setByteElement(term592779, 36, (byte) -1);
        setByteElement(term592779, 37, (byte) -1);
        setByteElement(term592779, 38, (byte) -1);
        setByteElement(term592779, 39, (byte) -1);
        setByteElement(term592779, 40, (byte) -1);
        setByteElement(term592779, 41, (byte) -1);
        setByteElement(term592779, 42, (byte) -1);
        setByteElement(term592779, 43, (byte) -1);
        setByteElement(term592779, 44, (byte) -1);
        setByteElement(term592779, 45, (byte) -1);
        setByteElement(term592779, 46, (byte) -1);
        setByteElement(term592779, 47, (byte) -1);
        setByteElement(term592779, 49, (byte) 1);
        setByteElement(term592779, 50, (byte) 2);
        setByteElement(term592779, 51, (byte) 3);
        setByteElement(term592779, 52, (byte) 4);
        setByteElement(term592779, 53, (byte) 5);
        setByteElement(term592779, 54, (byte) 6);
        setByteElement(term592779, 55, (byte) 7);
        setByteElement(term592779, 56, (byte) 8);
        setByteElement(term592779, 57, (byte) 9);
        setByteElement(term592779, 58, (byte) -1);
        setByteElement(term592779, 59, (byte) -1);
        setByteElement(term592779, 60, (byte) -1);
        setByteElement(term592779, 61, (byte) -1);
        setByteElement(term592779, 62, (byte) -1);
        setByteElement(term592779, 63, (byte) -1);
        setByteElement(term592779, 64, (byte) -1);
        setByteElement(term592779, 65, (byte) 10);
        setByteElement(term592779, 66, (byte) 11);
        setByteElement(term592779, 67, (byte) 12);
        setByteElement(term592779, 68, (byte) 13);
        setByteElement(term592779, 69, (byte) 14);
        setByteElement(term592779, 70, (byte) 15);
        setByteElement(term592779, 71, (byte) 16);
        setByteElement(term592779, 72, (byte) 17);
        setByteElement(term592779, 73, (byte) 18);
        setByteElement(term592779, 74, (byte) 19);
        setByteElement(term592779, 75, (byte) 20);
        setByteElement(term592779, 76, (byte) 21);
        setByteElement(term592779, 77, (byte) 22);
        setByteElement(term592779, 78, (byte) 23);
        setByteElement(term592779, 79, (byte) 24);
        setByteElement(term592779, 80, (byte) 25);
        setByteElement(term592779, 81, (byte) 26);
        setByteElement(term592779, 82, (byte) 27);
        setByteElement(term592779, 83, (byte) 28);
        setByteElement(term592779, 84, (byte) 29);
        setByteElement(term592779, 85, (byte) 30);
        setByteElement(term592779, 86, (byte) 31);
        setByteElement(term592779, 87, (byte) 32);
        setField(term592778, term592778.getClass(), "decodeTable", term592779);
        setIntField(term592778, term592778.getClass(), "encodeSize", 18);
        setByteElement(term592780, 0, (byte) 48);
        setByteElement(term592780, 1, (byte) 49);
        setByteElement(term592780, 2, (byte) 50);
        setByteElement(term592780, 3, (byte) 51);
        setByteElement(term592780, 4, (byte) 52);
        setByteElement(term592780, 5, (byte) 53);
        setByteElement(term592780, 6, (byte) 54);
        setByteElement(term592780, 7, (byte) 55);
        setByteElement(term592780, 8, (byte) 56);
        setByteElement(term592780, 9, (byte) 57);
        setByteElement(term592780, 10, (byte) 65);
        setByteElement(term592780, 11, (byte) 66);
        setByteElement(term592780, 12, (byte) 67);
        setByteElement(term592780, 13, (byte) 68);
        setByteElement(term592780, 14, (byte) 69);
        setByteElement(term592780, 15, (byte) 70);
        setByteElement(term592780, 16, (byte) 71);
        setByteElement(term592780, 17, (byte) 72);
        setByteElement(term592780, 18, (byte) 73);
        setByteElement(term592780, 19, (byte) 74);
        setByteElement(term592780, 20, (byte) 75);
        setByteElement(term592780, 21, (byte) 76);
        setByteElement(term592780, 22, (byte) 77);
        setByteElement(term592780, 23, (byte) 78);
        setByteElement(term592780, 24, (byte) 79);
        setByteElement(term592780, 25, (byte) 80);
        setByteElement(term592780, 26, (byte) 81);
        setByteElement(term592780, 27, (byte) 82);
        setByteElement(term592780, 28, (byte) 83);
        setByteElement(term592780, 29, (byte) 84);
        setByteElement(term592780, 30, (byte) 85);
        setByteElement(term592780, 31, (byte) 86);
        setField(term592778, term592778.getClass(), "encodeTable", term592780);
        setField(term592778, term592778.getClass(), "lineSeparator", term592781);
        setByteField(term592778, term592778.getClass(), "PAD", (byte) 61);
        setByteField(term592778, term592778.getClass(), "pad", (byte) 61);
        setIntField(term592778, term592778.getClass(), "unencodedBlockSize", 5);
        setIntField(term592778, term592778.getClass(), "encodedBlockSize", 8);
        setIntField(term592778, term592778.getClass(), "lineLength", 0);
        setIntField(term592778, term592778.getClass(), "chunkSeparatorLength", 10);
        term592782 = (byte[]) newByteArray(10);
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
        args[1] = term574282;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term592778));
        assertTrue(recursiveEquals(term574282, term592782));
    }

};


