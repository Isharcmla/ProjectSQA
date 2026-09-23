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

public class TypedScopeCreator_createScope_26573221586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51726;
     Object term51898;
     Object term52156;

    public TypedScopeCreator_createScope_26573221586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51726 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term51806 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term51726, term51726.getClass(), "compiler", term51806);
        term51898 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term51990 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term52082 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term51898, term51898.getClass(), "jsType", null);
        setIntField(term51898, term51898.getClass(), "type", 0);
        setField(term51898, term51898.getClass(), "parent", null);
        setField(term51990, term51990.getClass(), "next", term52082);
        setIntField(term51990, term51990.getClass(), "type", 83);
        setField(term51990, term51990.getClass(), "first", null);
        setField(term51898, term51898.getClass(), "first", term51990);
        term52156 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term52226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term52156, term52156.getClass(), "rootNode", term52226);
        setField(term52156, term52156.getClass(), "thisType", null);
        setIntField(term52156, term52156.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term51898;
        args[1] = term52156;
        callMethod(klass, "createScope", argTypes, term51726, args);
    }

};


