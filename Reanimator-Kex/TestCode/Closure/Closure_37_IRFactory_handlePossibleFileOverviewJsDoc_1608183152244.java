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

public class IRFactory_handlePossibleFileOverviewJsDoc_1608183152244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63690;
     Object term63822;

    public IRFactory_handlePossibleFileOverviewJsDoc_1608183152244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63690 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term63690, term63690.getClass(), "sourceString", "");
        term63822 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.Comment"));
        setField(term63822, term63822.getClass(), "value", "                  ");
        setIntField(term63822, term63822.getClass(), "lineno", 0);
        setIntField(term63822, term63822.getClass(), "position", 0);
        setField(term63822, term63822.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term63822;
        args[1] = null;
        try {
            callMethod(klass, "handlePossibleFileOverviewJsDoc", argTypes, term63690, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


