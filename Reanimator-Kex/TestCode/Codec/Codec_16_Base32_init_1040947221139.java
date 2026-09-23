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

public class Base32_init_1040947221139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223924;

    public Base32_init_1040947221139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term213857 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term213739 = (byte[]) newByteArray(0);
        byte[] term213741 = (byte[]) newByteArray(0);
        setByteField(term213857, term213857.getClass(), "PAD", (byte) 0);
        setIntField(term213857, term213857.getClass(), "unencodedBlockSize", 0);
        setIntField(term213857, term213857.getClass(), "encodedBlockSize", 0);
        setIntField(term213857, term213857.getClass(), "lineLength", 0);
        setIntField(term213857, term213857.getClass(), "chunkSeparatorLength", 0);
        setByteField(term213857, term213857.getClass(), "pad", (byte) 0);
        setField(term213857, term213857.getClass(), "encodeTable", term213739);
        setField(term213857, term213857.getClass(), "decodeTable", term213741);
        setIntField(term213857, term213857.getClass(), "encodeSize", 0);
        setField(term213857, term213857.getClass(), "lineSeparator", term213739);
        setIntField(term213857, term213857.getClass(), "decodeSize", 0);
        term223924 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term223925 = (byte[]) newByteArray(88);
        byte[] term223926 = (byte[]) newByteArray(32);
        setIntField(term223924, term223924.getClass(), "decodeSize", 7);
        setByteElement(term223925, 0, (byte) -1);
        setByteElement(term223925, 1, (byte) -1);
        setByteElement(term223925, 2, (byte) -1);
        setByteElement(term223925, 3, (byte) -1);
        setByteElement(term223925, 4, (byte) -1);
        setByteElement(term223925, 5, (byte) -1);
        setByteElement(term223925, 6, (byte) -1);
        setByteElement(term223925, 7, (byte) -1);
        setByteElement(term223925, 8, (byte) -1);
        setByteElement(term223925, 9, (byte) -1);
        setByteElement(term223925, 10, (byte) -1);
        setByteElement(term223925, 11, (byte) -1);
        setByteElement(term223925, 12, (byte) -1);
        setByteElement(term223925, 13, (byte) -1);
        setByteElement(term223925, 14, (byte) -1);
        setByteElement(term223925, 15, (byte) -1);
        setByteElement(term223925, 16, (byte) -1);
        setByteElement(term223925, 17, (byte) -1);
        setByteElement(term223925, 18, (byte) -1);
        setByteElement(term223925, 19, (byte) -1);
        setByteElement(term223925, 20, (byte) -1);
        setByteElement(term223925, 21, (byte) -1);
        setByteElement(term223925, 22, (byte) -1);
        setByteElement(term223925, 23, (byte) -1);
        setByteElement(term223925, 24, (byte) -1);
        setByteElement(term223925, 25, (byte) -1);
        setByteElement(term223925, 26, (byte) -1);
        setByteElement(term223925, 27, (byte) -1);
        setByteElement(term223925, 28, (byte) -1);
        setByteElement(term223925, 29, (byte) -1);
        setByteElement(term223925, 30, (byte) -1);
        setByteElement(term223925, 31, (byte) -1);
        setByteElement(term223925, 32, (byte) -1);
        setByteElement(term223925, 33, (byte) -1);
        setByteElement(term223925, 34, (byte) -1);
        setByteElement(term223925, 35, (byte) -1);
        setByteElement(term223925, 36, (byte) -1);
        setByteElement(term223925, 37, (byte) -1);
        setByteElement(term223925, 38, (byte) -1);
        setByteElement(term223925, 39, (byte) -1);
        setByteElement(term223925, 40, (byte) -1);
        setByteElement(term223925, 41, (byte) -1);
        setByteElement(term223925, 42, (byte) -1);
        setByteElement(term223925, 43, (byte) -1);
        setByteElement(term223925, 44, (byte) -1);
        setByteElement(term223925, 45, (byte) -1);
        setByteElement(term223925, 46, (byte) -1);
        setByteElement(term223925, 47, (byte) -1);
        setByteElement(term223925, 49, (byte) 1);
        setByteElement(term223925, 50, (byte) 2);
        setByteElement(term223925, 51, (byte) 3);
        setByteElement(term223925, 52, (byte) 4);
        setByteElement(term223925, 53, (byte) 5);
        setByteElement(term223925, 54, (byte) 6);
        setByteElement(term223925, 55, (byte) 7);
        setByteElement(term223925, 56, (byte) 8);
        setByteElement(term223925, 57, (byte) 9);
        setByteElement(term223925, 58, (byte) -1);
        setByteElement(term223925, 59, (byte) -1);
        setByteElement(term223925, 60, (byte) -1);
        setByteElement(term223925, 61, (byte) -1);
        setByteElement(term223925, 62, (byte) -1);
        setByteElement(term223925, 63, (byte) -1);
        setByteElement(term223925, 64, (byte) -1);
        setByteElement(term223925, 65, (byte) 10);
        setByteElement(term223925, 66, (byte) 11);
        setByteElement(term223925, 67, (byte) 12);
        setByteElement(term223925, 68, (byte) 13);
        setByteElement(term223925, 69, (byte) 14);
        setByteElement(term223925, 70, (byte) 15);
        setByteElement(term223925, 71, (byte) 16);
        setByteElement(term223925, 72, (byte) 17);
        setByteElement(term223925, 73, (byte) 18);
        setByteElement(term223925, 74, (byte) 19);
        setByteElement(term223925, 75, (byte) 20);
        setByteElement(term223925, 76, (byte) 21);
        setByteElement(term223925, 77, (byte) 22);
        setByteElement(term223925, 78, (byte) 23);
        setByteElement(term223925, 79, (byte) 24);
        setByteElement(term223925, 80, (byte) 25);
        setByteElement(term223925, 81, (byte) 26);
        setByteElement(term223925, 82, (byte) 27);
        setByteElement(term223925, 83, (byte) 28);
        setByteElement(term223925, 84, (byte) 29);
        setByteElement(term223925, 85, (byte) 30);
        setByteElement(term223925, 86, (byte) 31);
        setByteElement(term223925, 87, (byte) 32);
        setField(term223924, term223924.getClass(), "decodeTable", term223925);
        setIntField(term223924, term223924.getClass(), "encodeSize", 8);
        setByteElement(term223926, 0, (byte) 48);
        setByteElement(term223926, 1, (byte) 49);
        setByteElement(term223926, 2, (byte) 50);
        setByteElement(term223926, 3, (byte) 51);
        setByteElement(term223926, 4, (byte) 52);
        setByteElement(term223926, 5, (byte) 53);
        setByteElement(term223926, 6, (byte) 54);
        setByteElement(term223926, 7, (byte) 55);
        setByteElement(term223926, 8, (byte) 56);
        setByteElement(term223926, 9, (byte) 57);
        setByteElement(term223926, 10, (byte) 65);
        setByteElement(term223926, 11, (byte) 66);
        setByteElement(term223926, 12, (byte) 67);
        setByteElement(term223926, 13, (byte) 68);
        setByteElement(term223926, 14, (byte) 69);
        setByteElement(term223926, 15, (byte) 70);
        setByteElement(term223926, 16, (byte) 71);
        setByteElement(term223926, 17, (byte) 72);
        setByteElement(term223926, 18, (byte) 73);
        setByteElement(term223926, 19, (byte) 74);
        setByteElement(term223926, 20, (byte) 75);
        setByteElement(term223926, 21, (byte) 76);
        setByteElement(term223926, 22, (byte) 77);
        setByteElement(term223926, 23, (byte) 78);
        setByteElement(term223926, 24, (byte) 79);
        setByteElement(term223926, 25, (byte) 80);
        setByteElement(term223926, 26, (byte) 81);
        setByteElement(term223926, 27, (byte) 82);
        setByteElement(term223926, 28, (byte) 83);
        setByteElement(term223926, 29, (byte) 84);
        setByteElement(term223926, 30, (byte) 85);
        setByteElement(term223926, 31, (byte) 86);
        setField(term223924, term223924.getClass(), "encodeTable", term223926);
        setField(term223924, term223924.getClass(), "lineSeparator", null);
        setByteField(term223924, term223924.getClass(), "PAD", (byte) 61);
        setByteField(term223924, term223924.getClass(), "pad", (byte) 126);
        setIntField(term223924, term223924.getClass(), "unencodedBlockSize", 5);
        setIntField(term223924, term223924.getClass(), "encodedBlockSize", 8);
        setIntField(term223924, term223924.getClass(), "lineLength", 0);
        setIntField(term223924, term223924.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = true;
        args[1] = (byte) 126;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term223924));
    }

};


