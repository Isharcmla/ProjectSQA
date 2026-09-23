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
import java.lang.Object;

public class TypeCheck_process_10560252651248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365648;
     Object term365896;

    public TypeCheck_process_10560252651248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365648 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term365752 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term365826 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term365648, term365648.getClass(), "scopeCreator", term365752);
        setField(term365826, term365826.getClass(), "parent", null);
        setField(term365648, term365648.getClass(), "topScope", term365826);
        setField(term365648, term365648.getClass(), "compiler", null);
        setBooleanField(term365648, term365648.getClass(), "inExterns", false);
        term365896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term365896, term365896.getClass(), "parent", term365966);
        setIntField(term365896, term365896.getClass(), "type", 68);
        setField(term365896, term365896.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term365896;
        try {
            callMethod(klass, "process", argTypes, term365648, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


