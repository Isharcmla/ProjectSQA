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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term907679;
     Object term907771;
     Object term908996;
     Object term908997;
     Object term908949;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term907679 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term907771 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term907857 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term907927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term907857, term907857.getClass(), "next", term907927);
        setIntField(term907857, term907857.getClass(), "type", 39);
        setField(term907771, term907771.getClass(), "first", term907857);
        setIntField(term907771, term907771.getClass(), "type", 24);
        term908996 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term908996, term908996.getClass(), "currentTraversal", null);
        term908997 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term908998 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term908999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term908997, term908997.getClass(), "number", 0.0);
        setIntField(term908997, term908997.getClass(), "type", 24);
        setField(term908997, term908997.getClass(), "next", null);
        setField(term908998, term908998.getClass(), "functionName", null);
        setBooleanField(term908998, term908998.getClass(), "itsNeedsActivation", false);
        setIntField(term908998, term908998.getClass(), "itsFunctionType", 0);
        setBooleanField(term908998, term908998.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term908998, term908998.getClass(), "encodedSourceStart", 0);
        setIntField(term908998, term908998.getClass(), "encodedSourceEnd", 0);
        setField(term908998, term908998.getClass(), "sourceName", null);
        setIntField(term908998, term908998.getClass(), "baseLineno", 0);
        setIntField(term908998, term908998.getClass(), "endLineno", 0);
        setField(term908998, term908998.getClass(), "functions", null);
        setField(term908998, term908998.getClass(), "regexps", null);
        setField(term908998, term908998.getClass(), "itsVariables", null);
        setField(term908998, term908998.getClass(), "itsConst", null);
        setField(term908998, term908998.getClass(), "itsVariableNames", null);
        setIntField(term908998, term908998.getClass(), "varStart", 0);
        setField(term908998, term908998.getClass(), "compilerData", null);
        setIntField(term908998, term908998.getClass(), "type", 39);
        setIntField(term908999, term908999.getClass(), "type", 0);
        setField(term908999, term908999.getClass(), "next", null);
        setField(term908999, term908999.getClass(), "first", null);
        setField(term908999, term908999.getClass(), "last", null);
        setField(term908999, term908999.getClass(), "propListHead", null);
        setIntField(term908999, term908999.getClass(), "sourcePosition", 0);
        setField(term908999, term908999.getClass(), "jsType", null);
        setField(term908999, term908999.getClass(), "parent", null);
        setField(term908998, term908998.getClass(), "next", term908999);
        setField(term908998, term908998.getClass(), "first", null);
        setField(term908998, term908998.getClass(), "last", null);
        setField(term908998, term908998.getClass(), "propListHead", null);
        setIntField(term908998, term908998.getClass(), "sourcePosition", 0);
        setField(term908998, term908998.getClass(), "jsType", null);
        setField(term908998, term908998.getClass(), "parent", null);
        setField(term908997, term908997.getClass(), "first", term908998);
        setField(term908997, term908997.getClass(), "last", null);
        setField(term908997, term908997.getClass(), "propListHead", null);
        setIntField(term908997, term908997.getClass(), "sourcePosition", 0);
        setField(term908997, term908997.getClass(), "jsType", null);
        setField(term908997, term908997.getClass(), "parent", null);
        term908949 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term908952 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term908962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term908949, term908949.getClass(), "number", 0.0);
        setIntField(term908949, term908949.getClass(), "type", 24);
        setField(term908949, term908949.getClass(), "next", null);
        setField(term908952, term908952.getClass(), "functionName", null);
        setBooleanField(term908952, term908952.getClass(), "itsNeedsActivation", false);
        setIntField(term908952, term908952.getClass(), "itsFunctionType", 0);
        setBooleanField(term908952, term908952.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term908952, term908952.getClass(), "encodedSourceStart", 0);
        setIntField(term908952, term908952.getClass(), "encodedSourceEnd", 0);
        setField(term908952, term908952.getClass(), "sourceName", null);
        setIntField(term908952, term908952.getClass(), "baseLineno", 0);
        setIntField(term908952, term908952.getClass(), "endLineno", 0);
        setField(term908952, term908952.getClass(), "functions", null);
        setField(term908952, term908952.getClass(), "regexps", null);
        setField(term908952, term908952.getClass(), "itsVariables", null);
        setField(term908952, term908952.getClass(), "itsConst", null);
        setField(term908952, term908952.getClass(), "itsVariableNames", null);
        setIntField(term908952, term908952.getClass(), "varStart", 0);
        setField(term908952, term908952.getClass(), "compilerData", null);
        setIntField(term908952, term908952.getClass(), "type", 39);
        setIntField(term908962, term908962.getClass(), "type", 0);
        setField(term908962, term908962.getClass(), "next", null);
        setField(term908962, term908962.getClass(), "first", null);
        setField(term908962, term908962.getClass(), "last", null);
        setField(term908962, term908962.getClass(), "propListHead", null);
        setIntField(term908962, term908962.getClass(), "sourcePosition", 0);
        setField(term908962, term908962.getClass(), "jsType", null);
        setField(term908962, term908962.getClass(), "parent", null);
        setField(term908952, term908952.getClass(), "next", term908962);
        setField(term908952, term908952.getClass(), "first", null);
        setField(term908952, term908952.getClass(), "last", null);
        setField(term908952, term908952.getClass(), "propListHead", null);
        setIntField(term908952, term908952.getClass(), "sourcePosition", 0);
        setField(term908952, term908952.getClass(), "jsType", null);
        setField(term908952, term908952.getClass(), "parent", null);
        setField(term908949, term908949.getClass(), "first", term908952);
        setField(term908949, term908949.getClass(), "last", null);
        setField(term908949, term908949.getClass(), "propListHead", null);
        setIntField(term908949, term908949.getClass(), "sourcePosition", 0);
        setField(term908949, term908949.getClass(), "jsType", null);
        setField(term908949, term908949.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term907771;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term907679, args);
        assertTrue(recursiveEquals(term907679, term908996));
        assertTrue(recursiveEquals(term907771, term908997));
        assertTrue(recursiveEquals(retValue, term908949));
    }

};


