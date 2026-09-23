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

public class TypedScopeCreator_createScope_26573221577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47000;
     Object term47150;
     Object term47364;

    public TypedScopeCreator_createScope_26573221577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47000 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term47080 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term47000, term47000.getClass(), "compiler", term47080);
        term47150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47150, term47150.getClass(), "jsType", null);
        setIntField(term47150, term47150.getClass(), "type", 0);
        setField(term47150, term47150.getClass(), "parent", null);
        setField(term47220, term47220.getClass(), "next", null);
        setIntField(term47220, term47220.getClass(), "type", 0);
        setField(term47290, term47290.getClass(), "next", null);
        setIntField(term47290, term47290.getClass(), "type", 0);
        setField(term47290, term47290.getClass(), "first", null);
        setField(term47290, term47290.getClass(), "parent", null);
        setField(term47220, term47220.getClass(), "first", term47290);
        setField(term47220, term47220.getClass(), "parent", null);
        setField(term47150, term47150.getClass(), "first", term47220);
        term47364 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term47434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47364, term47364.getClass(), "rootNode", term47434);
        setField(term47364, term47364.getClass(), "thisType", null);
        setIntField(term47364, term47364.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term47150;
        args[1] = term47364;
        try {
            callMethod(klass, "createScope", argTypes, term47000, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


