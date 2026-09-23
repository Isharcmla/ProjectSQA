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

public class Normalize_process_1693239666134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2220786;
     Object term2220958;

    public Normalize_process_1693239666134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2220786 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        Object term2220866 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2220786, term2220786.getClass(), "compiler", term2220866);
        setBooleanField(term2220786, term2220786.getClass(), "assertOnChange", false);
        term2220958 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2221050 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2220958, term2220958.getClass(), "type", 126);
        setIntField(term2221050, term2221050.getClass(), "type", 0);
        setField(term2221050, term2221050.getClass(), "propListHead", null);
        setIntField(term2221050, term2221050.getClass(), "sourcePosition", 0);
        setField(term2221050, term2221050.getClass(), "next", null);
        setField(term2220958, term2220958.getClass(), "last", term2221050);
        setField(term2220958, term2220958.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2220958;
        try {
            callMethod(klass, "process", argTypes, term2220786, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


