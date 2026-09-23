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

public class ReferenceCollectingCallback_isBlockBoundary_684698721814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215281;
     Object term215400;

    public ReferenceCollectingCallback_isBlockBoundary_684698721814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215281 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term215281, term215281.getClass(), "type", 113);
        term215400 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term215400, term215400.getClass(), "functionName", null);
        setBooleanField(term215400, term215400.getClass(), "itsNeedsActivation", false);
        setIntField(term215400, term215400.getClass(), "itsFunctionType", 0);
        setBooleanField(term215400, term215400.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term215400, term215400.getClass(), "encodedSourceStart", 0);
        setIntField(term215400, term215400.getClass(), "encodedSourceEnd", 0);
        setField(term215400, term215400.getClass(), "sourceName", null);
        setIntField(term215400, term215400.getClass(), "baseLineno", 0);
        setIntField(term215400, term215400.getClass(), "endLineno", 0);
        setField(term215400, term215400.getClass(), "functions", null);
        setField(term215400, term215400.getClass(), "regexps", null);
        setField(term215400, term215400.getClass(), "itsVariables", null);
        setField(term215400, term215400.getClass(), "itsConst", null);
        setField(term215400, term215400.getClass(), "itsVariableNames", null);
        setIntField(term215400, term215400.getClass(), "varStart", 0);
        setField(term215400, term215400.getClass(), "compilerData", null);
        setIntField(term215400, term215400.getClass(), "type", 113);
        setField(term215400, term215400.getClass(), "next", null);
        setField(term215400, term215400.getClass(), "first", null);
        setField(term215400, term215400.getClass(), "last", null);
        setField(term215400, term215400.getClass(), "propListHead", null);
        setIntField(term215400, term215400.getClass(), "sourcePosition", 0);
        setField(term215400, term215400.getClass(), "jsType", null);
        setField(term215400, term215400.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term215281;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term215281, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


