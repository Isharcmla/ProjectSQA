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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154536;
     Object term154628;
     Object term155681;
     Object term155682;
     Object term155613;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154536 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term154628 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term154720 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term154806 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term154720, term154720.getClass(), "next", term154806);
        setIntField(term154720, term154720.getClass(), "type", 14);
        setField(term154628, term154628.getClass(), "first", term154720);
        setIntField(term154628, term154628.getClass(), "type", 14);
        term155681 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term155681, term155681.getClass(), "currentTraversal", null);
        term155682 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term155683 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term155684 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term155682, term155682.getClass(), "str", null);
        setIntField(term155682, term155682.getClass(), "type", 14);
        setField(term155682, term155682.getClass(), "next", null);
        setField(term155683, term155683.getClass(), "str", null);
        setIntField(term155683, term155683.getClass(), "type", 14);
        setField(term155684, term155684.getClass(), "functionName", null);
        setBooleanField(term155684, term155684.getClass(), "itsNeedsActivation", false);
        setIntField(term155684, term155684.getClass(), "itsFunctionType", 0);
        setBooleanField(term155684, term155684.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term155684, term155684.getClass(), "encodedSourceStart", 0);
        setIntField(term155684, term155684.getClass(), "encodedSourceEnd", 0);
        setField(term155684, term155684.getClass(), "sourceName", null);
        setIntField(term155684, term155684.getClass(), "baseLineno", 0);
        setIntField(term155684, term155684.getClass(), "endLineno", 0);
        setField(term155684, term155684.getClass(), "functions", null);
        setField(term155684, term155684.getClass(), "regexps", null);
        setField(term155684, term155684.getClass(), "itsVariables", null);
        setField(term155684, term155684.getClass(), "itsConst", null);
        setField(term155684, term155684.getClass(), "itsVariableNames", null);
        setIntField(term155684, term155684.getClass(), "varStart", 0);
        setField(term155684, term155684.getClass(), "compilerData", null);
        setIntField(term155684, term155684.getClass(), "type", 0);
        setField(term155684, term155684.getClass(), "next", null);
        setField(term155684, term155684.getClass(), "first", null);
        setField(term155684, term155684.getClass(), "last", null);
        setField(term155684, term155684.getClass(), "propListHead", null);
        setIntField(term155684, term155684.getClass(), "sourcePosition", 0);
        setField(term155684, term155684.getClass(), "jsType", null);
        setField(term155684, term155684.getClass(), "parent", null);
        setField(term155683, term155683.getClass(), "next", term155684);
        setField(term155683, term155683.getClass(), "first", null);
        setField(term155683, term155683.getClass(), "last", null);
        setField(term155683, term155683.getClass(), "propListHead", null);
        setIntField(term155683, term155683.getClass(), "sourcePosition", 0);
        setField(term155683, term155683.getClass(), "jsType", null);
        setField(term155683, term155683.getClass(), "parent", null);
        setField(term155682, term155682.getClass(), "first", term155683);
        setField(term155682, term155682.getClass(), "last", null);
        setField(term155682, term155682.getClass(), "propListHead", null);
        setIntField(term155682, term155682.getClass(), "sourcePosition", 0);
        setField(term155682, term155682.getClass(), "jsType", null);
        setField(term155682, term155682.getClass(), "parent", null);
        term155613 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term155615 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term155617 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term155613, term155613.getClass(), "str", null);
        setIntField(term155613, term155613.getClass(), "type", 14);
        setField(term155613, term155613.getClass(), "next", null);
        setField(term155615, term155615.getClass(), "str", null);
        setIntField(term155615, term155615.getClass(), "type", 14);
        setField(term155617, term155617.getClass(), "functionName", null);
        setBooleanField(term155617, term155617.getClass(), "itsNeedsActivation", false);
        setIntField(term155617, term155617.getClass(), "itsFunctionType", 0);
        setBooleanField(term155617, term155617.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term155617, term155617.getClass(), "encodedSourceStart", 0);
        setIntField(term155617, term155617.getClass(), "encodedSourceEnd", 0);
        setField(term155617, term155617.getClass(), "sourceName", null);
        setIntField(term155617, term155617.getClass(), "baseLineno", 0);
        setIntField(term155617, term155617.getClass(), "endLineno", 0);
        setField(term155617, term155617.getClass(), "functions", null);
        setField(term155617, term155617.getClass(), "regexps", null);
        setField(term155617, term155617.getClass(), "itsVariables", null);
        setField(term155617, term155617.getClass(), "itsConst", null);
        setField(term155617, term155617.getClass(), "itsVariableNames", null);
        setIntField(term155617, term155617.getClass(), "varStart", 0);
        setField(term155617, term155617.getClass(), "compilerData", null);
        setIntField(term155617, term155617.getClass(), "type", 0);
        setField(term155617, term155617.getClass(), "next", null);
        setField(term155617, term155617.getClass(), "first", null);
        setField(term155617, term155617.getClass(), "last", null);
        setField(term155617, term155617.getClass(), "propListHead", null);
        setIntField(term155617, term155617.getClass(), "sourcePosition", 0);
        setField(term155617, term155617.getClass(), "jsType", null);
        setField(term155617, term155617.getClass(), "parent", null);
        setField(term155615, term155615.getClass(), "next", term155617);
        setField(term155615, term155615.getClass(), "first", null);
        setField(term155615, term155615.getClass(), "last", null);
        setField(term155615, term155615.getClass(), "propListHead", null);
        setIntField(term155615, term155615.getClass(), "sourcePosition", 0);
        setField(term155615, term155615.getClass(), "jsType", null);
        setField(term155615, term155615.getClass(), "parent", null);
        setField(term155613, term155613.getClass(), "first", term155615);
        setField(term155613, term155613.getClass(), "last", null);
        setField(term155613, term155613.getClass(), "propListHead", null);
        setIntField(term155613, term155613.getClass(), "sourcePosition", 0);
        setField(term155613, term155613.getClass(), "jsType", null);
        setField(term155613, term155613.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term154628;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term154536, args);
        assertTrue(recursiveEquals(term154536, term155681));
        assertTrue(recursiveEquals(term154628, term155682));
        assertTrue(recursiveEquals(retValue, term155613));
    }

};


