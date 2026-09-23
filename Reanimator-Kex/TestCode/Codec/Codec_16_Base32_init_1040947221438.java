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

public class Base32_init_1040947221438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Base32_init_1040947221438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term912120 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term911985 = (byte[]) newByteArray(0);
        byte[] term911994 = (byte[]) newByteArray(0);
        byte[] term911996 = (byte[]) newByteArray(0);
        setByteField(term912120, term912120.getClass(), "PAD", (byte) 0);
        setIntField(term912120, term912120.getClass(), "unencodedBlockSize", 0);
        setIntField(term912120, term912120.getClass(), "encodedBlockSize", 0);
        setIntField(term912120, term912120.getClass(), "lineLength", 0);
        setIntField(term912120, term912120.getClass(), "chunkSeparatorLength", 0);
        setByteField(term912120, term912120.getClass(), "pad", (byte) 0);
        setField(term912120, term912120.getClass(), "encodeTable", term911985);
        setField(term912120, term912120.getClass(), "decodeTable", term911994);
        setIntField(term912120, term912120.getClass(), "encodeSize", 0);
        setField(term912120, term912120.getClass(), "lineSeparator", term911996);
        setIntField(term912120, term912120.getClass(), "decodeSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = true;
        args[1] = (byte) 10;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


