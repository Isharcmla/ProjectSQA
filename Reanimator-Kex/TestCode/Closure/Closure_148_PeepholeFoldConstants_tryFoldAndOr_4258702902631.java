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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term749600;
     Object term749686;
     Object term749842;
     Object term749928;
     Object term750565;
     Object term750566;
     Object term750568;
     Object term750569;
     Object term750494;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term749600 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term749686 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term749756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term749686, term749686.getClass(), "parent", term749756);
        setIntField(term749686, term749686.getClass(), "type", 0);
        term749842 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term749842, term749842.getClass(), "type", 0);
        term749928 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term749928, term749928.getClass(), "type", 64);
        term750565 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term750565, term750565.getClass(), "currentTraversal", null);
        term750566 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term750567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term750566, term750566.getClass(), "functionName", null);
        setBooleanField(term750566, term750566.getClass(), "itsNeedsActivation", false);
        setIntField(term750566, term750566.getClass(), "itsFunctionType", 0);
        setBooleanField(term750566, term750566.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term750566, term750566.getClass(), "encodedSourceStart", 0);
        setIntField(term750566, term750566.getClass(), "encodedSourceEnd", 0);
        setField(term750566, term750566.getClass(), "sourceName", null);
        setIntField(term750566, term750566.getClass(), "baseLineno", 0);
        setIntField(term750566, term750566.getClass(), "endLineno", 0);
        setField(term750566, term750566.getClass(), "functions", null);
        setField(term750566, term750566.getClass(), "regexps", null);
        setField(term750566, term750566.getClass(), "itsVariables", null);
        setField(term750566, term750566.getClass(), "itsConst", null);
        setField(term750566, term750566.getClass(), "itsVariableNames", null);
        setIntField(term750566, term750566.getClass(), "varStart", 0);
        setField(term750566, term750566.getClass(), "compilerData", null);
        setIntField(term750566, term750566.getClass(), "type", 0);
        setField(term750566, term750566.getClass(), "next", null);
        setField(term750566, term750566.getClass(), "first", null);
        setField(term750566, term750566.getClass(), "last", null);
        setField(term750566, term750566.getClass(), "propListHead", null);
        setIntField(term750566, term750566.getClass(), "sourcePosition", 0);
        setField(term750566, term750566.getClass(), "jsType", null);
        setIntField(term750567, term750567.getClass(), "type", 0);
        setField(term750567, term750567.getClass(), "next", null);
        setField(term750567, term750567.getClass(), "first", null);
        setField(term750567, term750567.getClass(), "last", null);
        setField(term750567, term750567.getClass(), "propListHead", null);
        setIntField(term750567, term750567.getClass(), "sourcePosition", 0);
        setField(term750567, term750567.getClass(), "jsType", null);
        setField(term750567, term750567.getClass(), "parent", null);
        setField(term750566, term750566.getClass(), "parent", term750567);
        term750568 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term750568, term750568.getClass(), "functionName", null);
        setBooleanField(term750568, term750568.getClass(), "itsNeedsActivation", false);
        setIntField(term750568, term750568.getClass(), "itsFunctionType", 0);
        setBooleanField(term750568, term750568.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term750568, term750568.getClass(), "encodedSourceStart", 0);
        setIntField(term750568, term750568.getClass(), "encodedSourceEnd", 0);
        setField(term750568, term750568.getClass(), "sourceName", null);
        setIntField(term750568, term750568.getClass(), "baseLineno", 0);
        setIntField(term750568, term750568.getClass(), "endLineno", 0);
        setField(term750568, term750568.getClass(), "functions", null);
        setField(term750568, term750568.getClass(), "regexps", null);
        setField(term750568, term750568.getClass(), "itsVariables", null);
        setField(term750568, term750568.getClass(), "itsConst", null);
        setField(term750568, term750568.getClass(), "itsVariableNames", null);
        setIntField(term750568, term750568.getClass(), "varStart", 0);
        setField(term750568, term750568.getClass(), "compilerData", null);
        setIntField(term750568, term750568.getClass(), "type", 0);
        setField(term750568, term750568.getClass(), "next", null);
        setField(term750568, term750568.getClass(), "first", null);
        setField(term750568, term750568.getClass(), "last", null);
        setField(term750568, term750568.getClass(), "propListHead", null);
        setIntField(term750568, term750568.getClass(), "sourcePosition", 0);
        setField(term750568, term750568.getClass(), "jsType", null);
        setField(term750568, term750568.getClass(), "parent", null);
        term750569 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term750569, term750569.getClass(), "functionName", null);
        setBooleanField(term750569, term750569.getClass(), "itsNeedsActivation", false);
        setIntField(term750569, term750569.getClass(), "itsFunctionType", 0);
        setBooleanField(term750569, term750569.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term750569, term750569.getClass(), "encodedSourceStart", 0);
        setIntField(term750569, term750569.getClass(), "encodedSourceEnd", 0);
        setField(term750569, term750569.getClass(), "sourceName", null);
        setIntField(term750569, term750569.getClass(), "baseLineno", 0);
        setIntField(term750569, term750569.getClass(), "endLineno", 0);
        setField(term750569, term750569.getClass(), "functions", null);
        setField(term750569, term750569.getClass(), "regexps", null);
        setField(term750569, term750569.getClass(), "itsVariables", null);
        setField(term750569, term750569.getClass(), "itsConst", null);
        setField(term750569, term750569.getClass(), "itsVariableNames", null);
        setIntField(term750569, term750569.getClass(), "varStart", 0);
        setField(term750569, term750569.getClass(), "compilerData", null);
        setIntField(term750569, term750569.getClass(), "type", 64);
        setField(term750569, term750569.getClass(), "next", null);
        setField(term750569, term750569.getClass(), "first", null);
        setField(term750569, term750569.getClass(), "last", null);
        setField(term750569, term750569.getClass(), "propListHead", null);
        setIntField(term750569, term750569.getClass(), "sourcePosition", 0);
        setField(term750569, term750569.getClass(), "jsType", null);
        setField(term750569, term750569.getClass(), "parent", null);
        term750494 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term750505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term750494, term750494.getClass(), "functionName", null);
        setBooleanField(term750494, term750494.getClass(), "itsNeedsActivation", false);
        setIntField(term750494, term750494.getClass(), "itsFunctionType", 0);
        setBooleanField(term750494, term750494.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term750494, term750494.getClass(), "encodedSourceStart", 0);
        setIntField(term750494, term750494.getClass(), "encodedSourceEnd", 0);
        setField(term750494, term750494.getClass(), "sourceName", null);
        setIntField(term750494, term750494.getClass(), "baseLineno", 0);
        setIntField(term750494, term750494.getClass(), "endLineno", 0);
        setField(term750494, term750494.getClass(), "functions", null);
        setField(term750494, term750494.getClass(), "regexps", null);
        setField(term750494, term750494.getClass(), "itsVariables", null);
        setField(term750494, term750494.getClass(), "itsConst", null);
        setField(term750494, term750494.getClass(), "itsVariableNames", null);
        setIntField(term750494, term750494.getClass(), "varStart", 0);
        setField(term750494, term750494.getClass(), "compilerData", null);
        setIntField(term750494, term750494.getClass(), "type", 0);
        setField(term750494, term750494.getClass(), "next", null);
        setField(term750494, term750494.getClass(), "first", null);
        setField(term750494, term750494.getClass(), "last", null);
        setField(term750494, term750494.getClass(), "propListHead", null);
        setIntField(term750494, term750494.getClass(), "sourcePosition", 0);
        setField(term750494, term750494.getClass(), "jsType", null);
        setIntField(term750505, term750505.getClass(), "type", 0);
        setField(term750505, term750505.getClass(), "next", null);
        setField(term750505, term750505.getClass(), "first", null);
        setField(term750505, term750505.getClass(), "last", null);
        setField(term750505, term750505.getClass(), "propListHead", null);
        setIntField(term750505, term750505.getClass(), "sourcePosition", 0);
        setField(term750505, term750505.getClass(), "jsType", null);
        setField(term750505, term750505.getClass(), "parent", null);
        setField(term750494, term750494.getClass(), "parent", term750505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term749686;
        args[1] = term749842;
        args[2] = term749928;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term749600, args);
        assertTrue(recursiveEquals(term749600, term750565));
        assertTrue(recursiveEquals(term749686, term750566));
        assertTrue(recursiveEquals(term749842, term750568));
        assertTrue(recursiveEquals(term749928, term750569));
        assertTrue(recursiveEquals(retValue, term750494));
    }

};


