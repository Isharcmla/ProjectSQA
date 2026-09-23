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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term725978;
     Object term726064;
     Object term726220;
     Object term726306;
     Object term726499;
     Object term726500;
     Object term726502;
     Object term726503;
     Object term726408;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term725978 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term726064 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term726134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term726134, term726134.getClass(), "type", 108);
        setField(term726064, term726064.getClass(), "parent", term726134);
        setIntField(term726064, term726064.getClass(), "type", 0);
        term726220 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term726220, term726220.getClass(), "type", 106);
        term726306 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term726306, term726306.getClass(), "type", 44);
        term726499 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term726499, term726499.getClass(), "currentTraversal", null);
        term726500 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term726501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term726500, term726500.getClass(), "functionName", null);
        setBooleanField(term726500, term726500.getClass(), "itsNeedsActivation", false);
        setIntField(term726500, term726500.getClass(), "itsFunctionType", 0);
        setBooleanField(term726500, term726500.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term726500, term726500.getClass(), "encodedSourceStart", 0);
        setIntField(term726500, term726500.getClass(), "encodedSourceEnd", 0);
        setField(term726500, term726500.getClass(), "sourceName", null);
        setIntField(term726500, term726500.getClass(), "baseLineno", 0);
        setIntField(term726500, term726500.getClass(), "endLineno", 0);
        setField(term726500, term726500.getClass(), "functions", null);
        setField(term726500, term726500.getClass(), "regexps", null);
        setField(term726500, term726500.getClass(), "itsVariables", null);
        setField(term726500, term726500.getClass(), "itsConst", null);
        setField(term726500, term726500.getClass(), "itsVariableNames", null);
        setIntField(term726500, term726500.getClass(), "varStart", 0);
        setField(term726500, term726500.getClass(), "compilerData", null);
        setIntField(term726500, term726500.getClass(), "type", 0);
        setField(term726500, term726500.getClass(), "next", null);
        setField(term726500, term726500.getClass(), "first", null);
        setField(term726500, term726500.getClass(), "last", null);
        setField(term726500, term726500.getClass(), "propListHead", null);
        setIntField(term726500, term726500.getClass(), "sourcePosition", 0);
        setField(term726500, term726500.getClass(), "jsType", null);
        setIntField(term726501, term726501.getClass(), "type", 108);
        setField(term726501, term726501.getClass(), "next", null);
        setField(term726501, term726501.getClass(), "first", null);
        setField(term726501, term726501.getClass(), "last", null);
        setField(term726501, term726501.getClass(), "propListHead", null);
        setIntField(term726501, term726501.getClass(), "sourcePosition", 0);
        setField(term726501, term726501.getClass(), "jsType", null);
        setField(term726501, term726501.getClass(), "parent", null);
        setField(term726500, term726500.getClass(), "parent", term726501);
        term726502 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term726502, term726502.getClass(), "functionName", null);
        setBooleanField(term726502, term726502.getClass(), "itsNeedsActivation", false);
        setIntField(term726502, term726502.getClass(), "itsFunctionType", 0);
        setBooleanField(term726502, term726502.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term726502, term726502.getClass(), "encodedSourceStart", 0);
        setIntField(term726502, term726502.getClass(), "encodedSourceEnd", 0);
        setField(term726502, term726502.getClass(), "sourceName", null);
        setIntField(term726502, term726502.getClass(), "baseLineno", 0);
        setIntField(term726502, term726502.getClass(), "endLineno", 0);
        setField(term726502, term726502.getClass(), "functions", null);
        setField(term726502, term726502.getClass(), "regexps", null);
        setField(term726502, term726502.getClass(), "itsVariables", null);
        setField(term726502, term726502.getClass(), "itsConst", null);
        setField(term726502, term726502.getClass(), "itsVariableNames", null);
        setIntField(term726502, term726502.getClass(), "varStart", 0);
        setField(term726502, term726502.getClass(), "compilerData", null);
        setIntField(term726502, term726502.getClass(), "type", 106);
        setField(term726502, term726502.getClass(), "next", null);
        setField(term726502, term726502.getClass(), "first", null);
        setField(term726502, term726502.getClass(), "last", null);
        setField(term726502, term726502.getClass(), "propListHead", null);
        setIntField(term726502, term726502.getClass(), "sourcePosition", 0);
        setField(term726502, term726502.getClass(), "jsType", null);
        setField(term726502, term726502.getClass(), "parent", null);
        term726503 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term726503, term726503.getClass(), "functionName", null);
        setBooleanField(term726503, term726503.getClass(), "itsNeedsActivation", false);
        setIntField(term726503, term726503.getClass(), "itsFunctionType", 0);
        setBooleanField(term726503, term726503.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term726503, term726503.getClass(), "encodedSourceStart", 0);
        setIntField(term726503, term726503.getClass(), "encodedSourceEnd", 0);
        setField(term726503, term726503.getClass(), "sourceName", null);
        setIntField(term726503, term726503.getClass(), "baseLineno", 0);
        setIntField(term726503, term726503.getClass(), "endLineno", 0);
        setField(term726503, term726503.getClass(), "functions", null);
        setField(term726503, term726503.getClass(), "regexps", null);
        setField(term726503, term726503.getClass(), "itsVariables", null);
        setField(term726503, term726503.getClass(), "itsConst", null);
        setField(term726503, term726503.getClass(), "itsVariableNames", null);
        setIntField(term726503, term726503.getClass(), "varStart", 0);
        setField(term726503, term726503.getClass(), "compilerData", null);
        setIntField(term726503, term726503.getClass(), "type", 44);
        setField(term726503, term726503.getClass(), "next", null);
        setField(term726503, term726503.getClass(), "first", null);
        setField(term726503, term726503.getClass(), "last", null);
        setField(term726503, term726503.getClass(), "propListHead", null);
        setIntField(term726503, term726503.getClass(), "sourcePosition", 0);
        setField(term726503, term726503.getClass(), "jsType", null);
        setField(term726503, term726503.getClass(), "parent", null);
        term726408 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term726419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term726408, term726408.getClass(), "functionName", null);
        setBooleanField(term726408, term726408.getClass(), "itsNeedsActivation", false);
        setIntField(term726408, term726408.getClass(), "itsFunctionType", 0);
        setBooleanField(term726408, term726408.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term726408, term726408.getClass(), "encodedSourceStart", 0);
        setIntField(term726408, term726408.getClass(), "encodedSourceEnd", 0);
        setField(term726408, term726408.getClass(), "sourceName", null);
        setIntField(term726408, term726408.getClass(), "baseLineno", 0);
        setIntField(term726408, term726408.getClass(), "endLineno", 0);
        setField(term726408, term726408.getClass(), "functions", null);
        setField(term726408, term726408.getClass(), "regexps", null);
        setField(term726408, term726408.getClass(), "itsVariables", null);
        setField(term726408, term726408.getClass(), "itsConst", null);
        setField(term726408, term726408.getClass(), "itsVariableNames", null);
        setIntField(term726408, term726408.getClass(), "varStart", 0);
        setField(term726408, term726408.getClass(), "compilerData", null);
        setIntField(term726408, term726408.getClass(), "type", 0);
        setField(term726408, term726408.getClass(), "next", null);
        setField(term726408, term726408.getClass(), "first", null);
        setField(term726408, term726408.getClass(), "last", null);
        setField(term726408, term726408.getClass(), "propListHead", null);
        setIntField(term726408, term726408.getClass(), "sourcePosition", 0);
        setField(term726408, term726408.getClass(), "jsType", null);
        setIntField(term726419, term726419.getClass(), "type", 108);
        setField(term726419, term726419.getClass(), "next", null);
        setField(term726419, term726419.getClass(), "first", null);
        setField(term726419, term726419.getClass(), "last", null);
        setField(term726419, term726419.getClass(), "propListHead", null);
        setIntField(term726419, term726419.getClass(), "sourcePosition", 0);
        setField(term726419, term726419.getClass(), "jsType", null);
        setField(term726419, term726419.getClass(), "parent", null);
        setField(term726408, term726408.getClass(), "parent", term726419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term726064;
        args[1] = term726220;
        args[2] = term726306;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term725978, args);
        assertTrue(recursiveEquals(term725978, term726499));
        assertTrue(recursiveEquals(term726064, term726500));
        assertTrue(recursiveEquals(term726220, term726502));
        assertTrue(recursiveEquals(term726306, term726503));
        assertTrue(recursiveEquals(retValue, term726408));
    }

};


