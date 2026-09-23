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

public class TypeCheck_process_10560252651696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term549029;
     Object term549279;

    public TypeCheck_process_10560252651696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term549029 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term549135 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term549209 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term549029, term549029.getClass(), "scopeCreator", term549135);
        setField(term549209, term549209.getClass(), "parent", null);
        setField(term549029, term549029.getClass(), "topScope", term549209);
        setField(term549029, term549029.getClass(), "compiler", null);
        setBooleanField(term549029, term549029.getClass(), "inExterns", false);
        term549279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term549349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term549279, term549279.getClass(), "parent", term549349);
        setIntField(term549279, term549279.getClass(), "type", 83);
        setField(term549279, term549279.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term549279;
        try {
            callMethod(klass, "process", argTypes, term549029, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


