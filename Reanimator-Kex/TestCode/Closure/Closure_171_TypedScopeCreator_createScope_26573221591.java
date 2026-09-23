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

public class TypedScopeCreator_createScope_26573221591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38275;
     Object term38425;
     Object term38569;

    public TypedScopeCreator_createScope_26573221591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38275 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term38355 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term38355, term38355.getClass(), "phaseOptimizer", null);
        setField(term38275, term38275.getClass(), "compiler", term38355);
        term38425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38425, term38425.getClass(), "type", 0);
        setIntField(term38495, term38495.getClass(), "type", 0);
        setField(term38495, term38495.getClass(), "parent", null);
        setField(term38425, term38425.getClass(), "parent", term38495);
        setField(term38425, term38425.getClass(), "first", null);
        term38569 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term38569, term38569.getClass(), "rootNode", null);
        setIntField(term38569, term38569.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term38425;
        args[1] = term38569;
        callMethod(klass, "createScope", argTypes, term38275, args);
    }

};


