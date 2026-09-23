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

public class TypeCheck_process_10560252651420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434345;
     Object term434595;

    public TypeCheck_process_10560252651420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term434345 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term434451 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term434525 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term434345, term434345.getClass(), "scopeCreator", term434451);
        setField(term434525, term434525.getClass(), "parent", null);
        setField(term434345, term434345.getClass(), "topScope", term434525);
        setField(term434345, term434345.getClass(), "compiler", null);
        setBooleanField(term434345, term434345.getClass(), "inExterns", false);
        term434595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term434665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term434595, term434595.getClass(), "parent", term434665);
        setIntField(term434595, term434595.getClass(), "type", 143);
        setField(term434595, term434595.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term434595;
        try {
            callMethod(klass, "process", argTypes, term434345, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


