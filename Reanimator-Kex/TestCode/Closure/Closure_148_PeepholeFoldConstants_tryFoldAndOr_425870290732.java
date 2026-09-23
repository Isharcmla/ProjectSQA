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

public class PeepholeFoldConstants_tryFoldAndOr_425870290732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163642;
     Object term163734;
     Object term163826;
     Object term163912;
     Object term164303;
     Object term164304;
     Object term164305;
     Object term164306;
     Object term164256;

    public PeepholeFoldConstants_tryFoldAndOr_425870290732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163642 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term163734 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term163734, term163734.getClass(), "parent", null);
        setIntField(term163734, term163734.getClass(), "type", 0);
        term163826 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term163826, term163826.getClass(), "type", 0);
        term163912 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term164303 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term164303, term164303.getClass(), "currentTraversal", null);
        term164304 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term164304, term164304.getClass(), "number", 0.0);
        setIntField(term164304, term164304.getClass(), "type", 0);
        setField(term164304, term164304.getClass(), "next", null);
        setField(term164304, term164304.getClass(), "first", null);
        setField(term164304, term164304.getClass(), "last", null);
        setField(term164304, term164304.getClass(), "propListHead", null);
        setIntField(term164304, term164304.getClass(), "sourcePosition", 0);
        setField(term164304, term164304.getClass(), "jsType", null);
        setField(term164304, term164304.getClass(), "parent", null);
        term164305 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term164305, term164305.getClass(), "str", null);
        setIntField(term164305, term164305.getClass(), "type", 0);
        setField(term164305, term164305.getClass(), "next", null);
        setField(term164305, term164305.getClass(), "first", null);
        setField(term164305, term164305.getClass(), "last", null);
        setField(term164305, term164305.getClass(), "propListHead", null);
        setIntField(term164305, term164305.getClass(), "sourcePosition", 0);
        setField(term164305, term164305.getClass(), "jsType", null);
        setField(term164305, term164305.getClass(), "parent", null);
        term164306 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term164306, term164306.getClass(), "functionName", null);
        setBooleanField(term164306, term164306.getClass(), "itsNeedsActivation", false);
        setIntField(term164306, term164306.getClass(), "itsFunctionType", 0);
        setBooleanField(term164306, term164306.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term164306, term164306.getClass(), "encodedSourceStart", 0);
        setIntField(term164306, term164306.getClass(), "encodedSourceEnd", 0);
        setField(term164306, term164306.getClass(), "sourceName", null);
        setIntField(term164306, term164306.getClass(), "baseLineno", 0);
        setIntField(term164306, term164306.getClass(), "endLineno", 0);
        setField(term164306, term164306.getClass(), "functions", null);
        setField(term164306, term164306.getClass(), "regexps", null);
        setField(term164306, term164306.getClass(), "itsVariables", null);
        setField(term164306, term164306.getClass(), "itsConst", null);
        setField(term164306, term164306.getClass(), "itsVariableNames", null);
        setIntField(term164306, term164306.getClass(), "varStart", 0);
        setField(term164306, term164306.getClass(), "compilerData", null);
        setIntField(term164306, term164306.getClass(), "type", 0);
        setField(term164306, term164306.getClass(), "next", null);
        setField(term164306, term164306.getClass(), "first", null);
        setField(term164306, term164306.getClass(), "last", null);
        setField(term164306, term164306.getClass(), "propListHead", null);
        setIntField(term164306, term164306.getClass(), "sourcePosition", 0);
        setField(term164306, term164306.getClass(), "jsType", null);
        setField(term164306, term164306.getClass(), "parent", null);
        term164256 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term164256, term164256.getClass(), "number", 0.0);
        setIntField(term164256, term164256.getClass(), "type", 0);
        setField(term164256, term164256.getClass(), "next", null);
        setField(term164256, term164256.getClass(), "first", null);
        setField(term164256, term164256.getClass(), "last", null);
        setField(term164256, term164256.getClass(), "propListHead", null);
        setIntField(term164256, term164256.getClass(), "sourcePosition", 0);
        setField(term164256, term164256.getClass(), "jsType", null);
        setField(term164256, term164256.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term163734;
        args[1] = term163826;
        args[2] = term163912;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term163642, args);
        assertTrue(recursiveEquals(term163642, term164303));
        assertTrue(recursiveEquals(term163734, term164304));
        assertTrue(recursiveEquals(term163826, term164305));
        assertTrue(recursiveEquals(term163912, term164306));
        assertTrue(recursiveEquals(retValue, term164256));
    }

};


