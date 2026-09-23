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

public class ReferenceCollectingCallback_visit_872273174470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117094;
     Object term117309;
     Object term117266;
     Object term117375;
     Object term117376;
     Object term117377;

    public ReferenceCollectingCallback_visit_872273174470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117094 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term117309 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term117309, term117309.getClass(), "type", 108);
        term117266 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term117266, term117266.getClass(), "type", 108);
        setField(term117266, term117266.getClass(), "first", term117309);
        term117375 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term117375, term117375.getClass(), "referenceMap", null);
        setField(term117375, term117375.getClass(), "blockStack", null);
        setField(term117375, term117375.getClass(), "behavior", null);
        setField(term117375, term117375.getClass(), "compiler", null);
        setField(term117375, term117375.getClass(), "varFilter", null);
        term117376 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term117376, term117376.getClass(), "functionName", null);
        setBooleanField(term117376, term117376.getClass(), "itsNeedsActivation", false);
        setIntField(term117376, term117376.getClass(), "itsFunctionType", 0);
        setBooleanField(term117376, term117376.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term117376, term117376.getClass(), "encodedSourceStart", 0);
        setIntField(term117376, term117376.getClass(), "encodedSourceEnd", 0);
        setField(term117376, term117376.getClass(), "sourceName", null);
        setIntField(term117376, term117376.getClass(), "baseLineno", 0);
        setIntField(term117376, term117376.getClass(), "endLineno", 0);
        setField(term117376, term117376.getClass(), "functions", null);
        setField(term117376, term117376.getClass(), "regexps", null);
        setField(term117376, term117376.getClass(), "itsVariables", null);
        setField(term117376, term117376.getClass(), "itsConst", null);
        setField(term117376, term117376.getClass(), "itsVariableNames", null);
        setIntField(term117376, term117376.getClass(), "varStart", 0);
        setField(term117376, term117376.getClass(), "compilerData", null);
        setIntField(term117376, term117376.getClass(), "type", 108);
        setField(term117376, term117376.getClass(), "next", null);
        setField(term117376, term117376.getClass(), "first", null);
        setField(term117376, term117376.getClass(), "last", null);
        setField(term117376, term117376.getClass(), "propListHead", null);
        setIntField(term117376, term117376.getClass(), "sourcePosition", 0);
        setField(term117376, term117376.getClass(), "jsType", null);
        setField(term117376, term117376.getClass(), "parent", null);
        term117377 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term117378 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term117377, term117377.getClass(), "functionName", null);
        setBooleanField(term117377, term117377.getClass(), "itsNeedsActivation", false);
        setIntField(term117377, term117377.getClass(), "itsFunctionType", 0);
        setBooleanField(term117377, term117377.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term117377, term117377.getClass(), "encodedSourceStart", 0);
        setIntField(term117377, term117377.getClass(), "encodedSourceEnd", 0);
        setField(term117377, term117377.getClass(), "sourceName", null);
        setIntField(term117377, term117377.getClass(), "baseLineno", 0);
        setIntField(term117377, term117377.getClass(), "endLineno", 0);
        setField(term117377, term117377.getClass(), "functions", null);
        setField(term117377, term117377.getClass(), "regexps", null);
        setField(term117377, term117377.getClass(), "itsVariables", null);
        setField(term117377, term117377.getClass(), "itsConst", null);
        setField(term117377, term117377.getClass(), "itsVariableNames", null);
        setIntField(term117377, term117377.getClass(), "varStart", 0);
        setField(term117377, term117377.getClass(), "compilerData", null);
        setIntField(term117377, term117377.getClass(), "type", 108);
        setField(term117377, term117377.getClass(), "next", null);
        setField(term117378, term117378.getClass(), "functionName", null);
        setBooleanField(term117378, term117378.getClass(), "itsNeedsActivation", false);
        setIntField(term117378, term117378.getClass(), "itsFunctionType", 0);
        setBooleanField(term117378, term117378.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term117378, term117378.getClass(), "encodedSourceStart", 0);
        setIntField(term117378, term117378.getClass(), "encodedSourceEnd", 0);
        setField(term117378, term117378.getClass(), "sourceName", null);
        setIntField(term117378, term117378.getClass(), "baseLineno", 0);
        setIntField(term117378, term117378.getClass(), "endLineno", 0);
        setField(term117378, term117378.getClass(), "functions", null);
        setField(term117378, term117378.getClass(), "regexps", null);
        setField(term117378, term117378.getClass(), "itsVariables", null);
        setField(term117378, term117378.getClass(), "itsConst", null);
        setField(term117378, term117378.getClass(), "itsVariableNames", null);
        setIntField(term117378, term117378.getClass(), "varStart", 0);
        setField(term117378, term117378.getClass(), "compilerData", null);
        setIntField(term117378, term117378.getClass(), "type", 108);
        setField(term117378, term117378.getClass(), "next", null);
        setField(term117378, term117378.getClass(), "first", null);
        setField(term117378, term117378.getClass(), "last", null);
        setField(term117378, term117378.getClass(), "propListHead", null);
        setIntField(term117378, term117378.getClass(), "sourcePosition", 0);
        setField(term117378, term117378.getClass(), "jsType", null);
        setField(term117378, term117378.getClass(), "parent", null);
        setField(term117377, term117377.getClass(), "first", term117378);
        setField(term117377, term117377.getClass(), "last", null);
        setField(term117377, term117377.getClass(), "propListHead", null);
        setIntField(term117377, term117377.getClass(), "sourcePosition", 0);
        setField(term117377, term117377.getClass(), "jsType", null);
        setField(term117377, term117377.getClass(), "parent", null);
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
        args[1] = term117309;
        args[2] = term117266;
        callMethod(klass, "visit", argTypes, term117094, args);
        assertTrue(recursiveEquals(term117094, term117375));
        assertTrue(recursiveEquals(term117309, term117377));
        assertTrue(recursiveEquals(term117266, null));
    }

};


