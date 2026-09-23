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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.parsing.EqualityUtils.*;

public class JsDocInfoParser_getFileOverviewJSDocInfo_1057711449167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105542;

    public JsDocInfoParser_getFileOverviewJSDocInfo_1057711449167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105542 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term105542, term105542.getClass(), "stream", null);
        setField(term105542, term105542.getClass(), "jsdocBuilder", null);
        setField(term105542, term105542.getClass(), "sourceName", null);
        setField(term105542, term105542.getClass(), "errorReporter", null);
        setField(term105542, term105542.getClass(), "parser", null);
        setField(term105542, term105542.getClass(), "templateNode", null);
        setField(term105542, term105542.getClass(), "fileOverviewJSDocInfo", null);
        setField(term105542, term105542.getClass(), "state", null);
        setField(term105542, term105542.getClass(), "annotationNames", null);
        setField(term105542, term105542.getClass(), "suppressionNames", null);
        setField(term105542, term105542.getClass(), "fileLevelJsDocBuilder", null);
        setField(term105542, term105542.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileOverviewJSDocInfo", argTypes, term105542, args);
    }

};


