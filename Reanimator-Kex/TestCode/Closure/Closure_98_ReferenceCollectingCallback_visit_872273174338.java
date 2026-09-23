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

public class ReferenceCollectingCallback_visit_872273174338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86992;
     Object term87207;
     Object term87164;
     Object term87538;
     Object term87539;
     Object term87540;

    public ReferenceCollectingCallback_visit_872273174338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86992 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term87207 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term87207, term87207.getClass(), "type", 100);
        term87164 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term87164, term87164.getClass(), "type", 100);
        setField(term87164, term87164.getClass(), "first", term87207);
        term87538 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term87538, term87538.getClass(), "referenceMap", null);
        setField(term87538, term87538.getClass(), "blockStack", null);
        setField(term87538, term87538.getClass(), "behavior", null);
        setField(term87538, term87538.getClass(), "compiler", null);
        setField(term87538, term87538.getClass(), "varFilter", null);
        term87539 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term87539, term87539.getClass(), "functionName", null);
        setBooleanField(term87539, term87539.getClass(), "itsNeedsActivation", false);
        setIntField(term87539, term87539.getClass(), "itsFunctionType", 0);
        setBooleanField(term87539, term87539.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term87539, term87539.getClass(), "encodedSourceStart", 0);
        setIntField(term87539, term87539.getClass(), "encodedSourceEnd", 0);
        setField(term87539, term87539.getClass(), "sourceName", null);
        setIntField(term87539, term87539.getClass(), "baseLineno", 0);
        setIntField(term87539, term87539.getClass(), "endLineno", 0);
        setField(term87539, term87539.getClass(), "functions", null);
        setField(term87539, term87539.getClass(), "regexps", null);
        setField(term87539, term87539.getClass(), "itsVariables", null);
        setField(term87539, term87539.getClass(), "itsConst", null);
        setField(term87539, term87539.getClass(), "itsVariableNames", null);
        setIntField(term87539, term87539.getClass(), "varStart", 0);
        setField(term87539, term87539.getClass(), "compilerData", null);
        setIntField(term87539, term87539.getClass(), "type", 100);
        setField(term87539, term87539.getClass(), "next", null);
        setField(term87539, term87539.getClass(), "first", null);
        setField(term87539, term87539.getClass(), "last", null);
        setField(term87539, term87539.getClass(), "propListHead", null);
        setIntField(term87539, term87539.getClass(), "sourcePosition", 0);
        setField(term87539, term87539.getClass(), "jsType", null);
        setField(term87539, term87539.getClass(), "parent", null);
        term87540 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term87541 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term87540, term87540.getClass(), "functionName", null);
        setBooleanField(term87540, term87540.getClass(), "itsNeedsActivation", false);
        setIntField(term87540, term87540.getClass(), "itsFunctionType", 0);
        setBooleanField(term87540, term87540.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term87540, term87540.getClass(), "encodedSourceStart", 0);
        setIntField(term87540, term87540.getClass(), "encodedSourceEnd", 0);
        setField(term87540, term87540.getClass(), "sourceName", null);
        setIntField(term87540, term87540.getClass(), "baseLineno", 0);
        setIntField(term87540, term87540.getClass(), "endLineno", 0);
        setField(term87540, term87540.getClass(), "functions", null);
        setField(term87540, term87540.getClass(), "regexps", null);
        setField(term87540, term87540.getClass(), "itsVariables", null);
        setField(term87540, term87540.getClass(), "itsConst", null);
        setField(term87540, term87540.getClass(), "itsVariableNames", null);
        setIntField(term87540, term87540.getClass(), "varStart", 0);
        setField(term87540, term87540.getClass(), "compilerData", null);
        setIntField(term87540, term87540.getClass(), "type", 100);
        setField(term87540, term87540.getClass(), "next", null);
        setField(term87541, term87541.getClass(), "functionName", null);
        setBooleanField(term87541, term87541.getClass(), "itsNeedsActivation", false);
        setIntField(term87541, term87541.getClass(), "itsFunctionType", 0);
        setBooleanField(term87541, term87541.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term87541, term87541.getClass(), "encodedSourceStart", 0);
        setIntField(term87541, term87541.getClass(), "encodedSourceEnd", 0);
        setField(term87541, term87541.getClass(), "sourceName", null);
        setIntField(term87541, term87541.getClass(), "baseLineno", 0);
        setIntField(term87541, term87541.getClass(), "endLineno", 0);
        setField(term87541, term87541.getClass(), "functions", null);
        setField(term87541, term87541.getClass(), "regexps", null);
        setField(term87541, term87541.getClass(), "itsVariables", null);
        setField(term87541, term87541.getClass(), "itsConst", null);
        setField(term87541, term87541.getClass(), "itsVariableNames", null);
        setIntField(term87541, term87541.getClass(), "varStart", 0);
        setField(term87541, term87541.getClass(), "compilerData", null);
        setIntField(term87541, term87541.getClass(), "type", 100);
        setField(term87541, term87541.getClass(), "next", null);
        setField(term87541, term87541.getClass(), "first", null);
        setField(term87541, term87541.getClass(), "last", null);
        setField(term87541, term87541.getClass(), "propListHead", null);
        setIntField(term87541, term87541.getClass(), "sourcePosition", 0);
        setField(term87541, term87541.getClass(), "jsType", null);
        setField(term87541, term87541.getClass(), "parent", null);
        setField(term87540, term87540.getClass(), "first", term87541);
        setField(term87540, term87540.getClass(), "last", null);
        setField(term87540, term87540.getClass(), "propListHead", null);
        setIntField(term87540, term87540.getClass(), "sourcePosition", 0);
        setField(term87540, term87540.getClass(), "jsType", null);
        setField(term87540, term87540.getClass(), "parent", null);
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
        args[1] = term87207;
        args[2] = term87164;
        callMethod(klass, "visit", argTypes, term86992, args);
        assertTrue(recursiveEquals(term86992, term87538));
        assertTrue(recursiveEquals(term87207, term87540));
        assertTrue(recursiveEquals(term87164, null));
    }

};


