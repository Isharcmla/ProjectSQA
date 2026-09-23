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

public class IRFactory_justTransform_690265907518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101112;
     Object term101388;

    public IRFactory_justTransform_690265907518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101112 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term101250 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        setField(term101112, term101112.getClass(), "transformDispatcher", term101250);
        term101388 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement"));
        setIntField(term101388, term101388.getClass(), "type", 55);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = term101388;
        try {
            callMethod(klass, "justTransform", argTypes, term101112, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


