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

public class TypedScopeCreator_createInitialScope_762247464101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49877;
     Object term50153;

    public TypedScopeCreator_createInitialScope_762247464101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49877 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term49957 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term50061 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term49877, term49877.getClass(), "compiler", term49957);
        setField(term49877, term49877.getClass(), "typeRegistry", term50061);
        term50153 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term50243 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term50153, term50153.getClass(), "type", 0);
        setField(term50153, term50153.getClass(), "first", term50243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term50153;
        try {
            callMethod(klass, "createInitialScope", argTypes, term49877, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


