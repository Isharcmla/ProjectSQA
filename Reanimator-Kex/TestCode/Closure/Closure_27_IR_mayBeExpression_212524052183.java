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

public class IR_mayBeExpression_212524052183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22174;
     Object term22694;

    public IR_mayBeExpression_212524052183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22174, term22174.getClass(), "type", 51);
        term22694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22694, term22694.getClass(), "type", 51);
        setField(term22694, term22694.getClass(), "next", null);
        setField(term22694, term22694.getClass(), "first", null);
        setField(term22694, term22694.getClass(), "last", null);
        setField(term22694, term22694.getClass(), "propListHead", null);
        setIntField(term22694, term22694.getClass(), "sourcePosition", 0);
        setField(term22694, term22694.getClass(), "jsType", null);
        setField(term22694, term22694.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22174;
        Object retValue = callMethod(klass, "mayBeExpression", argTypes, null, args);
        assertTrue(recursiveEquals(term22174, term22694));
        assertTrue(recursiveEquals(retValue, true));
    }

};


