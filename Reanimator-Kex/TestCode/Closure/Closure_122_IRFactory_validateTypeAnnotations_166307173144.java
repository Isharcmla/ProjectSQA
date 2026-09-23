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

public class IRFactory_validateTypeAnnotations_166307173144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7053;

    public IRFactory_validateTypeAnnotations_166307173144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7053 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term7053, term7053.getClass(), "sourceString", null);
        setField(term7053, term7053.getClass(), "sourceFile", null);
        setField(term7053, term7053.getClass(), "sourceName", null);
        setField(term7053, term7053.getClass(), "config", null);
        setField(term7053, term7053.getClass(), "errorReporter", null);
        setField(term7053, term7053.getClass(), "transformDispatcher", null);
        setField(term7053, term7053.getClass(), "reservedKeywords", null);
        setField(term7053, term7053.getClass(), "parsedComments", null);
        setField(term7053, term7053.getClass(), "rootNodeJsDocHolder", null);
        setField(term7053, term7053.getClass(), "fileLevelJsDocBuilder", null);
        setField(term7053, term7053.getClass(), "fileOverviewInfo", null);
        setField(term7053, term7053.getClass(), "templateNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[1] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "validateTypeAnnotations", argTypes, term7053, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


