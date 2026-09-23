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

public class ReferenceCollectingCallback_visit_872273174610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160237;
     Object term160458;
     Object term160415;
     Object term160523;
     Object term160524;
     Object term160525;

    public ReferenceCollectingCallback_visit_872273174610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160237 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term160458 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term160458, term160458.getClass(), "type", 0);
        term160415 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term160415, term160415.getClass(), "type", 108);
        setField(term160415, term160415.getClass(), "first", term160458);
        term160523 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term160523, term160523.getClass(), "referenceMap", null);
        setField(term160523, term160523.getClass(), "blockStack", null);
        setField(term160523, term160523.getClass(), "behavior", null);
        setField(term160523, term160523.getClass(), "compiler", null);
        setField(term160523, term160523.getClass(), "varFilter", null);
        term160524 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term160524, term160524.getClass(), "functionName", null);
        setBooleanField(term160524, term160524.getClass(), "itsNeedsActivation", false);
        setIntField(term160524, term160524.getClass(), "itsFunctionType", 0);
        setBooleanField(term160524, term160524.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term160524, term160524.getClass(), "encodedSourceStart", 0);
        setIntField(term160524, term160524.getClass(), "encodedSourceEnd", 0);
        setField(term160524, term160524.getClass(), "sourceName", null);
        setIntField(term160524, term160524.getClass(), "baseLineno", 0);
        setIntField(term160524, term160524.getClass(), "endLineno", 0);
        setField(term160524, term160524.getClass(), "functions", null);
        setField(term160524, term160524.getClass(), "regexps", null);
        setField(term160524, term160524.getClass(), "itsVariables", null);
        setField(term160524, term160524.getClass(), "itsConst", null);
        setField(term160524, term160524.getClass(), "itsVariableNames", null);
        setIntField(term160524, term160524.getClass(), "varStart", 0);
        setField(term160524, term160524.getClass(), "compilerData", null);
        setIntField(term160524, term160524.getClass(), "type", 0);
        setField(term160524, term160524.getClass(), "next", null);
        setField(term160524, term160524.getClass(), "first", null);
        setField(term160524, term160524.getClass(), "last", null);
        setField(term160524, term160524.getClass(), "propListHead", null);
        setIntField(term160524, term160524.getClass(), "sourcePosition", 0);
        setField(term160524, term160524.getClass(), "jsType", null);
        setField(term160524, term160524.getClass(), "parent", null);
        term160525 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term160526 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term160525, term160525.getClass(), "str", null);
        setIntField(term160525, term160525.getClass(), "type", 108);
        setField(term160525, term160525.getClass(), "next", null);
        setField(term160526, term160526.getClass(), "functionName", null);
        setBooleanField(term160526, term160526.getClass(), "itsNeedsActivation", false);
        setIntField(term160526, term160526.getClass(), "itsFunctionType", 0);
        setBooleanField(term160526, term160526.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term160526, term160526.getClass(), "encodedSourceStart", 0);
        setIntField(term160526, term160526.getClass(), "encodedSourceEnd", 0);
        setField(term160526, term160526.getClass(), "sourceName", null);
        setIntField(term160526, term160526.getClass(), "baseLineno", 0);
        setIntField(term160526, term160526.getClass(), "endLineno", 0);
        setField(term160526, term160526.getClass(), "functions", null);
        setField(term160526, term160526.getClass(), "regexps", null);
        setField(term160526, term160526.getClass(), "itsVariables", null);
        setField(term160526, term160526.getClass(), "itsConst", null);
        setField(term160526, term160526.getClass(), "itsVariableNames", null);
        setIntField(term160526, term160526.getClass(), "varStart", 0);
        setField(term160526, term160526.getClass(), "compilerData", null);
        setIntField(term160526, term160526.getClass(), "type", 0);
        setField(term160526, term160526.getClass(), "next", null);
        setField(term160526, term160526.getClass(), "first", null);
        setField(term160526, term160526.getClass(), "last", null);
        setField(term160526, term160526.getClass(), "propListHead", null);
        setIntField(term160526, term160526.getClass(), "sourcePosition", 0);
        setField(term160526, term160526.getClass(), "jsType", null);
        setField(term160526, term160526.getClass(), "parent", null);
        setField(term160525, term160525.getClass(), "first", term160526);
        setField(term160525, term160525.getClass(), "last", null);
        setField(term160525, term160525.getClass(), "propListHead", null);
        setIntField(term160525, term160525.getClass(), "sourcePosition", 0);
        setField(term160525, term160525.getClass(), "jsType", null);
        setField(term160525, term160525.getClass(), "parent", null);
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
        args[1] = term160458;
        args[2] = term160415;
        callMethod(klass, "visit", argTypes, term160237, args);
        assertTrue(recursiveEquals(term160237, term160523));
        assertTrue(recursiveEquals(term160458, term160525));
        assertTrue(recursiveEquals(term160415, null));
    }

};


