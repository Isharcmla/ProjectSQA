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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430875;
     Object term430967;
     Object term431613;
     Object term431614;
     Object term431565;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term430875 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term430967 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term431059 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term431149 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term431059, term431059.getClass(), "next", term431149);
        setIntField(term431059, term431059.getClass(), "type", 39);
        setField(term430967, term430967.getClass(), "first", term431059);
        setIntField(term430967, term430967.getClass(), "type", 19);
        term431613 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term431613, term431613.getClass(), "currentTraversal", null);
        term431614 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term431615 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term431616 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term431614, term431614.getClass(), "number", 0.0);
        setIntField(term431614, term431614.getClass(), "type", 19);
        setField(term431614, term431614.getClass(), "next", null);
        setDoubleField(term431615, term431615.getClass(), "number", 0.0);
        setIntField(term431615, term431615.getClass(), "type", 39);
        setIntField(term431616, term431616.getClass(), "encodedSourceStart", 0);
        setIntField(term431616, term431616.getClass(), "encodedSourceEnd", 0);
        setField(term431616, term431616.getClass(), "sourceName", null);
        setIntField(term431616, term431616.getClass(), "baseLineno", 0);
        setIntField(term431616, term431616.getClass(), "endLineno", 0);
        setField(term431616, term431616.getClass(), "functions", null);
        setField(term431616, term431616.getClass(), "regexps", null);
        setField(term431616, term431616.getClass(), "itsVariables", null);
        setField(term431616, term431616.getClass(), "itsConst", null);
        setField(term431616, term431616.getClass(), "itsVariableNames", null);
        setIntField(term431616, term431616.getClass(), "varStart", 0);
        setField(term431616, term431616.getClass(), "compilerData", null);
        setIntField(term431616, term431616.getClass(), "type", 0);
        setField(term431616, term431616.getClass(), "next", null);
        setField(term431616, term431616.getClass(), "first", null);
        setField(term431616, term431616.getClass(), "last", null);
        setField(term431616, term431616.getClass(), "propListHead", null);
        setIntField(term431616, term431616.getClass(), "sourcePosition", 0);
        setField(term431616, term431616.getClass(), "jsType", null);
        setField(term431616, term431616.getClass(), "parent", null);
        setField(term431615, term431615.getClass(), "next", term431616);
        setField(term431615, term431615.getClass(), "first", null);
        setField(term431615, term431615.getClass(), "last", null);
        setField(term431615, term431615.getClass(), "propListHead", null);
        setIntField(term431615, term431615.getClass(), "sourcePosition", 0);
        setField(term431615, term431615.getClass(), "jsType", null);
        setField(term431615, term431615.getClass(), "parent", null);
        setField(term431614, term431614.getClass(), "first", term431615);
        setField(term431614, term431614.getClass(), "last", null);
        setField(term431614, term431614.getClass(), "propListHead", null);
        setIntField(term431614, term431614.getClass(), "sourcePosition", 0);
        setField(term431614, term431614.getClass(), "jsType", null);
        setField(term431614, term431614.getClass(), "parent", null);
        term431565 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term431568 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term431571 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setDoubleField(term431565, term431565.getClass(), "number", 0.0);
        setIntField(term431565, term431565.getClass(), "type", 19);
        setField(term431565, term431565.getClass(), "next", null);
        setDoubleField(term431568, term431568.getClass(), "number", 0.0);
        setIntField(term431568, term431568.getClass(), "type", 39);
        setIntField(term431571, term431571.getClass(), "encodedSourceStart", 0);
        setIntField(term431571, term431571.getClass(), "encodedSourceEnd", 0);
        setField(term431571, term431571.getClass(), "sourceName", null);
        setIntField(term431571, term431571.getClass(), "baseLineno", 0);
        setIntField(term431571, term431571.getClass(), "endLineno", 0);
        setField(term431571, term431571.getClass(), "functions", null);
        setField(term431571, term431571.getClass(), "regexps", null);
        setField(term431571, term431571.getClass(), "itsVariables", null);
        setField(term431571, term431571.getClass(), "itsConst", null);
        setField(term431571, term431571.getClass(), "itsVariableNames", null);
        setIntField(term431571, term431571.getClass(), "varStart", 0);
        setField(term431571, term431571.getClass(), "compilerData", null);
        setIntField(term431571, term431571.getClass(), "type", 0);
        setField(term431571, term431571.getClass(), "next", null);
        setField(term431571, term431571.getClass(), "first", null);
        setField(term431571, term431571.getClass(), "last", null);
        setField(term431571, term431571.getClass(), "propListHead", null);
        setIntField(term431571, term431571.getClass(), "sourcePosition", 0);
        setField(term431571, term431571.getClass(), "jsType", null);
        setField(term431571, term431571.getClass(), "parent", null);
        setField(term431568, term431568.getClass(), "next", term431571);
        setField(term431568, term431568.getClass(), "first", null);
        setField(term431568, term431568.getClass(), "last", null);
        setField(term431568, term431568.getClass(), "propListHead", null);
        setIntField(term431568, term431568.getClass(), "sourcePosition", 0);
        setField(term431568, term431568.getClass(), "jsType", null);
        setField(term431568, term431568.getClass(), "parent", null);
        setField(term431565, term431565.getClass(), "first", term431568);
        setField(term431565, term431565.getClass(), "last", null);
        setField(term431565, term431565.getClass(), "propListHead", null);
        setIntField(term431565, term431565.getClass(), "sourcePosition", 0);
        setField(term431565, term431565.getClass(), "jsType", null);
        setField(term431565, term431565.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term430967;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term430875, args);
        assertTrue(recursiveEquals(term430875, term431613));
        assertTrue(recursiveEquals(term430967, term431614));
        assertTrue(recursiveEquals(retValue, term431565));
    }

};


