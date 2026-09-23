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

public class TypedScopeCreator_createScope_265732215135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67694;
     Object term67764;
     Object term67908;

    public TypedScopeCreator_createScope_265732215135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67694 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term67694, term67694.getClass(), "compiler", null);
        term67764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67764, term67764.getClass(), "jsType", null);
        setIntField(term67764, term67764.getClass(), "type", 0);
        setField(term67834, term67834.getClass(), "next", null);
        setIntField(term67834, term67834.getClass(), "type", 132);
        setField(term67834, term67834.getClass(), "propListHead", null);
        setField(term67834, term67834.getClass(), "first", null);
        setField(term67764, term67764.getClass(), "first", term67834);
        term67908 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term67908, term67908.getClass(), "rootNode", null);
        setField(term67908, term67908.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term67764;
        args[1] = term67908;
        try {
            callMethod(klass, "createScope", argTypes, term67694, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


