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

public class ReferenceCollectingCallback_isBlockBoundary_684698721873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231654;
     Object term231669;

    public ReferenceCollectingCallback_isBlockBoundary_684698721873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231654 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term231654, term231654.getClass(), "type", 114);
        term231669 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term231669, term231669.getClass(), "functionName", null);
        setBooleanField(term231669, term231669.getClass(), "itsNeedsActivation", false);
        setIntField(term231669, term231669.getClass(), "itsFunctionType", 0);
        setBooleanField(term231669, term231669.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term231669, term231669.getClass(), "encodedSourceStart", 0);
        setIntField(term231669, term231669.getClass(), "encodedSourceEnd", 0);
        setField(term231669, term231669.getClass(), "sourceName", null);
        setIntField(term231669, term231669.getClass(), "baseLineno", 0);
        setIntField(term231669, term231669.getClass(), "endLineno", 0);
        setField(term231669, term231669.getClass(), "functions", null);
        setField(term231669, term231669.getClass(), "regexps", null);
        setField(term231669, term231669.getClass(), "itsVariables", null);
        setField(term231669, term231669.getClass(), "itsConst", null);
        setField(term231669, term231669.getClass(), "itsVariableNames", null);
        setIntField(term231669, term231669.getClass(), "varStart", 0);
        setField(term231669, term231669.getClass(), "compilerData", null);
        setIntField(term231669, term231669.getClass(), "type", 114);
        setField(term231669, term231669.getClass(), "next", null);
        setField(term231669, term231669.getClass(), "first", null);
        setField(term231669, term231669.getClass(), "last", null);
        setField(term231669, term231669.getClass(), "propListHead", null);
        setIntField(term231669, term231669.getClass(), "sourcePosition", 0);
        setField(term231669, term231669.getClass(), "jsType", null);
        setField(term231669, term231669.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term231654;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term231654, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


