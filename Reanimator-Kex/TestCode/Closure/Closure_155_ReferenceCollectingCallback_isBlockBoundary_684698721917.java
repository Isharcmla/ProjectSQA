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

public class ReferenceCollectingCallback_isBlockBoundary_684698721917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235670;
     Object term235686;

    public ReferenceCollectingCallback_isBlockBoundary_684698721917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235670 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term235670, term235670.getClass(), "type", 101);
        term235686 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term235686, term235686.getClass(), "functionName", null);
        setBooleanField(term235686, term235686.getClass(), "itsNeedsActivation", false);
        setIntField(term235686, term235686.getClass(), "itsFunctionType", 0);
        setBooleanField(term235686, term235686.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term235686, term235686.getClass(), "encodedSourceStart", 0);
        setIntField(term235686, term235686.getClass(), "encodedSourceEnd", 0);
        setField(term235686, term235686.getClass(), "sourceName", null);
        setIntField(term235686, term235686.getClass(), "baseLineno", 0);
        setIntField(term235686, term235686.getClass(), "endLineno", 0);
        setField(term235686, term235686.getClass(), "functions", null);
        setField(term235686, term235686.getClass(), "regexps", null);
        setField(term235686, term235686.getClass(), "itsVariables", null);
        setField(term235686, term235686.getClass(), "itsConst", null);
        setField(term235686, term235686.getClass(), "itsVariableNames", null);
        setIntField(term235686, term235686.getClass(), "varStart", 0);
        setField(term235686, term235686.getClass(), "compilerData", null);
        setIntField(term235686, term235686.getClass(), "type", 101);
        setField(term235686, term235686.getClass(), "next", null);
        setField(term235686, term235686.getClass(), "first", null);
        setField(term235686, term235686.getClass(), "last", null);
        setField(term235686, term235686.getClass(), "propListHead", null);
        setIntField(term235686, term235686.getClass(), "sourcePosition", 0);
        setField(term235686, term235686.getClass(), "jsType", null);
        setField(term235686, term235686.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term235670;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term235670, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


