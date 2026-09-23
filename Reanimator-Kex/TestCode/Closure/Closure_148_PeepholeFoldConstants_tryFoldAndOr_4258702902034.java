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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546525;
     Object term546611;
     Object term546789;
     Object term546881;
     Object term547047;
     Object term547048;
     Object term547050;
     Object term547051;
     Object term546952;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term546525 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term546611 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term546697 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term546697, term546697.getClass(), "type", 114);
        setField(term546611, term546611.getClass(), "parent", term546697);
        setIntField(term546611, term546611.getClass(), "type", 0);
        term546789 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term546789, term546789.getClass(), "type", 60);
        term546881 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term546881, term546881.getClass(), "type", 63);
        term547047 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term547047, term547047.getClass(), "currentTraversal", null);
        term547048 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term547049 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term547048, term547048.getClass(), "functionName", null);
        setBooleanField(term547048, term547048.getClass(), "itsNeedsActivation", false);
        setIntField(term547048, term547048.getClass(), "itsFunctionType", 0);
        setBooleanField(term547048, term547048.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term547048, term547048.getClass(), "encodedSourceStart", 0);
        setIntField(term547048, term547048.getClass(), "encodedSourceEnd", 0);
        setField(term547048, term547048.getClass(), "sourceName", null);
        setIntField(term547048, term547048.getClass(), "baseLineno", 0);
        setIntField(term547048, term547048.getClass(), "endLineno", 0);
        setField(term547048, term547048.getClass(), "functions", null);
        setField(term547048, term547048.getClass(), "regexps", null);
        setField(term547048, term547048.getClass(), "itsVariables", null);
        setField(term547048, term547048.getClass(), "itsConst", null);
        setField(term547048, term547048.getClass(), "itsVariableNames", null);
        setIntField(term547048, term547048.getClass(), "varStart", 0);
        setField(term547048, term547048.getClass(), "compilerData", null);
        setIntField(term547048, term547048.getClass(), "type", 0);
        setField(term547048, term547048.getClass(), "next", null);
        setField(term547048, term547048.getClass(), "first", null);
        setField(term547048, term547048.getClass(), "last", null);
        setField(term547048, term547048.getClass(), "propListHead", null);
        setIntField(term547048, term547048.getClass(), "sourcePosition", 0);
        setField(term547048, term547048.getClass(), "jsType", null);
        setField(term547049, term547049.getClass(), "functionName", null);
        setBooleanField(term547049, term547049.getClass(), "itsNeedsActivation", false);
        setIntField(term547049, term547049.getClass(), "itsFunctionType", 0);
        setBooleanField(term547049, term547049.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term547049, term547049.getClass(), "encodedSourceStart", 0);
        setIntField(term547049, term547049.getClass(), "encodedSourceEnd", 0);
        setField(term547049, term547049.getClass(), "sourceName", null);
        setIntField(term547049, term547049.getClass(), "baseLineno", 0);
        setIntField(term547049, term547049.getClass(), "endLineno", 0);
        setField(term547049, term547049.getClass(), "functions", null);
        setField(term547049, term547049.getClass(), "regexps", null);
        setField(term547049, term547049.getClass(), "itsVariables", null);
        setField(term547049, term547049.getClass(), "itsConst", null);
        setField(term547049, term547049.getClass(), "itsVariableNames", null);
        setIntField(term547049, term547049.getClass(), "varStart", 0);
        setField(term547049, term547049.getClass(), "compilerData", null);
        setIntField(term547049, term547049.getClass(), "type", 114);
        setField(term547049, term547049.getClass(), "next", null);
        setField(term547049, term547049.getClass(), "first", null);
        setField(term547049, term547049.getClass(), "last", null);
        setField(term547049, term547049.getClass(), "propListHead", null);
        setIntField(term547049, term547049.getClass(), "sourcePosition", 0);
        setField(term547049, term547049.getClass(), "jsType", null);
        setField(term547049, term547049.getClass(), "parent", null);
        setField(term547048, term547048.getClass(), "parent", term547049);
        term547050 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term547050, term547050.getClass(), "number", 0.0);
        setIntField(term547050, term547050.getClass(), "type", 60);
        setField(term547050, term547050.getClass(), "next", null);
        setField(term547050, term547050.getClass(), "first", null);
        setField(term547050, term547050.getClass(), "last", null);
        setField(term547050, term547050.getClass(), "propListHead", null);
        setIntField(term547050, term547050.getClass(), "sourcePosition", 0);
        setField(term547050, term547050.getClass(), "jsType", null);
        setField(term547050, term547050.getClass(), "parent", null);
        term547051 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term547051, term547051.getClass(), "number", 0.0);
        setIntField(term547051, term547051.getClass(), "type", 63);
        setField(term547051, term547051.getClass(), "next", null);
        setField(term547051, term547051.getClass(), "first", null);
        setField(term547051, term547051.getClass(), "last", null);
        setField(term547051, term547051.getClass(), "propListHead", null);
        setIntField(term547051, term547051.getClass(), "sourcePosition", 0);
        setField(term547051, term547051.getClass(), "jsType", null);
        setField(term547051, term547051.getClass(), "parent", null);
        term546952 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term546963 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term546952, term546952.getClass(), "functionName", null);
        setBooleanField(term546952, term546952.getClass(), "itsNeedsActivation", false);
        setIntField(term546952, term546952.getClass(), "itsFunctionType", 0);
        setBooleanField(term546952, term546952.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term546952, term546952.getClass(), "encodedSourceStart", 0);
        setIntField(term546952, term546952.getClass(), "encodedSourceEnd", 0);
        setField(term546952, term546952.getClass(), "sourceName", null);
        setIntField(term546952, term546952.getClass(), "baseLineno", 0);
        setIntField(term546952, term546952.getClass(), "endLineno", 0);
        setField(term546952, term546952.getClass(), "functions", null);
        setField(term546952, term546952.getClass(), "regexps", null);
        setField(term546952, term546952.getClass(), "itsVariables", null);
        setField(term546952, term546952.getClass(), "itsConst", null);
        setField(term546952, term546952.getClass(), "itsVariableNames", null);
        setIntField(term546952, term546952.getClass(), "varStart", 0);
        setField(term546952, term546952.getClass(), "compilerData", null);
        setIntField(term546952, term546952.getClass(), "type", 0);
        setField(term546952, term546952.getClass(), "next", null);
        setField(term546952, term546952.getClass(), "first", null);
        setField(term546952, term546952.getClass(), "last", null);
        setField(term546952, term546952.getClass(), "propListHead", null);
        setIntField(term546952, term546952.getClass(), "sourcePosition", 0);
        setField(term546952, term546952.getClass(), "jsType", null);
        setField(term546963, term546963.getClass(), "functionName", null);
        setBooleanField(term546963, term546963.getClass(), "itsNeedsActivation", false);
        setIntField(term546963, term546963.getClass(), "itsFunctionType", 0);
        setBooleanField(term546963, term546963.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term546963, term546963.getClass(), "encodedSourceStart", 0);
        setIntField(term546963, term546963.getClass(), "encodedSourceEnd", 0);
        setField(term546963, term546963.getClass(), "sourceName", null);
        setIntField(term546963, term546963.getClass(), "baseLineno", 0);
        setIntField(term546963, term546963.getClass(), "endLineno", 0);
        setField(term546963, term546963.getClass(), "functions", null);
        setField(term546963, term546963.getClass(), "regexps", null);
        setField(term546963, term546963.getClass(), "itsVariables", null);
        setField(term546963, term546963.getClass(), "itsConst", null);
        setField(term546963, term546963.getClass(), "itsVariableNames", null);
        setIntField(term546963, term546963.getClass(), "varStart", 0);
        setField(term546963, term546963.getClass(), "compilerData", null);
        setIntField(term546963, term546963.getClass(), "type", 114);
        setField(term546963, term546963.getClass(), "next", null);
        setField(term546963, term546963.getClass(), "first", null);
        setField(term546963, term546963.getClass(), "last", null);
        setField(term546963, term546963.getClass(), "propListHead", null);
        setIntField(term546963, term546963.getClass(), "sourcePosition", 0);
        setField(term546963, term546963.getClass(), "jsType", null);
        setField(term546963, term546963.getClass(), "parent", null);
        setField(term546952, term546952.getClass(), "parent", term546963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term546611;
        args[1] = term546789;
        args[2] = term546881;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term546525, args);
        assertTrue(recursiveEquals(term546525, term547047));
        assertTrue(recursiveEquals(term546611, term547048));
        assertTrue(recursiveEquals(term546789, term547050));
        assertTrue(recursiveEquals(term546881, term547051));
        assertTrue(recursiveEquals(retValue, term546952));
    }

};


