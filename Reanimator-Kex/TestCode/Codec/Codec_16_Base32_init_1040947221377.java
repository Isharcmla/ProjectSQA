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

public class Base32_init_1040947221377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Base32_init_1040947221377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term771938 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term771803 = (byte[]) newByteArray(0);
        byte[] term771812 = (byte[]) newByteArray(0);
        byte[] term771814 = (byte[]) newByteArray(0);
        setByteField(term771938, term771938.getClass(), "PAD", (byte) 0);
        setIntField(term771938, term771938.getClass(), "unencodedBlockSize", 0);
        setIntField(term771938, term771938.getClass(), "encodedBlockSize", 0);
        setIntField(term771938, term771938.getClass(), "lineLength", 0);
        setIntField(term771938, term771938.getClass(), "chunkSeparatorLength", 0);
        setByteField(term771938, term771938.getClass(), "pad", (byte) 0);
        setField(term771938, term771938.getClass(), "encodeTable", term771803);
        setField(term771938, term771938.getClass(), "decodeTable", term771812);
        setIntField(term771938, term771938.getClass(), "encodeSize", 0);
        setField(term771938, term771938.getClass(), "lineSeparator", term771814);
        setIntField(term771938, term771938.getClass(), "decodeSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = false;
        args[1] = (byte) 10;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


