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
import java.util.LinkedHashMap;

public class TypedScopeCreator_createScope_26573221589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37239;
     Object term37553;
     Object term37697;

    public TypedScopeCreator_createScope_26573221589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term37379 = new LinkedHashMap();
        term37239 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term37319 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term37319, term37319.getClass(), "phaseOptimizer", null);
        setField(term37239, term37239.getClass(), "compiler", term37319);
        setField(term37239, term37239.getClass(), "functionAnalysisResults", term37379);
        term37553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37553, term37553.getClass(), "type", 0);
        setIntField(term37623, term37623.getClass(), "type", 0);
        setField(term37623, term37623.getClass(), "parent", null);
        setField(term37553, term37553.getClass(), "parent", term37623);
        setField(term37553, term37553.getClass(), "first", null);
        term37697 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term37697, term37697.getClass(), "rootNode", null);
        setIntField(term37697, term37697.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term37553;
        args[1] = term37697;
        callMethod(klass, "createScope", argTypes, term37239, args);
    }

};


