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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561006;
     Object term561092;
     Object term561276;
     Object term561368;
     Object term561818;
     Object term561819;
     Object term561821;
     Object term561822;
     Object term561739;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561006 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term561092 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term561184 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term561184, term561184.getClass(), "type", 108);
        setField(term561092, term561092.getClass(), "parent", term561184);
        setIntField(term561092, term561092.getClass(), "type", 100);
        term561276 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term561276, term561276.getClass(), "type", 104);
        term561368 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term561368, term561368.getClass(), "type", 44);
        term561818 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term561818, term561818.getClass(), "currentTraversal", null);
        term561819 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term561820 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term561819, term561819.getClass(), "functionName", null);
        setBooleanField(term561819, term561819.getClass(), "itsNeedsActivation", false);
        setIntField(term561819, term561819.getClass(), "itsFunctionType", 0);
        setBooleanField(term561819, term561819.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term561819, term561819.getClass(), "encodedSourceStart", 0);
        setIntField(term561819, term561819.getClass(), "encodedSourceEnd", 0);
        setField(term561819, term561819.getClass(), "sourceName", null);
        setIntField(term561819, term561819.getClass(), "baseLineno", 0);
        setIntField(term561819, term561819.getClass(), "endLineno", 0);
        setField(term561819, term561819.getClass(), "functions", null);
        setField(term561819, term561819.getClass(), "regexps", null);
        setField(term561819, term561819.getClass(), "itsVariables", null);
        setField(term561819, term561819.getClass(), "itsConst", null);
        setField(term561819, term561819.getClass(), "itsVariableNames", null);
        setIntField(term561819, term561819.getClass(), "varStart", 0);
        setField(term561819, term561819.getClass(), "compilerData", null);
        setIntField(term561819, term561819.getClass(), "type", 100);
        setField(term561819, term561819.getClass(), "next", null);
        setField(term561819, term561819.getClass(), "first", null);
        setField(term561819, term561819.getClass(), "last", null);
        setField(term561819, term561819.getClass(), "propListHead", null);
        setIntField(term561819, term561819.getClass(), "sourcePosition", 0);
        setField(term561819, term561819.getClass(), "jsType", null);
        setDoubleField(term561820, term561820.getClass(), "number", 0.0);
        setIntField(term561820, term561820.getClass(), "type", 108);
        setField(term561820, term561820.getClass(), "next", null);
        setField(term561820, term561820.getClass(), "first", null);
        setField(term561820, term561820.getClass(), "last", null);
        setField(term561820, term561820.getClass(), "propListHead", null);
        setIntField(term561820, term561820.getClass(), "sourcePosition", 0);
        setField(term561820, term561820.getClass(), "jsType", null);
        setField(term561820, term561820.getClass(), "parent", null);
        setField(term561819, term561819.getClass(), "parent", term561820);
        term561821 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term561821, term561821.getClass(), "number", 0.0);
        setIntField(term561821, term561821.getClass(), "type", 104);
        setField(term561821, term561821.getClass(), "next", null);
        setField(term561821, term561821.getClass(), "first", null);
        setField(term561821, term561821.getClass(), "last", null);
        setField(term561821, term561821.getClass(), "propListHead", null);
        setIntField(term561821, term561821.getClass(), "sourcePosition", 0);
        setField(term561821, term561821.getClass(), "jsType", null);
        setField(term561821, term561821.getClass(), "parent", null);
        term561822 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term561822, term561822.getClass(), "str", null);
        setIntField(term561822, term561822.getClass(), "type", 44);
        setField(term561822, term561822.getClass(), "next", null);
        setField(term561822, term561822.getClass(), "first", null);
        setField(term561822, term561822.getClass(), "last", null);
        setField(term561822, term561822.getClass(), "propListHead", null);
        setIntField(term561822, term561822.getClass(), "sourcePosition", 0);
        setField(term561822, term561822.getClass(), "jsType", null);
        setField(term561822, term561822.getClass(), "parent", null);
        term561739 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term561750 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term561739, term561739.getClass(), "functionName", null);
        setBooleanField(term561739, term561739.getClass(), "itsNeedsActivation", false);
        setIntField(term561739, term561739.getClass(), "itsFunctionType", 0);
        setBooleanField(term561739, term561739.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term561739, term561739.getClass(), "encodedSourceStart", 0);
        setIntField(term561739, term561739.getClass(), "encodedSourceEnd", 0);
        setField(term561739, term561739.getClass(), "sourceName", null);
        setIntField(term561739, term561739.getClass(), "baseLineno", 0);
        setIntField(term561739, term561739.getClass(), "endLineno", 0);
        setField(term561739, term561739.getClass(), "functions", null);
        setField(term561739, term561739.getClass(), "regexps", null);
        setField(term561739, term561739.getClass(), "itsVariables", null);
        setField(term561739, term561739.getClass(), "itsConst", null);
        setField(term561739, term561739.getClass(), "itsVariableNames", null);
        setIntField(term561739, term561739.getClass(), "varStart", 0);
        setField(term561739, term561739.getClass(), "compilerData", null);
        setIntField(term561739, term561739.getClass(), "type", 100);
        setField(term561739, term561739.getClass(), "next", null);
        setField(term561739, term561739.getClass(), "first", null);
        setField(term561739, term561739.getClass(), "last", null);
        setField(term561739, term561739.getClass(), "propListHead", null);
        setIntField(term561739, term561739.getClass(), "sourcePosition", 0);
        setField(term561739, term561739.getClass(), "jsType", null);
        setDoubleField(term561750, term561750.getClass(), "number", 0.0);
        setIntField(term561750, term561750.getClass(), "type", 108);
        setField(term561750, term561750.getClass(), "next", null);
        setField(term561750, term561750.getClass(), "first", null);
        setField(term561750, term561750.getClass(), "last", null);
        setField(term561750, term561750.getClass(), "propListHead", null);
        setIntField(term561750, term561750.getClass(), "sourcePosition", 0);
        setField(term561750, term561750.getClass(), "jsType", null);
        setField(term561750, term561750.getClass(), "parent", null);
        setField(term561739, term561739.getClass(), "parent", term561750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term561092;
        args[1] = term561276;
        args[2] = term561368;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term561006, args);
        assertTrue(recursiveEquals(term561006, term561818));
        assertTrue(recursiveEquals(term561092, term561819));
        assertTrue(recursiveEquals(term561276, term561821));
        assertTrue(recursiveEquals(term561368, term561822));
        assertTrue(recursiveEquals(retValue, term561739));
    }

};


