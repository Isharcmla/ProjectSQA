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

public class ReferenceCollectingCallback_visit_872273174195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48011;
     Object term48097;
     Object term48189;
     Object term48862;
     Object term48863;
     Object term48864;

    public ReferenceCollectingCallback_visit_872273174195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48011 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term48097 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term48097, term48097.getClass(), "type", -39);
        term48189 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term48862 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term48862, term48862.getClass(), "referenceMap", null);
        setField(term48862, term48862.getClass(), "blockStack", null);
        setField(term48862, term48862.getClass(), "behavior", null);
        setField(term48862, term48862.getClass(), "compiler", null);
        setField(term48862, term48862.getClass(), "varFilter", null);
        term48863 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term48863, term48863.getClass(), "functionName", null);
        setBooleanField(term48863, term48863.getClass(), "itsNeedsActivation", false);
        setIntField(term48863, term48863.getClass(), "itsFunctionType", 0);
        setBooleanField(term48863, term48863.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term48863, term48863.getClass(), "encodedSourceStart", 0);
        setIntField(term48863, term48863.getClass(), "encodedSourceEnd", 0);
        setField(term48863, term48863.getClass(), "sourceName", null);
        setIntField(term48863, term48863.getClass(), "baseLineno", 0);
        setIntField(term48863, term48863.getClass(), "endLineno", 0);
        setField(term48863, term48863.getClass(), "functions", null);
        setField(term48863, term48863.getClass(), "regexps", null);
        setField(term48863, term48863.getClass(), "itsVariables", null);
        setField(term48863, term48863.getClass(), "itsConst", null);
        setField(term48863, term48863.getClass(), "itsVariableNames", null);
        setIntField(term48863, term48863.getClass(), "varStart", 0);
        setField(term48863, term48863.getClass(), "compilerData", null);
        setIntField(term48863, term48863.getClass(), "type", -39);
        setField(term48863, term48863.getClass(), "next", null);
        setField(term48863, term48863.getClass(), "first", null);
        setField(term48863, term48863.getClass(), "last", null);
        setField(term48863, term48863.getClass(), "propListHead", null);
        setIntField(term48863, term48863.getClass(), "sourcePosition", 0);
        setField(term48863, term48863.getClass(), "jsType", null);
        setField(term48863, term48863.getClass(), "parent", null);
        term48864 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term48864, term48864.getClass(), "str", null);
        setIntField(term48864, term48864.getClass(), "type", 0);
        setField(term48864, term48864.getClass(), "next", null);
        setField(term48864, term48864.getClass(), "first", null);
        setField(term48864, term48864.getClass(), "last", null);
        setField(term48864, term48864.getClass(), "propListHead", null);
        setIntField(term48864, term48864.getClass(), "sourcePosition", 0);
        setField(term48864, term48864.getClass(), "jsType", null);
        setField(term48864, term48864.getClass(), "parent", null);
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
        args[1] = term48097;
        args[2] = term48189;
        callMethod(klass, "visit", argTypes, term48011, args);
        assertTrue(recursiveEquals(term48011, term48862));
        assertTrue(recursiveEquals(term48097, term48864));
        assertTrue(recursiveEquals(term48189, null));
    }

};


