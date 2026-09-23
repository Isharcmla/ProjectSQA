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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2629802;
     Object term2629894;
     Object term2630509;
     Object term2630510;
     Object term2630450;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2629802 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2629894 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2629980 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2630050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2629894, term2629894.getClass(), "type", 37);
        setIntField(term2629980, term2629980.getClass(), "type", 33);
        setField(term2629980, term2629980.getClass(), "first", term2630050);
        setField(term2629894, term2629894.getClass(), "first", term2629980);
        term2630509 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2630509, term2630509.getClass(), "currentTraversal", null);
        term2630510 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2630511 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2630512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2630510, term2630510.getClass(), "str", null);
        setIntField(term2630510, term2630510.getClass(), "type", 37);
        setField(term2630510, term2630510.getClass(), "next", null);
        setField(term2630511, term2630511.getClass(), "functionName", null);
        setBooleanField(term2630511, term2630511.getClass(), "itsNeedsActivation", false);
        setIntField(term2630511, term2630511.getClass(), "itsFunctionType", 0);
        setBooleanField(term2630511, term2630511.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2630511, term2630511.getClass(), "encodedSourceStart", 0);
        setIntField(term2630511, term2630511.getClass(), "encodedSourceEnd", 0);
        setField(term2630511, term2630511.getClass(), "sourceName", null);
        setIntField(term2630511, term2630511.getClass(), "baseLineno", 0);
        setIntField(term2630511, term2630511.getClass(), "endLineno", 0);
        setField(term2630511, term2630511.getClass(), "functions", null);
        setField(term2630511, term2630511.getClass(), "regexps", null);
        setField(term2630511, term2630511.getClass(), "itsVariables", null);
        setField(term2630511, term2630511.getClass(), "itsConst", null);
        setField(term2630511, term2630511.getClass(), "itsVariableNames", null);
        setIntField(term2630511, term2630511.getClass(), "varStart", 0);
        setField(term2630511, term2630511.getClass(), "compilerData", null);
        setIntField(term2630511, term2630511.getClass(), "type", 33);
        setField(term2630511, term2630511.getClass(), "next", null);
        setIntField(term2630512, term2630512.getClass(), "type", 0);
        setField(term2630512, term2630512.getClass(), "next", null);
        setField(term2630512, term2630512.getClass(), "first", null);
        setField(term2630512, term2630512.getClass(), "last", null);
        setField(term2630512, term2630512.getClass(), "propListHead", null);
        setIntField(term2630512, term2630512.getClass(), "sourcePosition", 0);
        setField(term2630512, term2630512.getClass(), "jsType", null);
        setField(term2630512, term2630512.getClass(), "parent", null);
        setField(term2630511, term2630511.getClass(), "first", term2630512);
        setField(term2630511, term2630511.getClass(), "last", null);
        setField(term2630511, term2630511.getClass(), "propListHead", null);
        setIntField(term2630511, term2630511.getClass(), "sourcePosition", 0);
        setField(term2630511, term2630511.getClass(), "jsType", null);
        setField(term2630511, term2630511.getClass(), "parent", null);
        setField(term2630510, term2630510.getClass(), "first", term2630511);
        setField(term2630510, term2630510.getClass(), "last", null);
        setField(term2630510, term2630510.getClass(), "propListHead", null);
        setIntField(term2630510, term2630510.getClass(), "sourcePosition", 0);
        setField(term2630510, term2630510.getClass(), "jsType", null);
        setField(term2630510, term2630510.getClass(), "parent", null);
        term2630450 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2630452 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2630462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2630450, term2630450.getClass(), "str", null);
        setIntField(term2630450, term2630450.getClass(), "type", 37);
        setField(term2630450, term2630450.getClass(), "next", null);
        setField(term2630452, term2630452.getClass(), "functionName", null);
        setBooleanField(term2630452, term2630452.getClass(), "itsNeedsActivation", false);
        setIntField(term2630452, term2630452.getClass(), "itsFunctionType", 0);
        setBooleanField(term2630452, term2630452.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2630452, term2630452.getClass(), "encodedSourceStart", 0);
        setIntField(term2630452, term2630452.getClass(), "encodedSourceEnd", 0);
        setField(term2630452, term2630452.getClass(), "sourceName", null);
        setIntField(term2630452, term2630452.getClass(), "baseLineno", 0);
        setIntField(term2630452, term2630452.getClass(), "endLineno", 0);
        setField(term2630452, term2630452.getClass(), "functions", null);
        setField(term2630452, term2630452.getClass(), "regexps", null);
        setField(term2630452, term2630452.getClass(), "itsVariables", null);
        setField(term2630452, term2630452.getClass(), "itsConst", null);
        setField(term2630452, term2630452.getClass(), "itsVariableNames", null);
        setIntField(term2630452, term2630452.getClass(), "varStart", 0);
        setField(term2630452, term2630452.getClass(), "compilerData", null);
        setIntField(term2630452, term2630452.getClass(), "type", 33);
        setField(term2630452, term2630452.getClass(), "next", null);
        setIntField(term2630462, term2630462.getClass(), "type", 0);
        setField(term2630462, term2630462.getClass(), "next", null);
        setField(term2630462, term2630462.getClass(), "first", null);
        setField(term2630462, term2630462.getClass(), "last", null);
        setField(term2630462, term2630462.getClass(), "propListHead", null);
        setIntField(term2630462, term2630462.getClass(), "sourcePosition", 0);
        setField(term2630462, term2630462.getClass(), "jsType", null);
        setField(term2630462, term2630462.getClass(), "parent", null);
        setField(term2630452, term2630452.getClass(), "first", term2630462);
        setField(term2630452, term2630452.getClass(), "last", null);
        setField(term2630452, term2630452.getClass(), "propListHead", null);
        setIntField(term2630452, term2630452.getClass(), "sourcePosition", 0);
        setField(term2630452, term2630452.getClass(), "jsType", null);
        setField(term2630452, term2630452.getClass(), "parent", null);
        setField(term2630450, term2630450.getClass(), "first", term2630452);
        setField(term2630450, term2630450.getClass(), "last", null);
        setField(term2630450, term2630450.getClass(), "propListHead", null);
        setIntField(term2630450, term2630450.getClass(), "sourcePosition", 0);
        setField(term2630450, term2630450.getClass(), "jsType", null);
        setField(term2630450, term2630450.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2629894;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2629802, args);
        assertTrue(recursiveEquals(term2629802, term2630509));
        assertTrue(recursiveEquals(term2629894, term2630510));
        assertTrue(recursiveEquals(retValue, term2630450));
    }

};


