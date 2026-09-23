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

public class IRFactory_justTransform_690265907454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81800;
     Object term82076;

    public IRFactory_justTransform_690265907454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81800 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term81938 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        setField(term81800, term81800.getClass(), "transformDispatcher", term81938);
        term82076 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement"));
        setIntField(term82076, term82076.getClass(), "type", 49);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = term82076;
        try {
            callMethod(klass, "justTransform", argTypes, term81800, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


