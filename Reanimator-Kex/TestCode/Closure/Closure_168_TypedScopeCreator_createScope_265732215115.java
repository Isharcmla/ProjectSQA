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

public class TypedScopeCreator_createScope_265732215115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68329;
     Object term68399;
     Object term68753;

    public TypedScopeCreator_createScope_265732215115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68329 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term68329, term68329.getClass(), "compiler", null);
        term68399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term68399, term68399.getClass(), "jsType", null);
        setIntField(term68399, term68399.getClass(), "type", 0);
        setField(term68399, term68399.getClass(), "parent", null);
        setField(term68469, term68469.getClass(), "next", term68539);
        setIntField(term68469, term68469.getClass(), "type", 39);
        setField(term68679, term68679.getClass(), "next", null);
        setIntField(term68679, term68679.getClass(), "type", 0);
        setField(term68679, term68679.getClass(), "first", null);
        setField(term68679, term68679.getClass(), "parent", null);
        setField(term68609, term68609.getClass(), "next", term68679);
        setIntField(term68609, term68609.getClass(), "type", 0);
        setField(term68609, term68609.getClass(), "first", null);
        setField(term68609, term68609.getClass(), "parent", null);
        setField(term68469, term68469.getClass(), "first", term68609);
        setField(term68399, term68399.getClass(), "first", term68469);
        term68753 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term68823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term68753, term68753.getClass(), "rootNode", term68823);
        setField(term68753, term68753.getClass(), "thisType", null);
        setIntField(term68753, term68753.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term68399;
        args[1] = term68753;
        try {
            callMethod(klass, "createScope", argTypes, term68329, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


