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

public class Base64_decode_1829600792111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38854;
     Object term36497;
     Object term131229;
     Object term131230;
     Object term131228;

    public Base64_decode_1829600792111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38854 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term38854, term38854.getClass(), "buffer", null);
        setIntField(term38854, term38854.getClass(), "pos", 0);
        setIntField(term38854, term38854.getClass(), "readPos", 0);
        setIntField(term38854, term38854.getClass(), "currentLinePos", 0);
        setIntField(term38854, term38854.getClass(), "modulus", 0);
        setBooleanField(term38854, term38854.getClass(), "eof", false);
        setIntField(term38854, term38854.getClass(), "decodeSize", 512);
        term36497 = (byte[]) newByteArray(683);
        term131229 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term131229, term131229.getClass(), "encodeTable", null);
        setIntField(term131229, term131229.getClass(), "lineLength", 0);
        setField(term131229, term131229.getClass(), "lineSeparator", null);
        setIntField(term131229, term131229.getClass(), "decodeSize", 512);
        setIntField(term131229, term131229.getClass(), "encodeSize", 0);
        setField(term131229, term131229.getClass(), "buffer", null);
        setIntField(term131229, term131229.getClass(), "pos", 0);
        setIntField(term131229, term131229.getClass(), "readPos", 0);
        setIntField(term131229, term131229.getClass(), "currentLinePos", 0);
        setIntField(term131229, term131229.getClass(), "modulus", 0);
        setBooleanField(term131229, term131229.getClass(), "eof", true);
        setIntField(term131229, term131229.getClass(), "x", 0);
        term131230 = (byte[]) newByteArray(683);
        term131228 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term36497;
        Object retValue = callMethod(klass, "decode", argTypes, term38854, args);
        assertTrue(recursiveEquals(term38854, term131229));
        assertTrue(recursiveEquals(term36497, term131230));
        assertTrue(recursiveEquals(retValue, term131228));
    }

};


