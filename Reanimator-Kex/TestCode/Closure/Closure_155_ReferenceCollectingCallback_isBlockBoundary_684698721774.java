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

public class ReferenceCollectingCallback_isBlockBoundary_684698721774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201366;
     Object term201452;
     Object term201698;
     Object term201699;

    public ReferenceCollectingCallback_isBlockBoundary_684698721774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201366 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term201452 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term201452, term201452.getClass(), "type", 12);
        term201698 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term201698, term201698.getClass(), "functionName", null);
        setBooleanField(term201698, term201698.getClass(), "itsNeedsActivation", false);
        setIntField(term201698, term201698.getClass(), "itsFunctionType", 0);
        setBooleanField(term201698, term201698.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term201698, term201698.getClass(), "encodedSourceStart", 0);
        setIntField(term201698, term201698.getClass(), "encodedSourceEnd", 0);
        setField(term201698, term201698.getClass(), "sourceName", null);
        setIntField(term201698, term201698.getClass(), "baseLineno", 0);
        setIntField(term201698, term201698.getClass(), "endLineno", 0);
        setField(term201698, term201698.getClass(), "functions", null);
        setField(term201698, term201698.getClass(), "regexps", null);
        setField(term201698, term201698.getClass(), "itsVariables", null);
        setField(term201698, term201698.getClass(), "itsConst", null);
        setField(term201698, term201698.getClass(), "itsVariableNames", null);
        setIntField(term201698, term201698.getClass(), "varStart", 0);
        setField(term201698, term201698.getClass(), "compilerData", null);
        setIntField(term201698, term201698.getClass(), "type", 12);
        setField(term201698, term201698.getClass(), "next", null);
        setField(term201698, term201698.getClass(), "first", null);
        setField(term201698, term201698.getClass(), "last", null);
        setField(term201698, term201698.getClass(), "propListHead", null);
        setIntField(term201698, term201698.getClass(), "sourcePosition", 0);
        setField(term201698, term201698.getClass(), "jsType", null);
        setField(term201698, term201698.getClass(), "parent", null);
        term201699 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term201699, term201699.getClass(), "number", 0.0);
        setIntField(term201699, term201699.getClass(), "type", 0);
        setField(term201699, term201699.getClass(), "next", null);
        setField(term201699, term201699.getClass(), "first", null);
        setField(term201699, term201699.getClass(), "last", null);
        setField(term201699, term201699.getClass(), "propListHead", null);
        setIntField(term201699, term201699.getClass(), "sourcePosition", 0);
        setField(term201699, term201699.getClass(), "jsType", null);
        setField(term201699, term201699.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term201366;
        args[1] = term201452;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term201366, term201698));
        assertTrue(recursiveEquals(term201452, term201699));
        assertTrue(recursiveEquals(retValue, false));
    }

};


