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

public class IRFactory_handleBlockComment_510063534240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62937;
     Object term63175;

    public IRFactory_handleBlockComment_510063534240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62937 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term63081 = newInstance(Class.forName("com.google.javascript.jscomp.RhinoErrorReporter$NewRhinoErrorReporter"));
        setField(term62937, term62937.getClass(), "errorReporter", term63081);
        setField(term62937, term62937.getClass(), "sourceName", null);
        term63175 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.Comment"));
        setField(term63175, term63175.getClass(), "value", "\n * @");
        setIntField(term63175, term63175.getClass(), "lineno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Object[] args = new Object[1];
        args[0] = term63175;
        try {
            callMethod(klass, "handleBlockComment", argTypes, term62937, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


