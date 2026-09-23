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

public class CoalesceVariableNames_checkRanges_118307546554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19179;
     Object term19351;

    public CoalesceVariableNames_checkRanges_118307546554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19179 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term19259 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term19179, term19179.getClass(), "compiler", term19259);
        term19351 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term19437 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term19351, term19351.getClass(), "type", 0);
        setField(term19351, term19351.getClass(), "first", term19437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term19351;
        try {
            callMethod(klass, "checkRanges", argTypes, term19179, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


