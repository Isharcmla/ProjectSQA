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

public class JsDocInfoParser_setFileLevelJsDocBuilder_1363280416111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2063;

    public JsDocInfoParser_setFileLevelJsDocBuilder_1363280416111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2063 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term2063, term2063.getClass(), "stream", null);
        setField(term2063, term2063.getClass(), "jsdocBuilder", null);
        setField(term2063, term2063.getClass(), "sourceName", null);
        setField(term2063, term2063.getClass(), "errorReporter", null);
        setField(term2063, term2063.getClass(), "parser", null);
        setField(term2063, term2063.getClass(), "templateNode", null);
        setField(term2063, term2063.getClass(), "fileOverviewJSDocInfo", null);
        setField(term2063, term2063.getClass(), "state", null);
        setField(term2063, term2063.getClass(), "annotationNames", null);
        setField(term2063, term2063.getClass(), "suppressionNames", null);
        setField(term2063, term2063.getClass(), "fileLevelJsDocBuilder", null);
        setField(term2063, term2063.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFileLevelJsDocBuilder", argTypes, term2063, args);
    }

};


