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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2694616;
     Object term2694708;
     Object term2695938;
     Object term2695939;
     Object term2695706;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2694616 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2694708 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2694800 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2694892 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2694984 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2695070 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2694800, term2694800.getClass(), "type", 35);
        setIntField(term2694984, term2694984.getClass(), "type", 40);
        setField(term2694984, term2694984.getClass(), "str", null);
        setField(term2694892, term2694892.getClass(), "next", term2694984);
        setIntField(term2694892, term2694892.getClass(), "type", 40);
        setField(term2694800, term2694800.getClass(), "first", term2694892);
        setField(term2694800, term2694800.getClass(), "next", term2695070);
        setField(term2694708, term2694708.getClass(), "first", term2694800);
        setIntField(term2694708, term2694708.getClass(), "type", 37);
        term2695938 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2695938, term2695938.getClass(), "currentTraversal", null);
        term2695939 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2695940 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2695941 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2695942 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2695943 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2695939, term2695939.getClass(), "str", null);
        setIntField(term2695939, term2695939.getClass(), "type", 37);
        setField(term2695939, term2695939.getClass(), "next", null);
        setField(term2695940, term2695940.getClass(), "str", null);
        setIntField(term2695940, term2695940.getClass(), "type", 35);
        setField(term2695941, term2695941.getClass(), "functionName", null);
        setBooleanField(term2695941, term2695941.getClass(), "itsNeedsActivation", false);
        setIntField(term2695941, term2695941.getClass(), "itsFunctionType", 0);
        setBooleanField(term2695941, term2695941.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2695941, term2695941.getClass(), "encodedSourceStart", 0);
        setIntField(term2695941, term2695941.getClass(), "encodedSourceEnd", 0);
        setField(term2695941, term2695941.getClass(), "sourceName", null);
        setIntField(term2695941, term2695941.getClass(), "baseLineno", 0);
        setIntField(term2695941, term2695941.getClass(), "endLineno", 0);
        setField(term2695941, term2695941.getClass(), "functions", null);
        setField(term2695941, term2695941.getClass(), "regexps", null);
        setField(term2695941, term2695941.getClass(), "itsVariables", null);
        setField(term2695941, term2695941.getClass(), "itsConst", null);
        setField(term2695941, term2695941.getClass(), "itsVariableNames", null);
        setIntField(term2695941, term2695941.getClass(), "varStart", 0);
        setField(term2695941, term2695941.getClass(), "compilerData", null);
        setIntField(term2695941, term2695941.getClass(), "type", 0);
        setField(term2695941, term2695941.getClass(), "next", null);
        setField(term2695941, term2695941.getClass(), "first", null);
        setField(term2695941, term2695941.getClass(), "last", null);
        setField(term2695941, term2695941.getClass(), "propListHead", null);
        setIntField(term2695941, term2695941.getClass(), "sourcePosition", 0);
        setField(term2695941, term2695941.getClass(), "jsType", null);
        setField(term2695941, term2695941.getClass(), "parent", null);
        setField(term2695940, term2695940.getClass(), "next", term2695941);
        setField(term2695942, term2695942.getClass(), "str", null);
        setIntField(term2695942, term2695942.getClass(), "type", 40);
        setField(term2695943, term2695943.getClass(), "str", null);
        setIntField(term2695943, term2695943.getClass(), "type", 40);
        setField(term2695943, term2695943.getClass(), "next", null);
        setField(term2695943, term2695943.getClass(), "first", null);
        setField(term2695943, term2695943.getClass(), "last", null);
        setField(term2695943, term2695943.getClass(), "propListHead", null);
        setIntField(term2695943, term2695943.getClass(), "sourcePosition", 0);
        setField(term2695943, term2695943.getClass(), "jsType", null);
        setField(term2695943, term2695943.getClass(), "parent", null);
        setField(term2695942, term2695942.getClass(), "next", term2695943);
        setField(term2695942, term2695942.getClass(), "first", null);
        setField(term2695942, term2695942.getClass(), "last", null);
        setField(term2695942, term2695942.getClass(), "propListHead", null);
        setIntField(term2695942, term2695942.getClass(), "sourcePosition", 0);
        setField(term2695942, term2695942.getClass(), "jsType", null);
        setField(term2695942, term2695942.getClass(), "parent", null);
        setField(term2695940, term2695940.getClass(), "first", term2695942);
        setField(term2695940, term2695940.getClass(), "last", null);
        setField(term2695940, term2695940.getClass(), "propListHead", null);
        setIntField(term2695940, term2695940.getClass(), "sourcePosition", 0);
        setField(term2695940, term2695940.getClass(), "jsType", null);
        setField(term2695940, term2695940.getClass(), "parent", null);
        setField(term2695939, term2695939.getClass(), "first", term2695940);
        setField(term2695939, term2695939.getClass(), "last", null);
        setField(term2695939, term2695939.getClass(), "propListHead", null);
        setIntField(term2695939, term2695939.getClass(), "sourcePosition", 0);
        setField(term2695939, term2695939.getClass(), "jsType", null);
        setField(term2695939, term2695939.getClass(), "parent", null);
        term2695706 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2695708 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2695710 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2695721 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2695723 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2695706, term2695706.getClass(), "str", null);
        setIntField(term2695706, term2695706.getClass(), "type", 37);
        setField(term2695706, term2695706.getClass(), "next", null);
        setField(term2695708, term2695708.getClass(), "str", null);
        setIntField(term2695708, term2695708.getClass(), "type", 35);
        setField(term2695710, term2695710.getClass(), "functionName", null);
        setBooleanField(term2695710, term2695710.getClass(), "itsNeedsActivation", false);
        setIntField(term2695710, term2695710.getClass(), "itsFunctionType", 0);
        setBooleanField(term2695710, term2695710.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2695710, term2695710.getClass(), "encodedSourceStart", 0);
        setIntField(term2695710, term2695710.getClass(), "encodedSourceEnd", 0);
        setField(term2695710, term2695710.getClass(), "sourceName", null);
        setIntField(term2695710, term2695710.getClass(), "baseLineno", 0);
        setIntField(term2695710, term2695710.getClass(), "endLineno", 0);
        setField(term2695710, term2695710.getClass(), "functions", null);
        setField(term2695710, term2695710.getClass(), "regexps", null);
        setField(term2695710, term2695710.getClass(), "itsVariables", null);
        setField(term2695710, term2695710.getClass(), "itsConst", null);
        setField(term2695710, term2695710.getClass(), "itsVariableNames", null);
        setIntField(term2695710, term2695710.getClass(), "varStart", 0);
        setField(term2695710, term2695710.getClass(), "compilerData", null);
        setIntField(term2695710, term2695710.getClass(), "type", 0);
        setField(term2695710, term2695710.getClass(), "next", null);
        setField(term2695710, term2695710.getClass(), "first", null);
        setField(term2695710, term2695710.getClass(), "last", null);
        setField(term2695710, term2695710.getClass(), "propListHead", null);
        setIntField(term2695710, term2695710.getClass(), "sourcePosition", 0);
        setField(term2695710, term2695710.getClass(), "jsType", null);
        setField(term2695710, term2695710.getClass(), "parent", null);
        setField(term2695708, term2695708.getClass(), "next", term2695710);
        setField(term2695721, term2695721.getClass(), "str", null);
        setIntField(term2695721, term2695721.getClass(), "type", 40);
        setField(term2695723, term2695723.getClass(), "str", null);
        setIntField(term2695723, term2695723.getClass(), "type", 40);
        setField(term2695723, term2695723.getClass(), "next", null);
        setField(term2695723, term2695723.getClass(), "first", null);
        setField(term2695723, term2695723.getClass(), "last", null);
        setField(term2695723, term2695723.getClass(), "propListHead", null);
        setIntField(term2695723, term2695723.getClass(), "sourcePosition", 0);
        setField(term2695723, term2695723.getClass(), "jsType", null);
        setField(term2695723, term2695723.getClass(), "parent", null);
        setField(term2695721, term2695721.getClass(), "next", term2695723);
        setField(term2695721, term2695721.getClass(), "first", null);
        setField(term2695721, term2695721.getClass(), "last", null);
        setField(term2695721, term2695721.getClass(), "propListHead", null);
        setIntField(term2695721, term2695721.getClass(), "sourcePosition", 0);
        setField(term2695721, term2695721.getClass(), "jsType", null);
        setField(term2695721, term2695721.getClass(), "parent", null);
        setField(term2695708, term2695708.getClass(), "first", term2695721);
        setField(term2695708, term2695708.getClass(), "last", null);
        setField(term2695708, term2695708.getClass(), "propListHead", null);
        setIntField(term2695708, term2695708.getClass(), "sourcePosition", 0);
        setField(term2695708, term2695708.getClass(), "jsType", null);
        setField(term2695708, term2695708.getClass(), "parent", null);
        setField(term2695706, term2695706.getClass(), "first", term2695708);
        setField(term2695706, term2695706.getClass(), "last", null);
        setField(term2695706, term2695706.getClass(), "propListHead", null);
        setIntField(term2695706, term2695706.getClass(), "sourcePosition", 0);
        setField(term2695706, term2695706.getClass(), "jsType", null);
        setField(term2695706, term2695706.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2694708;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term2694616, args);
        assertTrue(recursiveEquals(term2694616, term2695938));
        assertTrue(recursiveEquals(term2694708, term2695939));
        assertTrue(recursiveEquals(retValue, term2695706));
    }

};


