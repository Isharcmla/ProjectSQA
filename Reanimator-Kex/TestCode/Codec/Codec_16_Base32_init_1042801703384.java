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

public class Base32_init_1042801703384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term782114;
     Object term788869;
     Object term788873;

    public Base32_init_1042801703384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term785328 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term785328, term785328.getClass(), "PAD", (byte) 0);
        setIntField(term785328, term785328.getClass(), "unencodedBlockSize", 0);
        setIntField(term785328, term785328.getClass(), "encodedBlockSize", 0);
        setIntField(term785328, term785328.getClass(), "lineLength", 0);
        setIntField(term785328, term785328.getClass(), "chunkSeparatorLength", 0);
        setByteField(term785328, term785328.getClass(), "pad", (byte) 0);
        setField(term785328, term785328.getClass(), "encodeTable", null);
        setField(term785328, term785328.getClass(), "decodeTable", null);
        setIntField(term785328, term785328.getClass(), "encodeSize", 0);
        setField(term785328, term785328.getClass(), "lineSeparator", null);
        setIntField(term785328, term785328.getClass(), "decodeSize", 0);
        term782114 = (byte[]) newByteArray(1);
        term788869 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term788870 = (byte[]) newByteArray(88);
        byte[] term788871 = (byte[]) newByteArray(32);
        byte[] term788872 = (byte[]) newByteArray(1);
        setIntField(term788869, term788869.getClass(), "decodeSize", 8);
        setByteElement(term788870, 0, (byte) -1);
        setByteElement(term788870, 1, (byte) -1);
        setByteElement(term788870, 2, (byte) -1);
        setByteElement(term788870, 3, (byte) -1);
        setByteElement(term788870, 4, (byte) -1);
        setByteElement(term788870, 5, (byte) -1);
        setByteElement(term788870, 6, (byte) -1);
        setByteElement(term788870, 7, (byte) -1);
        setByteElement(term788870, 8, (byte) -1);
        setByteElement(term788870, 9, (byte) -1);
        setByteElement(term788870, 10, (byte) -1);
        setByteElement(term788870, 11, (byte) -1);
        setByteElement(term788870, 12, (byte) -1);
        setByteElement(term788870, 13, (byte) -1);
        setByteElement(term788870, 14, (byte) -1);
        setByteElement(term788870, 15, (byte) -1);
        setByteElement(term788870, 16, (byte) -1);
        setByteElement(term788870, 17, (byte) -1);
        setByteElement(term788870, 18, (byte) -1);
        setByteElement(term788870, 19, (byte) -1);
        setByteElement(term788870, 20, (byte) -1);
        setByteElement(term788870, 21, (byte) -1);
        setByteElement(term788870, 22, (byte) -1);
        setByteElement(term788870, 23, (byte) -1);
        setByteElement(term788870, 24, (byte) -1);
        setByteElement(term788870, 25, (byte) -1);
        setByteElement(term788870, 26, (byte) -1);
        setByteElement(term788870, 27, (byte) -1);
        setByteElement(term788870, 28, (byte) -1);
        setByteElement(term788870, 29, (byte) -1);
        setByteElement(term788870, 30, (byte) -1);
        setByteElement(term788870, 31, (byte) -1);
        setByteElement(term788870, 32, (byte) -1);
        setByteElement(term788870, 33, (byte) -1);
        setByteElement(term788870, 34, (byte) -1);
        setByteElement(term788870, 35, (byte) -1);
        setByteElement(term788870, 36, (byte) -1);
        setByteElement(term788870, 37, (byte) -1);
        setByteElement(term788870, 38, (byte) -1);
        setByteElement(term788870, 39, (byte) -1);
        setByteElement(term788870, 40, (byte) -1);
        setByteElement(term788870, 41, (byte) -1);
        setByteElement(term788870, 42, (byte) -1);
        setByteElement(term788870, 43, (byte) -1);
        setByteElement(term788870, 44, (byte) -1);
        setByteElement(term788870, 45, (byte) -1);
        setByteElement(term788870, 46, (byte) -1);
        setByteElement(term788870, 47, (byte) -1);
        setByteElement(term788870, 49, (byte) 1);
        setByteElement(term788870, 50, (byte) 2);
        setByteElement(term788870, 51, (byte) 3);
        setByteElement(term788870, 52, (byte) 4);
        setByteElement(term788870, 53, (byte) 5);
        setByteElement(term788870, 54, (byte) 6);
        setByteElement(term788870, 55, (byte) 7);
        setByteElement(term788870, 56, (byte) 8);
        setByteElement(term788870, 57, (byte) 9);
        setByteElement(term788870, 58, (byte) -1);
        setByteElement(term788870, 59, (byte) -1);
        setByteElement(term788870, 60, (byte) -1);
        setByteElement(term788870, 61, (byte) -1);
        setByteElement(term788870, 62, (byte) -1);
        setByteElement(term788870, 63, (byte) -1);
        setByteElement(term788870, 64, (byte) -1);
        setByteElement(term788870, 65, (byte) 10);
        setByteElement(term788870, 66, (byte) 11);
        setByteElement(term788870, 67, (byte) 12);
        setByteElement(term788870, 68, (byte) 13);
        setByteElement(term788870, 69, (byte) 14);
        setByteElement(term788870, 70, (byte) 15);
        setByteElement(term788870, 71, (byte) 16);
        setByteElement(term788870, 72, (byte) 17);
        setByteElement(term788870, 73, (byte) 18);
        setByteElement(term788870, 74, (byte) 19);
        setByteElement(term788870, 75, (byte) 20);
        setByteElement(term788870, 76, (byte) 21);
        setByteElement(term788870, 77, (byte) 22);
        setByteElement(term788870, 78, (byte) 23);
        setByteElement(term788870, 79, (byte) 24);
        setByteElement(term788870, 80, (byte) 25);
        setByteElement(term788870, 81, (byte) 26);
        setByteElement(term788870, 82, (byte) 27);
        setByteElement(term788870, 83, (byte) 28);
        setByteElement(term788870, 84, (byte) 29);
        setByteElement(term788870, 85, (byte) 30);
        setByteElement(term788870, 86, (byte) 31);
        setByteElement(term788870, 87, (byte) 32);
        setField(term788869, term788869.getClass(), "decodeTable", term788870);
        setIntField(term788869, term788869.getClass(), "encodeSize", 9);
        setByteElement(term788871, 0, (byte) 48);
        setByteElement(term788871, 1, (byte) 49);
        setByteElement(term788871, 2, (byte) 50);
        setByteElement(term788871, 3, (byte) 51);
        setByteElement(term788871, 4, (byte) 52);
        setByteElement(term788871, 5, (byte) 53);
        setByteElement(term788871, 6, (byte) 54);
        setByteElement(term788871, 7, (byte) 55);
        setByteElement(term788871, 8, (byte) 56);
        setByteElement(term788871, 9, (byte) 57);
        setByteElement(term788871, 10, (byte) 65);
        setByteElement(term788871, 11, (byte) 66);
        setByteElement(term788871, 12, (byte) 67);
        setByteElement(term788871, 13, (byte) 68);
        setByteElement(term788871, 14, (byte) 69);
        setByteElement(term788871, 15, (byte) 70);
        setByteElement(term788871, 16, (byte) 71);
        setByteElement(term788871, 17, (byte) 72);
        setByteElement(term788871, 18, (byte) 73);
        setByteElement(term788871, 19, (byte) 74);
        setByteElement(term788871, 20, (byte) 75);
        setByteElement(term788871, 21, (byte) 76);
        setByteElement(term788871, 22, (byte) 77);
        setByteElement(term788871, 23, (byte) 78);
        setByteElement(term788871, 24, (byte) 79);
        setByteElement(term788871, 25, (byte) 80);
        setByteElement(term788871, 26, (byte) 81);
        setByteElement(term788871, 27, (byte) 82);
        setByteElement(term788871, 28, (byte) 83);
        setByteElement(term788871, 29, (byte) 84);
        setByteElement(term788871, 30, (byte) 85);
        setByteElement(term788871, 31, (byte) 86);
        setField(term788869, term788869.getClass(), "encodeTable", term788871);
        setField(term788869, term788869.getClass(), "lineSeparator", term788872);
        setByteField(term788869, term788869.getClass(), "PAD", (byte) 61);
        setByteField(term788869, term788869.getClass(), "pad", (byte) 61);
        setIntField(term788869, term788869.getClass(), "unencodedBlockSize", 5);
        setIntField(term788869, term788869.getClass(), "encodedBlockSize", 8);
        setIntField(term788869, term788869.getClass(), "lineLength", 0);
        setIntField(term788869, term788869.getClass(), "chunkSeparatorLength", 1);
        term788873 = (byte[]) newByteArray(1);
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
        args[1] = term782114;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term788869));
        assertTrue(recursiveEquals(term782114, term788873));
    }

};


