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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674025;
     Object term674111;
     Object term674295;
     Object term674387;
     Object term674476;
     Object term674477;
     Object term674479;
     Object term674480;
     Object term674398;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term674025 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term674111 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term674203 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term674203, term674203.getClass(), "type", 108);
        setField(term674111, term674111.getClass(), "parent", term674203);
        setIntField(term674111, term674111.getClass(), "type", 0);
        term674295 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term674295, term674295.getClass(), "type", 102);
        term674387 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term674387, term674387.getClass(), "type", 44);
        term674476 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term674476, term674476.getClass(), "currentTraversal", null);
        term674477 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term674478 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term674477, term674477.getClass(), "functionName", null);
        setBooleanField(term674477, term674477.getClass(), "itsNeedsActivation", false);
        setIntField(term674477, term674477.getClass(), "itsFunctionType", 0);
        setBooleanField(term674477, term674477.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term674477, term674477.getClass(), "encodedSourceStart", 0);
        setIntField(term674477, term674477.getClass(), "encodedSourceEnd", 0);
        setField(term674477, term674477.getClass(), "sourceName", null);
        setIntField(term674477, term674477.getClass(), "baseLineno", 0);
        setIntField(term674477, term674477.getClass(), "endLineno", 0);
        setField(term674477, term674477.getClass(), "functions", null);
        setField(term674477, term674477.getClass(), "regexps", null);
        setField(term674477, term674477.getClass(), "itsVariables", null);
        setField(term674477, term674477.getClass(), "itsConst", null);
        setField(term674477, term674477.getClass(), "itsVariableNames", null);
        setIntField(term674477, term674477.getClass(), "varStart", 0);
        setField(term674477, term674477.getClass(), "compilerData", null);
        setIntField(term674477, term674477.getClass(), "type", 0);
        setField(term674477, term674477.getClass(), "next", null);
        setField(term674477, term674477.getClass(), "first", null);
        setField(term674477, term674477.getClass(), "last", null);
        setField(term674477, term674477.getClass(), "propListHead", null);
        setIntField(term674477, term674477.getClass(), "sourcePosition", 0);
        setField(term674477, term674477.getClass(), "jsType", null);
        setDoubleField(term674478, term674478.getClass(), "number", 0.0);
        setIntField(term674478, term674478.getClass(), "type", 108);
        setField(term674478, term674478.getClass(), "next", null);
        setField(term674478, term674478.getClass(), "first", null);
        setField(term674478, term674478.getClass(), "last", null);
        setField(term674478, term674478.getClass(), "propListHead", null);
        setIntField(term674478, term674478.getClass(), "sourcePosition", 0);
        setField(term674478, term674478.getClass(), "jsType", null);
        setField(term674478, term674478.getClass(), "parent", null);
        setField(term674477, term674477.getClass(), "parent", term674478);
        term674479 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term674479, term674479.getClass(), "number", 0.0);
        setIntField(term674479, term674479.getClass(), "type", 102);
        setField(term674479, term674479.getClass(), "next", null);
        setField(term674479, term674479.getClass(), "first", null);
        setField(term674479, term674479.getClass(), "last", null);
        setField(term674479, term674479.getClass(), "propListHead", null);
        setIntField(term674479, term674479.getClass(), "sourcePosition", 0);
        setField(term674479, term674479.getClass(), "jsType", null);
        setField(term674479, term674479.getClass(), "parent", null);
        term674480 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term674480, term674480.getClass(), "str", null);
        setIntField(term674480, term674480.getClass(), "type", 44);
        setField(term674480, term674480.getClass(), "next", null);
        setField(term674480, term674480.getClass(), "first", null);
        setField(term674480, term674480.getClass(), "last", null);
        setField(term674480, term674480.getClass(), "propListHead", null);
        setIntField(term674480, term674480.getClass(), "sourcePosition", 0);
        setField(term674480, term674480.getClass(), "jsType", null);
        setField(term674480, term674480.getClass(), "parent", null);
        term674398 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term674409 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term674398, term674398.getClass(), "functionName", null);
        setBooleanField(term674398, term674398.getClass(), "itsNeedsActivation", false);
        setIntField(term674398, term674398.getClass(), "itsFunctionType", 0);
        setBooleanField(term674398, term674398.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term674398, term674398.getClass(), "encodedSourceStart", 0);
        setIntField(term674398, term674398.getClass(), "encodedSourceEnd", 0);
        setField(term674398, term674398.getClass(), "sourceName", null);
        setIntField(term674398, term674398.getClass(), "baseLineno", 0);
        setIntField(term674398, term674398.getClass(), "endLineno", 0);
        setField(term674398, term674398.getClass(), "functions", null);
        setField(term674398, term674398.getClass(), "regexps", null);
        setField(term674398, term674398.getClass(), "itsVariables", null);
        setField(term674398, term674398.getClass(), "itsConst", null);
        setField(term674398, term674398.getClass(), "itsVariableNames", null);
        setIntField(term674398, term674398.getClass(), "varStart", 0);
        setField(term674398, term674398.getClass(), "compilerData", null);
        setIntField(term674398, term674398.getClass(), "type", 0);
        setField(term674398, term674398.getClass(), "next", null);
        setField(term674398, term674398.getClass(), "first", null);
        setField(term674398, term674398.getClass(), "last", null);
        setField(term674398, term674398.getClass(), "propListHead", null);
        setIntField(term674398, term674398.getClass(), "sourcePosition", 0);
        setField(term674398, term674398.getClass(), "jsType", null);
        setDoubleField(term674409, term674409.getClass(), "number", 0.0);
        setIntField(term674409, term674409.getClass(), "type", 108);
        setField(term674409, term674409.getClass(), "next", null);
        setField(term674409, term674409.getClass(), "first", null);
        setField(term674409, term674409.getClass(), "last", null);
        setField(term674409, term674409.getClass(), "propListHead", null);
        setIntField(term674409, term674409.getClass(), "sourcePosition", 0);
        setField(term674409, term674409.getClass(), "jsType", null);
        setField(term674409, term674409.getClass(), "parent", null);
        setField(term674398, term674398.getClass(), "parent", term674409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term674111;
        args[1] = term674295;
        args[2] = term674387;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term674025, args);
        assertTrue(recursiveEquals(term674025, term674476));
        assertTrue(recursiveEquals(term674111, term674477));
        assertTrue(recursiveEquals(term674295, term674479));
        assertTrue(recursiveEquals(term674387, term674480));
        assertTrue(recursiveEquals(retValue, term674398));
    }

};


