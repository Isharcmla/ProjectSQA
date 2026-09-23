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

public class Base32_init_1042801703418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854547;
     Object term862735;
     Object term862739;

    public Base32_init_1042801703418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term859848 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term855559 = (byte[]) newByteArray(0);
        byte[] term858634 = (byte[]) newByteArray(0);
        setByteField(term859848, term859848.getClass(), "PAD", (byte) 0);
        setIntField(term859848, term859848.getClass(), "unencodedBlockSize", 0);
        setIntField(term859848, term859848.getClass(), "encodedBlockSize", 0);
        setIntField(term859848, term859848.getClass(), "lineLength", 0);
        setIntField(term859848, term859848.getClass(), "chunkSeparatorLength", 0);
        setByteField(term859848, term859848.getClass(), "pad", (byte) -128);
        setField(term859848, term859848.getClass(), "encodeTable", null);
        setField(term859848, term859848.getClass(), "decodeTable", term855559);
        setIntField(term859848, term859848.getClass(), "encodeSize", 0);
        setField(term859848, term859848.getClass(), "lineSeparator", term858634);
        setIntField(term859848, term859848.getClass(), "decodeSize", 0);
        term854547 = (byte[]) newByteArray(3);
        term862735 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term862736 = (byte[]) newByteArray(88);
        byte[] term862737 = (byte[]) newByteArray(32);
        byte[] term862738 = (byte[]) newByteArray(3);
        setIntField(term862735, term862735.getClass(), "decodeSize", 10);
        setByteElement(term862736, 0, (byte) -1);
        setByteElement(term862736, 1, (byte) -1);
        setByteElement(term862736, 2, (byte) -1);
        setByteElement(term862736, 3, (byte) -1);
        setByteElement(term862736, 4, (byte) -1);
        setByteElement(term862736, 5, (byte) -1);
        setByteElement(term862736, 6, (byte) -1);
        setByteElement(term862736, 7, (byte) -1);
        setByteElement(term862736, 8, (byte) -1);
        setByteElement(term862736, 9, (byte) -1);
        setByteElement(term862736, 10, (byte) -1);
        setByteElement(term862736, 11, (byte) -1);
        setByteElement(term862736, 12, (byte) -1);
        setByteElement(term862736, 13, (byte) -1);
        setByteElement(term862736, 14, (byte) -1);
        setByteElement(term862736, 15, (byte) -1);
        setByteElement(term862736, 16, (byte) -1);
        setByteElement(term862736, 17, (byte) -1);
        setByteElement(term862736, 18, (byte) -1);
        setByteElement(term862736, 19, (byte) -1);
        setByteElement(term862736, 20, (byte) -1);
        setByteElement(term862736, 21, (byte) -1);
        setByteElement(term862736, 22, (byte) -1);
        setByteElement(term862736, 23, (byte) -1);
        setByteElement(term862736, 24, (byte) -1);
        setByteElement(term862736, 25, (byte) -1);
        setByteElement(term862736, 26, (byte) -1);
        setByteElement(term862736, 27, (byte) -1);
        setByteElement(term862736, 28, (byte) -1);
        setByteElement(term862736, 29, (byte) -1);
        setByteElement(term862736, 30, (byte) -1);
        setByteElement(term862736, 31, (byte) -1);
        setByteElement(term862736, 32, (byte) -1);
        setByteElement(term862736, 33, (byte) -1);
        setByteElement(term862736, 34, (byte) -1);
        setByteElement(term862736, 35, (byte) -1);
        setByteElement(term862736, 36, (byte) -1);
        setByteElement(term862736, 37, (byte) -1);
        setByteElement(term862736, 38, (byte) -1);
        setByteElement(term862736, 39, (byte) -1);
        setByteElement(term862736, 40, (byte) -1);
        setByteElement(term862736, 41, (byte) -1);
        setByteElement(term862736, 42, (byte) -1);
        setByteElement(term862736, 43, (byte) -1);
        setByteElement(term862736, 44, (byte) -1);
        setByteElement(term862736, 45, (byte) -1);
        setByteElement(term862736, 46, (byte) -1);
        setByteElement(term862736, 47, (byte) -1);
        setByteElement(term862736, 49, (byte) 1);
        setByteElement(term862736, 50, (byte) 2);
        setByteElement(term862736, 51, (byte) 3);
        setByteElement(term862736, 52, (byte) 4);
        setByteElement(term862736, 53, (byte) 5);
        setByteElement(term862736, 54, (byte) 6);
        setByteElement(term862736, 55, (byte) 7);
        setByteElement(term862736, 56, (byte) 8);
        setByteElement(term862736, 57, (byte) 9);
        setByteElement(term862736, 58, (byte) -1);
        setByteElement(term862736, 59, (byte) -1);
        setByteElement(term862736, 60, (byte) -1);
        setByteElement(term862736, 61, (byte) -1);
        setByteElement(term862736, 62, (byte) -1);
        setByteElement(term862736, 63, (byte) -1);
        setByteElement(term862736, 64, (byte) -1);
        setByteElement(term862736, 65, (byte) 10);
        setByteElement(term862736, 66, (byte) 11);
        setByteElement(term862736, 67, (byte) 12);
        setByteElement(term862736, 68, (byte) 13);
        setByteElement(term862736, 69, (byte) 14);
        setByteElement(term862736, 70, (byte) 15);
        setByteElement(term862736, 71, (byte) 16);
        setByteElement(term862736, 72, (byte) 17);
        setByteElement(term862736, 73, (byte) 18);
        setByteElement(term862736, 74, (byte) 19);
        setByteElement(term862736, 75, (byte) 20);
        setByteElement(term862736, 76, (byte) 21);
        setByteElement(term862736, 77, (byte) 22);
        setByteElement(term862736, 78, (byte) 23);
        setByteElement(term862736, 79, (byte) 24);
        setByteElement(term862736, 80, (byte) 25);
        setByteElement(term862736, 81, (byte) 26);
        setByteElement(term862736, 82, (byte) 27);
        setByteElement(term862736, 83, (byte) 28);
        setByteElement(term862736, 84, (byte) 29);
        setByteElement(term862736, 85, (byte) 30);
        setByteElement(term862736, 86, (byte) 31);
        setByteElement(term862736, 87, (byte) 32);
        setField(term862735, term862735.getClass(), "decodeTable", term862736);
        setIntField(term862735, term862735.getClass(), "encodeSize", 11);
        setByteElement(term862737, 0, (byte) 48);
        setByteElement(term862737, 1, (byte) 49);
        setByteElement(term862737, 2, (byte) 50);
        setByteElement(term862737, 3, (byte) 51);
        setByteElement(term862737, 4, (byte) 52);
        setByteElement(term862737, 5, (byte) 53);
        setByteElement(term862737, 6, (byte) 54);
        setByteElement(term862737, 7, (byte) 55);
        setByteElement(term862737, 8, (byte) 56);
        setByteElement(term862737, 9, (byte) 57);
        setByteElement(term862737, 10, (byte) 65);
        setByteElement(term862737, 11, (byte) 66);
        setByteElement(term862737, 12, (byte) 67);
        setByteElement(term862737, 13, (byte) 68);
        setByteElement(term862737, 14, (byte) 69);
        setByteElement(term862737, 15, (byte) 70);
        setByteElement(term862737, 16, (byte) 71);
        setByteElement(term862737, 17, (byte) 72);
        setByteElement(term862737, 18, (byte) 73);
        setByteElement(term862737, 19, (byte) 74);
        setByteElement(term862737, 20, (byte) 75);
        setByteElement(term862737, 21, (byte) 76);
        setByteElement(term862737, 22, (byte) 77);
        setByteElement(term862737, 23, (byte) 78);
        setByteElement(term862737, 24, (byte) 79);
        setByteElement(term862737, 25, (byte) 80);
        setByteElement(term862737, 26, (byte) 81);
        setByteElement(term862737, 27, (byte) 82);
        setByteElement(term862737, 28, (byte) 83);
        setByteElement(term862737, 29, (byte) 84);
        setByteElement(term862737, 30, (byte) 85);
        setByteElement(term862737, 31, (byte) 86);
        setField(term862735, term862735.getClass(), "encodeTable", term862737);
        setField(term862735, term862735.getClass(), "lineSeparator", term862738);
        setByteField(term862735, term862735.getClass(), "PAD", (byte) 61);
        setByteField(term862735, term862735.getClass(), "pad", (byte) 61);
        setIntField(term862735, term862735.getClass(), "unencodedBlockSize", 5);
        setIntField(term862735, term862735.getClass(), "encodedBlockSize", 8);
        setIntField(term862735, term862735.getClass(), "lineLength", 0);
        setIntField(term862735, term862735.getClass(), "chunkSeparatorLength", 3);
        term862739 = (byte[]) newByteArray(3);
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
        args[1] = term854547;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term862735));
        assertTrue(recursiveEquals(term854547, term862739));
    }

};


