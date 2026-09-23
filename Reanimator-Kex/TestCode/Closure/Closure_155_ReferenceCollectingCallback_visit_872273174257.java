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

public class ReferenceCollectingCallback_visit_872273174257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61863;
     Object term61955;
     Object term62041;
     Object term62423;
     Object term62424;
     Object term62425;

    public ReferenceCollectingCallback_visit_872273174257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61863 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term61955 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term61955, term61955.getClass(), "type", -39);
        term62041 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term62423 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term62423, term62423.getClass(), "referenceMap", null);
        setField(term62423, term62423.getClass(), "blockStack", null);
        setField(term62423, term62423.getClass(), "behavior", null);
        setField(term62423, term62423.getClass(), "compiler", null);
        setField(term62423, term62423.getClass(), "varFilter", null);
        term62424 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term62424, term62424.getClass(), "number", 0.0);
        setIntField(term62424, term62424.getClass(), "type", -39);
        setField(term62424, term62424.getClass(), "next", null);
        setField(term62424, term62424.getClass(), "first", null);
        setField(term62424, term62424.getClass(), "last", null);
        setField(term62424, term62424.getClass(), "propListHead", null);
        setIntField(term62424, term62424.getClass(), "sourcePosition", 0);
        setField(term62424, term62424.getClass(), "jsType", null);
        setField(term62424, term62424.getClass(), "parent", null);
        term62425 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term62425, term62425.getClass(), "functionName", null);
        setBooleanField(term62425, term62425.getClass(), "itsNeedsActivation", false);
        setIntField(term62425, term62425.getClass(), "itsFunctionType", 0);
        setBooleanField(term62425, term62425.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term62425, term62425.getClass(), "encodedSourceStart", 0);
        setIntField(term62425, term62425.getClass(), "encodedSourceEnd", 0);
        setField(term62425, term62425.getClass(), "sourceName", null);
        setIntField(term62425, term62425.getClass(), "baseLineno", 0);
        setIntField(term62425, term62425.getClass(), "endLineno", 0);
        setField(term62425, term62425.getClass(), "functions", null);
        setField(term62425, term62425.getClass(), "regexps", null);
        setField(term62425, term62425.getClass(), "itsVariables", null);
        setField(term62425, term62425.getClass(), "itsConst", null);
        setField(term62425, term62425.getClass(), "itsVariableNames", null);
        setIntField(term62425, term62425.getClass(), "varStart", 0);
        setField(term62425, term62425.getClass(), "compilerData", null);
        setIntField(term62425, term62425.getClass(), "type", 0);
        setField(term62425, term62425.getClass(), "next", null);
        setField(term62425, term62425.getClass(), "first", null);
        setField(term62425, term62425.getClass(), "last", null);
        setField(term62425, term62425.getClass(), "propListHead", null);
        setIntField(term62425, term62425.getClass(), "sourcePosition", 0);
        setField(term62425, term62425.getClass(), "jsType", null);
        setField(term62425, term62425.getClass(), "parent", null);
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
        args[1] = term61955;
        args[2] = term62041;
        callMethod(klass, "visit", argTypes, term61863, args);
        assertTrue(recursiveEquals(term61863, term62423));
        assertTrue(recursiveEquals(term61955, term62425));
        assertTrue(recursiveEquals(term62041, null));
    }

};


