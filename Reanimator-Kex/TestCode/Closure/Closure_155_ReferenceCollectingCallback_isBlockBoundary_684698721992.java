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

public class ReferenceCollectingCallback_isBlockBoundary_684698721992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253061;
     Object term253153;
     Object term253174;
     Object term253175;

    public ReferenceCollectingCallback_isBlockBoundary_684698721992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253061 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term253061, term253061.getClass(), "type", 111);
        term253153 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term253153, term253153.getClass(), "type", 12);
        term253174 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term253174, term253174.getClass(), "number", 0.0);
        setIntField(term253174, term253174.getClass(), "type", 12);
        setField(term253174, term253174.getClass(), "next", null);
        setField(term253174, term253174.getClass(), "first", null);
        setField(term253174, term253174.getClass(), "last", null);
        setField(term253174, term253174.getClass(), "propListHead", null);
        setIntField(term253174, term253174.getClass(), "sourcePosition", 0);
        setField(term253174, term253174.getClass(), "jsType", null);
        setField(term253174, term253174.getClass(), "parent", null);
        term253175 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term253175, term253175.getClass(), "functionName", null);
        setBooleanField(term253175, term253175.getClass(), "itsNeedsActivation", false);
        setIntField(term253175, term253175.getClass(), "itsFunctionType", 0);
        setBooleanField(term253175, term253175.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term253175, term253175.getClass(), "encodedSourceStart", 0);
        setIntField(term253175, term253175.getClass(), "encodedSourceEnd", 0);
        setField(term253175, term253175.getClass(), "sourceName", null);
        setIntField(term253175, term253175.getClass(), "baseLineno", 0);
        setIntField(term253175, term253175.getClass(), "endLineno", 0);
        setField(term253175, term253175.getClass(), "functions", null);
        setField(term253175, term253175.getClass(), "regexps", null);
        setField(term253175, term253175.getClass(), "itsVariables", null);
        setField(term253175, term253175.getClass(), "itsConst", null);
        setField(term253175, term253175.getClass(), "itsVariableNames", null);
        setIntField(term253175, term253175.getClass(), "varStart", 0);
        setField(term253175, term253175.getClass(), "compilerData", null);
        setIntField(term253175, term253175.getClass(), "type", 111);
        setField(term253175, term253175.getClass(), "next", null);
        setField(term253175, term253175.getClass(), "first", null);
        setField(term253175, term253175.getClass(), "last", null);
        setField(term253175, term253175.getClass(), "propListHead", null);
        setIntField(term253175, term253175.getClass(), "sourcePosition", 0);
        setField(term253175, term253175.getClass(), "jsType", null);
        setField(term253175, term253175.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term253061;
        args[1] = term253153;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term253061, term253174));
        assertTrue(recursiveEquals(term253153, term253175));
        assertTrue(recursiveEquals(retValue, true));
    }

};


