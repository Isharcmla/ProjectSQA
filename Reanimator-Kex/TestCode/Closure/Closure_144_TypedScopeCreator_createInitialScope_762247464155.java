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

public class TypedScopeCreator_createInitialScope_762247464155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73812;
     Object term73904;

    public TypedScopeCreator_createInitialScope_762247464155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73812 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term73812, term73812.getClass(), "compiler", null);
        setField(term73812, term73812.getClass(), "typeRegistry", null);
        term73904 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term73994 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term74064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term73904, term73904.getClass(), "type", 0);
        setField(term73994, term73994.getClass(), "next", term74064);
        setIntField(term73994, term73994.getClass(), "type", 118);
        setField(term73994, term73994.getClass(), "first", null);
        setField(term73904, term73904.getClass(), "first", term73994);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term73904;
        try {
            callMethod(klass, "createInitialScope", argTypes, term73812, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


