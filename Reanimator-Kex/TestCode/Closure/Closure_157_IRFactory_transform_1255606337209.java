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

public class IRFactory_transform_1255606337209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41535;
     Object term41661;

    public IRFactory_transform_1255606337209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41535 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term41661 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = term41661;
        try {
            callMethod(klass, "transform", argTypes, term41535, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


