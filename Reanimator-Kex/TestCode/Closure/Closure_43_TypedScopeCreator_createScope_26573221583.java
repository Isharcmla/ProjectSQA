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

public class TypedScopeCreator_createScope_26573221583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50587;
     Object term50657;
     Object term50871;

    public TypedScopeCreator_createScope_26573221583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50587 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term50587, term50587.getClass(), "compiler", null);
        term50657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50657, term50657.getClass(), "jsType", null);
        setIntField(term50657, term50657.getClass(), "type", 0);
        setField(term50657, term50657.getClass(), "parent", null);
        setField(term50727, term50727.getClass(), "next", null);
        setIntField(term50727, term50727.getClass(), "type", 0);
        setField(term50797, term50797.getClass(), "next", null);
        setIntField(term50797, term50797.getClass(), "type", 0);
        setField(term50797, term50797.getClass(), "first", null);
        setField(term50727, term50727.getClass(), "first", term50797);
        setField(term50657, term50657.getClass(), "first", term50727);
        term50871 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term50871, term50871.getClass(), "rootNode", null);
        setField(term50871, term50871.getClass(), "thisType", null);
        setIntField(term50871, term50871.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term50657;
        args[1] = term50871;
        try {
            callMethod(klass, "createScope", argTypes, term50587, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


