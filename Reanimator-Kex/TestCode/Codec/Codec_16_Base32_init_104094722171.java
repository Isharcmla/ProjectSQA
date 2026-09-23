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

public class Base32_init_104094722171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47180;

    public Base32_init_104094722171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46720 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term46720, term46720.getClass(), "PAD", (byte) 0);
        setIntField(term46720, term46720.getClass(), "unencodedBlockSize", 0);
        setIntField(term46720, term46720.getClass(), "encodedBlockSize", 0);
        setIntField(term46720, term46720.getClass(), "lineLength", 0);
        setIntField(term46720, term46720.getClass(), "chunkSeparatorLength", 0);
        setByteField(term46720, term46720.getClass(), "pad", (byte) 0);
        term47180 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term47181 = (byte[]) newByteArray(88);
        byte[] term47182 = (byte[]) newByteArray(32);
        setIntField(term47180, term47180.getClass(), "decodeSize", 7);
        setByteElement(term47181, 0, (byte) -1);
        setByteElement(term47181, 1, (byte) -1);
        setByteElement(term47181, 2, (byte) -1);
        setByteElement(term47181, 3, (byte) -1);
        setByteElement(term47181, 4, (byte) -1);
        setByteElement(term47181, 5, (byte) -1);
        setByteElement(term47181, 6, (byte) -1);
        setByteElement(term47181, 7, (byte) -1);
        setByteElement(term47181, 8, (byte) -1);
        setByteElement(term47181, 9, (byte) -1);
        setByteElement(term47181, 10, (byte) -1);
        setByteElement(term47181, 11, (byte) -1);
        setByteElement(term47181, 12, (byte) -1);
        setByteElement(term47181, 13, (byte) -1);
        setByteElement(term47181, 14, (byte) -1);
        setByteElement(term47181, 15, (byte) -1);
        setByteElement(term47181, 16, (byte) -1);
        setByteElement(term47181, 17, (byte) -1);
        setByteElement(term47181, 18, (byte) -1);
        setByteElement(term47181, 19, (byte) -1);
        setByteElement(term47181, 20, (byte) -1);
        setByteElement(term47181, 21, (byte) -1);
        setByteElement(term47181, 22, (byte) -1);
        setByteElement(term47181, 23, (byte) -1);
        setByteElement(term47181, 24, (byte) -1);
        setByteElement(term47181, 25, (byte) -1);
        setByteElement(term47181, 26, (byte) -1);
        setByteElement(term47181, 27, (byte) -1);
        setByteElement(term47181, 28, (byte) -1);
        setByteElement(term47181, 29, (byte) -1);
        setByteElement(term47181, 30, (byte) -1);
        setByteElement(term47181, 31, (byte) -1);
        setByteElement(term47181, 32, (byte) -1);
        setByteElement(term47181, 33, (byte) -1);
        setByteElement(term47181, 34, (byte) -1);
        setByteElement(term47181, 35, (byte) -1);
        setByteElement(term47181, 36, (byte) -1);
        setByteElement(term47181, 37, (byte) -1);
        setByteElement(term47181, 38, (byte) -1);
        setByteElement(term47181, 39, (byte) -1);
        setByteElement(term47181, 40, (byte) -1);
        setByteElement(term47181, 41, (byte) -1);
        setByteElement(term47181, 42, (byte) -1);
        setByteElement(term47181, 43, (byte) -1);
        setByteElement(term47181, 44, (byte) -1);
        setByteElement(term47181, 45, (byte) -1);
        setByteElement(term47181, 46, (byte) -1);
        setByteElement(term47181, 47, (byte) -1);
        setByteElement(term47181, 49, (byte) 1);
        setByteElement(term47181, 50, (byte) 2);
        setByteElement(term47181, 51, (byte) 3);
        setByteElement(term47181, 52, (byte) 4);
        setByteElement(term47181, 53, (byte) 5);
        setByteElement(term47181, 54, (byte) 6);
        setByteElement(term47181, 55, (byte) 7);
        setByteElement(term47181, 56, (byte) 8);
        setByteElement(term47181, 57, (byte) 9);
        setByteElement(term47181, 58, (byte) -1);
        setByteElement(term47181, 59, (byte) -1);
        setByteElement(term47181, 60, (byte) -1);
        setByteElement(term47181, 61, (byte) -1);
        setByteElement(term47181, 62, (byte) -1);
        setByteElement(term47181, 63, (byte) -1);
        setByteElement(term47181, 64, (byte) -1);
        setByteElement(term47181, 65, (byte) 10);
        setByteElement(term47181, 66, (byte) 11);
        setByteElement(term47181, 67, (byte) 12);
        setByteElement(term47181, 68, (byte) 13);
        setByteElement(term47181, 69, (byte) 14);
        setByteElement(term47181, 70, (byte) 15);
        setByteElement(term47181, 71, (byte) 16);
        setByteElement(term47181, 72, (byte) 17);
        setByteElement(term47181, 73, (byte) 18);
        setByteElement(term47181, 74, (byte) 19);
        setByteElement(term47181, 75, (byte) 20);
        setByteElement(term47181, 76, (byte) 21);
        setByteElement(term47181, 77, (byte) 22);
        setByteElement(term47181, 78, (byte) 23);
        setByteElement(term47181, 79, (byte) 24);
        setByteElement(term47181, 80, (byte) 25);
        setByteElement(term47181, 81, (byte) 26);
        setByteElement(term47181, 82, (byte) 27);
        setByteElement(term47181, 83, (byte) 28);
        setByteElement(term47181, 84, (byte) 29);
        setByteElement(term47181, 85, (byte) 30);
        setByteElement(term47181, 86, (byte) 31);
        setByteElement(term47181, 87, (byte) 32);
        setField(term47180, term47180.getClass(), "decodeTable", term47181);
        setIntField(term47180, term47180.getClass(), "encodeSize", 8);
        setByteElement(term47182, 0, (byte) 48);
        setByteElement(term47182, 1, (byte) 49);
        setByteElement(term47182, 2, (byte) 50);
        setByteElement(term47182, 3, (byte) 51);
        setByteElement(term47182, 4, (byte) 52);
        setByteElement(term47182, 5, (byte) 53);
        setByteElement(term47182, 6, (byte) 54);
        setByteElement(term47182, 7, (byte) 55);
        setByteElement(term47182, 8, (byte) 56);
        setByteElement(term47182, 9, (byte) 57);
        setByteElement(term47182, 10, (byte) 65);
        setByteElement(term47182, 11, (byte) 66);
        setByteElement(term47182, 12, (byte) 67);
        setByteElement(term47182, 13, (byte) 68);
        setByteElement(term47182, 14, (byte) 69);
        setByteElement(term47182, 15, (byte) 70);
        setByteElement(term47182, 16, (byte) 71);
        setByteElement(term47182, 17, (byte) 72);
        setByteElement(term47182, 18, (byte) 73);
        setByteElement(term47182, 19, (byte) 74);
        setByteElement(term47182, 20, (byte) 75);
        setByteElement(term47182, 21, (byte) 76);
        setByteElement(term47182, 22, (byte) 77);
        setByteElement(term47182, 23, (byte) 78);
        setByteElement(term47182, 24, (byte) 79);
        setByteElement(term47182, 25, (byte) 80);
        setByteElement(term47182, 26, (byte) 81);
        setByteElement(term47182, 27, (byte) 82);
        setByteElement(term47182, 28, (byte) 83);
        setByteElement(term47182, 29, (byte) 84);
        setByteElement(term47182, 30, (byte) 85);
        setByteElement(term47182, 31, (byte) 86);
        setField(term47180, term47180.getClass(), "encodeTable", term47182);
        setField(term47180, term47180.getClass(), "lineSeparator", null);
        setByteField(term47180, term47180.getClass(), "PAD", (byte) 61);
        setByteField(term47180, term47180.getClass(), "pad", (byte) 0);
        setIntField(term47180, term47180.getClass(), "unencodedBlockSize", 5);
        setIntField(term47180, term47180.getClass(), "encodedBlockSize", 8);
        setIntField(term47180, term47180.getClass(), "lineLength", 0);
        setIntField(term47180, term47180.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = true;
        args[1] = (byte) 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term47180));
    }

};


