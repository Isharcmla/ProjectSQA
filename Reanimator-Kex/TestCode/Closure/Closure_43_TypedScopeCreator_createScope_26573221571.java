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

public class TypedScopeCreator_createScope_26573221571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41130;
     Object term41200;
     Object term41484;

    public TypedScopeCreator_createScope_26573221571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41130 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term41130, term41130.getClass(), "compiler", null);
        term41200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term41200, term41200.getClass(), "jsType", null);
        setIntField(term41200, term41200.getClass(), "type", 0);
        setField(term41200, term41200.getClass(), "parent", null);
        setField(term41270, term41270.getClass(), "next", term41340);
        setIntField(term41270, term41270.getClass(), "type", 83);
        setField(term41410, term41410.getClass(), "next", null);
        setIntField(term41410, term41410.getClass(), "type", 0);
        setField(term41410, term41410.getClass(), "first", null);
        setField(term41270, term41270.getClass(), "first", term41410);
        setField(term41200, term41200.getClass(), "first", term41270);
        term41484 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term41484, term41484.getClass(), "rootNode", null);
        setField(term41484, term41484.getClass(), "thisType", null);
        setIntField(term41484, term41484.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term41200;
        args[1] = term41484;
        try {
            callMethod(klass, "createScope", argTypes, term41130, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


