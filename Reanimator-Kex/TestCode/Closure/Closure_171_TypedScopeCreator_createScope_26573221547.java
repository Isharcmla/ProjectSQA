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

public class TypedScopeCreator_createScope_26573221547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14137;
     Object term14207;
     Object term14281;

    public TypedScopeCreator_createScope_26573221547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14137 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term14137, term14137.getClass(), "compiler", null);
        term14207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14207, term14207.getClass(), "type", -133);
        setField(term14207, term14207.getClass(), "parent", null);
        term14281 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term14281, term14281.getClass(), "rootNode", null);
        setIntField(term14281, term14281.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term14207;
        args[1] = term14281;
        try {
            callMethod(klass, "createScope", argTypes, term14137, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


