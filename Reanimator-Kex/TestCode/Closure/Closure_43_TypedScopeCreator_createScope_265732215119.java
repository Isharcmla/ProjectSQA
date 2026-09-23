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

public class TypedScopeCreator_createScope_265732215119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85254;
     Object term85324;
     Object term85468;

    public TypedScopeCreator_createScope_265732215119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85254 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term85254, term85254.getClass(), "compiler", null);
        term85324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term85324, term85324.getClass(), "jsType", null);
        setIntField(term85324, term85324.getClass(), "type", 0);
        setField(term85324, term85324.getClass(), "parent", null);
        setField(term85394, term85394.getClass(), "next", null);
        setIntField(term85394, term85394.getClass(), "type", 122);
        setField(term85394, term85394.getClass(), "first", null);
        setField(term85324, term85324.getClass(), "first", term85394);
        term85468 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term85538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term85468, term85468.getClass(), "rootNode", term85538);
        setField(term85468, term85468.getClass(), "thisType", null);
        setIntField(term85468, term85468.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term85324;
        args[1] = term85468;
        try {
            callMethod(klass, "createScope", argTypes, term85254, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


