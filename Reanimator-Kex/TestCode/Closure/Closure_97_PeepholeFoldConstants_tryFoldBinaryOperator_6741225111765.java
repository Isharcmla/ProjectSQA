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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691022;
     Object term691114;
     Object term691711;
     Object term691712;
     Object term691662;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term691022 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term691114 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term691200 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term691270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term691200, term691200.getClass(), "next", term691270);
        setField(term691114, term691114.getClass(), "first", term691200);
        setIntField(term691114, term691114.getClass(), "type", 33);
        term691711 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term691711, term691711.getClass(), "currentTraversal", null);
        term691712 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term691713 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term691714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term691712, term691712.getClass(), "number", 0.0);
        setIntField(term691712, term691712.getClass(), "type", 33);
        setField(term691712, term691712.getClass(), "next", null);
        setField(term691713, term691713.getClass(), "functionName", null);
        setBooleanField(term691713, term691713.getClass(), "itsNeedsActivation", false);
        setIntField(term691713, term691713.getClass(), "itsFunctionType", 0);
        setBooleanField(term691713, term691713.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term691713, term691713.getClass(), "encodedSourceStart", 0);
        setIntField(term691713, term691713.getClass(), "encodedSourceEnd", 0);
        setField(term691713, term691713.getClass(), "sourceName", null);
        setIntField(term691713, term691713.getClass(), "baseLineno", 0);
        setIntField(term691713, term691713.getClass(), "endLineno", 0);
        setField(term691713, term691713.getClass(), "functions", null);
        setField(term691713, term691713.getClass(), "regexps", null);
        setField(term691713, term691713.getClass(), "itsVariables", null);
        setField(term691713, term691713.getClass(), "itsConst", null);
        setField(term691713, term691713.getClass(), "itsVariableNames", null);
        setIntField(term691713, term691713.getClass(), "varStart", 0);
        setField(term691713, term691713.getClass(), "compilerData", null);
        setIntField(term691713, term691713.getClass(), "type", 0);
        setIntField(term691714, term691714.getClass(), "type", 0);
        setField(term691714, term691714.getClass(), "next", null);
        setField(term691714, term691714.getClass(), "first", null);
        setField(term691714, term691714.getClass(), "last", null);
        setField(term691714, term691714.getClass(), "propListHead", null);
        setIntField(term691714, term691714.getClass(), "sourcePosition", 0);
        setField(term691714, term691714.getClass(), "jsType", null);
        setField(term691714, term691714.getClass(), "parent", null);
        setField(term691713, term691713.getClass(), "next", term691714);
        setField(term691713, term691713.getClass(), "first", null);
        setField(term691713, term691713.getClass(), "last", null);
        setField(term691713, term691713.getClass(), "propListHead", null);
        setIntField(term691713, term691713.getClass(), "sourcePosition", 0);
        setField(term691713, term691713.getClass(), "jsType", null);
        setField(term691713, term691713.getClass(), "parent", null);
        setField(term691712, term691712.getClass(), "first", term691713);
        setField(term691712, term691712.getClass(), "last", null);
        setField(term691712, term691712.getClass(), "propListHead", null);
        setIntField(term691712, term691712.getClass(), "sourcePosition", 0);
        setField(term691712, term691712.getClass(), "jsType", null);
        setField(term691712, term691712.getClass(), "parent", null);
        term691662 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term691665 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term691675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term691662, term691662.getClass(), "number", 0.0);
        setIntField(term691662, term691662.getClass(), "type", 33);
        setField(term691662, term691662.getClass(), "next", null);
        setField(term691665, term691665.getClass(), "functionName", null);
        setBooleanField(term691665, term691665.getClass(), "itsNeedsActivation", false);
        setIntField(term691665, term691665.getClass(), "itsFunctionType", 0);
        setBooleanField(term691665, term691665.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term691665, term691665.getClass(), "encodedSourceStart", 0);
        setIntField(term691665, term691665.getClass(), "encodedSourceEnd", 0);
        setField(term691665, term691665.getClass(), "sourceName", null);
        setIntField(term691665, term691665.getClass(), "baseLineno", 0);
        setIntField(term691665, term691665.getClass(), "endLineno", 0);
        setField(term691665, term691665.getClass(), "functions", null);
        setField(term691665, term691665.getClass(), "regexps", null);
        setField(term691665, term691665.getClass(), "itsVariables", null);
        setField(term691665, term691665.getClass(), "itsConst", null);
        setField(term691665, term691665.getClass(), "itsVariableNames", null);
        setIntField(term691665, term691665.getClass(), "varStart", 0);
        setField(term691665, term691665.getClass(), "compilerData", null);
        setIntField(term691665, term691665.getClass(), "type", 0);
        setIntField(term691675, term691675.getClass(), "type", 0);
        setField(term691675, term691675.getClass(), "next", null);
        setField(term691675, term691675.getClass(), "first", null);
        setField(term691675, term691675.getClass(), "last", null);
        setField(term691675, term691675.getClass(), "propListHead", null);
        setIntField(term691675, term691675.getClass(), "sourcePosition", 0);
        setField(term691675, term691675.getClass(), "jsType", null);
        setField(term691675, term691675.getClass(), "parent", null);
        setField(term691665, term691665.getClass(), "next", term691675);
        setField(term691665, term691665.getClass(), "first", null);
        setField(term691665, term691665.getClass(), "last", null);
        setField(term691665, term691665.getClass(), "propListHead", null);
        setIntField(term691665, term691665.getClass(), "sourcePosition", 0);
        setField(term691665, term691665.getClass(), "jsType", null);
        setField(term691665, term691665.getClass(), "parent", null);
        setField(term691662, term691662.getClass(), "first", term691665);
        setField(term691662, term691662.getClass(), "last", null);
        setField(term691662, term691662.getClass(), "propListHead", null);
        setIntField(term691662, term691662.getClass(), "sourcePosition", 0);
        setField(term691662, term691662.getClass(), "jsType", null);
        setField(term691662, term691662.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term691114;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term691022, args);
        assertTrue(recursiveEquals(term691022, term691711));
        assertTrue(recursiveEquals(term691114, term691712));
        assertTrue(recursiveEquals(retValue, term691662));
    }

};


