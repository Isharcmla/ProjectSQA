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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710428;
     Object term710514;
     Object term710698;
     Object term710790;
     Object term711504;
     Object term711505;
     Object term711507;
     Object term711508;
     Object term711425;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term710428 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term710514 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term710606 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term710606, term710606.getClass(), "type", 108);
        setField(term710514, term710514.getClass(), "parent", term710606);
        setIntField(term710514, term710514.getClass(), "type", 100);
        term710698 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term710698, term710698.getClass(), "type", 62);
        term710790 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term710790, term710790.getClass(), "type", 44);
        term711504 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term711504, term711504.getClass(), "currentTraversal", null);
        term711505 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term711506 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term711505, term711505.getClass(), "functionName", null);
        setBooleanField(term711505, term711505.getClass(), "itsNeedsActivation", false);
        setIntField(term711505, term711505.getClass(), "itsFunctionType", 0);
        setBooleanField(term711505, term711505.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term711505, term711505.getClass(), "encodedSourceStart", 0);
        setIntField(term711505, term711505.getClass(), "encodedSourceEnd", 0);
        setField(term711505, term711505.getClass(), "sourceName", null);
        setIntField(term711505, term711505.getClass(), "baseLineno", 0);
        setIntField(term711505, term711505.getClass(), "endLineno", 0);
        setField(term711505, term711505.getClass(), "functions", null);
        setField(term711505, term711505.getClass(), "regexps", null);
        setField(term711505, term711505.getClass(), "itsVariables", null);
        setField(term711505, term711505.getClass(), "itsConst", null);
        setField(term711505, term711505.getClass(), "itsVariableNames", null);
        setIntField(term711505, term711505.getClass(), "varStart", 0);
        setField(term711505, term711505.getClass(), "compilerData", null);
        setIntField(term711505, term711505.getClass(), "type", 100);
        setField(term711505, term711505.getClass(), "next", null);
        setField(term711505, term711505.getClass(), "first", null);
        setField(term711505, term711505.getClass(), "last", null);
        setField(term711505, term711505.getClass(), "propListHead", null);
        setIntField(term711505, term711505.getClass(), "sourcePosition", 0);
        setField(term711505, term711505.getClass(), "jsType", null);
        setDoubleField(term711506, term711506.getClass(), "number", 0.0);
        setIntField(term711506, term711506.getClass(), "type", 108);
        setField(term711506, term711506.getClass(), "next", null);
        setField(term711506, term711506.getClass(), "first", null);
        setField(term711506, term711506.getClass(), "last", null);
        setField(term711506, term711506.getClass(), "propListHead", null);
        setIntField(term711506, term711506.getClass(), "sourcePosition", 0);
        setField(term711506, term711506.getClass(), "jsType", null);
        setField(term711506, term711506.getClass(), "parent", null);
        setField(term711505, term711505.getClass(), "parent", term711506);
        term711507 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term711507, term711507.getClass(), "number", 0.0);
        setIntField(term711507, term711507.getClass(), "type", 62);
        setField(term711507, term711507.getClass(), "next", null);
        setField(term711507, term711507.getClass(), "first", null);
        setField(term711507, term711507.getClass(), "last", null);
        setField(term711507, term711507.getClass(), "propListHead", null);
        setIntField(term711507, term711507.getClass(), "sourcePosition", 0);
        setField(term711507, term711507.getClass(), "jsType", null);
        setField(term711507, term711507.getClass(), "parent", null);
        term711508 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term711508, term711508.getClass(), "str", null);
        setIntField(term711508, term711508.getClass(), "type", 44);
        setField(term711508, term711508.getClass(), "next", null);
        setField(term711508, term711508.getClass(), "first", null);
        setField(term711508, term711508.getClass(), "last", null);
        setField(term711508, term711508.getClass(), "propListHead", null);
        setIntField(term711508, term711508.getClass(), "sourcePosition", 0);
        setField(term711508, term711508.getClass(), "jsType", null);
        setField(term711508, term711508.getClass(), "parent", null);
        term711425 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term711436 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term711425, term711425.getClass(), "functionName", null);
        setBooleanField(term711425, term711425.getClass(), "itsNeedsActivation", false);
        setIntField(term711425, term711425.getClass(), "itsFunctionType", 0);
        setBooleanField(term711425, term711425.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term711425, term711425.getClass(), "encodedSourceStart", 0);
        setIntField(term711425, term711425.getClass(), "encodedSourceEnd", 0);
        setField(term711425, term711425.getClass(), "sourceName", null);
        setIntField(term711425, term711425.getClass(), "baseLineno", 0);
        setIntField(term711425, term711425.getClass(), "endLineno", 0);
        setField(term711425, term711425.getClass(), "functions", null);
        setField(term711425, term711425.getClass(), "regexps", null);
        setField(term711425, term711425.getClass(), "itsVariables", null);
        setField(term711425, term711425.getClass(), "itsConst", null);
        setField(term711425, term711425.getClass(), "itsVariableNames", null);
        setIntField(term711425, term711425.getClass(), "varStart", 0);
        setField(term711425, term711425.getClass(), "compilerData", null);
        setIntField(term711425, term711425.getClass(), "type", 100);
        setField(term711425, term711425.getClass(), "next", null);
        setField(term711425, term711425.getClass(), "first", null);
        setField(term711425, term711425.getClass(), "last", null);
        setField(term711425, term711425.getClass(), "propListHead", null);
        setIntField(term711425, term711425.getClass(), "sourcePosition", 0);
        setField(term711425, term711425.getClass(), "jsType", null);
        setDoubleField(term711436, term711436.getClass(), "number", 0.0);
        setIntField(term711436, term711436.getClass(), "type", 108);
        setField(term711436, term711436.getClass(), "next", null);
        setField(term711436, term711436.getClass(), "first", null);
        setField(term711436, term711436.getClass(), "last", null);
        setField(term711436, term711436.getClass(), "propListHead", null);
        setIntField(term711436, term711436.getClass(), "sourcePosition", 0);
        setField(term711436, term711436.getClass(), "jsType", null);
        setField(term711436, term711436.getClass(), "parent", null);
        setField(term711425, term711425.getClass(), "parent", term711436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term710514;
        args[1] = term710698;
        args[2] = term710790;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term710428, args);
        assertTrue(recursiveEquals(term710428, term711504));
        assertTrue(recursiveEquals(term710514, term711505));
        assertTrue(recursiveEquals(term710698, term711507));
        assertTrue(recursiveEquals(term710790, term711508));
        assertTrue(recursiveEquals(retValue, term711425));
    }

};


