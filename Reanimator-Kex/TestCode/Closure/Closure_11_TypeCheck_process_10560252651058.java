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

public class TypeCheck_process_10560252651058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301416;
     Object term301664;

    public TypeCheck_process_10560252651058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term301416 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term301520 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term301594 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term301416, term301416.getClass(), "scopeCreator", term301520);
        setField(term301594, term301594.getClass(), "parent", null);
        setField(term301416, term301416.getClass(), "topScope", term301594);
        setField(term301416, term301416.getClass(), "compiler", null);
        setBooleanField(term301416, term301416.getClass(), "inExterns", false);
        term301664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term301664, term301664.getClass(), "parent", term301734);
        setIntField(term301664, term301664.getClass(), "type", 47);
        setField(term301664, term301664.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term301664;
        try {
            callMethod(klass, "process", argTypes, term301416, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


