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

public class JsDocInfoParser_parseTypeExpression_1999487863137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49041;

    public JsDocInfoParser_parseTypeExpression_1999487863137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49041 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term49041, term49041.getClass(), "stream", null);
        setField(term49041, term49041.getClass(), "jsdocBuilder", null);
        setField(term49041, term49041.getClass(), "sourceName", null);
        setField(term49041, term49041.getClass(), "errorReporter", null);
        setField(term49041, term49041.getClass(), "parser", null);
        setField(term49041, term49041.getClass(), "templateNode", null);
        setField(term49041, term49041.getClass(), "fileOverviewJSDocInfo", null);
        setField(term49041, term49041.getClass(), "state", null);
        setField(term49041, term49041.getClass(), "annotationNames", null);
        setField(term49041, term49041.getClass(), "suppressionNames", null);
        setField(term49041, term49041.getClass(), "fileLevelJsDocBuilder", null);
        setField(term49041, term49041.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parseTypeExpression", argTypes, term49041, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


