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

public class ClosureCodingConvention_getObjectLiteralCast_148496234317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126934;
     Object term127020;
     Object term127205;
     Object term127206;

    public ClosureCodingConvention_getObjectLiteralCast_148496234317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126934 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term127020 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term127112 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term127020, term127020.getClass(), "type", 37);
        setField(term127020, term127020.getClass(), "first", term127112);
        term127205 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term127205, term127205.getClass(), "propertyTestFunctions", null);
        term127206 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term127207 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term127206, term127206.getClass(), "functionName", null);
        setBooleanField(term127206, term127206.getClass(), "itsNeedsActivation", false);
        setIntField(term127206, term127206.getClass(), "itsFunctionType", 0);
        setBooleanField(term127206, term127206.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term127206, term127206.getClass(), "encodedSourceStart", 0);
        setIntField(term127206, term127206.getClass(), "encodedSourceEnd", 0);
        setField(term127206, term127206.getClass(), "sourceName", null);
        setIntField(term127206, term127206.getClass(), "baseLineno", 0);
        setIntField(term127206, term127206.getClass(), "endLineno", 0);
        setField(term127206, term127206.getClass(), "functions", null);
        setField(term127206, term127206.getClass(), "regexps", null);
        setField(term127206, term127206.getClass(), "itsVariables", null);
        setField(term127206, term127206.getClass(), "itsConst", null);
        setField(term127206, term127206.getClass(), "itsVariableNames", null);
        setIntField(term127206, term127206.getClass(), "varStart", 0);
        setField(term127206, term127206.getClass(), "compilerData", null);
        setIntField(term127206, term127206.getClass(), "type", 37);
        setField(term127206, term127206.getClass(), "next", null);
        setField(term127207, term127207.getClass(), "str", null);
        setIntField(term127207, term127207.getClass(), "type", 0);
        setField(term127207, term127207.getClass(), "next", null);
        setField(term127207, term127207.getClass(), "first", null);
        setField(term127207, term127207.getClass(), "last", null);
        setField(term127207, term127207.getClass(), "propListHead", null);
        setIntField(term127207, term127207.getClass(), "sourcePosition", 0);
        setField(term127207, term127207.getClass(), "jsType", null);
        setField(term127207, term127207.getClass(), "parent", null);
        setField(term127206, term127206.getClass(), "first", term127207);
        setField(term127206, term127206.getClass(), "last", null);
        setField(term127206, term127206.getClass(), "propListHead", null);
        setIntField(term127206, term127206.getClass(), "sourcePosition", 0);
        setField(term127206, term127206.getClass(), "jsType", null);
        setField(term127206, term127206.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term127020;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term126934, args);
        assertTrue(recursiveEquals(term126934, term127205));
        assertTrue(recursiveEquals(term127020, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


