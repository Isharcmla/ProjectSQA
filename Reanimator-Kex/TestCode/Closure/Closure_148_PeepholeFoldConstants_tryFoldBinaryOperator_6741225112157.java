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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term588173;
     Object term588265;
     Object term588996;
     Object term588997;
     Object term588953;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term588173 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term588265 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term588351 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term588421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term588351, term588351.getClass(), "next", term588421);
        setField(term588265, term588265.getClass(), "first", term588351);
        setIntField(term588265, term588265.getClass(), "type", 19);
        term588996 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term588996, term588996.getClass(), "currentTraversal", null);
        term588997 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term588998 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term588999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term588997, term588997.getClass(), "str", null);
        setIntField(term588997, term588997.getClass(), "type", 19);
        setField(term588997, term588997.getClass(), "next", null);
        setField(term588998, term588998.getClass(), "functionName", null);
        setBooleanField(term588998, term588998.getClass(), "itsNeedsActivation", false);
        setIntField(term588998, term588998.getClass(), "itsFunctionType", 0);
        setBooleanField(term588998, term588998.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term588998, term588998.getClass(), "encodedSourceStart", 0);
        setIntField(term588998, term588998.getClass(), "encodedSourceEnd", 0);
        setField(term588998, term588998.getClass(), "sourceName", null);
        setIntField(term588998, term588998.getClass(), "baseLineno", 0);
        setIntField(term588998, term588998.getClass(), "endLineno", 0);
        setField(term588998, term588998.getClass(), "functions", null);
        setField(term588998, term588998.getClass(), "regexps", null);
        setField(term588998, term588998.getClass(), "itsVariables", null);
        setField(term588998, term588998.getClass(), "itsConst", null);
        setField(term588998, term588998.getClass(), "itsVariableNames", null);
        setIntField(term588998, term588998.getClass(), "varStart", 0);
        setField(term588998, term588998.getClass(), "compilerData", null);
        setIntField(term588998, term588998.getClass(), "type", 0);
        setIntField(term588999, term588999.getClass(), "type", 0);
        setField(term588999, term588999.getClass(), "next", null);
        setField(term588999, term588999.getClass(), "first", null);
        setField(term588999, term588999.getClass(), "last", null);
        setField(term588999, term588999.getClass(), "propListHead", null);
        setIntField(term588999, term588999.getClass(), "sourcePosition", 0);
        setField(term588999, term588999.getClass(), "jsType", null);
        setField(term588999, term588999.getClass(), "parent", null);
        setField(term588998, term588998.getClass(), "next", term588999);
        setField(term588998, term588998.getClass(), "first", null);
        setField(term588998, term588998.getClass(), "last", null);
        setField(term588998, term588998.getClass(), "propListHead", null);
        setIntField(term588998, term588998.getClass(), "sourcePosition", 0);
        setField(term588998, term588998.getClass(), "jsType", null);
        setField(term588998, term588998.getClass(), "parent", null);
        setField(term588997, term588997.getClass(), "first", term588998);
        setField(term588997, term588997.getClass(), "last", null);
        setField(term588997, term588997.getClass(), "propListHead", null);
        setIntField(term588997, term588997.getClass(), "sourcePosition", 0);
        setField(term588997, term588997.getClass(), "jsType", null);
        setField(term588997, term588997.getClass(), "parent", null);
        term588953 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term588955 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term588965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term588953, term588953.getClass(), "str", null);
        setIntField(term588953, term588953.getClass(), "type", 19);
        setField(term588953, term588953.getClass(), "next", null);
        setField(term588955, term588955.getClass(), "functionName", null);
        setBooleanField(term588955, term588955.getClass(), "itsNeedsActivation", false);
        setIntField(term588955, term588955.getClass(), "itsFunctionType", 0);
        setBooleanField(term588955, term588955.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term588955, term588955.getClass(), "encodedSourceStart", 0);
        setIntField(term588955, term588955.getClass(), "encodedSourceEnd", 0);
        setField(term588955, term588955.getClass(), "sourceName", null);
        setIntField(term588955, term588955.getClass(), "baseLineno", 0);
        setIntField(term588955, term588955.getClass(), "endLineno", 0);
        setField(term588955, term588955.getClass(), "functions", null);
        setField(term588955, term588955.getClass(), "regexps", null);
        setField(term588955, term588955.getClass(), "itsVariables", null);
        setField(term588955, term588955.getClass(), "itsConst", null);
        setField(term588955, term588955.getClass(), "itsVariableNames", null);
        setIntField(term588955, term588955.getClass(), "varStart", 0);
        setField(term588955, term588955.getClass(), "compilerData", null);
        setIntField(term588955, term588955.getClass(), "type", 0);
        setIntField(term588965, term588965.getClass(), "type", 0);
        setField(term588965, term588965.getClass(), "next", null);
        setField(term588965, term588965.getClass(), "first", null);
        setField(term588965, term588965.getClass(), "last", null);
        setField(term588965, term588965.getClass(), "propListHead", null);
        setIntField(term588965, term588965.getClass(), "sourcePosition", 0);
        setField(term588965, term588965.getClass(), "jsType", null);
        setField(term588965, term588965.getClass(), "parent", null);
        setField(term588955, term588955.getClass(), "next", term588965);
        setField(term588955, term588955.getClass(), "first", null);
        setField(term588955, term588955.getClass(), "last", null);
        setField(term588955, term588955.getClass(), "propListHead", null);
        setIntField(term588955, term588955.getClass(), "sourcePosition", 0);
        setField(term588955, term588955.getClass(), "jsType", null);
        setField(term588955, term588955.getClass(), "parent", null);
        setField(term588953, term588953.getClass(), "first", term588955);
        setField(term588953, term588953.getClass(), "last", null);
        setField(term588953, term588953.getClass(), "propListHead", null);
        setIntField(term588953, term588953.getClass(), "sourcePosition", 0);
        setField(term588953, term588953.getClass(), "jsType", null);
        setField(term588953, term588953.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term588265;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term588173, args);
        assertTrue(recursiveEquals(term588173, term588996));
        assertTrue(recursiveEquals(term588265, term588997));
        assertTrue(recursiveEquals(retValue, term588953));
    }

};


