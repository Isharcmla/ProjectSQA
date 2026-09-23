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

public class ClosureCodingConvention_endsWithPrototype_1576622357255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112757;
     Object term112849;
     Object term113050;
     Object term113051;

    public ClosureCodingConvention_endsWithPrototype_1576622357255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112757 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term112849 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term112941 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term112849, term112849.getClass(), "type", 33);
        setField(term112941, term112941.getClass(), "str", "prototype");
        setField(term112849, term112849.getClass(), "last", term112941);
        term113050 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(term113050, term113050.getClass(), "propertyTestFunctions", null);
        term113051 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term113052 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term113051, term113051.getClass(), "str", null);
        setIntField(term113051, term113051.getClass(), "type", 33);
        setField(term113051, term113051.getClass(), "next", null);
        setField(term113051, term113051.getClass(), "first", null);
        setField(term113052, term113052.getClass(), "str", "prototype");
        setIntField(term113052, term113052.getClass(), "type", 0);
        setField(term113052, term113052.getClass(), "next", null);
        setField(term113052, term113052.getClass(), "first", null);
        setField(term113052, term113052.getClass(), "last", null);
        setField(term113052, term113052.getClass(), "propListHead", null);
        setIntField(term113052, term113052.getClass(), "sourcePosition", 0);
        setField(term113052, term113052.getClass(), "jsType", null);
        setField(term113052, term113052.getClass(), "parent", null);
        setField(term113051, term113051.getClass(), "last", term113052);
        setField(term113051, term113051.getClass(), "propListHead", null);
        setIntField(term113051, term113051.getClass(), "sourcePosition", 0);
        setField(term113051, term113051.getClass(), "jsType", null);
        setField(term113051, term113051.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term112849;
        Object retValue = callMethod(klass, "endsWithPrototype", argTypes, term112757, args);
        assertTrue(recursiveEquals(term112757, term113050));
        assertTrue(recursiveEquals(term112849, term113051));
        assertTrue(recursiveEquals(retValue, true));
    }

};


