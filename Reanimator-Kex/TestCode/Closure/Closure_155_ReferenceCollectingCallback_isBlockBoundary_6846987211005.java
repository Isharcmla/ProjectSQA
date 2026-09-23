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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255206;
     Object term256142;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255206 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term255206, term255206.getClass(), "type", 113);
        term256142 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term256142, term256142.getClass(), "functionName", null);
        setBooleanField(term256142, term256142.getClass(), "itsNeedsActivation", false);
        setIntField(term256142, term256142.getClass(), "itsFunctionType", 0);
        setBooleanField(term256142, term256142.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term256142, term256142.getClass(), "encodedSourceStart", 0);
        setIntField(term256142, term256142.getClass(), "encodedSourceEnd", 0);
        setField(term256142, term256142.getClass(), "sourceName", null);
        setIntField(term256142, term256142.getClass(), "baseLineno", 0);
        setIntField(term256142, term256142.getClass(), "endLineno", 0);
        setField(term256142, term256142.getClass(), "functions", null);
        setField(term256142, term256142.getClass(), "regexps", null);
        setField(term256142, term256142.getClass(), "itsVariables", null);
        setField(term256142, term256142.getClass(), "itsConst", null);
        setField(term256142, term256142.getClass(), "itsVariableNames", null);
        setIntField(term256142, term256142.getClass(), "varStart", 0);
        setField(term256142, term256142.getClass(), "compilerData", null);
        setIntField(term256142, term256142.getClass(), "type", 113);
        setField(term256142, term256142.getClass(), "next", null);
        setField(term256142, term256142.getClass(), "first", null);
        setField(term256142, term256142.getClass(), "last", null);
        setField(term256142, term256142.getClass(), "propListHead", null);
        setIntField(term256142, term256142.getClass(), "sourcePosition", 0);
        setField(term256142, term256142.getClass(), "jsType", null);
        setField(term256142, term256142.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term255206;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term255206, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


