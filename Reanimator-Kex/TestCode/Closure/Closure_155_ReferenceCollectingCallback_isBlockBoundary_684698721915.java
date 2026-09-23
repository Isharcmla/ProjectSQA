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

public class ReferenceCollectingCallback_isBlockBoundary_684698721915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235440;
     Object term235526;
     Object term235570;
     Object term235571;

    public ReferenceCollectingCallback_isBlockBoundary_684698721915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235440 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term235440, term235440.getClass(), "type", 111);
        term235526 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term235526, term235526.getClass(), "type", 12);
        term235570 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term235570, term235570.getClass(), "functionName", null);
        setBooleanField(term235570, term235570.getClass(), "itsNeedsActivation", false);
        setIntField(term235570, term235570.getClass(), "itsFunctionType", 0);
        setBooleanField(term235570, term235570.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term235570, term235570.getClass(), "encodedSourceStart", 0);
        setIntField(term235570, term235570.getClass(), "encodedSourceEnd", 0);
        setField(term235570, term235570.getClass(), "sourceName", null);
        setIntField(term235570, term235570.getClass(), "baseLineno", 0);
        setIntField(term235570, term235570.getClass(), "endLineno", 0);
        setField(term235570, term235570.getClass(), "functions", null);
        setField(term235570, term235570.getClass(), "regexps", null);
        setField(term235570, term235570.getClass(), "itsVariables", null);
        setField(term235570, term235570.getClass(), "itsConst", null);
        setField(term235570, term235570.getClass(), "itsVariableNames", null);
        setIntField(term235570, term235570.getClass(), "varStart", 0);
        setField(term235570, term235570.getClass(), "compilerData", null);
        setIntField(term235570, term235570.getClass(), "type", 12);
        setField(term235570, term235570.getClass(), "next", null);
        setField(term235570, term235570.getClass(), "first", null);
        setField(term235570, term235570.getClass(), "last", null);
        setField(term235570, term235570.getClass(), "propListHead", null);
        setIntField(term235570, term235570.getClass(), "sourcePosition", 0);
        setField(term235570, term235570.getClass(), "jsType", null);
        setField(term235570, term235570.getClass(), "parent", null);
        term235571 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term235571, term235571.getClass(), "functionName", null);
        setBooleanField(term235571, term235571.getClass(), "itsNeedsActivation", false);
        setIntField(term235571, term235571.getClass(), "itsFunctionType", 0);
        setBooleanField(term235571, term235571.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term235571, term235571.getClass(), "encodedSourceStart", 0);
        setIntField(term235571, term235571.getClass(), "encodedSourceEnd", 0);
        setField(term235571, term235571.getClass(), "sourceName", null);
        setIntField(term235571, term235571.getClass(), "baseLineno", 0);
        setIntField(term235571, term235571.getClass(), "endLineno", 0);
        setField(term235571, term235571.getClass(), "functions", null);
        setField(term235571, term235571.getClass(), "regexps", null);
        setField(term235571, term235571.getClass(), "itsVariables", null);
        setField(term235571, term235571.getClass(), "itsConst", null);
        setField(term235571, term235571.getClass(), "itsVariableNames", null);
        setIntField(term235571, term235571.getClass(), "varStart", 0);
        setField(term235571, term235571.getClass(), "compilerData", null);
        setIntField(term235571, term235571.getClass(), "type", 111);
        setField(term235571, term235571.getClass(), "next", null);
        setField(term235571, term235571.getClass(), "first", null);
        setField(term235571, term235571.getClass(), "last", null);
        setField(term235571, term235571.getClass(), "propListHead", null);
        setIntField(term235571, term235571.getClass(), "sourcePosition", 0);
        setField(term235571, term235571.getClass(), "jsType", null);
        setField(term235571, term235571.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term235440;
        args[1] = term235526;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term235440, term235570));
        assertTrue(recursiveEquals(term235526, term235571));
        assertTrue(recursiveEquals(retValue, true));
    }

};


