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

public class CoalesceVariableNames_checkRanges_118307546583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30604;
     Object term30776;

    public CoalesceVariableNames_checkRanges_118307546583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30604 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        Object term30684 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term30604, term30604.getClass(), "compiler", term30684);
        term30776 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term30868 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term30938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31030 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term30776, term30776.getClass(), "type", 0);
        setField(term30868, term30868.getClass(), "next", term30938);
        setIntField(term30868, term30868.getClass(), "type", 0);
        setField(term30868, term30868.getClass(), "parent", term31030);
        setField(term30776, term30776.getClass(), "first", term30868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term30776;
        try {
            callMethod(klass, "checkRanges", argTypes, term30604, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


