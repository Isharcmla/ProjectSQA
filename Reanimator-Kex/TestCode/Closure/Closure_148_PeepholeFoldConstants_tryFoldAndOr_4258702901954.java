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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term520773;
     Object term520859;
     Object term521043;
     Object term521135;
     Object term521224;
     Object term521225;
     Object term521227;
     Object term521228;
     Object term521146;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term520773 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term520859 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term520951 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term520951, term520951.getClass(), "type", 108);
        setField(term520859, term520859.getClass(), "parent", term520951);
        setIntField(term520859, term520859.getClass(), "type", 0);
        term521043 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term521043, term521043.getClass(), "type", 55);
        term521135 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term521135, term521135.getClass(), "type", 44);
        term521224 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term521224, term521224.getClass(), "currentTraversal", null);
        term521225 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term521226 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term521225, term521225.getClass(), "functionName", null);
        setBooleanField(term521225, term521225.getClass(), "itsNeedsActivation", false);
        setIntField(term521225, term521225.getClass(), "itsFunctionType", 0);
        setBooleanField(term521225, term521225.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term521225, term521225.getClass(), "encodedSourceStart", 0);
        setIntField(term521225, term521225.getClass(), "encodedSourceEnd", 0);
        setField(term521225, term521225.getClass(), "sourceName", null);
        setIntField(term521225, term521225.getClass(), "baseLineno", 0);
        setIntField(term521225, term521225.getClass(), "endLineno", 0);
        setField(term521225, term521225.getClass(), "functions", null);
        setField(term521225, term521225.getClass(), "regexps", null);
        setField(term521225, term521225.getClass(), "itsVariables", null);
        setField(term521225, term521225.getClass(), "itsConst", null);
        setField(term521225, term521225.getClass(), "itsVariableNames", null);
        setIntField(term521225, term521225.getClass(), "varStart", 0);
        setField(term521225, term521225.getClass(), "compilerData", null);
        setIntField(term521225, term521225.getClass(), "type", 0);
        setField(term521225, term521225.getClass(), "next", null);
        setField(term521225, term521225.getClass(), "first", null);
        setField(term521225, term521225.getClass(), "last", null);
        setField(term521225, term521225.getClass(), "propListHead", null);
        setIntField(term521225, term521225.getClass(), "sourcePosition", 0);
        setField(term521225, term521225.getClass(), "jsType", null);
        setDoubleField(term521226, term521226.getClass(), "number", 0.0);
        setIntField(term521226, term521226.getClass(), "type", 108);
        setField(term521226, term521226.getClass(), "next", null);
        setField(term521226, term521226.getClass(), "first", null);
        setField(term521226, term521226.getClass(), "last", null);
        setField(term521226, term521226.getClass(), "propListHead", null);
        setIntField(term521226, term521226.getClass(), "sourcePosition", 0);
        setField(term521226, term521226.getClass(), "jsType", null);
        setField(term521226, term521226.getClass(), "parent", null);
        setField(term521225, term521225.getClass(), "parent", term521226);
        term521227 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term521227, term521227.getClass(), "number", 0.0);
        setIntField(term521227, term521227.getClass(), "type", 55);
        setField(term521227, term521227.getClass(), "next", null);
        setField(term521227, term521227.getClass(), "first", null);
        setField(term521227, term521227.getClass(), "last", null);
        setField(term521227, term521227.getClass(), "propListHead", null);
        setIntField(term521227, term521227.getClass(), "sourcePosition", 0);
        setField(term521227, term521227.getClass(), "jsType", null);
        setField(term521227, term521227.getClass(), "parent", null);
        term521228 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term521228, term521228.getClass(), "str", null);
        setIntField(term521228, term521228.getClass(), "type", 44);
        setField(term521228, term521228.getClass(), "next", null);
        setField(term521228, term521228.getClass(), "first", null);
        setField(term521228, term521228.getClass(), "last", null);
        setField(term521228, term521228.getClass(), "propListHead", null);
        setIntField(term521228, term521228.getClass(), "sourcePosition", 0);
        setField(term521228, term521228.getClass(), "jsType", null);
        setField(term521228, term521228.getClass(), "parent", null);
        term521146 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term521157 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term521146, term521146.getClass(), "functionName", null);
        setBooleanField(term521146, term521146.getClass(), "itsNeedsActivation", false);
        setIntField(term521146, term521146.getClass(), "itsFunctionType", 0);
        setBooleanField(term521146, term521146.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term521146, term521146.getClass(), "encodedSourceStart", 0);
        setIntField(term521146, term521146.getClass(), "encodedSourceEnd", 0);
        setField(term521146, term521146.getClass(), "sourceName", null);
        setIntField(term521146, term521146.getClass(), "baseLineno", 0);
        setIntField(term521146, term521146.getClass(), "endLineno", 0);
        setField(term521146, term521146.getClass(), "functions", null);
        setField(term521146, term521146.getClass(), "regexps", null);
        setField(term521146, term521146.getClass(), "itsVariables", null);
        setField(term521146, term521146.getClass(), "itsConst", null);
        setField(term521146, term521146.getClass(), "itsVariableNames", null);
        setIntField(term521146, term521146.getClass(), "varStart", 0);
        setField(term521146, term521146.getClass(), "compilerData", null);
        setIntField(term521146, term521146.getClass(), "type", 0);
        setField(term521146, term521146.getClass(), "next", null);
        setField(term521146, term521146.getClass(), "first", null);
        setField(term521146, term521146.getClass(), "last", null);
        setField(term521146, term521146.getClass(), "propListHead", null);
        setIntField(term521146, term521146.getClass(), "sourcePosition", 0);
        setField(term521146, term521146.getClass(), "jsType", null);
        setDoubleField(term521157, term521157.getClass(), "number", 0.0);
        setIntField(term521157, term521157.getClass(), "type", 108);
        setField(term521157, term521157.getClass(), "next", null);
        setField(term521157, term521157.getClass(), "first", null);
        setField(term521157, term521157.getClass(), "last", null);
        setField(term521157, term521157.getClass(), "propListHead", null);
        setIntField(term521157, term521157.getClass(), "sourcePosition", 0);
        setField(term521157, term521157.getClass(), "jsType", null);
        setField(term521157, term521157.getClass(), "parent", null);
        setField(term521146, term521146.getClass(), "parent", term521157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term520859;
        args[1] = term521043;
        args[2] = term521135;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term520773, args);
        assertTrue(recursiveEquals(term520773, term521224));
        assertTrue(recursiveEquals(term520859, term521225));
        assertTrue(recursiveEquals(term521043, term521227));
        assertTrue(recursiveEquals(term521135, term521228));
        assertTrue(recursiveEquals(retValue, term521146));
    }

};


