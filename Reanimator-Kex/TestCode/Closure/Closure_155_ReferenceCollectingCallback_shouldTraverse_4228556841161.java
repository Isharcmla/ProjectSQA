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
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_shouldTraverse_4228556841161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308081;
     Object term308227;
     Object term308313;
     Object term308937;
     Object term308941;
     Object term308942;

    public ReferenceCollectingCallback_shouldTraverse_4228556841161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term308135 = new ArrayDeque();
        term308081 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term308081, term308081.getClass(), "blockStack", term308135);
        term308227 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term308227, term308227.getClass(), "type", 111);
        term308313 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term308313, term308313.getClass(), "type", 0);
        ArrayDeque term308938 = new ArrayDeque();
        term308937 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term308937, term308937.getClass(), "referenceMap", null);
        setField(term308937, term308937.getClass(), "blockStack", term308938);
        setField(term308937, term308937.getClass(), "behavior", null);
        setField(term308937, term308937.getClass(), "compiler", null);
        setField(term308937, term308937.getClass(), "varFilter", null);
        term308941 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term308941, term308941.getClass(), "functionName", null);
        setBooleanField(term308941, term308941.getClass(), "itsNeedsActivation", false);
        setIntField(term308941, term308941.getClass(), "itsFunctionType", 0);
        setBooleanField(term308941, term308941.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term308941, term308941.getClass(), "encodedSourceStart", 0);
        setIntField(term308941, term308941.getClass(), "encodedSourceEnd", 0);
        setField(term308941, term308941.getClass(), "sourceName", null);
        setIntField(term308941, term308941.getClass(), "baseLineno", 0);
        setIntField(term308941, term308941.getClass(), "endLineno", 0);
        setField(term308941, term308941.getClass(), "functions", null);
        setField(term308941, term308941.getClass(), "regexps", null);
        setField(term308941, term308941.getClass(), "itsVariables", null);
        setField(term308941, term308941.getClass(), "itsConst", null);
        setField(term308941, term308941.getClass(), "itsVariableNames", null);
        setIntField(term308941, term308941.getClass(), "varStart", 0);
        setField(term308941, term308941.getClass(), "compilerData", null);
        setIntField(term308941, term308941.getClass(), "type", 0);
        setField(term308941, term308941.getClass(), "next", null);
        setField(term308941, term308941.getClass(), "first", null);
        setField(term308941, term308941.getClass(), "last", null);
        setField(term308941, term308941.getClass(), "propListHead", null);
        setIntField(term308941, term308941.getClass(), "sourcePosition", 0);
        setField(term308941, term308941.getClass(), "jsType", null);
        setField(term308941, term308941.getClass(), "parent", null);
        term308942 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term308942, term308942.getClass(), "number", 0.0);
        setIntField(term308942, term308942.getClass(), "type", 111);
        setField(term308942, term308942.getClass(), "next", null);
        setField(term308942, term308942.getClass(), "first", null);
        setField(term308942, term308942.getClass(), "last", null);
        setField(term308942, term308942.getClass(), "propListHead", null);
        setIntField(term308942, term308942.getClass(), "sourcePosition", 0);
        setField(term308942, term308942.getClass(), "jsType", null);
        setField(term308942, term308942.getClass(), "parent", null);
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
        args[1] = term308227;
        args[2] = term308313;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term308081, args);
        assertTrue(recursiveEquals(term308081, term308937));
        assertTrue(recursiveEquals(term308227, term308942));
        assertTrue(recursiveEquals(term308313, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


