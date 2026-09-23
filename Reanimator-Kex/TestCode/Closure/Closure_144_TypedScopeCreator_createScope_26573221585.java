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

public class TypedScopeCreator_createScope_26573221585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42183;
     Object term42253;
     Object term42467;

    public TypedScopeCreator_createScope_26573221585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42183 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term42183, term42183.getClass(), "compiler", null);
        term42253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42253, term42253.getClass(), "jsType", null);
        setIntField(term42253, term42253.getClass(), "type", 0);
        setField(term42323, term42323.getClass(), "next", term42393);
        setIntField(term42323, term42323.getClass(), "type", 132);
        setField(term42253, term42253.getClass(), "first", term42323);
        term42467 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term42537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42467, term42467.getClass(), "rootNode", term42537);
        setField(term42467, term42467.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term42253;
        args[1] = term42467;
        try {
            callMethod(klass, "createScope", argTypes, term42183, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


