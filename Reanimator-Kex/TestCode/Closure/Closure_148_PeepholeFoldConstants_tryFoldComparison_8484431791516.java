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

public class PeepholeFoldConstants_tryFoldComparison_8484431791516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378828;
     Object term378914;
     Object term379000;
     Object term379092;
     Object term379139;
     Object term379140;
     Object term379141;
     Object term379142;
     Object term379110;

    public PeepholeFoldConstants_tryFoldComparison_8484431791516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term378828 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term378914 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term378914, term378914.getClass(), "type", 14);
        term379000 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term379000, term379000.getClass(), "type", 14);
        term379092 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term379139 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term379139, term379139.getClass(), "currentTraversal", null);
        term379140 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term379140, term379140.getClass(), "functionName", null);
        setBooleanField(term379140, term379140.getClass(), "itsNeedsActivation", false);
        setIntField(term379140, term379140.getClass(), "itsFunctionType", 0);
        setBooleanField(term379140, term379140.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term379140, term379140.getClass(), "encodedSourceStart", 0);
        setIntField(term379140, term379140.getClass(), "encodedSourceEnd", 0);
        setField(term379140, term379140.getClass(), "sourceName", null);
        setIntField(term379140, term379140.getClass(), "baseLineno", 0);
        setIntField(term379140, term379140.getClass(), "endLineno", 0);
        setField(term379140, term379140.getClass(), "functions", null);
        setField(term379140, term379140.getClass(), "regexps", null);
        setField(term379140, term379140.getClass(), "itsVariables", null);
        setField(term379140, term379140.getClass(), "itsConst", null);
        setField(term379140, term379140.getClass(), "itsVariableNames", null);
        setIntField(term379140, term379140.getClass(), "varStart", 0);
        setField(term379140, term379140.getClass(), "compilerData", null);
        setIntField(term379140, term379140.getClass(), "type", 14);
        setField(term379140, term379140.getClass(), "next", null);
        setField(term379140, term379140.getClass(), "first", null);
        setField(term379140, term379140.getClass(), "last", null);
        setField(term379140, term379140.getClass(), "propListHead", null);
        setIntField(term379140, term379140.getClass(), "sourcePosition", 0);
        setField(term379140, term379140.getClass(), "jsType", null);
        setField(term379140, term379140.getClass(), "parent", null);
        term379141 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term379141, term379141.getClass(), "functionName", null);
        setBooleanField(term379141, term379141.getClass(), "itsNeedsActivation", false);
        setIntField(term379141, term379141.getClass(), "itsFunctionType", 0);
        setBooleanField(term379141, term379141.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term379141, term379141.getClass(), "encodedSourceStart", 0);
        setIntField(term379141, term379141.getClass(), "encodedSourceEnd", 0);
        setField(term379141, term379141.getClass(), "sourceName", null);
        setIntField(term379141, term379141.getClass(), "baseLineno", 0);
        setIntField(term379141, term379141.getClass(), "endLineno", 0);
        setField(term379141, term379141.getClass(), "functions", null);
        setField(term379141, term379141.getClass(), "regexps", null);
        setField(term379141, term379141.getClass(), "itsVariables", null);
        setField(term379141, term379141.getClass(), "itsConst", null);
        setField(term379141, term379141.getClass(), "itsVariableNames", null);
        setIntField(term379141, term379141.getClass(), "varStart", 0);
        setField(term379141, term379141.getClass(), "compilerData", null);
        setIntField(term379141, term379141.getClass(), "type", 14);
        setField(term379141, term379141.getClass(), "next", null);
        setField(term379141, term379141.getClass(), "first", null);
        setField(term379141, term379141.getClass(), "last", null);
        setField(term379141, term379141.getClass(), "propListHead", null);
        setIntField(term379141, term379141.getClass(), "sourcePosition", 0);
        setField(term379141, term379141.getClass(), "jsType", null);
        setField(term379141, term379141.getClass(), "parent", null);
        term379142 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term379142, term379142.getClass(), "number", 0.0);
        setIntField(term379142, term379142.getClass(), "type", 0);
        setField(term379142, term379142.getClass(), "next", null);
        setField(term379142, term379142.getClass(), "first", null);
        setField(term379142, term379142.getClass(), "last", null);
        setField(term379142, term379142.getClass(), "propListHead", null);
        setIntField(term379142, term379142.getClass(), "sourcePosition", 0);
        setField(term379142, term379142.getClass(), "jsType", null);
        setField(term379142, term379142.getClass(), "parent", null);
        term379110 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term379110, term379110.getClass(), "functionName", null);
        setBooleanField(term379110, term379110.getClass(), "itsNeedsActivation", false);
        setIntField(term379110, term379110.getClass(), "itsFunctionType", 0);
        setBooleanField(term379110, term379110.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term379110, term379110.getClass(), "encodedSourceStart", 0);
        setIntField(term379110, term379110.getClass(), "encodedSourceEnd", 0);
        setField(term379110, term379110.getClass(), "sourceName", null);
        setIntField(term379110, term379110.getClass(), "baseLineno", 0);
        setIntField(term379110, term379110.getClass(), "endLineno", 0);
        setField(term379110, term379110.getClass(), "functions", null);
        setField(term379110, term379110.getClass(), "regexps", null);
        setField(term379110, term379110.getClass(), "itsVariables", null);
        setField(term379110, term379110.getClass(), "itsConst", null);
        setField(term379110, term379110.getClass(), "itsVariableNames", null);
        setIntField(term379110, term379110.getClass(), "varStart", 0);
        setField(term379110, term379110.getClass(), "compilerData", null);
        setIntField(term379110, term379110.getClass(), "type", 14);
        setField(term379110, term379110.getClass(), "next", null);
        setField(term379110, term379110.getClass(), "first", null);
        setField(term379110, term379110.getClass(), "last", null);
        setField(term379110, term379110.getClass(), "propListHead", null);
        setIntField(term379110, term379110.getClass(), "sourcePosition", 0);
        setField(term379110, term379110.getClass(), "jsType", null);
        setField(term379110, term379110.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term378914;
        args[1] = term379000;
        args[2] = term379092;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term378828, args);
        assertTrue(recursiveEquals(term378828, term379139));
        assertTrue(recursiveEquals(term378914, term379140));
        assertTrue(recursiveEquals(term379000, term379141));
        assertTrue(recursiveEquals(term379092, term379142));
        assertTrue(recursiveEquals(retValue, term379110));
    }

};


