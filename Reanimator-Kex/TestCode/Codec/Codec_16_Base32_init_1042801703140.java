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

public class Base32_init_1042801703140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213860;

    public Base32_init_1042801703140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term221448 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term215344 = (byte[]) newByteArray(0);
        setByteField(term221448, term221448.getClass(), "PAD", (byte) 0);
        setIntField(term221448, term221448.getClass(), "unencodedBlockSize", 0);
        setIntField(term221448, term221448.getClass(), "encodedBlockSize", 0);
        setIntField(term221448, term221448.getClass(), "lineLength", 0);
        setIntField(term221448, term221448.getClass(), "chunkSeparatorLength", 0);
        setByteField(term221448, term221448.getClass(), "pad", (byte) 0);
        setField(term221448, term221448.getClass(), "encodeTable", null);
        setField(term221448, term221448.getClass(), "decodeTable", term215344);
        term213860 = (byte[]) newByteArray(495);
        setByteElement(term213860, 6, (byte) 61);
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
        args[1] = term213860;
        args[2] = true;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


