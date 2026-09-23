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

public class JsDocInfoParser_parseFunctionType_1912830455140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55009;

    public JsDocInfoParser_parseFunctionType_1912830455140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55009 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term55009, term55009.getClass(), "stream", null);
        setField(term55009, term55009.getClass(), "jsdocBuilder", null);
        setField(term55009, term55009.getClass(), "sourceName", null);
        setField(term55009, term55009.getClass(), "errorReporter", null);
        setField(term55009, term55009.getClass(), "parser", null);
        setField(term55009, term55009.getClass(), "templateNode", null);
        setField(term55009, term55009.getClass(), "fileOverviewJSDocInfo", null);
        setField(term55009, term55009.getClass(), "state", null);
        setField(term55009, term55009.getClass(), "annotationNames", null);
        setField(term55009, term55009.getClass(), "suppressionNames", null);
        setField(term55009, term55009.getClass(), "fileLevelJsDocBuilder", null);
        setField(term55009, term55009.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "parseFunctionType", argTypes, term55009, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


