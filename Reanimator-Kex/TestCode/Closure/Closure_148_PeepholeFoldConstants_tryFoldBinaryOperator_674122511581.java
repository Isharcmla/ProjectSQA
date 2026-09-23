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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126952;
     Object term127038;
     Object term127417;
     Object term127418;
     Object term127374;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126952 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term127038 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term127038, term127038.getClass(), "first", term127038);
        setField(term127038, term127038.getClass(), "next", term127038);
        setIntField(term127038, term127038.getClass(), "type", 33);
        term127417 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term127417, term127417.getClass(), "currentTraversal", null);
        term127418 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term127418, term127418.getClass(), "functionName", null);
        setBooleanField(term127418, term127418.getClass(), "itsNeedsActivation", false);
        setIntField(term127418, term127418.getClass(), "itsFunctionType", 0);
        setBooleanField(term127418, term127418.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term127418, term127418.getClass(), "encodedSourceStart", 0);
        setIntField(term127418, term127418.getClass(), "encodedSourceEnd", 0);
        setField(term127418, term127418.getClass(), "sourceName", null);
        setIntField(term127418, term127418.getClass(), "baseLineno", 0);
        setIntField(term127418, term127418.getClass(), "endLineno", 0);
        setField(term127418, term127418.getClass(), "functions", null);
        setField(term127418, term127418.getClass(), "regexps", null);
        setField(term127418, term127418.getClass(), "itsVariables", null);
        setField(term127418, term127418.getClass(), "itsConst", null);
        setField(term127418, term127418.getClass(), "itsVariableNames", null);
        setIntField(term127418, term127418.getClass(), "varStart", 0);
        setField(term127418, term127418.getClass(), "compilerData", null);
        setIntField(term127418, term127418.getClass(), "type", 33);
        setField(term127418, term127418.getClass(), "next", term127418);
        setField(term127418, term127418.getClass(), "first", term127418);
        setField(term127418, term127418.getClass(), "last", null);
        setField(term127418, term127418.getClass(), "propListHead", null);
        setIntField(term127418, term127418.getClass(), "sourcePosition", 0);
        setField(term127418, term127418.getClass(), "jsType", null);
        setField(term127418, term127418.getClass(), "parent", null);
        term127374 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term127374, term127374.getClass(), "functionName", null);
        setBooleanField(term127374, term127374.getClass(), "itsNeedsActivation", false);
        setIntField(term127374, term127374.getClass(), "itsFunctionType", 0);
        setBooleanField(term127374, term127374.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term127374, term127374.getClass(), "encodedSourceStart", 0);
        setIntField(term127374, term127374.getClass(), "encodedSourceEnd", 0);
        setField(term127374, term127374.getClass(), "sourceName", null);
        setIntField(term127374, term127374.getClass(), "baseLineno", 0);
        setIntField(term127374, term127374.getClass(), "endLineno", 0);
        setField(term127374, term127374.getClass(), "functions", null);
        setField(term127374, term127374.getClass(), "regexps", null);
        setField(term127374, term127374.getClass(), "itsVariables", null);
        setField(term127374, term127374.getClass(), "itsConst", null);
        setField(term127374, term127374.getClass(), "itsVariableNames", null);
        setIntField(term127374, term127374.getClass(), "varStart", 0);
        setField(term127374, term127374.getClass(), "compilerData", null);
        setIntField(term127374, term127374.getClass(), "type", 33);
        setField(term127374, term127374.getClass(), "next", term127374);
        setField(term127374, term127374.getClass(), "first", term127374);
        setField(term127374, term127374.getClass(), "last", null);
        setField(term127374, term127374.getClass(), "propListHead", null);
        setIntField(term127374, term127374.getClass(), "sourcePosition", 0);
        setField(term127374, term127374.getClass(), "jsType", null);
        setField(term127374, term127374.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term127038;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term126952, args);
        assertTrue(recursiveEquals(term126952, term127417));
        assertTrue(recursiveEquals(term127038, term127418));
        assertTrue(recursiveEquals(retValue, term127374));
    }

};


