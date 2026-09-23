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

public class PeepholeFoldConstants_tryFoldComparison_848443179198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38302;
     Object term38388;
     Object term38474;
     Object term38566;
     Object term38616;
     Object term38617;
     Object term38618;
     Object term38619;
     Object term38590;

    public PeepholeFoldConstants_tryFoldComparison_848443179198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38302 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term38388 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term38388, term38388.getClass(), "type", 16);
        term38474 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term38474, term38474.getClass(), "type", 16);
        term38566 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term38616 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term38616, term38616.getClass(), "currentTraversal", null);
        term38617 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term38617, term38617.getClass(), "functionName", null);
        setBooleanField(term38617, term38617.getClass(), "itsNeedsActivation", false);
        setIntField(term38617, term38617.getClass(), "itsFunctionType", 0);
        setBooleanField(term38617, term38617.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term38617, term38617.getClass(), "encodedSourceStart", 0);
        setIntField(term38617, term38617.getClass(), "encodedSourceEnd", 0);
        setField(term38617, term38617.getClass(), "sourceName", null);
        setIntField(term38617, term38617.getClass(), "baseLineno", 0);
        setIntField(term38617, term38617.getClass(), "endLineno", 0);
        setField(term38617, term38617.getClass(), "functions", null);
        setField(term38617, term38617.getClass(), "regexps", null);
        setField(term38617, term38617.getClass(), "itsVariables", null);
        setField(term38617, term38617.getClass(), "itsConst", null);
        setField(term38617, term38617.getClass(), "itsVariableNames", null);
        setIntField(term38617, term38617.getClass(), "varStart", 0);
        setField(term38617, term38617.getClass(), "compilerData", null);
        setIntField(term38617, term38617.getClass(), "type", 16);
        setField(term38617, term38617.getClass(), "next", null);
        setField(term38617, term38617.getClass(), "first", null);
        setField(term38617, term38617.getClass(), "last", null);
        setField(term38617, term38617.getClass(), "propListHead", null);
        setIntField(term38617, term38617.getClass(), "sourcePosition", 0);
        setField(term38617, term38617.getClass(), "jsType", null);
        setField(term38617, term38617.getClass(), "parent", null);
        term38618 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term38618, term38618.getClass(), "functionName", null);
        setBooleanField(term38618, term38618.getClass(), "itsNeedsActivation", false);
        setIntField(term38618, term38618.getClass(), "itsFunctionType", 0);
        setBooleanField(term38618, term38618.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term38618, term38618.getClass(), "encodedSourceStart", 0);
        setIntField(term38618, term38618.getClass(), "encodedSourceEnd", 0);
        setField(term38618, term38618.getClass(), "sourceName", null);
        setIntField(term38618, term38618.getClass(), "baseLineno", 0);
        setIntField(term38618, term38618.getClass(), "endLineno", 0);
        setField(term38618, term38618.getClass(), "functions", null);
        setField(term38618, term38618.getClass(), "regexps", null);
        setField(term38618, term38618.getClass(), "itsVariables", null);
        setField(term38618, term38618.getClass(), "itsConst", null);
        setField(term38618, term38618.getClass(), "itsVariableNames", null);
        setIntField(term38618, term38618.getClass(), "varStart", 0);
        setField(term38618, term38618.getClass(), "compilerData", null);
        setIntField(term38618, term38618.getClass(), "type", 16);
        setField(term38618, term38618.getClass(), "next", null);
        setField(term38618, term38618.getClass(), "first", null);
        setField(term38618, term38618.getClass(), "last", null);
        setField(term38618, term38618.getClass(), "propListHead", null);
        setIntField(term38618, term38618.getClass(), "sourcePosition", 0);
        setField(term38618, term38618.getClass(), "jsType", null);
        setField(term38618, term38618.getClass(), "parent", null);
        term38619 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term38619, term38619.getClass(), "str", null);
        setIntField(term38619, term38619.getClass(), "type", 0);
        setField(term38619, term38619.getClass(), "next", null);
        setField(term38619, term38619.getClass(), "first", null);
        setField(term38619, term38619.getClass(), "last", null);
        setField(term38619, term38619.getClass(), "propListHead", null);
        setIntField(term38619, term38619.getClass(), "sourcePosition", 0);
        setField(term38619, term38619.getClass(), "jsType", null);
        setField(term38619, term38619.getClass(), "parent", null);
        term38590 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term38590, term38590.getClass(), "functionName", null);
        setBooleanField(term38590, term38590.getClass(), "itsNeedsActivation", false);
        setIntField(term38590, term38590.getClass(), "itsFunctionType", 0);
        setBooleanField(term38590, term38590.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term38590, term38590.getClass(), "encodedSourceStart", 0);
        setIntField(term38590, term38590.getClass(), "encodedSourceEnd", 0);
        setField(term38590, term38590.getClass(), "sourceName", null);
        setIntField(term38590, term38590.getClass(), "baseLineno", 0);
        setIntField(term38590, term38590.getClass(), "endLineno", 0);
        setField(term38590, term38590.getClass(), "functions", null);
        setField(term38590, term38590.getClass(), "regexps", null);
        setField(term38590, term38590.getClass(), "itsVariables", null);
        setField(term38590, term38590.getClass(), "itsConst", null);
        setField(term38590, term38590.getClass(), "itsVariableNames", null);
        setIntField(term38590, term38590.getClass(), "varStart", 0);
        setField(term38590, term38590.getClass(), "compilerData", null);
        setIntField(term38590, term38590.getClass(), "type", 16);
        setField(term38590, term38590.getClass(), "next", null);
        setField(term38590, term38590.getClass(), "first", null);
        setField(term38590, term38590.getClass(), "last", null);
        setField(term38590, term38590.getClass(), "propListHead", null);
        setIntField(term38590, term38590.getClass(), "sourcePosition", 0);
        setField(term38590, term38590.getClass(), "jsType", null);
        setField(term38590, term38590.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term38388;
        args[1] = term38474;
        args[2] = term38566;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term38302, args);
        assertTrue(recursiveEquals(term38302, term38616));
        assertTrue(recursiveEquals(term38388, term38617));
        assertTrue(recursiveEquals(term38474, term38618));
        assertTrue(recursiveEquals(term38566, term38619));
        assertTrue(recursiveEquals(retValue, term38590));
    }

};


