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

public class Base32_init_1040919135114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145189;

    public Base32_init_1040919135114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term133440 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term131270 = (byte[]) newByteArray(512);
        setByteField(term133440, term133440.getClass(), "PAD", (byte) 0);
        setIntField(term133440, term133440.getClass(), "unencodedBlockSize", 0);
        setIntField(term133440, term133440.getClass(), "encodedBlockSize", 0);
        setIntField(term133440, term133440.getClass(), "lineLength", 0);
        setIntField(term133440, term133440.getClass(), "chunkSeparatorLength", 0);
        setByteField(term133440, term133440.getClass(), "pad", (byte) 0);
        setField(term133440, term133440.getClass(), "encodeTable", term131270);
        setField(term133440, term133440.getClass(), "decodeTable", term131270);
        setIntField(term133440, term133440.getClass(), "encodeSize", 0);
        setField(term133440, term133440.getClass(), "lineSeparator", term131270);
        setIntField(term133440, term133440.getClass(), "decodeSize", 0);
        term145189 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term145190 = (byte[]) newByteArray(91);
        byte[] term145191 = (byte[]) newByteArray(32);
        setIntField(term145189, term145189.getClass(), "decodeSize", 7);
        setByteElement(term145190, 0, (byte) -1);
        setByteElement(term145190, 1, (byte) -1);
        setByteElement(term145190, 2, (byte) -1);
        setByteElement(term145190, 3, (byte) -1);
        setByteElement(term145190, 4, (byte) -1);
        setByteElement(term145190, 5, (byte) -1);
        setByteElement(term145190, 6, (byte) -1);
        setByteElement(term145190, 7, (byte) -1);
        setByteElement(term145190, 8, (byte) -1);
        setByteElement(term145190, 9, (byte) -1);
        setByteElement(term145190, 10, (byte) -1);
        setByteElement(term145190, 11, (byte) -1);
        setByteElement(term145190, 12, (byte) -1);
        setByteElement(term145190, 13, (byte) -1);
        setByteElement(term145190, 14, (byte) -1);
        setByteElement(term145190, 15, (byte) -1);
        setByteElement(term145190, 16, (byte) -1);
        setByteElement(term145190, 17, (byte) -1);
        setByteElement(term145190, 18, (byte) -1);
        setByteElement(term145190, 19, (byte) -1);
        setByteElement(term145190, 20, (byte) -1);
        setByteElement(term145190, 21, (byte) -1);
        setByteElement(term145190, 22, (byte) -1);
        setByteElement(term145190, 23, (byte) -1);
        setByteElement(term145190, 24, (byte) -1);
        setByteElement(term145190, 25, (byte) -1);
        setByteElement(term145190, 26, (byte) -1);
        setByteElement(term145190, 27, (byte) -1);
        setByteElement(term145190, 28, (byte) -1);
        setByteElement(term145190, 29, (byte) -1);
        setByteElement(term145190, 30, (byte) -1);
        setByteElement(term145190, 31, (byte) -1);
        setByteElement(term145190, 32, (byte) -1);
        setByteElement(term145190, 33, (byte) -1);
        setByteElement(term145190, 34, (byte) -1);
        setByteElement(term145190, 35, (byte) -1);
        setByteElement(term145190, 36, (byte) -1);
        setByteElement(term145190, 37, (byte) -1);
        setByteElement(term145190, 38, (byte) -1);
        setByteElement(term145190, 39, (byte) -1);
        setByteElement(term145190, 40, (byte) -1);
        setByteElement(term145190, 41, (byte) -1);
        setByteElement(term145190, 42, (byte) -1);
        setByteElement(term145190, 43, (byte) -1);
        setByteElement(term145190, 44, (byte) -1);
        setByteElement(term145190, 45, (byte) -1);
        setByteElement(term145190, 46, (byte) -1);
        setByteElement(term145190, 47, (byte) -1);
        setByteElement(term145190, 48, (byte) -1);
        setByteElement(term145190, 49, (byte) -1);
        setByteElement(term145190, 50, (byte) 26);
        setByteElement(term145190, 51, (byte) 27);
        setByteElement(term145190, 52, (byte) 28);
        setByteElement(term145190, 53, (byte) 29);
        setByteElement(term145190, 54, (byte) 30);
        setByteElement(term145190, 55, (byte) 31);
        setByteElement(term145190, 56, (byte) -1);
        setByteElement(term145190, 57, (byte) -1);
        setByteElement(term145190, 58, (byte) -1);
        setByteElement(term145190, 59, (byte) -1);
        setByteElement(term145190, 60, (byte) -1);
        setByteElement(term145190, 61, (byte) -1);
        setByteElement(term145190, 62, (byte) -1);
        setByteElement(term145190, 63, (byte) -1);
        setByteElement(term145190, 64, (byte) -1);
        setByteElement(term145190, 66, (byte) 1);
        setByteElement(term145190, 67, (byte) 2);
        setByteElement(term145190, 68, (byte) 3);
        setByteElement(term145190, 69, (byte) 4);
        setByteElement(term145190, 70, (byte) 5);
        setByteElement(term145190, 71, (byte) 6);
        setByteElement(term145190, 72, (byte) 7);
        setByteElement(term145190, 73, (byte) 8);
        setByteElement(term145190, 74, (byte) 9);
        setByteElement(term145190, 75, (byte) 10);
        setByteElement(term145190, 76, (byte) 11);
        setByteElement(term145190, 77, (byte) 12);
        setByteElement(term145190, 78, (byte) 13);
        setByteElement(term145190, 79, (byte) 14);
        setByteElement(term145190, 80, (byte) 15);
        setByteElement(term145190, 81, (byte) 16);
        setByteElement(term145190, 82, (byte) 17);
        setByteElement(term145190, 83, (byte) 18);
        setByteElement(term145190, 84, (byte) 19);
        setByteElement(term145190, 85, (byte) 20);
        setByteElement(term145190, 86, (byte) 21);
        setByteElement(term145190, 87, (byte) 22);
        setByteElement(term145190, 88, (byte) 23);
        setByteElement(term145190, 89, (byte) 24);
        setByteElement(term145190, 90, (byte) 25);
        setField(term145189, term145189.getClass(), "decodeTable", term145190);
        setIntField(term145189, term145189.getClass(), "encodeSize", 8);
        setByteElement(term145191, 0, (byte) 65);
        setByteElement(term145191, 1, (byte) 66);
        setByteElement(term145191, 2, (byte) 67);
        setByteElement(term145191, 3, (byte) 68);
        setByteElement(term145191, 4, (byte) 69);
        setByteElement(term145191, 5, (byte) 70);
        setByteElement(term145191, 6, (byte) 71);
        setByteElement(term145191, 7, (byte) 72);
        setByteElement(term145191, 8, (byte) 73);
        setByteElement(term145191, 9, (byte) 74);
        setByteElement(term145191, 10, (byte) 75);
        setByteElement(term145191, 11, (byte) 76);
        setByteElement(term145191, 12, (byte) 77);
        setByteElement(term145191, 13, (byte) 78);
        setByteElement(term145191, 14, (byte) 79);
        setByteElement(term145191, 15, (byte) 80);
        setByteElement(term145191, 16, (byte) 81);
        setByteElement(term145191, 17, (byte) 82);
        setByteElement(term145191, 18, (byte) 83);
        setByteElement(term145191, 19, (byte) 84);
        setByteElement(term145191, 20, (byte) 85);
        setByteElement(term145191, 21, (byte) 86);
        setByteElement(term145191, 22, (byte) 87);
        setByteElement(term145191, 23, (byte) 88);
        setByteElement(term145191, 24, (byte) 89);
        setByteElement(term145191, 25, (byte) 90);
        setByteElement(term145191, 26, (byte) 50);
        setByteElement(term145191, 27, (byte) 51);
        setByteElement(term145191, 28, (byte) 52);
        setByteElement(term145191, 29, (byte) 53);
        setByteElement(term145191, 30, (byte) 54);
        setByteElement(term145191, 31, (byte) 55);
        setField(term145189, term145189.getClass(), "encodeTable", term145191);
        setField(term145189, term145189.getClass(), "lineSeparator", null);
        setByteField(term145189, term145189.getClass(), "PAD", (byte) 61);
        setByteField(term145189, term145189.getClass(), "pad", (byte) 61);
        setIntField(term145189, term145189.getClass(), "unencodedBlockSize", 5);
        setIntField(term145189, term145189.getClass(), "encodedBlockSize", 8);
        setIntField(term145189, term145189.getClass(), "lineLength", 0);
        setIntField(term145189, term145189.getClass(), "chunkSeparatorLength", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term145189));
    }

};


