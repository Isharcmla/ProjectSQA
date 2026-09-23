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

public class PeepholeFoldConstants_tryFoldComparison_848443179678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175313;
     Object term175399;
     Object term175485;
     Object term175571;
     Object term175625;
     Object term175626;
     Object term175627;
     Object term175628;
     Object term175589;

    public PeepholeFoldConstants_tryFoldComparison_848443179678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175313 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term175399 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term175399, term175399.getClass(), "type", 14);
        term175485 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term175485, term175485.getClass(), "type", 14);
        term175571 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term175625 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term175625, term175625.getClass(), "currentTraversal", null);
        term175626 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term175626, term175626.getClass(), "functionName", null);
        setBooleanField(term175626, term175626.getClass(), "itsNeedsActivation", false);
        setIntField(term175626, term175626.getClass(), "itsFunctionType", 0);
        setBooleanField(term175626, term175626.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term175626, term175626.getClass(), "encodedSourceStart", 0);
        setIntField(term175626, term175626.getClass(), "encodedSourceEnd", 0);
        setField(term175626, term175626.getClass(), "sourceName", null);
        setIntField(term175626, term175626.getClass(), "baseLineno", 0);
        setIntField(term175626, term175626.getClass(), "endLineno", 0);
        setField(term175626, term175626.getClass(), "functions", null);
        setField(term175626, term175626.getClass(), "regexps", null);
        setField(term175626, term175626.getClass(), "itsVariables", null);
        setField(term175626, term175626.getClass(), "itsConst", null);
        setField(term175626, term175626.getClass(), "itsVariableNames", null);
        setIntField(term175626, term175626.getClass(), "varStart", 0);
        setField(term175626, term175626.getClass(), "compilerData", null);
        setIntField(term175626, term175626.getClass(), "type", 14);
        setField(term175626, term175626.getClass(), "next", null);
        setField(term175626, term175626.getClass(), "first", null);
        setField(term175626, term175626.getClass(), "last", null);
        setField(term175626, term175626.getClass(), "propListHead", null);
        setIntField(term175626, term175626.getClass(), "sourcePosition", 0);
        setField(term175626, term175626.getClass(), "jsType", null);
        setField(term175626, term175626.getClass(), "parent", null);
        term175627 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term175627, term175627.getClass(), "functionName", null);
        setBooleanField(term175627, term175627.getClass(), "itsNeedsActivation", false);
        setIntField(term175627, term175627.getClass(), "itsFunctionType", 0);
        setBooleanField(term175627, term175627.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term175627, term175627.getClass(), "encodedSourceStart", 0);
        setIntField(term175627, term175627.getClass(), "encodedSourceEnd", 0);
        setField(term175627, term175627.getClass(), "sourceName", null);
        setIntField(term175627, term175627.getClass(), "baseLineno", 0);
        setIntField(term175627, term175627.getClass(), "endLineno", 0);
        setField(term175627, term175627.getClass(), "functions", null);
        setField(term175627, term175627.getClass(), "regexps", null);
        setField(term175627, term175627.getClass(), "itsVariables", null);
        setField(term175627, term175627.getClass(), "itsConst", null);
        setField(term175627, term175627.getClass(), "itsVariableNames", null);
        setIntField(term175627, term175627.getClass(), "varStart", 0);
        setField(term175627, term175627.getClass(), "compilerData", null);
        setIntField(term175627, term175627.getClass(), "type", 14);
        setField(term175627, term175627.getClass(), "next", null);
        setField(term175627, term175627.getClass(), "first", null);
        setField(term175627, term175627.getClass(), "last", null);
        setField(term175627, term175627.getClass(), "propListHead", null);
        setIntField(term175627, term175627.getClass(), "sourcePosition", 0);
        setField(term175627, term175627.getClass(), "jsType", null);
        setField(term175627, term175627.getClass(), "parent", null);
        term175628 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term175628, term175628.getClass(), "functionName", null);
        setBooleanField(term175628, term175628.getClass(), "itsNeedsActivation", false);
        setIntField(term175628, term175628.getClass(), "itsFunctionType", 0);
        setBooleanField(term175628, term175628.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term175628, term175628.getClass(), "encodedSourceStart", 0);
        setIntField(term175628, term175628.getClass(), "encodedSourceEnd", 0);
        setField(term175628, term175628.getClass(), "sourceName", null);
        setIntField(term175628, term175628.getClass(), "baseLineno", 0);
        setIntField(term175628, term175628.getClass(), "endLineno", 0);
        setField(term175628, term175628.getClass(), "functions", null);
        setField(term175628, term175628.getClass(), "regexps", null);
        setField(term175628, term175628.getClass(), "itsVariables", null);
        setField(term175628, term175628.getClass(), "itsConst", null);
        setField(term175628, term175628.getClass(), "itsVariableNames", null);
        setIntField(term175628, term175628.getClass(), "varStart", 0);
        setField(term175628, term175628.getClass(), "compilerData", null);
        setIntField(term175628, term175628.getClass(), "type", 0);
        setField(term175628, term175628.getClass(), "next", null);
        setField(term175628, term175628.getClass(), "first", null);
        setField(term175628, term175628.getClass(), "last", null);
        setField(term175628, term175628.getClass(), "propListHead", null);
        setIntField(term175628, term175628.getClass(), "sourcePosition", 0);
        setField(term175628, term175628.getClass(), "jsType", null);
        setField(term175628, term175628.getClass(), "parent", null);
        term175589 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term175589, term175589.getClass(), "functionName", null);
        setBooleanField(term175589, term175589.getClass(), "itsNeedsActivation", false);
        setIntField(term175589, term175589.getClass(), "itsFunctionType", 0);
        setBooleanField(term175589, term175589.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term175589, term175589.getClass(), "encodedSourceStart", 0);
        setIntField(term175589, term175589.getClass(), "encodedSourceEnd", 0);
        setField(term175589, term175589.getClass(), "sourceName", null);
        setIntField(term175589, term175589.getClass(), "baseLineno", 0);
        setIntField(term175589, term175589.getClass(), "endLineno", 0);
        setField(term175589, term175589.getClass(), "functions", null);
        setField(term175589, term175589.getClass(), "regexps", null);
        setField(term175589, term175589.getClass(), "itsVariables", null);
        setField(term175589, term175589.getClass(), "itsConst", null);
        setField(term175589, term175589.getClass(), "itsVariableNames", null);
        setIntField(term175589, term175589.getClass(), "varStart", 0);
        setField(term175589, term175589.getClass(), "compilerData", null);
        setIntField(term175589, term175589.getClass(), "type", 14);
        setField(term175589, term175589.getClass(), "next", null);
        setField(term175589, term175589.getClass(), "first", null);
        setField(term175589, term175589.getClass(), "last", null);
        setField(term175589, term175589.getClass(), "propListHead", null);
        setIntField(term175589, term175589.getClass(), "sourcePosition", 0);
        setField(term175589, term175589.getClass(), "jsType", null);
        setField(term175589, term175589.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term175399;
        args[1] = term175485;
        args[2] = term175571;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term175313, args);
        assertTrue(recursiveEquals(term175313, term175625));
        assertTrue(recursiveEquals(term175399, term175626));
        assertTrue(recursiveEquals(term175485, term175627));
        assertTrue(recursiveEquals(term175571, term175628));
        assertTrue(recursiveEquals(retValue, term175589));
    }

};


