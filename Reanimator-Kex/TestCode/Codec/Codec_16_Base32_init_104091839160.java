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

public class Base32_init_104091839160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44181;

    public Base32_init_104091839160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42792 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term40624 = (byte[]) newByteArray(512);
        setByteField(term42792, term42792.getClass(), "PAD", (byte) 0);
        setIntField(term42792, term42792.getClass(), "unencodedBlockSize", 0);
        setIntField(term42792, term42792.getClass(), "encodedBlockSize", 0);
        setIntField(term42792, term42792.getClass(), "lineLength", 0);
        setIntField(term42792, term42792.getClass(), "chunkSeparatorLength", 0);
        setByteField(term42792, term42792.getClass(), "pad", (byte) 0);
        setField(term42792, term42792.getClass(), "encodeTable", term40624);
        setField(term42792, term42792.getClass(), "decodeTable", term40624);
        setIntField(term42792, term42792.getClass(), "encodeSize", 0);
        setField(term42792, term42792.getClass(), "lineSeparator", term40624);
        setIntField(term42792, term42792.getClass(), "decodeSize", 0);
        term44181 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term44182 = (byte[]) newByteArray(91);
        byte[] term44183 = (byte[]) newByteArray(32);
        setIntField(term44181, term44181.getClass(), "decodeSize", 7);
        setByteElement(term44182, 0, (byte) -1);
        setByteElement(term44182, 1, (byte) -1);
        setByteElement(term44182, 2, (byte) -1);
        setByteElement(term44182, 3, (byte) -1);
        setByteElement(term44182, 4, (byte) -1);
        setByteElement(term44182, 5, (byte) -1);
        setByteElement(term44182, 6, (byte) -1);
        setByteElement(term44182, 7, (byte) -1);
        setByteElement(term44182, 8, (byte) -1);
        setByteElement(term44182, 9, (byte) -1);
        setByteElement(term44182, 10, (byte) -1);
        setByteElement(term44182, 11, (byte) -1);
        setByteElement(term44182, 12, (byte) -1);
        setByteElement(term44182, 13, (byte) -1);
        setByteElement(term44182, 14, (byte) -1);
        setByteElement(term44182, 15, (byte) -1);
        setByteElement(term44182, 16, (byte) -1);
        setByteElement(term44182, 17, (byte) -1);
        setByteElement(term44182, 18, (byte) -1);
        setByteElement(term44182, 19, (byte) -1);
        setByteElement(term44182, 20, (byte) -1);
        setByteElement(term44182, 21, (byte) -1);
        setByteElement(term44182, 22, (byte) -1);
        setByteElement(term44182, 23, (byte) -1);
        setByteElement(term44182, 24, (byte) -1);
        setByteElement(term44182, 25, (byte) -1);
        setByteElement(term44182, 26, (byte) -1);
        setByteElement(term44182, 27, (byte) -1);
        setByteElement(term44182, 28, (byte) -1);
        setByteElement(term44182, 29, (byte) -1);
        setByteElement(term44182, 30, (byte) -1);
        setByteElement(term44182, 31, (byte) -1);
        setByteElement(term44182, 32, (byte) -1);
        setByteElement(term44182, 33, (byte) -1);
        setByteElement(term44182, 34, (byte) -1);
        setByteElement(term44182, 35, (byte) -1);
        setByteElement(term44182, 36, (byte) -1);
        setByteElement(term44182, 37, (byte) -1);
        setByteElement(term44182, 38, (byte) -1);
        setByteElement(term44182, 39, (byte) -1);
        setByteElement(term44182, 40, (byte) -1);
        setByteElement(term44182, 41, (byte) -1);
        setByteElement(term44182, 42, (byte) -1);
        setByteElement(term44182, 43, (byte) -1);
        setByteElement(term44182, 44, (byte) -1);
        setByteElement(term44182, 45, (byte) -1);
        setByteElement(term44182, 46, (byte) -1);
        setByteElement(term44182, 47, (byte) -1);
        setByteElement(term44182, 48, (byte) -1);
        setByteElement(term44182, 49, (byte) -1);
        setByteElement(term44182, 50, (byte) 26);
        setByteElement(term44182, 51, (byte) 27);
        setByteElement(term44182, 52, (byte) 28);
        setByteElement(term44182, 53, (byte) 29);
        setByteElement(term44182, 54, (byte) 30);
        setByteElement(term44182, 55, (byte) 31);
        setByteElement(term44182, 56, (byte) -1);
        setByteElement(term44182, 57, (byte) -1);
        setByteElement(term44182, 58, (byte) -1);
        setByteElement(term44182, 59, (byte) -1);
        setByteElement(term44182, 60, (byte) -1);
        setByteElement(term44182, 61, (byte) -1);
        setByteElement(term44182, 62, (byte) -1);
        setByteElement(term44182, 63, (byte) -1);
        setByteElement(term44182, 64, (byte) -1);
        setByteElement(term44182, 66, (byte) 1);
        setByteElement(term44182, 67, (byte) 2);
        setByteElement(term44182, 68, (byte) 3);
        setByteElement(term44182, 69, (byte) 4);
        setByteElement(term44182, 70, (byte) 5);
        setByteElement(term44182, 71, (byte) 6);
        setByteElement(term44182, 72, (byte) 7);
        setByteElement(term44182, 73, (byte) 8);
        setByteElement(term44182, 74, (byte) 9);
        setByteElement(term44182, 75, (byte) 10);
        setByteElement(term44182, 76, (byte) 11);
        setByteElement(term44182, 77, (byte) 12);
        setByteElement(term44182, 78, (byte) 13);
        setByteElement(term44182, 79, (byte) 14);
        setByteElement(term44182, 80, (byte) 15);
        setByteElement(term44182, 81, (byte) 16);
        setByteElement(term44182, 82, (byte) 17);
        setByteElement(term44182, 83, (byte) 18);
        setByteElement(term44182, 84, (byte) 19);
        setByteElement(term44182, 85, (byte) 20);
        setByteElement(term44182, 86, (byte) 21);
        setByteElement(term44182, 87, (byte) 22);
        setByteElement(term44182, 88, (byte) 23);
        setByteElement(term44182, 89, (byte) 24);
        setByteElement(term44182, 90, (byte) 25);
        setField(term44181, term44181.getClass(), "decodeTable", term44182);
        setIntField(term44181, term44181.getClass(), "encodeSize", 8);
        setByteElement(term44183, 0, (byte) 65);
        setByteElement(term44183, 1, (byte) 66);
        setByteElement(term44183, 2, (byte) 67);
        setByteElement(term44183, 3, (byte) 68);
        setByteElement(term44183, 4, (byte) 69);
        setByteElement(term44183, 5, (byte) 70);
        setByteElement(term44183, 6, (byte) 71);
        setByteElement(term44183, 7, (byte) 72);
        setByteElement(term44183, 8, (byte) 73);
        setByteElement(term44183, 9, (byte) 74);
        setByteElement(term44183, 10, (byte) 75);
        setByteElement(term44183, 11, (byte) 76);
        setByteElement(term44183, 12, (byte) 77);
        setByteElement(term44183, 13, (byte) 78);
        setByteElement(term44183, 14, (byte) 79);
        setByteElement(term44183, 15, (byte) 80);
        setByteElement(term44183, 16, (byte) 81);
        setByteElement(term44183, 17, (byte) 82);
        setByteElement(term44183, 18, (byte) 83);
        setByteElement(term44183, 19, (byte) 84);
        setByteElement(term44183, 20, (byte) 85);
        setByteElement(term44183, 21, (byte) 86);
        setByteElement(term44183, 22, (byte) 87);
        setByteElement(term44183, 23, (byte) 88);
        setByteElement(term44183, 24, (byte) 89);
        setByteElement(term44183, 25, (byte) 90);
        setByteElement(term44183, 26, (byte) 50);
        setByteElement(term44183, 27, (byte) 51);
        setByteElement(term44183, 28, (byte) 52);
        setByteElement(term44183, 29, (byte) 53);
        setByteElement(term44183, 30, (byte) 54);
        setByteElement(term44183, 31, (byte) 55);
        setField(term44181, term44181.getClass(), "encodeTable", term44183);
        setField(term44181, term44181.getClass(), "lineSeparator", null);
        setByteField(term44181, term44181.getClass(), "PAD", (byte) 61);
        setByteField(term44181, term44181.getClass(), "pad", (byte) 126);
        setIntField(term44181, term44181.getClass(), "unencodedBlockSize", 5);
        setIntField(term44181, term44181.getClass(), "encodedBlockSize", 8);
        setIntField(term44181, term44181.getClass(), "lineLength", 0);
        setIntField(term44181, term44181.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = (byte) 126;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term44181));
    }

};


