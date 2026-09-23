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

public class PeepholeFoldConstants_tryFoldComparison_8484431791621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413021;
     Object term413113;
     Object term413205;
     Object term413291;
     Object term413771;
     Object term413772;
     Object term413773;
     Object term413774;
     Object term413742;

    public PeepholeFoldConstants_tryFoldComparison_8484431791621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term413021 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term413113 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term413113, term413113.getClass(), "type", 14);
        term413205 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term413205, term413205.getClass(), "type", 14);
        term413291 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term413771 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term413771, term413771.getClass(), "currentTraversal", null);
        term413772 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term413772, term413772.getClass(), "number", 0.0);
        setIntField(term413772, term413772.getClass(), "type", 14);
        setField(term413772, term413772.getClass(), "next", null);
        setField(term413772, term413772.getClass(), "first", null);
        setField(term413772, term413772.getClass(), "last", null);
        setField(term413772, term413772.getClass(), "propListHead", null);
        setIntField(term413772, term413772.getClass(), "sourcePosition", 0);
        setField(term413772, term413772.getClass(), "jsType", null);
        setField(term413772, term413772.getClass(), "parent", null);
        term413773 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term413773, term413773.getClass(), "number", 0.0);
        setIntField(term413773, term413773.getClass(), "type", 14);
        setField(term413773, term413773.getClass(), "next", null);
        setField(term413773, term413773.getClass(), "first", null);
        setField(term413773, term413773.getClass(), "last", null);
        setField(term413773, term413773.getClass(), "propListHead", null);
        setIntField(term413773, term413773.getClass(), "sourcePosition", 0);
        setField(term413773, term413773.getClass(), "jsType", null);
        setField(term413773, term413773.getClass(), "parent", null);
        term413774 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term413774, term413774.getClass(), "functionName", null);
        setBooleanField(term413774, term413774.getClass(), "itsNeedsActivation", false);
        setIntField(term413774, term413774.getClass(), "itsFunctionType", 0);
        setBooleanField(term413774, term413774.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term413774, term413774.getClass(), "encodedSourceStart", 0);
        setIntField(term413774, term413774.getClass(), "encodedSourceEnd", 0);
        setField(term413774, term413774.getClass(), "sourceName", null);
        setIntField(term413774, term413774.getClass(), "baseLineno", 0);
        setIntField(term413774, term413774.getClass(), "endLineno", 0);
        setField(term413774, term413774.getClass(), "functions", null);
        setField(term413774, term413774.getClass(), "regexps", null);
        setField(term413774, term413774.getClass(), "itsVariables", null);
        setField(term413774, term413774.getClass(), "itsConst", null);
        setField(term413774, term413774.getClass(), "itsVariableNames", null);
        setIntField(term413774, term413774.getClass(), "varStart", 0);
        setField(term413774, term413774.getClass(), "compilerData", null);
        setIntField(term413774, term413774.getClass(), "type", 0);
        setField(term413774, term413774.getClass(), "next", null);
        setField(term413774, term413774.getClass(), "first", null);
        setField(term413774, term413774.getClass(), "last", null);
        setField(term413774, term413774.getClass(), "propListHead", null);
        setIntField(term413774, term413774.getClass(), "sourcePosition", 0);
        setField(term413774, term413774.getClass(), "jsType", null);
        setField(term413774, term413774.getClass(), "parent", null);
        term413742 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term413742, term413742.getClass(), "number", 0.0);
        setIntField(term413742, term413742.getClass(), "type", 14);
        setField(term413742, term413742.getClass(), "next", null);
        setField(term413742, term413742.getClass(), "first", null);
        setField(term413742, term413742.getClass(), "last", null);
        setField(term413742, term413742.getClass(), "propListHead", null);
        setIntField(term413742, term413742.getClass(), "sourcePosition", 0);
        setField(term413742, term413742.getClass(), "jsType", null);
        setField(term413742, term413742.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term413113;
        args[1] = term413205;
        args[2] = term413291;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term413021, args);
        assertTrue(recursiveEquals(term413021, term413771));
        assertTrue(recursiveEquals(term413113, term413772));
        assertTrue(recursiveEquals(term413205, term413773));
        assertTrue(recursiveEquals(term413291, term413774));
        assertTrue(recursiveEquals(retValue, term413742));
    }

};


