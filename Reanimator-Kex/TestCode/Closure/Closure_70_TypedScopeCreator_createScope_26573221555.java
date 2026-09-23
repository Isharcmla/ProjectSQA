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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14873;
     Object term15023;
     Object term15167;

    public TypedScopeCreator_createScope_26573221555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14873 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term14953 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term14873, term14873.getClass(), "compiler", term14953);
        term15023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term15023, term15023.getClass(), "jsType", null);
        setIntField(term15023, term15023.getClass(), "type", 0);
        setField(term15093, term15093.getClass(), "next", null);
        setIntField(term15093, term15093.getClass(), "type", 37);
        setField(term15093, term15093.getClass(), "first", null);
        setField(term15023, term15023.getClass(), "first", term15093);
        term15167 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term15167, term15167.getClass(), "rootNode", null);
        setField(term15167, term15167.getClass(), "thisType", null);
        setIntField(term15167, term15167.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term15023;
        args[1] = term15167;
        callMethod(klass, "createScope", argTypes, term14873, args);
    }

};


