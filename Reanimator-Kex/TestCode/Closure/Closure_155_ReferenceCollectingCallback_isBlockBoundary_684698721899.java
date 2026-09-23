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

public class ReferenceCollectingCallback_isBlockBoundary_684698721899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231218;
     Object term231310;
     Object term231434;
     Object term231435;

    public ReferenceCollectingCallback_isBlockBoundary_684698721899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231218 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term231310 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term231310, term231310.getClass(), "type", 12);
        term231434 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term231434, term231434.getClass(), "str", null);
        setIntField(term231434, term231434.getClass(), "type", 12);
        setField(term231434, term231434.getClass(), "next", null);
        setField(term231434, term231434.getClass(), "first", null);
        setField(term231434, term231434.getClass(), "last", null);
        setField(term231434, term231434.getClass(), "propListHead", null);
        setIntField(term231434, term231434.getClass(), "sourcePosition", 0);
        setField(term231434, term231434.getClass(), "jsType", null);
        setField(term231434, term231434.getClass(), "parent", null);
        term231435 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term231435, term231435.getClass(), "functionName", null);
        setBooleanField(term231435, term231435.getClass(), "itsNeedsActivation", false);
        setIntField(term231435, term231435.getClass(), "itsFunctionType", 0);
        setBooleanField(term231435, term231435.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term231435, term231435.getClass(), "encodedSourceStart", 0);
        setIntField(term231435, term231435.getClass(), "encodedSourceEnd", 0);
        setField(term231435, term231435.getClass(), "sourceName", null);
        setIntField(term231435, term231435.getClass(), "baseLineno", 0);
        setIntField(term231435, term231435.getClass(), "endLineno", 0);
        setField(term231435, term231435.getClass(), "functions", null);
        setField(term231435, term231435.getClass(), "regexps", null);
        setField(term231435, term231435.getClass(), "itsVariables", null);
        setField(term231435, term231435.getClass(), "itsConst", null);
        setField(term231435, term231435.getClass(), "itsVariableNames", null);
        setIntField(term231435, term231435.getClass(), "varStart", 0);
        setField(term231435, term231435.getClass(), "compilerData", null);
        setIntField(term231435, term231435.getClass(), "type", 0);
        setField(term231435, term231435.getClass(), "next", null);
        setField(term231435, term231435.getClass(), "first", null);
        setField(term231435, term231435.getClass(), "last", null);
        setField(term231435, term231435.getClass(), "propListHead", null);
        setIntField(term231435, term231435.getClass(), "sourcePosition", 0);
        setField(term231435, term231435.getClass(), "jsType", null);
        setField(term231435, term231435.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term231218;
        args[1] = term231310;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term231218, term231434));
        assertTrue(recursiveEquals(term231310, term231435));
        assertTrue(recursiveEquals(retValue, false));
    }

};


