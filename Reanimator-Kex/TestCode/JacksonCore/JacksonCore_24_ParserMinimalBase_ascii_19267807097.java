package com.fasterxml.jackson.core.base;

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
import static com.fasterxml.jackson.core.base.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.base.EqualityUtils.*;

public class ParserMinimalBase_ascii_19267807097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5879;
     Object term22019;

    public ParserMinimalBase_ascii_19267807097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5879 = (byte[]) newByteArray(2);
        setByteElement(term5879, 0, (byte) 47);
        setByteElement(term5879, 1, (byte) 48);
        term22019 = (byte[]) newByteArray(2);
        setByteElement(term22019, 0, (byte) 47);
        setByteElement(term22019, 1, (byte) 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.base.ParserMinimalBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5879;
        Object retValue = callMethod(klass, "_ascii", argTypes, null, args);
        assertTrue(recursiveEquals(term5879, term22019));
        assertTrue(recursiveEquals(retValue, "/0"));
    }

};


