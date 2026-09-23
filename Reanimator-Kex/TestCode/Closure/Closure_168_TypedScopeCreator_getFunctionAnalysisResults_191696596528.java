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
import java.util.HashMap;

public class TypedScopeCreator_getFunctionAnalysisResults_191696596528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10202;
     Object term10320;
     Object term10549;
     Object term10551;

    public TypedScopeCreator_getFunctionAnalysisResults_191696596528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10250 = new HashMap();
        term10202 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term10202, term10202.getClass(), "functionAnalysisResults", term10250);
        term10320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        HashMap term10550 = new HashMap();
        term10549 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term10549, term10549.getClass(), "compiler", null);
        setField(term10549, term10549.getClass(), "typeParsingErrorReporter", null);
        setField(term10549, term10549.getClass(), "validator", null);
        setField(term10549, term10549.getClass(), "codingConvention", null);
        setField(term10549, term10549.getClass(), "typeRegistry", null);
        setField(term10549, term10549.getClass(), "delegateProxyPrototypes", null);
        setField(term10549, term10549.getClass(), "delegateCallingConventions", null);
        setField(term10549, term10549.getClass(), "functionAnalysisResults", term10550);
        term10551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10551, term10551.getClass(), "type", 0);
        setField(term10551, term10551.getClass(), "next", null);
        setField(term10551, term10551.getClass(), "first", null);
        setField(term10551, term10551.getClass(), "last", null);
        setField(term10551, term10551.getClass(), "propListHead", null);
        setIntField(term10551, term10551.getClass(), "sourcePosition", 0);
        setField(term10551, term10551.getClass(), "jsType", null);
        setField(term10551, term10551.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10320;
        Object retValue = callMethod(klass, "getFunctionAnalysisResults", argTypes, term10202, args);
        assertTrue(recursiveEquals(term10202, term10549));
        assertTrue(recursiveEquals(term10320, term10551));
        assertTrue(recursiveEquals(retValue, null));
    }

};


