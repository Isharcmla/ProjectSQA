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

public class JsDocInfoParser_parseUnionTypeWithAlternate_1416328259144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62669;

    public JsDocInfoParser_parseUnionTypeWithAlternate_1416328259144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62669 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term62669, term62669.getClass(), "stream", null);
        setField(term62669, term62669.getClass(), "jsdocBuilder", null);
        setField(term62669, term62669.getClass(), "sourceName", null);
        setField(term62669, term62669.getClass(), "errorReporter", null);
        setField(term62669, term62669.getClass(), "parser", null);
        setField(term62669, term62669.getClass(), "templateNode", null);
        setField(term62669, term62669.getClass(), "fileOverviewJSDocInfo", null);
        setField(term62669, term62669.getClass(), "state", null);
        setField(term62669, term62669.getClass(), "annotationNames", null);
        setField(term62669, term62669.getClass(), "suppressionNames", null);
        setField(term62669, term62669.getClass(), "fileLevelJsDocBuilder", null);
        setField(term62669, term62669.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "parseUnionTypeWithAlternate", argTypes, term62669, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


