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

public class IRFactory_handleBlockComment_510063534192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55140;
     Object term55234;

    public IRFactory_handleBlockComment_510063534192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55140 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term55234 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.Comment"));
        setField(term55234, term55234.getClass(), "value", "\n * @");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Object[] args = new Object[1];
        args[0] = term55234;
        try {
            callMethod(klass, "handleBlockComment", argTypes, term55140, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


