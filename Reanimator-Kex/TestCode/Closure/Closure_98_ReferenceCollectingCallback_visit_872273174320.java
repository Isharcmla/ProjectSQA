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

public class ReferenceCollectingCallback_visit_872273174320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81684;
     Object term81908;
     Object term81862;
     Object term82536;
     Object term82537;
     Object term82538;

    public ReferenceCollectingCallback_visit_872273174320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81684 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term81908 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term81908, term81908.getClass(), "type", 0);
        term81862 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term81862, term81862.getClass(), "type", 100);
        setField(term81862, term81862.getClass(), "first", term81908);
        term82536 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term82536, term82536.getClass(), "referenceMap", null);
        setField(term82536, term82536.getClass(), "blockStack", null);
        setField(term82536, term82536.getClass(), "behavior", null);
        setField(term82536, term82536.getClass(), "compiler", null);
        setField(term82536, term82536.getClass(), "varFilter", null);
        term82537 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term82537, term82537.getClass(), "str", null);
        setIntField(term82537, term82537.getClass(), "type", 0);
        setField(term82537, term82537.getClass(), "next", null);
        setField(term82537, term82537.getClass(), "first", null);
        setField(term82537, term82537.getClass(), "last", null);
        setField(term82537, term82537.getClass(), "propListHead", null);
        setIntField(term82537, term82537.getClass(), "sourcePosition", 0);
        setField(term82537, term82537.getClass(), "jsType", null);
        setField(term82537, term82537.getClass(), "parent", null);
        term82538 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term82539 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term82538, term82538.getClass(), "functionName", null);
        setBooleanField(term82538, term82538.getClass(), "itsNeedsActivation", false);
        setIntField(term82538, term82538.getClass(), "itsFunctionType", 0);
        setBooleanField(term82538, term82538.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term82538, term82538.getClass(), "encodedSourceStart", 0);
        setIntField(term82538, term82538.getClass(), "encodedSourceEnd", 0);
        setField(term82538, term82538.getClass(), "sourceName", null);
        setIntField(term82538, term82538.getClass(), "baseLineno", 0);
        setIntField(term82538, term82538.getClass(), "endLineno", 0);
        setField(term82538, term82538.getClass(), "functions", null);
        setField(term82538, term82538.getClass(), "regexps", null);
        setField(term82538, term82538.getClass(), "itsVariables", null);
        setField(term82538, term82538.getClass(), "itsConst", null);
        setField(term82538, term82538.getClass(), "itsVariableNames", null);
        setIntField(term82538, term82538.getClass(), "varStart", 0);
        setField(term82538, term82538.getClass(), "compilerData", null);
        setIntField(term82538, term82538.getClass(), "type", 100);
        setField(term82538, term82538.getClass(), "next", null);
        setField(term82539, term82539.getClass(), "str", null);
        setIntField(term82539, term82539.getClass(), "type", 0);
        setField(term82539, term82539.getClass(), "next", null);
        setField(term82539, term82539.getClass(), "first", null);
        setField(term82539, term82539.getClass(), "last", null);
        setField(term82539, term82539.getClass(), "propListHead", null);
        setIntField(term82539, term82539.getClass(), "sourcePosition", 0);
        setField(term82539, term82539.getClass(), "jsType", null);
        setField(term82539, term82539.getClass(), "parent", null);
        setField(term82538, term82538.getClass(), "first", term82539);
        setField(term82538, term82538.getClass(), "last", null);
        setField(term82538, term82538.getClass(), "propListHead", null);
        setIntField(term82538, term82538.getClass(), "sourcePosition", 0);
        setField(term82538, term82538.getClass(), "jsType", null);
        setField(term82538, term82538.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term81908;
        args[2] = term81862;
        callMethod(klass, "visit", argTypes, term81684, args);
        assertTrue(recursiveEquals(term81684, term82536));
        assertTrue(recursiveEquals(term81908, term82538));
        assertTrue(recursiveEquals(term81862, null));
    }

};


