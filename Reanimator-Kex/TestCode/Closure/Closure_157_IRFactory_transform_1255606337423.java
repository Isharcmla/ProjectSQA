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

public class IRFactory_transform_1255606337423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73174;
     Object term73438;

    public IRFactory_transform_1255606337423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73174 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term73312 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        setField(term73174, term73174.getClass(), "transformDispatcher", term73312);
        term73438 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral"));
        setField(term73438, term73438.getClass(), "propListHead", null);
        setIntField(term73438, term73438.getClass(), "type", 69);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = term73438;
        try {
            callMethod(klass, "transform", argTypes, term73174, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


