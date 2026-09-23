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
import java.util.HashMap;

public class TypedScopeCreator_createScope_26573221553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18966;
     Object term19164;
     Object term19308;

    public TypedScopeCreator_createScope_26573221553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19094 = new HashMap();
        term18966 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term19046 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term19046, term19046.getClass(), "phaseOptimizer", null);
        setField(term18966, term18966.getClass(), "compiler", term19046);
        setField(term18966, term18966.getClass(), "functionAnalysisResults", term19094);
        term19164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19164, term19164.getClass(), "type", 0);
        setIntField(term19234, term19234.getClass(), "type", 0);
        setField(term19234, term19234.getClass(), "parent", null);
        setField(term19164, term19164.getClass(), "parent", term19234);
        setField(term19164, term19164.getClass(), "first", null);
        term19308 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term19308, term19308.getClass(), "rootNode", null);
        setIntField(term19308, term19308.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term19164;
        args[1] = term19308;
        callMethod(klass, "createScope", argTypes, term18966, args);
    }

};


