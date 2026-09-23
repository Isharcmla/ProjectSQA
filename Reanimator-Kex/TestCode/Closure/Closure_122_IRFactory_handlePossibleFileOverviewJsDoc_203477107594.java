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

public class IRFactory_handlePossibleFileOverviewJsDoc_203477107594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60246;
     Object term60356;
     Object term60383;
     Object term60384;

    public IRFactory_handlePossibleFileOverviewJsDoc_203477107594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60246 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term60246, term60246.getClass(), "fileOverviewInfo", null);
        term60356 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        term60383 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term60383, term60383.getClass(), "sourceString", null);
        setField(term60383, term60383.getClass(), "sourceFile", null);
        setField(term60383, term60383.getClass(), "sourceName", null);
        setField(term60383, term60383.getClass(), "config", null);
        setField(term60383, term60383.getClass(), "errorReporter", null);
        setField(term60383, term60383.getClass(), "transformDispatcher", null);
        setField(term60383, term60383.getClass(), "reservedKeywords", null);
        setField(term60383, term60383.getClass(), "parsedComments", null);
        setField(term60383, term60383.getClass(), "rootNodeJsDocHolder", null);
        setField(term60383, term60383.getClass(), "fileLevelJsDocBuilder", null);
        setField(term60383, term60383.getClass(), "fileOverviewInfo", null);
        setField(term60383, term60383.getClass(), "templateNode", null);
        term60384 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term60384, term60384.getClass(), "stream", null);
        setField(term60384, term60384.getClass(), "jsdocBuilder", null);
        setField(term60384, term60384.getClass(), "sourceFile", null);
        setField(term60384, term60384.getClass(), "associatedNode", null);
        setField(term60384, term60384.getClass(), "errorReporter", null);
        setField(term60384, term60384.getClass(), "parser", null);
        setField(term60384, term60384.getClass(), "templateNode", null);
        setField(term60384, term60384.getClass(), "fileOverviewJSDocInfo", null);
        setField(term60384, term60384.getClass(), "state", null);
        setField(term60384, term60384.getClass(), "annotationNames", null);
        setField(term60384, term60384.getClass(), "suppressionNames", null);
        setField(term60384, term60384.getClass(), "fileLevelJsDocBuilder", null);
        setField(term60384, term60384.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Object[] args = new Object[1];
        args[0] = term60356;
        Object retValue = callMethod(klass, "handlePossibleFileOverviewJsDoc", argTypes, term60246, args);
        assertTrue(recursiveEquals(term60246, term60383));
        assertTrue(recursiveEquals(term60356, term60384));
        assertTrue(recursiveEquals(retValue, false));
    }

};


