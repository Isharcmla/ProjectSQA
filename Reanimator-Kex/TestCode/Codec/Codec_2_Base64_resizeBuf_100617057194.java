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

public class Base64_resizeBuf_100617057194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22118;
     Object term92710;

    public Base64_resizeBuf_100617057194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22118 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term22118, term22118.getClass(), "buf", null);
        term92710 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term92711 = (byte[]) newByteArray(8192);
        setField(term92710, term92710.getClass(), "encodeTable", null);
        setIntField(term92710, term92710.getClass(), "lineLength", 0);
        setField(term92710, term92710.getClass(), "lineSeparator", null);
        setIntField(term92710, term92710.getClass(), "decodeSize", 0);
        setIntField(term92710, term92710.getClass(), "encodeSize", 0);
        setField(term92710, term92710.getClass(), "buf", term92711);
        setIntField(term92710, term92710.getClass(), "pos", 0);
        setIntField(term92710, term92710.getClass(), "readPos", 0);
        setIntField(term92710, term92710.getClass(), "currentLinePos", 0);
        setIntField(term92710, term92710.getClass(), "modulus", 0);
        setBooleanField(term92710, term92710.getClass(), "eof", false);
        setIntField(term92710, term92710.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resizeBuf", argTypes, term22118, args);
        assertTrue(recursiveEquals(term22118, term92710));
    }

};


