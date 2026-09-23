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

public class TypedScopeCreator_createScope_26573221572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39818;
     Object term39888;
     Object term40172;

    public TypedScopeCreator_createScope_26573221572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39818 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term39818, term39818.getClass(), "compiler", null);
        term39888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term39888, term39888.getClass(), "jsType", null);
        setIntField(term39888, term39888.getClass(), "type", 0);
        setField(term39888, term39888.getClass(), "parent", null);
        setField(term39958, term39958.getClass(), "next", term40028);
        setIntField(term39958, term39958.getClass(), "type", 0);
        setField(term40098, term40098.getClass(), "next", null);
        setIntField(term40098, term40098.getClass(), "type", 125);
        setField(term39958, term39958.getClass(), "first", term40098);
        setField(term39888, term39888.getClass(), "first", term39958);
        term40172 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term40172, term40172.getClass(), "rootNode", null);
        setField(term40172, term40172.getClass(), "thisType", null);
        setIntField(term40172, term40172.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term39888;
        args[1] = term40172;
        try {
            callMethod(klass, "createScope", argTypes, term39818, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


