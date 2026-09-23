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

public class IRFactory_handlePossibleFileOverviewJsDoc_203477107529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5689;

    public IRFactory_handlePossibleFileOverviewJsDoc_203477107529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5689 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term5689, term5689.getClass(), "sourceString", null);
        setField(term5689, term5689.getClass(), "sourceName", null);
        setField(term5689, term5689.getClass(), "config", null);
        setField(term5689, term5689.getClass(), "errorReporter", null);
        setField(term5689, term5689.getClass(), "transformDispatcher", null);
        setField(term5689, term5689.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term5689, term5689.getClass(), "reservedKeywords", null);
        setField(term5689, term5689.getClass(), "rootNodeJsDocHolder", null);
        setField(term5689, term5689.getClass(), "fileLevelJsDocBuilder", null);
        setField(term5689, term5689.getClass(), "fileOverviewInfo", null);
        setField(term5689, term5689.getClass(), "templateNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "handlePossibleFileOverviewJsDoc", argTypes, term5689, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


