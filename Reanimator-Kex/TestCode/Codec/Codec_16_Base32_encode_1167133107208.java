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

public class Base32_encode_1167133107208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385712;
     Object term385818;
     Object term419540;
     Object term419541;

    public Base32_encode_1167133107208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385712 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        term385818 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodec$Context"));
        setBooleanField(term385818, term385818.getClass(), "eof", false);
        term419540 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setIntField(term419540, term419540.getClass(), "decodeSize", 0);
        setField(term419540, term419540.getClass(), "decodeTable", null);
        setIntField(term419540, term419540.getClass(), "encodeSize", 0);
        setField(term419540, term419540.getClass(), "encodeTable", null);
        setField(term419540, term419540.getClass(), "lineSeparator", null);
        setByteField(term419540, term419540.getClass(), "PAD", (byte) 0);
        setByteField(term419540, term419540.getClass(), "pad", (byte) 0);
        setIntField(term419540, term419540.getClass(), "unencodedBlockSize", 0);
        setIntField(term419540, term419540.getClass(), "encodedBlockSize", 0);
        setIntField(term419540, term419540.getClass(), "lineLength", 0);
        setIntField(term419540, term419540.getClass(), "chunkSeparatorLength", 0);
        term419541 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodec$Context"));
        setIntField(term419541, term419541.getClass(), "ibitWorkArea", 0);
        setLongField(term419541, term419541.getClass(), "lbitWorkArea", 0L);
        setField(term419541, term419541.getClass(), "buffer", null);
        setIntField(term419541, term419541.getClass(), "pos", 0);
        setIntField(term419541, term419541.getClass(), "readPos", 0);
        setBooleanField(term419541, term419541.getClass(), "eof", true);
        setIntField(term419541, term419541.getClass(), "currentLinePos", 0);
        setIntField(term419541, term419541.getClass(), "modulus", 0);
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
        args[3] = term385818;
        callMethod(klass, "encode", argTypes, term385712, args);
        assertTrue(recursiveEquals(term385712, term419540));
        assertTrue(recursiveEquals(term385818, term419541));
    }

};


