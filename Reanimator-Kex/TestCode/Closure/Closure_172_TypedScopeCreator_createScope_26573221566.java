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

public class TypedScopeCreator_createScope_26573221566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28408;
     Object term28478;
     Object term28552;

    public TypedScopeCreator_createScope_26573221566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28408 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term28408, term28408.getClass(), "compiler", null);
        term28478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28478, term28478.getClass(), "type", -133);
        setField(term28478, term28478.getClass(), "parent", null);
        term28552 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term28552, term28552.getClass(), "rootNode", null);
        setIntField(term28552, term28552.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term28478;
        args[1] = term28552;
        callMethod(klass, "createScope", argTypes, term28408, args);
    }

};


