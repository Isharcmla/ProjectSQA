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

public class PeepholeFoldConstants_tryFoldAndOr_425870290978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309778;
     Object term309864;
     Object term309956;
     Object term310048;
     Object term310437;
     Object term310438;
     Object term310439;
     Object term310440;
     Object term310391;

    public PeepholeFoldConstants_tryFoldAndOr_425870290978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309778 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term309864 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term309864, term309864.getClass(), "parent", null);
        setIntField(term309864, term309864.getClass(), "type", 0);
        term309956 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term309956, term309956.getClass(), "type", 0);
        term310048 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term310437 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term310437, term310437.getClass(), "currentTraversal", null);
        term310438 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term310438, term310438.getClass(), "functionName", null);
        setBooleanField(term310438, term310438.getClass(), "itsNeedsActivation", false);
        setIntField(term310438, term310438.getClass(), "itsFunctionType", 0);
        setBooleanField(term310438, term310438.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term310438, term310438.getClass(), "encodedSourceStart", 0);
        setIntField(term310438, term310438.getClass(), "encodedSourceEnd", 0);
        setField(term310438, term310438.getClass(), "sourceName", null);
        setIntField(term310438, term310438.getClass(), "baseLineno", 0);
        setIntField(term310438, term310438.getClass(), "endLineno", 0);
        setField(term310438, term310438.getClass(), "functions", null);
        setField(term310438, term310438.getClass(), "regexps", null);
        setField(term310438, term310438.getClass(), "itsVariables", null);
        setField(term310438, term310438.getClass(), "itsConst", null);
        setField(term310438, term310438.getClass(), "itsVariableNames", null);
        setIntField(term310438, term310438.getClass(), "varStart", 0);
        setField(term310438, term310438.getClass(), "compilerData", null);
        setIntField(term310438, term310438.getClass(), "type", 0);
        setField(term310438, term310438.getClass(), "next", null);
        setField(term310438, term310438.getClass(), "first", null);
        setField(term310438, term310438.getClass(), "last", null);
        setField(term310438, term310438.getClass(), "propListHead", null);
        setIntField(term310438, term310438.getClass(), "sourcePosition", 0);
        setField(term310438, term310438.getClass(), "jsType", null);
        setField(term310438, term310438.getClass(), "parent", null);
        term310439 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term310439, term310439.getClass(), "str", null);
        setIntField(term310439, term310439.getClass(), "type", 0);
        setField(term310439, term310439.getClass(), "next", null);
        setField(term310439, term310439.getClass(), "first", null);
        setField(term310439, term310439.getClass(), "last", null);
        setField(term310439, term310439.getClass(), "propListHead", null);
        setIntField(term310439, term310439.getClass(), "sourcePosition", 0);
        setField(term310439, term310439.getClass(), "jsType", null);
        setField(term310439, term310439.getClass(), "parent", null);
        term310440 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term310440, term310440.getClass(), "str", null);
        setIntField(term310440, term310440.getClass(), "type", 0);
        setField(term310440, term310440.getClass(), "next", null);
        setField(term310440, term310440.getClass(), "first", null);
        setField(term310440, term310440.getClass(), "last", null);
        setField(term310440, term310440.getClass(), "propListHead", null);
        setIntField(term310440, term310440.getClass(), "sourcePosition", 0);
        setField(term310440, term310440.getClass(), "jsType", null);
        setField(term310440, term310440.getClass(), "parent", null);
        term310391 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term310391, term310391.getClass(), "functionName", null);
        setBooleanField(term310391, term310391.getClass(), "itsNeedsActivation", false);
        setIntField(term310391, term310391.getClass(), "itsFunctionType", 0);
        setBooleanField(term310391, term310391.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term310391, term310391.getClass(), "encodedSourceStart", 0);
        setIntField(term310391, term310391.getClass(), "encodedSourceEnd", 0);
        setField(term310391, term310391.getClass(), "sourceName", null);
        setIntField(term310391, term310391.getClass(), "baseLineno", 0);
        setIntField(term310391, term310391.getClass(), "endLineno", 0);
        setField(term310391, term310391.getClass(), "functions", null);
        setField(term310391, term310391.getClass(), "regexps", null);
        setField(term310391, term310391.getClass(), "itsVariables", null);
        setField(term310391, term310391.getClass(), "itsConst", null);
        setField(term310391, term310391.getClass(), "itsVariableNames", null);
        setIntField(term310391, term310391.getClass(), "varStart", 0);
        setField(term310391, term310391.getClass(), "compilerData", null);
        setIntField(term310391, term310391.getClass(), "type", 0);
        setField(term310391, term310391.getClass(), "next", null);
        setField(term310391, term310391.getClass(), "first", null);
        setField(term310391, term310391.getClass(), "last", null);
        setField(term310391, term310391.getClass(), "propListHead", null);
        setIntField(term310391, term310391.getClass(), "sourcePosition", 0);
        setField(term310391, term310391.getClass(), "jsType", null);
        setField(term310391, term310391.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term309864;
        args[1] = term309956;
        args[2] = term310048;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term309778, args);
        assertTrue(recursiveEquals(term309778, term310437));
        assertTrue(recursiveEquals(term309864, term310438));
        assertTrue(recursiveEquals(term309956, term310439));
        assertTrue(recursiveEquals(term310048, term310440));
        assertTrue(recursiveEquals(retValue, term310391));
    }

};


