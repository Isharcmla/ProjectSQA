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

public class Base32_init_1040918143151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259950;

    public Base32_init_1040918143151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term259797 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term259683 = (byte[]) newByteArray(0);
        byte[] term259684 = (byte[]) newByteArray(0);
        byte[] term259682 = (byte[]) newByteArray(0);
        setByteField(term259797, term259797.getClass(), "PAD", (byte) 0);
        setIntField(term259797, term259797.getClass(), "unencodedBlockSize", 0);
        setIntField(term259797, term259797.getClass(), "encodedBlockSize", 0);
        setIntField(term259797, term259797.getClass(), "lineLength", 0);
        setIntField(term259797, term259797.getClass(), "chunkSeparatorLength", 0);
        setByteField(term259797, term259797.getClass(), "pad", (byte) 0);
        setField(term259797, term259797.getClass(), "encodeTable", term259683);
        setField(term259797, term259797.getClass(), "decodeTable", term259684);
        setIntField(term259797, term259797.getClass(), "encodeSize", 0);
        setField(term259797, term259797.getClass(), "lineSeparator", term259682);
        setIntField(term259797, term259797.getClass(), "decodeSize", 0);
        term259950 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term259951 = (byte[]) newByteArray(91);
        byte[] term259952 = (byte[]) newByteArray(32);
        setIntField(term259950, term259950.getClass(), "decodeSize", 7);
        setByteElement(term259951, 0, (byte) -1);
        setByteElement(term259951, 1, (byte) -1);
        setByteElement(term259951, 2, (byte) -1);
        setByteElement(term259951, 3, (byte) -1);
        setByteElement(term259951, 4, (byte) -1);
        setByteElement(term259951, 5, (byte) -1);
        setByteElement(term259951, 6, (byte) -1);
        setByteElement(term259951, 7, (byte) -1);
        setByteElement(term259951, 8, (byte) -1);
        setByteElement(term259951, 9, (byte) -1);
        setByteElement(term259951, 10, (byte) -1);
        setByteElement(term259951, 11, (byte) -1);
        setByteElement(term259951, 12, (byte) -1);
        setByteElement(term259951, 13, (byte) -1);
        setByteElement(term259951, 14, (byte) -1);
        setByteElement(term259951, 15, (byte) -1);
        setByteElement(term259951, 16, (byte) -1);
        setByteElement(term259951, 17, (byte) -1);
        setByteElement(term259951, 18, (byte) -1);
        setByteElement(term259951, 19, (byte) -1);
        setByteElement(term259951, 20, (byte) -1);
        setByteElement(term259951, 21, (byte) -1);
        setByteElement(term259951, 22, (byte) -1);
        setByteElement(term259951, 23, (byte) -1);
        setByteElement(term259951, 24, (byte) -1);
        setByteElement(term259951, 25, (byte) -1);
        setByteElement(term259951, 26, (byte) -1);
        setByteElement(term259951, 27, (byte) -1);
        setByteElement(term259951, 28, (byte) -1);
        setByteElement(term259951, 29, (byte) -1);
        setByteElement(term259951, 30, (byte) -1);
        setByteElement(term259951, 31, (byte) -1);
        setByteElement(term259951, 32, (byte) -1);
        setByteElement(term259951, 33, (byte) -1);
        setByteElement(term259951, 34, (byte) -1);
        setByteElement(term259951, 35, (byte) -1);
        setByteElement(term259951, 36, (byte) -1);
        setByteElement(term259951, 37, (byte) -1);
        setByteElement(term259951, 38, (byte) -1);
        setByteElement(term259951, 39, (byte) -1);
        setByteElement(term259951, 40, (byte) -1);
        setByteElement(term259951, 41, (byte) -1);
        setByteElement(term259951, 42, (byte) -1);
        setByteElement(term259951, 43, (byte) -1);
        setByteElement(term259951, 44, (byte) -1);
        setByteElement(term259951, 45, (byte) -1);
        setByteElement(term259951, 46, (byte) -1);
        setByteElement(term259951, 47, (byte) -1);
        setByteElement(term259951, 48, (byte) -1);
        setByteElement(term259951, 49, (byte) -1);
        setByteElement(term259951, 50, (byte) 26);
        setByteElement(term259951, 51, (byte) 27);
        setByteElement(term259951, 52, (byte) 28);
        setByteElement(term259951, 53, (byte) 29);
        setByteElement(term259951, 54, (byte) 30);
        setByteElement(term259951, 55, (byte) 31);
        setByteElement(term259951, 56, (byte) -1);
        setByteElement(term259951, 57, (byte) -1);
        setByteElement(term259951, 58, (byte) -1);
        setByteElement(term259951, 59, (byte) -1);
        setByteElement(term259951, 60, (byte) -1);
        setByteElement(term259951, 61, (byte) -1);
        setByteElement(term259951, 62, (byte) -1);
        setByteElement(term259951, 63, (byte) -1);
        setByteElement(term259951, 64, (byte) -1);
        setByteElement(term259951, 66, (byte) 1);
        setByteElement(term259951, 67, (byte) 2);
        setByteElement(term259951, 68, (byte) 3);
        setByteElement(term259951, 69, (byte) 4);
        setByteElement(term259951, 70, (byte) 5);
        setByteElement(term259951, 71, (byte) 6);
        setByteElement(term259951, 72, (byte) 7);
        setByteElement(term259951, 73, (byte) 8);
        setByteElement(term259951, 74, (byte) 9);
        setByteElement(term259951, 75, (byte) 10);
        setByteElement(term259951, 76, (byte) 11);
        setByteElement(term259951, 77, (byte) 12);
        setByteElement(term259951, 78, (byte) 13);
        setByteElement(term259951, 79, (byte) 14);
        setByteElement(term259951, 80, (byte) 15);
        setByteElement(term259951, 81, (byte) 16);
        setByteElement(term259951, 82, (byte) 17);
        setByteElement(term259951, 83, (byte) 18);
        setByteElement(term259951, 84, (byte) 19);
        setByteElement(term259951, 85, (byte) 20);
        setByteElement(term259951, 86, (byte) 21);
        setByteElement(term259951, 87, (byte) 22);
        setByteElement(term259951, 88, (byte) 23);
        setByteElement(term259951, 89, (byte) 24);
        setByteElement(term259951, 90, (byte) 25);
        setField(term259950, term259950.getClass(), "decodeTable", term259951);
        setIntField(term259950, term259950.getClass(), "encodeSize", 8);
        setByteElement(term259952, 0, (byte) 65);
        setByteElement(term259952, 1, (byte) 66);
        setByteElement(term259952, 2, (byte) 67);
        setByteElement(term259952, 3, (byte) 68);
        setByteElement(term259952, 4, (byte) 69);
        setByteElement(term259952, 5, (byte) 70);
        setByteElement(term259952, 6, (byte) 71);
        setByteElement(term259952, 7, (byte) 72);
        setByteElement(term259952, 8, (byte) 73);
        setByteElement(term259952, 9, (byte) 74);
        setByteElement(term259952, 10, (byte) 75);
        setByteElement(term259952, 11, (byte) 76);
        setByteElement(term259952, 12, (byte) 77);
        setByteElement(term259952, 13, (byte) 78);
        setByteElement(term259952, 14, (byte) 79);
        setByteElement(term259952, 15, (byte) 80);
        setByteElement(term259952, 16, (byte) 81);
        setByteElement(term259952, 17, (byte) 82);
        setByteElement(term259952, 18, (byte) 83);
        setByteElement(term259952, 19, (byte) 84);
        setByteElement(term259952, 20, (byte) 85);
        setByteElement(term259952, 21, (byte) 86);
        setByteElement(term259952, 22, (byte) 87);
        setByteElement(term259952, 23, (byte) 88);
        setByteElement(term259952, 24, (byte) 89);
        setByteElement(term259952, 25, (byte) 90);
        setByteElement(term259952, 26, (byte) 50);
        setByteElement(term259952, 27, (byte) 51);
        setByteElement(term259952, 28, (byte) 52);
        setByteElement(term259952, 29, (byte) 53);
        setByteElement(term259952, 30, (byte) 54);
        setByteElement(term259952, 31, (byte) 55);
        setField(term259950, term259950.getClass(), "encodeTable", term259952);
        setField(term259950, term259950.getClass(), "lineSeparator", null);
        setByteField(term259950, term259950.getClass(), "PAD", (byte) 61);
        setByteField(term259950, term259950.getClass(), "pad", (byte) 61);
        setIntField(term259950, term259950.getClass(), "unencodedBlockSize", 5);
        setIntField(term259950, term259950.getClass(), "encodedBlockSize", 8);
        setIntField(term259950, term259950.getClass(), "lineLength", 0);
        setIntField(term259950, term259950.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term259950));
    }

};


