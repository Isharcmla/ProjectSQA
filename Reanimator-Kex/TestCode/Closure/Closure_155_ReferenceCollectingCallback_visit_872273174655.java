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

public class ReferenceCollectingCallback_visit_872273174655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172507;
     Object term172728;
     Object term172685;
     Object term173135;
     Object term173136;
     Object term173137;

    public ReferenceCollectingCallback_visit_872273174655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172507 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term172728 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term172728, term172728.getClass(), "type", 0);
        term172685 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term172685, term172685.getClass(), "type", 108);
        setField(term172685, term172685.getClass(), "first", term172728);
        term173135 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term173135, term173135.getClass(), "referenceMap", null);
        setField(term173135, term173135.getClass(), "blockStack", null);
        setField(term173135, term173135.getClass(), "behavior", null);
        setField(term173135, term173135.getClass(), "compiler", null);
        setField(term173135, term173135.getClass(), "varFilter", null);
        term173136 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term173136, term173136.getClass(), "functionName", null);
        setBooleanField(term173136, term173136.getClass(), "itsNeedsActivation", false);
        setIntField(term173136, term173136.getClass(), "itsFunctionType", 0);
        setBooleanField(term173136, term173136.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term173136, term173136.getClass(), "encodedSourceStart", 0);
        setIntField(term173136, term173136.getClass(), "encodedSourceEnd", 0);
        setField(term173136, term173136.getClass(), "sourceName", null);
        setIntField(term173136, term173136.getClass(), "baseLineno", 0);
        setIntField(term173136, term173136.getClass(), "endLineno", 0);
        setField(term173136, term173136.getClass(), "functions", null);
        setField(term173136, term173136.getClass(), "regexps", null);
        setField(term173136, term173136.getClass(), "itsVariables", null);
        setField(term173136, term173136.getClass(), "itsConst", null);
        setField(term173136, term173136.getClass(), "itsVariableNames", null);
        setIntField(term173136, term173136.getClass(), "varStart", 0);
        setField(term173136, term173136.getClass(), "compilerData", null);
        setIntField(term173136, term173136.getClass(), "type", 0);
        setField(term173136, term173136.getClass(), "next", null);
        setField(term173136, term173136.getClass(), "first", null);
        setField(term173136, term173136.getClass(), "last", null);
        setField(term173136, term173136.getClass(), "propListHead", null);
        setIntField(term173136, term173136.getClass(), "sourcePosition", 0);
        setField(term173136, term173136.getClass(), "jsType", null);
        setField(term173136, term173136.getClass(), "parent", null);
        term173137 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term173138 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term173137, term173137.getClass(), "number", 0.0);
        setIntField(term173137, term173137.getClass(), "type", 108);
        setField(term173137, term173137.getClass(), "next", null);
        setField(term173138, term173138.getClass(), "functionName", null);
        setBooleanField(term173138, term173138.getClass(), "itsNeedsActivation", false);
        setIntField(term173138, term173138.getClass(), "itsFunctionType", 0);
        setBooleanField(term173138, term173138.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term173138, term173138.getClass(), "encodedSourceStart", 0);
        setIntField(term173138, term173138.getClass(), "encodedSourceEnd", 0);
        setField(term173138, term173138.getClass(), "sourceName", null);
        setIntField(term173138, term173138.getClass(), "baseLineno", 0);
        setIntField(term173138, term173138.getClass(), "endLineno", 0);
        setField(term173138, term173138.getClass(), "functions", null);
        setField(term173138, term173138.getClass(), "regexps", null);
        setField(term173138, term173138.getClass(), "itsVariables", null);
        setField(term173138, term173138.getClass(), "itsConst", null);
        setField(term173138, term173138.getClass(), "itsVariableNames", null);
        setIntField(term173138, term173138.getClass(), "varStart", 0);
        setField(term173138, term173138.getClass(), "compilerData", null);
        setIntField(term173138, term173138.getClass(), "type", 0);
        setField(term173138, term173138.getClass(), "next", null);
        setField(term173138, term173138.getClass(), "first", null);
        setField(term173138, term173138.getClass(), "last", null);
        setField(term173138, term173138.getClass(), "propListHead", null);
        setIntField(term173138, term173138.getClass(), "sourcePosition", 0);
        setField(term173138, term173138.getClass(), "jsType", null);
        setField(term173138, term173138.getClass(), "parent", null);
        setField(term173137, term173137.getClass(), "first", term173138);
        setField(term173137, term173137.getClass(), "last", null);
        setField(term173137, term173137.getClass(), "propListHead", null);
        setIntField(term173137, term173137.getClass(), "sourcePosition", 0);
        setField(term173137, term173137.getClass(), "jsType", null);
        setField(term173137, term173137.getClass(), "parent", null);
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
        args[1] = term172728;
        args[2] = term172685;
        callMethod(klass, "visit", argTypes, term172507, args);
        assertTrue(recursiveEquals(term172507, term173135));
        assertTrue(recursiveEquals(term172728, term173137));
        assertTrue(recursiveEquals(term172685, null));
    }

};


