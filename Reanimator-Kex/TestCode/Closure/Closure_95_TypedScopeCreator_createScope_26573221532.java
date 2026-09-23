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

public class TypedScopeCreator_createScope_26573221532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17981;
     Object term18131;
     Object term18345;

    public TypedScopeCreator_createScope_26573221532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17981 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term18061 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term17981, term17981.getClass(), "compiler", term18061);
        term18131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18131, term18131.getClass(), "jsType", null);
        setIntField(term18131, term18131.getClass(), "type", 0);
        setField(term18201, term18201.getClass(), "next", term18271);
        setIntField(term18201, term18201.getClass(), "type", 39);
        setField(term18201, term18201.getClass(), "first", null);
        setField(term18131, term18131.getClass(), "first", term18201);
        term18345 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term18469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term18345, term18345.getClass(), "rootNode", null);
        setField(term18345, term18345.getClass(), "thisType", term18469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term18131;
        args[1] = term18345;
        try {
            callMethod(klass, "createScope", argTypes, term17981, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


