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

public class PeepholeFoldConstants_optimizeSubtree_16065069932674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term764773;
     Object term764859;
     Object term764920;
     Object term764921;
     Object term764867;

    public PeepholeFoldConstants_optimizeSubtree_16065069932674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term764773 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term764859 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term764859, term764859.getClass(), "type", 37);
        term764920 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term764920, term764920.getClass(), "currentTraversal", null);
        term764921 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term764921, term764921.getClass(), "functionName", null);
        setBooleanField(term764921, term764921.getClass(), "itsNeedsActivation", false);
        setIntField(term764921, term764921.getClass(), "itsFunctionType", 0);
        setBooleanField(term764921, term764921.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term764921, term764921.getClass(), "encodedSourceStart", 0);
        setIntField(term764921, term764921.getClass(), "encodedSourceEnd", 0);
        setField(term764921, term764921.getClass(), "sourceName", null);
        setIntField(term764921, term764921.getClass(), "baseLineno", 0);
        setIntField(term764921, term764921.getClass(), "endLineno", 0);
        setField(term764921, term764921.getClass(), "functions", null);
        setField(term764921, term764921.getClass(), "regexps", null);
        setField(term764921, term764921.getClass(), "itsVariables", null);
        setField(term764921, term764921.getClass(), "itsConst", null);
        setField(term764921, term764921.getClass(), "itsVariableNames", null);
        setIntField(term764921, term764921.getClass(), "varStart", 0);
        setField(term764921, term764921.getClass(), "compilerData", null);
        setIntField(term764921, term764921.getClass(), "type", 37);
        setField(term764921, term764921.getClass(), "next", null);
        setField(term764921, term764921.getClass(), "first", null);
        setField(term764921, term764921.getClass(), "last", null);
        setField(term764921, term764921.getClass(), "propListHead", null);
        setIntField(term764921, term764921.getClass(), "sourcePosition", 0);
        setField(term764921, term764921.getClass(), "jsType", null);
        setField(term764921, term764921.getClass(), "parent", null);
        term764867 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term764867, term764867.getClass(), "functionName", null);
        setBooleanField(term764867, term764867.getClass(), "itsNeedsActivation", false);
        setIntField(term764867, term764867.getClass(), "itsFunctionType", 0);
        setBooleanField(term764867, term764867.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term764867, term764867.getClass(), "encodedSourceStart", 0);
        setIntField(term764867, term764867.getClass(), "encodedSourceEnd", 0);
        setField(term764867, term764867.getClass(), "sourceName", null);
        setIntField(term764867, term764867.getClass(), "baseLineno", 0);
        setIntField(term764867, term764867.getClass(), "endLineno", 0);
        setField(term764867, term764867.getClass(), "functions", null);
        setField(term764867, term764867.getClass(), "regexps", null);
        setField(term764867, term764867.getClass(), "itsVariables", null);
        setField(term764867, term764867.getClass(), "itsConst", null);
        setField(term764867, term764867.getClass(), "itsVariableNames", null);
        setIntField(term764867, term764867.getClass(), "varStart", 0);
        setField(term764867, term764867.getClass(), "compilerData", null);
        setIntField(term764867, term764867.getClass(), "type", 37);
        setField(term764867, term764867.getClass(), "next", null);
        setField(term764867, term764867.getClass(), "first", null);
        setField(term764867, term764867.getClass(), "last", null);
        setField(term764867, term764867.getClass(), "propListHead", null);
        setIntField(term764867, term764867.getClass(), "sourcePosition", 0);
        setField(term764867, term764867.getClass(), "jsType", null);
        setField(term764867, term764867.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term764859;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term764773, args);
        assertTrue(recursiveEquals(term764773, term764920));
        assertTrue(recursiveEquals(term764859, term764921));
        assertTrue(recursiveEquals(retValue, term764867));
    }

};


