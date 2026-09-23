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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term572650;
     Object term572742;
     Object term572920;
     Object term573012;
     Object term573076;
     Object term573077;
     Object term573079;
     Object term573080;
     Object term573017;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term572650 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term572742 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term572834 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term572742, term572742.getClass(), "parent", term572834);
        setIntField(term572742, term572742.getClass(), "type", 0);
        term572920 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term572920, term572920.getClass(), "type", 0);
        term573012 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term573012, term573012.getClass(), "type", 47);
        term573076 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term573076, term573076.getClass(), "currentTraversal", null);
        term573077 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term573078 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term573077, term573077.getClass(), "number", 0.0);
        setIntField(term573077, term573077.getClass(), "type", 0);
        setField(term573077, term573077.getClass(), "next", null);
        setField(term573077, term573077.getClass(), "first", null);
        setField(term573077, term573077.getClass(), "last", null);
        setField(term573077, term573077.getClass(), "propListHead", null);
        setIntField(term573077, term573077.getClass(), "sourcePosition", 0);
        setField(term573077, term573077.getClass(), "jsType", null);
        setDoubleField(term573078, term573078.getClass(), "number", 0.0);
        setIntField(term573078, term573078.getClass(), "type", 0);
        setField(term573078, term573078.getClass(), "next", null);
        setField(term573078, term573078.getClass(), "first", null);
        setField(term573078, term573078.getClass(), "last", null);
        setField(term573078, term573078.getClass(), "propListHead", null);
        setIntField(term573078, term573078.getClass(), "sourcePosition", 0);
        setField(term573078, term573078.getClass(), "jsType", null);
        setField(term573078, term573078.getClass(), "parent", null);
        setField(term573077, term573077.getClass(), "parent", term573078);
        term573079 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term573079, term573079.getClass(), "functionName", null);
        setBooleanField(term573079, term573079.getClass(), "itsNeedsActivation", false);
        setIntField(term573079, term573079.getClass(), "itsFunctionType", 0);
        setBooleanField(term573079, term573079.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term573079, term573079.getClass(), "encodedSourceStart", 0);
        setIntField(term573079, term573079.getClass(), "encodedSourceEnd", 0);
        setField(term573079, term573079.getClass(), "sourceName", null);
        setIntField(term573079, term573079.getClass(), "baseLineno", 0);
        setIntField(term573079, term573079.getClass(), "endLineno", 0);
        setField(term573079, term573079.getClass(), "functions", null);
        setField(term573079, term573079.getClass(), "regexps", null);
        setField(term573079, term573079.getClass(), "itsVariables", null);
        setField(term573079, term573079.getClass(), "itsConst", null);
        setField(term573079, term573079.getClass(), "itsVariableNames", null);
        setIntField(term573079, term573079.getClass(), "varStart", 0);
        setField(term573079, term573079.getClass(), "compilerData", null);
        setIntField(term573079, term573079.getClass(), "type", 0);
        setField(term573079, term573079.getClass(), "next", null);
        setField(term573079, term573079.getClass(), "first", null);
        setField(term573079, term573079.getClass(), "last", null);
        setField(term573079, term573079.getClass(), "propListHead", null);
        setIntField(term573079, term573079.getClass(), "sourcePosition", 0);
        setField(term573079, term573079.getClass(), "jsType", null);
        setField(term573079, term573079.getClass(), "parent", null);
        term573080 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term573080, term573080.getClass(), "number", 0.0);
        setIntField(term573080, term573080.getClass(), "type", 47);
        setField(term573080, term573080.getClass(), "next", null);
        setField(term573080, term573080.getClass(), "first", null);
        setField(term573080, term573080.getClass(), "last", null);
        setField(term573080, term573080.getClass(), "propListHead", null);
        setIntField(term573080, term573080.getClass(), "sourcePosition", 0);
        setField(term573080, term573080.getClass(), "jsType", null);
        setField(term573080, term573080.getClass(), "parent", null);
        term573017 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term573021 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term573017, term573017.getClass(), "number", 0.0);
        setIntField(term573017, term573017.getClass(), "type", 0);
        setField(term573017, term573017.getClass(), "next", null);
        setField(term573017, term573017.getClass(), "first", null);
        setField(term573017, term573017.getClass(), "last", null);
        setField(term573017, term573017.getClass(), "propListHead", null);
        setIntField(term573017, term573017.getClass(), "sourcePosition", 0);
        setField(term573017, term573017.getClass(), "jsType", null);
        setDoubleField(term573021, term573021.getClass(), "number", 0.0);
        setIntField(term573021, term573021.getClass(), "type", 0);
        setField(term573021, term573021.getClass(), "next", null);
        setField(term573021, term573021.getClass(), "first", null);
        setField(term573021, term573021.getClass(), "last", null);
        setField(term573021, term573021.getClass(), "propListHead", null);
        setIntField(term573021, term573021.getClass(), "sourcePosition", 0);
        setField(term573021, term573021.getClass(), "jsType", null);
        setField(term573021, term573021.getClass(), "parent", null);
        setField(term573017, term573017.getClass(), "parent", term573021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term572742;
        args[1] = term572920;
        args[2] = term573012;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term572650, args);
        assertTrue(recursiveEquals(term572650, term573076));
        assertTrue(recursiveEquals(term572742, term573077));
        assertTrue(recursiveEquals(term572920, term573079));
        assertTrue(recursiveEquals(term573012, term573080));
        assertTrue(recursiveEquals(retValue, term573017));
    }

};


