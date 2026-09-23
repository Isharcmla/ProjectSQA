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

public class TypedScopeCreator_createScope_26573221582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61926;
     Object term62076;
     Object term62220;

    public TypedScopeCreator_createScope_26573221582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61926 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term62006 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term61926, term61926.getClass(), "compiler", term62006);
        term62076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term62076, term62076.getClass(), "jsType", null);
        setIntField(term62076, term62076.getClass(), "type", 0);
        setField(term62076, term62076.getClass(), "parent", null);
        setField(term62146, term62146.getClass(), "next", term62076);
        setIntField(term62146, term62146.getClass(), "type", 0);
        setField(term62146, term62146.getClass(), "first", null);
        setField(term62076, term62076.getClass(), "first", term62146);
        term62220 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term62290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62404 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term62220, term62220.getClass(), "rootNode", term62290);
        setField(term62220, term62220.getClass(), "thisType", term62404);
        setIntField(term62220, term62220.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term62076;
        args[1] = term62220;
        callMethod(klass, "createScope", argTypes, term61926, args);
    }

};


