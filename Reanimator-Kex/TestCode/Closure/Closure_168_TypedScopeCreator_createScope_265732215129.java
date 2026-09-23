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

public class TypedScopeCreator_createScope_265732215129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78649;
     Object term78799;
     Object term79105;

    public TypedScopeCreator_createScope_265732215129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78649 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term78729 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term78649, term78649.getClass(), "compiler", term78729);
        term78799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79031 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term78799, term78799.getClass(), "jsType", null);
        setIntField(term78799, term78799.getClass(), "type", 0);
        setField(term78799, term78799.getClass(), "parent", null);
        setField(term78869, term78869.getClass(), "next", term78939);
        setIntField(term78869, term78869.getClass(), "type", 0);
        setField(term78869, term78869.getClass(), "first", term79031);
        setField(term78799, term78799.getClass(), "first", term78869);
        term79105 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term79175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term79105, term79105.getClass(), "rootNode", term79175);
        setField(term79105, term79105.getClass(), "thisType", null);
        setIntField(term79105, term79105.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term78799;
        args[1] = term79105;
        try {
            callMethod(klass, "createScope", argTypes, term78649, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


