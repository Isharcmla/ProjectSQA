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

public class Base32_encode_116713310751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27839;
     Object term27945;
     Object term27968;
     Object term27969;

    public Base32_encode_116713310751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27839 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        term27945 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodec$Context"));
        setBooleanField(term27945, term27945.getClass(), "eof", false);
        term27968 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setIntField(term27968, term27968.getClass(), "decodeSize", 0);
        setField(term27968, term27968.getClass(), "decodeTable", null);
        setIntField(term27968, term27968.getClass(), "encodeSize", 0);
        setField(term27968, term27968.getClass(), "encodeTable", null);
        setField(term27968, term27968.getClass(), "lineSeparator", null);
        setByteField(term27968, term27968.getClass(), "PAD", (byte) 0);
        setByteField(term27968, term27968.getClass(), "pad", (byte) 0);
        setIntField(term27968, term27968.getClass(), "unencodedBlockSize", 0);
        setIntField(term27968, term27968.getClass(), "encodedBlockSize", 0);
        setIntField(term27968, term27968.getClass(), "lineLength", 0);
        setIntField(term27968, term27968.getClass(), "chunkSeparatorLength", 0);
        term27969 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodec$Context"));
        setIntField(term27969, term27969.getClass(), "ibitWorkArea", 0);
        setLongField(term27969, term27969.getClass(), "lbitWorkArea", 0L);
        setField(term27969, term27969.getClass(), "buffer", null);
        setIntField(term27969, term27969.getClass(), "pos", 0);
        setIntField(term27969, term27969.getClass(), "readPos", 0);
        setBooleanField(term27969, term27969.getClass(), "eof", false);
        setIntField(term27969, term27969.getClass(), "currentLinePos", 0);
        setIntField(term27969, term27969.getClass(), "modulus", 0);
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
        args[3] = term27945;
        callMethod(klass, "encode", argTypes, term27839, args);
        assertTrue(recursiveEquals(term27839, term27968));
        assertTrue(recursiveEquals(term27945, term27969));
    }

};


