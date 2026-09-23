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

public class TypedScopeCreator_createScope_265732215121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79883;
     Object term80033;
     Object term80371;

    public TypedScopeCreator_createScope_265732215121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79883 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term79963 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term79883, term79883.getClass(), "compiler", term79963);
        term80033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term80033, term80033.getClass(), "jsType", null);
        setIntField(term80033, term80033.getClass(), "type", 0);
        setField(term80173, term80173.getClass(), "next", null);
        setIntField(term80173, term80173.getClass(), "type", 39);
        setField(term80173, term80173.getClass(), "first", null);
        setField(term80103, term80103.getClass(), "next", term80173);
        setIntField(term80103, term80103.getClass(), "type", 64);
        setField(term80103, term80103.getClass(), "first", null);
        setField(term80103, term80103.getClass(), "jsType", term80297);
        setField(term80033, term80033.getClass(), "first", term80103);
        term80371 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term80371, term80371.getClass(), "rootNode", null);
        setField(term80371, term80371.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term80033;
        args[1] = term80371;
        try {
            callMethod(klass, "createScope", argTypes, term79883, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


