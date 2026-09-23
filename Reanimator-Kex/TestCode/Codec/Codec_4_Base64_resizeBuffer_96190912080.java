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

public class Base64_resizeBuffer_96190912080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13018;
     Object term23350;

    public Base64_resizeBuffer_96190912080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13018 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term13018, term13018.getClass(), "buffer", null);
        term23350 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term23351 = (byte[]) newByteArray(8192);
        setField(term23350, term23350.getClass(), "encodeTable", null);
        setIntField(term23350, term23350.getClass(), "lineLength", 0);
        setField(term23350, term23350.getClass(), "lineSeparator", null);
        setIntField(term23350, term23350.getClass(), "decodeSize", 0);
        setIntField(term23350, term23350.getClass(), "encodeSize", 0);
        setField(term23350, term23350.getClass(), "buffer", term23351);
        setIntField(term23350, term23350.getClass(), "pos", 0);
        setIntField(term23350, term23350.getClass(), "readPos", 0);
        setIntField(term23350, term23350.getClass(), "currentLinePos", 0);
        setIntField(term23350, term23350.getClass(), "modulus", 0);
        setBooleanField(term23350, term23350.getClass(), "eof", false);
        setIntField(term23350, term23350.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resizeBuffer", argTypes, term13018, args);
        assertTrue(recursiveEquals(term13018, term23350));
    }

};


