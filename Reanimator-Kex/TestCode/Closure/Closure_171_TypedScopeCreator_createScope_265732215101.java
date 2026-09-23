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

public class TypedScopeCreator_createScope_265732215101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42947;
     Object term43331;
     Object term43440;

    public TypedScopeCreator_createScope_265732215101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term43087 = new LinkedHashMap();
        term42947 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term43027 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term43027, term43027.getClass(), "phaseOptimizer", null);
        setField(term42947, term42947.getClass(), "compiler", term43027);
        setField(term42947, term42947.getClass(), "functionAnalysisResults", term43087);
        term43331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43331, term43331.getClass(), "type", 0);
        setIntField(term43366, term43366.getClass(), "type", 0);
        setField(term43366, term43366.getClass(), "parent", null);
        setField(term43331, term43331.getClass(), "parent", term43366);
        setField(term43331, term43331.getClass(), "first", null);
        term43440 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term43510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term43440, term43440.getClass(), "rootNode", term43510);
        setIntField(term43440, term43440.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term43331;
        args[1] = term43440;
        callMethod(klass, "createScope", argTypes, term42947, args);
    }

};


