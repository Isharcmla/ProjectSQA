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

public class ReferenceCollectingCallback_visit_872273174632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166400;
     Object term166624;
     Object term166578;
     Object term166672;
     Object term166673;
     Object term166674;

    public ReferenceCollectingCallback_visit_872273174632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166400 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term166624 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term166624, term166624.getClass(), "type", 0);
        term166578 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term166578, term166578.getClass(), "type", 100);
        setField(term166578, term166578.getClass(), "first", term166624);
        term166672 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term166672, term166672.getClass(), "referenceMap", null);
        setField(term166672, term166672.getClass(), "blockStack", null);
        setField(term166672, term166672.getClass(), "behavior", null);
        setField(term166672, term166672.getClass(), "compiler", null);
        setField(term166672, term166672.getClass(), "varFilter", null);
        term166673 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term166673, term166673.getClass(), "str", null);
        setIntField(term166673, term166673.getClass(), "type", 0);
        setField(term166673, term166673.getClass(), "next", null);
        setField(term166673, term166673.getClass(), "first", null);
        setField(term166673, term166673.getClass(), "last", null);
        setField(term166673, term166673.getClass(), "propListHead", null);
        setIntField(term166673, term166673.getClass(), "sourcePosition", 0);
        setField(term166673, term166673.getClass(), "jsType", null);
        setField(term166673, term166673.getClass(), "parent", null);
        term166674 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term166675 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term166674, term166674.getClass(), "functionName", null);
        setBooleanField(term166674, term166674.getClass(), "itsNeedsActivation", false);
        setIntField(term166674, term166674.getClass(), "itsFunctionType", 0);
        setBooleanField(term166674, term166674.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term166674, term166674.getClass(), "encodedSourceStart", 0);
        setIntField(term166674, term166674.getClass(), "encodedSourceEnd", 0);
        setField(term166674, term166674.getClass(), "sourceName", null);
        setIntField(term166674, term166674.getClass(), "baseLineno", 0);
        setIntField(term166674, term166674.getClass(), "endLineno", 0);
        setField(term166674, term166674.getClass(), "functions", null);
        setField(term166674, term166674.getClass(), "regexps", null);
        setField(term166674, term166674.getClass(), "itsVariables", null);
        setField(term166674, term166674.getClass(), "itsConst", null);
        setField(term166674, term166674.getClass(), "itsVariableNames", null);
        setIntField(term166674, term166674.getClass(), "varStart", 0);
        setField(term166674, term166674.getClass(), "compilerData", null);
        setIntField(term166674, term166674.getClass(), "type", 100);
        setField(term166674, term166674.getClass(), "next", null);
        setField(term166675, term166675.getClass(), "str", null);
        setIntField(term166675, term166675.getClass(), "type", 0);
        setField(term166675, term166675.getClass(), "next", null);
        setField(term166675, term166675.getClass(), "first", null);
        setField(term166675, term166675.getClass(), "last", null);
        setField(term166675, term166675.getClass(), "propListHead", null);
        setIntField(term166675, term166675.getClass(), "sourcePosition", 0);
        setField(term166675, term166675.getClass(), "jsType", null);
        setField(term166675, term166675.getClass(), "parent", null);
        setField(term166674, term166674.getClass(), "first", term166675);
        setField(term166674, term166674.getClass(), "last", null);
        setField(term166674, term166674.getClass(), "propListHead", null);
        setIntField(term166674, term166674.getClass(), "sourcePosition", 0);
        setField(term166674, term166674.getClass(), "jsType", null);
        setField(term166674, term166674.getClass(), "parent", null);
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
        args[1] = term166624;
        args[2] = term166578;
        callMethod(klass, "visit", argTypes, term166400, args);
        assertTrue(recursiveEquals(term166400, term166672));
        assertTrue(recursiveEquals(term166624, term166674));
        assertTrue(recursiveEquals(term166578, null));
    }

};


