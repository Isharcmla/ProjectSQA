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

public class ClosureCodingConvention_getObjectLiteralCast_148496234401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143624;
     Object term143716;
     Object term143834;
     Object term143835;

    public ClosureCodingConvention_getObjectLiteralCast_148496234401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143624 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term143716 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143808 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term143716, term143716.getClass(), "type", 37);
        setField(term143716, term143716.getClass(), "first", term143808);
        term143834 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term143834, term143834.getClass(), "propertyTestFunctions", null);
        term143835 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143836 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term143835, term143835.getClass(), "number", 0.0);
        setIntField(term143835, term143835.getClass(), "type", 37);
        setField(term143835, term143835.getClass(), "next", null);
        setDoubleField(term143836, term143836.getClass(), "number", 0.0);
        setIntField(term143836, term143836.getClass(), "type", 0);
        setField(term143836, term143836.getClass(), "next", null);
        setField(term143836, term143836.getClass(), "first", null);
        setField(term143836, term143836.getClass(), "last", null);
        setField(term143836, term143836.getClass(), "propListHead", null);
        setIntField(term143836, term143836.getClass(), "sourcePosition", 0);
        setField(term143836, term143836.getClass(), "jsType", null);
        setField(term143836, term143836.getClass(), "parent", null);
        setField(term143835, term143835.getClass(), "first", term143836);
        setField(term143835, term143835.getClass(), "last", null);
        setField(term143835, term143835.getClass(), "propListHead", null);
        setIntField(term143835, term143835.getClass(), "sourcePosition", 0);
        setField(term143835, term143835.getClass(), "jsType", null);
        setField(term143835, term143835.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term143716;
        Object retValue = callMethod(klass, "getObjectLiteralCast", argTypes, term143624, args);
        assertTrue(recursiveEquals(term143624, term143834));
        assertTrue(recursiveEquals(term143716, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


