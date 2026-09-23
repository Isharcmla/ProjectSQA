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

public class Normalize_process_1693239666172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2639282;
     Object term2639452;

    public Normalize_process_1693239666172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2639282 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2639362 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2639282, term2639282.getClass(), "compiler", term2639362);
        setBooleanField(term2639282, term2639282.getClass(), "assertOnChange", false);
        term2639452 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term2639544 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2639630 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2639452, term2639452.getClass(), "type", 126);
        setIntField(term2639544, term2639544.getClass(), "type", 0);
        setField(term2639544, term2639544.getClass(), "propListHead", null);
        setIntField(term2639544, term2639544.getClass(), "sourcePosition", 0);
        setField(term2639544, term2639544.getClass(), "next", null);
        setField(term2639452, term2639452.getClass(), "last", term2639544);
        setField(term2639452, term2639452.getClass(), "first", term2639630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2639452;
        try {
            callMethod(klass, "process", argTypes, term2639282, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


