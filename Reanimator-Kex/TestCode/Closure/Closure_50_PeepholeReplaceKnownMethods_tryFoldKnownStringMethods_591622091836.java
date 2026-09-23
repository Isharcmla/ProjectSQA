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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3704235;
     Object term3704321;
     Object term3705098;
     Object term3705099;
     Object term3704928;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3704235 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3704321 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3704413 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3704505 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3704635 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3704321, term3704321.getClass(), "type", 37);
        setIntField(term3704413, term3704413.getClass(), "type", 33);
        setField(term3704505, term3704505.getClass(), "next", term3704505);
        setIntField(term3704505, term3704505.getClass(), "type", 40);
        setField(term3704505, term3704505.getClass(), "str", "substr");
        setField(term3704413, term3704413.getClass(), "first", term3704505);
        setIntField(term3704635, term3704635.getClass(), "type", 44);
        setField(term3704413, term3704413.getClass(), "next", term3704635);
        setField(term3704321, term3704321.getClass(), "first", term3704413);
        term3705098 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3705098, term3705098.getClass(), "currentTraversal", null);
        term3705099 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3705100 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3705101 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3705102 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3705099, term3705099.getClass(), "functionName", null);
        setBooleanField(term3705099, term3705099.getClass(), "itsNeedsActivation", false);
        setIntField(term3705099, term3705099.getClass(), "itsFunctionType", 0);
        setBooleanField(term3705099, term3705099.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3705099, term3705099.getClass(), "encodedSourceStart", 0);
        setIntField(term3705099, term3705099.getClass(), "encodedSourceEnd", 0);
        setField(term3705099, term3705099.getClass(), "sourceName", null);
        setIntField(term3705099, term3705099.getClass(), "baseLineno", 0);
        setIntField(term3705099, term3705099.getClass(), "endLineno", 0);
        setField(term3705099, term3705099.getClass(), "functions", null);
        setField(term3705099, term3705099.getClass(), "regexps", null);
        setField(term3705099, term3705099.getClass(), "itsVariables", null);
        setField(term3705099, term3705099.getClass(), "itsConst", null);
        setField(term3705099, term3705099.getClass(), "itsVariableNames", null);
        setIntField(term3705099, term3705099.getClass(), "varStart", 0);
        setField(term3705099, term3705099.getClass(), "compilerData", null);
        setIntField(term3705099, term3705099.getClass(), "type", 37);
        setField(term3705099, term3705099.getClass(), "next", null);
        setField(term3705100, term3705100.getClass(), "str", null);
        setIntField(term3705100, term3705100.getClass(), "type", 33);
        setField(term3705101, term3705101.getClass(), "str", null);
        setIntField(term3705101, term3705101.getClass(), "type", 44);
        setField(term3705101, term3705101.getClass(), "next", null);
        setField(term3705101, term3705101.getClass(), "first", null);
        setField(term3705101, term3705101.getClass(), "last", null);
        setField(term3705101, term3705101.getClass(), "propListHead", null);
        setIntField(term3705101, term3705101.getClass(), "sourcePosition", 0);
        setField(term3705101, term3705101.getClass(), "jsType", null);
        setField(term3705101, term3705101.getClass(), "parent", null);
        setField(term3705100, term3705100.getClass(), "next", term3705101);
        setField(term3705102, term3705102.getClass(), "str", "substr");
        setIntField(term3705102, term3705102.getClass(), "type", 40);
        setField(term3705102, term3705102.getClass(), "next", term3705102);
        setField(term3705102, term3705102.getClass(), "first", null);
        setField(term3705102, term3705102.getClass(), "last", null);
        setField(term3705102, term3705102.getClass(), "propListHead", null);
        setIntField(term3705102, term3705102.getClass(), "sourcePosition", 0);
        setField(term3705102, term3705102.getClass(), "jsType", null);
        setField(term3705102, term3705102.getClass(), "parent", null);
        setField(term3705100, term3705100.getClass(), "first", term3705102);
        setField(term3705100, term3705100.getClass(), "last", null);
        setField(term3705100, term3705100.getClass(), "propListHead", null);
        setIntField(term3705100, term3705100.getClass(), "sourcePosition", 0);
        setField(term3705100, term3705100.getClass(), "jsType", null);
        setField(term3705100, term3705100.getClass(), "parent", null);
        setField(term3705099, term3705099.getClass(), "first", term3705100);
        setField(term3705099, term3705099.getClass(), "last", null);
        setField(term3705099, term3705099.getClass(), "propListHead", null);
        setIntField(term3705099, term3705099.getClass(), "sourcePosition", 0);
        setField(term3705099, term3705099.getClass(), "jsType", null);
        setField(term3705099, term3705099.getClass(), "parent", null);
        term3704928 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3704938 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3704940 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3704943 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3704928, term3704928.getClass(), "functionName", null);
        setBooleanField(term3704928, term3704928.getClass(), "itsNeedsActivation", false);
        setIntField(term3704928, term3704928.getClass(), "itsFunctionType", 0);
        setBooleanField(term3704928, term3704928.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3704928, term3704928.getClass(), "encodedSourceStart", 0);
        setIntField(term3704928, term3704928.getClass(), "encodedSourceEnd", 0);
        setField(term3704928, term3704928.getClass(), "sourceName", null);
        setIntField(term3704928, term3704928.getClass(), "baseLineno", 0);
        setIntField(term3704928, term3704928.getClass(), "endLineno", 0);
        setField(term3704928, term3704928.getClass(), "functions", null);
        setField(term3704928, term3704928.getClass(), "regexps", null);
        setField(term3704928, term3704928.getClass(), "itsVariables", null);
        setField(term3704928, term3704928.getClass(), "itsConst", null);
        setField(term3704928, term3704928.getClass(), "itsVariableNames", null);
        setIntField(term3704928, term3704928.getClass(), "varStart", 0);
        setField(term3704928, term3704928.getClass(), "compilerData", null);
        setIntField(term3704928, term3704928.getClass(), "type", 37);
        setField(term3704928, term3704928.getClass(), "next", null);
        setField(term3704938, term3704938.getClass(), "str", null);
        setIntField(term3704938, term3704938.getClass(), "type", 33);
        setField(term3704940, term3704940.getClass(), "str", null);
        setIntField(term3704940, term3704940.getClass(), "type", 44);
        setField(term3704940, term3704940.getClass(), "next", null);
        setField(term3704940, term3704940.getClass(), "first", null);
        setField(term3704940, term3704940.getClass(), "last", null);
        setField(term3704940, term3704940.getClass(), "propListHead", null);
        setIntField(term3704940, term3704940.getClass(), "sourcePosition", 0);
        setField(term3704940, term3704940.getClass(), "jsType", null);
        setField(term3704940, term3704940.getClass(), "parent", null);
        setField(term3704938, term3704938.getClass(), "next", term3704940);
        setField(term3704943, term3704943.getClass(), "str", "substr");
        setIntField(term3704943, term3704943.getClass(), "type", 40);
        setField(term3704943, term3704943.getClass(), "next", term3704943);
        setField(term3704943, term3704943.getClass(), "first", null);
        setField(term3704943, term3704943.getClass(), "last", null);
        setField(term3704943, term3704943.getClass(), "propListHead", null);
        setIntField(term3704943, term3704943.getClass(), "sourcePosition", 0);
        setField(term3704943, term3704943.getClass(), "jsType", null);
        setField(term3704943, term3704943.getClass(), "parent", null);
        setField(term3704938, term3704938.getClass(), "first", term3704943);
        setField(term3704938, term3704938.getClass(), "last", null);
        setField(term3704938, term3704938.getClass(), "propListHead", null);
        setIntField(term3704938, term3704938.getClass(), "sourcePosition", 0);
        setField(term3704938, term3704938.getClass(), "jsType", null);
        setField(term3704938, term3704938.getClass(), "parent", null);
        setField(term3704928, term3704928.getClass(), "first", term3704938);
        setField(term3704928, term3704928.getClass(), "last", null);
        setField(term3704928, term3704928.getClass(), "propListHead", null);
        setIntField(term3704928, term3704928.getClass(), "sourcePosition", 0);
        setField(term3704928, term3704928.getClass(), "jsType", null);
        setField(term3704928, term3704928.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3704321;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3704235, args);
        assertTrue(recursiveEquals(term3704235, term3705098));
        assertTrue(recursiveEquals(term3704321, term3705099));
        assertTrue(recursiveEquals(retValue, term3704928));
    }

};


