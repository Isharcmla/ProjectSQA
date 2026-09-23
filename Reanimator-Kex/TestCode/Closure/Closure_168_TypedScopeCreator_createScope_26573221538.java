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

public class TypedScopeCreator_createScope_26573221538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12286;
     Object term12436;
     Object term12720;

    public TypedScopeCreator_createScope_26573221538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12286 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term12366 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term12286, term12286.getClass(), "compiler", term12366);
        term12436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12436, term12436.getClass(), "jsType", null);
        setIntField(term12436, term12436.getClass(), "type", 0);
        setField(term12436, term12436.getClass(), "parent", null);
        setField(term12576, term12576.getClass(), "next", null);
        setIntField(term12576, term12576.getClass(), "type", 33);
        setField(term12576, term12576.getClass(), "first", null);
        setField(term12506, term12506.getClass(), "next", term12576);
        setIntField(term12506, term12506.getClass(), "type", 0);
        setField(term12646, term12646.getClass(), "next", null);
        setIntField(term12646, term12646.getClass(), "type", 0);
        setField(term12646, term12646.getClass(), "first", null);
        setField(term12646, term12646.getClass(), "parent", null);
        setField(term12506, term12506.getClass(), "first", term12646);
        setField(term12506, term12506.getClass(), "parent", null);
        setField(term12436, term12436.getClass(), "first", term12506);
        term12720 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term12790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12720, term12720.getClass(), "rootNode", term12790);
        setField(term12720, term12720.getClass(), "thisType", null);
        setIntField(term12720, term12720.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term12436;
        args[1] = term12720;
        try {
            callMethod(klass, "createScope", argTypes, term12286, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


