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

public class ReferenceCollectingCallback_isBlockBoundary_684698721715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189484;
     Object term189570;
     Object term189620;
     Object term189621;

    public ReferenceCollectingCallback_isBlockBoundary_684698721715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189484 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term189570 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term189570, term189570.getClass(), "type", 12);
        term189620 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term189620, term189620.getClass(), "functionName", null);
        setBooleanField(term189620, term189620.getClass(), "itsNeedsActivation", false);
        setIntField(term189620, term189620.getClass(), "itsFunctionType", 0);
        setBooleanField(term189620, term189620.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term189620, term189620.getClass(), "encodedSourceStart", 0);
        setIntField(term189620, term189620.getClass(), "encodedSourceEnd", 0);
        setField(term189620, term189620.getClass(), "sourceName", null);
        setIntField(term189620, term189620.getClass(), "baseLineno", 0);
        setIntField(term189620, term189620.getClass(), "endLineno", 0);
        setField(term189620, term189620.getClass(), "functions", null);
        setField(term189620, term189620.getClass(), "regexps", null);
        setField(term189620, term189620.getClass(), "itsVariables", null);
        setField(term189620, term189620.getClass(), "itsConst", null);
        setField(term189620, term189620.getClass(), "itsVariableNames", null);
        setIntField(term189620, term189620.getClass(), "varStart", 0);
        setField(term189620, term189620.getClass(), "compilerData", null);
        setIntField(term189620, term189620.getClass(), "type", 12);
        setField(term189620, term189620.getClass(), "next", null);
        setField(term189620, term189620.getClass(), "first", null);
        setField(term189620, term189620.getClass(), "last", null);
        setField(term189620, term189620.getClass(), "propListHead", null);
        setIntField(term189620, term189620.getClass(), "sourcePosition", 0);
        setField(term189620, term189620.getClass(), "jsType", null);
        setField(term189620, term189620.getClass(), "parent", null);
        term189621 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term189621, term189621.getClass(), "functionName", null);
        setBooleanField(term189621, term189621.getClass(), "itsNeedsActivation", false);
        setIntField(term189621, term189621.getClass(), "itsFunctionType", 0);
        setBooleanField(term189621, term189621.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term189621, term189621.getClass(), "encodedSourceStart", 0);
        setIntField(term189621, term189621.getClass(), "encodedSourceEnd", 0);
        setField(term189621, term189621.getClass(), "sourceName", null);
        setIntField(term189621, term189621.getClass(), "baseLineno", 0);
        setIntField(term189621, term189621.getClass(), "endLineno", 0);
        setField(term189621, term189621.getClass(), "functions", null);
        setField(term189621, term189621.getClass(), "regexps", null);
        setField(term189621, term189621.getClass(), "itsVariables", null);
        setField(term189621, term189621.getClass(), "itsConst", null);
        setField(term189621, term189621.getClass(), "itsVariableNames", null);
        setIntField(term189621, term189621.getClass(), "varStart", 0);
        setField(term189621, term189621.getClass(), "compilerData", null);
        setIntField(term189621, term189621.getClass(), "type", 0);
        setField(term189621, term189621.getClass(), "next", null);
        setField(term189621, term189621.getClass(), "first", null);
        setField(term189621, term189621.getClass(), "last", null);
        setField(term189621, term189621.getClass(), "propListHead", null);
        setIntField(term189621, term189621.getClass(), "sourcePosition", 0);
        setField(term189621, term189621.getClass(), "jsType", null);
        setField(term189621, term189621.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term189484;
        args[1] = term189570;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term189484, term189620));
        assertTrue(recursiveEquals(term189570, term189621));
        assertTrue(recursiveEquals(retValue, false));
    }

};


