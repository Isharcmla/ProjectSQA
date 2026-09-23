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

public class TypedScopeCreator_createScope_26573221543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16505;
     Object term16575;
     Object term16789;

    public TypedScopeCreator_createScope_26573221543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16505 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term16505, term16505.getClass(), "compiler", null);
        term16575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term16575, term16575.getClass(), "jsType", null);
        setIntField(term16575, term16575.getClass(), "type", 0);
        setField(term16575, term16575.getClass(), "parent", null);
        setField(term16645, term16645.getClass(), "next", null);
        setIntField(term16645, term16645.getClass(), "type", 0);
        setField(term16715, term16715.getClass(), "next", null);
        setIntField(term16715, term16715.getClass(), "type", 37);
        setField(term16715, term16715.getClass(), "first", null);
        setField(term16645, term16645.getClass(), "first", term16715);
        setField(term16575, term16575.getClass(), "first", term16645);
        term16789 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term16789, term16789.getClass(), "rootNode", null);
        setField(term16789, term16789.getClass(), "thisType", null);
        setIntField(term16789, term16789.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term16575;
        args[1] = term16789;
        try {
            callMethod(klass, "createScope", argTypes, term16505, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


