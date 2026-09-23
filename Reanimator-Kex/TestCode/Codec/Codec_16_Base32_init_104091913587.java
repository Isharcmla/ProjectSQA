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

public class Base32_init_104091913587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78582;

    public Base32_init_104091913587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term74621 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term74165 = (byte[]) newByteArray(0);
        byte[] term74213 = (byte[]) newByteArray(0);
        setByteField(term74621, term74621.getClass(), "PAD", (byte) 0);
        setIntField(term74621, term74621.getClass(), "unencodedBlockSize", 0);
        setIntField(term74621, term74621.getClass(), "encodedBlockSize", 0);
        setIntField(term74621, term74621.getClass(), "lineLength", 0);
        setIntField(term74621, term74621.getClass(), "chunkSeparatorLength", 0);
        setByteField(term74621, term74621.getClass(), "pad", (byte) -128);
        setField(term74621, term74621.getClass(), "encodeTable", term74165);
        setField(term74621, term74621.getClass(), "decodeTable", term74213);
        setIntField(term74621, term74621.getClass(), "encodeSize", 0);
        setField(term74621, term74621.getClass(), "lineSeparator", null);
        setIntField(term74621, term74621.getClass(), "decodeSize", 0);
        term78582 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term78583 = (byte[]) newByteArray(91);
        byte[] term78584 = (byte[]) newByteArray(32);
        byte[] term78585 = (byte[]) newByteArray(2);
        setIntField(term78582, term78582.getClass(), "decodeSize", 9);
        setByteElement(term78583, 0, (byte) -1);
        setByteElement(term78583, 1, (byte) -1);
        setByteElement(term78583, 2, (byte) -1);
        setByteElement(term78583, 3, (byte) -1);
        setByteElement(term78583, 4, (byte) -1);
        setByteElement(term78583, 5, (byte) -1);
        setByteElement(term78583, 6, (byte) -1);
        setByteElement(term78583, 7, (byte) -1);
        setByteElement(term78583, 8, (byte) -1);
        setByteElement(term78583, 9, (byte) -1);
        setByteElement(term78583, 10, (byte) -1);
        setByteElement(term78583, 11, (byte) -1);
        setByteElement(term78583, 12, (byte) -1);
        setByteElement(term78583, 13, (byte) -1);
        setByteElement(term78583, 14, (byte) -1);
        setByteElement(term78583, 15, (byte) -1);
        setByteElement(term78583, 16, (byte) -1);
        setByteElement(term78583, 17, (byte) -1);
        setByteElement(term78583, 18, (byte) -1);
        setByteElement(term78583, 19, (byte) -1);
        setByteElement(term78583, 20, (byte) -1);
        setByteElement(term78583, 21, (byte) -1);
        setByteElement(term78583, 22, (byte) -1);
        setByteElement(term78583, 23, (byte) -1);
        setByteElement(term78583, 24, (byte) -1);
        setByteElement(term78583, 25, (byte) -1);
        setByteElement(term78583, 26, (byte) -1);
        setByteElement(term78583, 27, (byte) -1);
        setByteElement(term78583, 28, (byte) -1);
        setByteElement(term78583, 29, (byte) -1);
        setByteElement(term78583, 30, (byte) -1);
        setByteElement(term78583, 31, (byte) -1);
        setByteElement(term78583, 32, (byte) -1);
        setByteElement(term78583, 33, (byte) -1);
        setByteElement(term78583, 34, (byte) -1);
        setByteElement(term78583, 35, (byte) -1);
        setByteElement(term78583, 36, (byte) -1);
        setByteElement(term78583, 37, (byte) -1);
        setByteElement(term78583, 38, (byte) -1);
        setByteElement(term78583, 39, (byte) -1);
        setByteElement(term78583, 40, (byte) -1);
        setByteElement(term78583, 41, (byte) -1);
        setByteElement(term78583, 42, (byte) -1);
        setByteElement(term78583, 43, (byte) -1);
        setByteElement(term78583, 44, (byte) -1);
        setByteElement(term78583, 45, (byte) -1);
        setByteElement(term78583, 46, (byte) -1);
        setByteElement(term78583, 47, (byte) -1);
        setByteElement(term78583, 48, (byte) -1);
        setByteElement(term78583, 49, (byte) -1);
        setByteElement(term78583, 50, (byte) 26);
        setByteElement(term78583, 51, (byte) 27);
        setByteElement(term78583, 52, (byte) 28);
        setByteElement(term78583, 53, (byte) 29);
        setByteElement(term78583, 54, (byte) 30);
        setByteElement(term78583, 55, (byte) 31);
        setByteElement(term78583, 56, (byte) -1);
        setByteElement(term78583, 57, (byte) -1);
        setByteElement(term78583, 58, (byte) -1);
        setByteElement(term78583, 59, (byte) -1);
        setByteElement(term78583, 60, (byte) -1);
        setByteElement(term78583, 61, (byte) -1);
        setByteElement(term78583, 62, (byte) -1);
        setByteElement(term78583, 63, (byte) -1);
        setByteElement(term78583, 64, (byte) -1);
        setByteElement(term78583, 66, (byte) 1);
        setByteElement(term78583, 67, (byte) 2);
        setByteElement(term78583, 68, (byte) 3);
        setByteElement(term78583, 69, (byte) 4);
        setByteElement(term78583, 70, (byte) 5);
        setByteElement(term78583, 71, (byte) 6);
        setByteElement(term78583, 72, (byte) 7);
        setByteElement(term78583, 73, (byte) 8);
        setByteElement(term78583, 74, (byte) 9);
        setByteElement(term78583, 75, (byte) 10);
        setByteElement(term78583, 76, (byte) 11);
        setByteElement(term78583, 77, (byte) 12);
        setByteElement(term78583, 78, (byte) 13);
        setByteElement(term78583, 79, (byte) 14);
        setByteElement(term78583, 80, (byte) 15);
        setByteElement(term78583, 81, (byte) 16);
        setByteElement(term78583, 82, (byte) 17);
        setByteElement(term78583, 83, (byte) 18);
        setByteElement(term78583, 84, (byte) 19);
        setByteElement(term78583, 85, (byte) 20);
        setByteElement(term78583, 86, (byte) 21);
        setByteElement(term78583, 87, (byte) 22);
        setByteElement(term78583, 88, (byte) 23);
        setByteElement(term78583, 89, (byte) 24);
        setByteElement(term78583, 90, (byte) 25);
        setField(term78582, term78582.getClass(), "decodeTable", term78583);
        setIntField(term78582, term78582.getClass(), "encodeSize", 10);
        setByteElement(term78584, 0, (byte) 65);
        setByteElement(term78584, 1, (byte) 66);
        setByteElement(term78584, 2, (byte) 67);
        setByteElement(term78584, 3, (byte) 68);
        setByteElement(term78584, 4, (byte) 69);
        setByteElement(term78584, 5, (byte) 70);
        setByteElement(term78584, 6, (byte) 71);
        setByteElement(term78584, 7, (byte) 72);
        setByteElement(term78584, 8, (byte) 73);
        setByteElement(term78584, 9, (byte) 74);
        setByteElement(term78584, 10, (byte) 75);
        setByteElement(term78584, 11, (byte) 76);
        setByteElement(term78584, 12, (byte) 77);
        setByteElement(term78584, 13, (byte) 78);
        setByteElement(term78584, 14, (byte) 79);
        setByteElement(term78584, 15, (byte) 80);
        setByteElement(term78584, 16, (byte) 81);
        setByteElement(term78584, 17, (byte) 82);
        setByteElement(term78584, 18, (byte) 83);
        setByteElement(term78584, 19, (byte) 84);
        setByteElement(term78584, 20, (byte) 85);
        setByteElement(term78584, 21, (byte) 86);
        setByteElement(term78584, 22, (byte) 87);
        setByteElement(term78584, 23, (byte) 88);
        setByteElement(term78584, 24, (byte) 89);
        setByteElement(term78584, 25, (byte) 90);
        setByteElement(term78584, 26, (byte) 50);
        setByteElement(term78584, 27, (byte) 51);
        setByteElement(term78584, 28, (byte) 52);
        setByteElement(term78584, 29, (byte) 53);
        setByteElement(term78584, 30, (byte) 54);
        setByteElement(term78584, 31, (byte) 55);
        setField(term78582, term78582.getClass(), "encodeTable", term78584);
        setByteElement(term78585, 0, (byte) 13);
        setByteElement(term78585, 1, (byte) 10);
        setField(term78582, term78582.getClass(), "lineSeparator", term78585);
        setByteField(term78582, term78582.getClass(), "PAD", (byte) 61);
        setByteField(term78582, term78582.getClass(), "pad", (byte) 61);
        setIntField(term78582, term78582.getClass(), "unencodedBlockSize", 5);
        setIntField(term78582, term78582.getClass(), "encodedBlockSize", 8);
        setIntField(term78582, term78582.getClass(), "lineLength", 0);
        setIntField(term78582, term78582.getClass(), "chunkSeparatorLength", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term78582));
    }

};


