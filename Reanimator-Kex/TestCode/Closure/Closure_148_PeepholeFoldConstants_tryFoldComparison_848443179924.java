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

public class PeepholeFoldConstants_tryFoldComparison_848443179924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214647;
     Object term214739;
     Object term214831;
     Object term214917;
     Object term215409;
     Object term215410;
     Object term215411;
     Object term215412;
     Object term215383;

    public PeepholeFoldConstants_tryFoldComparison_848443179924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214647 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term214739 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term214739, term214739.getClass(), "type", 16);
        term214831 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term214831, term214831.getClass(), "type", 16);
        term214917 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term215409 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term215409, term215409.getClass(), "currentTraversal", null);
        term215410 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term215410, term215410.getClass(), "str", null);
        setIntField(term215410, term215410.getClass(), "type", 16);
        setField(term215410, term215410.getClass(), "next", null);
        setField(term215410, term215410.getClass(), "first", null);
        setField(term215410, term215410.getClass(), "last", null);
        setField(term215410, term215410.getClass(), "propListHead", null);
        setIntField(term215410, term215410.getClass(), "sourcePosition", 0);
        setField(term215410, term215410.getClass(), "jsType", null);
        setField(term215410, term215410.getClass(), "parent", null);
        term215411 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term215411, term215411.getClass(), "str", null);
        setIntField(term215411, term215411.getClass(), "type", 16);
        setField(term215411, term215411.getClass(), "next", null);
        setField(term215411, term215411.getClass(), "first", null);
        setField(term215411, term215411.getClass(), "last", null);
        setField(term215411, term215411.getClass(), "propListHead", null);
        setIntField(term215411, term215411.getClass(), "sourcePosition", 0);
        setField(term215411, term215411.getClass(), "jsType", null);
        setField(term215411, term215411.getClass(), "parent", null);
        term215412 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term215412, term215412.getClass(), "functionName", null);
        setBooleanField(term215412, term215412.getClass(), "itsNeedsActivation", false);
        setIntField(term215412, term215412.getClass(), "itsFunctionType", 0);
        setBooleanField(term215412, term215412.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term215412, term215412.getClass(), "encodedSourceStart", 0);
        setIntField(term215412, term215412.getClass(), "encodedSourceEnd", 0);
        setField(term215412, term215412.getClass(), "sourceName", null);
        setIntField(term215412, term215412.getClass(), "baseLineno", 0);
        setIntField(term215412, term215412.getClass(), "endLineno", 0);
        setField(term215412, term215412.getClass(), "functions", null);
        setField(term215412, term215412.getClass(), "regexps", null);
        setField(term215412, term215412.getClass(), "itsVariables", null);
        setField(term215412, term215412.getClass(), "itsConst", null);
        setField(term215412, term215412.getClass(), "itsVariableNames", null);
        setIntField(term215412, term215412.getClass(), "varStart", 0);
        setField(term215412, term215412.getClass(), "compilerData", null);
        setIntField(term215412, term215412.getClass(), "type", 0);
        setField(term215412, term215412.getClass(), "next", null);
        setField(term215412, term215412.getClass(), "first", null);
        setField(term215412, term215412.getClass(), "last", null);
        setField(term215412, term215412.getClass(), "propListHead", null);
        setIntField(term215412, term215412.getClass(), "sourcePosition", 0);
        setField(term215412, term215412.getClass(), "jsType", null);
        setField(term215412, term215412.getClass(), "parent", null);
        term215383 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term215383, term215383.getClass(), "str", null);
        setIntField(term215383, term215383.getClass(), "type", 16);
        setField(term215383, term215383.getClass(), "next", null);
        setField(term215383, term215383.getClass(), "first", null);
        setField(term215383, term215383.getClass(), "last", null);
        setField(term215383, term215383.getClass(), "propListHead", null);
        setIntField(term215383, term215383.getClass(), "sourcePosition", 0);
        setField(term215383, term215383.getClass(), "jsType", null);
        setField(term215383, term215383.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term214739;
        args[1] = term214831;
        args[2] = term214917;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term214647, args);
        assertTrue(recursiveEquals(term214647, term215409));
        assertTrue(recursiveEquals(term214739, term215410));
        assertTrue(recursiveEquals(term214831, term215411));
        assertTrue(recursiveEquals(term214917, term215412));
        assertTrue(recursiveEquals(retValue, term215383));
    }

};


