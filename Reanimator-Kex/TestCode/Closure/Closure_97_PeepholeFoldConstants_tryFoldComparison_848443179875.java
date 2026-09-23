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

public class PeepholeFoldConstants_tryFoldComparison_848443179875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248143;
     Object term248229;
     Object term248315;
     Object term248407;
     Object term248795;
     Object term248796;
     Object term248797;
     Object term248798;
     Object term248766;

    public PeepholeFoldConstants_tryFoldComparison_848443179875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248143 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term248229 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term248229, term248229.getClass(), "type", 14);
        term248315 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term248315, term248315.getClass(), "type", 14);
        term248407 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term248795 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term248795, term248795.getClass(), "currentTraversal", null);
        term248796 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term248796, term248796.getClass(), "functionName", null);
        setBooleanField(term248796, term248796.getClass(), "itsNeedsActivation", false);
        setIntField(term248796, term248796.getClass(), "itsFunctionType", 0);
        setBooleanField(term248796, term248796.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term248796, term248796.getClass(), "encodedSourceStart", 0);
        setIntField(term248796, term248796.getClass(), "encodedSourceEnd", 0);
        setField(term248796, term248796.getClass(), "sourceName", null);
        setIntField(term248796, term248796.getClass(), "baseLineno", 0);
        setIntField(term248796, term248796.getClass(), "endLineno", 0);
        setField(term248796, term248796.getClass(), "functions", null);
        setField(term248796, term248796.getClass(), "regexps", null);
        setField(term248796, term248796.getClass(), "itsVariables", null);
        setField(term248796, term248796.getClass(), "itsConst", null);
        setField(term248796, term248796.getClass(), "itsVariableNames", null);
        setIntField(term248796, term248796.getClass(), "varStart", 0);
        setField(term248796, term248796.getClass(), "compilerData", null);
        setIntField(term248796, term248796.getClass(), "type", 14);
        setField(term248796, term248796.getClass(), "next", null);
        setField(term248796, term248796.getClass(), "first", null);
        setField(term248796, term248796.getClass(), "last", null);
        setField(term248796, term248796.getClass(), "propListHead", null);
        setIntField(term248796, term248796.getClass(), "sourcePosition", 0);
        setField(term248796, term248796.getClass(), "jsType", null);
        setField(term248796, term248796.getClass(), "parent", null);
        term248797 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term248797, term248797.getClass(), "functionName", null);
        setBooleanField(term248797, term248797.getClass(), "itsNeedsActivation", false);
        setIntField(term248797, term248797.getClass(), "itsFunctionType", 0);
        setBooleanField(term248797, term248797.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term248797, term248797.getClass(), "encodedSourceStart", 0);
        setIntField(term248797, term248797.getClass(), "encodedSourceEnd", 0);
        setField(term248797, term248797.getClass(), "sourceName", null);
        setIntField(term248797, term248797.getClass(), "baseLineno", 0);
        setIntField(term248797, term248797.getClass(), "endLineno", 0);
        setField(term248797, term248797.getClass(), "functions", null);
        setField(term248797, term248797.getClass(), "regexps", null);
        setField(term248797, term248797.getClass(), "itsVariables", null);
        setField(term248797, term248797.getClass(), "itsConst", null);
        setField(term248797, term248797.getClass(), "itsVariableNames", null);
        setIntField(term248797, term248797.getClass(), "varStart", 0);
        setField(term248797, term248797.getClass(), "compilerData", null);
        setIntField(term248797, term248797.getClass(), "type", 14);
        setField(term248797, term248797.getClass(), "next", null);
        setField(term248797, term248797.getClass(), "first", null);
        setField(term248797, term248797.getClass(), "last", null);
        setField(term248797, term248797.getClass(), "propListHead", null);
        setIntField(term248797, term248797.getClass(), "sourcePosition", 0);
        setField(term248797, term248797.getClass(), "jsType", null);
        setField(term248797, term248797.getClass(), "parent", null);
        term248798 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term248798, term248798.getClass(), "number", 0.0);
        setIntField(term248798, term248798.getClass(), "type", 0);
        setField(term248798, term248798.getClass(), "next", null);
        setField(term248798, term248798.getClass(), "first", null);
        setField(term248798, term248798.getClass(), "last", null);
        setField(term248798, term248798.getClass(), "propListHead", null);
        setIntField(term248798, term248798.getClass(), "sourcePosition", 0);
        setField(term248798, term248798.getClass(), "jsType", null);
        setField(term248798, term248798.getClass(), "parent", null);
        term248766 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term248766, term248766.getClass(), "functionName", null);
        setBooleanField(term248766, term248766.getClass(), "itsNeedsActivation", false);
        setIntField(term248766, term248766.getClass(), "itsFunctionType", 0);
        setBooleanField(term248766, term248766.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term248766, term248766.getClass(), "encodedSourceStart", 0);
        setIntField(term248766, term248766.getClass(), "encodedSourceEnd", 0);
        setField(term248766, term248766.getClass(), "sourceName", null);
        setIntField(term248766, term248766.getClass(), "baseLineno", 0);
        setIntField(term248766, term248766.getClass(), "endLineno", 0);
        setField(term248766, term248766.getClass(), "functions", null);
        setField(term248766, term248766.getClass(), "regexps", null);
        setField(term248766, term248766.getClass(), "itsVariables", null);
        setField(term248766, term248766.getClass(), "itsConst", null);
        setField(term248766, term248766.getClass(), "itsVariableNames", null);
        setIntField(term248766, term248766.getClass(), "varStart", 0);
        setField(term248766, term248766.getClass(), "compilerData", null);
        setIntField(term248766, term248766.getClass(), "type", 14);
        setField(term248766, term248766.getClass(), "next", null);
        setField(term248766, term248766.getClass(), "first", null);
        setField(term248766, term248766.getClass(), "last", null);
        setField(term248766, term248766.getClass(), "propListHead", null);
        setIntField(term248766, term248766.getClass(), "sourcePosition", 0);
        setField(term248766, term248766.getClass(), "jsType", null);
        setField(term248766, term248766.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term248229;
        args[1] = term248315;
        args[2] = term248407;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term248143, args);
        assertTrue(recursiveEquals(term248143, term248795));
        assertTrue(recursiveEquals(term248229, term248796));
        assertTrue(recursiveEquals(term248315, term248797));
        assertTrue(recursiveEquals(term248407, term248798));
        assertTrue(recursiveEquals(retValue, term248766));
    }

};


