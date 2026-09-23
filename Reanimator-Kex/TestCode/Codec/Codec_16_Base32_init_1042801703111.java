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

public class Base32_init_1042801703111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121972;

    public Base32_init_1042801703111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term126565 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term123452 = (byte[]) newByteArray(0);
        setByteField(term126565, term126565.getClass(), "PAD", (byte) 0);
        setIntField(term126565, term126565.getClass(), "unencodedBlockSize", 0);
        setIntField(term126565, term126565.getClass(), "encodedBlockSize", 0);
        setIntField(term126565, term126565.getClass(), "lineLength", 0);
        setIntField(term126565, term126565.getClass(), "chunkSeparatorLength", 0);
        setByteField(term126565, term126565.getClass(), "pad", (byte) -128);
        setField(term126565, term126565.getClass(), "encodeTable", null);
        setField(term126565, term126565.getClass(), "decodeTable", term123452);
        term121972 = (byte[]) newByteArray(491);
        setByteElement(term121972, 3, (byte) 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = 1;
        args[1] = term121972;
        args[2] = true;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


