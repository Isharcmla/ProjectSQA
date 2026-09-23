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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447573;
     Object term447665;
     Object term447751;
     Object term448315;
     Object term448316;
     Object term448317;
     Object term448276;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term447573 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term447665 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term447665, term447665.getClass(), "parent", null);
        setIntField(term447665, term447665.getClass(), "type", 64);
        term447751 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term447751, term447751.getClass(), "type", 64);
        term448315 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term448315, term448315.getClass(), "currentTraversal", null);
        term448316 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term448316, term448316.getClass(), "str", null);
        setIntField(term448316, term448316.getClass(), "type", 64);
        setField(term448316, term448316.getClass(), "next", null);
        setField(term448316, term448316.getClass(), "first", null);
        setField(term448316, term448316.getClass(), "last", null);
        setField(term448316, term448316.getClass(), "propListHead", null);
        setIntField(term448316, term448316.getClass(), "sourcePosition", 0);
        setField(term448316, term448316.getClass(), "jsType", null);
        setField(term448316, term448316.getClass(), "parent", null);
        term448317 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term448317, term448317.getClass(), "functionName", null);
        setBooleanField(term448317, term448317.getClass(), "itsNeedsActivation", false);
        setIntField(term448317, term448317.getClass(), "itsFunctionType", 0);
        setBooleanField(term448317, term448317.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term448317, term448317.getClass(), "encodedSourceStart", 0);
        setIntField(term448317, term448317.getClass(), "encodedSourceEnd", 0);
        setField(term448317, term448317.getClass(), "sourceName", null);
        setIntField(term448317, term448317.getClass(), "baseLineno", 0);
        setIntField(term448317, term448317.getClass(), "endLineno", 0);
        setField(term448317, term448317.getClass(), "functions", null);
        setField(term448317, term448317.getClass(), "regexps", null);
        setField(term448317, term448317.getClass(), "itsVariables", null);
        setField(term448317, term448317.getClass(), "itsConst", null);
        setField(term448317, term448317.getClass(), "itsVariableNames", null);
        setIntField(term448317, term448317.getClass(), "varStart", 0);
        setField(term448317, term448317.getClass(), "compilerData", null);
        setIntField(term448317, term448317.getClass(), "type", 64);
        setField(term448317, term448317.getClass(), "next", null);
        setField(term448317, term448317.getClass(), "first", null);
        setField(term448317, term448317.getClass(), "last", null);
        setField(term448317, term448317.getClass(), "propListHead", null);
        setIntField(term448317, term448317.getClass(), "sourcePosition", 0);
        setField(term448317, term448317.getClass(), "jsType", null);
        setField(term448317, term448317.getClass(), "parent", null);
        term448276 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term448276, term448276.getClass(), "str", null);
        setIntField(term448276, term448276.getClass(), "type", 64);
        setField(term448276, term448276.getClass(), "next", null);
        setField(term448276, term448276.getClass(), "first", null);
        setField(term448276, term448276.getClass(), "last", null);
        setField(term448276, term448276.getClass(), "propListHead", null);
        setIntField(term448276, term448276.getClass(), "sourcePosition", 0);
        setField(term448276, term448276.getClass(), "jsType", null);
        setField(term448276, term448276.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term447665;
        args[1] = term447751;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term447573, args);
        assertTrue(recursiveEquals(term447573, term448315));
        assertTrue(recursiveEquals(term447665, term448316));
        assertTrue(recursiveEquals(term447751, term448317));
        assertTrue(recursiveEquals(retValue, term448276));
    }

};


