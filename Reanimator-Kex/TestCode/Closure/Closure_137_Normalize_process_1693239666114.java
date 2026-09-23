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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Normalize_process_1693239666114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2210874;
     Object term2210966;

    public Normalize_process_1693239666114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2210874 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term2210874, term2210874.getClass(), "compiler", null);
        setBooleanField(term2210874, term2210874.getClass(), "assertOnChange", false);
        term2210966 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2211058 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2211150 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2210966, term2210966.getClass(), "type", 0);
        setField(term2211150, term2211150.getClass(), "next", null);
        setIntField(term2211150, term2211150.getClass(), "type", 126);
        setField(term2211150, term2211150.getClass(), "last", null);
        setField(term2211058, term2211058.getClass(), "next", term2211150);
        setIntField(term2211058, term2211058.getClass(), "type", 132);
        setField(term2211058, term2211058.getClass(), "propListHead", null);
        setField(term2211058, term2211058.getClass(), "first", null);
        setField(term2210966, term2210966.getClass(), "first", term2211058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2210966;
        try {
            callMethod(klass, "process", argTypes, term2210874, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


