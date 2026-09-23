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

public class Base32_init_1042801703131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185861;
     Object term200047;
     Object term200051;

    public Base32_init_1042801703131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term199498 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term186881 = (byte[]) newByteArray(0);
        setByteField(term199498, term199498.getClass(), "PAD", (byte) 0);
        setIntField(term199498, term199498.getClass(), "unencodedBlockSize", 0);
        setIntField(term199498, term199498.getClass(), "encodedBlockSize", 0);
        setIntField(term199498, term199498.getClass(), "lineLength", 0);
        setIntField(term199498, term199498.getClass(), "chunkSeparatorLength", 0);
        setByteField(term199498, term199498.getClass(), "pad", (byte) -128);
        setField(term199498, term199498.getClass(), "encodeTable", null);
        setField(term199498, term199498.getClass(), "decodeTable", term186881);
        setIntField(term199498, term199498.getClass(), "encodeSize", 0);
        setField(term199498, term199498.getClass(), "lineSeparator", null);
        setIntField(term199498, term199498.getClass(), "decodeSize", 0);
        term185861 = (byte[]) newByteArray(11);
        term200047 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term200048 = (byte[]) newByteArray(88);
        byte[] term200049 = (byte[]) newByteArray(32);
        byte[] term200050 = (byte[]) newByteArray(11);
        setIntField(term200047, term200047.getClass(), "decodeSize", 18);
        setByteElement(term200048, 0, (byte) -1);
        setByteElement(term200048, 1, (byte) -1);
        setByteElement(term200048, 2, (byte) -1);
        setByteElement(term200048, 3, (byte) -1);
        setByteElement(term200048, 4, (byte) -1);
        setByteElement(term200048, 5, (byte) -1);
        setByteElement(term200048, 6, (byte) -1);
        setByteElement(term200048, 7, (byte) -1);
        setByteElement(term200048, 8, (byte) -1);
        setByteElement(term200048, 9, (byte) -1);
        setByteElement(term200048, 10, (byte) -1);
        setByteElement(term200048, 11, (byte) -1);
        setByteElement(term200048, 12, (byte) -1);
        setByteElement(term200048, 13, (byte) -1);
        setByteElement(term200048, 14, (byte) -1);
        setByteElement(term200048, 15, (byte) -1);
        setByteElement(term200048, 16, (byte) -1);
        setByteElement(term200048, 17, (byte) -1);
        setByteElement(term200048, 18, (byte) -1);
        setByteElement(term200048, 19, (byte) -1);
        setByteElement(term200048, 20, (byte) -1);
        setByteElement(term200048, 21, (byte) -1);
        setByteElement(term200048, 22, (byte) -1);
        setByteElement(term200048, 23, (byte) -1);
        setByteElement(term200048, 24, (byte) -1);
        setByteElement(term200048, 25, (byte) -1);
        setByteElement(term200048, 26, (byte) -1);
        setByteElement(term200048, 27, (byte) -1);
        setByteElement(term200048, 28, (byte) -1);
        setByteElement(term200048, 29, (byte) -1);
        setByteElement(term200048, 30, (byte) -1);
        setByteElement(term200048, 31, (byte) -1);
        setByteElement(term200048, 32, (byte) -1);
        setByteElement(term200048, 33, (byte) -1);
        setByteElement(term200048, 34, (byte) -1);
        setByteElement(term200048, 35, (byte) -1);
        setByteElement(term200048, 36, (byte) -1);
        setByteElement(term200048, 37, (byte) -1);
        setByteElement(term200048, 38, (byte) -1);
        setByteElement(term200048, 39, (byte) -1);
        setByteElement(term200048, 40, (byte) -1);
        setByteElement(term200048, 41, (byte) -1);
        setByteElement(term200048, 42, (byte) -1);
        setByteElement(term200048, 43, (byte) -1);
        setByteElement(term200048, 44, (byte) -1);
        setByteElement(term200048, 45, (byte) -1);
        setByteElement(term200048, 46, (byte) -1);
        setByteElement(term200048, 47, (byte) -1);
        setByteElement(term200048, 49, (byte) 1);
        setByteElement(term200048, 50, (byte) 2);
        setByteElement(term200048, 51, (byte) 3);
        setByteElement(term200048, 52, (byte) 4);
        setByteElement(term200048, 53, (byte) 5);
        setByteElement(term200048, 54, (byte) 6);
        setByteElement(term200048, 55, (byte) 7);
        setByteElement(term200048, 56, (byte) 8);
        setByteElement(term200048, 57, (byte) 9);
        setByteElement(term200048, 58, (byte) -1);
        setByteElement(term200048, 59, (byte) -1);
        setByteElement(term200048, 60, (byte) -1);
        setByteElement(term200048, 61, (byte) -1);
        setByteElement(term200048, 62, (byte) -1);
        setByteElement(term200048, 63, (byte) -1);
        setByteElement(term200048, 64, (byte) -1);
        setByteElement(term200048, 65, (byte) 10);
        setByteElement(term200048, 66, (byte) 11);
        setByteElement(term200048, 67, (byte) 12);
        setByteElement(term200048, 68, (byte) 13);
        setByteElement(term200048, 69, (byte) 14);
        setByteElement(term200048, 70, (byte) 15);
        setByteElement(term200048, 71, (byte) 16);
        setByteElement(term200048, 72, (byte) 17);
        setByteElement(term200048, 73, (byte) 18);
        setByteElement(term200048, 74, (byte) 19);
        setByteElement(term200048, 75, (byte) 20);
        setByteElement(term200048, 76, (byte) 21);
        setByteElement(term200048, 77, (byte) 22);
        setByteElement(term200048, 78, (byte) 23);
        setByteElement(term200048, 79, (byte) 24);
        setByteElement(term200048, 80, (byte) 25);
        setByteElement(term200048, 81, (byte) 26);
        setByteElement(term200048, 82, (byte) 27);
        setByteElement(term200048, 83, (byte) 28);
        setByteElement(term200048, 84, (byte) 29);
        setByteElement(term200048, 85, (byte) 30);
        setByteElement(term200048, 86, (byte) 31);
        setByteElement(term200048, 87, (byte) 32);
        setField(term200047, term200047.getClass(), "decodeTable", term200048);
        setIntField(term200047, term200047.getClass(), "encodeSize", 19);
        setByteElement(term200049, 0, (byte) 48);
        setByteElement(term200049, 1, (byte) 49);
        setByteElement(term200049, 2, (byte) 50);
        setByteElement(term200049, 3, (byte) 51);
        setByteElement(term200049, 4, (byte) 52);
        setByteElement(term200049, 5, (byte) 53);
        setByteElement(term200049, 6, (byte) 54);
        setByteElement(term200049, 7, (byte) 55);
        setByteElement(term200049, 8, (byte) 56);
        setByteElement(term200049, 9, (byte) 57);
        setByteElement(term200049, 10, (byte) 65);
        setByteElement(term200049, 11, (byte) 66);
        setByteElement(term200049, 12, (byte) 67);
        setByteElement(term200049, 13, (byte) 68);
        setByteElement(term200049, 14, (byte) 69);
        setByteElement(term200049, 15, (byte) 70);
        setByteElement(term200049, 16, (byte) 71);
        setByteElement(term200049, 17, (byte) 72);
        setByteElement(term200049, 18, (byte) 73);
        setByteElement(term200049, 19, (byte) 74);
        setByteElement(term200049, 20, (byte) 75);
        setByteElement(term200049, 21, (byte) 76);
        setByteElement(term200049, 22, (byte) 77);
        setByteElement(term200049, 23, (byte) 78);
        setByteElement(term200049, 24, (byte) 79);
        setByteElement(term200049, 25, (byte) 80);
        setByteElement(term200049, 26, (byte) 81);
        setByteElement(term200049, 27, (byte) 82);
        setByteElement(term200049, 28, (byte) 83);
        setByteElement(term200049, 29, (byte) 84);
        setByteElement(term200049, 30, (byte) 85);
        setByteElement(term200049, 31, (byte) 86);
        setField(term200047, term200047.getClass(), "encodeTable", term200049);
        setField(term200047, term200047.getClass(), "lineSeparator", term200050);
        setByteField(term200047, term200047.getClass(), "PAD", (byte) 61);
        setByteField(term200047, term200047.getClass(), "pad", (byte) 61);
        setIntField(term200047, term200047.getClass(), "unencodedBlockSize", 5);
        setIntField(term200047, term200047.getClass(), "encodedBlockSize", 8);
        setIntField(term200047, term200047.getClass(), "lineLength", 0);
        setIntField(term200047, term200047.getClass(), "chunkSeparatorLength", 11);
        term200051 = (byte[]) newByteArray(11);
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
        args[1] = term185861;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term200047));
        assertTrue(recursiveEquals(term185861, term200051));
    }

};


