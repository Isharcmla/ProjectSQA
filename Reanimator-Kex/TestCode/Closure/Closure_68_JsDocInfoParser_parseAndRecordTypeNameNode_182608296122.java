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

public class JsDocInfoParser_parseAndRecordTypeNameNode_182608296122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21410;
     Object term21411;
     Object term21413;
     Object term21415;

    public JsDocInfoParser_parseAndRecordTypeNameNode_182608296122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21410 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term21410, term21410.getClass(), "stream", null);
        setField(term21410, term21410.getClass(), "jsdocBuilder", null);
        setField(term21410, term21410.getClass(), "sourceName", null);
        setField(term21410, term21410.getClass(), "errorReporter", null);
        setField(term21410, term21410.getClass(), "parser", null);
        setField(term21410, term21410.getClass(), "templateNode", null);
        setField(term21410, term21410.getClass(), "fileOverviewJSDocInfo", null);
        setField(term21410, term21410.getClass(), "state", null);
        setField(term21410, term21410.getClass(), "annotationNames", null);
        setField(term21410, term21410.getClass(), "suppressionNames", null);
        setField(term21410, term21410.getClass(), "fileLevelJsDocBuilder", null);
        setField(term21410, term21410.getClass(), "unreadToken", null);
        term21411 = new Integer(0);
        term21413 = new Integer(0);
        term21415 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term21411;
        args[2] = term21413;
        args[3] = term21415;
        try {
            callMethod(klass, "parseAndRecordTypeNameNode", argTypes, term21410, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


