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
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.binary.EqualityUtils.*;

public class Base32_decode_198742531748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26471;
     Object term26577;
     Object term27464;
     Object term27465;

    public Base32_decode_198742531748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26471 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        term26577 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodec$Context"));
        setBooleanField(term26577, term26577.getClass(), "eof", false);
        term27464 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setIntField(term27464, term27464.getClass(), "decodeSize", 0);
        setField(term27464, term27464.getClass(), "decodeTable", null);
        setIntField(term27464, term27464.getClass(), "encodeSize", 0);
        setField(term27464, term27464.getClass(), "encodeTable", null);
        setField(term27464, term27464.getClass(), "lineSeparator", null);
        setByteField(term27464, term27464.getClass(), "PAD", (byte) 0);
        setByteField(term27464, term27464.getClass(), "pad", (byte) 0);
        setIntField(term27464, term27464.getClass(), "unencodedBlockSize", 0);
        setIntField(term27464, term27464.getClass(), "encodedBlockSize", 0);
        setIntField(term27464, term27464.getClass(), "lineLength", 0);
        setIntField(term27464, term27464.getClass(), "chunkSeparatorLength", 0);
        term27465 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodec$Context"));
        setIntField(term27465, term27465.getClass(), "ibitWorkArea", 0);
        setLongField(term27465, term27465.getClass(), "lbitWorkArea", 0L);
        setField(term27465, term27465.getClass(), "buffer", null);
        setIntField(term27465, term27465.getClass(), "pos", 0);
        setIntField(term27465, term27465.getClass(), "readPos", 0);
        setBooleanField(term27465, term27465.getClass(), "eof", false);
        setIntField(term27465, term27465.getClass(), "currentLinePos", 0);
        setIntField(term27465, term27465.getClass(), "modulus", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.apache.commons.codec.binary.BaseNCodec$Context");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        args[3] = term26577;
        callMethod(klass, "decode", argTypes, term26471, args);
        assertTrue(recursiveEquals(term26471, term27464));
        assertTrue(recursiveEquals(term26577, term27465));
    }

};


