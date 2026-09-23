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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class FunctionToBlockMutator_replaceReturns_124525402550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6117;
     Object term15139;
     Object term15061;

    public FunctionToBlockMutator_replaceReturns_124525402550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6117, term6117.getClass(), "type", 96);
        setField(term6117, term6117.getClass(), "parent", null);
        setIntField(term6187, term6187.getClass(), "type", 96);
        setField(term6187, term6187.getClass(), "parent", null);
        setField(term6187, term6187.getClass(), "first", null);
        setField(term6187, term6187.getClass(), "next", null);
        setField(term6117, term6117.getClass(), "first", term6187);
        term15139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15139, term15139.getClass(), "type", 96);
        setField(term15139, term15139.getClass(), "next", null);
        setIntField(term15140, term15140.getClass(), "type", 96);
        setField(term15140, term15140.getClass(), "next", null);
        setField(term15140, term15140.getClass(), "first", null);
        setField(term15140, term15140.getClass(), "last", null);
        setField(term15140, term15140.getClass(), "propListHead", null);
        setIntField(term15140, term15140.getClass(), "sourcePosition", 0);
        setField(term15140, term15140.getClass(), "jsType", null);
        setField(term15140, term15140.getClass(), "parent", null);
        setField(term15139, term15139.getClass(), "first", term15140);
        setField(term15139, term15139.getClass(), "last", null);
        setField(term15139, term15139.getClass(), "propListHead", null);
        setIntField(term15139, term15139.getClass(), "sourcePosition", 0);
        setField(term15139, term15139.getClass(), "jsType", null);
        setField(term15139, term15139.getClass(), "parent", null);
        term15061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15061, term15061.getClass(), "type", 96);
        setField(term15061, term15061.getClass(), "next", null);
        setIntField(term15063, term15063.getClass(), "type", 96);
        setField(term15063, term15063.getClass(), "next", null);
        setField(term15063, term15063.getClass(), "first", null);
        setField(term15063, term15063.getClass(), "last", null);
        setField(term15063, term15063.getClass(), "propListHead", null);
        setIntField(term15063, term15063.getClass(), "sourcePosition", 0);
        setField(term15063, term15063.getClass(), "jsType", null);
        setField(term15063, term15063.getClass(), "parent", null);
        setField(term15061, term15061.getClass(), "first", term15063);
        setField(term15061, term15061.getClass(), "last", null);
        setField(term15061, term15061.getClass(), "propListHead", null);
        setIntField(term15061, term15061.getClass(), "sourcePosition", 0);
        setField(term15061, term15061.getClass(), "jsType", null);
        setField(term15061, term15061.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term6117;
        args[1] = null;
        args[2] = "";
        args[3] = true;
        Object retValue = callMethod(klass, "replaceReturns", argTypes, null, args);
        assertTrue(recursiveEquals(term6117, term15139));
        assertTrue(recursiveEquals(retValue, term15061));
    }

};


