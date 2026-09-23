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

public class TypedScopeCreator_createScope_26573221596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59555;
     Object term59625;
     Object term59699;

    public TypedScopeCreator_createScope_26573221596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59555 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term59555, term59555.getClass(), "compiler", null);
        term59625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term59625, term59625.getClass(), "jsType", null);
        setIntField(term59625, term59625.getClass(), "type", 105);
        setField(term59625, term59625.getClass(), "parent", null);
        term59699 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term59769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term59699, term59699.getClass(), "rootNode", term59769);
        setField(term59699, term59699.getClass(), "thisType", null);
        setIntField(term59699, term59699.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term59625;
        args[1] = term59699;
        callMethod(klass, "createScope", argTypes, term59555, args);
    }

};


