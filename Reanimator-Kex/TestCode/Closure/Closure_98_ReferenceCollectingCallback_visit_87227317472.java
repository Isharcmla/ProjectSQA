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

public class ReferenceCollectingCallback_visit_87227317472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14092;
     Object term14178;
     Object term14270;
     Object term14934;
     Object term14935;
     Object term14936;

    public ReferenceCollectingCallback_visit_87227317472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14092 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term14178 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term14178, term14178.getClass(), "type", -39);
        term14270 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term14934 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term14934, term14934.getClass(), "referenceMap", null);
        setField(term14934, term14934.getClass(), "blockStack", null);
        setField(term14934, term14934.getClass(), "behavior", null);
        setField(term14934, term14934.getClass(), "compiler", null);
        setField(term14934, term14934.getClass(), "varFilter", null);
        term14935 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term14935, term14935.getClass(), "functionName", null);
        setBooleanField(term14935, term14935.getClass(), "itsNeedsActivation", false);
        setIntField(term14935, term14935.getClass(), "itsFunctionType", 0);
        setBooleanField(term14935, term14935.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term14935, term14935.getClass(), "encodedSourceStart", 0);
        setIntField(term14935, term14935.getClass(), "encodedSourceEnd", 0);
        setField(term14935, term14935.getClass(), "sourceName", null);
        setIntField(term14935, term14935.getClass(), "baseLineno", 0);
        setIntField(term14935, term14935.getClass(), "endLineno", 0);
        setField(term14935, term14935.getClass(), "functions", null);
        setField(term14935, term14935.getClass(), "regexps", null);
        setField(term14935, term14935.getClass(), "itsVariables", null);
        setField(term14935, term14935.getClass(), "itsConst", null);
        setField(term14935, term14935.getClass(), "itsVariableNames", null);
        setIntField(term14935, term14935.getClass(), "varStart", 0);
        setField(term14935, term14935.getClass(), "compilerData", null);
        setIntField(term14935, term14935.getClass(), "type", -39);
        setField(term14935, term14935.getClass(), "next", null);
        setField(term14935, term14935.getClass(), "first", null);
        setField(term14935, term14935.getClass(), "last", null);
        setField(term14935, term14935.getClass(), "propListHead", null);
        setIntField(term14935, term14935.getClass(), "sourcePosition", 0);
        setField(term14935, term14935.getClass(), "jsType", null);
        setField(term14935, term14935.getClass(), "parent", null);
        term14936 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term14936, term14936.getClass(), "number", 0.0);
        setIntField(term14936, term14936.getClass(), "type", 0);
        setField(term14936, term14936.getClass(), "next", null);
        setField(term14936, term14936.getClass(), "first", null);
        setField(term14936, term14936.getClass(), "last", null);
        setField(term14936, term14936.getClass(), "propListHead", null);
        setIntField(term14936, term14936.getClass(), "sourcePosition", 0);
        setField(term14936, term14936.getClass(), "jsType", null);
        setField(term14936, term14936.getClass(), "parent", null);
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
        args[1] = term14178;
        args[2] = term14270;
        callMethod(klass, "visit", argTypes, term14092, args);
        assertTrue(recursiveEquals(term14092, term14934));
        assertTrue(recursiveEquals(term14178, term14936));
        assertTrue(recursiveEquals(term14270, null));
    }

};


