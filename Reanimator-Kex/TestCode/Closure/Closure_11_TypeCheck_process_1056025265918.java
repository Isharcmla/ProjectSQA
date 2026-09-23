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

public class TypeCheck_process_1056025265918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241155;
     Object term241397;

    public TypeCheck_process_1056025265918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241155 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term241253 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term241327 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term241155, term241155.getClass(), "scopeCreator", term241253);
        setField(term241327, term241327.getClass(), "parent", null);
        setField(term241155, term241155.getClass(), "topScope", term241327);
        setField(term241155, term241155.getClass(), "compiler", null);
        setBooleanField(term241155, term241155.getClass(), "inExterns", false);
        term241397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term241467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term241397, term241397.getClass(), "parent", term241467);
        setIntField(term241397, term241397.getClass(), "type", 99);
        setField(term241397, term241397.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term241397;
        try {
            callMethod(klass, "process", argTypes, term241155, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


