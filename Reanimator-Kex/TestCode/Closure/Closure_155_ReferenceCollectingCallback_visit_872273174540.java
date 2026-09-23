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

public class ReferenceCollectingCallback_visit_872273174540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137156;
     Object term137377;
     Object term137334;
     Object term138109;
     Object term138110;
     Object term138111;

    public ReferenceCollectingCallback_visit_872273174540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137156 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term137377 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term137377, term137377.getClass(), "type", 0);
        term137334 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term137334, term137334.getClass(), "type", 98);
        setField(term137334, term137334.getClass(), "first", term137377);
        term138109 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term138109, term138109.getClass(), "referenceMap", null);
        setField(term138109, term138109.getClass(), "blockStack", null);
        setField(term138109, term138109.getClass(), "behavior", null);
        setField(term138109, term138109.getClass(), "compiler", null);
        setField(term138109, term138109.getClass(), "varFilter", null);
        term138110 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term138110, term138110.getClass(), "functionName", null);
        setBooleanField(term138110, term138110.getClass(), "itsNeedsActivation", false);
        setIntField(term138110, term138110.getClass(), "itsFunctionType", 0);
        setBooleanField(term138110, term138110.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term138110, term138110.getClass(), "encodedSourceStart", 0);
        setIntField(term138110, term138110.getClass(), "encodedSourceEnd", 0);
        setField(term138110, term138110.getClass(), "sourceName", null);
        setIntField(term138110, term138110.getClass(), "baseLineno", 0);
        setIntField(term138110, term138110.getClass(), "endLineno", 0);
        setField(term138110, term138110.getClass(), "functions", null);
        setField(term138110, term138110.getClass(), "regexps", null);
        setField(term138110, term138110.getClass(), "itsVariables", null);
        setField(term138110, term138110.getClass(), "itsConst", null);
        setField(term138110, term138110.getClass(), "itsVariableNames", null);
        setIntField(term138110, term138110.getClass(), "varStart", 0);
        setField(term138110, term138110.getClass(), "compilerData", null);
        setIntField(term138110, term138110.getClass(), "type", 0);
        setField(term138110, term138110.getClass(), "next", null);
        setField(term138110, term138110.getClass(), "first", null);
        setField(term138110, term138110.getClass(), "last", null);
        setField(term138110, term138110.getClass(), "propListHead", null);
        setIntField(term138110, term138110.getClass(), "sourcePosition", 0);
        setField(term138110, term138110.getClass(), "jsType", null);
        setField(term138110, term138110.getClass(), "parent", null);
        term138111 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term138112 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term138111, term138111.getClass(), "str", null);
        setIntField(term138111, term138111.getClass(), "type", 98);
        setField(term138111, term138111.getClass(), "next", null);
        setField(term138112, term138112.getClass(), "functionName", null);
        setBooleanField(term138112, term138112.getClass(), "itsNeedsActivation", false);
        setIntField(term138112, term138112.getClass(), "itsFunctionType", 0);
        setBooleanField(term138112, term138112.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term138112, term138112.getClass(), "encodedSourceStart", 0);
        setIntField(term138112, term138112.getClass(), "encodedSourceEnd", 0);
        setField(term138112, term138112.getClass(), "sourceName", null);
        setIntField(term138112, term138112.getClass(), "baseLineno", 0);
        setIntField(term138112, term138112.getClass(), "endLineno", 0);
        setField(term138112, term138112.getClass(), "functions", null);
        setField(term138112, term138112.getClass(), "regexps", null);
        setField(term138112, term138112.getClass(), "itsVariables", null);
        setField(term138112, term138112.getClass(), "itsConst", null);
        setField(term138112, term138112.getClass(), "itsVariableNames", null);
        setIntField(term138112, term138112.getClass(), "varStart", 0);
        setField(term138112, term138112.getClass(), "compilerData", null);
        setIntField(term138112, term138112.getClass(), "type", 0);
        setField(term138112, term138112.getClass(), "next", null);
        setField(term138112, term138112.getClass(), "first", null);
        setField(term138112, term138112.getClass(), "last", null);
        setField(term138112, term138112.getClass(), "propListHead", null);
        setIntField(term138112, term138112.getClass(), "sourcePosition", 0);
        setField(term138112, term138112.getClass(), "jsType", null);
        setField(term138112, term138112.getClass(), "parent", null);
        setField(term138111, term138111.getClass(), "first", term138112);
        setField(term138111, term138111.getClass(), "last", null);
        setField(term138111, term138111.getClass(), "propListHead", null);
        setIntField(term138111, term138111.getClass(), "sourcePosition", 0);
        setField(term138111, term138111.getClass(), "jsType", null);
        setField(term138111, term138111.getClass(), "parent", null);
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
        args[1] = term137377;
        args[2] = term137334;
        callMethod(klass, "visit", argTypes, term137156, args);
        assertTrue(recursiveEquals(term137156, term138109));
        assertTrue(recursiveEquals(term137377, term138111));
        assertTrue(recursiveEquals(term137334, null));
    }

};


