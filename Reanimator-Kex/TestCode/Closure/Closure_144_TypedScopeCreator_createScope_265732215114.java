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

public class TypedScopeCreator_createScope_265732215114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53880;
     Object term54150;
     Object term54224;

    public TypedScopeCreator_createScope_265732215114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53880 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term53960 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term54064 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term53880, term53880.getClass(), "compiler", term53960);
        setField(term53880, term53880.getClass(), "typeRegistry", term54064);
        term54150 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term54150, term54150.getClass(), "jsType", null);
        setIntField(term54150, term54150.getClass(), "type", 0);
        setField(term54150, term54150.getClass(), "first", null);
        term54224 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term54310 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term54420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term54224, term54224.getClass(), "rootNode", term54310);
        setField(term54224, term54224.getClass(), "thisType", term54420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term54150;
        args[1] = term54224;
        try {
            callMethod(klass, "createScope", argTypes, term53880, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


