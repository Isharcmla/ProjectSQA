package com.google.javascript.jscomp.parsing;

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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.parsing.EqualityUtils.*;
import java.lang.Object;

public class IRFactory_setFileOverviewJsDoc_193090289599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22626;
     Object term22862;
     Object term22892;
     Object term22895;

    public IRFactory_setFileOverviewJsDoc_193090289599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22626 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term22696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22792 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term22792, term22792.getClass(), "type", -30);
        setField(term22792, term22792.getClass(), "next", null);
        setField(term22696, term22696.getClass(), "propListHead", term22792);
        setField(term22626, term22626.getClass(), "rootNodeJsDocHolder", term22696);
        term22862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term22862, term22862.getClass(), "propListHead", null);
        term22892 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term22893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22894 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term22892, term22892.getClass(), "sourceString", null);
        setField(term22892, term22892.getClass(), "sourceName", null);
        setField(term22892, term22892.getClass(), "config", null);
        setField(term22892, term22892.getClass(), "errorReporter", null);
        setField(term22892, term22892.getClass(), "transformDispatcher", null);
        setField(term22892, term22892.getClass(), "ALLOWED_DIRECTIVES", null);
        setIntField(term22893, term22893.getClass(), "type", 0);
        setField(term22893, term22893.getClass(), "next", null);
        setField(term22893, term22893.getClass(), "first", null);
        setField(term22893, term22893.getClass(), "last", null);
        setField(term22894, term22894.getClass(), "next", null);
        setIntField(term22894, term22894.getClass(), "type", -30);
        setIntField(term22894, term22894.getClass(), "intValue", 0);
        setField(term22894, term22894.getClass(), "objectValue", null);
        setField(term22893, term22893.getClass(), "propListHead", term22894);
        setIntField(term22893, term22893.getClass(), "sourcePosition", 0);
        setField(term22893, term22893.getClass(), "jsType", null);
        setField(term22893, term22893.getClass(), "parent", null);
        setField(term22892, term22892.getClass(), "rootNodeJsDocHolder", term22893);
        setField(term22892, term22892.getClass(), "fileLevelJsDocBuilder", null);
        setField(term22892, term22892.getClass(), "fileOverviewInfo", null);
        setField(term22892, term22892.getClass(), "templateNode", null);
        term22895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22895, term22895.getClass(), "type", 0);
        setField(term22895, term22895.getClass(), "next", null);
        setField(term22895, term22895.getClass(), "first", null);
        setField(term22895, term22895.getClass(), "last", null);
        setField(term22895, term22895.getClass(), "propListHead", null);
        setIntField(term22895, term22895.getClass(), "sourcePosition", 0);
        setField(term22895, term22895.getClass(), "jsType", null);
        setField(term22895, term22895.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22862;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term22626, args);
        assertTrue(recursiveEquals(term22626, term22892));
        assertTrue(recursiveEquals(term22862, term22895));
    }

};


