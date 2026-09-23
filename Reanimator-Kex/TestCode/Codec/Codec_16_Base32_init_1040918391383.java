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

public class Base32_init_1040918391383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Base32_init_1040918391383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term782111 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term781990 = (byte[]) newByteArray(0);
        byte[] term781992 = (byte[]) newByteArray(0);
        byte[] term781994 = (byte[]) newByteArray(0);
        setByteField(term782111, term782111.getClass(), "PAD", (byte) 0);
        setIntField(term782111, term782111.getClass(), "unencodedBlockSize", 0);
        setIntField(term782111, term782111.getClass(), "encodedBlockSize", 0);
        setIntField(term782111, term782111.getClass(), "lineLength", 0);
        setIntField(term782111, term782111.getClass(), "chunkSeparatorLength", 0);
        setByteField(term782111, term782111.getClass(), "pad", (byte) 0);
        setField(term782111, term782111.getClass(), "encodeTable", term781990);
        setField(term782111, term782111.getClass(), "decodeTable", term781992);
        setIntField(term782111, term782111.getClass(), "encodeSize", 0);
        setField(term782111, term782111.getClass(), "lineSeparator", term781994);
        setIntField(term782111, term782111.getClass(), "decodeSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = (byte) 13;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


