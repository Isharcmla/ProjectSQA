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

public class ReferenceCollectingCallback_isBlockBoundary_684698721895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230316;
     Object term230408;
     Object term230843;
     Object term230844;

    public ReferenceCollectingCallback_isBlockBoundary_684698721895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230316 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term230408 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term230408, term230408.getClass(), "type", 12);
        term230843 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term230843, term230843.getClass(), "number", 0.0);
        setIntField(term230843, term230843.getClass(), "type", 12);
        setField(term230843, term230843.getClass(), "next", null);
        setField(term230843, term230843.getClass(), "first", null);
        setField(term230843, term230843.getClass(), "last", null);
        setField(term230843, term230843.getClass(), "propListHead", null);
        setIntField(term230843, term230843.getClass(), "sourcePosition", 0);
        setField(term230843, term230843.getClass(), "jsType", null);
        setField(term230843, term230843.getClass(), "parent", null);
        term230844 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term230844, term230844.getClass(), "functionName", null);
        setBooleanField(term230844, term230844.getClass(), "itsNeedsActivation", false);
        setIntField(term230844, term230844.getClass(), "itsFunctionType", 0);
        setBooleanField(term230844, term230844.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term230844, term230844.getClass(), "encodedSourceStart", 0);
        setIntField(term230844, term230844.getClass(), "encodedSourceEnd", 0);
        setField(term230844, term230844.getClass(), "sourceName", null);
        setIntField(term230844, term230844.getClass(), "baseLineno", 0);
        setIntField(term230844, term230844.getClass(), "endLineno", 0);
        setField(term230844, term230844.getClass(), "functions", null);
        setField(term230844, term230844.getClass(), "regexps", null);
        setField(term230844, term230844.getClass(), "itsVariables", null);
        setField(term230844, term230844.getClass(), "itsConst", null);
        setField(term230844, term230844.getClass(), "itsVariableNames", null);
        setIntField(term230844, term230844.getClass(), "varStart", 0);
        setField(term230844, term230844.getClass(), "compilerData", null);
        setIntField(term230844, term230844.getClass(), "type", 0);
        setField(term230844, term230844.getClass(), "next", null);
        setField(term230844, term230844.getClass(), "first", null);
        setField(term230844, term230844.getClass(), "last", null);
        setField(term230844, term230844.getClass(), "propListHead", null);
        setIntField(term230844, term230844.getClass(), "sourcePosition", 0);
        setField(term230844, term230844.getClass(), "jsType", null);
        setField(term230844, term230844.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term230316;
        args[1] = term230408;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term230316, term230843));
        assertTrue(recursiveEquals(term230408, term230844));
        assertTrue(recursiveEquals(retValue, false));
    }

};


