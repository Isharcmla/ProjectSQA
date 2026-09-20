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

public class RemoveUnusedVars_traverseAndRemoveUnusedReferences_197174169434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7658;
     Object term7728;

    public RemoveUnusedVars_traverseAndRemoveUnusedReferences_197174169434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7658 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term7658, term7658.getClass(), "compiler", null);
        term7728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7728, term7728.getClass(), "type", 0);
        setIntField(term7798, term7798.getClass(), "type", 0);
        setIntField(term7868, term7868.getClass(), "type", 0);
        setField(term7868, term7868.getClass(), "first", null);
        setField(term7868, term7868.getClass(), "next", null);
        setField(term7798, term7798.getClass(), "first", term7868);
        setIntField(term7938, term7938.getClass(), "type", 0);
        setField(term7938, term7938.getClass(), "first", term7938);
        setField(term7798, term7798.getClass(), "next", term7938);
        setField(term7728, term7728.getClass(), "first", term7798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term7728;
        callMethod(klass, "traverseAndRemoveUnusedReferences", argTypes, term7658, args);
    }

};
