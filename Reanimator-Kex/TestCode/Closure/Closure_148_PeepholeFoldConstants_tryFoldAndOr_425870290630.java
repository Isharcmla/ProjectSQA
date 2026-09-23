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

public class PeepholeFoldConstants_tryFoldAndOr_425870290630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138640;
     Object term138732;
     Object term138824;
     Object term138910;
     Object term139017;
     Object term139018;
     Object term139019;
     Object term139020;
     Object term138970;

    public PeepholeFoldConstants_tryFoldAndOr_425870290630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138640 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term138732 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term138732, term138732.getClass(), "parent", null);
        setIntField(term138732, term138732.getClass(), "type", 0);
        term138824 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term138824, term138824.getClass(), "type", 0);
        term138910 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term139017 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term139017, term139017.getClass(), "currentTraversal", null);
        term139018 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term139018, term139018.getClass(), "number", 0.0);
        setIntField(term139018, term139018.getClass(), "type", 0);
        setField(term139018, term139018.getClass(), "next", null);
        setField(term139018, term139018.getClass(), "first", null);
        setField(term139018, term139018.getClass(), "last", null);
        setField(term139018, term139018.getClass(), "propListHead", null);
        setIntField(term139018, term139018.getClass(), "sourcePosition", 0);
        setField(term139018, term139018.getClass(), "jsType", null);
        setField(term139018, term139018.getClass(), "parent", null);
        term139019 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term139019, term139019.getClass(), "str", null);
        setIntField(term139019, term139019.getClass(), "type", 0);
        setField(term139019, term139019.getClass(), "next", null);
        setField(term139019, term139019.getClass(), "first", null);
        setField(term139019, term139019.getClass(), "last", null);
        setField(term139019, term139019.getClass(), "propListHead", null);
        setIntField(term139019, term139019.getClass(), "sourcePosition", 0);
        setField(term139019, term139019.getClass(), "jsType", null);
        setField(term139019, term139019.getClass(), "parent", null);
        term139020 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term139020, term139020.getClass(), "functionName", null);
        setBooleanField(term139020, term139020.getClass(), "itsNeedsActivation", false);
        setIntField(term139020, term139020.getClass(), "itsFunctionType", 0);
        setBooleanField(term139020, term139020.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term139020, term139020.getClass(), "encodedSourceStart", 0);
        setIntField(term139020, term139020.getClass(), "encodedSourceEnd", 0);
        setField(term139020, term139020.getClass(), "sourceName", null);
        setIntField(term139020, term139020.getClass(), "baseLineno", 0);
        setIntField(term139020, term139020.getClass(), "endLineno", 0);
        setField(term139020, term139020.getClass(), "functions", null);
        setField(term139020, term139020.getClass(), "regexps", null);
        setField(term139020, term139020.getClass(), "itsVariables", null);
        setField(term139020, term139020.getClass(), "itsConst", null);
        setField(term139020, term139020.getClass(), "itsVariableNames", null);
        setIntField(term139020, term139020.getClass(), "varStart", 0);
        setField(term139020, term139020.getClass(), "compilerData", null);
        setIntField(term139020, term139020.getClass(), "type", 0);
        setField(term139020, term139020.getClass(), "next", null);
        setField(term139020, term139020.getClass(), "first", null);
        setField(term139020, term139020.getClass(), "last", null);
        setField(term139020, term139020.getClass(), "propListHead", null);
        setIntField(term139020, term139020.getClass(), "sourcePosition", 0);
        setField(term139020, term139020.getClass(), "jsType", null);
        setField(term139020, term139020.getClass(), "parent", null);
        term138970 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term138970, term138970.getClass(), "number", 0.0);
        setIntField(term138970, term138970.getClass(), "type", 0);
        setField(term138970, term138970.getClass(), "next", null);
        setField(term138970, term138970.getClass(), "first", null);
        setField(term138970, term138970.getClass(), "last", null);
        setField(term138970, term138970.getClass(), "propListHead", null);
        setIntField(term138970, term138970.getClass(), "sourcePosition", 0);
        setField(term138970, term138970.getClass(), "jsType", null);
        setField(term138970, term138970.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term138732;
        args[1] = term138824;
        args[2] = term138910;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term138640, args);
        assertTrue(recursiveEquals(term138640, term139017));
        assertTrue(recursiveEquals(term138732, term139018));
        assertTrue(recursiveEquals(term138824, term139019));
        assertTrue(recursiveEquals(term138910, term139020));
        assertTrue(recursiveEquals(retValue, term138970));
    }

};


