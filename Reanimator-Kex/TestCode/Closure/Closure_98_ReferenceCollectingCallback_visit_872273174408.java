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

public class ReferenceCollectingCallback_visit_872273174408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108468;
     Object term108560;
     Object term108646;
     Object term108754;
     Object term108755;
     Object term108756;

    public ReferenceCollectingCallback_visit_872273174408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108468 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term108560 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term108560, term108560.getClass(), "type", -39);
        term108646 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term108754 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term108754, term108754.getClass(), "referenceMap", null);
        setField(term108754, term108754.getClass(), "blockStack", null);
        setField(term108754, term108754.getClass(), "behavior", null);
        setField(term108754, term108754.getClass(), "compiler", null);
        setField(term108754, term108754.getClass(), "varFilter", null);
        term108755 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term108755, term108755.getClass(), "number", 0.0);
        setIntField(term108755, term108755.getClass(), "type", -39);
        setField(term108755, term108755.getClass(), "next", null);
        setField(term108755, term108755.getClass(), "first", null);
        setField(term108755, term108755.getClass(), "last", null);
        setField(term108755, term108755.getClass(), "propListHead", null);
        setIntField(term108755, term108755.getClass(), "sourcePosition", 0);
        setField(term108755, term108755.getClass(), "jsType", null);
        setField(term108755, term108755.getClass(), "parent", null);
        term108756 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term108756, term108756.getClass(), "functionName", null);
        setBooleanField(term108756, term108756.getClass(), "itsNeedsActivation", false);
        setIntField(term108756, term108756.getClass(), "itsFunctionType", 0);
        setBooleanField(term108756, term108756.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term108756, term108756.getClass(), "encodedSourceStart", 0);
        setIntField(term108756, term108756.getClass(), "encodedSourceEnd", 0);
        setField(term108756, term108756.getClass(), "sourceName", null);
        setIntField(term108756, term108756.getClass(), "baseLineno", 0);
        setIntField(term108756, term108756.getClass(), "endLineno", 0);
        setField(term108756, term108756.getClass(), "functions", null);
        setField(term108756, term108756.getClass(), "regexps", null);
        setField(term108756, term108756.getClass(), "itsVariables", null);
        setField(term108756, term108756.getClass(), "itsConst", null);
        setField(term108756, term108756.getClass(), "itsVariableNames", null);
        setIntField(term108756, term108756.getClass(), "varStart", 0);
        setField(term108756, term108756.getClass(), "compilerData", null);
        setIntField(term108756, term108756.getClass(), "type", 0);
        setField(term108756, term108756.getClass(), "next", null);
        setField(term108756, term108756.getClass(), "first", null);
        setField(term108756, term108756.getClass(), "last", null);
        setField(term108756, term108756.getClass(), "propListHead", null);
        setIntField(term108756, term108756.getClass(), "sourcePosition", 0);
        setField(term108756, term108756.getClass(), "jsType", null);
        setField(term108756, term108756.getClass(), "parent", null);
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
        args[1] = term108560;
        args[2] = term108646;
        callMethod(klass, "visit", argTypes, term108468, args);
        assertTrue(recursiveEquals(term108468, term108754));
        assertTrue(recursiveEquals(term108560, term108756));
        assertTrue(recursiveEquals(term108646, null));
    }

};


