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

public class PeepholeFoldConstants_tryFoldTypeof_10367868771449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term542384;
     Object term542470;
     Object term542882;
     Object term542883;
     Object term542852;

    public PeepholeFoldConstants_tryFoldTypeof_10367868771449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term542384 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term542470 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term542562 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term542470, term542470.getClass(), "type", 32);
        setField(term542470, term542470.getClass(), "first", term542562);
        term542882 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term542882, term542882.getClass(), "currentTraversal", null);
        term542883 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term542884 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term542883, term542883.getClass(), "functionName", null);
        setBooleanField(term542883, term542883.getClass(), "itsNeedsActivation", false);
        setIntField(term542883, term542883.getClass(), "itsFunctionType", 0);
        setBooleanField(term542883, term542883.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term542883, term542883.getClass(), "encodedSourceStart", 0);
        setIntField(term542883, term542883.getClass(), "encodedSourceEnd", 0);
        setField(term542883, term542883.getClass(), "sourceName", null);
        setIntField(term542883, term542883.getClass(), "baseLineno", 0);
        setIntField(term542883, term542883.getClass(), "endLineno", 0);
        setField(term542883, term542883.getClass(), "functions", null);
        setField(term542883, term542883.getClass(), "regexps", null);
        setField(term542883, term542883.getClass(), "itsVariables", null);
        setField(term542883, term542883.getClass(), "itsConst", null);
        setField(term542883, term542883.getClass(), "itsVariableNames", null);
        setIntField(term542883, term542883.getClass(), "varStart", 0);
        setField(term542883, term542883.getClass(), "compilerData", null);
        setIntField(term542883, term542883.getClass(), "type", 32);
        setField(term542883, term542883.getClass(), "next", null);
        setField(term542884, term542884.getClass(), "str", null);
        setIntField(term542884, term542884.getClass(), "type", 0);
        setField(term542884, term542884.getClass(), "next", null);
        setField(term542884, term542884.getClass(), "first", null);
        setField(term542884, term542884.getClass(), "last", null);
        setField(term542884, term542884.getClass(), "propListHead", null);
        setIntField(term542884, term542884.getClass(), "sourcePosition", 0);
        setField(term542884, term542884.getClass(), "jsType", null);
        setField(term542884, term542884.getClass(), "parent", null);
        setField(term542883, term542883.getClass(), "first", term542884);
        setField(term542883, term542883.getClass(), "last", null);
        setField(term542883, term542883.getClass(), "propListHead", null);
        setIntField(term542883, term542883.getClass(), "sourcePosition", 0);
        setField(term542883, term542883.getClass(), "jsType", null);
        setField(term542883, term542883.getClass(), "parent", null);
        term542852 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term542862 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term542852, term542852.getClass(), "functionName", null);
        setBooleanField(term542852, term542852.getClass(), "itsNeedsActivation", false);
        setIntField(term542852, term542852.getClass(), "itsFunctionType", 0);
        setBooleanField(term542852, term542852.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term542852, term542852.getClass(), "encodedSourceStart", 0);
        setIntField(term542852, term542852.getClass(), "encodedSourceEnd", 0);
        setField(term542852, term542852.getClass(), "sourceName", null);
        setIntField(term542852, term542852.getClass(), "baseLineno", 0);
        setIntField(term542852, term542852.getClass(), "endLineno", 0);
        setField(term542852, term542852.getClass(), "functions", null);
        setField(term542852, term542852.getClass(), "regexps", null);
        setField(term542852, term542852.getClass(), "itsVariables", null);
        setField(term542852, term542852.getClass(), "itsConst", null);
        setField(term542852, term542852.getClass(), "itsVariableNames", null);
        setIntField(term542852, term542852.getClass(), "varStart", 0);
        setField(term542852, term542852.getClass(), "compilerData", null);
        setIntField(term542852, term542852.getClass(), "type", 32);
        setField(term542852, term542852.getClass(), "next", null);
        setField(term542862, term542862.getClass(), "str", null);
        setIntField(term542862, term542862.getClass(), "type", 0);
        setField(term542862, term542862.getClass(), "next", null);
        setField(term542862, term542862.getClass(), "first", null);
        setField(term542862, term542862.getClass(), "last", null);
        setField(term542862, term542862.getClass(), "propListHead", null);
        setIntField(term542862, term542862.getClass(), "sourcePosition", 0);
        setField(term542862, term542862.getClass(), "jsType", null);
        setField(term542862, term542862.getClass(), "parent", null);
        setField(term542852, term542852.getClass(), "first", term542862);
        setField(term542852, term542852.getClass(), "last", null);
        setField(term542852, term542852.getClass(), "propListHead", null);
        setIntField(term542852, term542852.getClass(), "sourcePosition", 0);
        setField(term542852, term542852.getClass(), "jsType", null);
        setField(term542852, term542852.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term542470;
        Object retValue = callMethod(klass, "tryFoldTypeof", argTypes, term542384, args);
        assertTrue(recursiveEquals(term542384, term542882));
        assertTrue(recursiveEquals(term542470, term542883));
        assertTrue(recursiveEquals(retValue, term542852));
    }

};


