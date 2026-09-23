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

public class JsDocInfoParser_next_631041944161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94838;

    public JsDocInfoParser_next_631041944161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94838 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term94838, term94838.getClass(), "stream", null);
        setField(term94838, term94838.getClass(), "jsdocBuilder", null);
        setField(term94838, term94838.getClass(), "sourceName", null);
        setField(term94838, term94838.getClass(), "errorReporter", null);
        setField(term94838, term94838.getClass(), "parser", null);
        setField(term94838, term94838.getClass(), "templateNode", null);
        setField(term94838, term94838.getClass(), "fileOverviewJSDocInfo", null);
        setField(term94838, term94838.getClass(), "state", null);
        setField(term94838, term94838.getClass(), "annotationNames", null);
        setField(term94838, term94838.getClass(), "suppressionNames", null);
        setField(term94838, term94838.getClass(), "fileLevelJsDocBuilder", null);
        setField(term94838, term94838.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "next", argTypes, term94838, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


