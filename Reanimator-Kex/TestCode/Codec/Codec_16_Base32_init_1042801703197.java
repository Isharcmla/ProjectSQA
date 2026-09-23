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

public class Base32_init_1042801703197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371421;
     Object term375503;
     Object term375507;

    public Base32_init_1042801703197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term375025 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term375025, term375025.getClass(), "PAD", (byte) -128);
        setIntField(term375025, term375025.getClass(), "unencodedBlockSize", 0);
        setIntField(term375025, term375025.getClass(), "encodedBlockSize", 0);
        setIntField(term375025, term375025.getClass(), "lineLength", 0);
        setIntField(term375025, term375025.getClass(), "chunkSeparatorLength", 0);
        setByteField(term375025, term375025.getClass(), "pad", (byte) -128);
        setField(term375025, term375025.getClass(), "encodeTable", null);
        setField(term375025, term375025.getClass(), "decodeTable", null);
        term371421 = (byte[]) newByteArray(3);
        term375503 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term375504 = (byte[]) newByteArray(88);
        byte[] term375505 = (byte[]) newByteArray(32);
        byte[] term375506 = (byte[]) newByteArray(3);
        setIntField(term375503, term375503.getClass(), "decodeSize", 10);
        setByteElement(term375504, 0, (byte) -1);
        setByteElement(term375504, 1, (byte) -1);
        setByteElement(term375504, 2, (byte) -1);
        setByteElement(term375504, 3, (byte) -1);
        setByteElement(term375504, 4, (byte) -1);
        setByteElement(term375504, 5, (byte) -1);
        setByteElement(term375504, 6, (byte) -1);
        setByteElement(term375504, 7, (byte) -1);
        setByteElement(term375504, 8, (byte) -1);
        setByteElement(term375504, 9, (byte) -1);
        setByteElement(term375504, 10, (byte) -1);
        setByteElement(term375504, 11, (byte) -1);
        setByteElement(term375504, 12, (byte) -1);
        setByteElement(term375504, 13, (byte) -1);
        setByteElement(term375504, 14, (byte) -1);
        setByteElement(term375504, 15, (byte) -1);
        setByteElement(term375504, 16, (byte) -1);
        setByteElement(term375504, 17, (byte) -1);
        setByteElement(term375504, 18, (byte) -1);
        setByteElement(term375504, 19, (byte) -1);
        setByteElement(term375504, 20, (byte) -1);
        setByteElement(term375504, 21, (byte) -1);
        setByteElement(term375504, 22, (byte) -1);
        setByteElement(term375504, 23, (byte) -1);
        setByteElement(term375504, 24, (byte) -1);
        setByteElement(term375504, 25, (byte) -1);
        setByteElement(term375504, 26, (byte) -1);
        setByteElement(term375504, 27, (byte) -1);
        setByteElement(term375504, 28, (byte) -1);
        setByteElement(term375504, 29, (byte) -1);
        setByteElement(term375504, 30, (byte) -1);
        setByteElement(term375504, 31, (byte) -1);
        setByteElement(term375504, 32, (byte) -1);
        setByteElement(term375504, 33, (byte) -1);
        setByteElement(term375504, 34, (byte) -1);
        setByteElement(term375504, 35, (byte) -1);
        setByteElement(term375504, 36, (byte) -1);
        setByteElement(term375504, 37, (byte) -1);
        setByteElement(term375504, 38, (byte) -1);
        setByteElement(term375504, 39, (byte) -1);
        setByteElement(term375504, 40, (byte) -1);
        setByteElement(term375504, 41, (byte) -1);
        setByteElement(term375504, 42, (byte) -1);
        setByteElement(term375504, 43, (byte) -1);
        setByteElement(term375504, 44, (byte) -1);
        setByteElement(term375504, 45, (byte) -1);
        setByteElement(term375504, 46, (byte) -1);
        setByteElement(term375504, 47, (byte) -1);
        setByteElement(term375504, 49, (byte) 1);
        setByteElement(term375504, 50, (byte) 2);
        setByteElement(term375504, 51, (byte) 3);
        setByteElement(term375504, 52, (byte) 4);
        setByteElement(term375504, 53, (byte) 5);
        setByteElement(term375504, 54, (byte) 6);
        setByteElement(term375504, 55, (byte) 7);
        setByteElement(term375504, 56, (byte) 8);
        setByteElement(term375504, 57, (byte) 9);
        setByteElement(term375504, 58, (byte) -1);
        setByteElement(term375504, 59, (byte) -1);
        setByteElement(term375504, 60, (byte) -1);
        setByteElement(term375504, 61, (byte) -1);
        setByteElement(term375504, 62, (byte) -1);
        setByteElement(term375504, 63, (byte) -1);
        setByteElement(term375504, 64, (byte) -1);
        setByteElement(term375504, 65, (byte) 10);
        setByteElement(term375504, 66, (byte) 11);
        setByteElement(term375504, 67, (byte) 12);
        setByteElement(term375504, 68, (byte) 13);
        setByteElement(term375504, 69, (byte) 14);
        setByteElement(term375504, 70, (byte) 15);
        setByteElement(term375504, 71, (byte) 16);
        setByteElement(term375504, 72, (byte) 17);
        setByteElement(term375504, 73, (byte) 18);
        setByteElement(term375504, 74, (byte) 19);
        setByteElement(term375504, 75, (byte) 20);
        setByteElement(term375504, 76, (byte) 21);
        setByteElement(term375504, 77, (byte) 22);
        setByteElement(term375504, 78, (byte) 23);
        setByteElement(term375504, 79, (byte) 24);
        setByteElement(term375504, 80, (byte) 25);
        setByteElement(term375504, 81, (byte) 26);
        setByteElement(term375504, 82, (byte) 27);
        setByteElement(term375504, 83, (byte) 28);
        setByteElement(term375504, 84, (byte) 29);
        setByteElement(term375504, 85, (byte) 30);
        setByteElement(term375504, 86, (byte) 31);
        setByteElement(term375504, 87, (byte) 32);
        setField(term375503, term375503.getClass(), "decodeTable", term375504);
        setIntField(term375503, term375503.getClass(), "encodeSize", 11);
        setByteElement(term375505, 0, (byte) 48);
        setByteElement(term375505, 1, (byte) 49);
        setByteElement(term375505, 2, (byte) 50);
        setByteElement(term375505, 3, (byte) 51);
        setByteElement(term375505, 4, (byte) 52);
        setByteElement(term375505, 5, (byte) 53);
        setByteElement(term375505, 6, (byte) 54);
        setByteElement(term375505, 7, (byte) 55);
        setByteElement(term375505, 8, (byte) 56);
        setByteElement(term375505, 9, (byte) 57);
        setByteElement(term375505, 10, (byte) 65);
        setByteElement(term375505, 11, (byte) 66);
        setByteElement(term375505, 12, (byte) 67);
        setByteElement(term375505, 13, (byte) 68);
        setByteElement(term375505, 14, (byte) 69);
        setByteElement(term375505, 15, (byte) 70);
        setByteElement(term375505, 16, (byte) 71);
        setByteElement(term375505, 17, (byte) 72);
        setByteElement(term375505, 18, (byte) 73);
        setByteElement(term375505, 19, (byte) 74);
        setByteElement(term375505, 20, (byte) 75);
        setByteElement(term375505, 21, (byte) 76);
        setByteElement(term375505, 22, (byte) 77);
        setByteElement(term375505, 23, (byte) 78);
        setByteElement(term375505, 24, (byte) 79);
        setByteElement(term375505, 25, (byte) 80);
        setByteElement(term375505, 26, (byte) 81);
        setByteElement(term375505, 27, (byte) 82);
        setByteElement(term375505, 28, (byte) 83);
        setByteElement(term375505, 29, (byte) 84);
        setByteElement(term375505, 30, (byte) 85);
        setByteElement(term375505, 31, (byte) 86);
        setField(term375503, term375503.getClass(), "encodeTable", term375505);
        setField(term375503, term375503.getClass(), "lineSeparator", term375506);
        setByteField(term375503, term375503.getClass(), "PAD", (byte) 61);
        setByteField(term375503, term375503.getClass(), "pad", (byte) 61);
        setIntField(term375503, term375503.getClass(), "unencodedBlockSize", 5);
        setIntField(term375503, term375503.getClass(), "encodedBlockSize", 8);
        setIntField(term375503, term375503.getClass(), "lineLength", 0);
        setIntField(term375503, term375503.getClass(), "chunkSeparatorLength", 3);
        term375507 = (byte[]) newByteArray(3);
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
        args[1] = term371421;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term375503));
        assertTrue(recursiveEquals(term371421, term375507));
    }

};


