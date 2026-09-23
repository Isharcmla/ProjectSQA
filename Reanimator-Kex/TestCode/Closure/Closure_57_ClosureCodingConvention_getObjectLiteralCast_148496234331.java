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

public class ClosureCodingConvention_getObjectLiteralCast_148496234331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129468;
     Object term129554;
     Object term129694;
     Object term129695;

    public ClosureCodingConvention_getObjectLiteralCast_148496234331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129468 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term129554 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term129640 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term129554, term129554.getClass(), "type", 37);
        setField(term129554, term129554.getClass(), "first", term129640);
        term129694 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term129694, term129694.getClass(), "propertyTestFunctions", null);
        term129695 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term129696 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term129695, term129695.getClass(), "functionName", null);
        setBooleanField(term129695, term129695.getClass(), "itsNeedsActivation", false);
        setIntField(term129695, term129695.getClass(), "itsFunctionType", 0);
        setBooleanField(term129695, term129695.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term129695, term129695.getClass(), "encodedSourceStart", 0);
        setIntField(term129695, term129695.getClass(), "encodedSourceEnd", 0);
        setField(term129695, term129695.getClass(), "sourceName", null);
        setIntField(term129695, term129695.getClass(), "baseLineno", 0);
        setIntField(term129695, term129695.getClass(), "endLineno", 0);
        setField(term129695, term129695.getClass(), "functions", null);
        setField(term129695, term129695.getClass(), "regexps", null);
        setField(term129695, term129695.getClass(), "itsVariables", null);
        setField(term129695, term129695.getClass(), "itsConst", null);
        setField(term129695, term129695.getClass(), "itsVariableNames", null);
        setIntField(term129695, term129695.getClass(), "varStart", 0);
        setField(term129695, term129695.getClass(), "compilerData", null);
        setIntField(term129695, term129695.getClass(), "type", 37);
        setField(term129695, term129695.getClass(), "next", null);
        setField(term129696, term129696.getClass(), "functionName", null);
        setBooleanField(term129696, term129696.getClass(), "itsNeedsActivation", false);
        setIntField(term129696, term129696.getClass(), "itsFunctionType", 0);
        setBooleanField(term129696, term129696.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term129696, term129696.getClass(), "encodedSourceStart", 0);
        setIntField(term129696, term129696.getClass(), "encodedSourceEnd", 0);
        setField(term129696, term129696.getClass(), "sourceName", null);
        setIntField(term129696, term129696.getClass(), "baseLineno", 0);
        setIntField(term129696, term129696.getClass(), "endLineno", 0);
        setField(term129696, term129696.getClass(), "functions", null);
        setField(term129696, term129696.getClass(), "regexps", null);
        setField(term129696, term129696.getClass(), "itsVariables", null);
        setField(term129696, term129696.getClass(), "itsConst", null);
        setField(term129696, term129696.getClass(), "itsVariableNames", null);
        setIntField(term129696, term129696.getClass(), "varStart", 0);
        setField(term129696, term129696.getClass(), "compilerData", null);
        setIntField(term129696, term129696.getClass(), "type", 0);
        setField(term129696, term129696.getClass(), "next", null);
        setField(term129696, term129696.getClass(), "first", null);
        setField(term129696, term129696.getClass(), "last", null);
        setField(term129696, term129696.getClass(), "propListHead", null);
        setIntField(term129696, term129696.getClass(), "sourcePosition", 0);
        setField(term129696, term129696.getClass(), "jsType", null);
        setField(term129696, term129696.getClass(), "parent", null);
        setField(term129695, term129695.getClass(), "first", term129696);
        setField(term129695, term129695.getClass(), "last", null);
        setField(term129695, term129695.getClass(), "propListHead", null);
        setIntField(term129695, term129695.getClass(), "sourcePosition", 0);
        setField(term129695, term129695.getClass(), "jsType", null);
        setField(term129695, term129695.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term129554;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term129468, args);
        assertTrue(recursiveEquals(term129468, term129694));
        assertTrue(recursiveEquals(term129554, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


