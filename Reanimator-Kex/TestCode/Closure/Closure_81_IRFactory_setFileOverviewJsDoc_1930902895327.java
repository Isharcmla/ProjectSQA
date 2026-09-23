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

public class IRFactory_setFileOverviewJsDoc_1930902895327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37013;
     Object term37118;
     Object term37133;
     Object term37135;

    public IRFactory_setFileOverviewJsDoc_1930902895327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37013 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term37118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37118, term37118.getClass(), "propListHead", null);
        setField(term37013, term37013.getClass(), "rootNodeJsDocHolder", term37118);
        term37133 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term37134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37133, term37133.getClass(), "sourceString", null);
        setField(term37133, term37133.getClass(), "sourceName", null);
        setField(term37133, term37133.getClass(), "config", null);
        setField(term37133, term37133.getClass(), "errorReporter", null);
        setField(term37133, term37133.getClass(), "transformDispatcher", null);
        setField(term37133, term37133.getClass(), "ALLOWED_DIRECTIVES", null);
        setIntField(term37134, term37134.getClass(), "type", 0);
        setField(term37134, term37134.getClass(), "next", null);
        setField(term37134, term37134.getClass(), "first", null);
        setField(term37134, term37134.getClass(), "last", null);
        setField(term37134, term37134.getClass(), "propListHead", null);
        setIntField(term37134, term37134.getClass(), "sourcePosition", 0);
        setField(term37134, term37134.getClass(), "jsType", null);
        setField(term37134, term37134.getClass(), "parent", null);
        setField(term37133, term37133.getClass(), "rootNodeJsDocHolder", term37134);
        setField(term37133, term37133.getClass(), "fileLevelJsDocBuilder", null);
        setField(term37133, term37133.getClass(), "fileOverviewInfo", null);
        setField(term37133, term37133.getClass(), "templateNode", null);
        term37135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37135, term37135.getClass(), "type", 0);
        setField(term37135, term37135.getClass(), "next", null);
        setField(term37135, term37135.getClass(), "first", null);
        setField(term37135, term37135.getClass(), "last", null);
        setField(term37135, term37135.getClass(), "propListHead", null);
        setIntField(term37135, term37135.getClass(), "sourcePosition", 0);
        setField(term37135, term37135.getClass(), "jsType", null);
        setField(term37135, term37135.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term37118;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term37013, args);
        assertTrue(recursiveEquals(term37013, term37133));
        assertTrue(recursiveEquals(term37118, term37135));
    }

};


