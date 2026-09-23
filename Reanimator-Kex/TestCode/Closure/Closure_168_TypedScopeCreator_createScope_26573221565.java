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

public class TypedScopeCreator_createScope_26573221565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38397;
     Object term38547;
     Object term38691;

    public TypedScopeCreator_createScope_26573221565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38397 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term38477 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term38397, term38397.getClass(), "compiler", term38477);
        term38547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term38547, term38547.getClass(), "jsType", null);
        setIntField(term38547, term38547.getClass(), "type", 126);
        setField(term38547, term38547.getClass(), "parent", null);
        setIntField(term38617, term38617.getClass(), "type", 39);
        setField(term38617, term38617.getClass(), "next", null);
        setField(term38617, term38617.getClass(), "first", null);
        setField(term38547, term38547.getClass(), "first", term38617);
        term38691 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term38761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term38691, term38691.getClass(), "rootNode", term38761);
        setField(term38691, term38691.getClass(), "thisType", null);
        setIntField(term38691, term38691.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term38547;
        args[1] = term38691;
        try {
            callMethod(klass, "createScope", argTypes, term38397, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


