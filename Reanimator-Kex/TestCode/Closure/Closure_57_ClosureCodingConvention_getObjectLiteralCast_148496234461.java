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

public class ClosureCodingConvention_getObjectLiteralCast_148496234461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153313;
     Object term153405;
     Object term153586;
     Object term153587;

    public ClosureCodingConvention_getObjectLiteralCast_148496234461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153313 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term153405 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term153491 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term153405, term153405.getClass(), "type", 37);
        setField(term153405, term153405.getClass(), "first", term153491);
        term153586 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term153586, term153586.getClass(), "propertyTestFunctions", null);
        term153587 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term153588 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term153587, term153587.getClass(), "str", null);
        setIntField(term153587, term153587.getClass(), "type", 37);
        setField(term153587, term153587.getClass(), "next", null);
        setField(term153588, term153588.getClass(), "functionName", null);
        setBooleanField(term153588, term153588.getClass(), "itsNeedsActivation", false);
        setIntField(term153588, term153588.getClass(), "itsFunctionType", 0);
        setBooleanField(term153588, term153588.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term153588, term153588.getClass(), "encodedSourceStart", 0);
        setIntField(term153588, term153588.getClass(), "encodedSourceEnd", 0);
        setField(term153588, term153588.getClass(), "sourceName", null);
        setIntField(term153588, term153588.getClass(), "baseLineno", 0);
        setIntField(term153588, term153588.getClass(), "endLineno", 0);
        setField(term153588, term153588.getClass(), "functions", null);
        setField(term153588, term153588.getClass(), "regexps", null);
        setField(term153588, term153588.getClass(), "itsVariables", null);
        setField(term153588, term153588.getClass(), "itsConst", null);
        setField(term153588, term153588.getClass(), "itsVariableNames", null);
        setIntField(term153588, term153588.getClass(), "varStart", 0);
        setField(term153588, term153588.getClass(), "compilerData", null);
        setIntField(term153588, term153588.getClass(), "type", 0);
        setField(term153588, term153588.getClass(), "next", null);
        setField(term153588, term153588.getClass(), "first", null);
        setField(term153588, term153588.getClass(), "last", null);
        setField(term153588, term153588.getClass(), "propListHead", null);
        setIntField(term153588, term153588.getClass(), "sourcePosition", 0);
        setField(term153588, term153588.getClass(), "jsType", null);
        setField(term153588, term153588.getClass(), "parent", null);
        setField(term153587, term153587.getClass(), "first", term153588);
        setField(term153587, term153587.getClass(), "last", null);
        setField(term153587, term153587.getClass(), "propListHead", null);
        setIntField(term153587, term153587.getClass(), "sourcePosition", 0);
        setField(term153587, term153587.getClass(), "jsType", null);
        setField(term153587, term153587.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term153405;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term153313, args);
        assertTrue(recursiveEquals(term153313, term153586));
        assertTrue(recursiveEquals(term153405, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


