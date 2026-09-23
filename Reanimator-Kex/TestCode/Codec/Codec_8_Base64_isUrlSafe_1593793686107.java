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

public class Base64_isUrlSafe_1593793686107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35277;
     Object term58818;

    public Base64_isUrlSafe_1593793686107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35277 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term35277, term35277.getClass(), "encodeTable", null);
        term58818 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term58818, term58818.getClass(), "encodeTable", null);
        setIntField(term58818, term58818.getClass(), "lineLength", 0);
        setField(term58818, term58818.getClass(), "lineSeparator", null);
        setIntField(term58818, term58818.getClass(), "decodeSize", 0);
        setIntField(term58818, term58818.getClass(), "encodeSize", 0);
        setField(term58818, term58818.getClass(), "buffer", null);
        setIntField(term58818, term58818.getClass(), "pos", 0);
        setIntField(term58818, term58818.getClass(), "readPos", 0);
        setIntField(term58818, term58818.getClass(), "currentLinePos", 0);
        setIntField(term58818, term58818.getClass(), "modulus", 0);
        setBooleanField(term58818, term58818.getClass(), "eof", false);
        setIntField(term58818, term58818.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isUrlSafe", argTypes, term35277, args);
        assertTrue(recursiveEquals(term35277, term58818));
        assertTrue(recursiveEquals(retValue, false));
    }

};


