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

public class JsDocInfoParser_eatTokensUntilEOL_1886658085156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84825;

    public JsDocInfoParser_eatTokensUntilEOL_1886658085156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84825 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term84825, term84825.getClass(), "stream", null);
        setField(term84825, term84825.getClass(), "jsdocBuilder", null);
        setField(term84825, term84825.getClass(), "sourceName", null);
        setField(term84825, term84825.getClass(), "errorReporter", null);
        setField(term84825, term84825.getClass(), "parser", null);
        setField(term84825, term84825.getClass(), "templateNode", null);
        setField(term84825, term84825.getClass(), "fileOverviewJSDocInfo", null);
        setField(term84825, term84825.getClass(), "state", null);
        setField(term84825, term84825.getClass(), "annotationNames", null);
        setField(term84825, term84825.getClass(), "suppressionNames", null);
        setField(term84825, term84825.getClass(), "fileLevelJsDocBuilder", null);
        setField(term84825, term84825.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "eatTokensUntilEOL", argTypes, term84825, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


