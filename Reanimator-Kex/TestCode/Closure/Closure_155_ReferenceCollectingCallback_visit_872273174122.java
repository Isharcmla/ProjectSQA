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

public class ReferenceCollectingCallback_visit_872273174122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25072;
     Object term25158;
     Object term25244;
     Object term25276;
     Object term25277;
     Object term25278;

    public ReferenceCollectingCallback_visit_872273174122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25072 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term25158 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term25158, term25158.getClass(), "type", -39);
        term25244 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term25276 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term25276, term25276.getClass(), "referenceMap", null);
        setField(term25276, term25276.getClass(), "blockStack", null);
        setField(term25276, term25276.getClass(), "behavior", null);
        setField(term25276, term25276.getClass(), "compiler", null);
        setField(term25276, term25276.getClass(), "varFilter", null);
        term25277 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term25277, term25277.getClass(), "functionName", null);
        setBooleanField(term25277, term25277.getClass(), "itsNeedsActivation", false);
        setIntField(term25277, term25277.getClass(), "itsFunctionType", 0);
        setBooleanField(term25277, term25277.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term25277, term25277.getClass(), "encodedSourceStart", 0);
        setIntField(term25277, term25277.getClass(), "encodedSourceEnd", 0);
        setField(term25277, term25277.getClass(), "sourceName", null);
        setIntField(term25277, term25277.getClass(), "baseLineno", 0);
        setIntField(term25277, term25277.getClass(), "endLineno", 0);
        setField(term25277, term25277.getClass(), "functions", null);
        setField(term25277, term25277.getClass(), "regexps", null);
        setField(term25277, term25277.getClass(), "itsVariables", null);
        setField(term25277, term25277.getClass(), "itsConst", null);
        setField(term25277, term25277.getClass(), "itsVariableNames", null);
        setIntField(term25277, term25277.getClass(), "varStart", 0);
        setField(term25277, term25277.getClass(), "compilerData", null);
        setIntField(term25277, term25277.getClass(), "type", -39);
        setField(term25277, term25277.getClass(), "next", null);
        setField(term25277, term25277.getClass(), "first", null);
        setField(term25277, term25277.getClass(), "last", null);
        setField(term25277, term25277.getClass(), "propListHead", null);
        setIntField(term25277, term25277.getClass(), "sourcePosition", 0);
        setField(term25277, term25277.getClass(), "jsType", null);
        setField(term25277, term25277.getClass(), "parent", null);
        term25278 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term25278, term25278.getClass(), "functionName", null);
        setBooleanField(term25278, term25278.getClass(), "itsNeedsActivation", false);
        setIntField(term25278, term25278.getClass(), "itsFunctionType", 0);
        setBooleanField(term25278, term25278.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term25278, term25278.getClass(), "encodedSourceStart", 0);
        setIntField(term25278, term25278.getClass(), "encodedSourceEnd", 0);
        setField(term25278, term25278.getClass(), "sourceName", null);
        setIntField(term25278, term25278.getClass(), "baseLineno", 0);
        setIntField(term25278, term25278.getClass(), "endLineno", 0);
        setField(term25278, term25278.getClass(), "functions", null);
        setField(term25278, term25278.getClass(), "regexps", null);
        setField(term25278, term25278.getClass(), "itsVariables", null);
        setField(term25278, term25278.getClass(), "itsConst", null);
        setField(term25278, term25278.getClass(), "itsVariableNames", null);
        setIntField(term25278, term25278.getClass(), "varStart", 0);
        setField(term25278, term25278.getClass(), "compilerData", null);
        setIntField(term25278, term25278.getClass(), "type", 0);
        setField(term25278, term25278.getClass(), "next", null);
        setField(term25278, term25278.getClass(), "first", null);
        setField(term25278, term25278.getClass(), "last", null);
        setField(term25278, term25278.getClass(), "propListHead", null);
        setIntField(term25278, term25278.getClass(), "sourcePosition", 0);
        setField(term25278, term25278.getClass(), "jsType", null);
        setField(term25278, term25278.getClass(), "parent", null);
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
        args[1] = term25158;
        args[2] = term25244;
        callMethod(klass, "visit", argTypes, term25072, args);
        assertTrue(recursiveEquals(term25072, term25276));
        assertTrue(recursiveEquals(term25158, term25278));
        assertTrue(recursiveEquals(term25244, null));
    }

};


