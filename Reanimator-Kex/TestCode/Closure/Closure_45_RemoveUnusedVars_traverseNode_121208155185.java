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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RemoveUnusedVars_traverseNode_121208155185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20187;
     Object term20279;

    public RemoveUnusedVars_traverseNode_121208155185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20187 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term20279 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term20371 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term20463 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term20555 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term20647 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term20279, term20279.getClass(), "type", -302120961);
        setIntField(term20371, term20371.getClass(), "type", 0);
        setIntField(term20463, term20463.getClass(), "type", 64);
        setField(term20463, term20463.getClass(), "first", null);
        setField(term20463, term20463.getClass(), "next", null);
        setField(term20371, term20371.getClass(), "first", term20463);
        setIntField(term20555, term20555.getClass(), "type", 0);
        setField(term20555, term20555.getClass(), "first", term20647);
        setField(term20371, term20371.getClass(), "next", term20555);
        setField(term20279, term20279.getClass(), "first", term20371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term20279;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term20187, args);
    }

};


