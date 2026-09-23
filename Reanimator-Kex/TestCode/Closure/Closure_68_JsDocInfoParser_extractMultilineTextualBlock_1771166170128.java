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

public class JsDocInfoParser_extractMultilineTextualBlock_1771166170128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32665;

    public JsDocInfoParser_extractMultilineTextualBlock_1771166170128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32665 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term32665, term32665.getClass(), "stream", null);
        setField(term32665, term32665.getClass(), "jsdocBuilder", null);
        setField(term32665, term32665.getClass(), "sourceName", null);
        setField(term32665, term32665.getClass(), "errorReporter", null);
        setField(term32665, term32665.getClass(), "parser", null);
        setField(term32665, term32665.getClass(), "templateNode", null);
        setField(term32665, term32665.getClass(), "fileOverviewJSDocInfo", null);
        setField(term32665, term32665.getClass(), "state", null);
        setField(term32665, term32665.getClass(), "annotationNames", null);
        setField(term32665, term32665.getClass(), "suppressionNames", null);
        setField(term32665, term32665.getClass(), "fileLevelJsDocBuilder", null);
        setField(term32665, term32665.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "extractMultilineTextualBlock", argTypes, term32665, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


