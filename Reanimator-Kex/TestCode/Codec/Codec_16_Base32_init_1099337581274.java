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

public class Base32_init_1099337581274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term508870;

    public Base32_init_1099337581274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term502862 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term502748 = (byte[]) newByteArray(0);
        setByteField(term502862, term502862.getClass(), "PAD", (byte) 0);
        setIntField(term502862, term502862.getClass(), "unencodedBlockSize", 0);
        setIntField(term502862, term502862.getClass(), "encodedBlockSize", 0);
        setIntField(term502862, term502862.getClass(), "lineLength", 0);
        setIntField(term502862, term502862.getClass(), "chunkSeparatorLength", 0);
        setByteField(term502862, term502862.getClass(), "pad", (byte) 0);
        setField(term502862, term502862.getClass(), "encodeTable", term502748);
        setField(term502862, term502862.getClass(), "decodeTable", term502748);
        setIntField(term502862, term502862.getClass(), "encodeSize", 0);
        setField(term502862, term502862.getClass(), "lineSeparator", term502748);
        setIntField(term502862, term502862.getClass(), "decodeSize", 0);
        term508870 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term508871 = (byte[]) newByteArray(91);
        byte[] term508872 = (byte[]) newByteArray(32);
        setIntField(term508870, term508870.getClass(), "decodeSize", 7);
        setByteElement(term508871, 0, (byte) -1);
        setByteElement(term508871, 1, (byte) -1);
        setByteElement(term508871, 2, (byte) -1);
        setByteElement(term508871, 3, (byte) -1);
        setByteElement(term508871, 4, (byte) -1);
        setByteElement(term508871, 5, (byte) -1);
        setByteElement(term508871, 6, (byte) -1);
        setByteElement(term508871, 7, (byte) -1);
        setByteElement(term508871, 8, (byte) -1);
        setByteElement(term508871, 9, (byte) -1);
        setByteElement(term508871, 10, (byte) -1);
        setByteElement(term508871, 11, (byte) -1);
        setByteElement(term508871, 12, (byte) -1);
        setByteElement(term508871, 13, (byte) -1);
        setByteElement(term508871, 14, (byte) -1);
        setByteElement(term508871, 15, (byte) -1);
        setByteElement(term508871, 16, (byte) -1);
        setByteElement(term508871, 17, (byte) -1);
        setByteElement(term508871, 18, (byte) -1);
        setByteElement(term508871, 19, (byte) -1);
        setByteElement(term508871, 20, (byte) -1);
        setByteElement(term508871, 21, (byte) -1);
        setByteElement(term508871, 22, (byte) -1);
        setByteElement(term508871, 23, (byte) -1);
        setByteElement(term508871, 24, (byte) -1);
        setByteElement(term508871, 25, (byte) -1);
        setByteElement(term508871, 26, (byte) -1);
        setByteElement(term508871, 27, (byte) -1);
        setByteElement(term508871, 28, (byte) -1);
        setByteElement(term508871, 29, (byte) -1);
        setByteElement(term508871, 30, (byte) -1);
        setByteElement(term508871, 31, (byte) -1);
        setByteElement(term508871, 32, (byte) -1);
        setByteElement(term508871, 33, (byte) -1);
        setByteElement(term508871, 34, (byte) -1);
        setByteElement(term508871, 35, (byte) -1);
        setByteElement(term508871, 36, (byte) -1);
        setByteElement(term508871, 37, (byte) -1);
        setByteElement(term508871, 38, (byte) -1);
        setByteElement(term508871, 39, (byte) -1);
        setByteElement(term508871, 40, (byte) -1);
        setByteElement(term508871, 41, (byte) -1);
        setByteElement(term508871, 42, (byte) -1);
        setByteElement(term508871, 43, (byte) -1);
        setByteElement(term508871, 44, (byte) -1);
        setByteElement(term508871, 45, (byte) -1);
        setByteElement(term508871, 46, (byte) -1);
        setByteElement(term508871, 47, (byte) -1);
        setByteElement(term508871, 48, (byte) -1);
        setByteElement(term508871, 49, (byte) -1);
        setByteElement(term508871, 50, (byte) 26);
        setByteElement(term508871, 51, (byte) 27);
        setByteElement(term508871, 52, (byte) 28);
        setByteElement(term508871, 53, (byte) 29);
        setByteElement(term508871, 54, (byte) 30);
        setByteElement(term508871, 55, (byte) 31);
        setByteElement(term508871, 56, (byte) -1);
        setByteElement(term508871, 57, (byte) -1);
        setByteElement(term508871, 58, (byte) -1);
        setByteElement(term508871, 59, (byte) -1);
        setByteElement(term508871, 60, (byte) -1);
        setByteElement(term508871, 61, (byte) -1);
        setByteElement(term508871, 62, (byte) -1);
        setByteElement(term508871, 63, (byte) -1);
        setByteElement(term508871, 64, (byte) -1);
        setByteElement(term508871, 66, (byte) 1);
        setByteElement(term508871, 67, (byte) 2);
        setByteElement(term508871, 68, (byte) 3);
        setByteElement(term508871, 69, (byte) 4);
        setByteElement(term508871, 70, (byte) 5);
        setByteElement(term508871, 71, (byte) 6);
        setByteElement(term508871, 72, (byte) 7);
        setByteElement(term508871, 73, (byte) 8);
        setByteElement(term508871, 74, (byte) 9);
        setByteElement(term508871, 75, (byte) 10);
        setByteElement(term508871, 76, (byte) 11);
        setByteElement(term508871, 77, (byte) 12);
        setByteElement(term508871, 78, (byte) 13);
        setByteElement(term508871, 79, (byte) 14);
        setByteElement(term508871, 80, (byte) 15);
        setByteElement(term508871, 81, (byte) 16);
        setByteElement(term508871, 82, (byte) 17);
        setByteElement(term508871, 83, (byte) 18);
        setByteElement(term508871, 84, (byte) 19);
        setByteElement(term508871, 85, (byte) 20);
        setByteElement(term508871, 86, (byte) 21);
        setByteElement(term508871, 87, (byte) 22);
        setByteElement(term508871, 88, (byte) 23);
        setByteElement(term508871, 89, (byte) 24);
        setByteElement(term508871, 90, (byte) 25);
        setField(term508870, term508870.getClass(), "decodeTable", term508871);
        setIntField(term508870, term508870.getClass(), "encodeSize", 8);
        setByteElement(term508872, 0, (byte) 65);
        setByteElement(term508872, 1, (byte) 66);
        setByteElement(term508872, 2, (byte) 67);
        setByteElement(term508872, 3, (byte) 68);
        setByteElement(term508872, 4, (byte) 69);
        setByteElement(term508872, 5, (byte) 70);
        setByteElement(term508872, 6, (byte) 71);
        setByteElement(term508872, 7, (byte) 72);
        setByteElement(term508872, 8, (byte) 73);
        setByteElement(term508872, 9, (byte) 74);
        setByteElement(term508872, 10, (byte) 75);
        setByteElement(term508872, 11, (byte) 76);
        setByteElement(term508872, 12, (byte) 77);
        setByteElement(term508872, 13, (byte) 78);
        setByteElement(term508872, 14, (byte) 79);
        setByteElement(term508872, 15, (byte) 80);
        setByteElement(term508872, 16, (byte) 81);
        setByteElement(term508872, 17, (byte) 82);
        setByteElement(term508872, 18, (byte) 83);
        setByteElement(term508872, 19, (byte) 84);
        setByteElement(term508872, 20, (byte) 85);
        setByteElement(term508872, 21, (byte) 86);
        setByteElement(term508872, 22, (byte) 87);
        setByteElement(term508872, 23, (byte) 88);
        setByteElement(term508872, 24, (byte) 89);
        setByteElement(term508872, 25, (byte) 90);
        setByteElement(term508872, 26, (byte) 50);
        setByteElement(term508872, 27, (byte) 51);
        setByteElement(term508872, 28, (byte) 52);
        setByteElement(term508872, 29, (byte) 53);
        setByteElement(term508872, 30, (byte) 54);
        setByteElement(term508872, 31, (byte) 55);
        setField(term508870, term508870.getClass(), "encodeTable", term508872);
        setField(term508870, term508870.getClass(), "lineSeparator", null);
        setByteField(term508870, term508870.getClass(), "PAD", (byte) 61);
        setByteField(term508870, term508870.getClass(), "pad", (byte) 126);
        setIntField(term508870, term508870.getClass(), "unencodedBlockSize", 5);
        setIntField(term508870, term508870.getClass(), "encodedBlockSize", 8);
        setIntField(term508870, term508870.getClass(), "lineLength", 0);
        setIntField(term508870, term508870.getClass(), "chunkSeparatorLength", 0);
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
        args[0] = 0;
        args[1] = null;
        args[2] = false;
        args[3] = (byte) 126;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term508870));
    }

};


