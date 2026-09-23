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
import java.util.HashMap;
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12627;
     Object term12745;
     Object term13029;

    public TypedScopeCreator_createScope_26573221537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12675 = new HashMap();
        term12627 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term12627, term12627.getClass(), "compiler", null);
        setField(term12627, term12627.getClass(), "functionAnalysisResults", term12675);
        term12745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12745, term12745.getClass(), "jsType", null);
        setIntField(term12745, term12745.getClass(), "type", 0);
        setField(term12745, term12745.getClass(), "parent", null);
        setField(term12885, term12885.getClass(), "next", null);
        setIntField(term12885, term12885.getClass(), "type", 0);
        setField(term12885, term12885.getClass(), "first", null);
        setField(term12815, term12815.getClass(), "next", term12885);
        setIntField(term12815, term12815.getClass(), "type", 0);
        setField(term12955, term12955.getClass(), "next", null);
        setIntField(term12955, term12955.getClass(), "type", 0);
        setField(term12955, term12955.getClass(), "first", null);
        setField(term12815, term12815.getClass(), "first", term12955);
        setField(term12745, term12745.getClass(), "first", term12815);
        term13029 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term13029, term13029.getClass(), "rootNode", null);
        setField(term13029, term13029.getClass(), "thisType", null);
        setIntField(term13029, term13029.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term12745;
        args[1] = term13029;
        try {
            callMethod(klass, "createScope", argTypes, term12627, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


