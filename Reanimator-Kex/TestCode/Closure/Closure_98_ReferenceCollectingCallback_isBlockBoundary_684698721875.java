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

public class ReferenceCollectingCallback_isBlockBoundary_684698721875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231780;
     Object term231796;

    public ReferenceCollectingCallback_isBlockBoundary_684698721875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231780 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term231780, term231780.getClass(), "type", 108);
        term231796 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term231796, term231796.getClass(), "functionName", null);
        setBooleanField(term231796, term231796.getClass(), "itsNeedsActivation", false);
        setIntField(term231796, term231796.getClass(), "itsFunctionType", 0);
        setBooleanField(term231796, term231796.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term231796, term231796.getClass(), "encodedSourceStart", 0);
        setIntField(term231796, term231796.getClass(), "encodedSourceEnd", 0);
        setField(term231796, term231796.getClass(), "sourceName", null);
        setIntField(term231796, term231796.getClass(), "baseLineno", 0);
        setIntField(term231796, term231796.getClass(), "endLineno", 0);
        setField(term231796, term231796.getClass(), "functions", null);
        setField(term231796, term231796.getClass(), "regexps", null);
        setField(term231796, term231796.getClass(), "itsVariables", null);
        setField(term231796, term231796.getClass(), "itsConst", null);
        setField(term231796, term231796.getClass(), "itsVariableNames", null);
        setIntField(term231796, term231796.getClass(), "varStart", 0);
        setField(term231796, term231796.getClass(), "compilerData", null);
        setIntField(term231796, term231796.getClass(), "type", 108);
        setField(term231796, term231796.getClass(), "next", null);
        setField(term231796, term231796.getClass(), "first", null);
        setField(term231796, term231796.getClass(), "last", null);
        setField(term231796, term231796.getClass(), "propListHead", null);
        setIntField(term231796, term231796.getClass(), "sourcePosition", 0);
        setField(term231796, term231796.getClass(), "jsType", null);
        setField(term231796, term231796.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term231780;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term231780, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


