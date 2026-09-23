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

public class PeepholeFoldConstants_tryFoldAndOr_425870290255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48640;
     Object term48726;
     Object term48818;
     Object term48910;
     Object term49399;
     Object term49400;
     Object term49401;
     Object term49402;
     Object term49352;

    public PeepholeFoldConstants_tryFoldAndOr_425870290255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48640 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term48726 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term48726, term48726.getClass(), "parent", null);
        setIntField(term48726, term48726.getClass(), "type", 0);
        term48818 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term48818, term48818.getClass(), "type", 0);
        term48910 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term49399 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term49399, term49399.getClass(), "currentTraversal", null);
        term49400 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term49400, term49400.getClass(), "functionName", null);
        setBooleanField(term49400, term49400.getClass(), "itsNeedsActivation", false);
        setIntField(term49400, term49400.getClass(), "itsFunctionType", 0);
        setBooleanField(term49400, term49400.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term49400, term49400.getClass(), "encodedSourceStart", 0);
        setIntField(term49400, term49400.getClass(), "encodedSourceEnd", 0);
        setField(term49400, term49400.getClass(), "sourceName", null);
        setIntField(term49400, term49400.getClass(), "baseLineno", 0);
        setIntField(term49400, term49400.getClass(), "endLineno", 0);
        setField(term49400, term49400.getClass(), "functions", null);
        setField(term49400, term49400.getClass(), "regexps", null);
        setField(term49400, term49400.getClass(), "itsVariables", null);
        setField(term49400, term49400.getClass(), "itsConst", null);
        setField(term49400, term49400.getClass(), "itsVariableNames", null);
        setIntField(term49400, term49400.getClass(), "varStart", 0);
        setField(term49400, term49400.getClass(), "compilerData", null);
        setIntField(term49400, term49400.getClass(), "type", 0);
        setField(term49400, term49400.getClass(), "next", null);
        setField(term49400, term49400.getClass(), "first", null);
        setField(term49400, term49400.getClass(), "last", null);
        setField(term49400, term49400.getClass(), "propListHead", null);
        setIntField(term49400, term49400.getClass(), "sourcePosition", 0);
        setField(term49400, term49400.getClass(), "jsType", null);
        setField(term49400, term49400.getClass(), "parent", null);
        term49401 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term49401, term49401.getClass(), "str", null);
        setIntField(term49401, term49401.getClass(), "type", 0);
        setField(term49401, term49401.getClass(), "next", null);
        setField(term49401, term49401.getClass(), "first", null);
        setField(term49401, term49401.getClass(), "last", null);
        setField(term49401, term49401.getClass(), "propListHead", null);
        setIntField(term49401, term49401.getClass(), "sourcePosition", 0);
        setField(term49401, term49401.getClass(), "jsType", null);
        setField(term49401, term49401.getClass(), "parent", null);
        term49402 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term49402, term49402.getClass(), "number", 0.0);
        setIntField(term49402, term49402.getClass(), "type", 0);
        setField(term49402, term49402.getClass(), "next", null);
        setField(term49402, term49402.getClass(), "first", null);
        setField(term49402, term49402.getClass(), "last", null);
        setField(term49402, term49402.getClass(), "propListHead", null);
        setIntField(term49402, term49402.getClass(), "sourcePosition", 0);
        setField(term49402, term49402.getClass(), "jsType", null);
        setField(term49402, term49402.getClass(), "parent", null);
        term49352 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term49352, term49352.getClass(), "functionName", null);
        setBooleanField(term49352, term49352.getClass(), "itsNeedsActivation", false);
        setIntField(term49352, term49352.getClass(), "itsFunctionType", 0);
        setBooleanField(term49352, term49352.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term49352, term49352.getClass(), "encodedSourceStart", 0);
        setIntField(term49352, term49352.getClass(), "encodedSourceEnd", 0);
        setField(term49352, term49352.getClass(), "sourceName", null);
        setIntField(term49352, term49352.getClass(), "baseLineno", 0);
        setIntField(term49352, term49352.getClass(), "endLineno", 0);
        setField(term49352, term49352.getClass(), "functions", null);
        setField(term49352, term49352.getClass(), "regexps", null);
        setField(term49352, term49352.getClass(), "itsVariables", null);
        setField(term49352, term49352.getClass(), "itsConst", null);
        setField(term49352, term49352.getClass(), "itsVariableNames", null);
        setIntField(term49352, term49352.getClass(), "varStart", 0);
        setField(term49352, term49352.getClass(), "compilerData", null);
        setIntField(term49352, term49352.getClass(), "type", 0);
        setField(term49352, term49352.getClass(), "next", null);
        setField(term49352, term49352.getClass(), "first", null);
        setField(term49352, term49352.getClass(), "last", null);
        setField(term49352, term49352.getClass(), "propListHead", null);
        setIntField(term49352, term49352.getClass(), "sourcePosition", 0);
        setField(term49352, term49352.getClass(), "jsType", null);
        setField(term49352, term49352.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term48726;
        args[1] = term48818;
        args[2] = term48910;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term48640, args);
        assertTrue(recursiveEquals(term48640, term49399));
        assertTrue(recursiveEquals(term48726, term49400));
        assertTrue(recursiveEquals(term48818, term49401));
        assertTrue(recursiveEquals(term48910, term49402));
        assertTrue(recursiveEquals(retValue, term49352));
    }

};


