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

public class ReferenceCollectingCallback_isBlockBoundary_684698721955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258728;
     Object term258814;
     Object term258897;
     Object term258898;

    public ReferenceCollectingCallback_isBlockBoundary_684698721955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258728 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term258728, term258728.getClass(), "type", 111);
        term258814 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term258814, term258814.getClass(), "type", 12);
        term258897 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term258897, term258897.getClass(), "functionName", null);
        setBooleanField(term258897, term258897.getClass(), "itsNeedsActivation", false);
        setIntField(term258897, term258897.getClass(), "itsFunctionType", 0);
        setBooleanField(term258897, term258897.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term258897, term258897.getClass(), "encodedSourceStart", 0);
        setIntField(term258897, term258897.getClass(), "encodedSourceEnd", 0);
        setField(term258897, term258897.getClass(), "sourceName", null);
        setIntField(term258897, term258897.getClass(), "baseLineno", 0);
        setIntField(term258897, term258897.getClass(), "endLineno", 0);
        setField(term258897, term258897.getClass(), "functions", null);
        setField(term258897, term258897.getClass(), "regexps", null);
        setField(term258897, term258897.getClass(), "itsVariables", null);
        setField(term258897, term258897.getClass(), "itsConst", null);
        setField(term258897, term258897.getClass(), "itsVariableNames", null);
        setIntField(term258897, term258897.getClass(), "varStart", 0);
        setField(term258897, term258897.getClass(), "compilerData", null);
        setIntField(term258897, term258897.getClass(), "type", 12);
        setField(term258897, term258897.getClass(), "next", null);
        setField(term258897, term258897.getClass(), "first", null);
        setField(term258897, term258897.getClass(), "last", null);
        setField(term258897, term258897.getClass(), "propListHead", null);
        setIntField(term258897, term258897.getClass(), "sourcePosition", 0);
        setField(term258897, term258897.getClass(), "jsType", null);
        setField(term258897, term258897.getClass(), "parent", null);
        term258898 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term258898, term258898.getClass(), "functionName", null);
        setBooleanField(term258898, term258898.getClass(), "itsNeedsActivation", false);
        setIntField(term258898, term258898.getClass(), "itsFunctionType", 0);
        setBooleanField(term258898, term258898.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term258898, term258898.getClass(), "encodedSourceStart", 0);
        setIntField(term258898, term258898.getClass(), "encodedSourceEnd", 0);
        setField(term258898, term258898.getClass(), "sourceName", null);
        setIntField(term258898, term258898.getClass(), "baseLineno", 0);
        setIntField(term258898, term258898.getClass(), "endLineno", 0);
        setField(term258898, term258898.getClass(), "functions", null);
        setField(term258898, term258898.getClass(), "regexps", null);
        setField(term258898, term258898.getClass(), "itsVariables", null);
        setField(term258898, term258898.getClass(), "itsConst", null);
        setField(term258898, term258898.getClass(), "itsVariableNames", null);
        setIntField(term258898, term258898.getClass(), "varStart", 0);
        setField(term258898, term258898.getClass(), "compilerData", null);
        setIntField(term258898, term258898.getClass(), "type", 111);
        setField(term258898, term258898.getClass(), "next", null);
        setField(term258898, term258898.getClass(), "first", null);
        setField(term258898, term258898.getClass(), "last", null);
        setField(term258898, term258898.getClass(), "propListHead", null);
        setIntField(term258898, term258898.getClass(), "sourcePosition", 0);
        setField(term258898, term258898.getClass(), "jsType", null);
        setField(term258898, term258898.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term258728;
        args[1] = term258814;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term258728, term258897));
        assertTrue(recursiveEquals(term258814, term258898));
        assertTrue(recursiveEquals(retValue, true));
    }

};


