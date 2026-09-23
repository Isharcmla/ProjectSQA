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

public class Base32_init_1042801703461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943487;
     Object term1008685;
     Object term1008689;

    public Base32_init_1042801703461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term944550 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term944550, term944550.getClass(), "PAD", (byte) -128);
        setIntField(term944550, term944550.getClass(), "unencodedBlockSize", 0);
        setIntField(term944550, term944550.getClass(), "encodedBlockSize", 0);
        setIntField(term944550, term944550.getClass(), "lineLength", 0);
        setIntField(term944550, term944550.getClass(), "chunkSeparatorLength", 0);
        setByteField(term944550, term944550.getClass(), "pad", (byte) -128);
        setField(term944550, term944550.getClass(), "encodeTable", null);
        setField(term944550, term944550.getClass(), "decodeTable", null);
        term943487 = (byte[]) newByteArray(490);
        setByteElement(term943487, 1, (byte) 112);
        term1008685 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term1008686 = (byte[]) newByteArray(88);
        byte[] term1008687 = (byte[]) newByteArray(32);
        byte[] term1008688 = (byte[]) newByteArray(490);
        setIntField(term1008685, term1008685.getClass(), "decodeSize", 497);
        setByteElement(term1008686, 0, (byte) -1);
        setByteElement(term1008686, 1, (byte) -1);
        setByteElement(term1008686, 2, (byte) -1);
        setByteElement(term1008686, 3, (byte) -1);
        setByteElement(term1008686, 4, (byte) -1);
        setByteElement(term1008686, 5, (byte) -1);
        setByteElement(term1008686, 6, (byte) -1);
        setByteElement(term1008686, 7, (byte) -1);
        setByteElement(term1008686, 8, (byte) -1);
        setByteElement(term1008686, 9, (byte) -1);
        setByteElement(term1008686, 10, (byte) -1);
        setByteElement(term1008686, 11, (byte) -1);
        setByteElement(term1008686, 12, (byte) -1);
        setByteElement(term1008686, 13, (byte) -1);
        setByteElement(term1008686, 14, (byte) -1);
        setByteElement(term1008686, 15, (byte) -1);
        setByteElement(term1008686, 16, (byte) -1);
        setByteElement(term1008686, 17, (byte) -1);
        setByteElement(term1008686, 18, (byte) -1);
        setByteElement(term1008686, 19, (byte) -1);
        setByteElement(term1008686, 20, (byte) -1);
        setByteElement(term1008686, 21, (byte) -1);
        setByteElement(term1008686, 22, (byte) -1);
        setByteElement(term1008686, 23, (byte) -1);
        setByteElement(term1008686, 24, (byte) -1);
        setByteElement(term1008686, 25, (byte) -1);
        setByteElement(term1008686, 26, (byte) -1);
        setByteElement(term1008686, 27, (byte) -1);
        setByteElement(term1008686, 28, (byte) -1);
        setByteElement(term1008686, 29, (byte) -1);
        setByteElement(term1008686, 30, (byte) -1);
        setByteElement(term1008686, 31, (byte) -1);
        setByteElement(term1008686, 32, (byte) -1);
        setByteElement(term1008686, 33, (byte) -1);
        setByteElement(term1008686, 34, (byte) -1);
        setByteElement(term1008686, 35, (byte) -1);
        setByteElement(term1008686, 36, (byte) -1);
        setByteElement(term1008686, 37, (byte) -1);
        setByteElement(term1008686, 38, (byte) -1);
        setByteElement(term1008686, 39, (byte) -1);
        setByteElement(term1008686, 40, (byte) -1);
        setByteElement(term1008686, 41, (byte) -1);
        setByteElement(term1008686, 42, (byte) -1);
        setByteElement(term1008686, 43, (byte) -1);
        setByteElement(term1008686, 44, (byte) -1);
        setByteElement(term1008686, 45, (byte) -1);
        setByteElement(term1008686, 46, (byte) -1);
        setByteElement(term1008686, 47, (byte) -1);
        setByteElement(term1008686, 49, (byte) 1);
        setByteElement(term1008686, 50, (byte) 2);
        setByteElement(term1008686, 51, (byte) 3);
        setByteElement(term1008686, 52, (byte) 4);
        setByteElement(term1008686, 53, (byte) 5);
        setByteElement(term1008686, 54, (byte) 6);
        setByteElement(term1008686, 55, (byte) 7);
        setByteElement(term1008686, 56, (byte) 8);
        setByteElement(term1008686, 57, (byte) 9);
        setByteElement(term1008686, 58, (byte) -1);
        setByteElement(term1008686, 59, (byte) -1);
        setByteElement(term1008686, 60, (byte) -1);
        setByteElement(term1008686, 61, (byte) -1);
        setByteElement(term1008686, 62, (byte) -1);
        setByteElement(term1008686, 63, (byte) -1);
        setByteElement(term1008686, 64, (byte) -1);
        setByteElement(term1008686, 65, (byte) 10);
        setByteElement(term1008686, 66, (byte) 11);
        setByteElement(term1008686, 67, (byte) 12);
        setByteElement(term1008686, 68, (byte) 13);
        setByteElement(term1008686, 69, (byte) 14);
        setByteElement(term1008686, 70, (byte) 15);
        setByteElement(term1008686, 71, (byte) 16);
        setByteElement(term1008686, 72, (byte) 17);
        setByteElement(term1008686, 73, (byte) 18);
        setByteElement(term1008686, 74, (byte) 19);
        setByteElement(term1008686, 75, (byte) 20);
        setByteElement(term1008686, 76, (byte) 21);
        setByteElement(term1008686, 77, (byte) 22);
        setByteElement(term1008686, 78, (byte) 23);
        setByteElement(term1008686, 79, (byte) 24);
        setByteElement(term1008686, 80, (byte) 25);
        setByteElement(term1008686, 81, (byte) 26);
        setByteElement(term1008686, 82, (byte) 27);
        setByteElement(term1008686, 83, (byte) 28);
        setByteElement(term1008686, 84, (byte) 29);
        setByteElement(term1008686, 85, (byte) 30);
        setByteElement(term1008686, 86, (byte) 31);
        setByteElement(term1008686, 87, (byte) 32);
        setField(term1008685, term1008685.getClass(), "decodeTable", term1008686);
        setIntField(term1008685, term1008685.getClass(), "encodeSize", 498);
        setByteElement(term1008687, 0, (byte) 48);
        setByteElement(term1008687, 1, (byte) 49);
        setByteElement(term1008687, 2, (byte) 50);
        setByteElement(term1008687, 3, (byte) 51);
        setByteElement(term1008687, 4, (byte) 52);
        setByteElement(term1008687, 5, (byte) 53);
        setByteElement(term1008687, 6, (byte) 54);
        setByteElement(term1008687, 7, (byte) 55);
        setByteElement(term1008687, 8, (byte) 56);
        setByteElement(term1008687, 9, (byte) 57);
        setByteElement(term1008687, 10, (byte) 65);
        setByteElement(term1008687, 11, (byte) 66);
        setByteElement(term1008687, 12, (byte) 67);
        setByteElement(term1008687, 13, (byte) 68);
        setByteElement(term1008687, 14, (byte) 69);
        setByteElement(term1008687, 15, (byte) 70);
        setByteElement(term1008687, 16, (byte) 71);
        setByteElement(term1008687, 17, (byte) 72);
        setByteElement(term1008687, 18, (byte) 73);
        setByteElement(term1008687, 19, (byte) 74);
        setByteElement(term1008687, 20, (byte) 75);
        setByteElement(term1008687, 21, (byte) 76);
        setByteElement(term1008687, 22, (byte) 77);
        setByteElement(term1008687, 23, (byte) 78);
        setByteElement(term1008687, 24, (byte) 79);
        setByteElement(term1008687, 25, (byte) 80);
        setByteElement(term1008687, 26, (byte) 81);
        setByteElement(term1008687, 27, (byte) 82);
        setByteElement(term1008687, 28, (byte) 83);
        setByteElement(term1008687, 29, (byte) 84);
        setByteElement(term1008687, 30, (byte) 85);
        setByteElement(term1008687, 31, (byte) 86);
        setField(term1008685, term1008685.getClass(), "encodeTable", term1008687);
        setByteElement(term1008688, 1, (byte) 112);
        setField(term1008685, term1008685.getClass(), "lineSeparator", term1008688);
        setByteField(term1008685, term1008685.getClass(), "PAD", (byte) 61);
        setByteField(term1008685, term1008685.getClass(), "pad", (byte) 61);
        setIntField(term1008685, term1008685.getClass(), "unencodedBlockSize", 5);
        setIntField(term1008685, term1008685.getClass(), "encodedBlockSize", 8);
        setIntField(term1008685, term1008685.getClass(), "lineLength", 0);
        setIntField(term1008685, term1008685.getClass(), "chunkSeparatorLength", 490);
        term1008689 = (byte[]) newByteArray(490);
        setByteElement(term1008689, 1, (byte) 112);
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
        args[1] = term943487;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1008685));
        assertTrue(recursiveEquals(term943487, term1008689));
    }

};


