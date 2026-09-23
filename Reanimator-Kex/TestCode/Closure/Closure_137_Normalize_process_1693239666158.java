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

public class Normalize_process_1693239666158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2238065;
     Object term2238151;

    public Normalize_process_1693239666158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2238065 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term2238065, term2238065.getClass(), "compiler", null);
        setBooleanField(term2238065, term2238065.getClass(), "assertOnChange", false);
        term2238151 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2238243 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2238329 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2238151, term2238151.getClass(), "type", 126);
        setIntField(term2238243, term2238243.getClass(), "type", 120);
        setField(term2238243, term2238243.getClass(), "propListHead", null);
        setIntField(term2238243, term2238243.getClass(), "sourcePosition", 0);
        setField(term2238243, term2238243.getClass(), "next", term2238329);
        setField(term2238151, term2238151.getClass(), "last", term2238243);
        setField(term2238151, term2238151.getClass(), "first", term2238243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2238151;
        try {
            callMethod(klass, "process", argTypes, term2238065, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


