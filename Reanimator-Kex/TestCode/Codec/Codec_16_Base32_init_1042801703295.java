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

public class Base32_init_1042801703295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term523978;

    public Base32_init_1042801703295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term523556 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term523443 = (byte[]) newByteArray(0);
        setByteField(term523556, term523556.getClass(), "PAD", (byte) 0);
        setIntField(term523556, term523556.getClass(), "unencodedBlockSize", 0);
        setIntField(term523556, term523556.getClass(), "encodedBlockSize", 0);
        setIntField(term523556, term523556.getClass(), "lineLength", 0);
        setIntField(term523556, term523556.getClass(), "chunkSeparatorLength", 0);
        setByteField(term523556, term523556.getClass(), "pad", (byte) 0);
        setField(term523556, term523556.getClass(), "encodeTable", null);
        setField(term523556, term523556.getClass(), "decodeTable", term523443);
        setIntField(term523556, term523556.getClass(), "encodeSize", 0);
        setField(term523556, term523556.getClass(), "lineSeparator", term523443);
        setIntField(term523556, term523556.getClass(), "decodeSize", 0);
        term523978 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term523979 = (byte[]) newByteArray(88);
        byte[] term523980 = (byte[]) newByteArray(32);
        setIntField(term523978, term523978.getClass(), "decodeSize", 7);
        setByteElement(term523979, 0, (byte) -1);
        setByteElement(term523979, 1, (byte) -1);
        setByteElement(term523979, 2, (byte) -1);
        setByteElement(term523979, 3, (byte) -1);
        setByteElement(term523979, 4, (byte) -1);
        setByteElement(term523979, 5, (byte) -1);
        setByteElement(term523979, 6, (byte) -1);
        setByteElement(term523979, 7, (byte) -1);
        setByteElement(term523979, 8, (byte) -1);
        setByteElement(term523979, 9, (byte) -1);
        setByteElement(term523979, 10, (byte) -1);
        setByteElement(term523979, 11, (byte) -1);
        setByteElement(term523979, 12, (byte) -1);
        setByteElement(term523979, 13, (byte) -1);
        setByteElement(term523979, 14, (byte) -1);
        setByteElement(term523979, 15, (byte) -1);
        setByteElement(term523979, 16, (byte) -1);
        setByteElement(term523979, 17, (byte) -1);
        setByteElement(term523979, 18, (byte) -1);
        setByteElement(term523979, 19, (byte) -1);
        setByteElement(term523979, 20, (byte) -1);
        setByteElement(term523979, 21, (byte) -1);
        setByteElement(term523979, 22, (byte) -1);
        setByteElement(term523979, 23, (byte) -1);
        setByteElement(term523979, 24, (byte) -1);
        setByteElement(term523979, 25, (byte) -1);
        setByteElement(term523979, 26, (byte) -1);
        setByteElement(term523979, 27, (byte) -1);
        setByteElement(term523979, 28, (byte) -1);
        setByteElement(term523979, 29, (byte) -1);
        setByteElement(term523979, 30, (byte) -1);
        setByteElement(term523979, 31, (byte) -1);
        setByteElement(term523979, 32, (byte) -1);
        setByteElement(term523979, 33, (byte) -1);
        setByteElement(term523979, 34, (byte) -1);
        setByteElement(term523979, 35, (byte) -1);
        setByteElement(term523979, 36, (byte) -1);
        setByteElement(term523979, 37, (byte) -1);
        setByteElement(term523979, 38, (byte) -1);
        setByteElement(term523979, 39, (byte) -1);
        setByteElement(term523979, 40, (byte) -1);
        setByteElement(term523979, 41, (byte) -1);
        setByteElement(term523979, 42, (byte) -1);
        setByteElement(term523979, 43, (byte) -1);
        setByteElement(term523979, 44, (byte) -1);
        setByteElement(term523979, 45, (byte) -1);
        setByteElement(term523979, 46, (byte) -1);
        setByteElement(term523979, 47, (byte) -1);
        setByteElement(term523979, 49, (byte) 1);
        setByteElement(term523979, 50, (byte) 2);
        setByteElement(term523979, 51, (byte) 3);
        setByteElement(term523979, 52, (byte) 4);
        setByteElement(term523979, 53, (byte) 5);
        setByteElement(term523979, 54, (byte) 6);
        setByteElement(term523979, 55, (byte) 7);
        setByteElement(term523979, 56, (byte) 8);
        setByteElement(term523979, 57, (byte) 9);
        setByteElement(term523979, 58, (byte) -1);
        setByteElement(term523979, 59, (byte) -1);
        setByteElement(term523979, 60, (byte) -1);
        setByteElement(term523979, 61, (byte) -1);
        setByteElement(term523979, 62, (byte) -1);
        setByteElement(term523979, 63, (byte) -1);
        setByteElement(term523979, 64, (byte) -1);
        setByteElement(term523979, 65, (byte) 10);
        setByteElement(term523979, 66, (byte) 11);
        setByteElement(term523979, 67, (byte) 12);
        setByteElement(term523979, 68, (byte) 13);
        setByteElement(term523979, 69, (byte) 14);
        setByteElement(term523979, 70, (byte) 15);
        setByteElement(term523979, 71, (byte) 16);
        setByteElement(term523979, 72, (byte) 17);
        setByteElement(term523979, 73, (byte) 18);
        setByteElement(term523979, 74, (byte) 19);
        setByteElement(term523979, 75, (byte) 20);
        setByteElement(term523979, 76, (byte) 21);
        setByteElement(term523979, 77, (byte) 22);
        setByteElement(term523979, 78, (byte) 23);
        setByteElement(term523979, 79, (byte) 24);
        setByteElement(term523979, 80, (byte) 25);
        setByteElement(term523979, 81, (byte) 26);
        setByteElement(term523979, 82, (byte) 27);
        setByteElement(term523979, 83, (byte) 28);
        setByteElement(term523979, 84, (byte) 29);
        setByteElement(term523979, 85, (byte) 30);
        setByteElement(term523979, 86, (byte) 31);
        setByteElement(term523979, 87, (byte) 32);
        setField(term523978, term523978.getClass(), "decodeTable", term523979);
        setIntField(term523978, term523978.getClass(), "encodeSize", 8);
        setByteElement(term523980, 0, (byte) 48);
        setByteElement(term523980, 1, (byte) 49);
        setByteElement(term523980, 2, (byte) 50);
        setByteElement(term523980, 3, (byte) 51);
        setByteElement(term523980, 4, (byte) 52);
        setByteElement(term523980, 5, (byte) 53);
        setByteElement(term523980, 6, (byte) 54);
        setByteElement(term523980, 7, (byte) 55);
        setByteElement(term523980, 8, (byte) 56);
        setByteElement(term523980, 9, (byte) 57);
        setByteElement(term523980, 10, (byte) 65);
        setByteElement(term523980, 11, (byte) 66);
        setByteElement(term523980, 12, (byte) 67);
        setByteElement(term523980, 13, (byte) 68);
        setByteElement(term523980, 14, (byte) 69);
        setByteElement(term523980, 15, (byte) 70);
        setByteElement(term523980, 16, (byte) 71);
        setByteElement(term523980, 17, (byte) 72);
        setByteElement(term523980, 18, (byte) 73);
        setByteElement(term523980, 19, (byte) 74);
        setByteElement(term523980, 20, (byte) 75);
        setByteElement(term523980, 21, (byte) 76);
        setByteElement(term523980, 22, (byte) 77);
        setByteElement(term523980, 23, (byte) 78);
        setByteElement(term523980, 24, (byte) 79);
        setByteElement(term523980, 25, (byte) 80);
        setByteElement(term523980, 26, (byte) 81);
        setByteElement(term523980, 27, (byte) 82);
        setByteElement(term523980, 28, (byte) 83);
        setByteElement(term523980, 29, (byte) 84);
        setByteElement(term523980, 30, (byte) 85);
        setByteElement(term523980, 31, (byte) 86);
        setField(term523978, term523978.getClass(), "encodeTable", term523980);
        setField(term523978, term523978.getClass(), "lineSeparator", null);
        setByteField(term523978, term523978.getClass(), "PAD", (byte) 61);
        setByteField(term523978, term523978.getClass(), "pad", (byte) 61);
        setIntField(term523978, term523978.getClass(), "unencodedBlockSize", 5);
        setIntField(term523978, term523978.getClass(), "encodedBlockSize", 8);
        setIntField(term523978, term523978.getClass(), "lineLength", 0);
        setIntField(term523978, term523978.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = null;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term523978));
    }

};


