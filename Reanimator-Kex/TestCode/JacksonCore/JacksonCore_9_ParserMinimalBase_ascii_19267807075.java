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

public class ParserMinimalBase_ascii_19267807075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5697;
     Object term19427;

    public ParserMinimalBase_ascii_19267807075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5697 = (byte[]) newByteArray(2);
        setByteElement(term5697, 0, (byte) 47);
        setByteElement(term5697, 1, (byte) 48);
        term19427 = (byte[]) newByteArray(2);
        setByteElement(term19427, 0, (byte) 47);
        setByteElement(term19427, 1, (byte) 48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.base.ParserMinimalBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5697;
        Object retValue = callMethod(klass, "_ascii", argTypes, null, args);
        assertTrue(recursiveEquals(term5697, term19427));
        assertTrue(recursiveEquals(retValue, "/0"));
    }

};


