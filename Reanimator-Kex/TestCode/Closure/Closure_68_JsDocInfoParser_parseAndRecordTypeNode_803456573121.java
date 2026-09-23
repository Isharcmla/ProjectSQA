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

public class JsDocInfoParser_parseAndRecordTypeNode_803456573121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19280;
     Object term19281;
     Object term19283;

    public JsDocInfoParser_parseAndRecordTypeNode_803456573121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19280 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term19280, term19280.getClass(), "stream", null);
        setField(term19280, term19280.getClass(), "jsdocBuilder", null);
        setField(term19280, term19280.getClass(), "sourceName", null);
        setField(term19280, term19280.getClass(), "errorReporter", null);
        setField(term19280, term19280.getClass(), "parser", null);
        setField(term19280, term19280.getClass(), "templateNode", null);
        setField(term19280, term19280.getClass(), "fileOverviewJSDocInfo", null);
        setField(term19280, term19280.getClass(), "state", null);
        setField(term19280, term19280.getClass(), "annotationNames", null);
        setField(term19280, term19280.getClass(), "suppressionNames", null);
        setField(term19280, term19280.getClass(), "fileLevelJsDocBuilder", null);
        setField(term19280, term19280.getClass(), "unreadToken", null);
        term19281 = new Integer(0);
        term19283 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term19281;
        args[2] = term19283;
        try {
            callMethod(klass, "parseAndRecordTypeNode", argTypes, term19280, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


