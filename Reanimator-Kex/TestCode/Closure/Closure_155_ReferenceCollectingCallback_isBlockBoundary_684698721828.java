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

public class ReferenceCollectingCallback_isBlockBoundary_684698721828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211527;
     Object term211868;

    public ReferenceCollectingCallback_isBlockBoundary_684698721828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211527 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term211868 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term211868, term211868.getClass(), "functionName", null);
        setBooleanField(term211868, term211868.getClass(), "itsNeedsActivation", false);
        setIntField(term211868, term211868.getClass(), "itsFunctionType", 0);
        setBooleanField(term211868, term211868.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term211868, term211868.getClass(), "encodedSourceStart", 0);
        setIntField(term211868, term211868.getClass(), "encodedSourceEnd", 0);
        setField(term211868, term211868.getClass(), "sourceName", null);
        setIntField(term211868, term211868.getClass(), "baseLineno", 0);
        setIntField(term211868, term211868.getClass(), "endLineno", 0);
        setField(term211868, term211868.getClass(), "functions", null);
        setField(term211868, term211868.getClass(), "regexps", null);
        setField(term211868, term211868.getClass(), "itsVariables", null);
        setField(term211868, term211868.getClass(), "itsConst", null);
        setField(term211868, term211868.getClass(), "itsVariableNames", null);
        setIntField(term211868, term211868.getClass(), "varStart", 0);
        setField(term211868, term211868.getClass(), "compilerData", null);
        setIntField(term211868, term211868.getClass(), "type", 0);
        setField(term211868, term211868.getClass(), "next", null);
        setField(term211868, term211868.getClass(), "first", null);
        setField(term211868, term211868.getClass(), "last", null);
        setField(term211868, term211868.getClass(), "propListHead", null);
        setIntField(term211868, term211868.getClass(), "sourcePosition", 0);
        setField(term211868, term211868.getClass(), "jsType", null);
        setField(term211868, term211868.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term211527;
        args[1] = null;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term211527, term211868));
        assertTrue(recursiveEquals(retValue, false));
    }

};


