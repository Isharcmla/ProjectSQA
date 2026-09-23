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

public class JsDocInfoParser_setFileOverviewJSDocInfo_210650355112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4524;

    public JsDocInfoParser_setFileOverviewJSDocInfo_210650355112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4524 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term4524, term4524.getClass(), "stream", null);
        setField(term4524, term4524.getClass(), "jsdocBuilder", null);
        setField(term4524, term4524.getClass(), "sourceName", null);
        setField(term4524, term4524.getClass(), "errorReporter", null);
        setField(term4524, term4524.getClass(), "parser", null);
        setField(term4524, term4524.getClass(), "templateNode", null);
        setField(term4524, term4524.getClass(), "fileOverviewJSDocInfo", null);
        setField(term4524, term4524.getClass(), "state", null);
        setField(term4524, term4524.getClass(), "annotationNames", null);
        setField(term4524, term4524.getClass(), "suppressionNames", null);
        setField(term4524, term4524.getClass(), "fileLevelJsDocBuilder", null);
        setField(term4524, term4524.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFileOverviewJSDocInfo", argTypes, term4524, args);
    }

};


