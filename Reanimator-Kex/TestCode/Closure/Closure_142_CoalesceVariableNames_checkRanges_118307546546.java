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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CoalesceVariableNames_checkRanges_118307546546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14233;
     Object term14399;

    public CoalesceVariableNames_checkRanges_118307546546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14233 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term14313 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term14233, term14233.getClass(), "compiler", term14313);
        term14399 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term14485 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term14571 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term14399, term14399.getClass(), "type", 0);
        setField(term14485, term14485.getClass(), "next", term14571);
        setIntField(term14485, term14485.getClass(), "type", 0);
        setField(term14399, term14399.getClass(), "first", term14485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term14399;
        try {
            callMethod(klass, "checkRanges", argTypes, term14233, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


