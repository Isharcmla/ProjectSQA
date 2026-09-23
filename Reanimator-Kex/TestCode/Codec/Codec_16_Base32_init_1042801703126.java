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

public class Base32_init_1042801703126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179108;
     Object term185269;
     Object term185273;

    public Base32_init_1042801703126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term180717 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term179175 = (byte[]) newByteArray(0);
        setByteField(term180717, term180717.getClass(), "PAD", (byte) 0);
        setIntField(term180717, term180717.getClass(), "unencodedBlockSize", 0);
        setIntField(term180717, term180717.getClass(), "encodedBlockSize", 0);
        setIntField(term180717, term180717.getClass(), "lineLength", 0);
        setIntField(term180717, term180717.getClass(), "chunkSeparatorLength", 0);
        setByteField(term180717, term180717.getClass(), "pad", (byte) -128);
        setField(term180717, term180717.getClass(), "encodeTable", null);
        setField(term180717, term180717.getClass(), "decodeTable", term179175);
        setIntField(term180717, term180717.getClass(), "encodeSize", 0);
        setField(term180717, term180717.getClass(), "lineSeparator", null);
        setIntField(term180717, term180717.getClass(), "decodeSize", 0);
        term179108 = (byte[]) newByteArray(12);
        term185269 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term185270 = (byte[]) newByteArray(88);
        byte[] term185271 = (byte[]) newByteArray(32);
        byte[] term185272 = (byte[]) newByteArray(12);
        setIntField(term185269, term185269.getClass(), "decodeSize", 19);
        setByteElement(term185270, 0, (byte) -1);
        setByteElement(term185270, 1, (byte) -1);
        setByteElement(term185270, 2, (byte) -1);
        setByteElement(term185270, 3, (byte) -1);
        setByteElement(term185270, 4, (byte) -1);
        setByteElement(term185270, 5, (byte) -1);
        setByteElement(term185270, 6, (byte) -1);
        setByteElement(term185270, 7, (byte) -1);
        setByteElement(term185270, 8, (byte) -1);
        setByteElement(term185270, 9, (byte) -1);
        setByteElement(term185270, 10, (byte) -1);
        setByteElement(term185270, 11, (byte) -1);
        setByteElement(term185270, 12, (byte) -1);
        setByteElement(term185270, 13, (byte) -1);
        setByteElement(term185270, 14, (byte) -1);
        setByteElement(term185270, 15, (byte) -1);
        setByteElement(term185270, 16, (byte) -1);
        setByteElement(term185270, 17, (byte) -1);
        setByteElement(term185270, 18, (byte) -1);
        setByteElement(term185270, 19, (byte) -1);
        setByteElement(term185270, 20, (byte) -1);
        setByteElement(term185270, 21, (byte) -1);
        setByteElement(term185270, 22, (byte) -1);
        setByteElement(term185270, 23, (byte) -1);
        setByteElement(term185270, 24, (byte) -1);
        setByteElement(term185270, 25, (byte) -1);
        setByteElement(term185270, 26, (byte) -1);
        setByteElement(term185270, 27, (byte) -1);
        setByteElement(term185270, 28, (byte) -1);
        setByteElement(term185270, 29, (byte) -1);
        setByteElement(term185270, 30, (byte) -1);
        setByteElement(term185270, 31, (byte) -1);
        setByteElement(term185270, 32, (byte) -1);
        setByteElement(term185270, 33, (byte) -1);
        setByteElement(term185270, 34, (byte) -1);
        setByteElement(term185270, 35, (byte) -1);
        setByteElement(term185270, 36, (byte) -1);
        setByteElement(term185270, 37, (byte) -1);
        setByteElement(term185270, 38, (byte) -1);
        setByteElement(term185270, 39, (byte) -1);
        setByteElement(term185270, 40, (byte) -1);
        setByteElement(term185270, 41, (byte) -1);
        setByteElement(term185270, 42, (byte) -1);
        setByteElement(term185270, 43, (byte) -1);
        setByteElement(term185270, 44, (byte) -1);
        setByteElement(term185270, 45, (byte) -1);
        setByteElement(term185270, 46, (byte) -1);
        setByteElement(term185270, 47, (byte) -1);
        setByteElement(term185270, 49, (byte) 1);
        setByteElement(term185270, 50, (byte) 2);
        setByteElement(term185270, 51, (byte) 3);
        setByteElement(term185270, 52, (byte) 4);
        setByteElement(term185270, 53, (byte) 5);
        setByteElement(term185270, 54, (byte) 6);
        setByteElement(term185270, 55, (byte) 7);
        setByteElement(term185270, 56, (byte) 8);
        setByteElement(term185270, 57, (byte) 9);
        setByteElement(term185270, 58, (byte) -1);
        setByteElement(term185270, 59, (byte) -1);
        setByteElement(term185270, 60, (byte) -1);
        setByteElement(term185270, 61, (byte) -1);
        setByteElement(term185270, 62, (byte) -1);
        setByteElement(term185270, 63, (byte) -1);
        setByteElement(term185270, 64, (byte) -1);
        setByteElement(term185270, 65, (byte) 10);
        setByteElement(term185270, 66, (byte) 11);
        setByteElement(term185270, 67, (byte) 12);
        setByteElement(term185270, 68, (byte) 13);
        setByteElement(term185270, 69, (byte) 14);
        setByteElement(term185270, 70, (byte) 15);
        setByteElement(term185270, 71, (byte) 16);
        setByteElement(term185270, 72, (byte) 17);
        setByteElement(term185270, 73, (byte) 18);
        setByteElement(term185270, 74, (byte) 19);
        setByteElement(term185270, 75, (byte) 20);
        setByteElement(term185270, 76, (byte) 21);
        setByteElement(term185270, 77, (byte) 22);
        setByteElement(term185270, 78, (byte) 23);
        setByteElement(term185270, 79, (byte) 24);
        setByteElement(term185270, 80, (byte) 25);
        setByteElement(term185270, 81, (byte) 26);
        setByteElement(term185270, 82, (byte) 27);
        setByteElement(term185270, 83, (byte) 28);
        setByteElement(term185270, 84, (byte) 29);
        setByteElement(term185270, 85, (byte) 30);
        setByteElement(term185270, 86, (byte) 31);
        setByteElement(term185270, 87, (byte) 32);
        setField(term185269, term185269.getClass(), "decodeTable", term185270);
        setIntField(term185269, term185269.getClass(), "encodeSize", 20);
        setByteElement(term185271, 0, (byte) 48);
        setByteElement(term185271, 1, (byte) 49);
        setByteElement(term185271, 2, (byte) 50);
        setByteElement(term185271, 3, (byte) 51);
        setByteElement(term185271, 4, (byte) 52);
        setByteElement(term185271, 5, (byte) 53);
        setByteElement(term185271, 6, (byte) 54);
        setByteElement(term185271, 7, (byte) 55);
        setByteElement(term185271, 8, (byte) 56);
        setByteElement(term185271, 9, (byte) 57);
        setByteElement(term185271, 10, (byte) 65);
        setByteElement(term185271, 11, (byte) 66);
        setByteElement(term185271, 12, (byte) 67);
        setByteElement(term185271, 13, (byte) 68);
        setByteElement(term185271, 14, (byte) 69);
        setByteElement(term185271, 15, (byte) 70);
        setByteElement(term185271, 16, (byte) 71);
        setByteElement(term185271, 17, (byte) 72);
        setByteElement(term185271, 18, (byte) 73);
        setByteElement(term185271, 19, (byte) 74);
        setByteElement(term185271, 20, (byte) 75);
        setByteElement(term185271, 21, (byte) 76);
        setByteElement(term185271, 22, (byte) 77);
        setByteElement(term185271, 23, (byte) 78);
        setByteElement(term185271, 24, (byte) 79);
        setByteElement(term185271, 25, (byte) 80);
        setByteElement(term185271, 26, (byte) 81);
        setByteElement(term185271, 27, (byte) 82);
        setByteElement(term185271, 28, (byte) 83);
        setByteElement(term185271, 29, (byte) 84);
        setByteElement(term185271, 30, (byte) 85);
        setByteElement(term185271, 31, (byte) 86);
        setField(term185269, term185269.getClass(), "encodeTable", term185271);
        setField(term185269, term185269.getClass(), "lineSeparator", term185272);
        setByteField(term185269, term185269.getClass(), "PAD", (byte) 61);
        setByteField(term185269, term185269.getClass(), "pad", (byte) 61);
        setIntField(term185269, term185269.getClass(), "unencodedBlockSize", 5);
        setIntField(term185269, term185269.getClass(), "encodedBlockSize", 8);
        setIntField(term185269, term185269.getClass(), "lineLength", 0);
        setIntField(term185269, term185269.getClass(), "chunkSeparatorLength", 12);
        term185273 = (byte[]) newByteArray(12);
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
        args[1] = term179108;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term185269));
        assertTrue(recursiveEquals(term179108, term185273));
    }

};


