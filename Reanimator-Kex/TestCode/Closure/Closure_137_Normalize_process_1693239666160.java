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

public class Normalize_process_1693239666160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2239311;
     Object term2239477;

    public Normalize_process_1693239666160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2239311 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2239391 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2239311, term2239311.getClass(), "compiler", term2239391);
        setBooleanField(term2239311, term2239311.getClass(), "assertOnChange", false);
        term2239477 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2239569 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2239639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2239477, term2239477.getClass(), "type", 126);
        setIntField(term2239569, term2239569.getClass(), "type", 0);
        setField(term2239569, term2239569.getClass(), "propListHead", null);
        setIntField(term2239569, term2239569.getClass(), "sourcePosition", 0);
        setField(term2239569, term2239569.getClass(), "next", term2239639);
        setField(term2239477, term2239477.getClass(), "last", term2239569);
        setField(term2239477, term2239477.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2239477;
        try {
            callMethod(klass, "process", argTypes, term2239311, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


