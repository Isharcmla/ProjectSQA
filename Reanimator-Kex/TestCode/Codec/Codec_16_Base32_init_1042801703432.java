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

public class Base32_init_1042801703432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term877634;
     Object term924610;
     Object term924614;

    public Base32_init_1042801703432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term882935 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term878646 = (byte[]) newByteArray(0);
        byte[] term881721 = (byte[]) newByteArray(0);
        setByteField(term882935, term882935.getClass(), "PAD", (byte) 0);
        setIntField(term882935, term882935.getClass(), "unencodedBlockSize", 0);
        setIntField(term882935, term882935.getClass(), "encodedBlockSize", 0);
        setIntField(term882935, term882935.getClass(), "lineLength", 0);
        setIntField(term882935, term882935.getClass(), "chunkSeparatorLength", 0);
        setByteField(term882935, term882935.getClass(), "pad", (byte) -128);
        setField(term882935, term882935.getClass(), "encodeTable", null);
        setField(term882935, term882935.getClass(), "decodeTable", term878646);
        setIntField(term882935, term882935.getClass(), "encodeSize", 0);
        setField(term882935, term882935.getClass(), "lineSeparator", term881721);
        setIntField(term882935, term882935.getClass(), "decodeSize", 0);
        term877634 = (byte[]) newByteArray(3);
        term924610 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term924611 = (byte[]) newByteArray(88);
        byte[] term924612 = (byte[]) newByteArray(32);
        byte[] term924613 = (byte[]) newByteArray(3);
        setIntField(term924610, term924610.getClass(), "decodeSize", 10);
        setByteElement(term924611, 0, (byte) -1);
        setByteElement(term924611, 1, (byte) -1);
        setByteElement(term924611, 2, (byte) -1);
        setByteElement(term924611, 3, (byte) -1);
        setByteElement(term924611, 4, (byte) -1);
        setByteElement(term924611, 5, (byte) -1);
        setByteElement(term924611, 6, (byte) -1);
        setByteElement(term924611, 7, (byte) -1);
        setByteElement(term924611, 8, (byte) -1);
        setByteElement(term924611, 9, (byte) -1);
        setByteElement(term924611, 10, (byte) -1);
        setByteElement(term924611, 11, (byte) -1);
        setByteElement(term924611, 12, (byte) -1);
        setByteElement(term924611, 13, (byte) -1);
        setByteElement(term924611, 14, (byte) -1);
        setByteElement(term924611, 15, (byte) -1);
        setByteElement(term924611, 16, (byte) -1);
        setByteElement(term924611, 17, (byte) -1);
        setByteElement(term924611, 18, (byte) -1);
        setByteElement(term924611, 19, (byte) -1);
        setByteElement(term924611, 20, (byte) -1);
        setByteElement(term924611, 21, (byte) -1);
        setByteElement(term924611, 22, (byte) -1);
        setByteElement(term924611, 23, (byte) -1);
        setByteElement(term924611, 24, (byte) -1);
        setByteElement(term924611, 25, (byte) -1);
        setByteElement(term924611, 26, (byte) -1);
        setByteElement(term924611, 27, (byte) -1);
        setByteElement(term924611, 28, (byte) -1);
        setByteElement(term924611, 29, (byte) -1);
        setByteElement(term924611, 30, (byte) -1);
        setByteElement(term924611, 31, (byte) -1);
        setByteElement(term924611, 32, (byte) -1);
        setByteElement(term924611, 33, (byte) -1);
        setByteElement(term924611, 34, (byte) -1);
        setByteElement(term924611, 35, (byte) -1);
        setByteElement(term924611, 36, (byte) -1);
        setByteElement(term924611, 37, (byte) -1);
        setByteElement(term924611, 38, (byte) -1);
        setByteElement(term924611, 39, (byte) -1);
        setByteElement(term924611, 40, (byte) -1);
        setByteElement(term924611, 41, (byte) -1);
        setByteElement(term924611, 42, (byte) -1);
        setByteElement(term924611, 43, (byte) -1);
        setByteElement(term924611, 44, (byte) -1);
        setByteElement(term924611, 45, (byte) -1);
        setByteElement(term924611, 46, (byte) -1);
        setByteElement(term924611, 47, (byte) -1);
        setByteElement(term924611, 49, (byte) 1);
        setByteElement(term924611, 50, (byte) 2);
        setByteElement(term924611, 51, (byte) 3);
        setByteElement(term924611, 52, (byte) 4);
        setByteElement(term924611, 53, (byte) 5);
        setByteElement(term924611, 54, (byte) 6);
        setByteElement(term924611, 55, (byte) 7);
        setByteElement(term924611, 56, (byte) 8);
        setByteElement(term924611, 57, (byte) 9);
        setByteElement(term924611, 58, (byte) -1);
        setByteElement(term924611, 59, (byte) -1);
        setByteElement(term924611, 60, (byte) -1);
        setByteElement(term924611, 61, (byte) -1);
        setByteElement(term924611, 62, (byte) -1);
        setByteElement(term924611, 63, (byte) -1);
        setByteElement(term924611, 64, (byte) -1);
        setByteElement(term924611, 65, (byte) 10);
        setByteElement(term924611, 66, (byte) 11);
        setByteElement(term924611, 67, (byte) 12);
        setByteElement(term924611, 68, (byte) 13);
        setByteElement(term924611, 69, (byte) 14);
        setByteElement(term924611, 70, (byte) 15);
        setByteElement(term924611, 71, (byte) 16);
        setByteElement(term924611, 72, (byte) 17);
        setByteElement(term924611, 73, (byte) 18);
        setByteElement(term924611, 74, (byte) 19);
        setByteElement(term924611, 75, (byte) 20);
        setByteElement(term924611, 76, (byte) 21);
        setByteElement(term924611, 77, (byte) 22);
        setByteElement(term924611, 78, (byte) 23);
        setByteElement(term924611, 79, (byte) 24);
        setByteElement(term924611, 80, (byte) 25);
        setByteElement(term924611, 81, (byte) 26);
        setByteElement(term924611, 82, (byte) 27);
        setByteElement(term924611, 83, (byte) 28);
        setByteElement(term924611, 84, (byte) 29);
        setByteElement(term924611, 85, (byte) 30);
        setByteElement(term924611, 86, (byte) 31);
        setByteElement(term924611, 87, (byte) 32);
        setField(term924610, term924610.getClass(), "decodeTable", term924611);
        setIntField(term924610, term924610.getClass(), "encodeSize", 11);
        setByteElement(term924612, 0, (byte) 48);
        setByteElement(term924612, 1, (byte) 49);
        setByteElement(term924612, 2, (byte) 50);
        setByteElement(term924612, 3, (byte) 51);
        setByteElement(term924612, 4, (byte) 52);
        setByteElement(term924612, 5, (byte) 53);
        setByteElement(term924612, 6, (byte) 54);
        setByteElement(term924612, 7, (byte) 55);
        setByteElement(term924612, 8, (byte) 56);
        setByteElement(term924612, 9, (byte) 57);
        setByteElement(term924612, 10, (byte) 65);
        setByteElement(term924612, 11, (byte) 66);
        setByteElement(term924612, 12, (byte) 67);
        setByteElement(term924612, 13, (byte) 68);
        setByteElement(term924612, 14, (byte) 69);
        setByteElement(term924612, 15, (byte) 70);
        setByteElement(term924612, 16, (byte) 71);
        setByteElement(term924612, 17, (byte) 72);
        setByteElement(term924612, 18, (byte) 73);
        setByteElement(term924612, 19, (byte) 74);
        setByteElement(term924612, 20, (byte) 75);
        setByteElement(term924612, 21, (byte) 76);
        setByteElement(term924612, 22, (byte) 77);
        setByteElement(term924612, 23, (byte) 78);
        setByteElement(term924612, 24, (byte) 79);
        setByteElement(term924612, 25, (byte) 80);
        setByteElement(term924612, 26, (byte) 81);
        setByteElement(term924612, 27, (byte) 82);
        setByteElement(term924612, 28, (byte) 83);
        setByteElement(term924612, 29, (byte) 84);
        setByteElement(term924612, 30, (byte) 85);
        setByteElement(term924612, 31, (byte) 86);
        setField(term924610, term924610.getClass(), "encodeTable", term924612);
        setField(term924610, term924610.getClass(), "lineSeparator", term924613);
        setByteField(term924610, term924610.getClass(), "PAD", (byte) 61);
        setByteField(term924610, term924610.getClass(), "pad", (byte) 61);
        setIntField(term924610, term924610.getClass(), "unencodedBlockSize", 5);
        setIntField(term924610, term924610.getClass(), "encodedBlockSize", 8);
        setIntField(term924610, term924610.getClass(), "lineLength", 0);
        setIntField(term924610, term924610.getClass(), "chunkSeparatorLength", 3);
        term924614 = (byte[]) newByteArray(3);
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
        args[1] = term877634;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term924610));
        assertTrue(recursiveEquals(term877634, term924614));
    }

};


