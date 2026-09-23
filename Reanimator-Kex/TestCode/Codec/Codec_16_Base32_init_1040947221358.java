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

public class Base32_init_1040947221358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Base32_init_1040947221358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term688135 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term688014 = (byte[]) newByteArray(0);
        byte[] term688016 = (byte[]) newByteArray(0);
        byte[] term688018 = (byte[]) newByteArray(0);
        setByteField(term688135, term688135.getClass(), "PAD", (byte) 0);
        setIntField(term688135, term688135.getClass(), "unencodedBlockSize", 0);
        setIntField(term688135, term688135.getClass(), "encodedBlockSize", 0);
        setIntField(term688135, term688135.getClass(), "lineLength", 0);
        setIntField(term688135, term688135.getClass(), "chunkSeparatorLength", 0);
        setByteField(term688135, term688135.getClass(), "pad", (byte) 0);
        setField(term688135, term688135.getClass(), "encodeTable", term688014);
        setField(term688135, term688135.getClass(), "decodeTable", term688016);
        setIntField(term688135, term688135.getClass(), "encodeSize", 0);
        setField(term688135, term688135.getClass(), "lineSeparator", term688018);
        setIntField(term688135, term688135.getClass(), "decodeSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = false;
        args[1] = (byte) 13;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


