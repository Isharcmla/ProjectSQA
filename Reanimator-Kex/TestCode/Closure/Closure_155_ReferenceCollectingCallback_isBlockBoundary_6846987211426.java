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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416032;
     Object term416118;
     Object term416781;
     Object term416782;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term416032 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term416118 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term416118, term416118.getClass(), "type", 12);
        term416781 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term416781, term416781.getClass(), "functionName", null);
        setBooleanField(term416781, term416781.getClass(), "itsNeedsActivation", false);
        setIntField(term416781, term416781.getClass(), "itsFunctionType", 0);
        setBooleanField(term416781, term416781.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term416781, term416781.getClass(), "encodedSourceStart", 0);
        setIntField(term416781, term416781.getClass(), "encodedSourceEnd", 0);
        setField(term416781, term416781.getClass(), "sourceName", null);
        setIntField(term416781, term416781.getClass(), "baseLineno", 0);
        setIntField(term416781, term416781.getClass(), "endLineno", 0);
        setField(term416781, term416781.getClass(), "functions", null);
        setField(term416781, term416781.getClass(), "regexps", null);
        setField(term416781, term416781.getClass(), "itsVariables", null);
        setField(term416781, term416781.getClass(), "itsConst", null);
        setField(term416781, term416781.getClass(), "itsVariableNames", null);
        setIntField(term416781, term416781.getClass(), "varStart", 0);
        setField(term416781, term416781.getClass(), "compilerData", null);
        setIntField(term416781, term416781.getClass(), "type", 12);
        setField(term416781, term416781.getClass(), "next", null);
        setField(term416781, term416781.getClass(), "first", null);
        setField(term416781, term416781.getClass(), "last", null);
        setField(term416781, term416781.getClass(), "propListHead", null);
        setIntField(term416781, term416781.getClass(), "sourcePosition", 0);
        setField(term416781, term416781.getClass(), "jsType", null);
        setField(term416781, term416781.getClass(), "parent", null);
        term416782 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term416782, term416782.getClass(), "functionName", null);
        setBooleanField(term416782, term416782.getClass(), "itsNeedsActivation", false);
        setIntField(term416782, term416782.getClass(), "itsFunctionType", 0);
        setBooleanField(term416782, term416782.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term416782, term416782.getClass(), "encodedSourceStart", 0);
        setIntField(term416782, term416782.getClass(), "encodedSourceEnd", 0);
        setField(term416782, term416782.getClass(), "sourceName", null);
        setIntField(term416782, term416782.getClass(), "baseLineno", 0);
        setIntField(term416782, term416782.getClass(), "endLineno", 0);
        setField(term416782, term416782.getClass(), "functions", null);
        setField(term416782, term416782.getClass(), "regexps", null);
        setField(term416782, term416782.getClass(), "itsVariables", null);
        setField(term416782, term416782.getClass(), "itsConst", null);
        setField(term416782, term416782.getClass(), "itsVariableNames", null);
        setIntField(term416782, term416782.getClass(), "varStart", 0);
        setField(term416782, term416782.getClass(), "compilerData", null);
        setIntField(term416782, term416782.getClass(), "type", 0);
        setField(term416782, term416782.getClass(), "next", null);
        setField(term416782, term416782.getClass(), "first", null);
        setField(term416782, term416782.getClass(), "last", null);
        setField(term416782, term416782.getClass(), "propListHead", null);
        setIntField(term416782, term416782.getClass(), "sourcePosition", 0);
        setField(term416782, term416782.getClass(), "jsType", null);
        setField(term416782, term416782.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term416032;
        args[1] = term416118;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term416032, term416781));
        assertTrue(recursiveEquals(term416118, term416782));
        assertTrue(recursiveEquals(retValue, false));
    }

};


