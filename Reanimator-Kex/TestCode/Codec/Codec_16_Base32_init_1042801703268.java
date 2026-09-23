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

public class Base32_init_1042801703268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490407;
     Object term497326;
     Object term497330;

    public Base32_init_1042801703268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term491131 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term490952 = (byte[]) newByteArray(0);
        setByteField(term491131, term491131.getClass(), "PAD", (byte) 0);
        setIntField(term491131, term491131.getClass(), "unencodedBlockSize", 0);
        setIntField(term491131, term491131.getClass(), "encodedBlockSize", 0);
        setIntField(term491131, term491131.getClass(), "lineLength", 0);
        setIntField(term491131, term491131.getClass(), "chunkSeparatorLength", 0);
        setByteField(term491131, term491131.getClass(), "pad", (byte) 0);
        setField(term491131, term491131.getClass(), "encodeTable", null);
        setField(term491131, term491131.getClass(), "decodeTable", term490952);
        setIntField(term491131, term491131.getClass(), "encodeSize", 0);
        setField(term491131, term491131.getClass(), "lineSeparator", null);
        setIntField(term491131, term491131.getClass(), "decodeSize", 0);
        term490407 = (byte[]) newByteArray(0);
        term497326 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term497327 = (byte[]) newByteArray(88);
        byte[] term497328 = (byte[]) newByteArray(32);
        byte[] term497329 = (byte[]) newByteArray(0);
        setIntField(term497326, term497326.getClass(), "decodeSize", 7);
        setByteElement(term497327, 0, (byte) -1);
        setByteElement(term497327, 1, (byte) -1);
        setByteElement(term497327, 2, (byte) -1);
        setByteElement(term497327, 3, (byte) -1);
        setByteElement(term497327, 4, (byte) -1);
        setByteElement(term497327, 5, (byte) -1);
        setByteElement(term497327, 6, (byte) -1);
        setByteElement(term497327, 7, (byte) -1);
        setByteElement(term497327, 8, (byte) -1);
        setByteElement(term497327, 9, (byte) -1);
        setByteElement(term497327, 10, (byte) -1);
        setByteElement(term497327, 11, (byte) -1);
        setByteElement(term497327, 12, (byte) -1);
        setByteElement(term497327, 13, (byte) -1);
        setByteElement(term497327, 14, (byte) -1);
        setByteElement(term497327, 15, (byte) -1);
        setByteElement(term497327, 16, (byte) -1);
        setByteElement(term497327, 17, (byte) -1);
        setByteElement(term497327, 18, (byte) -1);
        setByteElement(term497327, 19, (byte) -1);
        setByteElement(term497327, 20, (byte) -1);
        setByteElement(term497327, 21, (byte) -1);
        setByteElement(term497327, 22, (byte) -1);
        setByteElement(term497327, 23, (byte) -1);
        setByteElement(term497327, 24, (byte) -1);
        setByteElement(term497327, 25, (byte) -1);
        setByteElement(term497327, 26, (byte) -1);
        setByteElement(term497327, 27, (byte) -1);
        setByteElement(term497327, 28, (byte) -1);
        setByteElement(term497327, 29, (byte) -1);
        setByteElement(term497327, 30, (byte) -1);
        setByteElement(term497327, 31, (byte) -1);
        setByteElement(term497327, 32, (byte) -1);
        setByteElement(term497327, 33, (byte) -1);
        setByteElement(term497327, 34, (byte) -1);
        setByteElement(term497327, 35, (byte) -1);
        setByteElement(term497327, 36, (byte) -1);
        setByteElement(term497327, 37, (byte) -1);
        setByteElement(term497327, 38, (byte) -1);
        setByteElement(term497327, 39, (byte) -1);
        setByteElement(term497327, 40, (byte) -1);
        setByteElement(term497327, 41, (byte) -1);
        setByteElement(term497327, 42, (byte) -1);
        setByteElement(term497327, 43, (byte) -1);
        setByteElement(term497327, 44, (byte) -1);
        setByteElement(term497327, 45, (byte) -1);
        setByteElement(term497327, 46, (byte) -1);
        setByteElement(term497327, 47, (byte) -1);
        setByteElement(term497327, 49, (byte) 1);
        setByteElement(term497327, 50, (byte) 2);
        setByteElement(term497327, 51, (byte) 3);
        setByteElement(term497327, 52, (byte) 4);
        setByteElement(term497327, 53, (byte) 5);
        setByteElement(term497327, 54, (byte) 6);
        setByteElement(term497327, 55, (byte) 7);
        setByteElement(term497327, 56, (byte) 8);
        setByteElement(term497327, 57, (byte) 9);
        setByteElement(term497327, 58, (byte) -1);
        setByteElement(term497327, 59, (byte) -1);
        setByteElement(term497327, 60, (byte) -1);
        setByteElement(term497327, 61, (byte) -1);
        setByteElement(term497327, 62, (byte) -1);
        setByteElement(term497327, 63, (byte) -1);
        setByteElement(term497327, 64, (byte) -1);
        setByteElement(term497327, 65, (byte) 10);
        setByteElement(term497327, 66, (byte) 11);
        setByteElement(term497327, 67, (byte) 12);
        setByteElement(term497327, 68, (byte) 13);
        setByteElement(term497327, 69, (byte) 14);
        setByteElement(term497327, 70, (byte) 15);
        setByteElement(term497327, 71, (byte) 16);
        setByteElement(term497327, 72, (byte) 17);
        setByteElement(term497327, 73, (byte) 18);
        setByteElement(term497327, 74, (byte) 19);
        setByteElement(term497327, 75, (byte) 20);
        setByteElement(term497327, 76, (byte) 21);
        setByteElement(term497327, 77, (byte) 22);
        setByteElement(term497327, 78, (byte) 23);
        setByteElement(term497327, 79, (byte) 24);
        setByteElement(term497327, 80, (byte) 25);
        setByteElement(term497327, 81, (byte) 26);
        setByteElement(term497327, 82, (byte) 27);
        setByteElement(term497327, 83, (byte) 28);
        setByteElement(term497327, 84, (byte) 29);
        setByteElement(term497327, 85, (byte) 30);
        setByteElement(term497327, 86, (byte) 31);
        setByteElement(term497327, 87, (byte) 32);
        setField(term497326, term497326.getClass(), "decodeTable", term497327);
        setIntField(term497326, term497326.getClass(), "encodeSize", 8);
        setByteElement(term497328, 0, (byte) 48);
        setByteElement(term497328, 1, (byte) 49);
        setByteElement(term497328, 2, (byte) 50);
        setByteElement(term497328, 3, (byte) 51);
        setByteElement(term497328, 4, (byte) 52);
        setByteElement(term497328, 5, (byte) 53);
        setByteElement(term497328, 6, (byte) 54);
        setByteElement(term497328, 7, (byte) 55);
        setByteElement(term497328, 8, (byte) 56);
        setByteElement(term497328, 9, (byte) 57);
        setByteElement(term497328, 10, (byte) 65);
        setByteElement(term497328, 11, (byte) 66);
        setByteElement(term497328, 12, (byte) 67);
        setByteElement(term497328, 13, (byte) 68);
        setByteElement(term497328, 14, (byte) 69);
        setByteElement(term497328, 15, (byte) 70);
        setByteElement(term497328, 16, (byte) 71);
        setByteElement(term497328, 17, (byte) 72);
        setByteElement(term497328, 18, (byte) 73);
        setByteElement(term497328, 19, (byte) 74);
        setByteElement(term497328, 20, (byte) 75);
        setByteElement(term497328, 21, (byte) 76);
        setByteElement(term497328, 22, (byte) 77);
        setByteElement(term497328, 23, (byte) 78);
        setByteElement(term497328, 24, (byte) 79);
        setByteElement(term497328, 25, (byte) 80);
        setByteElement(term497328, 26, (byte) 81);
        setByteElement(term497328, 27, (byte) 82);
        setByteElement(term497328, 28, (byte) 83);
        setByteElement(term497328, 29, (byte) 84);
        setByteElement(term497328, 30, (byte) 85);
        setByteElement(term497328, 31, (byte) 86);
        setField(term497326, term497326.getClass(), "encodeTable", term497328);
        setField(term497326, term497326.getClass(), "lineSeparator", term497329);
        setByteField(term497326, term497326.getClass(), "PAD", (byte) 61);
        setByteField(term497326, term497326.getClass(), "pad", (byte) 61);
        setIntField(term497326, term497326.getClass(), "unencodedBlockSize", 5);
        setIntField(term497326, term497326.getClass(), "encodedBlockSize", 8);
        setIntField(term497326, term497326.getClass(), "lineLength", 0);
        setIntField(term497326, term497326.getClass(), "chunkSeparatorLength", 0);
        term497330 = (byte[]) newByteArray(0);
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
        args[1] = term490407;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term497326));
        assertTrue(recursiveEquals(term490407, term497330));
    }

};


