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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258850;
     Object term259156;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258850 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term258850, term258850.getClass(), "type", 100);
        term259156 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term259156, term259156.getClass(), "functionName", null);
        setBooleanField(term259156, term259156.getClass(), "itsNeedsActivation", false);
        setIntField(term259156, term259156.getClass(), "itsFunctionType", 0);
        setBooleanField(term259156, term259156.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term259156, term259156.getClass(), "encodedSourceStart", 0);
        setIntField(term259156, term259156.getClass(), "encodedSourceEnd", 0);
        setField(term259156, term259156.getClass(), "sourceName", null);
        setIntField(term259156, term259156.getClass(), "baseLineno", 0);
        setIntField(term259156, term259156.getClass(), "endLineno", 0);
        setField(term259156, term259156.getClass(), "functions", null);
        setField(term259156, term259156.getClass(), "regexps", null);
        setField(term259156, term259156.getClass(), "itsVariables", null);
        setField(term259156, term259156.getClass(), "itsConst", null);
        setField(term259156, term259156.getClass(), "itsVariableNames", null);
        setIntField(term259156, term259156.getClass(), "varStart", 0);
        setField(term259156, term259156.getClass(), "compilerData", null);
        setIntField(term259156, term259156.getClass(), "type", 100);
        setField(term259156, term259156.getClass(), "next", null);
        setField(term259156, term259156.getClass(), "first", null);
        setField(term259156, term259156.getClass(), "last", null);
        setField(term259156, term259156.getClass(), "propListHead", null);
        setIntField(term259156, term259156.getClass(), "sourcePosition", 0);
        setField(term259156, term259156.getClass(), "jsType", null);
        setField(term259156, term259156.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term258850;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term258850, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


