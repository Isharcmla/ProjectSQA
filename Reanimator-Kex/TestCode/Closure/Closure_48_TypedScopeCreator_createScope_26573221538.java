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

public class TypedScopeCreator_createScope_26573221538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12611;
     Object term12729;
     Object term13013;

    public TypedScopeCreator_createScope_26573221538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12659 = new HashMap();
        term12611 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term12611, term12611.getClass(), "compiler", null);
        setField(term12611, term12611.getClass(), "functionAnalysisResults", term12659);
        term12729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12729, term12729.getClass(), "jsType", null);
        setIntField(term12729, term12729.getClass(), "type", 0);
        setField(term12729, term12729.getClass(), "parent", null);
        setField(term12869, term12869.getClass(), "next", null);
        setIntField(term12869, term12869.getClass(), "type", 0);
        setField(term12869, term12869.getClass(), "first", null);
        setField(term12799, term12799.getClass(), "next", term12869);
        setIntField(term12799, term12799.getClass(), "type", 0);
        setField(term12939, term12939.getClass(), "next", null);
        setIntField(term12939, term12939.getClass(), "type", 0);
        setField(term12939, term12939.getClass(), "first", null);
        setField(term12799, term12799.getClass(), "first", term12939);
        setField(term12729, term12729.getClass(), "first", term12799);
        term13013 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term13083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term13013, term13013.getClass(), "rootNode", term13083);
        setField(term13013, term13013.getClass(), "thisType", null);
        setIntField(term13013, term13013.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term12729;
        args[1] = term13013;
        try {
            callMethod(klass, "createScope", argTypes, term12611, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


