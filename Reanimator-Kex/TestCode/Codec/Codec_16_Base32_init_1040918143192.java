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

public class Base32_init_1040918143192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370653;

    public Base32_init_1040918143192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term370289 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term370289, term370289.getClass(), "PAD", (byte) 0);
        setIntField(term370289, term370289.getClass(), "unencodedBlockSize", 0);
        setIntField(term370289, term370289.getClass(), "encodedBlockSize", 0);
        setIntField(term370289, term370289.getClass(), "lineLength", 0);
        setIntField(term370289, term370289.getClass(), "chunkSeparatorLength", 0);
        setByteField(term370289, term370289.getClass(), "pad", (byte) 0);
        term370653 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term370654 = (byte[]) newByteArray(88);
        byte[] term370655 = (byte[]) newByteArray(32);
        setIntField(term370653, term370653.getClass(), "decodeSize", 7);
        setByteElement(term370654, 0, (byte) -1);
        setByteElement(term370654, 1, (byte) -1);
        setByteElement(term370654, 2, (byte) -1);
        setByteElement(term370654, 3, (byte) -1);
        setByteElement(term370654, 4, (byte) -1);
        setByteElement(term370654, 5, (byte) -1);
        setByteElement(term370654, 6, (byte) -1);
        setByteElement(term370654, 7, (byte) -1);
        setByteElement(term370654, 8, (byte) -1);
        setByteElement(term370654, 9, (byte) -1);
        setByteElement(term370654, 10, (byte) -1);
        setByteElement(term370654, 11, (byte) -1);
        setByteElement(term370654, 12, (byte) -1);
        setByteElement(term370654, 13, (byte) -1);
        setByteElement(term370654, 14, (byte) -1);
        setByteElement(term370654, 15, (byte) -1);
        setByteElement(term370654, 16, (byte) -1);
        setByteElement(term370654, 17, (byte) -1);
        setByteElement(term370654, 18, (byte) -1);
        setByteElement(term370654, 19, (byte) -1);
        setByteElement(term370654, 20, (byte) -1);
        setByteElement(term370654, 21, (byte) -1);
        setByteElement(term370654, 22, (byte) -1);
        setByteElement(term370654, 23, (byte) -1);
        setByteElement(term370654, 24, (byte) -1);
        setByteElement(term370654, 25, (byte) -1);
        setByteElement(term370654, 26, (byte) -1);
        setByteElement(term370654, 27, (byte) -1);
        setByteElement(term370654, 28, (byte) -1);
        setByteElement(term370654, 29, (byte) -1);
        setByteElement(term370654, 30, (byte) -1);
        setByteElement(term370654, 31, (byte) -1);
        setByteElement(term370654, 32, (byte) -1);
        setByteElement(term370654, 33, (byte) -1);
        setByteElement(term370654, 34, (byte) -1);
        setByteElement(term370654, 35, (byte) -1);
        setByteElement(term370654, 36, (byte) -1);
        setByteElement(term370654, 37, (byte) -1);
        setByteElement(term370654, 38, (byte) -1);
        setByteElement(term370654, 39, (byte) -1);
        setByteElement(term370654, 40, (byte) -1);
        setByteElement(term370654, 41, (byte) -1);
        setByteElement(term370654, 42, (byte) -1);
        setByteElement(term370654, 43, (byte) -1);
        setByteElement(term370654, 44, (byte) -1);
        setByteElement(term370654, 45, (byte) -1);
        setByteElement(term370654, 46, (byte) -1);
        setByteElement(term370654, 47, (byte) -1);
        setByteElement(term370654, 49, (byte) 1);
        setByteElement(term370654, 50, (byte) 2);
        setByteElement(term370654, 51, (byte) 3);
        setByteElement(term370654, 52, (byte) 4);
        setByteElement(term370654, 53, (byte) 5);
        setByteElement(term370654, 54, (byte) 6);
        setByteElement(term370654, 55, (byte) 7);
        setByteElement(term370654, 56, (byte) 8);
        setByteElement(term370654, 57, (byte) 9);
        setByteElement(term370654, 58, (byte) -1);
        setByteElement(term370654, 59, (byte) -1);
        setByteElement(term370654, 60, (byte) -1);
        setByteElement(term370654, 61, (byte) -1);
        setByteElement(term370654, 62, (byte) -1);
        setByteElement(term370654, 63, (byte) -1);
        setByteElement(term370654, 64, (byte) -1);
        setByteElement(term370654, 65, (byte) 10);
        setByteElement(term370654, 66, (byte) 11);
        setByteElement(term370654, 67, (byte) 12);
        setByteElement(term370654, 68, (byte) 13);
        setByteElement(term370654, 69, (byte) 14);
        setByteElement(term370654, 70, (byte) 15);
        setByteElement(term370654, 71, (byte) 16);
        setByteElement(term370654, 72, (byte) 17);
        setByteElement(term370654, 73, (byte) 18);
        setByteElement(term370654, 74, (byte) 19);
        setByteElement(term370654, 75, (byte) 20);
        setByteElement(term370654, 76, (byte) 21);
        setByteElement(term370654, 77, (byte) 22);
        setByteElement(term370654, 78, (byte) 23);
        setByteElement(term370654, 79, (byte) 24);
        setByteElement(term370654, 80, (byte) 25);
        setByteElement(term370654, 81, (byte) 26);
        setByteElement(term370654, 82, (byte) 27);
        setByteElement(term370654, 83, (byte) 28);
        setByteElement(term370654, 84, (byte) 29);
        setByteElement(term370654, 85, (byte) 30);
        setByteElement(term370654, 86, (byte) 31);
        setByteElement(term370654, 87, (byte) 32);
        setField(term370653, term370653.getClass(), "decodeTable", term370654);
        setIntField(term370653, term370653.getClass(), "encodeSize", 8);
        setByteElement(term370655, 0, (byte) 48);
        setByteElement(term370655, 1, (byte) 49);
        setByteElement(term370655, 2, (byte) 50);
        setByteElement(term370655, 3, (byte) 51);
        setByteElement(term370655, 4, (byte) 52);
        setByteElement(term370655, 5, (byte) 53);
        setByteElement(term370655, 6, (byte) 54);
        setByteElement(term370655, 7, (byte) 55);
        setByteElement(term370655, 8, (byte) 56);
        setByteElement(term370655, 9, (byte) 57);
        setByteElement(term370655, 10, (byte) 65);
        setByteElement(term370655, 11, (byte) 66);
        setByteElement(term370655, 12, (byte) 67);
        setByteElement(term370655, 13, (byte) 68);
        setByteElement(term370655, 14, (byte) 69);
        setByteElement(term370655, 15, (byte) 70);
        setByteElement(term370655, 16, (byte) 71);
        setByteElement(term370655, 17, (byte) 72);
        setByteElement(term370655, 18, (byte) 73);
        setByteElement(term370655, 19, (byte) 74);
        setByteElement(term370655, 20, (byte) 75);
        setByteElement(term370655, 21, (byte) 76);
        setByteElement(term370655, 22, (byte) 77);
        setByteElement(term370655, 23, (byte) 78);
        setByteElement(term370655, 24, (byte) 79);
        setByteElement(term370655, 25, (byte) 80);
        setByteElement(term370655, 26, (byte) 81);
        setByteElement(term370655, 27, (byte) 82);
        setByteElement(term370655, 28, (byte) 83);
        setByteElement(term370655, 29, (byte) 84);
        setByteElement(term370655, 30, (byte) 85);
        setByteElement(term370655, 31, (byte) 86);
        setField(term370653, term370653.getClass(), "encodeTable", term370655);
        setField(term370653, term370653.getClass(), "lineSeparator", null);
        setByteField(term370653, term370653.getClass(), "PAD", (byte) 61);
        setByteField(term370653, term370653.getClass(), "pad", (byte) 61);
        setIntField(term370653, term370653.getClass(), "unencodedBlockSize", 5);
        setIntField(term370653, term370653.getClass(), "encodedBlockSize", 8);
        setIntField(term370653, term370653.getClass(), "lineLength", 0);
        setIntField(term370653, term370653.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term370653));
    }

};


