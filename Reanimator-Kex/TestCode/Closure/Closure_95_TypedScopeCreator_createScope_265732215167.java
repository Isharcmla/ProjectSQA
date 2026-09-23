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

public class TypedScopeCreator_createScope_265732215167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122829;
     Object term122899;
     Object term123183;

    public TypedScopeCreator_createScope_265732215167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122829 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term122829, term122829.getClass(), "compiler", null);
        term122899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term122899, term122899.getClass(), "jsType", null);
        setIntField(term122899, term122899.getClass(), "type", 0);
        setField(term123039, term123039.getClass(), "next", term122899);
        setIntField(term123039, term123039.getClass(), "type", 41);
        setField(term123039, term123039.getClass(), "first", null);
        setField(term122969, term122969.getClass(), "next", term123039);
        setIntField(term122969, term122969.getClass(), "type", 0);
        setField(term123109, term123109.getClass(), "next", null);
        setIntField(term123109, term123109.getClass(), "type", 0);
        setField(term123109, term123109.getClass(), "first", null);
        setField(term122969, term122969.getClass(), "first", term123109);
        setField(term122899, term122899.getClass(), "first", term122969);
        term123183 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term123253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term123183, term123183.getClass(), "rootNode", term123253);
        setField(term123183, term123183.getClass(), "thisType", term123353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term122899;
        args[1] = term123183;
        try {
            callMethod(klass, "createScope", argTypes, term122829, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


