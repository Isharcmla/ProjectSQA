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

public class Base32_decode_198742531794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93774;
     Object term93880;
     Object term95584;
     Object term95585;

    public Base32_decode_198742531794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93774 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        term93880 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodec$Context"));
        setBooleanField(term93880, term93880.getClass(), "eof", false);
        term95584 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setIntField(term95584, term95584.getClass(), "decodeSize", 0);
        setField(term95584, term95584.getClass(), "decodeTable", null);
        setIntField(term95584, term95584.getClass(), "encodeSize", 0);
        setField(term95584, term95584.getClass(), "encodeTable", null);
        setField(term95584, term95584.getClass(), "lineSeparator", null);
        setByteField(term95584, term95584.getClass(), "PAD", (byte) 0);
        setByteField(term95584, term95584.getClass(), "pad", (byte) 0);
        setIntField(term95584, term95584.getClass(), "unencodedBlockSize", 0);
        setIntField(term95584, term95584.getClass(), "encodedBlockSize", 0);
        setIntField(term95584, term95584.getClass(), "lineLength", 0);
        setIntField(term95584, term95584.getClass(), "chunkSeparatorLength", 0);
        term95585 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodec$Context"));
        setIntField(term95585, term95585.getClass(), "ibitWorkArea", 0);
        setLongField(term95585, term95585.getClass(), "lbitWorkArea", 0L);
        setField(term95585, term95585.getClass(), "buffer", null);
        setIntField(term95585, term95585.getClass(), "pos", 0);
        setIntField(term95585, term95585.getClass(), "readPos", 0);
        setBooleanField(term95585, term95585.getClass(), "eof", true);
        setIntField(term95585, term95585.getClass(), "currentLinePos", 0);
        setIntField(term95585, term95585.getClass(), "modulus", 0);
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
        args[3] = term93880;
        callMethod(klass, "decode", argTypes, term93774, args);
        assertTrue(recursiveEquals(term93774, term95584));
        assertTrue(recursiveEquals(term93880, term95585));
    }

};


