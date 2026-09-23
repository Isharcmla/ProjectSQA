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

public class TypedScopeCreator_createInitialScope_76224746443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16346;
     Object term16416;

    public TypedScopeCreator_createInitialScope_76224746443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16346 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term16346, term16346.getClass(), "compiler", null);
        setField(term16346, term16346.getClass(), "typeRegistry", null);
        term16416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16578 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term16416, term16416.getClass(), "type", 0);
        setField(term16416, term16416.getClass(), "parent", null);
        setField(term16486, term16486.getClass(), "next", term16578);
        setIntField(term16486, term16486.getClass(), "type", 0);
        setField(term16416, term16416.getClass(), "first", term16486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term16416;
        try {
            callMethod(klass, "createInitialScope", argTypes, term16346, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


