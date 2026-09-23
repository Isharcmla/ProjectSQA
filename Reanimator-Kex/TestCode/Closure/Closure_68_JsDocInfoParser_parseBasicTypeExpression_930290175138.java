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

public class JsDocInfoParser_parseBasicTypeExpression_930290175138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51136;

    public JsDocInfoParser_parseBasicTypeExpression_930290175138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51136 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term51136, term51136.getClass(), "stream", null);
        setField(term51136, term51136.getClass(), "jsdocBuilder", null);
        setField(term51136, term51136.getClass(), "sourceName", null);
        setField(term51136, term51136.getClass(), "errorReporter", null);
        setField(term51136, term51136.getClass(), "parser", null);
        setField(term51136, term51136.getClass(), "templateNode", null);
        setField(term51136, term51136.getClass(), "fileOverviewJSDocInfo", null);
        setField(term51136, term51136.getClass(), "state", null);
        setField(term51136, term51136.getClass(), "annotationNames", null);
        setField(term51136, term51136.getClass(), "suppressionNames", null);
        setField(term51136, term51136.getClass(), "fileLevelJsDocBuilder", null);
        setField(term51136, term51136.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parseBasicTypeExpression", argTypes, term51136, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


