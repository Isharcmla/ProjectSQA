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

public class TypedScopeCreator_createScope_265732215105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72497;
     Object term72647;
     Object term72861;

    public TypedScopeCreator_createScope_265732215105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72497 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term72577 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term72497, term72497.getClass(), "compiler", term72577);
        term72647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term72647, term72647.getClass(), "jsType", null);
        setIntField(term72647, term72647.getClass(), "type", 0);
        setField(term72647, term72647.getClass(), "parent", null);
        setField(term72717, term72717.getClass(), "next", null);
        setIntField(term72717, term72717.getClass(), "type", 0);
        setField(term72787, term72787.getClass(), "next", null);
        setIntField(term72787, term72787.getClass(), "type", 0);
        setField(term72787, term72787.getClass(), "first", null);
        setField(term72717, term72717.getClass(), "first", term72787);
        setField(term72647, term72647.getClass(), "first", term72717);
        term72861 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term72931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term72861, term72861.getClass(), "rootNode", term72931);
        setField(term72861, term72861.getClass(), "thisType", null);
        setIntField(term72861, term72861.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term72647;
        args[1] = term72861;
        try {
            callMethod(klass, "createScope", argTypes, term72497, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


