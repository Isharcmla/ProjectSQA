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

public class TypedScopeCreator_createScope_26573221548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13691;
     Object term13841;
     Object term13985;

    public TypedScopeCreator_createScope_26573221548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13691 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term13771 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term13691, term13691.getClass(), "compiler", term13771);
        term13841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13841, term13841.getClass(), "type", -133);
        setField(term13841, term13841.getClass(), "parent", term13911);
        term13985 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term14055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term13985, term13985.getClass(), "rootNode", term14055);
        setIntField(term13985, term13985.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term13841;
        args[1] = term13985;
        try {
            callMethod(klass, "createScope", argTypes, term13691, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


