package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class FunctionRewriter_isReduceableFunctionExpression_194108805513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51116;
     Object term51124;

    public FunctionRewriter_isReduceableFunctionExpression_194108805513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51116 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term51124 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term51124, term51124.getClass(), "str", null);
        setIntField(term51124, term51124.getClass(), "type", 0);
        setField(term51124, term51124.getClass(), "next", null);
        setField(term51124, term51124.getClass(), "first", null);
        setField(term51124, term51124.getClass(), "last", null);
        setField(term51124, term51124.getClass(), "propListHead", null);
        setIntField(term51124, term51124.getClass(), "sourcePosition", 0);
        setField(term51124, term51124.getClass(), "jsType", null);
        setField(term51124, term51124.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionRewriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term51116;
        callMethod(klass, "isReduceableFunctionExpression", argTypes, null, args);
        assertTrue(recursiveEquals(term51116, term51124));
    }

};


