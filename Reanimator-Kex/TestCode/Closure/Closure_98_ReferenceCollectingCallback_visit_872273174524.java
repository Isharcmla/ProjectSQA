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

public class ReferenceCollectingCallback_visit_872273174524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142674;
     Object term142895;
     Object term142852;
     Object term143203;
     Object term143204;
     Object term143205;

    public ReferenceCollectingCallback_visit_872273174524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142674 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term142895 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term142895, term142895.getClass(), "type", 0);
        term142852 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term142852, term142852.getClass(), "type", 101);
        setField(term142852, term142852.getClass(), "first", term142895);
        term143203 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term143203, term143203.getClass(), "referenceMap", null);
        setField(term143203, term143203.getClass(), "blockStack", null);
        setField(term143203, term143203.getClass(), "behavior", null);
        setField(term143203, term143203.getClass(), "compiler", null);
        setField(term143203, term143203.getClass(), "varFilter", null);
        term143204 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term143204, term143204.getClass(), "functionName", null);
        setBooleanField(term143204, term143204.getClass(), "itsNeedsActivation", false);
        setIntField(term143204, term143204.getClass(), "itsFunctionType", 0);
        setBooleanField(term143204, term143204.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term143204, term143204.getClass(), "encodedSourceStart", 0);
        setIntField(term143204, term143204.getClass(), "encodedSourceEnd", 0);
        setField(term143204, term143204.getClass(), "sourceName", null);
        setIntField(term143204, term143204.getClass(), "baseLineno", 0);
        setIntField(term143204, term143204.getClass(), "endLineno", 0);
        setField(term143204, term143204.getClass(), "functions", null);
        setField(term143204, term143204.getClass(), "regexps", null);
        setField(term143204, term143204.getClass(), "itsVariables", null);
        setField(term143204, term143204.getClass(), "itsConst", null);
        setField(term143204, term143204.getClass(), "itsVariableNames", null);
        setIntField(term143204, term143204.getClass(), "varStart", 0);
        setField(term143204, term143204.getClass(), "compilerData", null);
        setIntField(term143204, term143204.getClass(), "type", 0);
        setField(term143204, term143204.getClass(), "next", null);
        setField(term143204, term143204.getClass(), "first", null);
        setField(term143204, term143204.getClass(), "last", null);
        setField(term143204, term143204.getClass(), "propListHead", null);
        setIntField(term143204, term143204.getClass(), "sourcePosition", 0);
        setField(term143204, term143204.getClass(), "jsType", null);
        setField(term143204, term143204.getClass(), "parent", null);
        term143205 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term143206 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term143205, term143205.getClass(), "str", null);
        setIntField(term143205, term143205.getClass(), "type", 101);
        setField(term143205, term143205.getClass(), "next", null);
        setField(term143206, term143206.getClass(), "functionName", null);
        setBooleanField(term143206, term143206.getClass(), "itsNeedsActivation", false);
        setIntField(term143206, term143206.getClass(), "itsFunctionType", 0);
        setBooleanField(term143206, term143206.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term143206, term143206.getClass(), "encodedSourceStart", 0);
        setIntField(term143206, term143206.getClass(), "encodedSourceEnd", 0);
        setField(term143206, term143206.getClass(), "sourceName", null);
        setIntField(term143206, term143206.getClass(), "baseLineno", 0);
        setIntField(term143206, term143206.getClass(), "endLineno", 0);
        setField(term143206, term143206.getClass(), "functions", null);
        setField(term143206, term143206.getClass(), "regexps", null);
        setField(term143206, term143206.getClass(), "itsVariables", null);
        setField(term143206, term143206.getClass(), "itsConst", null);
        setField(term143206, term143206.getClass(), "itsVariableNames", null);
        setIntField(term143206, term143206.getClass(), "varStart", 0);
        setField(term143206, term143206.getClass(), "compilerData", null);
        setIntField(term143206, term143206.getClass(), "type", 0);
        setField(term143206, term143206.getClass(), "next", null);
        setField(term143206, term143206.getClass(), "first", null);
        setField(term143206, term143206.getClass(), "last", null);
        setField(term143206, term143206.getClass(), "propListHead", null);
        setIntField(term143206, term143206.getClass(), "sourcePosition", 0);
        setField(term143206, term143206.getClass(), "jsType", null);
        setField(term143206, term143206.getClass(), "parent", null);
        setField(term143205, term143205.getClass(), "first", term143206);
        setField(term143205, term143205.getClass(), "last", null);
        setField(term143205, term143205.getClass(), "propListHead", null);
        setIntField(term143205, term143205.getClass(), "sourcePosition", 0);
        setField(term143205, term143205.getClass(), "jsType", null);
        setField(term143205, term143205.getClass(), "parent", null);
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
        args[1] = term142895;
        args[2] = term142852;
        callMethod(klass, "visit", argTypes, term142674, args);
        assertTrue(recursiveEquals(term142674, term143203));
        assertTrue(recursiveEquals(term142895, term143205));
        assertTrue(recursiveEquals(term142852, null));
    }

};


