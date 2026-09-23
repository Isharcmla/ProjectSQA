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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsDocInfoParser_extractSingleLineBlock_1460006360127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30605;

    public JsDocInfoParser_extractSingleLineBlock_1460006360127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30605 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term30605, term30605.getClass(), "stream", null);
        setField(term30605, term30605.getClass(), "jsdocBuilder", null);
        setField(term30605, term30605.getClass(), "sourceName", null);
        setField(term30605, term30605.getClass(), "errorReporter", null);
        setField(term30605, term30605.getClass(), "parser", null);
        setField(term30605, term30605.getClass(), "templateNode", null);
        setField(term30605, term30605.getClass(), "fileOverviewJSDocInfo", null);
        setField(term30605, term30605.getClass(), "state", null);
        setField(term30605, term30605.getClass(), "annotationNames", null);
        setField(term30605, term30605.getClass(), "suppressionNames", null);
        setField(term30605, term30605.getClass(), "fileLevelJsDocBuilder", null);
        setField(term30605, term30605.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "extractSingleLineBlock", argTypes, term30605, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


