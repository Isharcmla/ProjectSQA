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

public class ReferenceCollectingCallback_visit_872273174189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44166;
     Object term44252;
     Object term44657;
     Object term44658;

    public ReferenceCollectingCallback_visit_872273174189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44166 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term44252 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term44252, term44252.getClass(), "type", -39);
        term44657 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term44657, term44657.getClass(), "referenceMap", null);
        setField(term44657, term44657.getClass(), "blockStack", null);
        setField(term44657, term44657.getClass(), "behavior", null);
        setField(term44657, term44657.getClass(), "compiler", null);
        setField(term44657, term44657.getClass(), "varFilter", null);
        term44658 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term44658, term44658.getClass(), "functionName", null);
        setBooleanField(term44658, term44658.getClass(), "itsNeedsActivation", false);
        setIntField(term44658, term44658.getClass(), "itsFunctionType", 0);
        setBooleanField(term44658, term44658.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term44658, term44658.getClass(), "encodedSourceStart", 0);
        setIntField(term44658, term44658.getClass(), "encodedSourceEnd", 0);
        setField(term44658, term44658.getClass(), "sourceName", null);
        setIntField(term44658, term44658.getClass(), "baseLineno", 0);
        setIntField(term44658, term44658.getClass(), "endLineno", 0);
        setField(term44658, term44658.getClass(), "functions", null);
        setField(term44658, term44658.getClass(), "regexps", null);
        setField(term44658, term44658.getClass(), "itsVariables", null);
        setField(term44658, term44658.getClass(), "itsConst", null);
        setField(term44658, term44658.getClass(), "itsVariableNames", null);
        setIntField(term44658, term44658.getClass(), "varStart", 0);
        setField(term44658, term44658.getClass(), "compilerData", null);
        setIntField(term44658, term44658.getClass(), "type", -39);
        setField(term44658, term44658.getClass(), "next", null);
        setField(term44658, term44658.getClass(), "first", null);
        setField(term44658, term44658.getClass(), "last", null);
        setField(term44658, term44658.getClass(), "propListHead", null);
        setIntField(term44658, term44658.getClass(), "sourcePosition", 0);
        setField(term44658, term44658.getClass(), "jsType", null);
        setField(term44658, term44658.getClass(), "parent", null);
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
        args[1] = term44252;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term44166, args);
        assertTrue(recursiveEquals(term44166, term44657));
        assertTrue(recursiveEquals(term44252, null));
    }

};


