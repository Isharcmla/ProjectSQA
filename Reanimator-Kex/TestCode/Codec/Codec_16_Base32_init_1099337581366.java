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
import java.lang.IllegalArgumentException;
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Base32_init_1099337581366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Base32_init_1099337581366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term708942 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term708206 = (byte[]) newByteArray(0);
        byte[] term708411 = (byte[]) newByteArray(0);
        setByteField(term708942, term708942.getClass(), "PAD", (byte) 0);
        setIntField(term708942, term708942.getClass(), "unencodedBlockSize", 0);
        setIntField(term708942, term708942.getClass(), "encodedBlockSize", 0);
        setIntField(term708942, term708942.getClass(), "lineLength", 0);
        setIntField(term708942, term708942.getClass(), "chunkSeparatorLength", 0);
        setByteField(term708942, term708942.getClass(), "pad", (byte) 0);
        setField(term708942, term708942.getClass(), "encodeTable", term708206);
        setField(term708942, term708942.getClass(), "decodeTable", term708411);
        setIntField(term708942, term708942.getClass(), "encodeSize", 0);
        setField(term708942, term708942.getClass(), "lineSeparator", term708206);
        setIntField(term708942, term708942.getClass(), "decodeSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        argTypes[3] = byte.class;
        Object[] args = new Object[4];
        args[0] = 0;
        args[1] = null;
        args[2] = true;
        args[3] = (byte) 9;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


