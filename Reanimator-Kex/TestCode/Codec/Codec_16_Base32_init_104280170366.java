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

public class Base32_init_104280170366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45509;
     Object term46015;
     Object term46019;

    public Base32_init_104280170366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45632 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term45632, term45632.getClass(), "PAD", (byte) 0);
        setIntField(term45632, term45632.getClass(), "unencodedBlockSize", 0);
        setIntField(term45632, term45632.getClass(), "encodedBlockSize", 0);
        setIntField(term45632, term45632.getClass(), "lineLength", 0);
        setIntField(term45632, term45632.getClass(), "chunkSeparatorLength", 0);
        setByteField(term45632, term45632.getClass(), "pad", (byte) 0);
        term45509 = (byte[]) newByteArray(12);
        term46015 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term46016 = (byte[]) newByteArray(88);
        byte[] term46017 = (byte[]) newByteArray(32);
        byte[] term46018 = (byte[]) newByteArray(12);
        setIntField(term46015, term46015.getClass(), "decodeSize", 19);
        setByteElement(term46016, 0, (byte) -1);
        setByteElement(term46016, 1, (byte) -1);
        setByteElement(term46016, 2, (byte) -1);
        setByteElement(term46016, 3, (byte) -1);
        setByteElement(term46016, 4, (byte) -1);
        setByteElement(term46016, 5, (byte) -1);
        setByteElement(term46016, 6, (byte) -1);
        setByteElement(term46016, 7, (byte) -1);
        setByteElement(term46016, 8, (byte) -1);
        setByteElement(term46016, 9, (byte) -1);
        setByteElement(term46016, 10, (byte) -1);
        setByteElement(term46016, 11, (byte) -1);
        setByteElement(term46016, 12, (byte) -1);
        setByteElement(term46016, 13, (byte) -1);
        setByteElement(term46016, 14, (byte) -1);
        setByteElement(term46016, 15, (byte) -1);
        setByteElement(term46016, 16, (byte) -1);
        setByteElement(term46016, 17, (byte) -1);
        setByteElement(term46016, 18, (byte) -1);
        setByteElement(term46016, 19, (byte) -1);
        setByteElement(term46016, 20, (byte) -1);
        setByteElement(term46016, 21, (byte) -1);
        setByteElement(term46016, 22, (byte) -1);
        setByteElement(term46016, 23, (byte) -1);
        setByteElement(term46016, 24, (byte) -1);
        setByteElement(term46016, 25, (byte) -1);
        setByteElement(term46016, 26, (byte) -1);
        setByteElement(term46016, 27, (byte) -1);
        setByteElement(term46016, 28, (byte) -1);
        setByteElement(term46016, 29, (byte) -1);
        setByteElement(term46016, 30, (byte) -1);
        setByteElement(term46016, 31, (byte) -1);
        setByteElement(term46016, 32, (byte) -1);
        setByteElement(term46016, 33, (byte) -1);
        setByteElement(term46016, 34, (byte) -1);
        setByteElement(term46016, 35, (byte) -1);
        setByteElement(term46016, 36, (byte) -1);
        setByteElement(term46016, 37, (byte) -1);
        setByteElement(term46016, 38, (byte) -1);
        setByteElement(term46016, 39, (byte) -1);
        setByteElement(term46016, 40, (byte) -1);
        setByteElement(term46016, 41, (byte) -1);
        setByteElement(term46016, 42, (byte) -1);
        setByteElement(term46016, 43, (byte) -1);
        setByteElement(term46016, 44, (byte) -1);
        setByteElement(term46016, 45, (byte) -1);
        setByteElement(term46016, 46, (byte) -1);
        setByteElement(term46016, 47, (byte) -1);
        setByteElement(term46016, 49, (byte) 1);
        setByteElement(term46016, 50, (byte) 2);
        setByteElement(term46016, 51, (byte) 3);
        setByteElement(term46016, 52, (byte) 4);
        setByteElement(term46016, 53, (byte) 5);
        setByteElement(term46016, 54, (byte) 6);
        setByteElement(term46016, 55, (byte) 7);
        setByteElement(term46016, 56, (byte) 8);
        setByteElement(term46016, 57, (byte) 9);
        setByteElement(term46016, 58, (byte) -1);
        setByteElement(term46016, 59, (byte) -1);
        setByteElement(term46016, 60, (byte) -1);
        setByteElement(term46016, 61, (byte) -1);
        setByteElement(term46016, 62, (byte) -1);
        setByteElement(term46016, 63, (byte) -1);
        setByteElement(term46016, 64, (byte) -1);
        setByteElement(term46016, 65, (byte) 10);
        setByteElement(term46016, 66, (byte) 11);
        setByteElement(term46016, 67, (byte) 12);
        setByteElement(term46016, 68, (byte) 13);
        setByteElement(term46016, 69, (byte) 14);
        setByteElement(term46016, 70, (byte) 15);
        setByteElement(term46016, 71, (byte) 16);
        setByteElement(term46016, 72, (byte) 17);
        setByteElement(term46016, 73, (byte) 18);
        setByteElement(term46016, 74, (byte) 19);
        setByteElement(term46016, 75, (byte) 20);
        setByteElement(term46016, 76, (byte) 21);
        setByteElement(term46016, 77, (byte) 22);
        setByteElement(term46016, 78, (byte) 23);
        setByteElement(term46016, 79, (byte) 24);
        setByteElement(term46016, 80, (byte) 25);
        setByteElement(term46016, 81, (byte) 26);
        setByteElement(term46016, 82, (byte) 27);
        setByteElement(term46016, 83, (byte) 28);
        setByteElement(term46016, 84, (byte) 29);
        setByteElement(term46016, 85, (byte) 30);
        setByteElement(term46016, 86, (byte) 31);
        setByteElement(term46016, 87, (byte) 32);
        setField(term46015, term46015.getClass(), "decodeTable", term46016);
        setIntField(term46015, term46015.getClass(), "encodeSize", 20);
        setByteElement(term46017, 0, (byte) 48);
        setByteElement(term46017, 1, (byte) 49);
        setByteElement(term46017, 2, (byte) 50);
        setByteElement(term46017, 3, (byte) 51);
        setByteElement(term46017, 4, (byte) 52);
        setByteElement(term46017, 5, (byte) 53);
        setByteElement(term46017, 6, (byte) 54);
        setByteElement(term46017, 7, (byte) 55);
        setByteElement(term46017, 8, (byte) 56);
        setByteElement(term46017, 9, (byte) 57);
        setByteElement(term46017, 10, (byte) 65);
        setByteElement(term46017, 11, (byte) 66);
        setByteElement(term46017, 12, (byte) 67);
        setByteElement(term46017, 13, (byte) 68);
        setByteElement(term46017, 14, (byte) 69);
        setByteElement(term46017, 15, (byte) 70);
        setByteElement(term46017, 16, (byte) 71);
        setByteElement(term46017, 17, (byte) 72);
        setByteElement(term46017, 18, (byte) 73);
        setByteElement(term46017, 19, (byte) 74);
        setByteElement(term46017, 20, (byte) 75);
        setByteElement(term46017, 21, (byte) 76);
        setByteElement(term46017, 22, (byte) 77);
        setByteElement(term46017, 23, (byte) 78);
        setByteElement(term46017, 24, (byte) 79);
        setByteElement(term46017, 25, (byte) 80);
        setByteElement(term46017, 26, (byte) 81);
        setByteElement(term46017, 27, (byte) 82);
        setByteElement(term46017, 28, (byte) 83);
        setByteElement(term46017, 29, (byte) 84);
        setByteElement(term46017, 30, (byte) 85);
        setByteElement(term46017, 31, (byte) 86);
        setField(term46015, term46015.getClass(), "encodeTable", term46017);
        setField(term46015, term46015.getClass(), "lineSeparator", term46018);
        setByteField(term46015, term46015.getClass(), "PAD", (byte) 61);
        setByteField(term46015, term46015.getClass(), "pad", (byte) 61);
        setIntField(term46015, term46015.getClass(), "unencodedBlockSize", 5);
        setIntField(term46015, term46015.getClass(), "encodedBlockSize", 8);
        setIntField(term46015, term46015.getClass(), "lineLength", 0);
        setIntField(term46015, term46015.getClass(), "chunkSeparatorLength", 12);
        term46019 = (byte[]) newByteArray(12);
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
        args[1] = term45509;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term46015));
        assertTrue(recursiveEquals(term45509, term46019));
    }

};


