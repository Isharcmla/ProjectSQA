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

public class IRFactory_handlePossibleFileOverviewJsDoc_1608183152258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103962;
     Object term104094;

    public IRFactory_handlePossibleFileOverviewJsDoc_1608183152258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103962 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term103962, term103962.getClass(), "sourceString", "");
        term104094 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.Comment"));
        setField(term104094, term104094.getClass(), "value", "                  ");
        setIntField(term104094, term104094.getClass(), "lineno", 0);
        setIntField(term104094, term104094.getClass(), "position", 0);
        setField(term104094, term104094.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term104094;
        args[1] = null;
        callMethod(klass, "handlePossibleFileOverviewJsDoc", argTypes, term103962, args);
    }

};


