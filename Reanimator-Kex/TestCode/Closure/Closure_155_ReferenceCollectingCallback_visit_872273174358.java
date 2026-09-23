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

public class ReferenceCollectingCallback_visit_872273174358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83800;
     Object term84015;
     Object term83972;
     Object term84376;
     Object term84377;
     Object term84378;

    public ReferenceCollectingCallback_visit_872273174358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83800 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term84015 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term84015, term84015.getClass(), "type", 98);
        term83972 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term83972, term83972.getClass(), "type", 98);
        setField(term83972, term83972.getClass(), "first", term84015);
        term84376 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term84376, term84376.getClass(), "referenceMap", null);
        setField(term84376, term84376.getClass(), "blockStack", null);
        setField(term84376, term84376.getClass(), "behavior", null);
        setField(term84376, term84376.getClass(), "compiler", null);
        setField(term84376, term84376.getClass(), "varFilter", null);
        term84377 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term84377, term84377.getClass(), "functionName", null);
        setBooleanField(term84377, term84377.getClass(), "itsNeedsActivation", false);
        setIntField(term84377, term84377.getClass(), "itsFunctionType", 0);
        setBooleanField(term84377, term84377.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term84377, term84377.getClass(), "encodedSourceStart", 0);
        setIntField(term84377, term84377.getClass(), "encodedSourceEnd", 0);
        setField(term84377, term84377.getClass(), "sourceName", null);
        setIntField(term84377, term84377.getClass(), "baseLineno", 0);
        setIntField(term84377, term84377.getClass(), "endLineno", 0);
        setField(term84377, term84377.getClass(), "functions", null);
        setField(term84377, term84377.getClass(), "regexps", null);
        setField(term84377, term84377.getClass(), "itsVariables", null);
        setField(term84377, term84377.getClass(), "itsConst", null);
        setField(term84377, term84377.getClass(), "itsVariableNames", null);
        setIntField(term84377, term84377.getClass(), "varStart", 0);
        setField(term84377, term84377.getClass(), "compilerData", null);
        setIntField(term84377, term84377.getClass(), "type", 98);
        setField(term84377, term84377.getClass(), "next", null);
        setField(term84377, term84377.getClass(), "first", null);
        setField(term84377, term84377.getClass(), "last", null);
        setField(term84377, term84377.getClass(), "propListHead", null);
        setIntField(term84377, term84377.getClass(), "sourcePosition", 0);
        setField(term84377, term84377.getClass(), "jsType", null);
        setField(term84377, term84377.getClass(), "parent", null);
        term84378 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term84379 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term84378, term84378.getClass(), "functionName", null);
        setBooleanField(term84378, term84378.getClass(), "itsNeedsActivation", false);
        setIntField(term84378, term84378.getClass(), "itsFunctionType", 0);
        setBooleanField(term84378, term84378.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term84378, term84378.getClass(), "encodedSourceStart", 0);
        setIntField(term84378, term84378.getClass(), "encodedSourceEnd", 0);
        setField(term84378, term84378.getClass(), "sourceName", null);
        setIntField(term84378, term84378.getClass(), "baseLineno", 0);
        setIntField(term84378, term84378.getClass(), "endLineno", 0);
        setField(term84378, term84378.getClass(), "functions", null);
        setField(term84378, term84378.getClass(), "regexps", null);
        setField(term84378, term84378.getClass(), "itsVariables", null);
        setField(term84378, term84378.getClass(), "itsConst", null);
        setField(term84378, term84378.getClass(), "itsVariableNames", null);
        setIntField(term84378, term84378.getClass(), "varStart", 0);
        setField(term84378, term84378.getClass(), "compilerData", null);
        setIntField(term84378, term84378.getClass(), "type", 98);
        setField(term84378, term84378.getClass(), "next", null);
        setField(term84379, term84379.getClass(), "functionName", null);
        setBooleanField(term84379, term84379.getClass(), "itsNeedsActivation", false);
        setIntField(term84379, term84379.getClass(), "itsFunctionType", 0);
        setBooleanField(term84379, term84379.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term84379, term84379.getClass(), "encodedSourceStart", 0);
        setIntField(term84379, term84379.getClass(), "encodedSourceEnd", 0);
        setField(term84379, term84379.getClass(), "sourceName", null);
        setIntField(term84379, term84379.getClass(), "baseLineno", 0);
        setIntField(term84379, term84379.getClass(), "endLineno", 0);
        setField(term84379, term84379.getClass(), "functions", null);
        setField(term84379, term84379.getClass(), "regexps", null);
        setField(term84379, term84379.getClass(), "itsVariables", null);
        setField(term84379, term84379.getClass(), "itsConst", null);
        setField(term84379, term84379.getClass(), "itsVariableNames", null);
        setIntField(term84379, term84379.getClass(), "varStart", 0);
        setField(term84379, term84379.getClass(), "compilerData", null);
        setIntField(term84379, term84379.getClass(), "type", 98);
        setField(term84379, term84379.getClass(), "next", null);
        setField(term84379, term84379.getClass(), "first", null);
        setField(term84379, term84379.getClass(), "last", null);
        setField(term84379, term84379.getClass(), "propListHead", null);
        setIntField(term84379, term84379.getClass(), "sourcePosition", 0);
        setField(term84379, term84379.getClass(), "jsType", null);
        setField(term84379, term84379.getClass(), "parent", null);
        setField(term84378, term84378.getClass(), "first", term84379);
        setField(term84378, term84378.getClass(), "last", null);
        setField(term84378, term84378.getClass(), "propListHead", null);
        setIntField(term84378, term84378.getClass(), "sourcePosition", 0);
        setField(term84378, term84378.getClass(), "jsType", null);
        setField(term84378, term84378.getClass(), "parent", null);
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
        args[1] = term84015;
        args[2] = term83972;
        callMethod(klass, "visit", argTypes, term83800, args);
        assertTrue(recursiveEquals(term83800, term84376));
        assertTrue(recursiveEquals(term84015, term84378));
        assertTrue(recursiveEquals(term83972, null));
    }

};


