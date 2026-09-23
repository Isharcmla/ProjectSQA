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

public class Normalize_process_1693239666208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2662413;
     Object term2662585;

    public Normalize_process_1693239666208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2662413 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2662493 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2662413, term2662413.getClass(), "compiler", term2662493);
        setBooleanField(term2662413, term2662413.getClass(), "assertOnChange", false);
        term2662585 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2662677 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2662585, term2662585.getClass(), "type", 126);
        setIntField(term2662677, term2662677.getClass(), "type", 123);
        setField(term2662585, term2662585.getClass(), "last", term2662677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2662585;
        try {
            callMethod(klass, "process", argTypes, term2662413, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


