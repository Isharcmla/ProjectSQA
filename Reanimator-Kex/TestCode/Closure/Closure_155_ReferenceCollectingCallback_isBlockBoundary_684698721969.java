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

public class ReferenceCollectingCallback_isBlockBoundary_684698721969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246926;
     Object term247012;
     Object term247033;
     Object term247034;

    public ReferenceCollectingCallback_isBlockBoundary_684698721969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246926 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term246926, term246926.getClass(), "type", 111);
        term247012 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term247012, term247012.getClass(), "type", 12);
        term247033 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term247033, term247033.getClass(), "functionName", null);
        setBooleanField(term247033, term247033.getClass(), "itsNeedsActivation", false);
        setIntField(term247033, term247033.getClass(), "itsFunctionType", 0);
        setBooleanField(term247033, term247033.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term247033, term247033.getClass(), "encodedSourceStart", 0);
        setIntField(term247033, term247033.getClass(), "encodedSourceEnd", 0);
        setField(term247033, term247033.getClass(), "sourceName", null);
        setIntField(term247033, term247033.getClass(), "baseLineno", 0);
        setIntField(term247033, term247033.getClass(), "endLineno", 0);
        setField(term247033, term247033.getClass(), "functions", null);
        setField(term247033, term247033.getClass(), "regexps", null);
        setField(term247033, term247033.getClass(), "itsVariables", null);
        setField(term247033, term247033.getClass(), "itsConst", null);
        setField(term247033, term247033.getClass(), "itsVariableNames", null);
        setIntField(term247033, term247033.getClass(), "varStart", 0);
        setField(term247033, term247033.getClass(), "compilerData", null);
        setIntField(term247033, term247033.getClass(), "type", 12);
        setField(term247033, term247033.getClass(), "next", null);
        setField(term247033, term247033.getClass(), "first", null);
        setField(term247033, term247033.getClass(), "last", null);
        setField(term247033, term247033.getClass(), "propListHead", null);
        setIntField(term247033, term247033.getClass(), "sourcePosition", 0);
        setField(term247033, term247033.getClass(), "jsType", null);
        setField(term247033, term247033.getClass(), "parent", null);
        term247034 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term247034, term247034.getClass(), "number", 0.0);
        setIntField(term247034, term247034.getClass(), "type", 111);
        setField(term247034, term247034.getClass(), "next", null);
        setField(term247034, term247034.getClass(), "first", null);
        setField(term247034, term247034.getClass(), "last", null);
        setField(term247034, term247034.getClass(), "propListHead", null);
        setIntField(term247034, term247034.getClass(), "sourcePosition", 0);
        setField(term247034, term247034.getClass(), "jsType", null);
        setField(term247034, term247034.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term246926;
        args[1] = term247012;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term246926, term247033));
        assertTrue(recursiveEquals(term247012, term247034));
        assertTrue(recursiveEquals(retValue, true));
    }

};


