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

public class IRFactory_handlePossibleFileOverviewJsDoc_2034771075285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26877;
     Object term26987;
     Object term26994;
     Object term26995;

    public IRFactory_handlePossibleFileOverviewJsDoc_2034771075285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26877 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term26877, term26877.getClass(), "fileOverviewInfo", null);
        term26987 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        term26994 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term26994, term26994.getClass(), "sourceString", null);
        setField(term26994, term26994.getClass(), "sourceName", null);
        setField(term26994, term26994.getClass(), "config", null);
        setField(term26994, term26994.getClass(), "errorReporter", null);
        setField(term26994, term26994.getClass(), "transformDispatcher", null);
        setField(term26994, term26994.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term26994, term26994.getClass(), "rootNodeJsDocHolder", null);
        setField(term26994, term26994.getClass(), "fileLevelJsDocBuilder", null);
        setField(term26994, term26994.getClass(), "fileOverviewInfo", null);
        setField(term26994, term26994.getClass(), "templateNode", null);
        term26995 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term26995, term26995.getClass(), "stream", null);
        setField(term26995, term26995.getClass(), "jsdocBuilder", null);
        setField(term26995, term26995.getClass(), "sourceName", null);
        setField(term26995, term26995.getClass(), "errorReporter", null);
        setField(term26995, term26995.getClass(), "parser", null);
        setField(term26995, term26995.getClass(), "templateNode", null);
        setField(term26995, term26995.getClass(), "fileOverviewJSDocInfo", null);
        setField(term26995, term26995.getClass(), "state", null);
        setField(term26995, term26995.getClass(), "annotationNames", null);
        setField(term26995, term26995.getClass(), "suppressionNames", null);
        setField(term26995, term26995.getClass(), "fileLevelJsDocBuilder", null);
        setField(term26995, term26995.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Object[] args = new Object[1];
        args[0] = term26987;
        Object retValue = callMethod(klass, "handlePossibleFileOverviewJsDoc", argTypes, term26877, args);
        assertTrue(recursiveEquals(term26877, term26994));
        assertTrue(recursiveEquals(term26987, term26995));
        assertTrue(recursiveEquals(retValue, false));
    }

};


