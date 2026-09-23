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

public class TypedScopeCreator_createScope_265732215117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56155;
     Object term56247;
     Object term56321;

    public TypedScopeCreator_createScope_265732215117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56155 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term56155, term56155.getClass(), "compiler", null);
        term56247 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term56247, term56247.getClass(), "jsType", null);
        term56321 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term56391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term56321, term56321.getClass(), "rootNode", term56391);
        setField(term56321, term56321.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term56247;
        args[1] = term56321;
        try {
            callMethod(klass, "createScope", argTypes, term56155, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


