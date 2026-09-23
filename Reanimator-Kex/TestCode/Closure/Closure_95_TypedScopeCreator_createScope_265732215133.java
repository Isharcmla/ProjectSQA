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

public class TypedScopeCreator_createScope_265732215133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91184;
     Object term91254;
     Object term91538;

    public TypedScopeCreator_createScope_265732215133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91184 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term91184, term91184.getClass(), "compiler", null);
        term91254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term91254, term91254.getClass(), "jsType", null);
        setIntField(term91254, term91254.getClass(), "type", 0);
        setField(term91324, term91324.getClass(), "next", term91394);
        setIntField(term91324, term91324.getClass(), "type", 0);
        setField(term91324, term91324.getClass(), "first", term91464);
        setField(term91254, term91254.getClass(), "first", term91324);
        term91538 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term91650 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term91538, term91538.getClass(), "rootNode", null);
        setField(term91538, term91538.getClass(), "thisType", term91650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term91254;
        args[1] = term91538;
        try {
            callMethod(klass, "createScope", argTypes, term91184, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


