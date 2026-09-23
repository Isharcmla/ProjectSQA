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

public class Base64_isUrlSafe_1593793686108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23019;
     Object term108185;

    public Base64_isUrlSafe_1593793686108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23019 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term23019, term23019.getClass(), "encodeTable", null);
        term108185 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term108185, term108185.getClass(), "encodeTable", null);
        setIntField(term108185, term108185.getClass(), "lineLength", 0);
        setField(term108185, term108185.getClass(), "lineSeparator", null);
        setIntField(term108185, term108185.getClass(), "decodeSize", 0);
        setIntField(term108185, term108185.getClass(), "encodeSize", 0);
        setField(term108185, term108185.getClass(), "buffer", null);
        setIntField(term108185, term108185.getClass(), "pos", 0);
        setIntField(term108185, term108185.getClass(), "readPos", 0);
        setIntField(term108185, term108185.getClass(), "currentLinePos", 0);
        setIntField(term108185, term108185.getClass(), "modulus", 0);
        setBooleanField(term108185, term108185.getClass(), "eof", false);
        setIntField(term108185, term108185.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isUrlSafe", argTypes, term23019, args);
        assertTrue(recursiveEquals(term23019, term108185));
        assertTrue(recursiveEquals(retValue, false));
    }

};


