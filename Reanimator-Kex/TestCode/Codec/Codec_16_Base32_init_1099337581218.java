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

public class Base32_init_1099337581218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429288;
     Object term430283;
     Object term430287;

    public Base32_init_1099337581218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term429398 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term429398, term429398.getClass(), "PAD", (byte) 0);
        setIntField(term429398, term429398.getClass(), "unencodedBlockSize", 0);
        setIntField(term429398, term429398.getClass(), "encodedBlockSize", 0);
        setIntField(term429398, term429398.getClass(), "lineLength", 0);
        setIntField(term429398, term429398.getClass(), "chunkSeparatorLength", 0);
        setByteField(term429398, term429398.getClass(), "pad", (byte) 0);
        term429288 = (byte[]) newByteArray(0);
        term430283 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term430284 = (byte[]) newByteArray(88);
        byte[] term430285 = (byte[]) newByteArray(32);
        byte[] term430286 = (byte[]) newByteArray(0);
        setIntField(term430283, term430283.getClass(), "decodeSize", 7);
        setByteElement(term430284, 0, (byte) -1);
        setByteElement(term430284, 1, (byte) -1);
        setByteElement(term430284, 2, (byte) -1);
        setByteElement(term430284, 3, (byte) -1);
        setByteElement(term430284, 4, (byte) -1);
        setByteElement(term430284, 5, (byte) -1);
        setByteElement(term430284, 6, (byte) -1);
        setByteElement(term430284, 7, (byte) -1);
        setByteElement(term430284, 8, (byte) -1);
        setByteElement(term430284, 9, (byte) -1);
        setByteElement(term430284, 10, (byte) -1);
        setByteElement(term430284, 11, (byte) -1);
        setByteElement(term430284, 12, (byte) -1);
        setByteElement(term430284, 13, (byte) -1);
        setByteElement(term430284, 14, (byte) -1);
        setByteElement(term430284, 15, (byte) -1);
        setByteElement(term430284, 16, (byte) -1);
        setByteElement(term430284, 17, (byte) -1);
        setByteElement(term430284, 18, (byte) -1);
        setByteElement(term430284, 19, (byte) -1);
        setByteElement(term430284, 20, (byte) -1);
        setByteElement(term430284, 21, (byte) -1);
        setByteElement(term430284, 22, (byte) -1);
        setByteElement(term430284, 23, (byte) -1);
        setByteElement(term430284, 24, (byte) -1);
        setByteElement(term430284, 25, (byte) -1);
        setByteElement(term430284, 26, (byte) -1);
        setByteElement(term430284, 27, (byte) -1);
        setByteElement(term430284, 28, (byte) -1);
        setByteElement(term430284, 29, (byte) -1);
        setByteElement(term430284, 30, (byte) -1);
        setByteElement(term430284, 31, (byte) -1);
        setByteElement(term430284, 32, (byte) -1);
        setByteElement(term430284, 33, (byte) -1);
        setByteElement(term430284, 34, (byte) -1);
        setByteElement(term430284, 35, (byte) -1);
        setByteElement(term430284, 36, (byte) -1);
        setByteElement(term430284, 37, (byte) -1);
        setByteElement(term430284, 38, (byte) -1);
        setByteElement(term430284, 39, (byte) -1);
        setByteElement(term430284, 40, (byte) -1);
        setByteElement(term430284, 41, (byte) -1);
        setByteElement(term430284, 42, (byte) -1);
        setByteElement(term430284, 43, (byte) -1);
        setByteElement(term430284, 44, (byte) -1);
        setByteElement(term430284, 45, (byte) -1);
        setByteElement(term430284, 46, (byte) -1);
        setByteElement(term430284, 47, (byte) -1);
        setByteElement(term430284, 49, (byte) 1);
        setByteElement(term430284, 50, (byte) 2);
        setByteElement(term430284, 51, (byte) 3);
        setByteElement(term430284, 52, (byte) 4);
        setByteElement(term430284, 53, (byte) 5);
        setByteElement(term430284, 54, (byte) 6);
        setByteElement(term430284, 55, (byte) 7);
        setByteElement(term430284, 56, (byte) 8);
        setByteElement(term430284, 57, (byte) 9);
        setByteElement(term430284, 58, (byte) -1);
        setByteElement(term430284, 59, (byte) -1);
        setByteElement(term430284, 60, (byte) -1);
        setByteElement(term430284, 61, (byte) -1);
        setByteElement(term430284, 62, (byte) -1);
        setByteElement(term430284, 63, (byte) -1);
        setByteElement(term430284, 64, (byte) -1);
        setByteElement(term430284, 65, (byte) 10);
        setByteElement(term430284, 66, (byte) 11);
        setByteElement(term430284, 67, (byte) 12);
        setByteElement(term430284, 68, (byte) 13);
        setByteElement(term430284, 69, (byte) 14);
        setByteElement(term430284, 70, (byte) 15);
        setByteElement(term430284, 71, (byte) 16);
        setByteElement(term430284, 72, (byte) 17);
        setByteElement(term430284, 73, (byte) 18);
        setByteElement(term430284, 74, (byte) 19);
        setByteElement(term430284, 75, (byte) 20);
        setByteElement(term430284, 76, (byte) 21);
        setByteElement(term430284, 77, (byte) 22);
        setByteElement(term430284, 78, (byte) 23);
        setByteElement(term430284, 79, (byte) 24);
        setByteElement(term430284, 80, (byte) 25);
        setByteElement(term430284, 81, (byte) 26);
        setByteElement(term430284, 82, (byte) 27);
        setByteElement(term430284, 83, (byte) 28);
        setByteElement(term430284, 84, (byte) 29);
        setByteElement(term430284, 85, (byte) 30);
        setByteElement(term430284, 86, (byte) 31);
        setByteElement(term430284, 87, (byte) 32);
        setField(term430283, term430283.getClass(), "decodeTable", term430284);
        setIntField(term430283, term430283.getClass(), "encodeSize", 8);
        setByteElement(term430285, 0, (byte) 48);
        setByteElement(term430285, 1, (byte) 49);
        setByteElement(term430285, 2, (byte) 50);
        setByteElement(term430285, 3, (byte) 51);
        setByteElement(term430285, 4, (byte) 52);
        setByteElement(term430285, 5, (byte) 53);
        setByteElement(term430285, 6, (byte) 54);
        setByteElement(term430285, 7, (byte) 55);
        setByteElement(term430285, 8, (byte) 56);
        setByteElement(term430285, 9, (byte) 57);
        setByteElement(term430285, 10, (byte) 65);
        setByteElement(term430285, 11, (byte) 66);
        setByteElement(term430285, 12, (byte) 67);
        setByteElement(term430285, 13, (byte) 68);
        setByteElement(term430285, 14, (byte) 69);
        setByteElement(term430285, 15, (byte) 70);
        setByteElement(term430285, 16, (byte) 71);
        setByteElement(term430285, 17, (byte) 72);
        setByteElement(term430285, 18, (byte) 73);
        setByteElement(term430285, 19, (byte) 74);
        setByteElement(term430285, 20, (byte) 75);
        setByteElement(term430285, 21, (byte) 76);
        setByteElement(term430285, 22, (byte) 77);
        setByteElement(term430285, 23, (byte) 78);
        setByteElement(term430285, 24, (byte) 79);
        setByteElement(term430285, 25, (byte) 80);
        setByteElement(term430285, 26, (byte) 81);
        setByteElement(term430285, 27, (byte) 82);
        setByteElement(term430285, 28, (byte) 83);
        setByteElement(term430285, 29, (byte) 84);
        setByteElement(term430285, 30, (byte) 85);
        setByteElement(term430285, 31, (byte) 86);
        setField(term430283, term430283.getClass(), "encodeTable", term430285);
        setField(term430283, term430283.getClass(), "lineSeparator", term430286);
        setByteField(term430283, term430283.getClass(), "PAD", (byte) 61);
        setByteField(term430283, term430283.getClass(), "pad", (byte) 0);
        setIntField(term430283, term430283.getClass(), "unencodedBlockSize", 5);
        setIntField(term430283, term430283.getClass(), "encodedBlockSize", 8);
        setIntField(term430283, term430283.getClass(), "lineLength", 0);
        setIntField(term430283, term430283.getClass(), "chunkSeparatorLength", 0);
        term430287 = (byte[]) newByteArray(0);
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
        args[0] = 1;
        args[1] = term429288;
        args[2] = true;
        args[3] = (byte) 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term430283));
        assertTrue(recursiveEquals(term429288, (byte) 0));
    }

};


