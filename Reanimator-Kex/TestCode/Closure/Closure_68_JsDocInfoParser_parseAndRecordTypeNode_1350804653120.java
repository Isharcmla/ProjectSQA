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
import java.lang.Boolean;

public class JsDocInfoParser_parseAndRecordTypeNode_1350804653120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17192;
     Object term17193;

    public JsDocInfoParser_parseAndRecordTypeNode_1350804653120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17192 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term17192, term17192.getClass(), "stream", null);
        setField(term17192, term17192.getClass(), "jsdocBuilder", null);
        setField(term17192, term17192.getClass(), "sourceName", null);
        setField(term17192, term17192.getClass(), "errorReporter", null);
        setField(term17192, term17192.getClass(), "parser", null);
        setField(term17192, term17192.getClass(), "templateNode", null);
        setField(term17192, term17192.getClass(), "fileOverviewJSDocInfo", null);
        setField(term17192, term17192.getClass(), "state", null);
        setField(term17192, term17192.getClass(), "annotationNames", null);
        setField(term17192, term17192.getClass(), "suppressionNames", null);
        setField(term17192, term17192.getClass(), "fileLevelJsDocBuilder", null);
        setField(term17192, term17192.getClass(), "unreadToken", null);
        term17193 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17193;
        try {
            callMethod(klass, "parseAndRecordTypeNode", argTypes, term17192, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


