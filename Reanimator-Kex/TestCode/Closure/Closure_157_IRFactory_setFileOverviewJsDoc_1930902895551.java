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

public class IRFactory_setFileOverviewJsDoc_1930902895551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110349;
     Object term110454;
     Object term111255;
     Object term111257;

    public IRFactory_setFileOverviewJsDoc_1930902895551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110349 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term110454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term110454, term110454.getClass(), "propListHead", null);
        setField(term110349, term110349.getClass(), "rootNodeJsDocHolder", term110454);
        term111255 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term111256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term111255, term111255.getClass(), "sourceString", null);
        setField(term111255, term111255.getClass(), "sourceName", null);
        setField(term111255, term111255.getClass(), "config", null);
        setField(term111255, term111255.getClass(), "errorReporter", null);
        setField(term111255, term111255.getClass(), "transformDispatcher", null);
        setField(term111255, term111255.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term111255, term111255.getClass(), "reservedKeywords", null);
        setIntField(term111256, term111256.getClass(), "type", 0);
        setField(term111256, term111256.getClass(), "next", null);
        setField(term111256, term111256.getClass(), "first", null);
        setField(term111256, term111256.getClass(), "last", null);
        setField(term111256, term111256.getClass(), "propListHead", null);
        setIntField(term111256, term111256.getClass(), "sourcePosition", 0);
        setField(term111256, term111256.getClass(), "jsType", null);
        setField(term111256, term111256.getClass(), "parent", null);
        setField(term111255, term111255.getClass(), "rootNodeJsDocHolder", term111256);
        setField(term111255, term111255.getClass(), "fileLevelJsDocBuilder", null);
        setField(term111255, term111255.getClass(), "fileOverviewInfo", null);
        setField(term111255, term111255.getClass(), "templateNode", null);
        term111257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term111257, term111257.getClass(), "type", 0);
        setField(term111257, term111257.getClass(), "next", null);
        setField(term111257, term111257.getClass(), "first", null);
        setField(term111257, term111257.getClass(), "last", null);
        setField(term111257, term111257.getClass(), "propListHead", null);
        setIntField(term111257, term111257.getClass(), "sourcePosition", 0);
        setField(term111257, term111257.getClass(), "jsType", null);
        setField(term111257, term111257.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term110454;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term110349, args);
        assertTrue(recursiveEquals(term110349, term111255));
        assertTrue(recursiveEquals(term110454, term111257));
    }

};


