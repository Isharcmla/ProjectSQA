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

public class JsDocInfoParser_newNode_731473670151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75951;
     Object term75952;

    public JsDocInfoParser_newNode_731473670151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75951 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term75951, term75951.getClass(), "stream", null);
        setField(term75951, term75951.getClass(), "jsdocBuilder", null);
        setField(term75951, term75951.getClass(), "sourceName", null);
        setField(term75951, term75951.getClass(), "errorReporter", null);
        setField(term75951, term75951.getClass(), "parser", null);
        setField(term75951, term75951.getClass(), "templateNode", null);
        setField(term75951, term75951.getClass(), "fileOverviewJSDocInfo", null);
        setField(term75951, term75951.getClass(), "state", null);
        setField(term75951, term75951.getClass(), "annotationNames", null);
        setField(term75951, term75951.getClass(), "suppressionNames", null);
        setField(term75951, term75951.getClass(), "fileLevelJsDocBuilder", null);
        setField(term75951, term75951.getClass(), "unreadToken", null);
        term75952 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term75952;
        try {
            callMethod(klass, "newNode", argTypes, term75951, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


