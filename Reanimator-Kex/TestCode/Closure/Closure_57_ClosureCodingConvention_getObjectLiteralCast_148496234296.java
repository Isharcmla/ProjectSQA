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

public class ClosureCodingConvention_getObjectLiteralCast_148496234296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123184;
     Object term123276;
     Object term123698;
     Object term123699;

    public ClosureCodingConvention_getObjectLiteralCast_148496234296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123184 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term123276 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term123368 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term123276, term123276.getClass(), "type", 37);
        setField(term123276, term123276.getClass(), "first", term123368);
        term123698 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term123698, term123698.getClass(), "propertyTestFunctions", null);
        term123699 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term123700 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term123699, term123699.getClass(), "str", null);
        setIntField(term123699, term123699.getClass(), "type", 37);
        setField(term123699, term123699.getClass(), "next", null);
        setField(term123700, term123700.getClass(), "str", null);
        setIntField(term123700, term123700.getClass(), "type", 0);
        setField(term123700, term123700.getClass(), "next", null);
        setField(term123700, term123700.getClass(), "first", null);
        setField(term123700, term123700.getClass(), "last", null);
        setField(term123700, term123700.getClass(), "propListHead", null);
        setIntField(term123700, term123700.getClass(), "sourcePosition", 0);
        setField(term123700, term123700.getClass(), "jsType", null);
        setField(term123700, term123700.getClass(), "parent", null);
        setField(term123699, term123699.getClass(), "first", term123700);
        setField(term123699, term123699.getClass(), "last", null);
        setField(term123699, term123699.getClass(), "propListHead", null);
        setIntField(term123699, term123699.getClass(), "sourcePosition", 0);
        setField(term123699, term123699.getClass(), "jsType", null);
        setField(term123699, term123699.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term123276;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term123184, args);
        assertTrue(recursiveEquals(term123184, term123698));
        assertTrue(recursiveEquals(term123276, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


