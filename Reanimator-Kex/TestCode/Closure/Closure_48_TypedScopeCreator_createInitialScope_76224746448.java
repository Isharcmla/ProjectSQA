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

public class TypedScopeCreator_createInitialScope_76224746448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20178;
     Object term20454;

    public TypedScopeCreator_createInitialScope_76224746448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20178 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term20258 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term20362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term20178, term20178.getClass(), "compiler", term20258);
        setField(term20178, term20178.getClass(), "typeRegistry", term20362);
        term20454 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term20454, term20454.getClass(), "type", -133);
        setField(term20454, term20454.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20454;
        try {
            callMethod(klass, "createInitialScope", argTypes, term20178, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


