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

public class Normalize_process_1693239666140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2225174;
     Object term2225324;

    public Normalize_process_1693239666140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2225174 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2225254 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2225174, term2225174.getClass(), "compiler", term2225254);
        setBooleanField(term2225174, term2225174.getClass(), "assertOnChange", false);
        term2225324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2225416 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2225324, term2225324.getClass(), "type", 126);
        setIntField(term2225416, term2225416.getClass(), "type", 116);
        setField(term2225416, term2225416.getClass(), "propListHead", null);
        setIntField(term2225416, term2225416.getClass(), "sourcePosition", 0);
        setField(term2225416, term2225416.getClass(), "next", null);
        setField(term2225324, term2225324.getClass(), "last", term2225416);
        setField(term2225324, term2225324.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2225324;
        try {
            callMethod(klass, "process", argTypes, term2225174, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


