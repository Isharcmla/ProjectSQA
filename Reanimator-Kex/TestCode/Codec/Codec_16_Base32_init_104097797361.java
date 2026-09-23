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

public class Base32_init_104097797361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43307;
     Object term44979;
     Object term44983;

    public Base32_init_104097797361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44030 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term43851 = (byte[]) newByteArray(0);
        setByteField(term44030, term44030.getClass(), "PAD", (byte) 0);
        setIntField(term44030, term44030.getClass(), "unencodedBlockSize", 0);
        setIntField(term44030, term44030.getClass(), "encodedBlockSize", 0);
        setIntField(term44030, term44030.getClass(), "lineLength", 0);
        setIntField(term44030, term44030.getClass(), "chunkSeparatorLength", 0);
        setByteField(term44030, term44030.getClass(), "pad", (byte) 0);
        setField(term44030, term44030.getClass(), "encodeTable", null);
        setField(term44030, term44030.getClass(), "decodeTable", term43851);
        setIntField(term44030, term44030.getClass(), "encodeSize", 0);
        setField(term44030, term44030.getClass(), "lineSeparator", null);
        setIntField(term44030, term44030.getClass(), "decodeSize", 0);
        term43307 = (byte[]) newByteArray(0);
        term44979 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term44980 = (byte[]) newByteArray(91);
        byte[] term44981 = (byte[]) newByteArray(32);
        byte[] term44982 = (byte[]) newByteArray(0);
        setIntField(term44979, term44979.getClass(), "decodeSize", 7);
        setByteElement(term44980, 0, (byte) -1);
        setByteElement(term44980, 1, (byte) -1);
        setByteElement(term44980, 2, (byte) -1);
        setByteElement(term44980, 3, (byte) -1);
        setByteElement(term44980, 4, (byte) -1);
        setByteElement(term44980, 5, (byte) -1);
        setByteElement(term44980, 6, (byte) -1);
        setByteElement(term44980, 7, (byte) -1);
        setByteElement(term44980, 8, (byte) -1);
        setByteElement(term44980, 9, (byte) -1);
        setByteElement(term44980, 10, (byte) -1);
        setByteElement(term44980, 11, (byte) -1);
        setByteElement(term44980, 12, (byte) -1);
        setByteElement(term44980, 13, (byte) -1);
        setByteElement(term44980, 14, (byte) -1);
        setByteElement(term44980, 15, (byte) -1);
        setByteElement(term44980, 16, (byte) -1);
        setByteElement(term44980, 17, (byte) -1);
        setByteElement(term44980, 18, (byte) -1);
        setByteElement(term44980, 19, (byte) -1);
        setByteElement(term44980, 20, (byte) -1);
        setByteElement(term44980, 21, (byte) -1);
        setByteElement(term44980, 22, (byte) -1);
        setByteElement(term44980, 23, (byte) -1);
        setByteElement(term44980, 24, (byte) -1);
        setByteElement(term44980, 25, (byte) -1);
        setByteElement(term44980, 26, (byte) -1);
        setByteElement(term44980, 27, (byte) -1);
        setByteElement(term44980, 28, (byte) -1);
        setByteElement(term44980, 29, (byte) -1);
        setByteElement(term44980, 30, (byte) -1);
        setByteElement(term44980, 31, (byte) -1);
        setByteElement(term44980, 32, (byte) -1);
        setByteElement(term44980, 33, (byte) -1);
        setByteElement(term44980, 34, (byte) -1);
        setByteElement(term44980, 35, (byte) -1);
        setByteElement(term44980, 36, (byte) -1);
        setByteElement(term44980, 37, (byte) -1);
        setByteElement(term44980, 38, (byte) -1);
        setByteElement(term44980, 39, (byte) -1);
        setByteElement(term44980, 40, (byte) -1);
        setByteElement(term44980, 41, (byte) -1);
        setByteElement(term44980, 42, (byte) -1);
        setByteElement(term44980, 43, (byte) -1);
        setByteElement(term44980, 44, (byte) -1);
        setByteElement(term44980, 45, (byte) -1);
        setByteElement(term44980, 46, (byte) -1);
        setByteElement(term44980, 47, (byte) -1);
        setByteElement(term44980, 48, (byte) -1);
        setByteElement(term44980, 49, (byte) -1);
        setByteElement(term44980, 50, (byte) 26);
        setByteElement(term44980, 51, (byte) 27);
        setByteElement(term44980, 52, (byte) 28);
        setByteElement(term44980, 53, (byte) 29);
        setByteElement(term44980, 54, (byte) 30);
        setByteElement(term44980, 55, (byte) 31);
        setByteElement(term44980, 56, (byte) -1);
        setByteElement(term44980, 57, (byte) -1);
        setByteElement(term44980, 58, (byte) -1);
        setByteElement(term44980, 59, (byte) -1);
        setByteElement(term44980, 60, (byte) -1);
        setByteElement(term44980, 61, (byte) -1);
        setByteElement(term44980, 62, (byte) -1);
        setByteElement(term44980, 63, (byte) -1);
        setByteElement(term44980, 64, (byte) -1);
        setByteElement(term44980, 66, (byte) 1);
        setByteElement(term44980, 67, (byte) 2);
        setByteElement(term44980, 68, (byte) 3);
        setByteElement(term44980, 69, (byte) 4);
        setByteElement(term44980, 70, (byte) 5);
        setByteElement(term44980, 71, (byte) 6);
        setByteElement(term44980, 72, (byte) 7);
        setByteElement(term44980, 73, (byte) 8);
        setByteElement(term44980, 74, (byte) 9);
        setByteElement(term44980, 75, (byte) 10);
        setByteElement(term44980, 76, (byte) 11);
        setByteElement(term44980, 77, (byte) 12);
        setByteElement(term44980, 78, (byte) 13);
        setByteElement(term44980, 79, (byte) 14);
        setByteElement(term44980, 80, (byte) 15);
        setByteElement(term44980, 81, (byte) 16);
        setByteElement(term44980, 82, (byte) 17);
        setByteElement(term44980, 83, (byte) 18);
        setByteElement(term44980, 84, (byte) 19);
        setByteElement(term44980, 85, (byte) 20);
        setByteElement(term44980, 86, (byte) 21);
        setByteElement(term44980, 87, (byte) 22);
        setByteElement(term44980, 88, (byte) 23);
        setByteElement(term44980, 89, (byte) 24);
        setByteElement(term44980, 90, (byte) 25);
        setField(term44979, term44979.getClass(), "decodeTable", term44980);
        setIntField(term44979, term44979.getClass(), "encodeSize", 8);
        setByteElement(term44981, 0, (byte) 65);
        setByteElement(term44981, 1, (byte) 66);
        setByteElement(term44981, 2, (byte) 67);
        setByteElement(term44981, 3, (byte) 68);
        setByteElement(term44981, 4, (byte) 69);
        setByteElement(term44981, 5, (byte) 70);
        setByteElement(term44981, 6, (byte) 71);
        setByteElement(term44981, 7, (byte) 72);
        setByteElement(term44981, 8, (byte) 73);
        setByteElement(term44981, 9, (byte) 74);
        setByteElement(term44981, 10, (byte) 75);
        setByteElement(term44981, 11, (byte) 76);
        setByteElement(term44981, 12, (byte) 77);
        setByteElement(term44981, 13, (byte) 78);
        setByteElement(term44981, 14, (byte) 79);
        setByteElement(term44981, 15, (byte) 80);
        setByteElement(term44981, 16, (byte) 81);
        setByteElement(term44981, 17, (byte) 82);
        setByteElement(term44981, 18, (byte) 83);
        setByteElement(term44981, 19, (byte) 84);
        setByteElement(term44981, 20, (byte) 85);
        setByteElement(term44981, 21, (byte) 86);
        setByteElement(term44981, 22, (byte) 87);
        setByteElement(term44981, 23, (byte) 88);
        setByteElement(term44981, 24, (byte) 89);
        setByteElement(term44981, 25, (byte) 90);
        setByteElement(term44981, 26, (byte) 50);
        setByteElement(term44981, 27, (byte) 51);
        setByteElement(term44981, 28, (byte) 52);
        setByteElement(term44981, 29, (byte) 53);
        setByteElement(term44981, 30, (byte) 54);
        setByteElement(term44981, 31, (byte) 55);
        setField(term44979, term44979.getClass(), "encodeTable", term44981);
        setField(term44979, term44979.getClass(), "lineSeparator", term44982);
        setByteField(term44979, term44979.getClass(), "PAD", (byte) 61);
        setByteField(term44979, term44979.getClass(), "pad", (byte) 61);
        setIntField(term44979, term44979.getClass(), "unencodedBlockSize", 5);
        setIntField(term44979, term44979.getClass(), "encodedBlockSize", 8);
        setIntField(term44979, term44979.getClass(), "lineLength", 0);
        setIntField(term44979, term44979.getClass(), "chunkSeparatorLength", 0);
        term44983 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = 1;
        args[1] = term43307;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term44979));
        assertTrue(recursiveEquals(term43307, term44983));
    }

};


