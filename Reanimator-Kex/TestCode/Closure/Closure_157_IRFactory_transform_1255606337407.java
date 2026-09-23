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

public class IRFactory_transform_1255606337407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70738;
     Object term71002;

    public IRFactory_transform_1255606337407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70738 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term70876 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        setField(term70738, term70738.getClass(), "transformDispatcher", term70876);
        term71002 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral"));
        setField(term71002, term71002.getClass(), "propListHead", null);
        setIntField(term71002, term71002.getClass(), "type", 76);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = term71002;
        try {
            callMethod(klass, "transform", argTypes, term70738, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


