package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;

public class IR_mayBeExpression_212524052265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34936;
     Object term35455;

    public IR_mayBeExpression_212524052265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34936, term34936.getClass(), "type", 93);
        term35455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35455, term35455.getClass(), "type", 93);
        setField(term35455, term35455.getClass(), "next", null);
        setField(term35455, term35455.getClass(), "first", null);
        setField(term35455, term35455.getClass(), "last", null);
        setField(term35455, term35455.getClass(), "propListHead", null);
        setIntField(term35455, term35455.getClass(), "sourcePosition", 0);
        setField(term35455, term35455.getClass(), "jsType", null);
        setField(term35455, term35455.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34936;
        Object retValue = callMethod(klass, "mayBeExpression", argTypes, null, args);
        assertTrue(recursiveEquals(term34936, term35455));
        assertTrue(recursiveEquals(retValue, true));
    }

};


