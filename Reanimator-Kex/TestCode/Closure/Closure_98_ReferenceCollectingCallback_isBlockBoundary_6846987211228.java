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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369434;
     Object term369520;
     Object term370183;
     Object term370184;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369434 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term369434, term369434.getClass(), "type", 111);
        term369520 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term369520, term369520.getClass(), "type", 12);
        term370183 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term370183, term370183.getClass(), "functionName", null);
        setBooleanField(term370183, term370183.getClass(), "itsNeedsActivation", false);
        setIntField(term370183, term370183.getClass(), "itsFunctionType", 0);
        setBooleanField(term370183, term370183.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term370183, term370183.getClass(), "encodedSourceStart", 0);
        setIntField(term370183, term370183.getClass(), "encodedSourceEnd", 0);
        setField(term370183, term370183.getClass(), "sourceName", null);
        setIntField(term370183, term370183.getClass(), "baseLineno", 0);
        setIntField(term370183, term370183.getClass(), "endLineno", 0);
        setField(term370183, term370183.getClass(), "functions", null);
        setField(term370183, term370183.getClass(), "regexps", null);
        setField(term370183, term370183.getClass(), "itsVariables", null);
        setField(term370183, term370183.getClass(), "itsConst", null);
        setField(term370183, term370183.getClass(), "itsVariableNames", null);
        setIntField(term370183, term370183.getClass(), "varStart", 0);
        setField(term370183, term370183.getClass(), "compilerData", null);
        setIntField(term370183, term370183.getClass(), "type", 12);
        setField(term370183, term370183.getClass(), "next", null);
        setField(term370183, term370183.getClass(), "first", null);
        setField(term370183, term370183.getClass(), "last", null);
        setField(term370183, term370183.getClass(), "propListHead", null);
        setIntField(term370183, term370183.getClass(), "sourcePosition", 0);
        setField(term370183, term370183.getClass(), "jsType", null);
        setField(term370183, term370183.getClass(), "parent", null);
        term370184 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term370184, term370184.getClass(), "number", 0.0);
        setIntField(term370184, term370184.getClass(), "type", 111);
        setField(term370184, term370184.getClass(), "next", null);
        setField(term370184, term370184.getClass(), "first", null);
        setField(term370184, term370184.getClass(), "last", null);
        setField(term370184, term370184.getClass(), "propListHead", null);
        setIntField(term370184, term370184.getClass(), "sourcePosition", 0);
        setField(term370184, term370184.getClass(), "jsType", null);
        setField(term370184, term370184.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term369434;
        args[1] = term369520;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term369434, term370183));
        assertTrue(recursiveEquals(term369520, term370184));
        assertTrue(recursiveEquals(retValue, true));
    }

};


