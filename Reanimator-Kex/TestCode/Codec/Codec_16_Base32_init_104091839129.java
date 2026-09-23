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

public class Base32_init_104091839129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10309;

    public Base32_init_104091839129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10158 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term10040 = (byte[]) newByteArray(0);
        byte[] term10042 = (byte[]) newByteArray(0);
        setByteField(term10158, term10158.getClass(), "PAD", (byte) 0);
        setIntField(term10158, term10158.getClass(), "unencodedBlockSize", 0);
        setIntField(term10158, term10158.getClass(), "encodedBlockSize", 0);
        setIntField(term10158, term10158.getClass(), "lineLength", 0);
        setIntField(term10158, term10158.getClass(), "chunkSeparatorLength", 0);
        setByteField(term10158, term10158.getClass(), "pad", (byte) 0);
        setField(term10158, term10158.getClass(), "encodeTable", term10040);
        setField(term10158, term10158.getClass(), "decodeTable", term10042);
        setIntField(term10158, term10158.getClass(), "encodeSize", 0);
        setField(term10158, term10158.getClass(), "lineSeparator", term10040);
        setIntField(term10158, term10158.getClass(), "decodeSize", 0);
        term10309 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term10310 = (byte[]) newByteArray(91);
        byte[] term10311 = (byte[]) newByteArray(32);
        setIntField(term10309, term10309.getClass(), "decodeSize", 7);
        setByteElement(term10310, 0, (byte) -1);
        setByteElement(term10310, 1, (byte) -1);
        setByteElement(term10310, 2, (byte) -1);
        setByteElement(term10310, 3, (byte) -1);
        setByteElement(term10310, 4, (byte) -1);
        setByteElement(term10310, 5, (byte) -1);
        setByteElement(term10310, 6, (byte) -1);
        setByteElement(term10310, 7, (byte) -1);
        setByteElement(term10310, 8, (byte) -1);
        setByteElement(term10310, 9, (byte) -1);
        setByteElement(term10310, 10, (byte) -1);
        setByteElement(term10310, 11, (byte) -1);
        setByteElement(term10310, 12, (byte) -1);
        setByteElement(term10310, 13, (byte) -1);
        setByteElement(term10310, 14, (byte) -1);
        setByteElement(term10310, 15, (byte) -1);
        setByteElement(term10310, 16, (byte) -1);
        setByteElement(term10310, 17, (byte) -1);
        setByteElement(term10310, 18, (byte) -1);
        setByteElement(term10310, 19, (byte) -1);
        setByteElement(term10310, 20, (byte) -1);
        setByteElement(term10310, 21, (byte) -1);
        setByteElement(term10310, 22, (byte) -1);
        setByteElement(term10310, 23, (byte) -1);
        setByteElement(term10310, 24, (byte) -1);
        setByteElement(term10310, 25, (byte) -1);
        setByteElement(term10310, 26, (byte) -1);
        setByteElement(term10310, 27, (byte) -1);
        setByteElement(term10310, 28, (byte) -1);
        setByteElement(term10310, 29, (byte) -1);
        setByteElement(term10310, 30, (byte) -1);
        setByteElement(term10310, 31, (byte) -1);
        setByteElement(term10310, 32, (byte) -1);
        setByteElement(term10310, 33, (byte) -1);
        setByteElement(term10310, 34, (byte) -1);
        setByteElement(term10310, 35, (byte) -1);
        setByteElement(term10310, 36, (byte) -1);
        setByteElement(term10310, 37, (byte) -1);
        setByteElement(term10310, 38, (byte) -1);
        setByteElement(term10310, 39, (byte) -1);
        setByteElement(term10310, 40, (byte) -1);
        setByteElement(term10310, 41, (byte) -1);
        setByteElement(term10310, 42, (byte) -1);
        setByteElement(term10310, 43, (byte) -1);
        setByteElement(term10310, 44, (byte) -1);
        setByteElement(term10310, 45, (byte) -1);
        setByteElement(term10310, 46, (byte) -1);
        setByteElement(term10310, 47, (byte) -1);
        setByteElement(term10310, 48, (byte) -1);
        setByteElement(term10310, 49, (byte) -1);
        setByteElement(term10310, 50, (byte) 26);
        setByteElement(term10310, 51, (byte) 27);
        setByteElement(term10310, 52, (byte) 28);
        setByteElement(term10310, 53, (byte) 29);
        setByteElement(term10310, 54, (byte) 30);
        setByteElement(term10310, 55, (byte) 31);
        setByteElement(term10310, 56, (byte) -1);
        setByteElement(term10310, 57, (byte) -1);
        setByteElement(term10310, 58, (byte) -1);
        setByteElement(term10310, 59, (byte) -1);
        setByteElement(term10310, 60, (byte) -1);
        setByteElement(term10310, 61, (byte) -1);
        setByteElement(term10310, 62, (byte) -1);
        setByteElement(term10310, 63, (byte) -1);
        setByteElement(term10310, 64, (byte) -1);
        setByteElement(term10310, 66, (byte) 1);
        setByteElement(term10310, 67, (byte) 2);
        setByteElement(term10310, 68, (byte) 3);
        setByteElement(term10310, 69, (byte) 4);
        setByteElement(term10310, 70, (byte) 5);
        setByteElement(term10310, 71, (byte) 6);
        setByteElement(term10310, 72, (byte) 7);
        setByteElement(term10310, 73, (byte) 8);
        setByteElement(term10310, 74, (byte) 9);
        setByteElement(term10310, 75, (byte) 10);
        setByteElement(term10310, 76, (byte) 11);
        setByteElement(term10310, 77, (byte) 12);
        setByteElement(term10310, 78, (byte) 13);
        setByteElement(term10310, 79, (byte) 14);
        setByteElement(term10310, 80, (byte) 15);
        setByteElement(term10310, 81, (byte) 16);
        setByteElement(term10310, 82, (byte) 17);
        setByteElement(term10310, 83, (byte) 18);
        setByteElement(term10310, 84, (byte) 19);
        setByteElement(term10310, 85, (byte) 20);
        setByteElement(term10310, 86, (byte) 21);
        setByteElement(term10310, 87, (byte) 22);
        setByteElement(term10310, 88, (byte) 23);
        setByteElement(term10310, 89, (byte) 24);
        setByteElement(term10310, 90, (byte) 25);
        setField(term10309, term10309.getClass(), "decodeTable", term10310);
        setIntField(term10309, term10309.getClass(), "encodeSize", 8);
        setByteElement(term10311, 0, (byte) 65);
        setByteElement(term10311, 1, (byte) 66);
        setByteElement(term10311, 2, (byte) 67);
        setByteElement(term10311, 3, (byte) 68);
        setByteElement(term10311, 4, (byte) 69);
        setByteElement(term10311, 5, (byte) 70);
        setByteElement(term10311, 6, (byte) 71);
        setByteElement(term10311, 7, (byte) 72);
        setByteElement(term10311, 8, (byte) 73);
        setByteElement(term10311, 9, (byte) 74);
        setByteElement(term10311, 10, (byte) 75);
        setByteElement(term10311, 11, (byte) 76);
        setByteElement(term10311, 12, (byte) 77);
        setByteElement(term10311, 13, (byte) 78);
        setByteElement(term10311, 14, (byte) 79);
        setByteElement(term10311, 15, (byte) 80);
        setByteElement(term10311, 16, (byte) 81);
        setByteElement(term10311, 17, (byte) 82);
        setByteElement(term10311, 18, (byte) 83);
        setByteElement(term10311, 19, (byte) 84);
        setByteElement(term10311, 20, (byte) 85);
        setByteElement(term10311, 21, (byte) 86);
        setByteElement(term10311, 22, (byte) 87);
        setByteElement(term10311, 23, (byte) 88);
        setByteElement(term10311, 24, (byte) 89);
        setByteElement(term10311, 25, (byte) 90);
        setByteElement(term10311, 26, (byte) 50);
        setByteElement(term10311, 27, (byte) 51);
        setByteElement(term10311, 28, (byte) 52);
        setByteElement(term10311, 29, (byte) 53);
        setByteElement(term10311, 30, (byte) 54);
        setByteElement(term10311, 31, (byte) 55);
        setField(term10309, term10309.getClass(), "encodeTable", term10311);
        setField(term10309, term10309.getClass(), "lineSeparator", null);
        setByteField(term10309, term10309.getClass(), "PAD", (byte) 61);
        setByteField(term10309, term10309.getClass(), "pad", (byte) 126);
        setIntField(term10309, term10309.getClass(), "unencodedBlockSize", 5);
        setIntField(term10309, term10309.getClass(), "encodedBlockSize", 8);
        setIntField(term10309, term10309.getClass(), "lineLength", 0);
        setIntField(term10309, term10309.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = (byte) 126;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10309));
    }

};


