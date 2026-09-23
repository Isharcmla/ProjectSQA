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

public class PeepholeFoldConstants_tryFoldAndOr_425870290372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86550;
     Object term86636;
     Object term86728;
     Object term86814;
     Object term87181;
     Object term87182;
     Object term87183;
     Object term87184;
     Object term87126;

    public PeepholeFoldConstants_tryFoldAndOr_425870290372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86550 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term86636 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term86636, term86636.getClass(), "parent", null);
        setIntField(term86636, term86636.getClass(), "type", 0);
        term86728 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term86728, term86728.getClass(), "type", 0);
        term86814 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term87181 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term87181, term87181.getClass(), "currentTraversal", null);
        term87182 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term87182, term87182.getClass(), "functionName", null);
        setBooleanField(term87182, term87182.getClass(), "itsNeedsActivation", false);
        setIntField(term87182, term87182.getClass(), "itsFunctionType", 0);
        setBooleanField(term87182, term87182.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term87182, term87182.getClass(), "encodedSourceStart", 0);
        setIntField(term87182, term87182.getClass(), "encodedSourceEnd", 0);
        setField(term87182, term87182.getClass(), "sourceName", null);
        setIntField(term87182, term87182.getClass(), "baseLineno", 0);
        setIntField(term87182, term87182.getClass(), "endLineno", 0);
        setField(term87182, term87182.getClass(), "functions", null);
        setField(term87182, term87182.getClass(), "regexps", null);
        setField(term87182, term87182.getClass(), "itsVariables", null);
        setField(term87182, term87182.getClass(), "itsConst", null);
        setField(term87182, term87182.getClass(), "itsVariableNames", null);
        setIntField(term87182, term87182.getClass(), "varStart", 0);
        setField(term87182, term87182.getClass(), "compilerData", null);
        setIntField(term87182, term87182.getClass(), "type", 0);
        setField(term87182, term87182.getClass(), "next", null);
        setField(term87182, term87182.getClass(), "first", null);
        setField(term87182, term87182.getClass(), "last", null);
        setField(term87182, term87182.getClass(), "propListHead", null);
        setIntField(term87182, term87182.getClass(), "sourcePosition", 0);
        setField(term87182, term87182.getClass(), "jsType", null);
        setField(term87182, term87182.getClass(), "parent", null);
        term87183 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term87183, term87183.getClass(), "number", 0.0);
        setIntField(term87183, term87183.getClass(), "type", 0);
        setField(term87183, term87183.getClass(), "next", null);
        setField(term87183, term87183.getClass(), "first", null);
        setField(term87183, term87183.getClass(), "last", null);
        setField(term87183, term87183.getClass(), "propListHead", null);
        setIntField(term87183, term87183.getClass(), "sourcePosition", 0);
        setField(term87183, term87183.getClass(), "jsType", null);
        setField(term87183, term87183.getClass(), "parent", null);
        term87184 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term87184, term87184.getClass(), "functionName", null);
        setBooleanField(term87184, term87184.getClass(), "itsNeedsActivation", false);
        setIntField(term87184, term87184.getClass(), "itsFunctionType", 0);
        setBooleanField(term87184, term87184.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term87184, term87184.getClass(), "encodedSourceStart", 0);
        setIntField(term87184, term87184.getClass(), "encodedSourceEnd", 0);
        setField(term87184, term87184.getClass(), "sourceName", null);
        setIntField(term87184, term87184.getClass(), "baseLineno", 0);
        setIntField(term87184, term87184.getClass(), "endLineno", 0);
        setField(term87184, term87184.getClass(), "functions", null);
        setField(term87184, term87184.getClass(), "regexps", null);
        setField(term87184, term87184.getClass(), "itsVariables", null);
        setField(term87184, term87184.getClass(), "itsConst", null);
        setField(term87184, term87184.getClass(), "itsVariableNames", null);
        setIntField(term87184, term87184.getClass(), "varStart", 0);
        setField(term87184, term87184.getClass(), "compilerData", null);
        setIntField(term87184, term87184.getClass(), "type", 0);
        setField(term87184, term87184.getClass(), "next", null);
        setField(term87184, term87184.getClass(), "first", null);
        setField(term87184, term87184.getClass(), "last", null);
        setField(term87184, term87184.getClass(), "propListHead", null);
        setIntField(term87184, term87184.getClass(), "sourcePosition", 0);
        setField(term87184, term87184.getClass(), "jsType", null);
        setField(term87184, term87184.getClass(), "parent", null);
        term87126 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term87126, term87126.getClass(), "functionName", null);
        setBooleanField(term87126, term87126.getClass(), "itsNeedsActivation", false);
        setIntField(term87126, term87126.getClass(), "itsFunctionType", 0);
        setBooleanField(term87126, term87126.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term87126, term87126.getClass(), "encodedSourceStart", 0);
        setIntField(term87126, term87126.getClass(), "encodedSourceEnd", 0);
        setField(term87126, term87126.getClass(), "sourceName", null);
        setIntField(term87126, term87126.getClass(), "baseLineno", 0);
        setIntField(term87126, term87126.getClass(), "endLineno", 0);
        setField(term87126, term87126.getClass(), "functions", null);
        setField(term87126, term87126.getClass(), "regexps", null);
        setField(term87126, term87126.getClass(), "itsVariables", null);
        setField(term87126, term87126.getClass(), "itsConst", null);
        setField(term87126, term87126.getClass(), "itsVariableNames", null);
        setIntField(term87126, term87126.getClass(), "varStart", 0);
        setField(term87126, term87126.getClass(), "compilerData", null);
        setIntField(term87126, term87126.getClass(), "type", 0);
        setField(term87126, term87126.getClass(), "next", null);
        setField(term87126, term87126.getClass(), "first", null);
        setField(term87126, term87126.getClass(), "last", null);
        setField(term87126, term87126.getClass(), "propListHead", null);
        setIntField(term87126, term87126.getClass(), "sourcePosition", 0);
        setField(term87126, term87126.getClass(), "jsType", null);
        setField(term87126, term87126.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term86636;
        args[1] = term86728;
        args[2] = term86814;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term86550, args);
        assertTrue(recursiveEquals(term86550, term87181));
        assertTrue(recursiveEquals(term86636, term87182));
        assertTrue(recursiveEquals(term86728, term87183));
        assertTrue(recursiveEquals(term86814, term87184));
        assertTrue(recursiveEquals(retValue, term87126));
    }

};


