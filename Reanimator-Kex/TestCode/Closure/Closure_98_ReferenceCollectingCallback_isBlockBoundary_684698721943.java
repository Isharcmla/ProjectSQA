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

public class ReferenceCollectingCallback_isBlockBoundary_684698721943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255025;
     Object term255041;

    public ReferenceCollectingCallback_isBlockBoundary_684698721943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255025 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term255025, term255025.getClass(), "type", 98);
        term255041 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term255041, term255041.getClass(), "functionName", null);
        setBooleanField(term255041, term255041.getClass(), "itsNeedsActivation", false);
        setIntField(term255041, term255041.getClass(), "itsFunctionType", 0);
        setBooleanField(term255041, term255041.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term255041, term255041.getClass(), "encodedSourceStart", 0);
        setIntField(term255041, term255041.getClass(), "encodedSourceEnd", 0);
        setField(term255041, term255041.getClass(), "sourceName", null);
        setIntField(term255041, term255041.getClass(), "baseLineno", 0);
        setIntField(term255041, term255041.getClass(), "endLineno", 0);
        setField(term255041, term255041.getClass(), "functions", null);
        setField(term255041, term255041.getClass(), "regexps", null);
        setField(term255041, term255041.getClass(), "itsVariables", null);
        setField(term255041, term255041.getClass(), "itsConst", null);
        setField(term255041, term255041.getClass(), "itsVariableNames", null);
        setIntField(term255041, term255041.getClass(), "varStart", 0);
        setField(term255041, term255041.getClass(), "compilerData", null);
        setIntField(term255041, term255041.getClass(), "type", 98);
        setField(term255041, term255041.getClass(), "next", null);
        setField(term255041, term255041.getClass(), "first", null);
        setField(term255041, term255041.getClass(), "last", null);
        setField(term255041, term255041.getClass(), "propListHead", null);
        setIntField(term255041, term255041.getClass(), "sourcePosition", 0);
        setField(term255041, term255041.getClass(), "jsType", null);
        setField(term255041, term255041.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term255025;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term255025, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


