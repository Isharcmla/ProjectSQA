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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_265732215105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60344;
     Object term60494;
     Object term60848;

    public TypedScopeCreator_createScope_265732215105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60344 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term60424 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term60344, term60344.getClass(), "compiler", term60424);
        term60494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term60494, term60494.getClass(), "jsType", null);
        setIntField(term60494, term60494.getClass(), "type", 0);
        setField(term60494, term60494.getClass(), "parent", null);
        setField(term60634, term60634.getClass(), "next", term60704);
        setIntField(term60634, term60634.getClass(), "type", 33);
        setField(term60634, term60634.getClass(), "first", null);
        setField(term60634, term60634.getClass(), "parent", null);
        setField(term60564, term60564.getClass(), "next", term60634);
        setIntField(term60564, term60564.getClass(), "type", 0);
        setField(term60774, term60774.getClass(), "next", null);
        setIntField(term60774, term60774.getClass(), "type", 0);
        setField(term60774, term60774.getClass(), "first", null);
        setField(term60774, term60774.getClass(), "parent", null);
        setField(term60564, term60564.getClass(), "first", term60774);
        setField(term60564, term60564.getClass(), "parent", null);
        setField(term60494, term60494.getClass(), "first", term60564);
        term60848 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term60918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term60848, term60848.getClass(), "rootNode", term60918);
        setField(term60848, term60848.getClass(), "thisType", null);
        setIntField(term60848, term60848.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term60494;
        args[1] = term60848;
        try {
            callMethod(klass, "createScope", argTypes, term60344, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


