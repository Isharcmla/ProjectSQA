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

public class Base64_decode_1829600792121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60964;
     Object term97473;

    public Base64_decode_1829600792121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60964 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term60869 = (byte[]) newByteArray(0);
        setField(term60964, term60964.getClass(), "buffer", term60869);
        setIntField(term60964, term60964.getClass(), "pos", 0);
        setIntField(term60964, term60964.getClass(), "readPos", 0);
        setIntField(term60964, term60964.getClass(), "currentLinePos", 0);
        setIntField(term60964, term60964.getClass(), "modulus", 0);
        setBooleanField(term60964, term60964.getClass(), "eof", false);
        term97473 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term97473, term97473.getClass(), "encodeTable", null);
        setIntField(term97473, term97473.getClass(), "lineLength", 0);
        setField(term97473, term97473.getClass(), "lineSeparator", null);
        setIntField(term97473, term97473.getClass(), "decodeSize", 0);
        setIntField(term97473, term97473.getClass(), "encodeSize", 0);
        setField(term97473, term97473.getClass(), "buffer", null);
        setIntField(term97473, term97473.getClass(), "pos", 0);
        setIntField(term97473, term97473.getClass(), "readPos", 0);
        setIntField(term97473, term97473.getClass(), "currentLinePos", 0);
        setIntField(term97473, term97473.getClass(), "modulus", 0);
        setBooleanField(term97473, term97473.getClass(), "eof", false);
        setIntField(term97473, term97473.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "decode", argTypes, term60964, args);
        assertTrue(recursiveEquals(term60964, term97473));
        assertTrue(recursiveEquals(retValue, null));
    }

};


