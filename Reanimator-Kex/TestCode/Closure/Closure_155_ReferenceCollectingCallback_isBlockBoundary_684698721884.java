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

public class ReferenceCollectingCallback_isBlockBoundary_684698721884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227324;
     Object term227339;

    public ReferenceCollectingCallback_isBlockBoundary_684698721884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227324 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term227324, term227324.getClass(), "type", 113);
        term227339 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term227339, term227339.getClass(), "functionName", null);
        setBooleanField(term227339, term227339.getClass(), "itsNeedsActivation", false);
        setIntField(term227339, term227339.getClass(), "itsFunctionType", 0);
        setBooleanField(term227339, term227339.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term227339, term227339.getClass(), "encodedSourceStart", 0);
        setIntField(term227339, term227339.getClass(), "encodedSourceEnd", 0);
        setField(term227339, term227339.getClass(), "sourceName", null);
        setIntField(term227339, term227339.getClass(), "baseLineno", 0);
        setIntField(term227339, term227339.getClass(), "endLineno", 0);
        setField(term227339, term227339.getClass(), "functions", null);
        setField(term227339, term227339.getClass(), "regexps", null);
        setField(term227339, term227339.getClass(), "itsVariables", null);
        setField(term227339, term227339.getClass(), "itsConst", null);
        setField(term227339, term227339.getClass(), "itsVariableNames", null);
        setIntField(term227339, term227339.getClass(), "varStart", 0);
        setField(term227339, term227339.getClass(), "compilerData", null);
        setIntField(term227339, term227339.getClass(), "type", 113);
        setField(term227339, term227339.getClass(), "next", null);
        setField(term227339, term227339.getClass(), "first", null);
        setField(term227339, term227339.getClass(), "last", null);
        setField(term227339, term227339.getClass(), "propListHead", null);
        setIntField(term227339, term227339.getClass(), "sourcePosition", 0);
        setField(term227339, term227339.getClass(), "jsType", null);
        setField(term227339, term227339.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term227324;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term227324, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


