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

public class ReferenceCollectingCallback_isBlockBoundary_684698721870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225389;
     Object term225481;
     Object term225720;
     Object term225721;

    public ReferenceCollectingCallback_isBlockBoundary_684698721870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225389 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term225481 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term225481, term225481.getClass(), "type", 12);
        term225720 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term225720, term225720.getClass(), "str", null);
        setIntField(term225720, term225720.getClass(), "type", 12);
        setField(term225720, term225720.getClass(), "next", null);
        setField(term225720, term225720.getClass(), "first", null);
        setField(term225720, term225720.getClass(), "last", null);
        setField(term225720, term225720.getClass(), "propListHead", null);
        setIntField(term225720, term225720.getClass(), "sourcePosition", 0);
        setField(term225720, term225720.getClass(), "jsType", null);
        setField(term225720, term225720.getClass(), "parent", null);
        term225721 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term225721, term225721.getClass(), "functionName", null);
        setBooleanField(term225721, term225721.getClass(), "itsNeedsActivation", false);
        setIntField(term225721, term225721.getClass(), "itsFunctionType", 0);
        setBooleanField(term225721, term225721.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term225721, term225721.getClass(), "encodedSourceStart", 0);
        setIntField(term225721, term225721.getClass(), "encodedSourceEnd", 0);
        setField(term225721, term225721.getClass(), "sourceName", null);
        setIntField(term225721, term225721.getClass(), "baseLineno", 0);
        setIntField(term225721, term225721.getClass(), "endLineno", 0);
        setField(term225721, term225721.getClass(), "functions", null);
        setField(term225721, term225721.getClass(), "regexps", null);
        setField(term225721, term225721.getClass(), "itsVariables", null);
        setField(term225721, term225721.getClass(), "itsConst", null);
        setField(term225721, term225721.getClass(), "itsVariableNames", null);
        setIntField(term225721, term225721.getClass(), "varStart", 0);
        setField(term225721, term225721.getClass(), "compilerData", null);
        setIntField(term225721, term225721.getClass(), "type", 0);
        setField(term225721, term225721.getClass(), "next", null);
        setField(term225721, term225721.getClass(), "first", null);
        setField(term225721, term225721.getClass(), "last", null);
        setField(term225721, term225721.getClass(), "propListHead", null);
        setIntField(term225721, term225721.getClass(), "sourcePosition", 0);
        setField(term225721, term225721.getClass(), "jsType", null);
        setField(term225721, term225721.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term225389;
        args[1] = term225481;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term225389, term225720));
        assertTrue(recursiveEquals(term225481, term225721));
        assertTrue(recursiveEquals(retValue, false));
    }

};


