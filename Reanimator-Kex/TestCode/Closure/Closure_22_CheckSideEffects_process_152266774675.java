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

public class CheckSideEffects_process_152266774675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33406;
     Object term33476;

    public CheckSideEffects_process_152266774675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33406 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term33406, term33406.getClass(), "compiler", null);
        term33476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33476, term33476.getClass(), "type", 85);
        setField(term33476, term33476.getClass(), "parent", null);
        setField(term33546, term33546.getClass(), "next", term33616);
        setIntField(term33546, term33546.getClass(), "type", 0);
        setField(term33546, term33546.getClass(), "first", null);
        setField(term33476, term33476.getClass(), "first", term33546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term33476;
        try {
            callMethod(klass, "process", argTypes, term33406, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


