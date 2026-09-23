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

public class JsDocInfoParser_extractMultilineTextualBlock_271264050129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35177;

    public JsDocInfoParser_extractMultilineTextualBlock_271264050129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35177 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term35177, term35177.getClass(), "stream", null);
        setField(term35177, term35177.getClass(), "jsdocBuilder", null);
        setField(term35177, term35177.getClass(), "sourceName", null);
        setField(term35177, term35177.getClass(), "errorReporter", null);
        setField(term35177, term35177.getClass(), "parser", null);
        setField(term35177, term35177.getClass(), "templateNode", null);
        setField(term35177, term35177.getClass(), "fileOverviewJSDocInfo", null);
        setField(term35177, term35177.getClass(), "state", null);
        setField(term35177, term35177.getClass(), "annotationNames", null);
        setField(term35177, term35177.getClass(), "suppressionNames", null);
        setField(term35177, term35177.getClass(), "fileLevelJsDocBuilder", null);
        setField(term35177, term35177.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$WhitespaceOption");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "extractMultilineTextualBlock", argTypes, term35177, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


