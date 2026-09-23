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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CoalesceVariableNames_checkRanges_118307546582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29942;
     Object term30092;

    public CoalesceVariableNames_checkRanges_118307546582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29942 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term30022 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term29942, term29942.getClass(), "compiler", term30022);
        term30092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30092, term30092.getClass(), "type", 0);
        setField(term30162, term30162.getClass(), "next", term30092);
        setIntField(term30162, term30162.getClass(), "type", 0);
        setIntField(term30232, term30232.getClass(), "type", 0);
        setField(term30162, term30162.getClass(), "parent", term30232);
        setField(term30162, term30162.getClass(), "first", null);
        setField(term30092, term30092.getClass(), "first", term30162);
        setField(term30092, term30092.getClass(), "next", term30302);
        setField(term30092, term30092.getClass(), "parent", term30372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term30092;
        try {
            callMethod(klass, "checkRanges", argTypes, term29942, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


