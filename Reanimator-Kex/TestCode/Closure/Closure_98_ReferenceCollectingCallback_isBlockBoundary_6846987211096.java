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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309982;
     Object term310074;
     Object term311223;
     Object term311224;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309982 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term309982, term309982.getClass(), "type", 111);
        term310074 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term310074, term310074.getClass(), "type", 12);
        term311223 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term311223, term311223.getClass(), "str", null);
        setIntField(term311223, term311223.getClass(), "type", 12);
        setField(term311223, term311223.getClass(), "next", null);
        setField(term311223, term311223.getClass(), "first", null);
        setField(term311223, term311223.getClass(), "last", null);
        setField(term311223, term311223.getClass(), "propListHead", null);
        setIntField(term311223, term311223.getClass(), "sourcePosition", 0);
        setField(term311223, term311223.getClass(), "jsType", null);
        setField(term311223, term311223.getClass(), "parent", null);
        term311224 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term311224, term311224.getClass(), "functionName", null);
        setBooleanField(term311224, term311224.getClass(), "itsNeedsActivation", false);
        setIntField(term311224, term311224.getClass(), "itsFunctionType", 0);
        setBooleanField(term311224, term311224.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term311224, term311224.getClass(), "encodedSourceStart", 0);
        setIntField(term311224, term311224.getClass(), "encodedSourceEnd", 0);
        setField(term311224, term311224.getClass(), "sourceName", null);
        setIntField(term311224, term311224.getClass(), "baseLineno", 0);
        setIntField(term311224, term311224.getClass(), "endLineno", 0);
        setField(term311224, term311224.getClass(), "functions", null);
        setField(term311224, term311224.getClass(), "regexps", null);
        setField(term311224, term311224.getClass(), "itsVariables", null);
        setField(term311224, term311224.getClass(), "itsConst", null);
        setField(term311224, term311224.getClass(), "itsVariableNames", null);
        setIntField(term311224, term311224.getClass(), "varStart", 0);
        setField(term311224, term311224.getClass(), "compilerData", null);
        setIntField(term311224, term311224.getClass(), "type", 111);
        setField(term311224, term311224.getClass(), "next", null);
        setField(term311224, term311224.getClass(), "first", null);
        setField(term311224, term311224.getClass(), "last", null);
        setField(term311224, term311224.getClass(), "propListHead", null);
        setIntField(term311224, term311224.getClass(), "sourcePosition", 0);
        setField(term311224, term311224.getClass(), "jsType", null);
        setField(term311224, term311224.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term309982;
        args[1] = term310074;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term309982, term311223));
        assertTrue(recursiveEquals(term310074, term311224));
        assertTrue(recursiveEquals(retValue, true));
    }

};


