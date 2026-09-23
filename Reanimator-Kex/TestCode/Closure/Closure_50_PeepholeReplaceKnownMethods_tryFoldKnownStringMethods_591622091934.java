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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3785194;
     Object term3785280;
     Object term3786406;
     Object term3786407;
     Object term3786234;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3785194 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3785280 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3785372 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3785464 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3785594 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3785280, term3785280.getClass(), "type", 37);
        setIntField(term3785372, term3785372.getClass(), "type", 35);
        setField(term3785464, term3785464.getClass(), "next", term3785464);
        setIntField(term3785464, term3785464.getClass(), "type", 40);
        setField(term3785464, term3785464.getClass(), "str", "substr");
        setField(term3785372, term3785372.getClass(), "first", term3785464);
        setIntField(term3785594, term3785594.getClass(), "type", 43);
        setField(term3785372, term3785372.getClass(), "next", term3785594);
        setField(term3785280, term3785280.getClass(), "first", term3785372);
        term3786406 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3786406, term3786406.getClass(), "currentTraversal", null);
        term3786407 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3786408 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3786409 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3786410 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3786407, term3786407.getClass(), "functionName", null);
        setBooleanField(term3786407, term3786407.getClass(), "itsNeedsActivation", false);
        setIntField(term3786407, term3786407.getClass(), "itsFunctionType", 0);
        setBooleanField(term3786407, term3786407.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3786407, term3786407.getClass(), "encodedSourceStart", 0);
        setIntField(term3786407, term3786407.getClass(), "encodedSourceEnd", 0);
        setField(term3786407, term3786407.getClass(), "sourceName", null);
        setIntField(term3786407, term3786407.getClass(), "baseLineno", 0);
        setIntField(term3786407, term3786407.getClass(), "endLineno", 0);
        setField(term3786407, term3786407.getClass(), "functions", null);
        setField(term3786407, term3786407.getClass(), "regexps", null);
        setField(term3786407, term3786407.getClass(), "itsVariables", null);
        setField(term3786407, term3786407.getClass(), "itsConst", null);
        setField(term3786407, term3786407.getClass(), "itsVariableNames", null);
        setIntField(term3786407, term3786407.getClass(), "varStart", 0);
        setField(term3786407, term3786407.getClass(), "compilerData", null);
        setIntField(term3786407, term3786407.getClass(), "type", 37);
        setField(term3786407, term3786407.getClass(), "next", null);
        setField(term3786408, term3786408.getClass(), "str", null);
        setIntField(term3786408, term3786408.getClass(), "type", 35);
        setField(term3786409, term3786409.getClass(), "str", null);
        setIntField(term3786409, term3786409.getClass(), "type", 43);
        setField(term3786409, term3786409.getClass(), "next", null);
        setField(term3786409, term3786409.getClass(), "first", null);
        setField(term3786409, term3786409.getClass(), "last", null);
        setField(term3786409, term3786409.getClass(), "propListHead", null);
        setIntField(term3786409, term3786409.getClass(), "sourcePosition", 0);
        setField(term3786409, term3786409.getClass(), "jsType", null);
        setField(term3786409, term3786409.getClass(), "parent", null);
        setField(term3786408, term3786408.getClass(), "next", term3786409);
        setField(term3786410, term3786410.getClass(), "str", "substr");
        setIntField(term3786410, term3786410.getClass(), "type", 40);
        setField(term3786410, term3786410.getClass(), "next", term3786410);
        setField(term3786410, term3786410.getClass(), "first", null);
        setField(term3786410, term3786410.getClass(), "last", null);
        setField(term3786410, term3786410.getClass(), "propListHead", null);
        setIntField(term3786410, term3786410.getClass(), "sourcePosition", 0);
        setField(term3786410, term3786410.getClass(), "jsType", null);
        setField(term3786410, term3786410.getClass(), "parent", null);
        setField(term3786408, term3786408.getClass(), "first", term3786410);
        setField(term3786408, term3786408.getClass(), "last", null);
        setField(term3786408, term3786408.getClass(), "propListHead", null);
        setIntField(term3786408, term3786408.getClass(), "sourcePosition", 0);
        setField(term3786408, term3786408.getClass(), "jsType", null);
        setField(term3786408, term3786408.getClass(), "parent", null);
        setField(term3786407, term3786407.getClass(), "first", term3786408);
        setField(term3786407, term3786407.getClass(), "last", null);
        setField(term3786407, term3786407.getClass(), "propListHead", null);
        setIntField(term3786407, term3786407.getClass(), "sourcePosition", 0);
        setField(term3786407, term3786407.getClass(), "jsType", null);
        setField(term3786407, term3786407.getClass(), "parent", null);
        term3786234 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3786244 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3786246 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3786249 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3786234, term3786234.getClass(), "functionName", null);
        setBooleanField(term3786234, term3786234.getClass(), "itsNeedsActivation", false);
        setIntField(term3786234, term3786234.getClass(), "itsFunctionType", 0);
        setBooleanField(term3786234, term3786234.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3786234, term3786234.getClass(), "encodedSourceStart", 0);
        setIntField(term3786234, term3786234.getClass(), "encodedSourceEnd", 0);
        setField(term3786234, term3786234.getClass(), "sourceName", null);
        setIntField(term3786234, term3786234.getClass(), "baseLineno", 0);
        setIntField(term3786234, term3786234.getClass(), "endLineno", 0);
        setField(term3786234, term3786234.getClass(), "functions", null);
        setField(term3786234, term3786234.getClass(), "regexps", null);
        setField(term3786234, term3786234.getClass(), "itsVariables", null);
        setField(term3786234, term3786234.getClass(), "itsConst", null);
        setField(term3786234, term3786234.getClass(), "itsVariableNames", null);
        setIntField(term3786234, term3786234.getClass(), "varStart", 0);
        setField(term3786234, term3786234.getClass(), "compilerData", null);
        setIntField(term3786234, term3786234.getClass(), "type", 37);
        setField(term3786234, term3786234.getClass(), "next", null);
        setField(term3786244, term3786244.getClass(), "str", null);
        setIntField(term3786244, term3786244.getClass(), "type", 35);
        setField(term3786246, term3786246.getClass(), "str", null);
        setIntField(term3786246, term3786246.getClass(), "type", 43);
        setField(term3786246, term3786246.getClass(), "next", null);
        setField(term3786246, term3786246.getClass(), "first", null);
        setField(term3786246, term3786246.getClass(), "last", null);
        setField(term3786246, term3786246.getClass(), "propListHead", null);
        setIntField(term3786246, term3786246.getClass(), "sourcePosition", 0);
        setField(term3786246, term3786246.getClass(), "jsType", null);
        setField(term3786246, term3786246.getClass(), "parent", null);
        setField(term3786244, term3786244.getClass(), "next", term3786246);
        setField(term3786249, term3786249.getClass(), "str", "substr");
        setIntField(term3786249, term3786249.getClass(), "type", 40);
        setField(term3786249, term3786249.getClass(), "next", term3786249);
        setField(term3786249, term3786249.getClass(), "first", null);
        setField(term3786249, term3786249.getClass(), "last", null);
        setField(term3786249, term3786249.getClass(), "propListHead", null);
        setIntField(term3786249, term3786249.getClass(), "sourcePosition", 0);
        setField(term3786249, term3786249.getClass(), "jsType", null);
        setField(term3786249, term3786249.getClass(), "parent", null);
        setField(term3786244, term3786244.getClass(), "first", term3786249);
        setField(term3786244, term3786244.getClass(), "last", null);
        setField(term3786244, term3786244.getClass(), "propListHead", null);
        setIntField(term3786244, term3786244.getClass(), "sourcePosition", 0);
        setField(term3786244, term3786244.getClass(), "jsType", null);
        setField(term3786244, term3786244.getClass(), "parent", null);
        setField(term3786234, term3786234.getClass(), "first", term3786244);
        setField(term3786234, term3786234.getClass(), "last", null);
        setField(term3786234, term3786234.getClass(), "propListHead", null);
        setIntField(term3786234, term3786234.getClass(), "sourcePosition", 0);
        setField(term3786234, term3786234.getClass(), "jsType", null);
        setField(term3786234, term3786234.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3785280;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3785194, args);
        assertTrue(recursiveEquals(term3785194, term3786406));
        assertTrue(recursiveEquals(term3785280, term3786407));
        assertTrue(recursiveEquals(retValue, term3786234));
    }

};


