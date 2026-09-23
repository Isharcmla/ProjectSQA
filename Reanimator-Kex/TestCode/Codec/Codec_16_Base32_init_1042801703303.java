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

public class Base32_init_1042801703303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561279;
     Object term569112;
     Object term569116;

    public Base32_init_1042801703303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term568877 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term561784 = (byte[]) newByteArray(0);
        setByteField(term568877, term568877.getClass(), "PAD", (byte) 0);
        setIntField(term568877, term568877.getClass(), "unencodedBlockSize", 0);
        setIntField(term568877, term568877.getClass(), "encodedBlockSize", 0);
        setIntField(term568877, term568877.getClass(), "lineLength", 0);
        setIntField(term568877, term568877.getClass(), "chunkSeparatorLength", 0);
        setByteField(term568877, term568877.getClass(), "pad", (byte) 0);
        setField(term568877, term568877.getClass(), "encodeTable", null);
        setField(term568877, term568877.getClass(), "decodeTable", term561784);
        term561279 = (byte[]) newByteArray(7);
        term569112 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term569113 = (byte[]) newByteArray(88);
        byte[] term569114 = (byte[]) newByteArray(32);
        byte[] term569115 = (byte[]) newByteArray(7);
        setIntField(term569112, term569112.getClass(), "decodeSize", 14);
        setByteElement(term569113, 0, (byte) -1);
        setByteElement(term569113, 1, (byte) -1);
        setByteElement(term569113, 2, (byte) -1);
        setByteElement(term569113, 3, (byte) -1);
        setByteElement(term569113, 4, (byte) -1);
        setByteElement(term569113, 5, (byte) -1);
        setByteElement(term569113, 6, (byte) -1);
        setByteElement(term569113, 7, (byte) -1);
        setByteElement(term569113, 8, (byte) -1);
        setByteElement(term569113, 9, (byte) -1);
        setByteElement(term569113, 10, (byte) -1);
        setByteElement(term569113, 11, (byte) -1);
        setByteElement(term569113, 12, (byte) -1);
        setByteElement(term569113, 13, (byte) -1);
        setByteElement(term569113, 14, (byte) -1);
        setByteElement(term569113, 15, (byte) -1);
        setByteElement(term569113, 16, (byte) -1);
        setByteElement(term569113, 17, (byte) -1);
        setByteElement(term569113, 18, (byte) -1);
        setByteElement(term569113, 19, (byte) -1);
        setByteElement(term569113, 20, (byte) -1);
        setByteElement(term569113, 21, (byte) -1);
        setByteElement(term569113, 22, (byte) -1);
        setByteElement(term569113, 23, (byte) -1);
        setByteElement(term569113, 24, (byte) -1);
        setByteElement(term569113, 25, (byte) -1);
        setByteElement(term569113, 26, (byte) -1);
        setByteElement(term569113, 27, (byte) -1);
        setByteElement(term569113, 28, (byte) -1);
        setByteElement(term569113, 29, (byte) -1);
        setByteElement(term569113, 30, (byte) -1);
        setByteElement(term569113, 31, (byte) -1);
        setByteElement(term569113, 32, (byte) -1);
        setByteElement(term569113, 33, (byte) -1);
        setByteElement(term569113, 34, (byte) -1);
        setByteElement(term569113, 35, (byte) -1);
        setByteElement(term569113, 36, (byte) -1);
        setByteElement(term569113, 37, (byte) -1);
        setByteElement(term569113, 38, (byte) -1);
        setByteElement(term569113, 39, (byte) -1);
        setByteElement(term569113, 40, (byte) -1);
        setByteElement(term569113, 41, (byte) -1);
        setByteElement(term569113, 42, (byte) -1);
        setByteElement(term569113, 43, (byte) -1);
        setByteElement(term569113, 44, (byte) -1);
        setByteElement(term569113, 45, (byte) -1);
        setByteElement(term569113, 46, (byte) -1);
        setByteElement(term569113, 47, (byte) -1);
        setByteElement(term569113, 49, (byte) 1);
        setByteElement(term569113, 50, (byte) 2);
        setByteElement(term569113, 51, (byte) 3);
        setByteElement(term569113, 52, (byte) 4);
        setByteElement(term569113, 53, (byte) 5);
        setByteElement(term569113, 54, (byte) 6);
        setByteElement(term569113, 55, (byte) 7);
        setByteElement(term569113, 56, (byte) 8);
        setByteElement(term569113, 57, (byte) 9);
        setByteElement(term569113, 58, (byte) -1);
        setByteElement(term569113, 59, (byte) -1);
        setByteElement(term569113, 60, (byte) -1);
        setByteElement(term569113, 61, (byte) -1);
        setByteElement(term569113, 62, (byte) -1);
        setByteElement(term569113, 63, (byte) -1);
        setByteElement(term569113, 64, (byte) -1);
        setByteElement(term569113, 65, (byte) 10);
        setByteElement(term569113, 66, (byte) 11);
        setByteElement(term569113, 67, (byte) 12);
        setByteElement(term569113, 68, (byte) 13);
        setByteElement(term569113, 69, (byte) 14);
        setByteElement(term569113, 70, (byte) 15);
        setByteElement(term569113, 71, (byte) 16);
        setByteElement(term569113, 72, (byte) 17);
        setByteElement(term569113, 73, (byte) 18);
        setByteElement(term569113, 74, (byte) 19);
        setByteElement(term569113, 75, (byte) 20);
        setByteElement(term569113, 76, (byte) 21);
        setByteElement(term569113, 77, (byte) 22);
        setByteElement(term569113, 78, (byte) 23);
        setByteElement(term569113, 79, (byte) 24);
        setByteElement(term569113, 80, (byte) 25);
        setByteElement(term569113, 81, (byte) 26);
        setByteElement(term569113, 82, (byte) 27);
        setByteElement(term569113, 83, (byte) 28);
        setByteElement(term569113, 84, (byte) 29);
        setByteElement(term569113, 85, (byte) 30);
        setByteElement(term569113, 86, (byte) 31);
        setByteElement(term569113, 87, (byte) 32);
        setField(term569112, term569112.getClass(), "decodeTable", term569113);
        setIntField(term569112, term569112.getClass(), "encodeSize", 15);
        setByteElement(term569114, 0, (byte) 48);
        setByteElement(term569114, 1, (byte) 49);
        setByteElement(term569114, 2, (byte) 50);
        setByteElement(term569114, 3, (byte) 51);
        setByteElement(term569114, 4, (byte) 52);
        setByteElement(term569114, 5, (byte) 53);
        setByteElement(term569114, 6, (byte) 54);
        setByteElement(term569114, 7, (byte) 55);
        setByteElement(term569114, 8, (byte) 56);
        setByteElement(term569114, 9, (byte) 57);
        setByteElement(term569114, 10, (byte) 65);
        setByteElement(term569114, 11, (byte) 66);
        setByteElement(term569114, 12, (byte) 67);
        setByteElement(term569114, 13, (byte) 68);
        setByteElement(term569114, 14, (byte) 69);
        setByteElement(term569114, 15, (byte) 70);
        setByteElement(term569114, 16, (byte) 71);
        setByteElement(term569114, 17, (byte) 72);
        setByteElement(term569114, 18, (byte) 73);
        setByteElement(term569114, 19, (byte) 74);
        setByteElement(term569114, 20, (byte) 75);
        setByteElement(term569114, 21, (byte) 76);
        setByteElement(term569114, 22, (byte) 77);
        setByteElement(term569114, 23, (byte) 78);
        setByteElement(term569114, 24, (byte) 79);
        setByteElement(term569114, 25, (byte) 80);
        setByteElement(term569114, 26, (byte) 81);
        setByteElement(term569114, 27, (byte) 82);
        setByteElement(term569114, 28, (byte) 83);
        setByteElement(term569114, 29, (byte) 84);
        setByteElement(term569114, 30, (byte) 85);
        setByteElement(term569114, 31, (byte) 86);
        setField(term569112, term569112.getClass(), "encodeTable", term569114);
        setField(term569112, term569112.getClass(), "lineSeparator", term569115);
        setByteField(term569112, term569112.getClass(), "PAD", (byte) 61);
        setByteField(term569112, term569112.getClass(), "pad", (byte) 61);
        setIntField(term569112, term569112.getClass(), "unencodedBlockSize", 5);
        setIntField(term569112, term569112.getClass(), "encodedBlockSize", 8);
        setIntField(term569112, term569112.getClass(), "lineLength", 0);
        setIntField(term569112, term569112.getClass(), "chunkSeparatorLength", 7);
        term569116 = (byte[]) newByteArray(7);
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
        args[1] = term561279;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term569112));
        assertTrue(recursiveEquals(term561279, term569116));
    }

};


