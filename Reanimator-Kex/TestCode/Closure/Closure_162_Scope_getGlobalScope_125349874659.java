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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class Scope_getGlobalScope_125349874659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5469;
     Object term5939;
     Object term5935;

    public Scope_getGlobalScope_125349874659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5469 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term5469, term5469.getClass(), "parent", null);
        term5939 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term5939, term5939.getClass(), "vars", null);
        setField(term5939, term5939.getClass(), "parent", null);
        setIntField(term5939, term5939.getClass(), "depth", 0);
        setField(term5939, term5939.getClass(), "rootNode", null);
        setField(term5939, term5939.getClass(), "thisType", null);
        setBooleanField(term5939, term5939.getClass(), "isBottom", false);
        setField(term5939, term5939.getClass(), "arguments", null);
        term5935 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term5935, term5935.getClass(), "vars", null);
        setField(term5935, term5935.getClass(), "parent", null);
        setIntField(term5935, term5935.getClass(), "depth", 0);
        setField(term5935, term5935.getClass(), "rootNode", null);
        setField(term5935, term5935.getClass(), "thisType", null);
        setBooleanField(term5935, term5935.getClass(), "isBottom", false);
        setField(term5935, term5935.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getGlobalScope", argTypes, term5469, args);
        assertTrue(recursiveEquals(term5469, term5939));
        assertTrue(recursiveEquals(retValue, term5935));
    }

};


