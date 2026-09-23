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

public class JsDocInfoParser_reportGenericTypeSyntaxWarning_1226954606155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83038;

    public JsDocInfoParser_reportGenericTypeSyntaxWarning_1226954606155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83038 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term83038, term83038.getClass(), "stream", null);
        setField(term83038, term83038.getClass(), "jsdocBuilder", null);
        setField(term83038, term83038.getClass(), "sourceName", null);
        setField(term83038, term83038.getClass(), "errorReporter", null);
        setField(term83038, term83038.getClass(), "parser", null);
        setField(term83038, term83038.getClass(), "templateNode", null);
        setField(term83038, term83038.getClass(), "fileOverviewJSDocInfo", null);
        setField(term83038, term83038.getClass(), "state", null);
        setField(term83038, term83038.getClass(), "annotationNames", null);
        setField(term83038, term83038.getClass(), "suppressionNames", null);
        setField(term83038, term83038.getClass(), "fileLevelJsDocBuilder", null);
        setField(term83038, term83038.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "reportGenericTypeSyntaxWarning", argTypes, term83038, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


