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

public class TypedScopeCreator_createScope_265732215100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62567;
     Object term62637;
     Object term62921;

    public TypedScopeCreator_createScope_265732215100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62567 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term62567, term62567.getClass(), "compiler", null);
        term62637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term62637, term62637.getClass(), "jsType", null);
        setIntField(term62637, term62637.getClass(), "type", 0);
        setField(term62637, term62637.getClass(), "parent", null);
        setField(term62707, term62707.getClass(), "next", null);
        setIntField(term62707, term62707.getClass(), "type", 0);
        setField(term62777, term62777.getClass(), "next", term62847);
        setIntField(term62777, term62777.getClass(), "type", 0);
        setField(term62777, term62777.getClass(), "first", null);
        setField(term62777, term62777.getClass(), "parent", null);
        setField(term62707, term62707.getClass(), "first", term62777);
        setField(term62637, term62637.getClass(), "first", term62707);
        term62921 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term62921, term62921.getClass(), "rootNode", null);
        setField(term62921, term62921.getClass(), "thisType", null);
        setIntField(term62921, term62921.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term62637;
        args[1] = term62921;
        callMethod(klass, "createScope", argTypes, term62567, args);
    }

};


