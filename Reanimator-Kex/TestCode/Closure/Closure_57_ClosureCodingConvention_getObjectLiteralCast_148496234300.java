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

public class ClosureCodingConvention_getObjectLiteralCast_148496234300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123853;
     Object term123939;
     Object term124368;
     Object term124369;

    public ClosureCodingConvention_getObjectLiteralCast_148496234300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123853 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term123939 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term124031 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term123939, term123939.getClass(), "type", 37);
        setField(term123939, term123939.getClass(), "first", term124031);
        term124368 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term124368, term124368.getClass(), "propertyTestFunctions", null);
        term124369 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term124370 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term124369, term124369.getClass(), "functionName", null);
        setBooleanField(term124369, term124369.getClass(), "itsNeedsActivation", false);
        setIntField(term124369, term124369.getClass(), "itsFunctionType", 0);
        setBooleanField(term124369, term124369.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term124369, term124369.getClass(), "encodedSourceStart", 0);
        setIntField(term124369, term124369.getClass(), "encodedSourceEnd", 0);
        setField(term124369, term124369.getClass(), "sourceName", null);
        setIntField(term124369, term124369.getClass(), "baseLineno", 0);
        setIntField(term124369, term124369.getClass(), "endLineno", 0);
        setField(term124369, term124369.getClass(), "functions", null);
        setField(term124369, term124369.getClass(), "regexps", null);
        setField(term124369, term124369.getClass(), "itsVariables", null);
        setField(term124369, term124369.getClass(), "itsConst", null);
        setField(term124369, term124369.getClass(), "itsVariableNames", null);
        setIntField(term124369, term124369.getClass(), "varStart", 0);
        setField(term124369, term124369.getClass(), "compilerData", null);
        setIntField(term124369, term124369.getClass(), "type", 37);
        setField(term124369, term124369.getClass(), "next", null);
        setDoubleField(term124370, term124370.getClass(), "number", 0.0);
        setIntField(term124370, term124370.getClass(), "type", 0);
        setField(term124370, term124370.getClass(), "next", null);
        setField(term124370, term124370.getClass(), "first", null);
        setField(term124370, term124370.getClass(), "last", null);
        setField(term124370, term124370.getClass(), "propListHead", null);
        setIntField(term124370, term124370.getClass(), "sourcePosition", 0);
        setField(term124370, term124370.getClass(), "jsType", null);
        setField(term124370, term124370.getClass(), "parent", null);
        setField(term124369, term124369.getClass(), "first", term124370);
        setField(term124369, term124369.getClass(), "last", null);
        setField(term124369, term124369.getClass(), "propListHead", null);
        setIntField(term124369, term124369.getClass(), "sourcePosition", 0);
        setField(term124369, term124369.getClass(), "jsType", null);
        setField(term124369, term124369.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term123939;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term123853, args);
        assertTrue(recursiveEquals(term123853, term124368));
        assertTrue(recursiveEquals(term123939, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


