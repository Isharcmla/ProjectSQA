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

public class PeepholeFoldConstants_tryFoldAndOr_425870290943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278381;
     Object term278467;
     Object term278559;
     Object term278651;
     Object term303413;
     Object term303414;
     Object term303415;
     Object term303416;
     Object term303366;

    public PeepholeFoldConstants_tryFoldAndOr_425870290943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278381 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term278467 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term278467, term278467.getClass(), "parent", null);
        setIntField(term278467, term278467.getClass(), "type", 0);
        term278559 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term278559, term278559.getClass(), "type", 0);
        term278651 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term303413 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term303413, term303413.getClass(), "currentTraversal", null);
        term303414 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term303414, term303414.getClass(), "functionName", null);
        setBooleanField(term303414, term303414.getClass(), "itsNeedsActivation", false);
        setIntField(term303414, term303414.getClass(), "itsFunctionType", 0);
        setBooleanField(term303414, term303414.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term303414, term303414.getClass(), "encodedSourceStart", 0);
        setIntField(term303414, term303414.getClass(), "encodedSourceEnd", 0);
        setField(term303414, term303414.getClass(), "sourceName", null);
        setIntField(term303414, term303414.getClass(), "baseLineno", 0);
        setIntField(term303414, term303414.getClass(), "endLineno", 0);
        setField(term303414, term303414.getClass(), "functions", null);
        setField(term303414, term303414.getClass(), "regexps", null);
        setField(term303414, term303414.getClass(), "itsVariables", null);
        setField(term303414, term303414.getClass(), "itsConst", null);
        setField(term303414, term303414.getClass(), "itsVariableNames", null);
        setIntField(term303414, term303414.getClass(), "varStart", 0);
        setField(term303414, term303414.getClass(), "compilerData", null);
        setIntField(term303414, term303414.getClass(), "type", 0);
        setField(term303414, term303414.getClass(), "next", null);
        setField(term303414, term303414.getClass(), "first", null);
        setField(term303414, term303414.getClass(), "last", null);
        setField(term303414, term303414.getClass(), "propListHead", null);
        setIntField(term303414, term303414.getClass(), "sourcePosition", 0);
        setField(term303414, term303414.getClass(), "jsType", null);
        setField(term303414, term303414.getClass(), "parent", null);
        term303415 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term303415, term303415.getClass(), "str", null);
        setIntField(term303415, term303415.getClass(), "type", 0);
        setField(term303415, term303415.getClass(), "next", null);
        setField(term303415, term303415.getClass(), "first", null);
        setField(term303415, term303415.getClass(), "last", null);
        setField(term303415, term303415.getClass(), "propListHead", null);
        setIntField(term303415, term303415.getClass(), "sourcePosition", 0);
        setField(term303415, term303415.getClass(), "jsType", null);
        setField(term303415, term303415.getClass(), "parent", null);
        term303416 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term303416, term303416.getClass(), "number", 0.0);
        setIntField(term303416, term303416.getClass(), "type", 0);
        setField(term303416, term303416.getClass(), "next", null);
        setField(term303416, term303416.getClass(), "first", null);
        setField(term303416, term303416.getClass(), "last", null);
        setField(term303416, term303416.getClass(), "propListHead", null);
        setIntField(term303416, term303416.getClass(), "sourcePosition", 0);
        setField(term303416, term303416.getClass(), "jsType", null);
        setField(term303416, term303416.getClass(), "parent", null);
        term303366 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term303366, term303366.getClass(), "functionName", null);
        setBooleanField(term303366, term303366.getClass(), "itsNeedsActivation", false);
        setIntField(term303366, term303366.getClass(), "itsFunctionType", 0);
        setBooleanField(term303366, term303366.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term303366, term303366.getClass(), "encodedSourceStart", 0);
        setIntField(term303366, term303366.getClass(), "encodedSourceEnd", 0);
        setField(term303366, term303366.getClass(), "sourceName", null);
        setIntField(term303366, term303366.getClass(), "baseLineno", 0);
        setIntField(term303366, term303366.getClass(), "endLineno", 0);
        setField(term303366, term303366.getClass(), "functions", null);
        setField(term303366, term303366.getClass(), "regexps", null);
        setField(term303366, term303366.getClass(), "itsVariables", null);
        setField(term303366, term303366.getClass(), "itsConst", null);
        setField(term303366, term303366.getClass(), "itsVariableNames", null);
        setIntField(term303366, term303366.getClass(), "varStart", 0);
        setField(term303366, term303366.getClass(), "compilerData", null);
        setIntField(term303366, term303366.getClass(), "type", 0);
        setField(term303366, term303366.getClass(), "next", null);
        setField(term303366, term303366.getClass(), "first", null);
        setField(term303366, term303366.getClass(), "last", null);
        setField(term303366, term303366.getClass(), "propListHead", null);
        setIntField(term303366, term303366.getClass(), "sourcePosition", 0);
        setField(term303366, term303366.getClass(), "jsType", null);
        setField(term303366, term303366.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term278467;
        args[1] = term278559;
        args[2] = term278651;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term278381, args);
        assertTrue(recursiveEquals(term278381, term303413));
        assertTrue(recursiveEquals(term278467, term303414));
        assertTrue(recursiveEquals(term278559, term303415));
        assertTrue(recursiveEquals(term278651, term303416));
        assertTrue(recursiveEquals(retValue, term303366));
    }

};


