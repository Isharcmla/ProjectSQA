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

public class TypedScopeCreator_createScope_26573221595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36930;
     Object term37000;
     Object term37144;

    public TypedScopeCreator_createScope_26573221595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36930 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term36930, term36930.getClass(), "compiler", null);
        term37000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37000, term37000.getClass(), "type", 0);
        setIntField(term37070, term37070.getClass(), "type", 0);
        setField(term37070, term37070.getClass(), "parent", null);
        setField(term37000, term37000.getClass(), "parent", term37070);
        term37144 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term37144, term37144.getClass(), "rootNode", null);
        setIntField(term37144, term37144.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term37000;
        args[1] = term37144;
        try {
            callMethod(klass, "createScope", argTypes, term36930, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


