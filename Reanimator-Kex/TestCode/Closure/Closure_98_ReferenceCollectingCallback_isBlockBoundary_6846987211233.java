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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370925;
     Object term371795;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term370925 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term370925, term370925.getClass(), "type", 113);
        term371795 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term371795, term371795.getClass(), "functionName", null);
        setBooleanField(term371795, term371795.getClass(), "itsNeedsActivation", false);
        setIntField(term371795, term371795.getClass(), "itsFunctionType", 0);
        setBooleanField(term371795, term371795.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term371795, term371795.getClass(), "encodedSourceStart", 0);
        setIntField(term371795, term371795.getClass(), "encodedSourceEnd", 0);
        setField(term371795, term371795.getClass(), "sourceName", null);
        setIntField(term371795, term371795.getClass(), "baseLineno", 0);
        setIntField(term371795, term371795.getClass(), "endLineno", 0);
        setField(term371795, term371795.getClass(), "functions", null);
        setField(term371795, term371795.getClass(), "regexps", null);
        setField(term371795, term371795.getClass(), "itsVariables", null);
        setField(term371795, term371795.getClass(), "itsConst", null);
        setField(term371795, term371795.getClass(), "itsVariableNames", null);
        setIntField(term371795, term371795.getClass(), "varStart", 0);
        setField(term371795, term371795.getClass(), "compilerData", null);
        setIntField(term371795, term371795.getClass(), "type", 113);
        setField(term371795, term371795.getClass(), "next", null);
        setField(term371795, term371795.getClass(), "first", null);
        setField(term371795, term371795.getClass(), "last", null);
        setField(term371795, term371795.getClass(), "propListHead", null);
        setIntField(term371795, term371795.getClass(), "sourcePosition", 0);
        setField(term371795, term371795.getClass(), "jsType", null);
        setField(term371795, term371795.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term370925;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term370925, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


