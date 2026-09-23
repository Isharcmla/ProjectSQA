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

public class Base32_encode_1167133107258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452718;
     Object term452824;
     Object term477876;
     Object term477877;

    public Base32_encode_1167133107258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term452718 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setIntField(term452718, term452718.getClass(), "lineLength", -1);
        term452824 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodec$Context"));
        setBooleanField(term452824, term452824.getClass(), "eof", false);
        setIntField(term452824, term452824.getClass(), "modulus", 0);
        term477876 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setIntField(term477876, term477876.getClass(), "decodeSize", 0);
        setField(term477876, term477876.getClass(), "decodeTable", null);
        setIntField(term477876, term477876.getClass(), "encodeSize", 0);
        setField(term477876, term477876.getClass(), "encodeTable", null);
        setField(term477876, term477876.getClass(), "lineSeparator", null);
        setByteField(term477876, term477876.getClass(), "PAD", (byte) 0);
        setByteField(term477876, term477876.getClass(), "pad", (byte) 0);
        setIntField(term477876, term477876.getClass(), "unencodedBlockSize", 0);
        setIntField(term477876, term477876.getClass(), "encodedBlockSize", 0);
        setIntField(term477876, term477876.getClass(), "lineLength", -1);
        setIntField(term477876, term477876.getClass(), "chunkSeparatorLength", 0);
        term477877 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodec$Context"));
        byte[] term477878 = (byte[]) newByteArray(8192);
        setIntField(term477877, term477877.getClass(), "ibitWorkArea", 0);
        setLongField(term477877, term477877.getClass(), "lbitWorkArea", 0L);
        setField(term477877, term477877.getClass(), "buffer", term477878);
        setIntField(term477877, term477877.getClass(), "pos", 0);
        setIntField(term477877, term477877.getClass(), "readPos", 0);
        setBooleanField(term477877, term477877.getClass(), "eof", true);
        setIntField(term477877, term477877.getClass(), "currentLinePos", 0);
        setIntField(term477877, term477877.getClass(), "modulus", 0);
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
        args[2] = -1;
        args[3] = term452824;
        callMethod(klass, "encode", argTypes, term452718, args);
        assertTrue(recursiveEquals(term452718, term477876));
        assertTrue(recursiveEquals(term452824, -1));
    }

};


