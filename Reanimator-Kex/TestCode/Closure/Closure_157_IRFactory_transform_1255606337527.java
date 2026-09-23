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
import java.lang.Object;

public class IRFactory_transform_1255606337527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103760;
     Object term104024;

    public IRFactory_transform_1255606337527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103760 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term103898 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        setField(term103760, term103760.getClass(), "transformDispatcher", term103898);
        term104024 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral"));
        setField(term104024, term104024.getClass(), "propListHead", null);
        setIntField(term104024, term104024.getClass(), "type", 144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = term104024;
        try {
            callMethod(klass, "transform", argTypes, term103760, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


