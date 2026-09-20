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

public class RemoveUnusedVars_traverseNode_121208155157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15766;
     Object term15836;

    public RemoveUnusedVars_traverseNode_121208155157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15766 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term15836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15836, term15836.getClass(), "type", 0);
        setIntField(term15906, term15906.getClass(), "type", 64);
        setIntField(term15976, term15976.getClass(), "type", 64);
        setField(term15976, term15976.getClass(), "first", null);
        setField(term15976, term15976.getClass(), "next", term16046);
        setField(term15906, term15906.getClass(), "first", term15976);
        setField(term15836, term15836.getClass(), "first", term15906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term15836;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term15766, args);
    }

};
