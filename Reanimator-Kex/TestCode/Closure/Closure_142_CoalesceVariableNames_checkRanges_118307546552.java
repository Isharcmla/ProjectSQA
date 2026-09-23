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

public class CoalesceVariableNames_checkRanges_118307546552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17091;
     Object term17241;

    public CoalesceVariableNames_checkRanges_118307546552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17091 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term17171 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17091, term17091.getClass(), "compiler", term17171);
        term17241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17241, term17241.getClass(), "type", 0);
        setField(term17311, term17311.getClass(), "next", term17381);
        setIntField(term17311, term17311.getClass(), "type", 132);
        setField(term17311, term17311.getClass(), "propListHead", null);
        setField(term17311, term17311.getClass(), "parent", null);
        setField(term17241, term17241.getClass(), "first", term17311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17241;
        try {
            callMethod(klass, "checkRanges", argTypes, term17091, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


