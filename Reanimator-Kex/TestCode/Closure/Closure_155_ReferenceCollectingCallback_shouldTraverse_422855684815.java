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

public class ReferenceCollectingCallback_shouldTraverse_422855684815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208738;
     Object term208830;
     Object term208916;
     Object term209500;
     Object term209501;
     Object term209502;

    public ReferenceCollectingCallback_shouldTraverse_422855684815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208738 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term208830 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term208916 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term208916, term208916.getClass(), "type", 12);
        term209500 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term209500, term209500.getClass(), "referenceMap", null);
        setField(term209500, term209500.getClass(), "blockStack", null);
        setField(term209500, term209500.getClass(), "behavior", null);
        setField(term209500, term209500.getClass(), "compiler", null);
        setField(term209500, term209500.getClass(), "varFilter", null);
        term209501 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term209501, term209501.getClass(), "functionName", null);
        setBooleanField(term209501, term209501.getClass(), "itsNeedsActivation", false);
        setIntField(term209501, term209501.getClass(), "itsFunctionType", 0);
        setBooleanField(term209501, term209501.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term209501, term209501.getClass(), "encodedSourceStart", 0);
        setIntField(term209501, term209501.getClass(), "encodedSourceEnd", 0);
        setField(term209501, term209501.getClass(), "sourceName", null);
        setIntField(term209501, term209501.getClass(), "baseLineno", 0);
        setIntField(term209501, term209501.getClass(), "endLineno", 0);
        setField(term209501, term209501.getClass(), "functions", null);
        setField(term209501, term209501.getClass(), "regexps", null);
        setField(term209501, term209501.getClass(), "itsVariables", null);
        setField(term209501, term209501.getClass(), "itsConst", null);
        setField(term209501, term209501.getClass(), "itsVariableNames", null);
        setIntField(term209501, term209501.getClass(), "varStart", 0);
        setField(term209501, term209501.getClass(), "compilerData", null);
        setIntField(term209501, term209501.getClass(), "type", 12);
        setField(term209501, term209501.getClass(), "next", null);
        setField(term209501, term209501.getClass(), "first", null);
        setField(term209501, term209501.getClass(), "last", null);
        setField(term209501, term209501.getClass(), "propListHead", null);
        setIntField(term209501, term209501.getClass(), "sourcePosition", 0);
        setField(term209501, term209501.getClass(), "jsType", null);
        setField(term209501, term209501.getClass(), "parent", null);
        term209502 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term209502, term209502.getClass(), "number", 0.0);
        setIntField(term209502, term209502.getClass(), "type", 0);
        setField(term209502, term209502.getClass(), "next", null);
        setField(term209502, term209502.getClass(), "first", null);
        setField(term209502, term209502.getClass(), "last", null);
        setField(term209502, term209502.getClass(), "propListHead", null);
        setIntField(term209502, term209502.getClass(), "sourcePosition", 0);
        setField(term209502, term209502.getClass(), "jsType", null);
        setField(term209502, term209502.getClass(), "parent", null);
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
        args[1] = term208830;
        args[2] = term208916;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term208738, args);
        assertTrue(recursiveEquals(term208738, term209500));
        assertTrue(recursiveEquals(term208830, term209502));
        assertTrue(recursiveEquals(term208916, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


