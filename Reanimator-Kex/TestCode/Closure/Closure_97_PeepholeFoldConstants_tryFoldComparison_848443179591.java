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

public class PeepholeFoldConstants_tryFoldComparison_848443179591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155171;
     Object term155257;
     Object term155343;
     Object term155429;
     Object term155824;
     Object term155825;
     Object term155826;
     Object term155827;
     Object term155788;

    public PeepholeFoldConstants_tryFoldComparison_848443179591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155171 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term155257 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term155257, term155257.getClass(), "type", 14);
        term155343 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term155343, term155343.getClass(), "type", 14);
        term155429 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term155824 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term155824, term155824.getClass(), "currentTraversal", null);
        term155825 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term155825, term155825.getClass(), "functionName", null);
        setBooleanField(term155825, term155825.getClass(), "itsNeedsActivation", false);
        setIntField(term155825, term155825.getClass(), "itsFunctionType", 0);
        setBooleanField(term155825, term155825.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term155825, term155825.getClass(), "encodedSourceStart", 0);
        setIntField(term155825, term155825.getClass(), "encodedSourceEnd", 0);
        setField(term155825, term155825.getClass(), "sourceName", null);
        setIntField(term155825, term155825.getClass(), "baseLineno", 0);
        setIntField(term155825, term155825.getClass(), "endLineno", 0);
        setField(term155825, term155825.getClass(), "functions", null);
        setField(term155825, term155825.getClass(), "regexps", null);
        setField(term155825, term155825.getClass(), "itsVariables", null);
        setField(term155825, term155825.getClass(), "itsConst", null);
        setField(term155825, term155825.getClass(), "itsVariableNames", null);
        setIntField(term155825, term155825.getClass(), "varStart", 0);
        setField(term155825, term155825.getClass(), "compilerData", null);
        setIntField(term155825, term155825.getClass(), "type", 14);
        setField(term155825, term155825.getClass(), "next", null);
        setField(term155825, term155825.getClass(), "first", null);
        setField(term155825, term155825.getClass(), "last", null);
        setField(term155825, term155825.getClass(), "propListHead", null);
        setIntField(term155825, term155825.getClass(), "sourcePosition", 0);
        setField(term155825, term155825.getClass(), "jsType", null);
        setField(term155825, term155825.getClass(), "parent", null);
        term155826 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term155826, term155826.getClass(), "functionName", null);
        setBooleanField(term155826, term155826.getClass(), "itsNeedsActivation", false);
        setIntField(term155826, term155826.getClass(), "itsFunctionType", 0);
        setBooleanField(term155826, term155826.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term155826, term155826.getClass(), "encodedSourceStart", 0);
        setIntField(term155826, term155826.getClass(), "encodedSourceEnd", 0);
        setField(term155826, term155826.getClass(), "sourceName", null);
        setIntField(term155826, term155826.getClass(), "baseLineno", 0);
        setIntField(term155826, term155826.getClass(), "endLineno", 0);
        setField(term155826, term155826.getClass(), "functions", null);
        setField(term155826, term155826.getClass(), "regexps", null);
        setField(term155826, term155826.getClass(), "itsVariables", null);
        setField(term155826, term155826.getClass(), "itsConst", null);
        setField(term155826, term155826.getClass(), "itsVariableNames", null);
        setIntField(term155826, term155826.getClass(), "varStart", 0);
        setField(term155826, term155826.getClass(), "compilerData", null);
        setIntField(term155826, term155826.getClass(), "type", 14);
        setField(term155826, term155826.getClass(), "next", null);
        setField(term155826, term155826.getClass(), "first", null);
        setField(term155826, term155826.getClass(), "last", null);
        setField(term155826, term155826.getClass(), "propListHead", null);
        setIntField(term155826, term155826.getClass(), "sourcePosition", 0);
        setField(term155826, term155826.getClass(), "jsType", null);
        setField(term155826, term155826.getClass(), "parent", null);
        term155827 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term155827, term155827.getClass(), "functionName", null);
        setBooleanField(term155827, term155827.getClass(), "itsNeedsActivation", false);
        setIntField(term155827, term155827.getClass(), "itsFunctionType", 0);
        setBooleanField(term155827, term155827.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term155827, term155827.getClass(), "encodedSourceStart", 0);
        setIntField(term155827, term155827.getClass(), "encodedSourceEnd", 0);
        setField(term155827, term155827.getClass(), "sourceName", null);
        setIntField(term155827, term155827.getClass(), "baseLineno", 0);
        setIntField(term155827, term155827.getClass(), "endLineno", 0);
        setField(term155827, term155827.getClass(), "functions", null);
        setField(term155827, term155827.getClass(), "regexps", null);
        setField(term155827, term155827.getClass(), "itsVariables", null);
        setField(term155827, term155827.getClass(), "itsConst", null);
        setField(term155827, term155827.getClass(), "itsVariableNames", null);
        setIntField(term155827, term155827.getClass(), "varStart", 0);
        setField(term155827, term155827.getClass(), "compilerData", null);
        setIntField(term155827, term155827.getClass(), "type", 0);
        setField(term155827, term155827.getClass(), "next", null);
        setField(term155827, term155827.getClass(), "first", null);
        setField(term155827, term155827.getClass(), "last", null);
        setField(term155827, term155827.getClass(), "propListHead", null);
        setIntField(term155827, term155827.getClass(), "sourcePosition", 0);
        setField(term155827, term155827.getClass(), "jsType", null);
        setField(term155827, term155827.getClass(), "parent", null);
        term155788 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term155788, term155788.getClass(), "functionName", null);
        setBooleanField(term155788, term155788.getClass(), "itsNeedsActivation", false);
        setIntField(term155788, term155788.getClass(), "itsFunctionType", 0);
        setBooleanField(term155788, term155788.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term155788, term155788.getClass(), "encodedSourceStart", 0);
        setIntField(term155788, term155788.getClass(), "encodedSourceEnd", 0);
        setField(term155788, term155788.getClass(), "sourceName", null);
        setIntField(term155788, term155788.getClass(), "baseLineno", 0);
        setIntField(term155788, term155788.getClass(), "endLineno", 0);
        setField(term155788, term155788.getClass(), "functions", null);
        setField(term155788, term155788.getClass(), "regexps", null);
        setField(term155788, term155788.getClass(), "itsVariables", null);
        setField(term155788, term155788.getClass(), "itsConst", null);
        setField(term155788, term155788.getClass(), "itsVariableNames", null);
        setIntField(term155788, term155788.getClass(), "varStart", 0);
        setField(term155788, term155788.getClass(), "compilerData", null);
        setIntField(term155788, term155788.getClass(), "type", 14);
        setField(term155788, term155788.getClass(), "next", null);
        setField(term155788, term155788.getClass(), "first", null);
        setField(term155788, term155788.getClass(), "last", null);
        setField(term155788, term155788.getClass(), "propListHead", null);
        setIntField(term155788, term155788.getClass(), "sourcePosition", 0);
        setField(term155788, term155788.getClass(), "jsType", null);
        setField(term155788, term155788.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term155257;
        args[1] = term155343;
        args[2] = term155429;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term155171, args);
        assertTrue(recursiveEquals(term155171, term155824));
        assertTrue(recursiveEquals(term155257, term155825));
        assertTrue(recursiveEquals(term155343, term155826));
        assertTrue(recursiveEquals(term155429, term155827));
        assertTrue(recursiveEquals(retValue, term155788));
    }

};


