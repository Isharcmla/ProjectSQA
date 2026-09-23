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

public class TypedScopeCreator_createScope_26573221595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58889;
     Object term58959;
     Object term59103;

    public TypedScopeCreator_createScope_26573221595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58889 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term58889, term58889.getClass(), "compiler", null);
        term58959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term58959, term58959.getClass(), "jsType", null);
        setIntField(term58959, term58959.getClass(), "type", 126);
        setField(term58959, term58959.getClass(), "parent", null);
        setIntField(term59029, term59029.getClass(), "type", 41);
        setField(term59029, term59029.getClass(), "next", null);
        setField(term59029, term59029.getClass(), "first", null);
        setField(term58959, term58959.getClass(), "first", term59029);
        term59103 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term59173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term59103, term59103.getClass(), "rootNode", term59173);
        setField(term59103, term59103.getClass(), "thisType", null);
        setIntField(term59103, term59103.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term58959;
        args[1] = term59103;
        callMethod(klass, "createScope", argTypes, term58889, args);
    }

};


