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
import java.lang.Object;

public class CheckAccessControls_getClassOfMethod_1679898606420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209391;
     Object term209483;
     Object term209615;
     Object term209616;

    public CheckAccessControls_getClassOfMethod_1679898606420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209391 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term209483 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term209569 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term209483, term209483.getClass(), "type", 86);
        setField(term209483, term209483.getClass(), "first", term209569);
        term209615 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term209615, term209615.getClass(), "compiler", null);
        setField(term209615, term209615.getClass(), "validator", null);
        setIntField(term209615, term209615.getClass(), "deprecatedDepth", 0);
        setIntField(term209615, term209615.getClass(), "methodDepth", 0);
        setField(term209615, term209615.getClass(), "currentClass", null);
        setField(term209615, term209615.getClass(), "initializedConstantProperties", null);
        term209616 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term209617 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term209616, term209616.getClass(), "number", 0.0);
        setIntField(term209616, term209616.getClass(), "type", 86);
        setField(term209616, term209616.getClass(), "next", null);
        setField(term209617, term209617.getClass(), "functionName", null);
        setBooleanField(term209617, term209617.getClass(), "itsNeedsActivation", false);
        setIntField(term209617, term209617.getClass(), "itsFunctionType", 0);
        setBooleanField(term209617, term209617.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term209617, term209617.getClass(), "encodedSourceStart", 0);
        setIntField(term209617, term209617.getClass(), "encodedSourceEnd", 0);
        setField(term209617, term209617.getClass(), "sourceName", null);
        setIntField(term209617, term209617.getClass(), "baseLineno", 0);
        setIntField(term209617, term209617.getClass(), "endLineno", 0);
        setField(term209617, term209617.getClass(), "functions", null);
        setField(term209617, term209617.getClass(), "regexps", null);
        setField(term209617, term209617.getClass(), "itsVariables", null);
        setField(term209617, term209617.getClass(), "itsConst", null);
        setField(term209617, term209617.getClass(), "itsVariableNames", null);
        setIntField(term209617, term209617.getClass(), "varStart", 0);
        setField(term209617, term209617.getClass(), "compilerData", null);
        setIntField(term209617, term209617.getClass(), "type", 0);
        setField(term209617, term209617.getClass(), "next", null);
        setField(term209617, term209617.getClass(), "first", null);
        setField(term209617, term209617.getClass(), "last", null);
        setField(term209617, term209617.getClass(), "propListHead", null);
        setIntField(term209617, term209617.getClass(), "sourcePosition", 0);
        setField(term209617, term209617.getClass(), "jsType", null);
        setField(term209617, term209617.getClass(), "parent", null);
        setField(term209616, term209616.getClass(), "first", term209617);
        setField(term209616, term209616.getClass(), "last", null);
        setField(term209616, term209616.getClass(), "propListHead", null);
        setIntField(term209616, term209616.getClass(), "sourcePosition", 0);
        setField(term209616, term209616.getClass(), "jsType", null);
        setField(term209616, term209616.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term209483;
        Object retValue = callMethod(klass, "getClassOfMethod", argTypes, term209391, args);
        assertTrue(recursiveEquals(term209391, term209615));
        assertTrue(recursiveEquals(term209483, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


