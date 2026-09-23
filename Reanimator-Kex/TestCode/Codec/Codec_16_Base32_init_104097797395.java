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

public class Base32_init_104097797395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93883;
     Object term95746;
     Object term95750;

    public Base32_init_104097797395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term95559 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term94401 = (byte[]) newByteArray(0);
        byte[] term94404 = (byte[]) newByteArray(0);
        setByteField(term95559, term95559.getClass(), "PAD", (byte) 0);
        setIntField(term95559, term95559.getClass(), "unencodedBlockSize", 0);
        setIntField(term95559, term95559.getClass(), "encodedBlockSize", 0);
        setIntField(term95559, term95559.getClass(), "lineLength", 0);
        setIntField(term95559, term95559.getClass(), "chunkSeparatorLength", 0);
        setByteField(term95559, term95559.getClass(), "pad", (byte) 0);
        setField(term95559, term95559.getClass(), "encodeTable", null);
        setField(term95559, term95559.getClass(), "decodeTable", term94401);
        setIntField(term95559, term95559.getClass(), "encodeSize", 0);
        setField(term95559, term95559.getClass(), "lineSeparator", term94404);
        setIntField(term95559, term95559.getClass(), "decodeSize", 0);
        term93883 = (byte[]) newByteArray(0);
        term95746 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term95747 = (byte[]) newByteArray(91);
        byte[] term95748 = (byte[]) newByteArray(32);
        byte[] term95749 = (byte[]) newByteArray(0);
        setIntField(term95746, term95746.getClass(), "decodeSize", 7);
        setByteElement(term95747, 0, (byte) -1);
        setByteElement(term95747, 1, (byte) -1);
        setByteElement(term95747, 2, (byte) -1);
        setByteElement(term95747, 3, (byte) -1);
        setByteElement(term95747, 4, (byte) -1);
        setByteElement(term95747, 5, (byte) -1);
        setByteElement(term95747, 6, (byte) -1);
        setByteElement(term95747, 7, (byte) -1);
        setByteElement(term95747, 8, (byte) -1);
        setByteElement(term95747, 9, (byte) -1);
        setByteElement(term95747, 10, (byte) -1);
        setByteElement(term95747, 11, (byte) -1);
        setByteElement(term95747, 12, (byte) -1);
        setByteElement(term95747, 13, (byte) -1);
        setByteElement(term95747, 14, (byte) -1);
        setByteElement(term95747, 15, (byte) -1);
        setByteElement(term95747, 16, (byte) -1);
        setByteElement(term95747, 17, (byte) -1);
        setByteElement(term95747, 18, (byte) -1);
        setByteElement(term95747, 19, (byte) -1);
        setByteElement(term95747, 20, (byte) -1);
        setByteElement(term95747, 21, (byte) -1);
        setByteElement(term95747, 22, (byte) -1);
        setByteElement(term95747, 23, (byte) -1);
        setByteElement(term95747, 24, (byte) -1);
        setByteElement(term95747, 25, (byte) -1);
        setByteElement(term95747, 26, (byte) -1);
        setByteElement(term95747, 27, (byte) -1);
        setByteElement(term95747, 28, (byte) -1);
        setByteElement(term95747, 29, (byte) -1);
        setByteElement(term95747, 30, (byte) -1);
        setByteElement(term95747, 31, (byte) -1);
        setByteElement(term95747, 32, (byte) -1);
        setByteElement(term95747, 33, (byte) -1);
        setByteElement(term95747, 34, (byte) -1);
        setByteElement(term95747, 35, (byte) -1);
        setByteElement(term95747, 36, (byte) -1);
        setByteElement(term95747, 37, (byte) -1);
        setByteElement(term95747, 38, (byte) -1);
        setByteElement(term95747, 39, (byte) -1);
        setByteElement(term95747, 40, (byte) -1);
        setByteElement(term95747, 41, (byte) -1);
        setByteElement(term95747, 42, (byte) -1);
        setByteElement(term95747, 43, (byte) -1);
        setByteElement(term95747, 44, (byte) -1);
        setByteElement(term95747, 45, (byte) -1);
        setByteElement(term95747, 46, (byte) -1);
        setByteElement(term95747, 47, (byte) -1);
        setByteElement(term95747, 48, (byte) -1);
        setByteElement(term95747, 49, (byte) -1);
        setByteElement(term95747, 50, (byte) 26);
        setByteElement(term95747, 51, (byte) 27);
        setByteElement(term95747, 52, (byte) 28);
        setByteElement(term95747, 53, (byte) 29);
        setByteElement(term95747, 54, (byte) 30);
        setByteElement(term95747, 55, (byte) 31);
        setByteElement(term95747, 56, (byte) -1);
        setByteElement(term95747, 57, (byte) -1);
        setByteElement(term95747, 58, (byte) -1);
        setByteElement(term95747, 59, (byte) -1);
        setByteElement(term95747, 60, (byte) -1);
        setByteElement(term95747, 61, (byte) -1);
        setByteElement(term95747, 62, (byte) -1);
        setByteElement(term95747, 63, (byte) -1);
        setByteElement(term95747, 64, (byte) -1);
        setByteElement(term95747, 66, (byte) 1);
        setByteElement(term95747, 67, (byte) 2);
        setByteElement(term95747, 68, (byte) 3);
        setByteElement(term95747, 69, (byte) 4);
        setByteElement(term95747, 70, (byte) 5);
        setByteElement(term95747, 71, (byte) 6);
        setByteElement(term95747, 72, (byte) 7);
        setByteElement(term95747, 73, (byte) 8);
        setByteElement(term95747, 74, (byte) 9);
        setByteElement(term95747, 75, (byte) 10);
        setByteElement(term95747, 76, (byte) 11);
        setByteElement(term95747, 77, (byte) 12);
        setByteElement(term95747, 78, (byte) 13);
        setByteElement(term95747, 79, (byte) 14);
        setByteElement(term95747, 80, (byte) 15);
        setByteElement(term95747, 81, (byte) 16);
        setByteElement(term95747, 82, (byte) 17);
        setByteElement(term95747, 83, (byte) 18);
        setByteElement(term95747, 84, (byte) 19);
        setByteElement(term95747, 85, (byte) 20);
        setByteElement(term95747, 86, (byte) 21);
        setByteElement(term95747, 87, (byte) 22);
        setByteElement(term95747, 88, (byte) 23);
        setByteElement(term95747, 89, (byte) 24);
        setByteElement(term95747, 90, (byte) 25);
        setField(term95746, term95746.getClass(), "decodeTable", term95747);
        setIntField(term95746, term95746.getClass(), "encodeSize", 8);
        setByteElement(term95748, 0, (byte) 65);
        setByteElement(term95748, 1, (byte) 66);
        setByteElement(term95748, 2, (byte) 67);
        setByteElement(term95748, 3, (byte) 68);
        setByteElement(term95748, 4, (byte) 69);
        setByteElement(term95748, 5, (byte) 70);
        setByteElement(term95748, 6, (byte) 71);
        setByteElement(term95748, 7, (byte) 72);
        setByteElement(term95748, 8, (byte) 73);
        setByteElement(term95748, 9, (byte) 74);
        setByteElement(term95748, 10, (byte) 75);
        setByteElement(term95748, 11, (byte) 76);
        setByteElement(term95748, 12, (byte) 77);
        setByteElement(term95748, 13, (byte) 78);
        setByteElement(term95748, 14, (byte) 79);
        setByteElement(term95748, 15, (byte) 80);
        setByteElement(term95748, 16, (byte) 81);
        setByteElement(term95748, 17, (byte) 82);
        setByteElement(term95748, 18, (byte) 83);
        setByteElement(term95748, 19, (byte) 84);
        setByteElement(term95748, 20, (byte) 85);
        setByteElement(term95748, 21, (byte) 86);
        setByteElement(term95748, 22, (byte) 87);
        setByteElement(term95748, 23, (byte) 88);
        setByteElement(term95748, 24, (byte) 89);
        setByteElement(term95748, 25, (byte) 90);
        setByteElement(term95748, 26, (byte) 50);
        setByteElement(term95748, 27, (byte) 51);
        setByteElement(term95748, 28, (byte) 52);
        setByteElement(term95748, 29, (byte) 53);
        setByteElement(term95748, 30, (byte) 54);
        setByteElement(term95748, 31, (byte) 55);
        setField(term95746, term95746.getClass(), "encodeTable", term95748);
        setField(term95746, term95746.getClass(), "lineSeparator", term95749);
        setByteField(term95746, term95746.getClass(), "PAD", (byte) 61);
        setByteField(term95746, term95746.getClass(), "pad", (byte) 61);
        setIntField(term95746, term95746.getClass(), "unencodedBlockSize", 5);
        setIntField(term95746, term95746.getClass(), "encodedBlockSize", 8);
        setIntField(term95746, term95746.getClass(), "lineLength", 0);
        setIntField(term95746, term95746.getClass(), "chunkSeparatorLength", 0);
        term95750 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = 1;
        args[1] = term93883;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term95746));
        assertTrue(recursiveEquals(term93883, term95750));
    }

};


