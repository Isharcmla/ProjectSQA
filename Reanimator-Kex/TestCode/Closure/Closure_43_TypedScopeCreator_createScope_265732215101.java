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

public class TypedScopeCreator_createScope_265732215101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68742;
     Object term68812;
     Object term69026;

    public TypedScopeCreator_createScope_265732215101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68742 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term68742, term68742.getClass(), "compiler", null);
        term68812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term68812, term68812.getClass(), "jsType", null);
        setIntField(term68812, term68812.getClass(), "type", 0);
        setField(term68812, term68812.getClass(), "parent", null);
        setField(term68952, term68952.getClass(), "next", null);
        setIntField(term68952, term68952.getClass(), "type", 83);
        setField(term68952, term68952.getClass(), "first", null);
        setField(term68882, term68882.getClass(), "next", term68952);
        setIntField(term68882, term68882.getClass(), "type", 0);
        setField(term68882, term68882.getClass(), "first", null);
        setField(term68812, term68812.getClass(), "first", term68882);
        term69026 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term69096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69026, term69026.getClass(), "rootNode", term69096);
        setField(term69026, term69026.getClass(), "thisType", null);
        setIntField(term69026, term69026.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term68812;
        args[1] = term69026;
        try {
            callMethod(klass, "createScope", argTypes, term68742, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


