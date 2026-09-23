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

public class TypedScopeCreator_createScope_26573221587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35993;
     Object term36307;
     Object term36451;

    public TypedScopeCreator_createScope_26573221587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term36133 = new LinkedHashMap();
        term35993 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term36073 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term36073, term36073.getClass(), "phaseOptimizer", null);
        setField(term35993, term35993.getClass(), "compiler", term36073);
        setField(term35993, term35993.getClass(), "functionAnalysisResults", term36133);
        term36307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36307, term36307.getClass(), "type", 0);
        setIntField(term36377, term36377.getClass(), "type", 0);
        setField(term36377, term36377.getClass(), "parent", null);
        setField(term36307, term36307.getClass(), "parent", term36377);
        setField(term36307, term36307.getClass(), "first", null);
        term36451 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term36451, term36451.getClass(), "rootNode", null);
        setIntField(term36451, term36451.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term36307;
        args[1] = term36451;
        callMethod(klass, "createScope", argTypes, term35993, args);
    }

};


