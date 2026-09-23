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

public class PeepholeFoldConstants_tryFoldComparison_8484431791044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325035;
     Object term325127;
     Object term325219;
     Object term325305;
     Object term325631;
     Object term325632;
     Object term325633;
     Object term325634;
     Object term325599;

    public PeepholeFoldConstants_tryFoldComparison_8484431791044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term325035 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term325127 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term325127, term325127.getClass(), "type", 16);
        term325219 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term325219, term325219.getClass(), "type", 42);
        term325305 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term325305, term325305.getClass(), "type", 16);
        term325631 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term325631, term325631.getClass(), "currentTraversal", null);
        term325632 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term325632, term325632.getClass(), "number", 0.0);
        setIntField(term325632, term325632.getClass(), "type", 42);
        setField(term325632, term325632.getClass(), "next", null);
        setField(term325632, term325632.getClass(), "first", null);
        setField(term325632, term325632.getClass(), "last", null);
        setField(term325632, term325632.getClass(), "propListHead", null);
        setIntField(term325632, term325632.getClass(), "sourcePosition", 0);
        setField(term325632, term325632.getClass(), "jsType", null);
        setField(term325632, term325632.getClass(), "parent", null);
        term325633 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term325633, term325633.getClass(), "number", 0.0);
        setIntField(term325633, term325633.getClass(), "type", 16);
        setField(term325633, term325633.getClass(), "next", null);
        setField(term325633, term325633.getClass(), "first", null);
        setField(term325633, term325633.getClass(), "last", null);
        setField(term325633, term325633.getClass(), "propListHead", null);
        setIntField(term325633, term325633.getClass(), "sourcePosition", 0);
        setField(term325633, term325633.getClass(), "jsType", null);
        setField(term325633, term325633.getClass(), "parent", null);
        term325634 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term325634, term325634.getClass(), "functionName", null);
        setBooleanField(term325634, term325634.getClass(), "itsNeedsActivation", false);
        setIntField(term325634, term325634.getClass(), "itsFunctionType", 0);
        setBooleanField(term325634, term325634.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term325634, term325634.getClass(), "encodedSourceStart", 0);
        setIntField(term325634, term325634.getClass(), "encodedSourceEnd", 0);
        setField(term325634, term325634.getClass(), "sourceName", null);
        setIntField(term325634, term325634.getClass(), "baseLineno", 0);
        setIntField(term325634, term325634.getClass(), "endLineno", 0);
        setField(term325634, term325634.getClass(), "functions", null);
        setField(term325634, term325634.getClass(), "regexps", null);
        setField(term325634, term325634.getClass(), "itsVariables", null);
        setField(term325634, term325634.getClass(), "itsConst", null);
        setField(term325634, term325634.getClass(), "itsVariableNames", null);
        setIntField(term325634, term325634.getClass(), "varStart", 0);
        setField(term325634, term325634.getClass(), "compilerData", null);
        setIntField(term325634, term325634.getClass(), "type", 16);
        setField(term325634, term325634.getClass(), "next", null);
        setField(term325634, term325634.getClass(), "first", null);
        setField(term325634, term325634.getClass(), "last", null);
        setField(term325634, term325634.getClass(), "propListHead", null);
        setIntField(term325634, term325634.getClass(), "sourcePosition", 0);
        setField(term325634, term325634.getClass(), "jsType", null);
        setField(term325634, term325634.getClass(), "parent", null);
        term325599 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term325599, term325599.getClass(), "number", 0.0);
        setIntField(term325599, term325599.getClass(), "type", 16);
        setField(term325599, term325599.getClass(), "next", null);
        setField(term325599, term325599.getClass(), "first", null);
        setField(term325599, term325599.getClass(), "last", null);
        setField(term325599, term325599.getClass(), "propListHead", null);
        setIntField(term325599, term325599.getClass(), "sourcePosition", 0);
        setField(term325599, term325599.getClass(), "jsType", null);
        setField(term325599, term325599.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term325127;
        args[1] = term325219;
        args[2] = term325305;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term325035, args);
        assertTrue(recursiveEquals(term325035, term325631));
        assertTrue(recursiveEquals(term325127, term325632));
        assertTrue(recursiveEquals(term325219, term325633));
        assertTrue(recursiveEquals(term325305, term325634));
        assertTrue(recursiveEquals(retValue, term325599));
    }

};


