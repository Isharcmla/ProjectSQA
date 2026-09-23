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

public class TypedScopeCreator_createScope_26573221539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13508;
     Object term13626;
     Object term13910;

    public TypedScopeCreator_createScope_26573221539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13556 = new HashMap();
        term13508 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term13508, term13508.getClass(), "compiler", null);
        setField(term13508, term13508.getClass(), "functionAnalysisResults", term13556);
        term13626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term13626, term13626.getClass(), "jsType", null);
        setIntField(term13626, term13626.getClass(), "type", 0);
        setField(term13626, term13626.getClass(), "parent", null);
        setField(term13945, term13945.getClass(), "next", null);
        setIntField(term13945, term13945.getClass(), "type", 0);
        setField(term13945, term13945.getClass(), "first", null);
        setField(term13945, term13945.getClass(), "parent", null);
        setField(term13696, term13696.getClass(), "next", term13945);
        setIntField(term13696, term13696.getClass(), "type", 0);
        setField(term13836, term13836.getClass(), "next", null);
        setIntField(term13836, term13836.getClass(), "type", 0);
        setField(term13836, term13836.getClass(), "first", null);
        setField(term13836, term13836.getClass(), "parent", null);
        setField(term13696, term13696.getClass(), "first", term13836);
        setField(term13696, term13696.getClass(), "parent", null);
        setField(term13626, term13626.getClass(), "first", term13696);
        term13910 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term14041 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term13910, term13910.getClass(), "rootNode", term13945);
        setField(term13910, term13910.getClass(), "thisType", term14041);
        setIntField(term13910, term13910.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term13626;
        args[1] = term13910;
        try {
            callMethod(klass, "createScope", argTypes, term13508, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


