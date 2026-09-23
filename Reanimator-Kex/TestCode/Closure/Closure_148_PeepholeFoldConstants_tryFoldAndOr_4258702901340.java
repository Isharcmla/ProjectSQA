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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325199;
     Object term325328;
     Object term325408;
     Object term325409;
     Object term325410;
     Object term325372;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term325199 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term325328 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term325328, term325328.getClass(), "parent", null);
        setIntField(term325328, term325328.getClass(), "type", 47);
        term325408 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term325408, term325408.getClass(), "currentTraversal", null);
        term325409 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term325409, term325409.getClass(), "functionName", null);
        setBooleanField(term325409, term325409.getClass(), "itsNeedsActivation", false);
        setIntField(term325409, term325409.getClass(), "itsFunctionType", 0);
        setBooleanField(term325409, term325409.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term325409, term325409.getClass(), "encodedSourceStart", 0);
        setIntField(term325409, term325409.getClass(), "encodedSourceEnd", 0);
        setField(term325409, term325409.getClass(), "sourceName", null);
        setIntField(term325409, term325409.getClass(), "baseLineno", 0);
        setIntField(term325409, term325409.getClass(), "endLineno", 0);
        setField(term325409, term325409.getClass(), "functions", null);
        setField(term325409, term325409.getClass(), "regexps", null);
        setField(term325409, term325409.getClass(), "itsVariables", null);
        setField(term325409, term325409.getClass(), "itsConst", null);
        setField(term325409, term325409.getClass(), "itsVariableNames", null);
        setIntField(term325409, term325409.getClass(), "varStart", 0);
        setField(term325409, term325409.getClass(), "compilerData", null);
        setIntField(term325409, term325409.getClass(), "type", 47);
        setField(term325409, term325409.getClass(), "next", null);
        setField(term325409, term325409.getClass(), "first", null);
        setField(term325409, term325409.getClass(), "last", null);
        setField(term325409, term325409.getClass(), "propListHead", null);
        setIntField(term325409, term325409.getClass(), "sourcePosition", 0);
        setField(term325409, term325409.getClass(), "jsType", null);
        setField(term325409, term325409.getClass(), "parent", null);
        term325410 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term325410, term325410.getClass(), "functionName", null);
        setBooleanField(term325410, term325410.getClass(), "itsNeedsActivation", false);
        setIntField(term325410, term325410.getClass(), "itsFunctionType", 0);
        setBooleanField(term325410, term325410.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term325410, term325410.getClass(), "encodedSourceStart", 0);
        setIntField(term325410, term325410.getClass(), "encodedSourceEnd", 0);
        setField(term325410, term325410.getClass(), "sourceName", null);
        setIntField(term325410, term325410.getClass(), "baseLineno", 0);
        setIntField(term325410, term325410.getClass(), "endLineno", 0);
        setField(term325410, term325410.getClass(), "functions", null);
        setField(term325410, term325410.getClass(), "regexps", null);
        setField(term325410, term325410.getClass(), "itsVariables", null);
        setField(term325410, term325410.getClass(), "itsConst", null);
        setField(term325410, term325410.getClass(), "itsVariableNames", null);
        setIntField(term325410, term325410.getClass(), "varStart", 0);
        setField(term325410, term325410.getClass(), "compilerData", null);
        setIntField(term325410, term325410.getClass(), "type", 47);
        setField(term325410, term325410.getClass(), "next", null);
        setField(term325410, term325410.getClass(), "first", null);
        setField(term325410, term325410.getClass(), "last", null);
        setField(term325410, term325410.getClass(), "propListHead", null);
        setIntField(term325410, term325410.getClass(), "sourcePosition", 0);
        setField(term325410, term325410.getClass(), "jsType", null);
        setField(term325410, term325410.getClass(), "parent", null);
        term325372 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term325372, term325372.getClass(), "functionName", null);
        setBooleanField(term325372, term325372.getClass(), "itsNeedsActivation", false);
        setIntField(term325372, term325372.getClass(), "itsFunctionType", 0);
        setBooleanField(term325372, term325372.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term325372, term325372.getClass(), "encodedSourceStart", 0);
        setIntField(term325372, term325372.getClass(), "encodedSourceEnd", 0);
        setField(term325372, term325372.getClass(), "sourceName", null);
        setIntField(term325372, term325372.getClass(), "baseLineno", 0);
        setIntField(term325372, term325372.getClass(), "endLineno", 0);
        setField(term325372, term325372.getClass(), "functions", null);
        setField(term325372, term325372.getClass(), "regexps", null);
        setField(term325372, term325372.getClass(), "itsVariables", null);
        setField(term325372, term325372.getClass(), "itsConst", null);
        setField(term325372, term325372.getClass(), "itsVariableNames", null);
        setIntField(term325372, term325372.getClass(), "varStart", 0);
        setField(term325372, term325372.getClass(), "compilerData", null);
        setIntField(term325372, term325372.getClass(), "type", 47);
        setField(term325372, term325372.getClass(), "next", null);
        setField(term325372, term325372.getClass(), "first", null);
        setField(term325372, term325372.getClass(), "last", null);
        setField(term325372, term325372.getClass(), "propListHead", null);
        setIntField(term325372, term325372.getClass(), "sourcePosition", 0);
        setField(term325372, term325372.getClass(), "jsType", null);
        setField(term325372, term325372.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term325328;
        args[1] = term325328;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term325199, args);
        assertTrue(recursiveEquals(term325199, term325408));
        assertTrue(recursiveEquals(term325328, term325409));
        assertTrue(recursiveEquals(term325328, term325410));
        assertTrue(recursiveEquals(retValue, term325372));
    }

};


