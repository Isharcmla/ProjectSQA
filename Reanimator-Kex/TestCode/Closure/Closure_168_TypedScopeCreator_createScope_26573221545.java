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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18518;
     Object term18668;
     Object term18952;

    public TypedScopeCreator_createScope_26573221545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18518 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term18598 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term18518, term18518.getClass(), "compiler", term18598);
        term18668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18668, term18668.getClass(), "jsType", null);
        setIntField(term18668, term18668.getClass(), "type", 0);
        setField(term18668, term18668.getClass(), "parent", null);
        setField(term18808, term18808.getClass(), "next", null);
        setIntField(term18808, term18808.getClass(), "type", 39);
        setField(term18808, term18808.getClass(), "first", null);
        setField(term18738, term18738.getClass(), "next", term18808);
        setIntField(term18738, term18738.getClass(), "type", 0);
        setField(term18878, term18878.getClass(), "next", null);
        setIntField(term18878, term18878.getClass(), "type", 0);
        setField(term18878, term18878.getClass(), "first", null);
        setField(term18878, term18878.getClass(), "parent", null);
        setField(term18738, term18738.getClass(), "first", term18878);
        setField(term18738, term18738.getClass(), "parent", null);
        setField(term18668, term18668.getClass(), "first", term18738);
        term18952 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term18952, term18952.getClass(), "rootNode", null);
        setField(term18952, term18952.getClass(), "thisType", null);
        setIntField(term18952, term18952.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term18668;
        args[1] = term18952;
        try {
            callMethod(klass, "createScope", argTypes, term18518, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


