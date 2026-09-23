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

public class ReferenceCollectingCallback_visit_872273174174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42420;
     Object term42641;
     Object term42598;
     Object term42697;
     Object term42698;
     Object term42699;

    public ReferenceCollectingCallback_visit_872273174174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42420 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term42641 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term42641, term42641.getClass(), "type", 0);
        term42598 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term42598, term42598.getClass(), "type", 101);
        setField(term42598, term42598.getClass(), "first", term42641);
        term42697 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term42697, term42697.getClass(), "referenceMap", null);
        setField(term42697, term42697.getClass(), "blockStack", null);
        setField(term42697, term42697.getClass(), "behavior", null);
        setField(term42697, term42697.getClass(), "compiler", null);
        setField(term42697, term42697.getClass(), "varFilter", null);
        term42698 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term42698, term42698.getClass(), "functionName", null);
        setBooleanField(term42698, term42698.getClass(), "itsNeedsActivation", false);
        setIntField(term42698, term42698.getClass(), "itsFunctionType", 0);
        setBooleanField(term42698, term42698.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term42698, term42698.getClass(), "encodedSourceStart", 0);
        setIntField(term42698, term42698.getClass(), "encodedSourceEnd", 0);
        setField(term42698, term42698.getClass(), "sourceName", null);
        setIntField(term42698, term42698.getClass(), "baseLineno", 0);
        setIntField(term42698, term42698.getClass(), "endLineno", 0);
        setField(term42698, term42698.getClass(), "functions", null);
        setField(term42698, term42698.getClass(), "regexps", null);
        setField(term42698, term42698.getClass(), "itsVariables", null);
        setField(term42698, term42698.getClass(), "itsConst", null);
        setField(term42698, term42698.getClass(), "itsVariableNames", null);
        setIntField(term42698, term42698.getClass(), "varStart", 0);
        setField(term42698, term42698.getClass(), "compilerData", null);
        setIntField(term42698, term42698.getClass(), "type", 0);
        setField(term42698, term42698.getClass(), "next", null);
        setField(term42698, term42698.getClass(), "first", null);
        setField(term42698, term42698.getClass(), "last", null);
        setField(term42698, term42698.getClass(), "propListHead", null);
        setIntField(term42698, term42698.getClass(), "sourcePosition", 0);
        setField(term42698, term42698.getClass(), "jsType", null);
        setField(term42698, term42698.getClass(), "parent", null);
        term42699 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term42700 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term42699, term42699.getClass(), "number", 0.0);
        setIntField(term42699, term42699.getClass(), "type", 101);
        setField(term42699, term42699.getClass(), "next", null);
        setField(term42700, term42700.getClass(), "functionName", null);
        setBooleanField(term42700, term42700.getClass(), "itsNeedsActivation", false);
        setIntField(term42700, term42700.getClass(), "itsFunctionType", 0);
        setBooleanField(term42700, term42700.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term42700, term42700.getClass(), "encodedSourceStart", 0);
        setIntField(term42700, term42700.getClass(), "encodedSourceEnd", 0);
        setField(term42700, term42700.getClass(), "sourceName", null);
        setIntField(term42700, term42700.getClass(), "baseLineno", 0);
        setIntField(term42700, term42700.getClass(), "endLineno", 0);
        setField(term42700, term42700.getClass(), "functions", null);
        setField(term42700, term42700.getClass(), "regexps", null);
        setField(term42700, term42700.getClass(), "itsVariables", null);
        setField(term42700, term42700.getClass(), "itsConst", null);
        setField(term42700, term42700.getClass(), "itsVariableNames", null);
        setIntField(term42700, term42700.getClass(), "varStart", 0);
        setField(term42700, term42700.getClass(), "compilerData", null);
        setIntField(term42700, term42700.getClass(), "type", 0);
        setField(term42700, term42700.getClass(), "next", null);
        setField(term42700, term42700.getClass(), "first", null);
        setField(term42700, term42700.getClass(), "last", null);
        setField(term42700, term42700.getClass(), "propListHead", null);
        setIntField(term42700, term42700.getClass(), "sourcePosition", 0);
        setField(term42700, term42700.getClass(), "jsType", null);
        setField(term42700, term42700.getClass(), "parent", null);
        setField(term42699, term42699.getClass(), "first", term42700);
        setField(term42699, term42699.getClass(), "last", null);
        setField(term42699, term42699.getClass(), "propListHead", null);
        setIntField(term42699, term42699.getClass(), "sourcePosition", 0);
        setField(term42699, term42699.getClass(), "jsType", null);
        setField(term42699, term42699.getClass(), "parent", null);
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
        args[1] = term42641;
        args[2] = term42598;
        callMethod(klass, "visit", argTypes, term42420, args);
        assertTrue(recursiveEquals(term42420, term42697));
        assertTrue(recursiveEquals(term42641, term42699));
        assertTrue(recursiveEquals(term42598, null));
    }

};


