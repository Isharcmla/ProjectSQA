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

public class Base32_init_1042801703158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270688;
     Object term278047;
     Object term278051;

    public Base32_init_1042801703158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term277286 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term277286, term277286.getClass(), "PAD", (byte) 0);
        setIntField(term277286, term277286.getClass(), "unencodedBlockSize", 0);
        setIntField(term277286, term277286.getClass(), "encodedBlockSize", 0);
        setIntField(term277286, term277286.getClass(), "lineLength", 0);
        setIntField(term277286, term277286.getClass(), "chunkSeparatorLength", 0);
        setByteField(term277286, term277286.getClass(), "pad", (byte) 0);
        setField(term277286, term277286.getClass(), "encodeTable", null);
        setField(term277286, term277286.getClass(), "decodeTable", null);
        term270688 = (byte[]) newByteArray(6);
        term278047 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term278048 = (byte[]) newByteArray(88);
        byte[] term278049 = (byte[]) newByteArray(32);
        byte[] term278050 = (byte[]) newByteArray(6);
        setIntField(term278047, term278047.getClass(), "decodeSize", 13);
        setByteElement(term278048, 0, (byte) -1);
        setByteElement(term278048, 1, (byte) -1);
        setByteElement(term278048, 2, (byte) -1);
        setByteElement(term278048, 3, (byte) -1);
        setByteElement(term278048, 4, (byte) -1);
        setByteElement(term278048, 5, (byte) -1);
        setByteElement(term278048, 6, (byte) -1);
        setByteElement(term278048, 7, (byte) -1);
        setByteElement(term278048, 8, (byte) -1);
        setByteElement(term278048, 9, (byte) -1);
        setByteElement(term278048, 10, (byte) -1);
        setByteElement(term278048, 11, (byte) -1);
        setByteElement(term278048, 12, (byte) -1);
        setByteElement(term278048, 13, (byte) -1);
        setByteElement(term278048, 14, (byte) -1);
        setByteElement(term278048, 15, (byte) -1);
        setByteElement(term278048, 16, (byte) -1);
        setByteElement(term278048, 17, (byte) -1);
        setByteElement(term278048, 18, (byte) -1);
        setByteElement(term278048, 19, (byte) -1);
        setByteElement(term278048, 20, (byte) -1);
        setByteElement(term278048, 21, (byte) -1);
        setByteElement(term278048, 22, (byte) -1);
        setByteElement(term278048, 23, (byte) -1);
        setByteElement(term278048, 24, (byte) -1);
        setByteElement(term278048, 25, (byte) -1);
        setByteElement(term278048, 26, (byte) -1);
        setByteElement(term278048, 27, (byte) -1);
        setByteElement(term278048, 28, (byte) -1);
        setByteElement(term278048, 29, (byte) -1);
        setByteElement(term278048, 30, (byte) -1);
        setByteElement(term278048, 31, (byte) -1);
        setByteElement(term278048, 32, (byte) -1);
        setByteElement(term278048, 33, (byte) -1);
        setByteElement(term278048, 34, (byte) -1);
        setByteElement(term278048, 35, (byte) -1);
        setByteElement(term278048, 36, (byte) -1);
        setByteElement(term278048, 37, (byte) -1);
        setByteElement(term278048, 38, (byte) -1);
        setByteElement(term278048, 39, (byte) -1);
        setByteElement(term278048, 40, (byte) -1);
        setByteElement(term278048, 41, (byte) -1);
        setByteElement(term278048, 42, (byte) -1);
        setByteElement(term278048, 43, (byte) -1);
        setByteElement(term278048, 44, (byte) -1);
        setByteElement(term278048, 45, (byte) -1);
        setByteElement(term278048, 46, (byte) -1);
        setByteElement(term278048, 47, (byte) -1);
        setByteElement(term278048, 49, (byte) 1);
        setByteElement(term278048, 50, (byte) 2);
        setByteElement(term278048, 51, (byte) 3);
        setByteElement(term278048, 52, (byte) 4);
        setByteElement(term278048, 53, (byte) 5);
        setByteElement(term278048, 54, (byte) 6);
        setByteElement(term278048, 55, (byte) 7);
        setByteElement(term278048, 56, (byte) 8);
        setByteElement(term278048, 57, (byte) 9);
        setByteElement(term278048, 58, (byte) -1);
        setByteElement(term278048, 59, (byte) -1);
        setByteElement(term278048, 60, (byte) -1);
        setByteElement(term278048, 61, (byte) -1);
        setByteElement(term278048, 62, (byte) -1);
        setByteElement(term278048, 63, (byte) -1);
        setByteElement(term278048, 64, (byte) -1);
        setByteElement(term278048, 65, (byte) 10);
        setByteElement(term278048, 66, (byte) 11);
        setByteElement(term278048, 67, (byte) 12);
        setByteElement(term278048, 68, (byte) 13);
        setByteElement(term278048, 69, (byte) 14);
        setByteElement(term278048, 70, (byte) 15);
        setByteElement(term278048, 71, (byte) 16);
        setByteElement(term278048, 72, (byte) 17);
        setByteElement(term278048, 73, (byte) 18);
        setByteElement(term278048, 74, (byte) 19);
        setByteElement(term278048, 75, (byte) 20);
        setByteElement(term278048, 76, (byte) 21);
        setByteElement(term278048, 77, (byte) 22);
        setByteElement(term278048, 78, (byte) 23);
        setByteElement(term278048, 79, (byte) 24);
        setByteElement(term278048, 80, (byte) 25);
        setByteElement(term278048, 81, (byte) 26);
        setByteElement(term278048, 82, (byte) 27);
        setByteElement(term278048, 83, (byte) 28);
        setByteElement(term278048, 84, (byte) 29);
        setByteElement(term278048, 85, (byte) 30);
        setByteElement(term278048, 86, (byte) 31);
        setByteElement(term278048, 87, (byte) 32);
        setField(term278047, term278047.getClass(), "decodeTable", term278048);
        setIntField(term278047, term278047.getClass(), "encodeSize", 14);
        setByteElement(term278049, 0, (byte) 48);
        setByteElement(term278049, 1, (byte) 49);
        setByteElement(term278049, 2, (byte) 50);
        setByteElement(term278049, 3, (byte) 51);
        setByteElement(term278049, 4, (byte) 52);
        setByteElement(term278049, 5, (byte) 53);
        setByteElement(term278049, 6, (byte) 54);
        setByteElement(term278049, 7, (byte) 55);
        setByteElement(term278049, 8, (byte) 56);
        setByteElement(term278049, 9, (byte) 57);
        setByteElement(term278049, 10, (byte) 65);
        setByteElement(term278049, 11, (byte) 66);
        setByteElement(term278049, 12, (byte) 67);
        setByteElement(term278049, 13, (byte) 68);
        setByteElement(term278049, 14, (byte) 69);
        setByteElement(term278049, 15, (byte) 70);
        setByteElement(term278049, 16, (byte) 71);
        setByteElement(term278049, 17, (byte) 72);
        setByteElement(term278049, 18, (byte) 73);
        setByteElement(term278049, 19, (byte) 74);
        setByteElement(term278049, 20, (byte) 75);
        setByteElement(term278049, 21, (byte) 76);
        setByteElement(term278049, 22, (byte) 77);
        setByteElement(term278049, 23, (byte) 78);
        setByteElement(term278049, 24, (byte) 79);
        setByteElement(term278049, 25, (byte) 80);
        setByteElement(term278049, 26, (byte) 81);
        setByteElement(term278049, 27, (byte) 82);
        setByteElement(term278049, 28, (byte) 83);
        setByteElement(term278049, 29, (byte) 84);
        setByteElement(term278049, 30, (byte) 85);
        setByteElement(term278049, 31, (byte) 86);
        setField(term278047, term278047.getClass(), "encodeTable", term278049);
        setField(term278047, term278047.getClass(), "lineSeparator", term278050);
        setByteField(term278047, term278047.getClass(), "PAD", (byte) 61);
        setByteField(term278047, term278047.getClass(), "pad", (byte) 61);
        setIntField(term278047, term278047.getClass(), "unencodedBlockSize", 5);
        setIntField(term278047, term278047.getClass(), "encodedBlockSize", 8);
        setIntField(term278047, term278047.getClass(), "lineLength", 0);
        setIntField(term278047, term278047.getClass(), "chunkSeparatorLength", 6);
        term278051 = (byte[]) newByteArray(6);
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
        args[1] = term270688;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term278047));
        assertTrue(recursiveEquals(term270688, term278051));
    }

};


