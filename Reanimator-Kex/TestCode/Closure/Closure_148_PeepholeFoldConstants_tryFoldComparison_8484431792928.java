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

public class PeepholeFoldConstants_tryFoldComparison_8484431792928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term857500;
     Object term857592;
     Object term857684;
     Object term857770;
     Object term857811;
     Object term857812;
     Object term857813;
     Object term857814;
     Object term857780;

    public PeepholeFoldConstants_tryFoldComparison_8484431792928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term857500 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term857592 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term857592, term857592.getClass(), "type", 16);
        term857684 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term857684, term857684.getClass(), "type", 42);
        term857770 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term857770, term857770.getClass(), "type", 16);
        term857811 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term857811, term857811.getClass(), "currentTraversal", null);
        term857812 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term857812, term857812.getClass(), "str", null);
        setIntField(term857812, term857812.getClass(), "type", 42);
        setField(term857812, term857812.getClass(), "next", null);
        setField(term857812, term857812.getClass(), "first", null);
        setField(term857812, term857812.getClass(), "last", null);
        setField(term857812, term857812.getClass(), "propListHead", null);
        setIntField(term857812, term857812.getClass(), "sourcePosition", 0);
        setField(term857812, term857812.getClass(), "jsType", null);
        setField(term857812, term857812.getClass(), "parent", null);
        term857813 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term857813, term857813.getClass(), "str", null);
        setIntField(term857813, term857813.getClass(), "type", 16);
        setField(term857813, term857813.getClass(), "next", null);
        setField(term857813, term857813.getClass(), "first", null);
        setField(term857813, term857813.getClass(), "last", null);
        setField(term857813, term857813.getClass(), "propListHead", null);
        setIntField(term857813, term857813.getClass(), "sourcePosition", 0);
        setField(term857813, term857813.getClass(), "jsType", null);
        setField(term857813, term857813.getClass(), "parent", null);
        term857814 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term857814, term857814.getClass(), "functionName", null);
        setBooleanField(term857814, term857814.getClass(), "itsNeedsActivation", false);
        setIntField(term857814, term857814.getClass(), "itsFunctionType", 0);
        setBooleanField(term857814, term857814.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term857814, term857814.getClass(), "encodedSourceStart", 0);
        setIntField(term857814, term857814.getClass(), "encodedSourceEnd", 0);
        setField(term857814, term857814.getClass(), "sourceName", null);
        setIntField(term857814, term857814.getClass(), "baseLineno", 0);
        setIntField(term857814, term857814.getClass(), "endLineno", 0);
        setField(term857814, term857814.getClass(), "functions", null);
        setField(term857814, term857814.getClass(), "regexps", null);
        setField(term857814, term857814.getClass(), "itsVariables", null);
        setField(term857814, term857814.getClass(), "itsConst", null);
        setField(term857814, term857814.getClass(), "itsVariableNames", null);
        setIntField(term857814, term857814.getClass(), "varStart", 0);
        setField(term857814, term857814.getClass(), "compilerData", null);
        setIntField(term857814, term857814.getClass(), "type", 16);
        setField(term857814, term857814.getClass(), "next", null);
        setField(term857814, term857814.getClass(), "first", null);
        setField(term857814, term857814.getClass(), "last", null);
        setField(term857814, term857814.getClass(), "propListHead", null);
        setIntField(term857814, term857814.getClass(), "sourcePosition", 0);
        setField(term857814, term857814.getClass(), "jsType", null);
        setField(term857814, term857814.getClass(), "parent", null);
        term857780 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term857780, term857780.getClass(), "str", null);
        setIntField(term857780, term857780.getClass(), "type", 16);
        setField(term857780, term857780.getClass(), "next", null);
        setField(term857780, term857780.getClass(), "first", null);
        setField(term857780, term857780.getClass(), "last", null);
        setField(term857780, term857780.getClass(), "propListHead", null);
        setIntField(term857780, term857780.getClass(), "sourcePosition", 0);
        setField(term857780, term857780.getClass(), "jsType", null);
        setField(term857780, term857780.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term857592;
        args[1] = term857684;
        args[2] = term857770;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term857500, args);
        assertTrue(recursiveEquals(term857500, term857811));
        assertTrue(recursiveEquals(term857592, term857812));
        assertTrue(recursiveEquals(term857684, term857813));
        assertTrue(recursiveEquals(term857770, term857814));
        assertTrue(recursiveEquals(retValue, term857780));
    }

};


