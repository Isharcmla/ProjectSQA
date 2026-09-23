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

public class TypedScopeCreator_createScope_265732215151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71484;
     Object term71760;
     Object term71834;

    public TypedScopeCreator_createScope_265732215151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71484 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term71564 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term71668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term71484, term71484.getClass(), "compiler", term71564);
        setField(term71484, term71484.getClass(), "typeRegistry", term71668);
        term71760 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term71760, term71760.getClass(), "jsType", null);
        setIntField(term71760, term71760.getClass(), "type", 0);
        setField(term71760, term71760.getClass(), "first", null);
        term71834 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term71904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term71834, term71834.getClass(), "rootNode", term71904);
        setField(term71834, term71834.getClass(), "thisType", term72014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term71760;
        args[1] = term71834;
        try {
            callMethod(klass, "createScope", argTypes, term71484, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


