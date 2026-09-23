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
import java.util.ArrayList;

public class CoalesceVariableNames_checkRanges_118307546584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31265;
     Object term31397;
     Object term31487;

    public CoalesceVariableNames_checkRanges_118307546584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31265 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term31345 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term31265, term31265.getClass(), "compiler", term31345);
        term31397 = new ArrayList();
        term31487 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term31577 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term31647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31737 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term31487, term31487.getClass(), "type", 0);
        setField(term31577, term31577.getClass(), "next", term31647);
        setIntField(term31577, term31577.getClass(), "type", 0);
        setField(term31577, term31577.getClass(), "parent", term31737);
        setField(term31487, term31487.getClass(), "first", term31577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term31397;
        args[1] = term31487;
        try {
            callMethod(klass, "checkRanges", argTypes, term31265, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


