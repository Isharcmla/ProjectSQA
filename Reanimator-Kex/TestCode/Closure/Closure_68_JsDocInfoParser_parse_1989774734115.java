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

public class JsDocInfoParser_parse_1989774734115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7257;

    public JsDocInfoParser_parse_1989774734115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7257 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term7257, term7257.getClass(), "stream", null);
        setField(term7257, term7257.getClass(), "jsdocBuilder", null);
        setField(term7257, term7257.getClass(), "sourceName", null);
        setField(term7257, term7257.getClass(), "errorReporter", null);
        setField(term7257, term7257.getClass(), "parser", null);
        setField(term7257, term7257.getClass(), "templateNode", null);
        setField(term7257, term7257.getClass(), "fileOverviewJSDocInfo", null);
        setField(term7257, term7257.getClass(), "state", null);
        setField(term7257, term7257.getClass(), "annotationNames", null);
        setField(term7257, term7257.getClass(), "suppressionNames", null);
        setField(term7257, term7257.getClass(), "fileLevelJsDocBuilder", null);
        setField(term7257, term7257.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parse", argTypes, term7257, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


