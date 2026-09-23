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

public class TypedScopeCreator_createScope_26573221582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49456;
     Object term49526;
     Object term49600;

    public TypedScopeCreator_createScope_26573221582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49456 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term49456, term49456.getClass(), "compiler", null);
        term49526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49526, term49526.getClass(), "jsType", null);
        setIntField(term49526, term49526.getClass(), "type", 0);
        setField(term49526, term49526.getClass(), "parent", null);
        setField(term49526, term49526.getClass(), "first", null);
        term49600 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term49670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49600, term49600.getClass(), "rootNode", term49670);
        setField(term49600, term49600.getClass(), "thisType", null);
        setIntField(term49600, term49600.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term49526;
        args[1] = term49600;
        try {
            callMethod(klass, "createScope", argTypes, term49456, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


