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

public class Base32_init_1040919135376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term778834;

    public Base32_init_1040919135376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term770793 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term770331 = (byte[]) newByteArray(0);
        setByteField(term770793, term770793.getClass(), "PAD", (byte) 0);
        setIntField(term770793, term770793.getClass(), "unencodedBlockSize", 0);
        setIntField(term770793, term770793.getClass(), "encodedBlockSize", 0);
        setIntField(term770793, term770793.getClass(), "lineLength", 0);
        setIntField(term770793, term770793.getClass(), "chunkSeparatorLength", 0);
        setByteField(term770793, term770793.getClass(), "pad", (byte) -128);
        setField(term770793, term770793.getClass(), "encodeTable", null);
        setField(term770793, term770793.getClass(), "decodeTable", term770331);
        term778834 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term778835 = (byte[]) newByteArray(91);
        byte[] term778836 = (byte[]) newByteArray(32);
        byte[] term778837 = (byte[]) newByteArray(2);
        setIntField(term778834, term778834.getClass(), "decodeSize", 9);
        setByteElement(term778835, 0, (byte) -1);
        setByteElement(term778835, 1, (byte) -1);
        setByteElement(term778835, 2, (byte) -1);
        setByteElement(term778835, 3, (byte) -1);
        setByteElement(term778835, 4, (byte) -1);
        setByteElement(term778835, 5, (byte) -1);
        setByteElement(term778835, 6, (byte) -1);
        setByteElement(term778835, 7, (byte) -1);
        setByteElement(term778835, 8, (byte) -1);
        setByteElement(term778835, 9, (byte) -1);
        setByteElement(term778835, 10, (byte) -1);
        setByteElement(term778835, 11, (byte) -1);
        setByteElement(term778835, 12, (byte) -1);
        setByteElement(term778835, 13, (byte) -1);
        setByteElement(term778835, 14, (byte) -1);
        setByteElement(term778835, 15, (byte) -1);
        setByteElement(term778835, 16, (byte) -1);
        setByteElement(term778835, 17, (byte) -1);
        setByteElement(term778835, 18, (byte) -1);
        setByteElement(term778835, 19, (byte) -1);
        setByteElement(term778835, 20, (byte) -1);
        setByteElement(term778835, 21, (byte) -1);
        setByteElement(term778835, 22, (byte) -1);
        setByteElement(term778835, 23, (byte) -1);
        setByteElement(term778835, 24, (byte) -1);
        setByteElement(term778835, 25, (byte) -1);
        setByteElement(term778835, 26, (byte) -1);
        setByteElement(term778835, 27, (byte) -1);
        setByteElement(term778835, 28, (byte) -1);
        setByteElement(term778835, 29, (byte) -1);
        setByteElement(term778835, 30, (byte) -1);
        setByteElement(term778835, 31, (byte) -1);
        setByteElement(term778835, 32, (byte) -1);
        setByteElement(term778835, 33, (byte) -1);
        setByteElement(term778835, 34, (byte) -1);
        setByteElement(term778835, 35, (byte) -1);
        setByteElement(term778835, 36, (byte) -1);
        setByteElement(term778835, 37, (byte) -1);
        setByteElement(term778835, 38, (byte) -1);
        setByteElement(term778835, 39, (byte) -1);
        setByteElement(term778835, 40, (byte) -1);
        setByteElement(term778835, 41, (byte) -1);
        setByteElement(term778835, 42, (byte) -1);
        setByteElement(term778835, 43, (byte) -1);
        setByteElement(term778835, 44, (byte) -1);
        setByteElement(term778835, 45, (byte) -1);
        setByteElement(term778835, 46, (byte) -1);
        setByteElement(term778835, 47, (byte) -1);
        setByteElement(term778835, 48, (byte) -1);
        setByteElement(term778835, 49, (byte) -1);
        setByteElement(term778835, 50, (byte) 26);
        setByteElement(term778835, 51, (byte) 27);
        setByteElement(term778835, 52, (byte) 28);
        setByteElement(term778835, 53, (byte) 29);
        setByteElement(term778835, 54, (byte) 30);
        setByteElement(term778835, 55, (byte) 31);
        setByteElement(term778835, 56, (byte) -1);
        setByteElement(term778835, 57, (byte) -1);
        setByteElement(term778835, 58, (byte) -1);
        setByteElement(term778835, 59, (byte) -1);
        setByteElement(term778835, 60, (byte) -1);
        setByteElement(term778835, 61, (byte) -1);
        setByteElement(term778835, 62, (byte) -1);
        setByteElement(term778835, 63, (byte) -1);
        setByteElement(term778835, 64, (byte) -1);
        setByteElement(term778835, 66, (byte) 1);
        setByteElement(term778835, 67, (byte) 2);
        setByteElement(term778835, 68, (byte) 3);
        setByteElement(term778835, 69, (byte) 4);
        setByteElement(term778835, 70, (byte) 5);
        setByteElement(term778835, 71, (byte) 6);
        setByteElement(term778835, 72, (byte) 7);
        setByteElement(term778835, 73, (byte) 8);
        setByteElement(term778835, 74, (byte) 9);
        setByteElement(term778835, 75, (byte) 10);
        setByteElement(term778835, 76, (byte) 11);
        setByteElement(term778835, 77, (byte) 12);
        setByteElement(term778835, 78, (byte) 13);
        setByteElement(term778835, 79, (byte) 14);
        setByteElement(term778835, 80, (byte) 15);
        setByteElement(term778835, 81, (byte) 16);
        setByteElement(term778835, 82, (byte) 17);
        setByteElement(term778835, 83, (byte) 18);
        setByteElement(term778835, 84, (byte) 19);
        setByteElement(term778835, 85, (byte) 20);
        setByteElement(term778835, 86, (byte) 21);
        setByteElement(term778835, 87, (byte) 22);
        setByteElement(term778835, 88, (byte) 23);
        setByteElement(term778835, 89, (byte) 24);
        setByteElement(term778835, 90, (byte) 25);
        setField(term778834, term778834.getClass(), "decodeTable", term778835);
        setIntField(term778834, term778834.getClass(), "encodeSize", 10);
        setByteElement(term778836, 0, (byte) 65);
        setByteElement(term778836, 1, (byte) 66);
        setByteElement(term778836, 2, (byte) 67);
        setByteElement(term778836, 3, (byte) 68);
        setByteElement(term778836, 4, (byte) 69);
        setByteElement(term778836, 5, (byte) 70);
        setByteElement(term778836, 6, (byte) 71);
        setByteElement(term778836, 7, (byte) 72);
        setByteElement(term778836, 8, (byte) 73);
        setByteElement(term778836, 9, (byte) 74);
        setByteElement(term778836, 10, (byte) 75);
        setByteElement(term778836, 11, (byte) 76);
        setByteElement(term778836, 12, (byte) 77);
        setByteElement(term778836, 13, (byte) 78);
        setByteElement(term778836, 14, (byte) 79);
        setByteElement(term778836, 15, (byte) 80);
        setByteElement(term778836, 16, (byte) 81);
        setByteElement(term778836, 17, (byte) 82);
        setByteElement(term778836, 18, (byte) 83);
        setByteElement(term778836, 19, (byte) 84);
        setByteElement(term778836, 20, (byte) 85);
        setByteElement(term778836, 21, (byte) 86);
        setByteElement(term778836, 22, (byte) 87);
        setByteElement(term778836, 23, (byte) 88);
        setByteElement(term778836, 24, (byte) 89);
        setByteElement(term778836, 25, (byte) 90);
        setByteElement(term778836, 26, (byte) 50);
        setByteElement(term778836, 27, (byte) 51);
        setByteElement(term778836, 28, (byte) 52);
        setByteElement(term778836, 29, (byte) 53);
        setByteElement(term778836, 30, (byte) 54);
        setByteElement(term778836, 31, (byte) 55);
        setField(term778834, term778834.getClass(), "encodeTable", term778836);
        setByteElement(term778837, 0, (byte) 13);
        setByteElement(term778837, 1, (byte) 10);
        setField(term778834, term778834.getClass(), "lineSeparator", term778837);
        setByteField(term778834, term778834.getClass(), "PAD", (byte) 61);
        setByteField(term778834, term778834.getClass(), "pad", (byte) 61);
        setIntField(term778834, term778834.getClass(), "unencodedBlockSize", 5);
        setIntField(term778834, term778834.getClass(), "encodedBlockSize", 8);
        setIntField(term778834, term778834.getClass(), "lineLength", 0);
        setIntField(term778834, term778834.getClass(), "chunkSeparatorLength", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term778834));
    }

};


