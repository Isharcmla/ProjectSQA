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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term682238;
     Object term682324;
     Object term682502;
     Object term682594;
     Object term682701;
     Object term682702;
     Object term682704;
     Object term682705;
     Object term682606;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term682238 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term682324 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term682410 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term682410, term682410.getClass(), "type", 114);
        setField(term682324, term682324.getClass(), "parent", term682410);
        setIntField(term682324, term682324.getClass(), "type", 0);
        term682502 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term682502, term682502.getClass(), "type", 126);
        term682594 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term682594, term682594.getClass(), "type", 63);
        term682701 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term682701, term682701.getClass(), "currentTraversal", null);
        term682702 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term682703 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term682702, term682702.getClass(), "functionName", null);
        setBooleanField(term682702, term682702.getClass(), "itsNeedsActivation", false);
        setIntField(term682702, term682702.getClass(), "itsFunctionType", 0);
        setBooleanField(term682702, term682702.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term682702, term682702.getClass(), "encodedSourceStart", 0);
        setIntField(term682702, term682702.getClass(), "encodedSourceEnd", 0);
        setField(term682702, term682702.getClass(), "sourceName", null);
        setIntField(term682702, term682702.getClass(), "baseLineno", 0);
        setIntField(term682702, term682702.getClass(), "endLineno", 0);
        setField(term682702, term682702.getClass(), "functions", null);
        setField(term682702, term682702.getClass(), "regexps", null);
        setField(term682702, term682702.getClass(), "itsVariables", null);
        setField(term682702, term682702.getClass(), "itsConst", null);
        setField(term682702, term682702.getClass(), "itsVariableNames", null);
        setIntField(term682702, term682702.getClass(), "varStart", 0);
        setField(term682702, term682702.getClass(), "compilerData", null);
        setIntField(term682702, term682702.getClass(), "type", 0);
        setField(term682702, term682702.getClass(), "next", null);
        setField(term682702, term682702.getClass(), "first", null);
        setField(term682702, term682702.getClass(), "last", null);
        setField(term682702, term682702.getClass(), "propListHead", null);
        setIntField(term682702, term682702.getClass(), "sourcePosition", 0);
        setField(term682702, term682702.getClass(), "jsType", null);
        setField(term682703, term682703.getClass(), "functionName", null);
        setBooleanField(term682703, term682703.getClass(), "itsNeedsActivation", false);
        setIntField(term682703, term682703.getClass(), "itsFunctionType", 0);
        setBooleanField(term682703, term682703.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term682703, term682703.getClass(), "encodedSourceStart", 0);
        setIntField(term682703, term682703.getClass(), "encodedSourceEnd", 0);
        setField(term682703, term682703.getClass(), "sourceName", null);
        setIntField(term682703, term682703.getClass(), "baseLineno", 0);
        setIntField(term682703, term682703.getClass(), "endLineno", 0);
        setField(term682703, term682703.getClass(), "functions", null);
        setField(term682703, term682703.getClass(), "regexps", null);
        setField(term682703, term682703.getClass(), "itsVariables", null);
        setField(term682703, term682703.getClass(), "itsConst", null);
        setField(term682703, term682703.getClass(), "itsVariableNames", null);
        setIntField(term682703, term682703.getClass(), "varStart", 0);
        setField(term682703, term682703.getClass(), "compilerData", null);
        setIntField(term682703, term682703.getClass(), "type", 114);
        setField(term682703, term682703.getClass(), "next", null);
        setField(term682703, term682703.getClass(), "first", null);
        setField(term682703, term682703.getClass(), "last", null);
        setField(term682703, term682703.getClass(), "propListHead", null);
        setIntField(term682703, term682703.getClass(), "sourcePosition", 0);
        setField(term682703, term682703.getClass(), "jsType", null);
        setField(term682703, term682703.getClass(), "parent", null);
        setField(term682702, term682702.getClass(), "parent", term682703);
        term682704 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term682704, term682704.getClass(), "number", 0.0);
        setIntField(term682704, term682704.getClass(), "type", 126);
        setField(term682704, term682704.getClass(), "next", null);
        setField(term682704, term682704.getClass(), "first", null);
        setField(term682704, term682704.getClass(), "last", null);
        setField(term682704, term682704.getClass(), "propListHead", null);
        setIntField(term682704, term682704.getClass(), "sourcePosition", 0);
        setField(term682704, term682704.getClass(), "jsType", null);
        setField(term682704, term682704.getClass(), "parent", null);
        term682705 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term682705, term682705.getClass(), "number", 0.0);
        setIntField(term682705, term682705.getClass(), "type", 63);
        setField(term682705, term682705.getClass(), "next", null);
        setField(term682705, term682705.getClass(), "first", null);
        setField(term682705, term682705.getClass(), "last", null);
        setField(term682705, term682705.getClass(), "propListHead", null);
        setIntField(term682705, term682705.getClass(), "sourcePosition", 0);
        setField(term682705, term682705.getClass(), "jsType", null);
        setField(term682705, term682705.getClass(), "parent", null);
        term682606 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term682617 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term682606, term682606.getClass(), "functionName", null);
        setBooleanField(term682606, term682606.getClass(), "itsNeedsActivation", false);
        setIntField(term682606, term682606.getClass(), "itsFunctionType", 0);
        setBooleanField(term682606, term682606.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term682606, term682606.getClass(), "encodedSourceStart", 0);
        setIntField(term682606, term682606.getClass(), "encodedSourceEnd", 0);
        setField(term682606, term682606.getClass(), "sourceName", null);
        setIntField(term682606, term682606.getClass(), "baseLineno", 0);
        setIntField(term682606, term682606.getClass(), "endLineno", 0);
        setField(term682606, term682606.getClass(), "functions", null);
        setField(term682606, term682606.getClass(), "regexps", null);
        setField(term682606, term682606.getClass(), "itsVariables", null);
        setField(term682606, term682606.getClass(), "itsConst", null);
        setField(term682606, term682606.getClass(), "itsVariableNames", null);
        setIntField(term682606, term682606.getClass(), "varStart", 0);
        setField(term682606, term682606.getClass(), "compilerData", null);
        setIntField(term682606, term682606.getClass(), "type", 0);
        setField(term682606, term682606.getClass(), "next", null);
        setField(term682606, term682606.getClass(), "first", null);
        setField(term682606, term682606.getClass(), "last", null);
        setField(term682606, term682606.getClass(), "propListHead", null);
        setIntField(term682606, term682606.getClass(), "sourcePosition", 0);
        setField(term682606, term682606.getClass(), "jsType", null);
        setField(term682617, term682617.getClass(), "functionName", null);
        setBooleanField(term682617, term682617.getClass(), "itsNeedsActivation", false);
        setIntField(term682617, term682617.getClass(), "itsFunctionType", 0);
        setBooleanField(term682617, term682617.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term682617, term682617.getClass(), "encodedSourceStart", 0);
        setIntField(term682617, term682617.getClass(), "encodedSourceEnd", 0);
        setField(term682617, term682617.getClass(), "sourceName", null);
        setIntField(term682617, term682617.getClass(), "baseLineno", 0);
        setIntField(term682617, term682617.getClass(), "endLineno", 0);
        setField(term682617, term682617.getClass(), "functions", null);
        setField(term682617, term682617.getClass(), "regexps", null);
        setField(term682617, term682617.getClass(), "itsVariables", null);
        setField(term682617, term682617.getClass(), "itsConst", null);
        setField(term682617, term682617.getClass(), "itsVariableNames", null);
        setIntField(term682617, term682617.getClass(), "varStart", 0);
        setField(term682617, term682617.getClass(), "compilerData", null);
        setIntField(term682617, term682617.getClass(), "type", 114);
        setField(term682617, term682617.getClass(), "next", null);
        setField(term682617, term682617.getClass(), "first", null);
        setField(term682617, term682617.getClass(), "last", null);
        setField(term682617, term682617.getClass(), "propListHead", null);
        setIntField(term682617, term682617.getClass(), "sourcePosition", 0);
        setField(term682617, term682617.getClass(), "jsType", null);
        setField(term682617, term682617.getClass(), "parent", null);
        setField(term682606, term682606.getClass(), "parent", term682617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term682324;
        args[1] = term682502;
        args[2] = term682594;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term682238, args);
        assertTrue(recursiveEquals(term682238, term682701));
        assertTrue(recursiveEquals(term682324, term682702));
        assertTrue(recursiveEquals(term682502, term682704));
        assertTrue(recursiveEquals(term682594, term682705));
        assertTrue(recursiveEquals(retValue, term682606));
    }

};


