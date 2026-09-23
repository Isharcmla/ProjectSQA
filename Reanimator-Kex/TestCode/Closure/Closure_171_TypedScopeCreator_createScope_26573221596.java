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

public class TypedScopeCreator_createScope_26573221596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40502;
     Object term40652;
     Object term40796;

    public TypedScopeCreator_createScope_26573221596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40502 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term40582 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term40582, term40582.getClass(), "phaseOptimizer", null);
        setField(term40502, term40502.getClass(), "compiler", term40582);
        term40652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40652, term40652.getClass(), "type", 0);
        setIntField(term40722, term40722.getClass(), "type", 0);
        setField(term40722, term40722.getClass(), "parent", null);
        setField(term40652, term40652.getClass(), "parent", term40722);
        setField(term40652, term40652.getClass(), "first", null);
        term40796 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term40796, term40796.getClass(), "rootNode", null);
        setIntField(term40796, term40796.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term40652;
        args[1] = term40796;
        callMethod(klass, "createScope", argTypes, term40502, args);
    }

};


