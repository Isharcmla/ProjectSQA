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

public class JsDocInfoParser_lookAheadForTypeAnnotation_1870963345168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107302;

    public JsDocInfoParser_lookAheadForTypeAnnotation_1870963345168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107302 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term107302, term107302.getClass(), "stream", null);
        setField(term107302, term107302.getClass(), "jsdocBuilder", null);
        setField(term107302, term107302.getClass(), "sourceName", null);
        setField(term107302, term107302.getClass(), "errorReporter", null);
        setField(term107302, term107302.getClass(), "parser", null);
        setField(term107302, term107302.getClass(), "templateNode", null);
        setField(term107302, term107302.getClass(), "fileOverviewJSDocInfo", null);
        setField(term107302, term107302.getClass(), "state", null);
        setField(term107302, term107302.getClass(), "annotationNames", null);
        setField(term107302, term107302.getClass(), "suppressionNames", null);
        setField(term107302, term107302.getClass(), "fileLevelJsDocBuilder", null);
        setField(term107302, term107302.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "lookAheadForTypeAnnotation", argTypes, term107302, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


