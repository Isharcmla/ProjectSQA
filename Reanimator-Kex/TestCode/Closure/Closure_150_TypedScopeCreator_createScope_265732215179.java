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

public class TypedScopeCreator_createScope_265732215179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121706;
     Object term121798;
     Object term122034;

    public TypedScopeCreator_createScope_265732215179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121706 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term121706, term121706.getClass(), "compiler", null);
        term121798 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term121890 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term121960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term121798, term121798.getClass(), "jsType", null);
        setIntField(term121798, term121798.getClass(), "type", 0);
        setField(term121890, term121890.getClass(), "next", term121960);
        setIntField(term121890, term121890.getClass(), "type", 44);
        setField(term121890, term121890.getClass(), "first", null);
        setField(term121798, term121798.getClass(), "first", term121890);
        term122034 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term122034, term122034.getClass(), "rootNode", null);
        setField(term122034, term122034.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term121798;
        args[1] = term122034;
        try {
            callMethod(klass, "createScope", argTypes, term121706, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


