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

public class TypedScopeCreator_createScope_265732215107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74272;
     Object term74342;
     Object term74556;

    public TypedScopeCreator_createScope_265732215107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74272 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term74272, term74272.getClass(), "compiler", null);
        term74342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term74342, term74342.getClass(), "jsType", null);
        setIntField(term74342, term74342.getClass(), "type", 0);
        setField(term74342, term74342.getClass(), "parent", null);
        setField(term74412, term74412.getClass(), "next", null);
        setIntField(term74412, term74412.getClass(), "type", 122);
        setField(term74482, term74482.getClass(), "next", null);
        setIntField(term74482, term74482.getClass(), "type", 83);
        setField(term74482, term74482.getClass(), "first", null);
        setField(term74412, term74412.getClass(), "first", term74482);
        setField(term74342, term74342.getClass(), "first", term74412);
        term74556 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term74626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term74556, term74556.getClass(), "rootNode", term74626);
        setField(term74556, term74556.getClass(), "thisType", null);
        setIntField(term74556, term74556.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term74342;
        args[1] = term74556;
        try {
            callMethod(klass, "createScope", argTypes, term74272, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


