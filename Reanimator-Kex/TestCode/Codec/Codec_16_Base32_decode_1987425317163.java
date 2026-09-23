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

public class Base32_decode_1987425317163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278578;
     Object term278684;
     Object term307513;
     Object term307514;

    public Base32_decode_1987425317163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278578 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        term278684 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodec$Context"));
        setBooleanField(term278684, term278684.getClass(), "eof", false);
        setIntField(term278684, term278684.getClass(), "modulus", 2);
        term307513 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setIntField(term307513, term307513.getClass(), "decodeSize", 0);
        setField(term307513, term307513.getClass(), "decodeTable", null);
        setIntField(term307513, term307513.getClass(), "encodeSize", 0);
        setField(term307513, term307513.getClass(), "encodeTable", null);
        setField(term307513, term307513.getClass(), "lineSeparator", null);
        setByteField(term307513, term307513.getClass(), "PAD", (byte) 0);
        setByteField(term307513, term307513.getClass(), "pad", (byte) 0);
        setIntField(term307513, term307513.getClass(), "unencodedBlockSize", 0);
        setIntField(term307513, term307513.getClass(), "encodedBlockSize", 0);
        setIntField(term307513, term307513.getClass(), "lineLength", 0);
        setIntField(term307513, term307513.getClass(), "chunkSeparatorLength", 0);
        term307514 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodec$Context"));
        byte[] term307515 = (byte[]) newByteArray(8192);
        setIntField(term307514, term307514.getClass(), "ibitWorkArea", 0);
        setLongField(term307514, term307514.getClass(), "lbitWorkArea", 0L);
        setField(term307514, term307514.getClass(), "buffer", term307515);
        setIntField(term307514, term307514.getClass(), "pos", 1);
        setIntField(term307514, term307514.getClass(), "readPos", 0);
        setBooleanField(term307514, term307514.getClass(), "eof", true);
        setIntField(term307514, term307514.getClass(), "currentLinePos", 0);
        setIntField(term307514, term307514.getClass(), "modulus", 2);
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
        args[2] = -2147483648;
        args[3] = term278684;
        callMethod(klass, "decode", argTypes, term278578, args);
        assertTrue(recursiveEquals(term278578, term307513));
        assertTrue(recursiveEquals(term278684, -2147483648));
    }

};


