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

public class TypedScopeCreator_createScope_26573221563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33331;
     Object term33481;
     Object term33835;

    public TypedScopeCreator_createScope_26573221563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33331 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term33411 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term33331, term33331.getClass(), "compiler", term33411);
        term33481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term33481, term33481.getClass(), "jsType", null);
        setIntField(term33481, term33481.getClass(), "type", 0);
        setField(term33481, term33481.getClass(), "parent", null);
        setField(term33621, term33621.getClass(), "next", term33691);
        setIntField(term33621, term33621.getClass(), "type", 41);
        setField(term33621, term33621.getClass(), "first", null);
        setField(term33551, term33551.getClass(), "next", term33621);
        setIntField(term33551, term33551.getClass(), "type", 0);
        setField(term33761, term33761.getClass(), "next", null);
        setIntField(term33761, term33761.getClass(), "type", 0);
        setField(term33761, term33761.getClass(), "first", null);
        setField(term33551, term33551.getClass(), "first", term33761);
        setField(term33481, term33481.getClass(), "first", term33551);
        term33835 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term33905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term33835, term33835.getClass(), "rootNode", term33905);
        setField(term33835, term33835.getClass(), "thisType", term34003);
        setIntField(term33835, term33835.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term33481;
        args[1] = term33835;
        try {
            callMethod(klass, "createScope", argTypes, term33331, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


