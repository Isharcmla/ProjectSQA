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

public class JsDocInfoParser_reportTypeSyntaxWarning_608670462154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81252;

    public JsDocInfoParser_reportTypeSyntaxWarning_608670462154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81252 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term81252, term81252.getClass(), "stream", null);
        setField(term81252, term81252.getClass(), "jsdocBuilder", null);
        setField(term81252, term81252.getClass(), "sourceName", null);
        setField(term81252, term81252.getClass(), "errorReporter", null);
        setField(term81252, term81252.getClass(), "parser", null);
        setField(term81252, term81252.getClass(), "templateNode", null);
        setField(term81252, term81252.getClass(), "fileOverviewJSDocInfo", null);
        setField(term81252, term81252.getClass(), "state", null);
        setField(term81252, term81252.getClass(), "annotationNames", null);
        setField(term81252, term81252.getClass(), "suppressionNames", null);
        setField(term81252, term81252.getClass(), "fileLevelJsDocBuilder", null);
        setField(term81252, term81252.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "reportTypeSyntaxWarning", argTypes, term81252, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


