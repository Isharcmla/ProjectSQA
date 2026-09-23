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

public class Base32_init_1042801703319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term607622;

    public Base32_init_1042801703319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term612724 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term608125 = (byte[]) newByteArray(0);
        byte[] term608616 = (byte[]) newByteArray(0);
        setByteField(term612724, term612724.getClass(), "PAD", (byte) 0);
        setIntField(term612724, term612724.getClass(), "unencodedBlockSize", 0);
        setIntField(term612724, term612724.getClass(), "encodedBlockSize", 0);
        setIntField(term612724, term612724.getClass(), "lineLength", 0);
        setIntField(term612724, term612724.getClass(), "chunkSeparatorLength", 0);
        setByteField(term612724, term612724.getClass(), "pad", (byte) -128);
        setField(term612724, term612724.getClass(), "encodeTable", term608125);
        setField(term612724, term612724.getClass(), "decodeTable", term608616);
        term607622 = (byte[]) newByteArray(495);
        setByteElement(term607622, 4, (byte) 61);
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
        args[1] = term607622;
        args[2] = true;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


