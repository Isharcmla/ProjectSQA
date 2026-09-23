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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JsDocInfoParser_parseParamTypeExpressionAnnotation_433686765133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41081;

    public JsDocInfoParser_parseParamTypeExpressionAnnotation_433686765133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41081 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term41081, term41081.getClass(), "stream", null);
        setField(term41081, term41081.getClass(), "jsdocBuilder", null);
        setField(term41081, term41081.getClass(), "sourceName", null);
        setField(term41081, term41081.getClass(), "errorReporter", null);
        setField(term41081, term41081.getClass(), "parser", null);
        setField(term41081, term41081.getClass(), "templateNode", null);
        setField(term41081, term41081.getClass(), "fileOverviewJSDocInfo", null);
        setField(term41081, term41081.getClass(), "state", null);
        setField(term41081, term41081.getClass(), "annotationNames", null);
        setField(term41081, term41081.getClass(), "suppressionNames", null);
        setField(term41081, term41081.getClass(), "fileLevelJsDocBuilder", null);
        setField(term41081, term41081.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parseParamTypeExpressionAnnotation", argTypes, term41081, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


