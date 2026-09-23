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

public class ReferenceCollectingCallback_shouldTraverse_422855684709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187801;
     Object term187887;
     Object term187973;
     Object term188268;
     Object term188269;
     Object term188270;

    public ReferenceCollectingCallback_shouldTraverse_422855684709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187801 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term187887 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term187973 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term187973, term187973.getClass(), "type", 4);
        term188268 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term188268, term188268.getClass(), "referenceMap", null);
        setField(term188268, term188268.getClass(), "blockStack", null);
        setField(term188268, term188268.getClass(), "behavior", null);
        setField(term188268, term188268.getClass(), "compiler", null);
        setField(term188268, term188268.getClass(), "varFilter", null);
        term188269 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term188269, term188269.getClass(), "functionName", null);
        setBooleanField(term188269, term188269.getClass(), "itsNeedsActivation", false);
        setIntField(term188269, term188269.getClass(), "itsFunctionType", 0);
        setBooleanField(term188269, term188269.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term188269, term188269.getClass(), "encodedSourceStart", 0);
        setIntField(term188269, term188269.getClass(), "encodedSourceEnd", 0);
        setField(term188269, term188269.getClass(), "sourceName", null);
        setIntField(term188269, term188269.getClass(), "baseLineno", 0);
        setIntField(term188269, term188269.getClass(), "endLineno", 0);
        setField(term188269, term188269.getClass(), "functions", null);
        setField(term188269, term188269.getClass(), "regexps", null);
        setField(term188269, term188269.getClass(), "itsVariables", null);
        setField(term188269, term188269.getClass(), "itsConst", null);
        setField(term188269, term188269.getClass(), "itsVariableNames", null);
        setIntField(term188269, term188269.getClass(), "varStart", 0);
        setField(term188269, term188269.getClass(), "compilerData", null);
        setIntField(term188269, term188269.getClass(), "type", 4);
        setField(term188269, term188269.getClass(), "next", null);
        setField(term188269, term188269.getClass(), "first", null);
        setField(term188269, term188269.getClass(), "last", null);
        setField(term188269, term188269.getClass(), "propListHead", null);
        setIntField(term188269, term188269.getClass(), "sourcePosition", 0);
        setField(term188269, term188269.getClass(), "jsType", null);
        setField(term188269, term188269.getClass(), "parent", null);
        term188270 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term188270, term188270.getClass(), "functionName", null);
        setBooleanField(term188270, term188270.getClass(), "itsNeedsActivation", false);
        setIntField(term188270, term188270.getClass(), "itsFunctionType", 0);
        setBooleanField(term188270, term188270.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term188270, term188270.getClass(), "encodedSourceStart", 0);
        setIntField(term188270, term188270.getClass(), "encodedSourceEnd", 0);
        setField(term188270, term188270.getClass(), "sourceName", null);
        setIntField(term188270, term188270.getClass(), "baseLineno", 0);
        setIntField(term188270, term188270.getClass(), "endLineno", 0);
        setField(term188270, term188270.getClass(), "functions", null);
        setField(term188270, term188270.getClass(), "regexps", null);
        setField(term188270, term188270.getClass(), "itsVariables", null);
        setField(term188270, term188270.getClass(), "itsConst", null);
        setField(term188270, term188270.getClass(), "itsVariableNames", null);
        setIntField(term188270, term188270.getClass(), "varStart", 0);
        setField(term188270, term188270.getClass(), "compilerData", null);
        setIntField(term188270, term188270.getClass(), "type", 0);
        setField(term188270, term188270.getClass(), "next", null);
        setField(term188270, term188270.getClass(), "first", null);
        setField(term188270, term188270.getClass(), "last", null);
        setField(term188270, term188270.getClass(), "propListHead", null);
        setIntField(term188270, term188270.getClass(), "sourcePosition", 0);
        setField(term188270, term188270.getClass(), "jsType", null);
        setField(term188270, term188270.getClass(), "parent", null);
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
        args[1] = term187887;
        args[2] = term187973;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term187801, args);
        assertTrue(recursiveEquals(term187801, term188268));
        assertTrue(recursiveEquals(term187887, term188270));
        assertTrue(recursiveEquals(term187973, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


