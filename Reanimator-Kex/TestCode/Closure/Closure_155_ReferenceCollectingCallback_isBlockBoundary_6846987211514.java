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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452022;
     Object term452700;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term452022 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term452022, term452022.getClass(), "type", 114);
        term452700 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term452700, term452700.getClass(), "functionName", null);
        setBooleanField(term452700, term452700.getClass(), "itsNeedsActivation", false);
        setIntField(term452700, term452700.getClass(), "itsFunctionType", 0);
        setBooleanField(term452700, term452700.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term452700, term452700.getClass(), "encodedSourceStart", 0);
        setIntField(term452700, term452700.getClass(), "encodedSourceEnd", 0);
        setField(term452700, term452700.getClass(), "sourceName", null);
        setIntField(term452700, term452700.getClass(), "baseLineno", 0);
        setIntField(term452700, term452700.getClass(), "endLineno", 0);
        setField(term452700, term452700.getClass(), "functions", null);
        setField(term452700, term452700.getClass(), "regexps", null);
        setField(term452700, term452700.getClass(), "itsVariables", null);
        setField(term452700, term452700.getClass(), "itsConst", null);
        setField(term452700, term452700.getClass(), "itsVariableNames", null);
        setIntField(term452700, term452700.getClass(), "varStart", 0);
        setField(term452700, term452700.getClass(), "compilerData", null);
        setIntField(term452700, term452700.getClass(), "type", 114);
        setField(term452700, term452700.getClass(), "next", null);
        setField(term452700, term452700.getClass(), "first", null);
        setField(term452700, term452700.getClass(), "last", null);
        setField(term452700, term452700.getClass(), "propListHead", null);
        setIntField(term452700, term452700.getClass(), "sourcePosition", 0);
        setField(term452700, term452700.getClass(), "jsType", null);
        setField(term452700, term452700.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term452022;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term452022, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


