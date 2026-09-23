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

public class JsDocInfoParser_parseParametersType_283335113141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56805;

    public JsDocInfoParser_parseParametersType_283335113141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56805 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term56805, term56805.getClass(), "stream", null);
        setField(term56805, term56805.getClass(), "jsdocBuilder", null);
        setField(term56805, term56805.getClass(), "sourceName", null);
        setField(term56805, term56805.getClass(), "errorReporter", null);
        setField(term56805, term56805.getClass(), "parser", null);
        setField(term56805, term56805.getClass(), "templateNode", null);
        setField(term56805, term56805.getClass(), "fileOverviewJSDocInfo", null);
        setField(term56805, term56805.getClass(), "state", null);
        setField(term56805, term56805.getClass(), "annotationNames", null);
        setField(term56805, term56805.getClass(), "suppressionNames", null);
        setField(term56805, term56805.getClass(), "fileLevelJsDocBuilder", null);
        setField(term56805, term56805.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parseParametersType", argTypes, term56805, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


