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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_265732215113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73500;
     Object term73650;
     Object term73964;

    public TypedScopeCreator_createScope_265732215113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73500 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term73580 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term73500, term73500.getClass(), "compiler", term73580);
        term73650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73890 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term73650, term73650.getClass(), "jsType", null);
        setIntField(term73650, term73650.getClass(), "type", 0);
        setField(term73790, term73790.getClass(), "next", null);
        setIntField(term73790, term73790.getClass(), "type", 44);
        setField(term73790, term73790.getClass(), "first", null);
        setField(term73720, term73720.getClass(), "next", term73790);
        setIntField(term73720, term73720.getClass(), "type", 64);
        setField(term73720, term73720.getClass(), "first", null);
        setField(term73720, term73720.getClass(), "jsType", term73890);
        setField(term73650, term73650.getClass(), "first", term73720);
        term73964 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term73964, term73964.getClass(), "rootNode", null);
        setField(term73964, term73964.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term73650;
        args[1] = term73964;
        try {
            callMethod(klass, "createScope", argTypes, term73500, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


