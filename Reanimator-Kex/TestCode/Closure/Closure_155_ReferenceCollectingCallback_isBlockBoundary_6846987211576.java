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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475804;
     Object term476713;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term475804 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term475804, term475804.getClass(), "type", 111);
        term476713 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term476713, term476713.getClass(), "functionName", null);
        setBooleanField(term476713, term476713.getClass(), "itsNeedsActivation", false);
        setIntField(term476713, term476713.getClass(), "itsFunctionType", 0);
        setBooleanField(term476713, term476713.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term476713, term476713.getClass(), "encodedSourceStart", 0);
        setIntField(term476713, term476713.getClass(), "encodedSourceEnd", 0);
        setField(term476713, term476713.getClass(), "sourceName", null);
        setIntField(term476713, term476713.getClass(), "baseLineno", 0);
        setIntField(term476713, term476713.getClass(), "endLineno", 0);
        setField(term476713, term476713.getClass(), "functions", null);
        setField(term476713, term476713.getClass(), "regexps", null);
        setField(term476713, term476713.getClass(), "itsVariables", null);
        setField(term476713, term476713.getClass(), "itsConst", null);
        setField(term476713, term476713.getClass(), "itsVariableNames", null);
        setIntField(term476713, term476713.getClass(), "varStart", 0);
        setField(term476713, term476713.getClass(), "compilerData", null);
        setIntField(term476713, term476713.getClass(), "type", 111);
        setField(term476713, term476713.getClass(), "next", null);
        setField(term476713, term476713.getClass(), "first", null);
        setField(term476713, term476713.getClass(), "last", null);
        setField(term476713, term476713.getClass(), "propListHead", null);
        setIntField(term476713, term476713.getClass(), "sourcePosition", 0);
        setField(term476713, term476713.getClass(), "jsType", null);
        setField(term476713, term476713.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term475804;
        args[1] = null;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term475804, term476713));
        assertTrue(recursiveEquals(retValue, true));
    }

};


