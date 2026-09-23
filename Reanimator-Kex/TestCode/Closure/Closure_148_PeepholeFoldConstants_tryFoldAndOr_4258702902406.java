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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669091;
     Object term669183;
     Object term669361;
     Object term669453;
     Object term670328;
     Object term670329;
     Object term670331;
     Object term670332;
     Object term670248;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term669091 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term669183 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term669275 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term669275, term669275.getClass(), "type", 113);
        setField(term669183, term669183.getClass(), "parent", term669275);
        setIntField(term669183, term669183.getClass(), "type", 113);
        term669361 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term669361, term669361.getClass(), "type", 0);
        term669453 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term669453, term669453.getClass(), "type", 47);
        term670328 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term670328, term670328.getClass(), "currentTraversal", null);
        term670329 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term670330 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term670329, term670329.getClass(), "number", 0.0);
        setIntField(term670329, term670329.getClass(), "type", 113);
        setField(term670329, term670329.getClass(), "next", null);
        setField(term670329, term670329.getClass(), "first", null);
        setField(term670329, term670329.getClass(), "last", null);
        setField(term670329, term670329.getClass(), "propListHead", null);
        setIntField(term670329, term670329.getClass(), "sourcePosition", 0);
        setField(term670329, term670329.getClass(), "jsType", null);
        setDoubleField(term670330, term670330.getClass(), "number", 0.0);
        setIntField(term670330, term670330.getClass(), "type", 113);
        setField(term670330, term670330.getClass(), "next", null);
        setField(term670330, term670330.getClass(), "first", null);
        setField(term670330, term670330.getClass(), "last", null);
        setField(term670330, term670330.getClass(), "propListHead", null);
        setIntField(term670330, term670330.getClass(), "sourcePosition", 0);
        setField(term670330, term670330.getClass(), "jsType", null);
        setField(term670330, term670330.getClass(), "parent", null);
        setField(term670329, term670329.getClass(), "parent", term670330);
        term670331 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term670331, term670331.getClass(), "functionName", null);
        setBooleanField(term670331, term670331.getClass(), "itsNeedsActivation", false);
        setIntField(term670331, term670331.getClass(), "itsFunctionType", 0);
        setBooleanField(term670331, term670331.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term670331, term670331.getClass(), "encodedSourceStart", 0);
        setIntField(term670331, term670331.getClass(), "encodedSourceEnd", 0);
        setField(term670331, term670331.getClass(), "sourceName", null);
        setIntField(term670331, term670331.getClass(), "baseLineno", 0);
        setIntField(term670331, term670331.getClass(), "endLineno", 0);
        setField(term670331, term670331.getClass(), "functions", null);
        setField(term670331, term670331.getClass(), "regexps", null);
        setField(term670331, term670331.getClass(), "itsVariables", null);
        setField(term670331, term670331.getClass(), "itsConst", null);
        setField(term670331, term670331.getClass(), "itsVariableNames", null);
        setIntField(term670331, term670331.getClass(), "varStart", 0);
        setField(term670331, term670331.getClass(), "compilerData", null);
        setIntField(term670331, term670331.getClass(), "type", 0);
        setField(term670331, term670331.getClass(), "next", null);
        setField(term670331, term670331.getClass(), "first", null);
        setField(term670331, term670331.getClass(), "last", null);
        setField(term670331, term670331.getClass(), "propListHead", null);
        setIntField(term670331, term670331.getClass(), "sourcePosition", 0);
        setField(term670331, term670331.getClass(), "jsType", null);
        setField(term670331, term670331.getClass(), "parent", null);
        term670332 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term670332, term670332.getClass(), "number", 0.0);
        setIntField(term670332, term670332.getClass(), "type", 47);
        setField(term670332, term670332.getClass(), "next", null);
        setField(term670332, term670332.getClass(), "first", null);
        setField(term670332, term670332.getClass(), "last", null);
        setField(term670332, term670332.getClass(), "propListHead", null);
        setIntField(term670332, term670332.getClass(), "sourcePosition", 0);
        setField(term670332, term670332.getClass(), "jsType", null);
        setField(term670332, term670332.getClass(), "parent", null);
        term670248 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term670252 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term670248, term670248.getClass(), "number", 0.0);
        setIntField(term670248, term670248.getClass(), "type", 113);
        setField(term670248, term670248.getClass(), "next", null);
        setField(term670248, term670248.getClass(), "first", null);
        setField(term670248, term670248.getClass(), "last", null);
        setField(term670248, term670248.getClass(), "propListHead", null);
        setIntField(term670248, term670248.getClass(), "sourcePosition", 0);
        setField(term670248, term670248.getClass(), "jsType", null);
        setDoubleField(term670252, term670252.getClass(), "number", 0.0);
        setIntField(term670252, term670252.getClass(), "type", 113);
        setField(term670252, term670252.getClass(), "next", null);
        setField(term670252, term670252.getClass(), "first", null);
        setField(term670252, term670252.getClass(), "last", null);
        setField(term670252, term670252.getClass(), "propListHead", null);
        setIntField(term670252, term670252.getClass(), "sourcePosition", 0);
        setField(term670252, term670252.getClass(), "jsType", null);
        setField(term670252, term670252.getClass(), "parent", null);
        setField(term670248, term670248.getClass(), "parent", term670252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term669183;
        args[1] = term669361;
        args[2] = term669453;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term669091, args);
        assertTrue(recursiveEquals(term669091, term670328));
        assertTrue(recursiveEquals(term669183, term670329));
        assertTrue(recursiveEquals(term669361, term670331));
        assertTrue(recursiveEquals(term669453, term670332));
        assertTrue(recursiveEquals(retValue, term670248));
    }

};


