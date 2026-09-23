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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378339;
     Object term378355;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term378339 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term378339, term378339.getClass(), "type", 98);
        term378355 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term378355, term378355.getClass(), "functionName", null);
        setBooleanField(term378355, term378355.getClass(), "itsNeedsActivation", false);
        setIntField(term378355, term378355.getClass(), "itsFunctionType", 0);
        setBooleanField(term378355, term378355.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term378355, term378355.getClass(), "encodedSourceStart", 0);
        setIntField(term378355, term378355.getClass(), "encodedSourceEnd", 0);
        setField(term378355, term378355.getClass(), "sourceName", null);
        setIntField(term378355, term378355.getClass(), "baseLineno", 0);
        setIntField(term378355, term378355.getClass(), "endLineno", 0);
        setField(term378355, term378355.getClass(), "functions", null);
        setField(term378355, term378355.getClass(), "regexps", null);
        setField(term378355, term378355.getClass(), "itsVariables", null);
        setField(term378355, term378355.getClass(), "itsConst", null);
        setField(term378355, term378355.getClass(), "itsVariableNames", null);
        setIntField(term378355, term378355.getClass(), "varStart", 0);
        setField(term378355, term378355.getClass(), "compilerData", null);
        setIntField(term378355, term378355.getClass(), "type", 98);
        setField(term378355, term378355.getClass(), "next", null);
        setField(term378355, term378355.getClass(), "first", null);
        setField(term378355, term378355.getClass(), "last", null);
        setField(term378355, term378355.getClass(), "propListHead", null);
        setIntField(term378355, term378355.getClass(), "sourcePosition", 0);
        setField(term378355, term378355.getClass(), "jsType", null);
        setField(term378355, term378355.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term378339;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term378339, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


