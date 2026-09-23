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

public class JsDocInfoParser_setFileOverviewJSDocInfo_21065035561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1169;

    public JsDocInfoParser_setFileOverviewJSDocInfo_21065035561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1169 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term1169, term1169.getClass(), "stream", null);
        setField(term1169, term1169.getClass(), "jsdocBuilder", null);
        setField(term1169, term1169.getClass(), "sourceFile", null);
        setField(term1169, term1169.getClass(), "associatedNode", null);
        setField(term1169, term1169.getClass(), "errorReporter", null);
        setField(term1169, term1169.getClass(), "parser", null);
        setField(term1169, term1169.getClass(), "templateNode", null);
        setField(term1169, term1169.getClass(), "fileOverviewJSDocInfo", null);
        setField(term1169, term1169.getClass(), "state", null);
        setField(term1169, term1169.getClass(), "annotationNames", null);
        setField(term1169, term1169.getClass(), "suppressionNames", null);
        setField(term1169, term1169.getClass(), "fileLevelJsDocBuilder", null);
        setField(term1169, term1169.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFileOverviewJSDocInfo", argTypes, term1169, args);
    }

};


