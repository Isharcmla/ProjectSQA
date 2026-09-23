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

public class TypeCheck_process_1056025265916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240270;
     Object term240518;

    public TypeCheck_process_1056025265916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240270 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term240374 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term240448 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term240270, term240270.getClass(), "scopeCreator", term240374);
        setField(term240448, term240448.getClass(), "parent", null);
        setField(term240270, term240270.getClass(), "topScope", term240448);
        setField(term240270, term240270.getClass(), "compiler", null);
        setBooleanField(term240270, term240270.getClass(), "inExterns", false);
        term240518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term240588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term240518, term240518.getClass(), "parent", term240588);
        setIntField(term240518, term240518.getClass(), "type", 151);
        setField(term240518, term240518.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term240518;
        try {
            callMethod(klass, "process", argTypes, term240270, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


