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

public class TypedScopeCreator_createScope_26573221598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74041;
     Object term74111;
     Object term74395;

    public TypedScopeCreator_createScope_26573221598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74041 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term74041, term74041.getClass(), "compiler", null);
        setField(term74041, term74041.getClass(), "codingConvention", null);
        term74111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term74111, term74111.getClass(), "jsType", null);
        setIntField(term74111, term74111.getClass(), "type", 0);
        setField(term74111, term74111.getClass(), "parent", null);
        setField(term74181, term74181.getClass(), "next", term74251);
        setIntField(term74181, term74181.getClass(), "type", 37);
        setField(term74321, term74321.getClass(), "next", null);
        setIntField(term74321, term74321.getClass(), "type", 0);
        setField(term74321, term74321.getClass(), "first", null);
        setField(term74321, term74321.getClass(), "parent", null);
        setField(term74181, term74181.getClass(), "first", term74321);
        setField(term74111, term74111.getClass(), "first", term74181);
        term74395 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term74395, term74395.getClass(), "rootNode", null);
        setField(term74395, term74395.getClass(), "thisType", null);
        setIntField(term74395, term74395.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term74111;
        args[1] = term74395;
        callMethod(klass, "createScope", argTypes, term74041, args);
    }

};


