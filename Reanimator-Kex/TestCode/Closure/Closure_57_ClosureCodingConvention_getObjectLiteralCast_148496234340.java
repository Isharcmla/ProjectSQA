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

public class ClosureCodingConvention_getObjectLiteralCast_148496234340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131018;
     Object term131104;
     Object term131313;
     Object term131314;

    public ClosureCodingConvention_getObjectLiteralCast_148496234340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131018 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term131104 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term131196 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term131104, term131104.getClass(), "type", 37);
        setIntField(term131196, term131196.getClass(), "type", 42);
        setField(term131104, term131104.getClass(), "first", term131196);
        term131313 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term131313, term131313.getClass(), "propertyTestFunctions", null);
        term131314 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term131315 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term131314, term131314.getClass(), "functionName", null);
        setBooleanField(term131314, term131314.getClass(), "itsNeedsActivation", false);
        setIntField(term131314, term131314.getClass(), "itsFunctionType", 0);
        setBooleanField(term131314, term131314.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term131314, term131314.getClass(), "encodedSourceStart", 0);
        setIntField(term131314, term131314.getClass(), "encodedSourceEnd", 0);
        setField(term131314, term131314.getClass(), "sourceName", null);
        setIntField(term131314, term131314.getClass(), "baseLineno", 0);
        setIntField(term131314, term131314.getClass(), "endLineno", 0);
        setField(term131314, term131314.getClass(), "functions", null);
        setField(term131314, term131314.getClass(), "regexps", null);
        setField(term131314, term131314.getClass(), "itsVariables", null);
        setField(term131314, term131314.getClass(), "itsConst", null);
        setField(term131314, term131314.getClass(), "itsVariableNames", null);
        setIntField(term131314, term131314.getClass(), "varStart", 0);
        setField(term131314, term131314.getClass(), "compilerData", null);
        setIntField(term131314, term131314.getClass(), "type", 37);
        setField(term131314, term131314.getClass(), "next", null);
        setField(term131315, term131315.getClass(), "str", null);
        setIntField(term131315, term131315.getClass(), "type", 42);
        setField(term131315, term131315.getClass(), "next", null);
        setField(term131315, term131315.getClass(), "first", null);
        setField(term131315, term131315.getClass(), "last", null);
        setField(term131315, term131315.getClass(), "propListHead", null);
        setIntField(term131315, term131315.getClass(), "sourcePosition", 0);
        setField(term131315, term131315.getClass(), "jsType", null);
        setField(term131315, term131315.getClass(), "parent", null);
        setField(term131314, term131314.getClass(), "first", term131315);
        setField(term131314, term131314.getClass(), "last", null);
        setField(term131314, term131314.getClass(), "propListHead", null);
        setIntField(term131314, term131314.getClass(), "sourcePosition", 0);
        setField(term131314, term131314.getClass(), "jsType", null);
        setField(term131314, term131314.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term131104;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term131018, args);
        assertTrue(recursiveEquals(term131018, term131313));
        assertTrue(recursiveEquals(term131104, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


