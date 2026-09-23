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

public class TypedScopeCreator_createInitialScope_76224746469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40133;
     Object term40307;

    public TypedScopeCreator_createInitialScope_76224746469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40133 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term40237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term40133, term40133.getClass(), "compiler", null);
        setField(term40133, term40133.getClass(), "typeRegistry", term40237);
        term40307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40307, term40307.getClass(), "type", 119);
        setField(term40307, term40307.getClass(), "parent", null);
        setField(term40377, term40377.getClass(), "next", null);
        setIntField(term40377, term40377.getClass(), "type", 0);
        setField(term40377, term40377.getClass(), "first", null);
        setField(term40307, term40307.getClass(), "first", term40377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40307;
        try {
            callMethod(klass, "createInitialScope", argTypes, term40133, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


