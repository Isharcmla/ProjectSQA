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

public class ReferenceCollectingCallback_visit_87227317483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16823;
     Object term16915;
     Object term17001;
     Object term17609;
     Object term17610;
     Object term17611;

    public ReferenceCollectingCallback_visit_87227317483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16823 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term16915 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term16915, term16915.getClass(), "type", -39);
        term17001 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term17609 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term17609, term17609.getClass(), "referenceMap", null);
        setField(term17609, term17609.getClass(), "blockStack", null);
        setField(term17609, term17609.getClass(), "behavior", null);
        setField(term17609, term17609.getClass(), "compiler", null);
        setField(term17609, term17609.getClass(), "varFilter", null);
        term17610 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term17610, term17610.getClass(), "str", null);
        setIntField(term17610, term17610.getClass(), "type", -39);
        setField(term17610, term17610.getClass(), "next", null);
        setField(term17610, term17610.getClass(), "first", null);
        setField(term17610, term17610.getClass(), "last", null);
        setField(term17610, term17610.getClass(), "propListHead", null);
        setIntField(term17610, term17610.getClass(), "sourcePosition", 0);
        setField(term17610, term17610.getClass(), "jsType", null);
        setField(term17610, term17610.getClass(), "parent", null);
        term17611 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term17611, term17611.getClass(), "functionName", null);
        setBooleanField(term17611, term17611.getClass(), "itsNeedsActivation", false);
        setIntField(term17611, term17611.getClass(), "itsFunctionType", 0);
        setBooleanField(term17611, term17611.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term17611, term17611.getClass(), "encodedSourceStart", 0);
        setIntField(term17611, term17611.getClass(), "encodedSourceEnd", 0);
        setField(term17611, term17611.getClass(), "sourceName", null);
        setIntField(term17611, term17611.getClass(), "baseLineno", 0);
        setIntField(term17611, term17611.getClass(), "endLineno", 0);
        setField(term17611, term17611.getClass(), "functions", null);
        setField(term17611, term17611.getClass(), "regexps", null);
        setField(term17611, term17611.getClass(), "itsVariables", null);
        setField(term17611, term17611.getClass(), "itsConst", null);
        setField(term17611, term17611.getClass(), "itsVariableNames", null);
        setIntField(term17611, term17611.getClass(), "varStart", 0);
        setField(term17611, term17611.getClass(), "compilerData", null);
        setIntField(term17611, term17611.getClass(), "type", 0);
        setField(term17611, term17611.getClass(), "next", null);
        setField(term17611, term17611.getClass(), "first", null);
        setField(term17611, term17611.getClass(), "last", null);
        setField(term17611, term17611.getClass(), "propListHead", null);
        setIntField(term17611, term17611.getClass(), "sourcePosition", 0);
        setField(term17611, term17611.getClass(), "jsType", null);
        setField(term17611, term17611.getClass(), "parent", null);
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
        args[1] = term16915;
        args[2] = term17001;
        callMethod(klass, "visit", argTypes, term16823, args);
        assertTrue(recursiveEquals(term16823, term17609));
        assertTrue(recursiveEquals(term16915, term17611));
        assertTrue(recursiveEquals(term17001, null));
    }

};


