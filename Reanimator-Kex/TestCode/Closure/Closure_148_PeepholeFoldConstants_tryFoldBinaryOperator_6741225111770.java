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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460120;
     Object term460206;
     Object term460587;
     Object term460588;
     Object term460490;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term460120 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term460206 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term460292 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term460384 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term460384, term460384.getClass(), "type", 40);
        setField(term460384, term460384.getClass(), "str", "length");
        setField(term460292, term460292.getClass(), "next", term460384);
        setField(term460206, term460206.getClass(), "first", term460292);
        setIntField(term460206, term460206.getClass(), "type", 33);
        term460587 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term460587, term460587.getClass(), "currentTraversal", null);
        term460588 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term460589 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term460590 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term460588, term460588.getClass(), "functionName", null);
        setBooleanField(term460588, term460588.getClass(), "itsNeedsActivation", false);
        setIntField(term460588, term460588.getClass(), "itsFunctionType", 0);
        setBooleanField(term460588, term460588.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term460588, term460588.getClass(), "encodedSourceStart", 0);
        setIntField(term460588, term460588.getClass(), "encodedSourceEnd", 0);
        setField(term460588, term460588.getClass(), "sourceName", null);
        setIntField(term460588, term460588.getClass(), "baseLineno", 0);
        setIntField(term460588, term460588.getClass(), "endLineno", 0);
        setField(term460588, term460588.getClass(), "functions", null);
        setField(term460588, term460588.getClass(), "regexps", null);
        setField(term460588, term460588.getClass(), "itsVariables", null);
        setField(term460588, term460588.getClass(), "itsConst", null);
        setField(term460588, term460588.getClass(), "itsVariableNames", null);
        setIntField(term460588, term460588.getClass(), "varStart", 0);
        setField(term460588, term460588.getClass(), "compilerData", null);
        setIntField(term460588, term460588.getClass(), "type", 33);
        setField(term460588, term460588.getClass(), "next", null);
        setField(term460589, term460589.getClass(), "functionName", null);
        setBooleanField(term460589, term460589.getClass(), "itsNeedsActivation", false);
        setIntField(term460589, term460589.getClass(), "itsFunctionType", 0);
        setBooleanField(term460589, term460589.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term460589, term460589.getClass(), "encodedSourceStart", 0);
        setIntField(term460589, term460589.getClass(), "encodedSourceEnd", 0);
        setField(term460589, term460589.getClass(), "sourceName", null);
        setIntField(term460589, term460589.getClass(), "baseLineno", 0);
        setIntField(term460589, term460589.getClass(), "endLineno", 0);
        setField(term460589, term460589.getClass(), "functions", null);
        setField(term460589, term460589.getClass(), "regexps", null);
        setField(term460589, term460589.getClass(), "itsVariables", null);
        setField(term460589, term460589.getClass(), "itsConst", null);
        setField(term460589, term460589.getClass(), "itsVariableNames", null);
        setIntField(term460589, term460589.getClass(), "varStart", 0);
        setField(term460589, term460589.getClass(), "compilerData", null);
        setIntField(term460589, term460589.getClass(), "type", 0);
        setField(term460590, term460590.getClass(), "str", "length");
        setIntField(term460590, term460590.getClass(), "type", 40);
        setField(term460590, term460590.getClass(), "next", null);
        setField(term460590, term460590.getClass(), "first", null);
        setField(term460590, term460590.getClass(), "last", null);
        setField(term460590, term460590.getClass(), "propListHead", null);
        setIntField(term460590, term460590.getClass(), "sourcePosition", 0);
        setField(term460590, term460590.getClass(), "jsType", null);
        setField(term460590, term460590.getClass(), "parent", null);
        setField(term460589, term460589.getClass(), "next", term460590);
        setField(term460589, term460589.getClass(), "first", null);
        setField(term460589, term460589.getClass(), "last", null);
        setField(term460589, term460589.getClass(), "propListHead", null);
        setIntField(term460589, term460589.getClass(), "sourcePosition", 0);
        setField(term460589, term460589.getClass(), "jsType", null);
        setField(term460589, term460589.getClass(), "parent", null);
        setField(term460588, term460588.getClass(), "first", term460589);
        setField(term460588, term460588.getClass(), "last", null);
        setField(term460588, term460588.getClass(), "propListHead", null);
        setIntField(term460588, term460588.getClass(), "sourcePosition", 0);
        setField(term460588, term460588.getClass(), "jsType", null);
        setField(term460588, term460588.getClass(), "parent", null);
        term460490 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term460500 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term460510 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term460490, term460490.getClass(), "functionName", null);
        setBooleanField(term460490, term460490.getClass(), "itsNeedsActivation", false);
        setIntField(term460490, term460490.getClass(), "itsFunctionType", 0);
        setBooleanField(term460490, term460490.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term460490, term460490.getClass(), "encodedSourceStart", 0);
        setIntField(term460490, term460490.getClass(), "encodedSourceEnd", 0);
        setField(term460490, term460490.getClass(), "sourceName", null);
        setIntField(term460490, term460490.getClass(), "baseLineno", 0);
        setIntField(term460490, term460490.getClass(), "endLineno", 0);
        setField(term460490, term460490.getClass(), "functions", null);
        setField(term460490, term460490.getClass(), "regexps", null);
        setField(term460490, term460490.getClass(), "itsVariables", null);
        setField(term460490, term460490.getClass(), "itsConst", null);
        setField(term460490, term460490.getClass(), "itsVariableNames", null);
        setIntField(term460490, term460490.getClass(), "varStart", 0);
        setField(term460490, term460490.getClass(), "compilerData", null);
        setIntField(term460490, term460490.getClass(), "type", 33);
        setField(term460490, term460490.getClass(), "next", null);
        setField(term460500, term460500.getClass(), "functionName", null);
        setBooleanField(term460500, term460500.getClass(), "itsNeedsActivation", false);
        setIntField(term460500, term460500.getClass(), "itsFunctionType", 0);
        setBooleanField(term460500, term460500.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term460500, term460500.getClass(), "encodedSourceStart", 0);
        setIntField(term460500, term460500.getClass(), "encodedSourceEnd", 0);
        setField(term460500, term460500.getClass(), "sourceName", null);
        setIntField(term460500, term460500.getClass(), "baseLineno", 0);
        setIntField(term460500, term460500.getClass(), "endLineno", 0);
        setField(term460500, term460500.getClass(), "functions", null);
        setField(term460500, term460500.getClass(), "regexps", null);
        setField(term460500, term460500.getClass(), "itsVariables", null);
        setField(term460500, term460500.getClass(), "itsConst", null);
        setField(term460500, term460500.getClass(), "itsVariableNames", null);
        setIntField(term460500, term460500.getClass(), "varStart", 0);
        setField(term460500, term460500.getClass(), "compilerData", null);
        setIntField(term460500, term460500.getClass(), "type", 0);
        setField(term460510, term460510.getClass(), "str", "length");
        setIntField(term460510, term460510.getClass(), "type", 40);
        setField(term460510, term460510.getClass(), "next", null);
        setField(term460510, term460510.getClass(), "first", null);
        setField(term460510, term460510.getClass(), "last", null);
        setField(term460510, term460510.getClass(), "propListHead", null);
        setIntField(term460510, term460510.getClass(), "sourcePosition", 0);
        setField(term460510, term460510.getClass(), "jsType", null);
        setField(term460510, term460510.getClass(), "parent", null);
        setField(term460500, term460500.getClass(), "next", term460510);
        setField(term460500, term460500.getClass(), "first", null);
        setField(term460500, term460500.getClass(), "last", null);
        setField(term460500, term460500.getClass(), "propListHead", null);
        setIntField(term460500, term460500.getClass(), "sourcePosition", 0);
        setField(term460500, term460500.getClass(), "jsType", null);
        setField(term460500, term460500.getClass(), "parent", null);
        setField(term460490, term460490.getClass(), "first", term460500);
        setField(term460490, term460490.getClass(), "last", null);
        setField(term460490, term460490.getClass(), "propListHead", null);
        setIntField(term460490, term460490.getClass(), "sourcePosition", 0);
        setField(term460490, term460490.getClass(), "jsType", null);
        setField(term460490, term460490.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term460206;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term460120, args);
        assertTrue(recursiveEquals(term460120, term460587));
        assertTrue(recursiveEquals(term460206, term460588));
        assertTrue(recursiveEquals(retValue, term460490));
    }

};


