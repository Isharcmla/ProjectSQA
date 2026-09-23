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

public class ClosureCodingConvention_getObjectLiteralCast_148496234324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128050;
     Object term128136;
     Object term128571;
     Object term128572;

    public ClosureCodingConvention_getObjectLiteralCast_148496234324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128050 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term128136 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term128222 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term128136, term128136.getClass(), "type", 37);
        setField(term128136, term128136.getClass(), "first", term128222);
        term128571 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term128571, term128571.getClass(), "propertyTestFunctions", null);
        term128572 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term128573 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term128572, term128572.getClass(), "functionName", null);
        setBooleanField(term128572, term128572.getClass(), "itsNeedsActivation", false);
        setIntField(term128572, term128572.getClass(), "itsFunctionType", 0);
        setBooleanField(term128572, term128572.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term128572, term128572.getClass(), "encodedSourceStart", 0);
        setIntField(term128572, term128572.getClass(), "encodedSourceEnd", 0);
        setField(term128572, term128572.getClass(), "sourceName", null);
        setIntField(term128572, term128572.getClass(), "baseLineno", 0);
        setIntField(term128572, term128572.getClass(), "endLineno", 0);
        setField(term128572, term128572.getClass(), "functions", null);
        setField(term128572, term128572.getClass(), "regexps", null);
        setField(term128572, term128572.getClass(), "itsVariables", null);
        setField(term128572, term128572.getClass(), "itsConst", null);
        setField(term128572, term128572.getClass(), "itsVariableNames", null);
        setIntField(term128572, term128572.getClass(), "varStart", 0);
        setField(term128572, term128572.getClass(), "compilerData", null);
        setIntField(term128572, term128572.getClass(), "type", 37);
        setField(term128572, term128572.getClass(), "next", null);
        setField(term128573, term128573.getClass(), "functionName", null);
        setBooleanField(term128573, term128573.getClass(), "itsNeedsActivation", false);
        setIntField(term128573, term128573.getClass(), "itsFunctionType", 0);
        setBooleanField(term128573, term128573.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term128573, term128573.getClass(), "encodedSourceStart", 0);
        setIntField(term128573, term128573.getClass(), "encodedSourceEnd", 0);
        setField(term128573, term128573.getClass(), "sourceName", null);
        setIntField(term128573, term128573.getClass(), "baseLineno", 0);
        setIntField(term128573, term128573.getClass(), "endLineno", 0);
        setField(term128573, term128573.getClass(), "functions", null);
        setField(term128573, term128573.getClass(), "regexps", null);
        setField(term128573, term128573.getClass(), "itsVariables", null);
        setField(term128573, term128573.getClass(), "itsConst", null);
        setField(term128573, term128573.getClass(), "itsVariableNames", null);
        setIntField(term128573, term128573.getClass(), "varStart", 0);
        setField(term128573, term128573.getClass(), "compilerData", null);
        setIntField(term128573, term128573.getClass(), "type", 0);
        setField(term128573, term128573.getClass(), "next", null);
        setField(term128573, term128573.getClass(), "first", null);
        setField(term128573, term128573.getClass(), "last", null);
        setField(term128573, term128573.getClass(), "propListHead", null);
        setIntField(term128573, term128573.getClass(), "sourcePosition", 0);
        setField(term128573, term128573.getClass(), "jsType", null);
        setField(term128573, term128573.getClass(), "parent", null);
        setField(term128572, term128572.getClass(), "first", term128573);
        setField(term128572, term128572.getClass(), "last", null);
        setField(term128572, term128572.getClass(), "propListHead", null);
        setIntField(term128572, term128572.getClass(), "sourcePosition", 0);
        setField(term128572, term128572.getClass(), "jsType", null);
        setField(term128572, term128572.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term128136;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term128050, args);
        assertTrue(recursiveEquals(term128050, term128571));
        assertTrue(recursiveEquals(term128136, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


