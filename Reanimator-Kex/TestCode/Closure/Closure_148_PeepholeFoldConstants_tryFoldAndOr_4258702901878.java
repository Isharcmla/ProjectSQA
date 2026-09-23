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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495713;
     Object term495799;
     Object term495983;
     Object term496075;
     Object term496517;
     Object term496518;
     Object term496520;
     Object term496521;
     Object term496439;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495713 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term495799 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term495891 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term495891, term495891.getClass(), "type", 108);
        setField(term495799, term495799.getClass(), "parent", term495891);
        setIntField(term495799, term495799.getClass(), "type", 0);
        term495983 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term495983, term495983.getClass(), "type", 78);
        term496075 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term496075, term496075.getClass(), "type", 44);
        term496517 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term496517, term496517.getClass(), "currentTraversal", null);
        term496518 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term496519 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term496518, term496518.getClass(), "functionName", null);
        setBooleanField(term496518, term496518.getClass(), "itsNeedsActivation", false);
        setIntField(term496518, term496518.getClass(), "itsFunctionType", 0);
        setBooleanField(term496518, term496518.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term496518, term496518.getClass(), "encodedSourceStart", 0);
        setIntField(term496518, term496518.getClass(), "encodedSourceEnd", 0);
        setField(term496518, term496518.getClass(), "sourceName", null);
        setIntField(term496518, term496518.getClass(), "baseLineno", 0);
        setIntField(term496518, term496518.getClass(), "endLineno", 0);
        setField(term496518, term496518.getClass(), "functions", null);
        setField(term496518, term496518.getClass(), "regexps", null);
        setField(term496518, term496518.getClass(), "itsVariables", null);
        setField(term496518, term496518.getClass(), "itsConst", null);
        setField(term496518, term496518.getClass(), "itsVariableNames", null);
        setIntField(term496518, term496518.getClass(), "varStart", 0);
        setField(term496518, term496518.getClass(), "compilerData", null);
        setIntField(term496518, term496518.getClass(), "type", 0);
        setField(term496518, term496518.getClass(), "next", null);
        setField(term496518, term496518.getClass(), "first", null);
        setField(term496518, term496518.getClass(), "last", null);
        setField(term496518, term496518.getClass(), "propListHead", null);
        setIntField(term496518, term496518.getClass(), "sourcePosition", 0);
        setField(term496518, term496518.getClass(), "jsType", null);
        setDoubleField(term496519, term496519.getClass(), "number", 0.0);
        setIntField(term496519, term496519.getClass(), "type", 108);
        setField(term496519, term496519.getClass(), "next", null);
        setField(term496519, term496519.getClass(), "first", null);
        setField(term496519, term496519.getClass(), "last", null);
        setField(term496519, term496519.getClass(), "propListHead", null);
        setIntField(term496519, term496519.getClass(), "sourcePosition", 0);
        setField(term496519, term496519.getClass(), "jsType", null);
        setField(term496519, term496519.getClass(), "parent", null);
        setField(term496518, term496518.getClass(), "parent", term496519);
        term496520 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term496520, term496520.getClass(), "number", 0.0);
        setIntField(term496520, term496520.getClass(), "type", 78);
        setField(term496520, term496520.getClass(), "next", null);
        setField(term496520, term496520.getClass(), "first", null);
        setField(term496520, term496520.getClass(), "last", null);
        setField(term496520, term496520.getClass(), "propListHead", null);
        setIntField(term496520, term496520.getClass(), "sourcePosition", 0);
        setField(term496520, term496520.getClass(), "jsType", null);
        setField(term496520, term496520.getClass(), "parent", null);
        term496521 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term496521, term496521.getClass(), "str", null);
        setIntField(term496521, term496521.getClass(), "type", 44);
        setField(term496521, term496521.getClass(), "next", null);
        setField(term496521, term496521.getClass(), "first", null);
        setField(term496521, term496521.getClass(), "last", null);
        setField(term496521, term496521.getClass(), "propListHead", null);
        setIntField(term496521, term496521.getClass(), "sourcePosition", 0);
        setField(term496521, term496521.getClass(), "jsType", null);
        setField(term496521, term496521.getClass(), "parent", null);
        term496439 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term496450 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term496439, term496439.getClass(), "functionName", null);
        setBooleanField(term496439, term496439.getClass(), "itsNeedsActivation", false);
        setIntField(term496439, term496439.getClass(), "itsFunctionType", 0);
        setBooleanField(term496439, term496439.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term496439, term496439.getClass(), "encodedSourceStart", 0);
        setIntField(term496439, term496439.getClass(), "encodedSourceEnd", 0);
        setField(term496439, term496439.getClass(), "sourceName", null);
        setIntField(term496439, term496439.getClass(), "baseLineno", 0);
        setIntField(term496439, term496439.getClass(), "endLineno", 0);
        setField(term496439, term496439.getClass(), "functions", null);
        setField(term496439, term496439.getClass(), "regexps", null);
        setField(term496439, term496439.getClass(), "itsVariables", null);
        setField(term496439, term496439.getClass(), "itsConst", null);
        setField(term496439, term496439.getClass(), "itsVariableNames", null);
        setIntField(term496439, term496439.getClass(), "varStart", 0);
        setField(term496439, term496439.getClass(), "compilerData", null);
        setIntField(term496439, term496439.getClass(), "type", 0);
        setField(term496439, term496439.getClass(), "next", null);
        setField(term496439, term496439.getClass(), "first", null);
        setField(term496439, term496439.getClass(), "last", null);
        setField(term496439, term496439.getClass(), "propListHead", null);
        setIntField(term496439, term496439.getClass(), "sourcePosition", 0);
        setField(term496439, term496439.getClass(), "jsType", null);
        setDoubleField(term496450, term496450.getClass(), "number", 0.0);
        setIntField(term496450, term496450.getClass(), "type", 108);
        setField(term496450, term496450.getClass(), "next", null);
        setField(term496450, term496450.getClass(), "first", null);
        setField(term496450, term496450.getClass(), "last", null);
        setField(term496450, term496450.getClass(), "propListHead", null);
        setIntField(term496450, term496450.getClass(), "sourcePosition", 0);
        setField(term496450, term496450.getClass(), "jsType", null);
        setField(term496450, term496450.getClass(), "parent", null);
        setField(term496439, term496439.getClass(), "parent", term496450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term495799;
        args[1] = term495983;
        args[2] = term496075;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term495713, args);
        assertTrue(recursiveEquals(term495713, term496517));
        assertTrue(recursiveEquals(term495799, term496518));
        assertTrue(recursiveEquals(term495983, term496520));
        assertTrue(recursiveEquals(term496075, term496521));
        assertTrue(recursiveEquals(retValue, term496439));
    }

};


