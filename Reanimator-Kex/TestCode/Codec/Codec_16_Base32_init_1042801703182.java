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

public class Base32_init_1042801703182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351356;
     Object term367726;
     Object term367730;

    public Base32_init_1042801703182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term355959 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term351858 = (byte[]) newByteArray(0);
        setByteField(term355959, term355959.getClass(), "PAD", (byte) -128);
        setIntField(term355959, term355959.getClass(), "unencodedBlockSize", 0);
        setIntField(term355959, term355959.getClass(), "encodedBlockSize", 0);
        setIntField(term355959, term355959.getClass(), "lineLength", 0);
        setIntField(term355959, term355959.getClass(), "chunkSeparatorLength", 0);
        setByteField(term355959, term355959.getClass(), "pad", (byte) -128);
        setField(term355959, term355959.getClass(), "encodeTable", null);
        setField(term355959, term355959.getClass(), "decodeTable", term351858);
        term351356 = (byte[]) newByteArray(4);
        term367726 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term367727 = (byte[]) newByteArray(88);
        byte[] term367728 = (byte[]) newByteArray(32);
        byte[] term367729 = (byte[]) newByteArray(4);
        setIntField(term367726, term367726.getClass(), "decodeSize", 11);
        setByteElement(term367727, 0, (byte) -1);
        setByteElement(term367727, 1, (byte) -1);
        setByteElement(term367727, 2, (byte) -1);
        setByteElement(term367727, 3, (byte) -1);
        setByteElement(term367727, 4, (byte) -1);
        setByteElement(term367727, 5, (byte) -1);
        setByteElement(term367727, 6, (byte) -1);
        setByteElement(term367727, 7, (byte) -1);
        setByteElement(term367727, 8, (byte) -1);
        setByteElement(term367727, 9, (byte) -1);
        setByteElement(term367727, 10, (byte) -1);
        setByteElement(term367727, 11, (byte) -1);
        setByteElement(term367727, 12, (byte) -1);
        setByteElement(term367727, 13, (byte) -1);
        setByteElement(term367727, 14, (byte) -1);
        setByteElement(term367727, 15, (byte) -1);
        setByteElement(term367727, 16, (byte) -1);
        setByteElement(term367727, 17, (byte) -1);
        setByteElement(term367727, 18, (byte) -1);
        setByteElement(term367727, 19, (byte) -1);
        setByteElement(term367727, 20, (byte) -1);
        setByteElement(term367727, 21, (byte) -1);
        setByteElement(term367727, 22, (byte) -1);
        setByteElement(term367727, 23, (byte) -1);
        setByteElement(term367727, 24, (byte) -1);
        setByteElement(term367727, 25, (byte) -1);
        setByteElement(term367727, 26, (byte) -1);
        setByteElement(term367727, 27, (byte) -1);
        setByteElement(term367727, 28, (byte) -1);
        setByteElement(term367727, 29, (byte) -1);
        setByteElement(term367727, 30, (byte) -1);
        setByteElement(term367727, 31, (byte) -1);
        setByteElement(term367727, 32, (byte) -1);
        setByteElement(term367727, 33, (byte) -1);
        setByteElement(term367727, 34, (byte) -1);
        setByteElement(term367727, 35, (byte) -1);
        setByteElement(term367727, 36, (byte) -1);
        setByteElement(term367727, 37, (byte) -1);
        setByteElement(term367727, 38, (byte) -1);
        setByteElement(term367727, 39, (byte) -1);
        setByteElement(term367727, 40, (byte) -1);
        setByteElement(term367727, 41, (byte) -1);
        setByteElement(term367727, 42, (byte) -1);
        setByteElement(term367727, 43, (byte) -1);
        setByteElement(term367727, 44, (byte) -1);
        setByteElement(term367727, 45, (byte) -1);
        setByteElement(term367727, 46, (byte) -1);
        setByteElement(term367727, 47, (byte) -1);
        setByteElement(term367727, 49, (byte) 1);
        setByteElement(term367727, 50, (byte) 2);
        setByteElement(term367727, 51, (byte) 3);
        setByteElement(term367727, 52, (byte) 4);
        setByteElement(term367727, 53, (byte) 5);
        setByteElement(term367727, 54, (byte) 6);
        setByteElement(term367727, 55, (byte) 7);
        setByteElement(term367727, 56, (byte) 8);
        setByteElement(term367727, 57, (byte) 9);
        setByteElement(term367727, 58, (byte) -1);
        setByteElement(term367727, 59, (byte) -1);
        setByteElement(term367727, 60, (byte) -1);
        setByteElement(term367727, 61, (byte) -1);
        setByteElement(term367727, 62, (byte) -1);
        setByteElement(term367727, 63, (byte) -1);
        setByteElement(term367727, 64, (byte) -1);
        setByteElement(term367727, 65, (byte) 10);
        setByteElement(term367727, 66, (byte) 11);
        setByteElement(term367727, 67, (byte) 12);
        setByteElement(term367727, 68, (byte) 13);
        setByteElement(term367727, 69, (byte) 14);
        setByteElement(term367727, 70, (byte) 15);
        setByteElement(term367727, 71, (byte) 16);
        setByteElement(term367727, 72, (byte) 17);
        setByteElement(term367727, 73, (byte) 18);
        setByteElement(term367727, 74, (byte) 19);
        setByteElement(term367727, 75, (byte) 20);
        setByteElement(term367727, 76, (byte) 21);
        setByteElement(term367727, 77, (byte) 22);
        setByteElement(term367727, 78, (byte) 23);
        setByteElement(term367727, 79, (byte) 24);
        setByteElement(term367727, 80, (byte) 25);
        setByteElement(term367727, 81, (byte) 26);
        setByteElement(term367727, 82, (byte) 27);
        setByteElement(term367727, 83, (byte) 28);
        setByteElement(term367727, 84, (byte) 29);
        setByteElement(term367727, 85, (byte) 30);
        setByteElement(term367727, 86, (byte) 31);
        setByteElement(term367727, 87, (byte) 32);
        setField(term367726, term367726.getClass(), "decodeTable", term367727);
        setIntField(term367726, term367726.getClass(), "encodeSize", 12);
        setByteElement(term367728, 0, (byte) 48);
        setByteElement(term367728, 1, (byte) 49);
        setByteElement(term367728, 2, (byte) 50);
        setByteElement(term367728, 3, (byte) 51);
        setByteElement(term367728, 4, (byte) 52);
        setByteElement(term367728, 5, (byte) 53);
        setByteElement(term367728, 6, (byte) 54);
        setByteElement(term367728, 7, (byte) 55);
        setByteElement(term367728, 8, (byte) 56);
        setByteElement(term367728, 9, (byte) 57);
        setByteElement(term367728, 10, (byte) 65);
        setByteElement(term367728, 11, (byte) 66);
        setByteElement(term367728, 12, (byte) 67);
        setByteElement(term367728, 13, (byte) 68);
        setByteElement(term367728, 14, (byte) 69);
        setByteElement(term367728, 15, (byte) 70);
        setByteElement(term367728, 16, (byte) 71);
        setByteElement(term367728, 17, (byte) 72);
        setByteElement(term367728, 18, (byte) 73);
        setByteElement(term367728, 19, (byte) 74);
        setByteElement(term367728, 20, (byte) 75);
        setByteElement(term367728, 21, (byte) 76);
        setByteElement(term367728, 22, (byte) 77);
        setByteElement(term367728, 23, (byte) 78);
        setByteElement(term367728, 24, (byte) 79);
        setByteElement(term367728, 25, (byte) 80);
        setByteElement(term367728, 26, (byte) 81);
        setByteElement(term367728, 27, (byte) 82);
        setByteElement(term367728, 28, (byte) 83);
        setByteElement(term367728, 29, (byte) 84);
        setByteElement(term367728, 30, (byte) 85);
        setByteElement(term367728, 31, (byte) 86);
        setField(term367726, term367726.getClass(), "encodeTable", term367728);
        setField(term367726, term367726.getClass(), "lineSeparator", term367729);
        setByteField(term367726, term367726.getClass(), "PAD", (byte) 61);
        setByteField(term367726, term367726.getClass(), "pad", (byte) 61);
        setIntField(term367726, term367726.getClass(), "unencodedBlockSize", 5);
        setIntField(term367726, term367726.getClass(), "encodedBlockSize", 8);
        setIntField(term367726, term367726.getClass(), "lineLength", 0);
        setIntField(term367726, term367726.getClass(), "chunkSeparatorLength", 4);
        term367730 = (byte[]) newByteArray(4);
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
        args[1] = term351356;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term367726));
        assertTrue(recursiveEquals(term351356, term367730));
    }

};


