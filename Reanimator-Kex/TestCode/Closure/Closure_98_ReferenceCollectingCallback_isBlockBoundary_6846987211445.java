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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462908;
     Object term462935;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term462908 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term462908, term462908.getClass(), "type", 77);
        term462935 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term462935, term462935.getClass(), "functionName", null);
        setBooleanField(term462935, term462935.getClass(), "itsNeedsActivation", false);
        setIntField(term462935, term462935.getClass(), "itsFunctionType", 0);
        setBooleanField(term462935, term462935.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term462935, term462935.getClass(), "encodedSourceStart", 0);
        setIntField(term462935, term462935.getClass(), "encodedSourceEnd", 0);
        setField(term462935, term462935.getClass(), "sourceName", null);
        setIntField(term462935, term462935.getClass(), "baseLineno", 0);
        setIntField(term462935, term462935.getClass(), "endLineno", 0);
        setField(term462935, term462935.getClass(), "functions", null);
        setField(term462935, term462935.getClass(), "regexps", null);
        setField(term462935, term462935.getClass(), "itsVariables", null);
        setField(term462935, term462935.getClass(), "itsConst", null);
        setField(term462935, term462935.getClass(), "itsVariableNames", null);
        setIntField(term462935, term462935.getClass(), "varStart", 0);
        setField(term462935, term462935.getClass(), "compilerData", null);
        setIntField(term462935, term462935.getClass(), "type", 77);
        setField(term462935, term462935.getClass(), "next", null);
        setField(term462935, term462935.getClass(), "first", null);
        setField(term462935, term462935.getClass(), "last", null);
        setField(term462935, term462935.getClass(), "propListHead", null);
        setIntField(term462935, term462935.getClass(), "sourcePosition", 0);
        setField(term462935, term462935.getClass(), "jsType", null);
        setField(term462935, term462935.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term462908;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term462908, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


