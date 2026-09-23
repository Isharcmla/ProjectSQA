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

public class ReferenceCollectingCallback_visit_872273174394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94347;
     Object term94571;
     Object term94525;
     Object term94969;
     Object term94970;
     Object term94971;

    public ReferenceCollectingCallback_visit_872273174394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94347 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term94571 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term94571, term94571.getClass(), "type", 0);
        term94525 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term94525, term94525.getClass(), "type", 101);
        setField(term94525, term94525.getClass(), "first", term94571);
        term94969 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term94969, term94969.getClass(), "referenceMap", null);
        setField(term94969, term94969.getClass(), "blockStack", null);
        setField(term94969, term94969.getClass(), "behavior", null);
        setField(term94969, term94969.getClass(), "compiler", null);
        setField(term94969, term94969.getClass(), "varFilter", null);
        term94970 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term94970, term94970.getClass(), "str", null);
        setIntField(term94970, term94970.getClass(), "type", 0);
        setField(term94970, term94970.getClass(), "next", null);
        setField(term94970, term94970.getClass(), "first", null);
        setField(term94970, term94970.getClass(), "last", null);
        setField(term94970, term94970.getClass(), "propListHead", null);
        setIntField(term94970, term94970.getClass(), "sourcePosition", 0);
        setField(term94970, term94970.getClass(), "jsType", null);
        setField(term94970, term94970.getClass(), "parent", null);
        term94971 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term94972 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term94971, term94971.getClass(), "functionName", null);
        setBooleanField(term94971, term94971.getClass(), "itsNeedsActivation", false);
        setIntField(term94971, term94971.getClass(), "itsFunctionType", 0);
        setBooleanField(term94971, term94971.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term94971, term94971.getClass(), "encodedSourceStart", 0);
        setIntField(term94971, term94971.getClass(), "encodedSourceEnd", 0);
        setField(term94971, term94971.getClass(), "sourceName", null);
        setIntField(term94971, term94971.getClass(), "baseLineno", 0);
        setIntField(term94971, term94971.getClass(), "endLineno", 0);
        setField(term94971, term94971.getClass(), "functions", null);
        setField(term94971, term94971.getClass(), "regexps", null);
        setField(term94971, term94971.getClass(), "itsVariables", null);
        setField(term94971, term94971.getClass(), "itsConst", null);
        setField(term94971, term94971.getClass(), "itsVariableNames", null);
        setIntField(term94971, term94971.getClass(), "varStart", 0);
        setField(term94971, term94971.getClass(), "compilerData", null);
        setIntField(term94971, term94971.getClass(), "type", 101);
        setField(term94971, term94971.getClass(), "next", null);
        setField(term94972, term94972.getClass(), "str", null);
        setIntField(term94972, term94972.getClass(), "type", 0);
        setField(term94972, term94972.getClass(), "next", null);
        setField(term94972, term94972.getClass(), "first", null);
        setField(term94972, term94972.getClass(), "last", null);
        setField(term94972, term94972.getClass(), "propListHead", null);
        setIntField(term94972, term94972.getClass(), "sourcePosition", 0);
        setField(term94972, term94972.getClass(), "jsType", null);
        setField(term94972, term94972.getClass(), "parent", null);
        setField(term94971, term94971.getClass(), "first", term94972);
        setField(term94971, term94971.getClass(), "last", null);
        setField(term94971, term94971.getClass(), "propListHead", null);
        setIntField(term94971, term94971.getClass(), "sourcePosition", 0);
        setField(term94971, term94971.getClass(), "jsType", null);
        setField(term94971, term94971.getClass(), "parent", null);
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
        args[1] = term94571;
        args[2] = term94525;
        callMethod(klass, "visit", argTypes, term94347, args);
        assertTrue(recursiveEquals(term94347, term94969));
        assertTrue(recursiveEquals(term94571, term94971));
        assertTrue(recursiveEquals(term94525, null));
    }

};


