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

public class ReferenceCollectingCallback_visit_872273174303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76890;
     Object term77111;
     Object term77068;
     Object term77538;
     Object term77539;
     Object term77540;

    public ReferenceCollectingCallback_visit_872273174303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76890 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term77111 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term77111, term77111.getClass(), "type", 0);
        term77068 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term77068, term77068.getClass(), "type", 98);
        setField(term77068, term77068.getClass(), "first", term77111);
        term77538 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term77538, term77538.getClass(), "referenceMap", null);
        setField(term77538, term77538.getClass(), "blockStack", null);
        setField(term77538, term77538.getClass(), "behavior", null);
        setField(term77538, term77538.getClass(), "compiler", null);
        setField(term77538, term77538.getClass(), "varFilter", null);
        term77539 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term77539, term77539.getClass(), "functionName", null);
        setBooleanField(term77539, term77539.getClass(), "itsNeedsActivation", false);
        setIntField(term77539, term77539.getClass(), "itsFunctionType", 0);
        setBooleanField(term77539, term77539.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term77539, term77539.getClass(), "encodedSourceStart", 0);
        setIntField(term77539, term77539.getClass(), "encodedSourceEnd", 0);
        setField(term77539, term77539.getClass(), "sourceName", null);
        setIntField(term77539, term77539.getClass(), "baseLineno", 0);
        setIntField(term77539, term77539.getClass(), "endLineno", 0);
        setField(term77539, term77539.getClass(), "functions", null);
        setField(term77539, term77539.getClass(), "regexps", null);
        setField(term77539, term77539.getClass(), "itsVariables", null);
        setField(term77539, term77539.getClass(), "itsConst", null);
        setField(term77539, term77539.getClass(), "itsVariableNames", null);
        setIntField(term77539, term77539.getClass(), "varStart", 0);
        setField(term77539, term77539.getClass(), "compilerData", null);
        setIntField(term77539, term77539.getClass(), "type", 0);
        setField(term77539, term77539.getClass(), "next", null);
        setField(term77539, term77539.getClass(), "first", null);
        setField(term77539, term77539.getClass(), "last", null);
        setField(term77539, term77539.getClass(), "propListHead", null);
        setIntField(term77539, term77539.getClass(), "sourcePosition", 0);
        setField(term77539, term77539.getClass(), "jsType", null);
        setField(term77539, term77539.getClass(), "parent", null);
        term77540 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term77541 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setDoubleField(term77540, term77540.getClass(), "number", 0.0);
        setIntField(term77540, term77540.getClass(), "type", 98);
        setField(term77540, term77540.getClass(), "next", null);
        setField(term77541, term77541.getClass(), "functionName", null);
        setBooleanField(term77541, term77541.getClass(), "itsNeedsActivation", false);
        setIntField(term77541, term77541.getClass(), "itsFunctionType", 0);
        setBooleanField(term77541, term77541.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term77541, term77541.getClass(), "encodedSourceStart", 0);
        setIntField(term77541, term77541.getClass(), "encodedSourceEnd", 0);
        setField(term77541, term77541.getClass(), "sourceName", null);
        setIntField(term77541, term77541.getClass(), "baseLineno", 0);
        setIntField(term77541, term77541.getClass(), "endLineno", 0);
        setField(term77541, term77541.getClass(), "functions", null);
        setField(term77541, term77541.getClass(), "regexps", null);
        setField(term77541, term77541.getClass(), "itsVariables", null);
        setField(term77541, term77541.getClass(), "itsConst", null);
        setField(term77541, term77541.getClass(), "itsVariableNames", null);
        setIntField(term77541, term77541.getClass(), "varStart", 0);
        setField(term77541, term77541.getClass(), "compilerData", null);
        setIntField(term77541, term77541.getClass(), "type", 0);
        setField(term77541, term77541.getClass(), "next", null);
        setField(term77541, term77541.getClass(), "first", null);
        setField(term77541, term77541.getClass(), "last", null);
        setField(term77541, term77541.getClass(), "propListHead", null);
        setIntField(term77541, term77541.getClass(), "sourcePosition", 0);
        setField(term77541, term77541.getClass(), "jsType", null);
        setField(term77541, term77541.getClass(), "parent", null);
        setField(term77540, term77540.getClass(), "first", term77541);
        setField(term77540, term77540.getClass(), "last", null);
        setField(term77540, term77540.getClass(), "propListHead", null);
        setIntField(term77540, term77540.getClass(), "sourcePosition", 0);
        setField(term77540, term77540.getClass(), "jsType", null);
        setField(term77540, term77540.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term77111;
        args[2] = term77068;
        callMethod(klass, "visit", argTypes, term76890, args);
        assertTrue(recursiveEquals(term76890, term77538));
        assertTrue(recursiveEquals(term77111, term77540));
        assertTrue(recursiveEquals(term77068, null));
    }

};


