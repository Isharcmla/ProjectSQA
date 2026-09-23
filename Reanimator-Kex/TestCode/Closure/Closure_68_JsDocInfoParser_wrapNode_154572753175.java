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
import java.lang.Integer;

public class JsDocInfoParser_wrapNode_154572753175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74154;
     Object term74155;

    public JsDocInfoParser_wrapNode_154572753175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74154 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term74154, term74154.getClass(), "stream", null);
        setField(term74154, term74154.getClass(), "jsdocBuilder", null);
        setField(term74154, term74154.getClass(), "sourceName", null);
        setField(term74154, term74154.getClass(), "errorReporter", null);
        setField(term74154, term74154.getClass(), "parser", null);
        setField(term74154, term74154.getClass(), "templateNode", null);
        setField(term74154, term74154.getClass(), "fileOverviewJSDocInfo", null);
        setField(term74154, term74154.getClass(), "state", null);
        setField(term74154, term74154.getClass(), "annotationNames", null);
        setField(term74154, term74154.getClass(), "suppressionNames", null);
        setField(term74154, term74154.getClass(), "fileLevelJsDocBuilder", null);
        setField(term74154, term74154.getClass(), "unreadToken", null);
        term74155 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term74155;
        args[1] = null;
        callMethod(klass, "wrapNode", argTypes, term74154, args);
    }

};


