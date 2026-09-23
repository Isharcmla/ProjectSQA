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

public class TypedScopeCreator_createScope_265732215123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87587;
     Object term87657;
     Object term87941;

    public TypedScopeCreator_createScope_265732215123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87587 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term87587, term87587.getClass(), "compiler", null);
        term87657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term87657, term87657.getClass(), "jsType", null);
        setIntField(term87657, term87657.getClass(), "type", 0);
        setField(term87657, term87657.getClass(), "parent", null);
        setField(term87797, term87797.getClass(), "next", term87867);
        setIntField(term87797, term87797.getClass(), "type", 122);
        setField(term87797, term87797.getClass(), "first", null);
        setField(term87727, term87727.getClass(), "next", term87797);
        setIntField(term87727, term87727.getClass(), "type", 0);
        setField(term87727, term87727.getClass(), "first", null);
        setField(term87657, term87657.getClass(), "first", term87727);
        term87941 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term88011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88119 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term87941, term87941.getClass(), "rootNode", term88011);
        setField(term87941, term87941.getClass(), "thisType", term88119);
        setIntField(term87941, term87941.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term87657;
        args[1] = term87941;
        try {
            callMethod(klass, "createScope", argTypes, term87587, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


