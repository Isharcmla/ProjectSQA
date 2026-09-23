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

public class JsDocInfoParser_current_1957521250162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96608;

    public JsDocInfoParser_current_1957521250162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96608 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term96608, term96608.getClass(), "stream", null);
        setField(term96608, term96608.getClass(), "jsdocBuilder", null);
        setField(term96608, term96608.getClass(), "sourceName", null);
        setField(term96608, term96608.getClass(), "errorReporter", null);
        setField(term96608, term96608.getClass(), "parser", null);
        setField(term96608, term96608.getClass(), "templateNode", null);
        setField(term96608, term96608.getClass(), "fileOverviewJSDocInfo", null);
        setField(term96608, term96608.getClass(), "state", null);
        setField(term96608, term96608.getClass(), "annotationNames", null);
        setField(term96608, term96608.getClass(), "suppressionNames", null);
        setField(term96608, term96608.getClass(), "fileLevelJsDocBuilder", null);
        setField(term96608, term96608.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "current", argTypes, term96608, args);
    }

};


