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

public class IRFactory_setFileOverviewJsDoc_1930902895425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73847;
     Object term74048;
     Object term74122;
     Object term74124;

    public IRFactory_setFileOverviewJsDoc_1930902895425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73847 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term74048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74096 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term74096, term74096.getClass(), "type", 29);
        setField(term74096, term74096.getClass(), "objectValue", null);
        setField(term74048, term74048.getClass(), "propListHead", term74096);
        setField(term73847, term73847.getClass(), "rootNodeJsDocHolder", term74048);
        term74122 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term74123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term74122, term74122.getClass(), "sourceString", null);
        setField(term74122, term74122.getClass(), "sourceName", null);
        setField(term74122, term74122.getClass(), "config", null);
        setField(term74122, term74122.getClass(), "errorReporter", null);
        setField(term74122, term74122.getClass(), "transformDispatcher", null);
        setField(term74122, term74122.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term74122, term74122.getClass(), "reservedKeywords", null);
        setIntField(term74123, term74123.getClass(), "type", 0);
        setField(term74123, term74123.getClass(), "next", null);
        setField(term74123, term74123.getClass(), "first", null);
        setField(term74123, term74123.getClass(), "last", null);
        setField(term74123, term74123.getClass(), "propListHead", null);
        setIntField(term74123, term74123.getClass(), "sourcePosition", 0);
        setField(term74123, term74123.getClass(), "jsType", null);
        setField(term74123, term74123.getClass(), "parent", null);
        setField(term74122, term74122.getClass(), "rootNodeJsDocHolder", term74123);
        setField(term74122, term74122.getClass(), "fileLevelJsDocBuilder", null);
        setField(term74122, term74122.getClass(), "fileOverviewInfo", null);
        setField(term74122, term74122.getClass(), "templateNode", null);
        term74124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74124, term74124.getClass(), "type", 0);
        setField(term74124, term74124.getClass(), "next", null);
        setField(term74124, term74124.getClass(), "first", null);
        setField(term74124, term74124.getClass(), "last", null);
        setField(term74124, term74124.getClass(), "propListHead", null);
        setIntField(term74124, term74124.getClass(), "sourcePosition", 0);
        setField(term74124, term74124.getClass(), "jsType", null);
        setField(term74124, term74124.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term74048;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term73847, args);
        assertTrue(recursiveEquals(term73847, term74122));
        assertTrue(recursiveEquals(term74048, term74124));
    }

};


