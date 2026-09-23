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

public class Base64_avail_1259156519115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65154;
     Object term65167;

    public Base64_avail_1259156519115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65154 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term65154, term65154.getClass(), "buffer", null);
        term65167 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term65167, term65167.getClass(), "encodeTable", null);
        setIntField(term65167, term65167.getClass(), "lineLength", 0);
        setField(term65167, term65167.getClass(), "lineSeparator", null);
        setIntField(term65167, term65167.getClass(), "decodeSize", 0);
        setIntField(term65167, term65167.getClass(), "encodeSize", 0);
        setField(term65167, term65167.getClass(), "buffer", null);
        setIntField(term65167, term65167.getClass(), "pos", 0);
        setIntField(term65167, term65167.getClass(), "readPos", 0);
        setIntField(term65167, term65167.getClass(), "currentLinePos", 0);
        setIntField(term65167, term65167.getClass(), "modulus", 0);
        setBooleanField(term65167, term65167.getClass(), "eof", false);
        setIntField(term65167, term65167.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "avail", argTypes, term65154, args);
        assertTrue(recursiveEquals(term65154, term65167));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


