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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3535628;
     Object term3535714;
     Object term3537025;
     Object term3537026;
     Object term3536933;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3535628 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3535714 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3535806 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3535898 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3536006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3535714, term3535714.getClass(), "type", 37);
        setIntField(term3535806, term3535806.getClass(), "type", 33);
        setField(term3535898, term3535898.getClass(), "next", term3535898);
        setIntField(term3535898, term3535898.getClass(), "type", 40);
        setField(term3535898, term3535898.getClass(), "str", "");
        setField(term3535806, term3535806.getClass(), "first", term3535898);
        setIntField(term3536006, term3536006.getClass(), "type", 40);
        setField(term3535806, term3535806.getClass(), "next", term3536006);
        setField(term3535714, term3535714.getClass(), "first", term3535806);
        term3537025 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3537025, term3537025.getClass(), "currentTraversal", null);
        term3537026 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3537027 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3537028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3537029 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3537026, term3537026.getClass(), "functionName", null);
        setBooleanField(term3537026, term3537026.getClass(), "itsNeedsActivation", false);
        setIntField(term3537026, term3537026.getClass(), "itsFunctionType", 0);
        setBooleanField(term3537026, term3537026.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3537026, term3537026.getClass(), "encodedSourceStart", 0);
        setIntField(term3537026, term3537026.getClass(), "encodedSourceEnd", 0);
        setField(term3537026, term3537026.getClass(), "sourceName", null);
        setIntField(term3537026, term3537026.getClass(), "baseLineno", 0);
        setIntField(term3537026, term3537026.getClass(), "endLineno", 0);
        setField(term3537026, term3537026.getClass(), "functions", null);
        setField(term3537026, term3537026.getClass(), "regexps", null);
        setField(term3537026, term3537026.getClass(), "itsVariables", null);
        setField(term3537026, term3537026.getClass(), "itsConst", null);
        setField(term3537026, term3537026.getClass(), "itsVariableNames", null);
        setIntField(term3537026, term3537026.getClass(), "varStart", 0);
        setField(term3537026, term3537026.getClass(), "compilerData", null);
        setIntField(term3537026, term3537026.getClass(), "type", 37);
        setField(term3537026, term3537026.getClass(), "next", null);
        setField(term3537027, term3537027.getClass(), "str", null);
        setIntField(term3537027, term3537027.getClass(), "type", 33);
        setIntField(term3537028, term3537028.getClass(), "type", 40);
        setField(term3537028, term3537028.getClass(), "next", null);
        setField(term3537028, term3537028.getClass(), "first", null);
        setField(term3537028, term3537028.getClass(), "last", null);
        setField(term3537028, term3537028.getClass(), "propListHead", null);
        setIntField(term3537028, term3537028.getClass(), "sourcePosition", 0);
        setField(term3537028, term3537028.getClass(), "jsType", null);
        setField(term3537028, term3537028.getClass(), "parent", null);
        setField(term3537027, term3537027.getClass(), "next", term3537028);
        setField(term3537029, term3537029.getClass(), "str", "");
        setIntField(term3537029, term3537029.getClass(), "type", 40);
        setField(term3537029, term3537029.getClass(), "next", term3537029);
        setField(term3537029, term3537029.getClass(), "first", null);
        setField(term3537029, term3537029.getClass(), "last", null);
        setField(term3537029, term3537029.getClass(), "propListHead", null);
        setIntField(term3537029, term3537029.getClass(), "sourcePosition", 0);
        setField(term3537029, term3537029.getClass(), "jsType", null);
        setField(term3537029, term3537029.getClass(), "parent", null);
        setField(term3537027, term3537027.getClass(), "first", term3537029);
        setField(term3537027, term3537027.getClass(), "last", null);
        setField(term3537027, term3537027.getClass(), "propListHead", null);
        setIntField(term3537027, term3537027.getClass(), "sourcePosition", 0);
        setField(term3537027, term3537027.getClass(), "jsType", null);
        setField(term3537027, term3537027.getClass(), "parent", null);
        setField(term3537026, term3537026.getClass(), "first", term3537027);
        setField(term3537026, term3537026.getClass(), "last", null);
        setField(term3537026, term3537026.getClass(), "propListHead", null);
        setIntField(term3537026, term3537026.getClass(), "sourcePosition", 0);
        setField(term3537026, term3537026.getClass(), "jsType", null);
        setField(term3537026, term3537026.getClass(), "parent", null);
        term3536933 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3536943 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3536945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3536948 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3536933, term3536933.getClass(), "functionName", null);
        setBooleanField(term3536933, term3536933.getClass(), "itsNeedsActivation", false);
        setIntField(term3536933, term3536933.getClass(), "itsFunctionType", 0);
        setBooleanField(term3536933, term3536933.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3536933, term3536933.getClass(), "encodedSourceStart", 0);
        setIntField(term3536933, term3536933.getClass(), "encodedSourceEnd", 0);
        setField(term3536933, term3536933.getClass(), "sourceName", null);
        setIntField(term3536933, term3536933.getClass(), "baseLineno", 0);
        setIntField(term3536933, term3536933.getClass(), "endLineno", 0);
        setField(term3536933, term3536933.getClass(), "functions", null);
        setField(term3536933, term3536933.getClass(), "regexps", null);
        setField(term3536933, term3536933.getClass(), "itsVariables", null);
        setField(term3536933, term3536933.getClass(), "itsConst", null);
        setField(term3536933, term3536933.getClass(), "itsVariableNames", null);
        setIntField(term3536933, term3536933.getClass(), "varStart", 0);
        setField(term3536933, term3536933.getClass(), "compilerData", null);
        setIntField(term3536933, term3536933.getClass(), "type", 37);
        setField(term3536933, term3536933.getClass(), "next", null);
        setField(term3536943, term3536943.getClass(), "str", null);
        setIntField(term3536943, term3536943.getClass(), "type", 33);
        setIntField(term3536945, term3536945.getClass(), "type", 40);
        setField(term3536945, term3536945.getClass(), "next", null);
        setField(term3536945, term3536945.getClass(), "first", null);
        setField(term3536945, term3536945.getClass(), "last", null);
        setField(term3536945, term3536945.getClass(), "propListHead", null);
        setIntField(term3536945, term3536945.getClass(), "sourcePosition", 0);
        setField(term3536945, term3536945.getClass(), "jsType", null);
        setField(term3536945, term3536945.getClass(), "parent", null);
        setField(term3536943, term3536943.getClass(), "next", term3536945);
        setField(term3536948, term3536948.getClass(), "str", "");
        setIntField(term3536948, term3536948.getClass(), "type", 40);
        setField(term3536948, term3536948.getClass(), "next", term3536948);
        setField(term3536948, term3536948.getClass(), "first", null);
        setField(term3536948, term3536948.getClass(), "last", null);
        setField(term3536948, term3536948.getClass(), "propListHead", null);
        setIntField(term3536948, term3536948.getClass(), "sourcePosition", 0);
        setField(term3536948, term3536948.getClass(), "jsType", null);
        setField(term3536948, term3536948.getClass(), "parent", null);
        setField(term3536943, term3536943.getClass(), "first", term3536948);
        setField(term3536943, term3536943.getClass(), "last", null);
        setField(term3536943, term3536943.getClass(), "propListHead", null);
        setIntField(term3536943, term3536943.getClass(), "sourcePosition", 0);
        setField(term3536943, term3536943.getClass(), "jsType", null);
        setField(term3536943, term3536943.getClass(), "parent", null);
        setField(term3536933, term3536933.getClass(), "first", term3536943);
        setField(term3536933, term3536933.getClass(), "last", null);
        setField(term3536933, term3536933.getClass(), "propListHead", null);
        setIntField(term3536933, term3536933.getClass(), "sourcePosition", 0);
        setField(term3536933, term3536933.getClass(), "jsType", null);
        setField(term3536933, term3536933.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3535714;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3535628, args);
        assertTrue(recursiveEquals(term3535628, term3537025));
        assertTrue(recursiveEquals(term3535714, term3537026));
        assertTrue(recursiveEquals(retValue, term3536933));
    }

};


