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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318447;
     Object term318539;
     Object term318625;
     Object term318724;
     Object term318725;
     Object term318726;
     Object term318684;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318447 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term318539 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term318539, term318539.getClass(), "parent", null);
        setIntField(term318539, term318539.getClass(), "type", 44);
        term318625 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term318625, term318625.getClass(), "type", 44);
        term318724 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term318724, term318724.getClass(), "currentTraversal", null);
        term318725 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term318725, term318725.getClass(), "number", 0.0);
        setIntField(term318725, term318725.getClass(), "type", 44);
        setField(term318725, term318725.getClass(), "next", null);
        setField(term318725, term318725.getClass(), "first", null);
        setField(term318725, term318725.getClass(), "last", null);
        setField(term318725, term318725.getClass(), "propListHead", null);
        setIntField(term318725, term318725.getClass(), "sourcePosition", 0);
        setField(term318725, term318725.getClass(), "jsType", null);
        setField(term318725, term318725.getClass(), "parent", null);
        term318726 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term318726, term318726.getClass(), "functionName", null);
        setBooleanField(term318726, term318726.getClass(), "itsNeedsActivation", false);
        setIntField(term318726, term318726.getClass(), "itsFunctionType", 0);
        setBooleanField(term318726, term318726.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term318726, term318726.getClass(), "encodedSourceStart", 0);
        setIntField(term318726, term318726.getClass(), "encodedSourceEnd", 0);
        setField(term318726, term318726.getClass(), "sourceName", null);
        setIntField(term318726, term318726.getClass(), "baseLineno", 0);
        setIntField(term318726, term318726.getClass(), "endLineno", 0);
        setField(term318726, term318726.getClass(), "functions", null);
        setField(term318726, term318726.getClass(), "regexps", null);
        setField(term318726, term318726.getClass(), "itsVariables", null);
        setField(term318726, term318726.getClass(), "itsConst", null);
        setField(term318726, term318726.getClass(), "itsVariableNames", null);
        setIntField(term318726, term318726.getClass(), "varStart", 0);
        setField(term318726, term318726.getClass(), "compilerData", null);
        setIntField(term318726, term318726.getClass(), "type", 44);
        setField(term318726, term318726.getClass(), "next", null);
        setField(term318726, term318726.getClass(), "first", null);
        setField(term318726, term318726.getClass(), "last", null);
        setField(term318726, term318726.getClass(), "propListHead", null);
        setIntField(term318726, term318726.getClass(), "sourcePosition", 0);
        setField(term318726, term318726.getClass(), "jsType", null);
        setField(term318726, term318726.getClass(), "parent", null);
        term318684 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term318684, term318684.getClass(), "number", 0.0);
        setIntField(term318684, term318684.getClass(), "type", 44);
        setField(term318684, term318684.getClass(), "next", null);
        setField(term318684, term318684.getClass(), "first", null);
        setField(term318684, term318684.getClass(), "last", null);
        setField(term318684, term318684.getClass(), "propListHead", null);
        setIntField(term318684, term318684.getClass(), "sourcePosition", 0);
        setField(term318684, term318684.getClass(), "jsType", null);
        setField(term318684, term318684.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term318539;
        args[1] = term318625;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term318447, args);
        assertTrue(recursiveEquals(term318447, term318724));
        assertTrue(recursiveEquals(term318539, term318725));
        assertTrue(recursiveEquals(term318625, term318726));
        assertTrue(recursiveEquals(retValue, term318684));
    }

};


