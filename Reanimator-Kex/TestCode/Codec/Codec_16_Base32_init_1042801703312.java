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

public class Base32_init_1042801703312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term593282;
     Object term602202;
     Object term602205;

    public Base32_init_1042801703312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term593409 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term593291 = (byte[]) newByteArray(0);
        byte[] term593290 = (byte[]) newByteArray(0);
        setByteField(term593409, term593409.getClass(), "PAD", (byte) 0);
        setIntField(term593409, term593409.getClass(), "unencodedBlockSize", 0);
        setIntField(term593409, term593409.getClass(), "encodedBlockSize", 0);
        setIntField(term593409, term593409.getClass(), "lineLength", 0);
        setIntField(term593409, term593409.getClass(), "chunkSeparatorLength", 0);
        setByteField(term593409, term593409.getClass(), "pad", (byte) 0);
        setField(term593409, term593409.getClass(), "encodeTable", term593291);
        setField(term593409, term593409.getClass(), "decodeTable", term593291);
        setIntField(term593409, term593409.getClass(), "encodeSize", 0);
        setField(term593409, term593409.getClass(), "lineSeparator", term593290);
        setIntField(term593409, term593409.getClass(), "decodeSize", 0);
        term593282 = (byte[]) newByteArray(0);
        term602202 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term602203 = (byte[]) newByteArray(88);
        byte[] term602204 = (byte[]) newByteArray(32);
        setIntField(term602202, term602202.getClass(), "decodeSize", 7);
        setByteElement(term602203, 0, (byte) -1);
        setByteElement(term602203, 1, (byte) -1);
        setByteElement(term602203, 2, (byte) -1);
        setByteElement(term602203, 3, (byte) -1);
        setByteElement(term602203, 4, (byte) -1);
        setByteElement(term602203, 5, (byte) -1);
        setByteElement(term602203, 6, (byte) -1);
        setByteElement(term602203, 7, (byte) -1);
        setByteElement(term602203, 8, (byte) -1);
        setByteElement(term602203, 9, (byte) -1);
        setByteElement(term602203, 10, (byte) -1);
        setByteElement(term602203, 11, (byte) -1);
        setByteElement(term602203, 12, (byte) -1);
        setByteElement(term602203, 13, (byte) -1);
        setByteElement(term602203, 14, (byte) -1);
        setByteElement(term602203, 15, (byte) -1);
        setByteElement(term602203, 16, (byte) -1);
        setByteElement(term602203, 17, (byte) -1);
        setByteElement(term602203, 18, (byte) -1);
        setByteElement(term602203, 19, (byte) -1);
        setByteElement(term602203, 20, (byte) -1);
        setByteElement(term602203, 21, (byte) -1);
        setByteElement(term602203, 22, (byte) -1);
        setByteElement(term602203, 23, (byte) -1);
        setByteElement(term602203, 24, (byte) -1);
        setByteElement(term602203, 25, (byte) -1);
        setByteElement(term602203, 26, (byte) -1);
        setByteElement(term602203, 27, (byte) -1);
        setByteElement(term602203, 28, (byte) -1);
        setByteElement(term602203, 29, (byte) -1);
        setByteElement(term602203, 30, (byte) -1);
        setByteElement(term602203, 31, (byte) -1);
        setByteElement(term602203, 32, (byte) -1);
        setByteElement(term602203, 33, (byte) -1);
        setByteElement(term602203, 34, (byte) -1);
        setByteElement(term602203, 35, (byte) -1);
        setByteElement(term602203, 36, (byte) -1);
        setByteElement(term602203, 37, (byte) -1);
        setByteElement(term602203, 38, (byte) -1);
        setByteElement(term602203, 39, (byte) -1);
        setByteElement(term602203, 40, (byte) -1);
        setByteElement(term602203, 41, (byte) -1);
        setByteElement(term602203, 42, (byte) -1);
        setByteElement(term602203, 43, (byte) -1);
        setByteElement(term602203, 44, (byte) -1);
        setByteElement(term602203, 45, (byte) -1);
        setByteElement(term602203, 46, (byte) -1);
        setByteElement(term602203, 47, (byte) -1);
        setByteElement(term602203, 49, (byte) 1);
        setByteElement(term602203, 50, (byte) 2);
        setByteElement(term602203, 51, (byte) 3);
        setByteElement(term602203, 52, (byte) 4);
        setByteElement(term602203, 53, (byte) 5);
        setByteElement(term602203, 54, (byte) 6);
        setByteElement(term602203, 55, (byte) 7);
        setByteElement(term602203, 56, (byte) 8);
        setByteElement(term602203, 57, (byte) 9);
        setByteElement(term602203, 58, (byte) -1);
        setByteElement(term602203, 59, (byte) -1);
        setByteElement(term602203, 60, (byte) -1);
        setByteElement(term602203, 61, (byte) -1);
        setByteElement(term602203, 62, (byte) -1);
        setByteElement(term602203, 63, (byte) -1);
        setByteElement(term602203, 64, (byte) -1);
        setByteElement(term602203, 65, (byte) 10);
        setByteElement(term602203, 66, (byte) 11);
        setByteElement(term602203, 67, (byte) 12);
        setByteElement(term602203, 68, (byte) 13);
        setByteElement(term602203, 69, (byte) 14);
        setByteElement(term602203, 70, (byte) 15);
        setByteElement(term602203, 71, (byte) 16);
        setByteElement(term602203, 72, (byte) 17);
        setByteElement(term602203, 73, (byte) 18);
        setByteElement(term602203, 74, (byte) 19);
        setByteElement(term602203, 75, (byte) 20);
        setByteElement(term602203, 76, (byte) 21);
        setByteElement(term602203, 77, (byte) 22);
        setByteElement(term602203, 78, (byte) 23);
        setByteElement(term602203, 79, (byte) 24);
        setByteElement(term602203, 80, (byte) 25);
        setByteElement(term602203, 81, (byte) 26);
        setByteElement(term602203, 82, (byte) 27);
        setByteElement(term602203, 83, (byte) 28);
        setByteElement(term602203, 84, (byte) 29);
        setByteElement(term602203, 85, (byte) 30);
        setByteElement(term602203, 86, (byte) 31);
        setByteElement(term602203, 87, (byte) 32);
        setField(term602202, term602202.getClass(), "decodeTable", term602203);
        setIntField(term602202, term602202.getClass(), "encodeSize", 8);
        setByteElement(term602204, 0, (byte) 48);
        setByteElement(term602204, 1, (byte) 49);
        setByteElement(term602204, 2, (byte) 50);
        setByteElement(term602204, 3, (byte) 51);
        setByteElement(term602204, 4, (byte) 52);
        setByteElement(term602204, 5, (byte) 53);
        setByteElement(term602204, 6, (byte) 54);
        setByteElement(term602204, 7, (byte) 55);
        setByteElement(term602204, 8, (byte) 56);
        setByteElement(term602204, 9, (byte) 57);
        setByteElement(term602204, 10, (byte) 65);
        setByteElement(term602204, 11, (byte) 66);
        setByteElement(term602204, 12, (byte) 67);
        setByteElement(term602204, 13, (byte) 68);
        setByteElement(term602204, 14, (byte) 69);
        setByteElement(term602204, 15, (byte) 70);
        setByteElement(term602204, 16, (byte) 71);
        setByteElement(term602204, 17, (byte) 72);
        setByteElement(term602204, 18, (byte) 73);
        setByteElement(term602204, 19, (byte) 74);
        setByteElement(term602204, 20, (byte) 75);
        setByteElement(term602204, 21, (byte) 76);
        setByteElement(term602204, 22, (byte) 77);
        setByteElement(term602204, 23, (byte) 78);
        setByteElement(term602204, 24, (byte) 79);
        setByteElement(term602204, 25, (byte) 80);
        setByteElement(term602204, 26, (byte) 81);
        setByteElement(term602204, 27, (byte) 82);
        setByteElement(term602204, 28, (byte) 83);
        setByteElement(term602204, 29, (byte) 84);
        setByteElement(term602204, 30, (byte) 85);
        setByteElement(term602204, 31, (byte) 86);
        setField(term602202, term602202.getClass(), "encodeTable", term602204);
        setField(term602202, term602202.getClass(), "lineSeparator", null);
        setByteField(term602202, term602202.getClass(), "PAD", (byte) 61);
        setByteField(term602202, term602202.getClass(), "pad", (byte) 61);
        setIntField(term602202, term602202.getClass(), "unencodedBlockSize", 5);
        setIntField(term602202, term602202.getClass(), "encodedBlockSize", 8);
        setIntField(term602202, term602202.getClass(), "lineLength", 0);
        setIntField(term602202, term602202.getClass(), "chunkSeparatorLength", 0);
        term602205 = (byte[]) newByteArray(0);
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
        args[1] = term593282;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term602202));
        assertTrue(recursiveEquals(term593282, term602205));
    }

};


