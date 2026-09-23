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

public class PeepholeFoldConstants_tryFoldComparison_848443179981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229083;
     Object term229169;
     Object term229255;
     Object term229341;
     Object term229876;
     Object term229877;
     Object term229878;
     Object term229879;
     Object term229842;

    public PeepholeFoldConstants_tryFoldComparison_848443179981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229083 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term229169 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term229169, term229169.getClass(), "type", 16);
        term229255 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term229255, term229255.getClass(), "type", 16);
        term229341 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term229876 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term229876, term229876.getClass(), "currentTraversal", null);
        term229877 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term229877, term229877.getClass(), "functionName", null);
        setBooleanField(term229877, term229877.getClass(), "itsNeedsActivation", false);
        setIntField(term229877, term229877.getClass(), "itsFunctionType", 0);
        setBooleanField(term229877, term229877.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term229877, term229877.getClass(), "encodedSourceStart", 0);
        setIntField(term229877, term229877.getClass(), "encodedSourceEnd", 0);
        setField(term229877, term229877.getClass(), "sourceName", null);
        setIntField(term229877, term229877.getClass(), "baseLineno", 0);
        setIntField(term229877, term229877.getClass(), "endLineno", 0);
        setField(term229877, term229877.getClass(), "functions", null);
        setField(term229877, term229877.getClass(), "regexps", null);
        setField(term229877, term229877.getClass(), "itsVariables", null);
        setField(term229877, term229877.getClass(), "itsConst", null);
        setField(term229877, term229877.getClass(), "itsVariableNames", null);
        setIntField(term229877, term229877.getClass(), "varStart", 0);
        setField(term229877, term229877.getClass(), "compilerData", null);
        setIntField(term229877, term229877.getClass(), "type", 16);
        setField(term229877, term229877.getClass(), "next", null);
        setField(term229877, term229877.getClass(), "first", null);
        setField(term229877, term229877.getClass(), "last", null);
        setField(term229877, term229877.getClass(), "propListHead", null);
        setIntField(term229877, term229877.getClass(), "sourcePosition", 0);
        setField(term229877, term229877.getClass(), "jsType", null);
        setField(term229877, term229877.getClass(), "parent", null);
        term229878 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term229878, term229878.getClass(), "functionName", null);
        setBooleanField(term229878, term229878.getClass(), "itsNeedsActivation", false);
        setIntField(term229878, term229878.getClass(), "itsFunctionType", 0);
        setBooleanField(term229878, term229878.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term229878, term229878.getClass(), "encodedSourceStart", 0);
        setIntField(term229878, term229878.getClass(), "encodedSourceEnd", 0);
        setField(term229878, term229878.getClass(), "sourceName", null);
        setIntField(term229878, term229878.getClass(), "baseLineno", 0);
        setIntField(term229878, term229878.getClass(), "endLineno", 0);
        setField(term229878, term229878.getClass(), "functions", null);
        setField(term229878, term229878.getClass(), "regexps", null);
        setField(term229878, term229878.getClass(), "itsVariables", null);
        setField(term229878, term229878.getClass(), "itsConst", null);
        setField(term229878, term229878.getClass(), "itsVariableNames", null);
        setIntField(term229878, term229878.getClass(), "varStart", 0);
        setField(term229878, term229878.getClass(), "compilerData", null);
        setIntField(term229878, term229878.getClass(), "type", 16);
        setField(term229878, term229878.getClass(), "next", null);
        setField(term229878, term229878.getClass(), "first", null);
        setField(term229878, term229878.getClass(), "last", null);
        setField(term229878, term229878.getClass(), "propListHead", null);
        setIntField(term229878, term229878.getClass(), "sourcePosition", 0);
        setField(term229878, term229878.getClass(), "jsType", null);
        setField(term229878, term229878.getClass(), "parent", null);
        term229879 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term229879, term229879.getClass(), "functionName", null);
        setBooleanField(term229879, term229879.getClass(), "itsNeedsActivation", false);
        setIntField(term229879, term229879.getClass(), "itsFunctionType", 0);
        setBooleanField(term229879, term229879.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term229879, term229879.getClass(), "encodedSourceStart", 0);
        setIntField(term229879, term229879.getClass(), "encodedSourceEnd", 0);
        setField(term229879, term229879.getClass(), "sourceName", null);
        setIntField(term229879, term229879.getClass(), "baseLineno", 0);
        setIntField(term229879, term229879.getClass(), "endLineno", 0);
        setField(term229879, term229879.getClass(), "functions", null);
        setField(term229879, term229879.getClass(), "regexps", null);
        setField(term229879, term229879.getClass(), "itsVariables", null);
        setField(term229879, term229879.getClass(), "itsConst", null);
        setField(term229879, term229879.getClass(), "itsVariableNames", null);
        setIntField(term229879, term229879.getClass(), "varStart", 0);
        setField(term229879, term229879.getClass(), "compilerData", null);
        setIntField(term229879, term229879.getClass(), "type", 0);
        setField(term229879, term229879.getClass(), "next", null);
        setField(term229879, term229879.getClass(), "first", null);
        setField(term229879, term229879.getClass(), "last", null);
        setField(term229879, term229879.getClass(), "propListHead", null);
        setIntField(term229879, term229879.getClass(), "sourcePosition", 0);
        setField(term229879, term229879.getClass(), "jsType", null);
        setField(term229879, term229879.getClass(), "parent", null);
        term229842 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term229842, term229842.getClass(), "functionName", null);
        setBooleanField(term229842, term229842.getClass(), "itsNeedsActivation", false);
        setIntField(term229842, term229842.getClass(), "itsFunctionType", 0);
        setBooleanField(term229842, term229842.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term229842, term229842.getClass(), "encodedSourceStart", 0);
        setIntField(term229842, term229842.getClass(), "encodedSourceEnd", 0);
        setField(term229842, term229842.getClass(), "sourceName", null);
        setIntField(term229842, term229842.getClass(), "baseLineno", 0);
        setIntField(term229842, term229842.getClass(), "endLineno", 0);
        setField(term229842, term229842.getClass(), "functions", null);
        setField(term229842, term229842.getClass(), "regexps", null);
        setField(term229842, term229842.getClass(), "itsVariables", null);
        setField(term229842, term229842.getClass(), "itsConst", null);
        setField(term229842, term229842.getClass(), "itsVariableNames", null);
        setIntField(term229842, term229842.getClass(), "varStart", 0);
        setField(term229842, term229842.getClass(), "compilerData", null);
        setIntField(term229842, term229842.getClass(), "type", 16);
        setField(term229842, term229842.getClass(), "next", null);
        setField(term229842, term229842.getClass(), "first", null);
        setField(term229842, term229842.getClass(), "last", null);
        setField(term229842, term229842.getClass(), "propListHead", null);
        setIntField(term229842, term229842.getClass(), "sourcePosition", 0);
        setField(term229842, term229842.getClass(), "jsType", null);
        setField(term229842, term229842.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term229169;
        args[1] = term229255;
        args[2] = term229341;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term229083, args);
        assertTrue(recursiveEquals(term229083, term229876));
        assertTrue(recursiveEquals(term229169, term229877));
        assertTrue(recursiveEquals(term229255, term229878));
        assertTrue(recursiveEquals(term229341, term229879));
        assertTrue(recursiveEquals(retValue, term229842));
    }

};


