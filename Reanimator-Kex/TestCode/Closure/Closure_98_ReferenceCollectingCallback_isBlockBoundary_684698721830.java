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

public class ReferenceCollectingCallback_isBlockBoundary_684698721830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217885;
     Object term218256;

    public ReferenceCollectingCallback_isBlockBoundary_684698721830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217885 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term217885, term217885.getClass(), "type", 108);
        term218256 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term218256, term218256.getClass(), "functionName", null);
        setBooleanField(term218256, term218256.getClass(), "itsNeedsActivation", false);
        setIntField(term218256, term218256.getClass(), "itsFunctionType", 0);
        setBooleanField(term218256, term218256.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term218256, term218256.getClass(), "encodedSourceStart", 0);
        setIntField(term218256, term218256.getClass(), "encodedSourceEnd", 0);
        setField(term218256, term218256.getClass(), "sourceName", null);
        setIntField(term218256, term218256.getClass(), "baseLineno", 0);
        setIntField(term218256, term218256.getClass(), "endLineno", 0);
        setField(term218256, term218256.getClass(), "functions", null);
        setField(term218256, term218256.getClass(), "regexps", null);
        setField(term218256, term218256.getClass(), "itsVariables", null);
        setField(term218256, term218256.getClass(), "itsConst", null);
        setField(term218256, term218256.getClass(), "itsVariableNames", null);
        setIntField(term218256, term218256.getClass(), "varStart", 0);
        setField(term218256, term218256.getClass(), "compilerData", null);
        setIntField(term218256, term218256.getClass(), "type", 108);
        setField(term218256, term218256.getClass(), "next", null);
        setField(term218256, term218256.getClass(), "first", null);
        setField(term218256, term218256.getClass(), "last", null);
        setField(term218256, term218256.getClass(), "propListHead", null);
        setIntField(term218256, term218256.getClass(), "sourcePosition", 0);
        setField(term218256, term218256.getClass(), "jsType", null);
        setField(term218256, term218256.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term217885;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term217885, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


