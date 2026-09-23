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

public class Base32_init_109933758179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54134;

    public Base32_init_109933758179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term55798 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        term54134 = (byte[]) newByteArray(512);
        setByteField(term55798, term55798.getClass(), "PAD", (byte) 0);
        setIntField(term55798, term55798.getClass(), "unencodedBlockSize", 0);
        setIntField(term55798, term55798.getClass(), "encodedBlockSize", 0);
        setIntField(term55798, term55798.getClass(), "lineLength", 0);
        setIntField(term55798, term55798.getClass(), "chunkSeparatorLength", 0);
        setByteField(term55798, term55798.getClass(), "pad", (byte) 0);
        setField(term55798, term55798.getClass(), "encodeTable", term54134);
        setField(term55798, term55798.getClass(), "decodeTable", term54134);
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
        args[1] = term54134;
        args[2] = false;
        args[3] = (byte) 0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


