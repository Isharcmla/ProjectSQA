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

public class ReferenceCollectingCallback_shouldTraverse_422855684937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239111;
     Object term239197;
     Object term239289;
     Object term239372;
     Object term239373;
     Object term239374;

    public ReferenceCollectingCallback_shouldTraverse_422855684937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239111 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term239197 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term239289 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term239289, term239289.getClass(), "type", 4);
        term239372 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term239372, term239372.getClass(), "referenceMap", null);
        setField(term239372, term239372.getClass(), "blockStack", null);
        setField(term239372, term239372.getClass(), "behavior", null);
        setField(term239372, term239372.getClass(), "compiler", null);
        setField(term239372, term239372.getClass(), "varFilter", null);
        term239373 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term239373, term239373.getClass(), "number", 0.0);
        setIntField(term239373, term239373.getClass(), "type", 4);
        setField(term239373, term239373.getClass(), "next", null);
        setField(term239373, term239373.getClass(), "first", null);
        setField(term239373, term239373.getClass(), "last", null);
        setField(term239373, term239373.getClass(), "propListHead", null);
        setIntField(term239373, term239373.getClass(), "sourcePosition", 0);
        setField(term239373, term239373.getClass(), "jsType", null);
        setField(term239373, term239373.getClass(), "parent", null);
        term239374 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term239374, term239374.getClass(), "functionName", null);
        setBooleanField(term239374, term239374.getClass(), "itsNeedsActivation", false);
        setIntField(term239374, term239374.getClass(), "itsFunctionType", 0);
        setBooleanField(term239374, term239374.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term239374, term239374.getClass(), "encodedSourceStart", 0);
        setIntField(term239374, term239374.getClass(), "encodedSourceEnd", 0);
        setField(term239374, term239374.getClass(), "sourceName", null);
        setIntField(term239374, term239374.getClass(), "baseLineno", 0);
        setIntField(term239374, term239374.getClass(), "endLineno", 0);
        setField(term239374, term239374.getClass(), "functions", null);
        setField(term239374, term239374.getClass(), "regexps", null);
        setField(term239374, term239374.getClass(), "itsVariables", null);
        setField(term239374, term239374.getClass(), "itsConst", null);
        setField(term239374, term239374.getClass(), "itsVariableNames", null);
        setIntField(term239374, term239374.getClass(), "varStart", 0);
        setField(term239374, term239374.getClass(), "compilerData", null);
        setIntField(term239374, term239374.getClass(), "type", 0);
        setField(term239374, term239374.getClass(), "next", null);
        setField(term239374, term239374.getClass(), "first", null);
        setField(term239374, term239374.getClass(), "last", null);
        setField(term239374, term239374.getClass(), "propListHead", null);
        setIntField(term239374, term239374.getClass(), "sourcePosition", 0);
        setField(term239374, term239374.getClass(), "jsType", null);
        setField(term239374, term239374.getClass(), "parent", null);
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
        args[1] = term239197;
        args[2] = term239289;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term239111, args);
        assertTrue(recursiveEquals(term239111, term239372));
        assertTrue(recursiveEquals(term239197, term239374));
        assertTrue(recursiveEquals(term239289, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


