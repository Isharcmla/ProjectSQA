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

public class IRFactory_transformNameAsString_53882851737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7152;

    public IRFactory_transformNameAsString_53882851737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7152 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term7152, term7152.getClass(), "sourceString", null);
        setField(term7152, term7152.getClass(), "sourceFile", null);
        setField(term7152, term7152.getClass(), "sourceName", null);
        setField(term7152, term7152.getClass(), "config", null);
        setField(term7152, term7152.getClass(), "errorReporter", null);
        setField(term7152, term7152.getClass(), "transformDispatcher", null);
        setField(term7152, term7152.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term7152, term7152.getClass(), "reservedKeywords", null);
        setField(term7152, term7152.getClass(), "parsedComments", null);
        setField(term7152, term7152.getClass(), "rootNodeJsDocHolder", null);
        setField(term7152, term7152.getClass(), "fileLevelJsDocBuilder", null);
        setField(term7152, term7152.getClass(), "fileOverviewInfo", null);
        setField(term7152, term7152.getClass(), "templateNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.Name");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "transformNameAsString", argTypes, term7152, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


