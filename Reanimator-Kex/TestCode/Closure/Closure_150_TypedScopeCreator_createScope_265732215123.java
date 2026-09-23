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

public class TypedScopeCreator_createScope_265732215123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74785;
     Object term74935;
     Object term75241;

    public TypedScopeCreator_createScope_265732215123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74785 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term74865 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term74785, term74785.getClass(), "compiler", term74865);
        term74935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75075 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75167 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term74935, term74935.getClass(), "jsType", null);
        setIntField(term74935, term74935.getClass(), "type", 0);
        setField(term75075, term75075.getClass(), "next", null);
        setIntField(term75075, term75075.getClass(), "type", 40);
        setField(term75075, term75075.getClass(), "first", null);
        setField(term75005, term75005.getClass(), "next", term75075);
        setIntField(term75005, term75005.getClass(), "type", 64);
        setField(term75005, term75005.getClass(), "first", null);
        setField(term75005, term75005.getClass(), "jsType", term75167);
        setField(term74935, term74935.getClass(), "first", term75005);
        term75241 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term75311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term75241, term75241.getClass(), "rootNode", term75311);
        setField(term75241, term75241.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term74935;
        args[1] = term75241;
        try {
            callMethod(klass, "createScope", argTypes, term74785, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


