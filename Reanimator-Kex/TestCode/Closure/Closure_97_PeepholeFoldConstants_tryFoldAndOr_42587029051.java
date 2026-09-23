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

public class PeepholeFoldConstants_tryFoldAndOr_42587029051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8843;
     Object term8913;
     Object term8983;
     Object term9069;
     Object term9306;
     Object term9307;
     Object term9308;
     Object term9309;
     Object term9260;

    public PeepholeFoldConstants_tryFoldAndOr_42587029051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8843 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term8913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term8913, term8913.getClass(), "parent", null);
        setIntField(term8913, term8913.getClass(), "type", 0);
        term8983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8983, term8983.getClass(), "type", 0);
        term9069 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term9306 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term9306, term9306.getClass(), "currentTraversal", null);
        term9307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9307, term9307.getClass(), "type", 0);
        setField(term9307, term9307.getClass(), "next", null);
        setField(term9307, term9307.getClass(), "first", null);
        setField(term9307, term9307.getClass(), "last", null);
        setField(term9307, term9307.getClass(), "propListHead", null);
        setIntField(term9307, term9307.getClass(), "sourcePosition", 0);
        setField(term9307, term9307.getClass(), "jsType", null);
        setField(term9307, term9307.getClass(), "parent", null);
        term9308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9308, term9308.getClass(), "type", 0);
        setField(term9308, term9308.getClass(), "next", null);
        setField(term9308, term9308.getClass(), "first", null);
        setField(term9308, term9308.getClass(), "last", null);
        setField(term9308, term9308.getClass(), "propListHead", null);
        setIntField(term9308, term9308.getClass(), "sourcePosition", 0);
        setField(term9308, term9308.getClass(), "jsType", null);
        setField(term9308, term9308.getClass(), "parent", null);
        term9309 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term9309, term9309.getClass(), "functionName", null);
        setBooleanField(term9309, term9309.getClass(), "itsNeedsActivation", false);
        setIntField(term9309, term9309.getClass(), "itsFunctionType", 0);
        setBooleanField(term9309, term9309.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term9309, term9309.getClass(), "encodedSourceStart", 0);
        setIntField(term9309, term9309.getClass(), "encodedSourceEnd", 0);
        setField(term9309, term9309.getClass(), "sourceName", null);
        setIntField(term9309, term9309.getClass(), "baseLineno", 0);
        setIntField(term9309, term9309.getClass(), "endLineno", 0);
        setField(term9309, term9309.getClass(), "functions", null);
        setField(term9309, term9309.getClass(), "regexps", null);
        setField(term9309, term9309.getClass(), "itsVariables", null);
        setField(term9309, term9309.getClass(), "itsConst", null);
        setField(term9309, term9309.getClass(), "itsVariableNames", null);
        setIntField(term9309, term9309.getClass(), "varStart", 0);
        setField(term9309, term9309.getClass(), "compilerData", null);
        setIntField(term9309, term9309.getClass(), "type", 0);
        setField(term9309, term9309.getClass(), "next", null);
        setField(term9309, term9309.getClass(), "first", null);
        setField(term9309, term9309.getClass(), "last", null);
        setField(term9309, term9309.getClass(), "propListHead", null);
        setIntField(term9309, term9309.getClass(), "sourcePosition", 0);
        setField(term9309, term9309.getClass(), "jsType", null);
        setField(term9309, term9309.getClass(), "parent", null);
        term9260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9260, term9260.getClass(), "type", 0);
        setField(term9260, term9260.getClass(), "next", null);
        setField(term9260, term9260.getClass(), "first", null);
        setField(term9260, term9260.getClass(), "last", null);
        setField(term9260, term9260.getClass(), "propListHead", null);
        setIntField(term9260, term9260.getClass(), "sourcePosition", 0);
        setField(term9260, term9260.getClass(), "jsType", null);
        setField(term9260, term9260.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term8913;
        args[1] = term8983;
        args[2] = term9069;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term8843, args);
        assertTrue(recursiveEquals(term8843, term9306));
        assertTrue(recursiveEquals(term8913, term9307));
        assertTrue(recursiveEquals(term8983, term9308));
        assertTrue(recursiveEquals(term9069, term9309));
        assertTrue(recursiveEquals(retValue, term9260));
    }

};


