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

public class Base32_init_1042801703184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355966;
     Object term368956;
     Object term368960;

    public Base32_init_1042801703184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term367519 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term356984 = (byte[]) newByteArray(0);
        byte[] term366203 = (byte[]) newByteArray(0);
        setByteField(term367519, term367519.getClass(), "PAD", (byte) 0);
        setIntField(term367519, term367519.getClass(), "unencodedBlockSize", 0);
        setIntField(term367519, term367519.getClass(), "encodedBlockSize", 0);
        setIntField(term367519, term367519.getClass(), "lineLength", 0);
        setIntField(term367519, term367519.getClass(), "chunkSeparatorLength", 0);
        setByteField(term367519, term367519.getClass(), "pad", (byte) -128);
        setField(term367519, term367519.getClass(), "encodeTable", null);
        setField(term367519, term367519.getClass(), "decodeTable", term356984);
        setIntField(term367519, term367519.getClass(), "encodeSize", 0);
        setField(term367519, term367519.getClass(), "lineSeparator", term366203);
        setIntField(term367519, term367519.getClass(), "decodeSize", 0);
        term355966 = (byte[]) newByteArray(9);
        term368956 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term368957 = (byte[]) newByteArray(88);
        byte[] term368958 = (byte[]) newByteArray(32);
        byte[] term368959 = (byte[]) newByteArray(9);
        setIntField(term368956, term368956.getClass(), "decodeSize", 16);
        setByteElement(term368957, 0, (byte) -1);
        setByteElement(term368957, 1, (byte) -1);
        setByteElement(term368957, 2, (byte) -1);
        setByteElement(term368957, 3, (byte) -1);
        setByteElement(term368957, 4, (byte) -1);
        setByteElement(term368957, 5, (byte) -1);
        setByteElement(term368957, 6, (byte) -1);
        setByteElement(term368957, 7, (byte) -1);
        setByteElement(term368957, 8, (byte) -1);
        setByteElement(term368957, 9, (byte) -1);
        setByteElement(term368957, 10, (byte) -1);
        setByteElement(term368957, 11, (byte) -1);
        setByteElement(term368957, 12, (byte) -1);
        setByteElement(term368957, 13, (byte) -1);
        setByteElement(term368957, 14, (byte) -1);
        setByteElement(term368957, 15, (byte) -1);
        setByteElement(term368957, 16, (byte) -1);
        setByteElement(term368957, 17, (byte) -1);
        setByteElement(term368957, 18, (byte) -1);
        setByteElement(term368957, 19, (byte) -1);
        setByteElement(term368957, 20, (byte) -1);
        setByteElement(term368957, 21, (byte) -1);
        setByteElement(term368957, 22, (byte) -1);
        setByteElement(term368957, 23, (byte) -1);
        setByteElement(term368957, 24, (byte) -1);
        setByteElement(term368957, 25, (byte) -1);
        setByteElement(term368957, 26, (byte) -1);
        setByteElement(term368957, 27, (byte) -1);
        setByteElement(term368957, 28, (byte) -1);
        setByteElement(term368957, 29, (byte) -1);
        setByteElement(term368957, 30, (byte) -1);
        setByteElement(term368957, 31, (byte) -1);
        setByteElement(term368957, 32, (byte) -1);
        setByteElement(term368957, 33, (byte) -1);
        setByteElement(term368957, 34, (byte) -1);
        setByteElement(term368957, 35, (byte) -1);
        setByteElement(term368957, 36, (byte) -1);
        setByteElement(term368957, 37, (byte) -1);
        setByteElement(term368957, 38, (byte) -1);
        setByteElement(term368957, 39, (byte) -1);
        setByteElement(term368957, 40, (byte) -1);
        setByteElement(term368957, 41, (byte) -1);
        setByteElement(term368957, 42, (byte) -1);
        setByteElement(term368957, 43, (byte) -1);
        setByteElement(term368957, 44, (byte) -1);
        setByteElement(term368957, 45, (byte) -1);
        setByteElement(term368957, 46, (byte) -1);
        setByteElement(term368957, 47, (byte) -1);
        setByteElement(term368957, 49, (byte) 1);
        setByteElement(term368957, 50, (byte) 2);
        setByteElement(term368957, 51, (byte) 3);
        setByteElement(term368957, 52, (byte) 4);
        setByteElement(term368957, 53, (byte) 5);
        setByteElement(term368957, 54, (byte) 6);
        setByteElement(term368957, 55, (byte) 7);
        setByteElement(term368957, 56, (byte) 8);
        setByteElement(term368957, 57, (byte) 9);
        setByteElement(term368957, 58, (byte) -1);
        setByteElement(term368957, 59, (byte) -1);
        setByteElement(term368957, 60, (byte) -1);
        setByteElement(term368957, 61, (byte) -1);
        setByteElement(term368957, 62, (byte) -1);
        setByteElement(term368957, 63, (byte) -1);
        setByteElement(term368957, 64, (byte) -1);
        setByteElement(term368957, 65, (byte) 10);
        setByteElement(term368957, 66, (byte) 11);
        setByteElement(term368957, 67, (byte) 12);
        setByteElement(term368957, 68, (byte) 13);
        setByteElement(term368957, 69, (byte) 14);
        setByteElement(term368957, 70, (byte) 15);
        setByteElement(term368957, 71, (byte) 16);
        setByteElement(term368957, 72, (byte) 17);
        setByteElement(term368957, 73, (byte) 18);
        setByteElement(term368957, 74, (byte) 19);
        setByteElement(term368957, 75, (byte) 20);
        setByteElement(term368957, 76, (byte) 21);
        setByteElement(term368957, 77, (byte) 22);
        setByteElement(term368957, 78, (byte) 23);
        setByteElement(term368957, 79, (byte) 24);
        setByteElement(term368957, 80, (byte) 25);
        setByteElement(term368957, 81, (byte) 26);
        setByteElement(term368957, 82, (byte) 27);
        setByteElement(term368957, 83, (byte) 28);
        setByteElement(term368957, 84, (byte) 29);
        setByteElement(term368957, 85, (byte) 30);
        setByteElement(term368957, 86, (byte) 31);
        setByteElement(term368957, 87, (byte) 32);
        setField(term368956, term368956.getClass(), "decodeTable", term368957);
        setIntField(term368956, term368956.getClass(), "encodeSize", 17);
        setByteElement(term368958, 0, (byte) 48);
        setByteElement(term368958, 1, (byte) 49);
        setByteElement(term368958, 2, (byte) 50);
        setByteElement(term368958, 3, (byte) 51);
        setByteElement(term368958, 4, (byte) 52);
        setByteElement(term368958, 5, (byte) 53);
        setByteElement(term368958, 6, (byte) 54);
        setByteElement(term368958, 7, (byte) 55);
        setByteElement(term368958, 8, (byte) 56);
        setByteElement(term368958, 9, (byte) 57);
        setByteElement(term368958, 10, (byte) 65);
        setByteElement(term368958, 11, (byte) 66);
        setByteElement(term368958, 12, (byte) 67);
        setByteElement(term368958, 13, (byte) 68);
        setByteElement(term368958, 14, (byte) 69);
        setByteElement(term368958, 15, (byte) 70);
        setByteElement(term368958, 16, (byte) 71);
        setByteElement(term368958, 17, (byte) 72);
        setByteElement(term368958, 18, (byte) 73);
        setByteElement(term368958, 19, (byte) 74);
        setByteElement(term368958, 20, (byte) 75);
        setByteElement(term368958, 21, (byte) 76);
        setByteElement(term368958, 22, (byte) 77);
        setByteElement(term368958, 23, (byte) 78);
        setByteElement(term368958, 24, (byte) 79);
        setByteElement(term368958, 25, (byte) 80);
        setByteElement(term368958, 26, (byte) 81);
        setByteElement(term368958, 27, (byte) 82);
        setByteElement(term368958, 28, (byte) 83);
        setByteElement(term368958, 29, (byte) 84);
        setByteElement(term368958, 30, (byte) 85);
        setByteElement(term368958, 31, (byte) 86);
        setField(term368956, term368956.getClass(), "encodeTable", term368958);
        setField(term368956, term368956.getClass(), "lineSeparator", term368959);
        setByteField(term368956, term368956.getClass(), "PAD", (byte) 61);
        setByteField(term368956, term368956.getClass(), "pad", (byte) 61);
        setIntField(term368956, term368956.getClass(), "unencodedBlockSize", 5);
        setIntField(term368956, term368956.getClass(), "encodedBlockSize", 8);
        setIntField(term368956, term368956.getClass(), "lineLength", 0);
        setIntField(term368956, term368956.getClass(), "chunkSeparatorLength", 9);
        term368960 = (byte[]) newByteArray(9);
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
        args[1] = term355966;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term368956));
        assertTrue(recursiveEquals(term355966, term368960));
    }

};


