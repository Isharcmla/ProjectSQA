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

public class ReferenceCollectingCallback_visit_872273174407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108113;
     Object term108328;
     Object term108285;
     Object term108726;
     Object term108727;
     Object term108728;

    public ReferenceCollectingCallback_visit_872273174407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108113 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term108328 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term108328, term108328.getClass(), "type", 101);
        term108285 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term108285, term108285.getClass(), "type", 101);
        setField(term108285, term108285.getClass(), "first", term108328);
        term108726 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term108726, term108726.getClass(), "referenceMap", null);
        setField(term108726, term108726.getClass(), "blockStack", null);
        setField(term108726, term108726.getClass(), "behavior", null);
        setField(term108726, term108726.getClass(), "compiler", null);
        setField(term108726, term108726.getClass(), "varFilter", null);
        term108727 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term108727, term108727.getClass(), "functionName", null);
        setBooleanField(term108727, term108727.getClass(), "itsNeedsActivation", false);
        setIntField(term108727, term108727.getClass(), "itsFunctionType", 0);
        setBooleanField(term108727, term108727.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term108727, term108727.getClass(), "encodedSourceStart", 0);
        setIntField(term108727, term108727.getClass(), "encodedSourceEnd", 0);
        setField(term108727, term108727.getClass(), "sourceName", null);
        setIntField(term108727, term108727.getClass(), "baseLineno", 0);
        setIntField(term108727, term108727.getClass(), "endLineno", 0);
        setField(term108727, term108727.getClass(), "functions", null);
        setField(term108727, term108727.getClass(), "regexps", null);
        setField(term108727, term108727.getClass(), "itsVariables", null);
        setField(term108727, term108727.getClass(), "itsConst", null);
        setField(term108727, term108727.getClass(), "itsVariableNames", null);
        setIntField(term108727, term108727.getClass(), "varStart", 0);
        setField(term108727, term108727.getClass(), "compilerData", null);
        setIntField(term108727, term108727.getClass(), "type", 101);
        setField(term108727, term108727.getClass(), "next", null);
        setField(term108727, term108727.getClass(), "first", null);
        setField(term108727, term108727.getClass(), "last", null);
        setField(term108727, term108727.getClass(), "propListHead", null);
        setIntField(term108727, term108727.getClass(), "sourcePosition", 0);
        setField(term108727, term108727.getClass(), "jsType", null);
        setField(term108727, term108727.getClass(), "parent", null);
        term108728 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term108729 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term108728, term108728.getClass(), "functionName", null);
        setBooleanField(term108728, term108728.getClass(), "itsNeedsActivation", false);
        setIntField(term108728, term108728.getClass(), "itsFunctionType", 0);
        setBooleanField(term108728, term108728.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term108728, term108728.getClass(), "encodedSourceStart", 0);
        setIntField(term108728, term108728.getClass(), "encodedSourceEnd", 0);
        setField(term108728, term108728.getClass(), "sourceName", null);
        setIntField(term108728, term108728.getClass(), "baseLineno", 0);
        setIntField(term108728, term108728.getClass(), "endLineno", 0);
        setField(term108728, term108728.getClass(), "functions", null);
        setField(term108728, term108728.getClass(), "regexps", null);
        setField(term108728, term108728.getClass(), "itsVariables", null);
        setField(term108728, term108728.getClass(), "itsConst", null);
        setField(term108728, term108728.getClass(), "itsVariableNames", null);
        setIntField(term108728, term108728.getClass(), "varStart", 0);
        setField(term108728, term108728.getClass(), "compilerData", null);
        setIntField(term108728, term108728.getClass(), "type", 101);
        setField(term108728, term108728.getClass(), "next", null);
        setField(term108729, term108729.getClass(), "functionName", null);
        setBooleanField(term108729, term108729.getClass(), "itsNeedsActivation", false);
        setIntField(term108729, term108729.getClass(), "itsFunctionType", 0);
        setBooleanField(term108729, term108729.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term108729, term108729.getClass(), "encodedSourceStart", 0);
        setIntField(term108729, term108729.getClass(), "encodedSourceEnd", 0);
        setField(term108729, term108729.getClass(), "sourceName", null);
        setIntField(term108729, term108729.getClass(), "baseLineno", 0);
        setIntField(term108729, term108729.getClass(), "endLineno", 0);
        setField(term108729, term108729.getClass(), "functions", null);
        setField(term108729, term108729.getClass(), "regexps", null);
        setField(term108729, term108729.getClass(), "itsVariables", null);
        setField(term108729, term108729.getClass(), "itsConst", null);
        setField(term108729, term108729.getClass(), "itsVariableNames", null);
        setIntField(term108729, term108729.getClass(), "varStart", 0);
        setField(term108729, term108729.getClass(), "compilerData", null);
        setIntField(term108729, term108729.getClass(), "type", 101);
        setField(term108729, term108729.getClass(), "next", null);
        setField(term108729, term108729.getClass(), "first", null);
        setField(term108729, term108729.getClass(), "last", null);
        setField(term108729, term108729.getClass(), "propListHead", null);
        setIntField(term108729, term108729.getClass(), "sourcePosition", 0);
        setField(term108729, term108729.getClass(), "jsType", null);
        setField(term108729, term108729.getClass(), "parent", null);
        setField(term108728, term108728.getClass(), "first", term108729);
        setField(term108728, term108728.getClass(), "last", null);
        setField(term108728, term108728.getClass(), "propListHead", null);
        setIntField(term108728, term108728.getClass(), "sourcePosition", 0);
        setField(term108728, term108728.getClass(), "jsType", null);
        setField(term108728, term108728.getClass(), "parent", null);
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
        args[1] = term108328;
        args[2] = term108285;
        callMethod(klass, "visit", argTypes, term108113, args);
        assertTrue(recursiveEquals(term108113, term108726));
        assertTrue(recursiveEquals(term108328, term108728));
        assertTrue(recursiveEquals(term108285, null));
    }

};


