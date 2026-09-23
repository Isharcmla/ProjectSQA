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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term736246;
     Object term736332;
     Object term736516;
     Object term736608;
     Object term736693;
     Object term736694;
     Object term736696;
     Object term736697;
     Object term736613;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term736246 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term736332 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term736424 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term736424, term736424.getClass(), "type", 114);
        setField(term736332, term736332.getClass(), "parent", term736424);
        setIntField(term736332, term736332.getClass(), "type", 0);
        term736516 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term736516, term736516.getClass(), "type", 67);
        term736608 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term736608, term736608.getClass(), "type", 44);
        term736693 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term736693, term736693.getClass(), "currentTraversal", null);
        term736694 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term736695 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term736694, term736694.getClass(), "functionName", null);
        setBooleanField(term736694, term736694.getClass(), "itsNeedsActivation", false);
        setIntField(term736694, term736694.getClass(), "itsFunctionType", 0);
        setBooleanField(term736694, term736694.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term736694, term736694.getClass(), "encodedSourceStart", 0);
        setIntField(term736694, term736694.getClass(), "encodedSourceEnd", 0);
        setField(term736694, term736694.getClass(), "sourceName", null);
        setIntField(term736694, term736694.getClass(), "baseLineno", 0);
        setIntField(term736694, term736694.getClass(), "endLineno", 0);
        setField(term736694, term736694.getClass(), "functions", null);
        setField(term736694, term736694.getClass(), "regexps", null);
        setField(term736694, term736694.getClass(), "itsVariables", null);
        setField(term736694, term736694.getClass(), "itsConst", null);
        setField(term736694, term736694.getClass(), "itsVariableNames", null);
        setIntField(term736694, term736694.getClass(), "varStart", 0);
        setField(term736694, term736694.getClass(), "compilerData", null);
        setIntField(term736694, term736694.getClass(), "type", 0);
        setField(term736694, term736694.getClass(), "next", null);
        setField(term736694, term736694.getClass(), "first", null);
        setField(term736694, term736694.getClass(), "last", null);
        setField(term736694, term736694.getClass(), "propListHead", null);
        setIntField(term736694, term736694.getClass(), "sourcePosition", 0);
        setField(term736694, term736694.getClass(), "jsType", null);
        setDoubleField(term736695, term736695.getClass(), "number", 0.0);
        setIntField(term736695, term736695.getClass(), "type", 114);
        setField(term736695, term736695.getClass(), "next", null);
        setField(term736695, term736695.getClass(), "first", null);
        setField(term736695, term736695.getClass(), "last", null);
        setField(term736695, term736695.getClass(), "propListHead", null);
        setIntField(term736695, term736695.getClass(), "sourcePosition", 0);
        setField(term736695, term736695.getClass(), "jsType", null);
        setField(term736695, term736695.getClass(), "parent", null);
        setField(term736694, term736694.getClass(), "parent", term736695);
        term736696 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term736696, term736696.getClass(), "number", 0.0);
        setIntField(term736696, term736696.getClass(), "type", 67);
        setField(term736696, term736696.getClass(), "next", null);
        setField(term736696, term736696.getClass(), "first", null);
        setField(term736696, term736696.getClass(), "last", null);
        setField(term736696, term736696.getClass(), "propListHead", null);
        setIntField(term736696, term736696.getClass(), "sourcePosition", 0);
        setField(term736696, term736696.getClass(), "jsType", null);
        setField(term736696, term736696.getClass(), "parent", null);
        term736697 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term736697, term736697.getClass(), "str", null);
        setIntField(term736697, term736697.getClass(), "type", 44);
        setField(term736697, term736697.getClass(), "next", null);
        setField(term736697, term736697.getClass(), "first", null);
        setField(term736697, term736697.getClass(), "last", null);
        setField(term736697, term736697.getClass(), "propListHead", null);
        setIntField(term736697, term736697.getClass(), "sourcePosition", 0);
        setField(term736697, term736697.getClass(), "jsType", null);
        setField(term736697, term736697.getClass(), "parent", null);
        term736613 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term736624 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term736613, term736613.getClass(), "functionName", null);
        setBooleanField(term736613, term736613.getClass(), "itsNeedsActivation", false);
        setIntField(term736613, term736613.getClass(), "itsFunctionType", 0);
        setBooleanField(term736613, term736613.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term736613, term736613.getClass(), "encodedSourceStart", 0);
        setIntField(term736613, term736613.getClass(), "encodedSourceEnd", 0);
        setField(term736613, term736613.getClass(), "sourceName", null);
        setIntField(term736613, term736613.getClass(), "baseLineno", 0);
        setIntField(term736613, term736613.getClass(), "endLineno", 0);
        setField(term736613, term736613.getClass(), "functions", null);
        setField(term736613, term736613.getClass(), "regexps", null);
        setField(term736613, term736613.getClass(), "itsVariables", null);
        setField(term736613, term736613.getClass(), "itsConst", null);
        setField(term736613, term736613.getClass(), "itsVariableNames", null);
        setIntField(term736613, term736613.getClass(), "varStart", 0);
        setField(term736613, term736613.getClass(), "compilerData", null);
        setIntField(term736613, term736613.getClass(), "type", 0);
        setField(term736613, term736613.getClass(), "next", null);
        setField(term736613, term736613.getClass(), "first", null);
        setField(term736613, term736613.getClass(), "last", null);
        setField(term736613, term736613.getClass(), "propListHead", null);
        setIntField(term736613, term736613.getClass(), "sourcePosition", 0);
        setField(term736613, term736613.getClass(), "jsType", null);
        setDoubleField(term736624, term736624.getClass(), "number", 0.0);
        setIntField(term736624, term736624.getClass(), "type", 114);
        setField(term736624, term736624.getClass(), "next", null);
        setField(term736624, term736624.getClass(), "first", null);
        setField(term736624, term736624.getClass(), "last", null);
        setField(term736624, term736624.getClass(), "propListHead", null);
        setIntField(term736624, term736624.getClass(), "sourcePosition", 0);
        setField(term736624, term736624.getClass(), "jsType", null);
        setField(term736624, term736624.getClass(), "parent", null);
        setField(term736613, term736613.getClass(), "parent", term736624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term736332;
        args[1] = term736516;
        args[2] = term736608;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term736246, args);
        assertTrue(recursiveEquals(term736246, term736693));
        assertTrue(recursiveEquals(term736332, term736694));
        assertTrue(recursiveEquals(term736516, term736696));
        assertTrue(recursiveEquals(term736608, term736697));
        assertTrue(recursiveEquals(retValue, term736613));
    }

};


