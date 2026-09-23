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

public class ReferenceCollectingCallback_isBlockBoundary_684698721892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239284;
     Object term239765;

    public ReferenceCollectingCallback_isBlockBoundary_684698721892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239284 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term239284, term239284.getClass(), "type", 101);
        term239765 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term239765, term239765.getClass(), "functionName", null);
        setBooleanField(term239765, term239765.getClass(), "itsNeedsActivation", false);
        setIntField(term239765, term239765.getClass(), "itsFunctionType", 0);
        setBooleanField(term239765, term239765.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term239765, term239765.getClass(), "encodedSourceStart", 0);
        setIntField(term239765, term239765.getClass(), "encodedSourceEnd", 0);
        setField(term239765, term239765.getClass(), "sourceName", null);
        setIntField(term239765, term239765.getClass(), "baseLineno", 0);
        setIntField(term239765, term239765.getClass(), "endLineno", 0);
        setField(term239765, term239765.getClass(), "functions", null);
        setField(term239765, term239765.getClass(), "regexps", null);
        setField(term239765, term239765.getClass(), "itsVariables", null);
        setField(term239765, term239765.getClass(), "itsConst", null);
        setField(term239765, term239765.getClass(), "itsVariableNames", null);
        setIntField(term239765, term239765.getClass(), "varStart", 0);
        setField(term239765, term239765.getClass(), "compilerData", null);
        setIntField(term239765, term239765.getClass(), "type", 101);
        setField(term239765, term239765.getClass(), "next", null);
        setField(term239765, term239765.getClass(), "first", null);
        setField(term239765, term239765.getClass(), "last", null);
        setField(term239765, term239765.getClass(), "propListHead", null);
        setIntField(term239765, term239765.getClass(), "sourcePosition", 0);
        setField(term239765, term239765.getClass(), "jsType", null);
        setField(term239765, term239765.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term239284;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term239284, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


