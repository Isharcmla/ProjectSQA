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
import java.lang.Integer;
import java.lang.Boolean;

public class JsDocInfoParser_parseAndRecordTypeNode_1062104835124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25244;
     Object term25245;
     Object term25247;
     Object term25249;
     Object term25251;

    public JsDocInfoParser_parseAndRecordTypeNode_1062104835124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25244 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term25244, term25244.getClass(), "stream", null);
        setField(term25244, term25244.getClass(), "jsdocBuilder", null);
        setField(term25244, term25244.getClass(), "sourceName", null);
        setField(term25244, term25244.getClass(), "errorReporter", null);
        setField(term25244, term25244.getClass(), "parser", null);
        setField(term25244, term25244.getClass(), "templateNode", null);
        setField(term25244, term25244.getClass(), "fileOverviewJSDocInfo", null);
        setField(term25244, term25244.getClass(), "state", null);
        setField(term25244, term25244.getClass(), "annotationNames", null);
        setField(term25244, term25244.getClass(), "suppressionNames", null);
        setField(term25244, term25244.getClass(), "fileLevelJsDocBuilder", null);
        setField(term25244, term25244.getClass(), "unreadToken", null);
        term25245 = new Integer(0);
        term25247 = new Integer(0);
        term25249 = new Boolean(false);
        term25251 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term25245;
        args[2] = term25247;
        args[3] = term25249;
        args[4] = term25251;
        try {
            callMethod(klass, "parseAndRecordTypeNode", argTypes, term25244, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


