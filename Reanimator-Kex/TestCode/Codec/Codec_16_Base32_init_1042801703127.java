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

public class Base32_init_1042801703127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180732;
     Object term185607;
     Object term185611;

    public Base32_init_1042801703127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term184989 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term181743 = (byte[]) newByteArray(0);
        byte[] term183794 = (byte[]) newByteArray(0);
        setByteField(term184989, term184989.getClass(), "PAD", (byte) 0);
        setIntField(term184989, term184989.getClass(), "unencodedBlockSize", 0);
        setIntField(term184989, term184989.getClass(), "encodedBlockSize", 0);
        setIntField(term184989, term184989.getClass(), "lineLength", 0);
        setIntField(term184989, term184989.getClass(), "chunkSeparatorLength", 0);
        setByteField(term184989, term184989.getClass(), "pad", (byte) 0);
        setField(term184989, term184989.getClass(), "encodeTable", null);
        setField(term184989, term184989.getClass(), "decodeTable", term181743);
        setIntField(term184989, term184989.getClass(), "encodeSize", 0);
        setField(term184989, term184989.getClass(), "lineSeparator", term183794);
        setIntField(term184989, term184989.getClass(), "decodeSize", 0);
        term180732 = (byte[]) newByteArray(2);
        term185607 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term185608 = (byte[]) newByteArray(88);
        byte[] term185609 = (byte[]) newByteArray(32);
        byte[] term185610 = (byte[]) newByteArray(2);
        setIntField(term185607, term185607.getClass(), "decodeSize", 9);
        setByteElement(term185608, 0, (byte) -1);
        setByteElement(term185608, 1, (byte) -1);
        setByteElement(term185608, 2, (byte) -1);
        setByteElement(term185608, 3, (byte) -1);
        setByteElement(term185608, 4, (byte) -1);
        setByteElement(term185608, 5, (byte) -1);
        setByteElement(term185608, 6, (byte) -1);
        setByteElement(term185608, 7, (byte) -1);
        setByteElement(term185608, 8, (byte) -1);
        setByteElement(term185608, 9, (byte) -1);
        setByteElement(term185608, 10, (byte) -1);
        setByteElement(term185608, 11, (byte) -1);
        setByteElement(term185608, 12, (byte) -1);
        setByteElement(term185608, 13, (byte) -1);
        setByteElement(term185608, 14, (byte) -1);
        setByteElement(term185608, 15, (byte) -1);
        setByteElement(term185608, 16, (byte) -1);
        setByteElement(term185608, 17, (byte) -1);
        setByteElement(term185608, 18, (byte) -1);
        setByteElement(term185608, 19, (byte) -1);
        setByteElement(term185608, 20, (byte) -1);
        setByteElement(term185608, 21, (byte) -1);
        setByteElement(term185608, 22, (byte) -1);
        setByteElement(term185608, 23, (byte) -1);
        setByteElement(term185608, 24, (byte) -1);
        setByteElement(term185608, 25, (byte) -1);
        setByteElement(term185608, 26, (byte) -1);
        setByteElement(term185608, 27, (byte) -1);
        setByteElement(term185608, 28, (byte) -1);
        setByteElement(term185608, 29, (byte) -1);
        setByteElement(term185608, 30, (byte) -1);
        setByteElement(term185608, 31, (byte) -1);
        setByteElement(term185608, 32, (byte) -1);
        setByteElement(term185608, 33, (byte) -1);
        setByteElement(term185608, 34, (byte) -1);
        setByteElement(term185608, 35, (byte) -1);
        setByteElement(term185608, 36, (byte) -1);
        setByteElement(term185608, 37, (byte) -1);
        setByteElement(term185608, 38, (byte) -1);
        setByteElement(term185608, 39, (byte) -1);
        setByteElement(term185608, 40, (byte) -1);
        setByteElement(term185608, 41, (byte) -1);
        setByteElement(term185608, 42, (byte) -1);
        setByteElement(term185608, 43, (byte) -1);
        setByteElement(term185608, 44, (byte) -1);
        setByteElement(term185608, 45, (byte) -1);
        setByteElement(term185608, 46, (byte) -1);
        setByteElement(term185608, 47, (byte) -1);
        setByteElement(term185608, 49, (byte) 1);
        setByteElement(term185608, 50, (byte) 2);
        setByteElement(term185608, 51, (byte) 3);
        setByteElement(term185608, 52, (byte) 4);
        setByteElement(term185608, 53, (byte) 5);
        setByteElement(term185608, 54, (byte) 6);
        setByteElement(term185608, 55, (byte) 7);
        setByteElement(term185608, 56, (byte) 8);
        setByteElement(term185608, 57, (byte) 9);
        setByteElement(term185608, 58, (byte) -1);
        setByteElement(term185608, 59, (byte) -1);
        setByteElement(term185608, 60, (byte) -1);
        setByteElement(term185608, 61, (byte) -1);
        setByteElement(term185608, 62, (byte) -1);
        setByteElement(term185608, 63, (byte) -1);
        setByteElement(term185608, 64, (byte) -1);
        setByteElement(term185608, 65, (byte) 10);
        setByteElement(term185608, 66, (byte) 11);
        setByteElement(term185608, 67, (byte) 12);
        setByteElement(term185608, 68, (byte) 13);
        setByteElement(term185608, 69, (byte) 14);
        setByteElement(term185608, 70, (byte) 15);
        setByteElement(term185608, 71, (byte) 16);
        setByteElement(term185608, 72, (byte) 17);
        setByteElement(term185608, 73, (byte) 18);
        setByteElement(term185608, 74, (byte) 19);
        setByteElement(term185608, 75, (byte) 20);
        setByteElement(term185608, 76, (byte) 21);
        setByteElement(term185608, 77, (byte) 22);
        setByteElement(term185608, 78, (byte) 23);
        setByteElement(term185608, 79, (byte) 24);
        setByteElement(term185608, 80, (byte) 25);
        setByteElement(term185608, 81, (byte) 26);
        setByteElement(term185608, 82, (byte) 27);
        setByteElement(term185608, 83, (byte) 28);
        setByteElement(term185608, 84, (byte) 29);
        setByteElement(term185608, 85, (byte) 30);
        setByteElement(term185608, 86, (byte) 31);
        setByteElement(term185608, 87, (byte) 32);
        setField(term185607, term185607.getClass(), "decodeTable", term185608);
        setIntField(term185607, term185607.getClass(), "encodeSize", 10);
        setByteElement(term185609, 0, (byte) 48);
        setByteElement(term185609, 1, (byte) 49);
        setByteElement(term185609, 2, (byte) 50);
        setByteElement(term185609, 3, (byte) 51);
        setByteElement(term185609, 4, (byte) 52);
        setByteElement(term185609, 5, (byte) 53);
        setByteElement(term185609, 6, (byte) 54);
        setByteElement(term185609, 7, (byte) 55);
        setByteElement(term185609, 8, (byte) 56);
        setByteElement(term185609, 9, (byte) 57);
        setByteElement(term185609, 10, (byte) 65);
        setByteElement(term185609, 11, (byte) 66);
        setByteElement(term185609, 12, (byte) 67);
        setByteElement(term185609, 13, (byte) 68);
        setByteElement(term185609, 14, (byte) 69);
        setByteElement(term185609, 15, (byte) 70);
        setByteElement(term185609, 16, (byte) 71);
        setByteElement(term185609, 17, (byte) 72);
        setByteElement(term185609, 18, (byte) 73);
        setByteElement(term185609, 19, (byte) 74);
        setByteElement(term185609, 20, (byte) 75);
        setByteElement(term185609, 21, (byte) 76);
        setByteElement(term185609, 22, (byte) 77);
        setByteElement(term185609, 23, (byte) 78);
        setByteElement(term185609, 24, (byte) 79);
        setByteElement(term185609, 25, (byte) 80);
        setByteElement(term185609, 26, (byte) 81);
        setByteElement(term185609, 27, (byte) 82);
        setByteElement(term185609, 28, (byte) 83);
        setByteElement(term185609, 29, (byte) 84);
        setByteElement(term185609, 30, (byte) 85);
        setByteElement(term185609, 31, (byte) 86);
        setField(term185607, term185607.getClass(), "encodeTable", term185609);
        setField(term185607, term185607.getClass(), "lineSeparator", term185610);
        setByteField(term185607, term185607.getClass(), "PAD", (byte) 61);
        setByteField(term185607, term185607.getClass(), "pad", (byte) 61);
        setIntField(term185607, term185607.getClass(), "unencodedBlockSize", 5);
        setIntField(term185607, term185607.getClass(), "encodedBlockSize", 8);
        setIntField(term185607, term185607.getClass(), "lineLength", 0);
        setIntField(term185607, term185607.getClass(), "chunkSeparatorLength", 2);
        term185611 = (byte[]) newByteArray(2);
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
        args[1] = term180732;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term185607));
        assertTrue(recursiveEquals(term180732, term185611));
    }

};


