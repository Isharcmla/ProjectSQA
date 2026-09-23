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

public class TypedScopeCreator_createScope_26573221583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34155;
     Object term34305;
     Object term34449;

    public TypedScopeCreator_createScope_26573221583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34155 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term34235 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term34235, term34235.getClass(), "phaseOptimizer", null);
        setField(term34155, term34155.getClass(), "compiler", term34235);
        term34305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34305, term34305.getClass(), "type", 105);
        setIntField(term34375, term34375.getClass(), "type", 0);
        setField(term34375, term34375.getClass(), "parent", null);
        setField(term34305, term34305.getClass(), "parent", term34375);
        term34449 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term34519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term34449, term34449.getClass(), "rootNode", term34519);
        setIntField(term34449, term34449.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term34305;
        args[1] = term34449;
        callMethod(klass, "createScope", argTypes, term34155, args);
    }

};


