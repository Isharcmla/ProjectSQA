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

public class TypeCheck_process_10560252651716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555381;
     Object term555629;

    public TypeCheck_process_10560252651716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term555381 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term555485 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term555559 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term555381, term555381.getClass(), "scopeCreator", term555485);
        setField(term555559, term555559.getClass(), "parent", null);
        setField(term555381, term555381.getClass(), "topScope", term555559);
        setField(term555381, term555381.getClass(), "compiler", null);
        setBooleanField(term555381, term555381.getClass(), "inExterns", false);
        term555629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term555699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term555629, term555629.getClass(), "parent", term555699);
        setIntField(term555629, term555629.getClass(), "type", 110);
        setField(term555629, term555629.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term555629;
        try {
            callMethod(klass, "process", argTypes, term555381, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


