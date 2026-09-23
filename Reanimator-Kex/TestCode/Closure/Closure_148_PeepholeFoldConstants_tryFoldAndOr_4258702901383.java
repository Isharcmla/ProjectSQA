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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338456;
     Object term338585;
     Object term339030;
     Object term339031;
     Object term339032;
     Object term338994;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term338456 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term338585 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term338585, term338585.getClass(), "parent", null);
        setIntField(term338585, term338585.getClass(), "type", 63);
        term339030 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term339030, term339030.getClass(), "currentTraversal", null);
        term339031 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term339031, term339031.getClass(), "functionName", null);
        setBooleanField(term339031, term339031.getClass(), "itsNeedsActivation", false);
        setIntField(term339031, term339031.getClass(), "itsFunctionType", 0);
        setBooleanField(term339031, term339031.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term339031, term339031.getClass(), "encodedSourceStart", 0);
        setIntField(term339031, term339031.getClass(), "encodedSourceEnd", 0);
        setField(term339031, term339031.getClass(), "sourceName", null);
        setIntField(term339031, term339031.getClass(), "baseLineno", 0);
        setIntField(term339031, term339031.getClass(), "endLineno", 0);
        setField(term339031, term339031.getClass(), "functions", null);
        setField(term339031, term339031.getClass(), "regexps", null);
        setField(term339031, term339031.getClass(), "itsVariables", null);
        setField(term339031, term339031.getClass(), "itsConst", null);
        setField(term339031, term339031.getClass(), "itsVariableNames", null);
        setIntField(term339031, term339031.getClass(), "varStart", 0);
        setField(term339031, term339031.getClass(), "compilerData", null);
        setIntField(term339031, term339031.getClass(), "type", 63);
        setField(term339031, term339031.getClass(), "next", null);
        setField(term339031, term339031.getClass(), "first", null);
        setField(term339031, term339031.getClass(), "last", null);
        setField(term339031, term339031.getClass(), "propListHead", null);
        setIntField(term339031, term339031.getClass(), "sourcePosition", 0);
        setField(term339031, term339031.getClass(), "jsType", null);
        setField(term339031, term339031.getClass(), "parent", null);
        term339032 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term339032, term339032.getClass(), "functionName", null);
        setBooleanField(term339032, term339032.getClass(), "itsNeedsActivation", false);
        setIntField(term339032, term339032.getClass(), "itsFunctionType", 0);
        setBooleanField(term339032, term339032.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term339032, term339032.getClass(), "encodedSourceStart", 0);
        setIntField(term339032, term339032.getClass(), "encodedSourceEnd", 0);
        setField(term339032, term339032.getClass(), "sourceName", null);
        setIntField(term339032, term339032.getClass(), "baseLineno", 0);
        setIntField(term339032, term339032.getClass(), "endLineno", 0);
        setField(term339032, term339032.getClass(), "functions", null);
        setField(term339032, term339032.getClass(), "regexps", null);
        setField(term339032, term339032.getClass(), "itsVariables", null);
        setField(term339032, term339032.getClass(), "itsConst", null);
        setField(term339032, term339032.getClass(), "itsVariableNames", null);
        setIntField(term339032, term339032.getClass(), "varStart", 0);
        setField(term339032, term339032.getClass(), "compilerData", null);
        setIntField(term339032, term339032.getClass(), "type", 63);
        setField(term339032, term339032.getClass(), "next", null);
        setField(term339032, term339032.getClass(), "first", null);
        setField(term339032, term339032.getClass(), "last", null);
        setField(term339032, term339032.getClass(), "propListHead", null);
        setIntField(term339032, term339032.getClass(), "sourcePosition", 0);
        setField(term339032, term339032.getClass(), "jsType", null);
        setField(term339032, term339032.getClass(), "parent", null);
        term338994 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term338994, term338994.getClass(), "functionName", null);
        setBooleanField(term338994, term338994.getClass(), "itsNeedsActivation", false);
        setIntField(term338994, term338994.getClass(), "itsFunctionType", 0);
        setBooleanField(term338994, term338994.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term338994, term338994.getClass(), "encodedSourceStart", 0);
        setIntField(term338994, term338994.getClass(), "encodedSourceEnd", 0);
        setField(term338994, term338994.getClass(), "sourceName", null);
        setIntField(term338994, term338994.getClass(), "baseLineno", 0);
        setIntField(term338994, term338994.getClass(), "endLineno", 0);
        setField(term338994, term338994.getClass(), "functions", null);
        setField(term338994, term338994.getClass(), "regexps", null);
        setField(term338994, term338994.getClass(), "itsVariables", null);
        setField(term338994, term338994.getClass(), "itsConst", null);
        setField(term338994, term338994.getClass(), "itsVariableNames", null);
        setIntField(term338994, term338994.getClass(), "varStart", 0);
        setField(term338994, term338994.getClass(), "compilerData", null);
        setIntField(term338994, term338994.getClass(), "type", 63);
        setField(term338994, term338994.getClass(), "next", null);
        setField(term338994, term338994.getClass(), "first", null);
        setField(term338994, term338994.getClass(), "last", null);
        setField(term338994, term338994.getClass(), "propListHead", null);
        setIntField(term338994, term338994.getClass(), "sourcePosition", 0);
        setField(term338994, term338994.getClass(), "jsType", null);
        setField(term338994, term338994.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term338585;
        args[1] = term338585;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term338456, args);
        assertTrue(recursiveEquals(term338456, term339030));
        assertTrue(recursiveEquals(term338585, term339031));
        assertTrue(recursiveEquals(term338585, term339032));
        assertTrue(recursiveEquals(retValue, term338994));
    }

};


