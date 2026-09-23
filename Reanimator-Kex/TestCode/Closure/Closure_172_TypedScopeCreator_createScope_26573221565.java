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

public class TypedScopeCreator_createScope_26573221565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27811;
     Object term27903;
     Object term28069;

    public TypedScopeCreator_createScope_26573221565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27811 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term27811, term27811.getClass(), "compiler", null);
        term27903 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term27995 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term27903, term27903.getClass(), "type", -133);
        setField(term27903, term27903.getClass(), "parent", term27995);
        term28069 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term28139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term28069, term28069.getClass(), "rootNode", term28139);
        setIntField(term28069, term28069.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term27903;
        args[1] = term28069;
        callMethod(klass, "createScope", argTypes, term27811, args);
    }

};


