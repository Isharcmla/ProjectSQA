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

public class TypedScopeCreator_createScope_265732215131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89104;
     Object term89254;
     Object term89574;

    public TypedScopeCreator_createScope_265732215131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89104 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term89184 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term89104, term89104.getClass(), "compiler", term89184);
        term89254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term89254, term89254.getClass(), "jsType", null);
        setIntField(term89254, term89254.getClass(), "type", 0);
        setField(term89394, term89394.getClass(), "next", null);
        setIntField(term89394, term89394.getClass(), "type", 0);
        setField(term89394, term89394.getClass(), "first", null);
        setField(term89324, term89324.getClass(), "next", term89394);
        setIntField(term89324, term89324.getClass(), "type", 64);
        setField(term89324, term89324.getClass(), "first", null);
        setField(term89324, term89324.getClass(), "jsType", term89500);
        setField(term89254, term89254.getClass(), "first", term89324);
        term89574 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term89692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term89574, term89574.getClass(), "rootNode", null);
        setField(term89574, term89574.getClass(), "thisType", term89692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term89254;
        args[1] = term89574;
        try {
            callMethod(klass, "createScope", argTypes, term89104, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


