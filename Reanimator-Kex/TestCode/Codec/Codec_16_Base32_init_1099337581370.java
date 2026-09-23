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

public class Base32_init_1099337581370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term729199;

    public Base32_init_1099337581370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term731307 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term729698 = (byte[]) newByteArray(0);
        byte[] term730189 = (byte[]) newByteArray(0);
        setByteField(term731307, term731307.getClass(), "PAD", (byte) 0);
        setIntField(term731307, term731307.getClass(), "unencodedBlockSize", 0);
        setIntField(term731307, term731307.getClass(), "encodedBlockSize", 0);
        setIntField(term731307, term731307.getClass(), "lineLength", 0);
        setIntField(term731307, term731307.getClass(), "chunkSeparatorLength", 0);
        setByteField(term731307, term731307.getClass(), "pad", (byte) 0);
        setField(term731307, term731307.getClass(), "encodeTable", term729698);
        setField(term731307, term731307.getClass(), "decodeTable", term730189);
        setIntField(term731307, term731307.getClass(), "encodeSize", 0);
        setField(term731307, term731307.getClass(), "lineSeparator", null);
        setIntField(term731307, term731307.getClass(), "decodeSize", 0);
        term729199 = (byte[]) newByteArray(0);
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
        args[0] = 1;
        args[1] = term729199;
        args[2] = false;
        args[3] = (byte) 32;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


