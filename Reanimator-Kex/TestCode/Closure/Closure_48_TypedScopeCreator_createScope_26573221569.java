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

public class TypedScopeCreator_createScope_26573221569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37679;
     Object term37749;
     Object term38103;

    public TypedScopeCreator_createScope_26573221569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37679 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term37679, term37679.getClass(), "compiler", null);
        term37749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37749, term37749.getClass(), "jsType", null);
        setIntField(term37749, term37749.getClass(), "type", 0);
        setField(term37749, term37749.getClass(), "parent", null);
        setField(term37959, term37959.getClass(), "next", null);
        setIntField(term37959, term37959.getClass(), "type", 40);
        setField(term37959, term37959.getClass(), "first", null);
        setField(term37959, term37959.getClass(), "parent", null);
        setField(term37889, term37889.getClass(), "next", term37959);
        setIntField(term37889, term37889.getClass(), "type", 125);
        setField(term37889, term37889.getClass(), "first", null);
        setField(term37819, term37819.getClass(), "next", term37889);
        setIntField(term37819, term37819.getClass(), "type", 0);
        setField(term38029, term38029.getClass(), "next", null);
        setIntField(term38029, term38029.getClass(), "type", 0);
        setField(term38029, term38029.getClass(), "first", null);
        setField(term37819, term37819.getClass(), "first", term38029);
        setField(term37749, term37749.getClass(), "first", term37819);
        term38103 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term38103, term38103.getClass(), "rootNode", null);
        setField(term38103, term38103.getClass(), "thisType", null);
        setIntField(term38103, term38103.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term37749;
        args[1] = term38103;
        try {
            callMethod(klass, "createScope", argTypes, term37679, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


