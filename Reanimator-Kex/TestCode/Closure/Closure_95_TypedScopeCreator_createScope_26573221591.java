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

public class TypedScopeCreator_createScope_26573221591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57379;
     Object term57449;
     Object term57751;

    public TypedScopeCreator_createScope_26573221591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57379 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term57379, term57379.getClass(), "compiler", null);
        term57449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57677 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term57449, term57449.getClass(), "jsType", null);
        setIntField(term57449, term57449.getClass(), "type", 0);
        setField(term57519, term57519.getClass(), "next", term57589);
        setIntField(term57519, term57519.getClass(), "type", 64);
        setField(term57519, term57519.getClass(), "first", null);
        setField(term57519, term57519.getClass(), "jsType", term57677);
        setField(term57449, term57449.getClass(), "first", term57519);
        term57751 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term57849 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term57751, term57751.getClass(), "rootNode", null);
        setField(term57751, term57751.getClass(), "thisType", term57849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term57449;
        args[1] = term57751;
        try {
            callMethod(klass, "createScope", argTypes, term57379, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


