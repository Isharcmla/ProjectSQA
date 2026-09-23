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

public class TypedScopeCreator_createScope_26573221533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11727;
     Object term11845;
     Object term12129;

    public TypedScopeCreator_createScope_26573221533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11775 = new HashMap();
        term11727 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term11727, term11727.getClass(), "compiler", null);
        setField(term11727, term11727.getClass(), "functionAnalysisResults", term11775);
        term11845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term11845, term11845.getClass(), "jsType", null);
        setIntField(term11845, term11845.getClass(), "type", 0);
        setField(term11845, term11845.getClass(), "parent", null);
        setField(term12164, term12164.getClass(), "next", null);
        setIntField(term12164, term12164.getClass(), "type", 0);
        setField(term12164, term12164.getClass(), "first", null);
        setField(term12164, term12164.getClass(), "parent", null);
        setField(term11915, term11915.getClass(), "next", term12164);
        setIntField(term11915, term11915.getClass(), "type", 0);
        setField(term12055, term12055.getClass(), "next", null);
        setIntField(term12055, term12055.getClass(), "type", 0);
        setField(term12055, term12055.getClass(), "first", null);
        setField(term12055, term12055.getClass(), "parent", null);
        setField(term11915, term11915.getClass(), "first", term12055);
        setField(term11915, term11915.getClass(), "parent", null);
        setField(term11845, term11845.getClass(), "first", term11915);
        term12129 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term12260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term12129, term12129.getClass(), "rootNode", term12164);
        setField(term12129, term12129.getClass(), "thisType", term12260);
        setIntField(term12129, term12129.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term11845;
        args[1] = term12129;
        try {
            callMethod(klass, "createScope", argTypes, term11727, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


