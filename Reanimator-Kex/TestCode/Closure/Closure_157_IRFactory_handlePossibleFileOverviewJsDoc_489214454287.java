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

public class IRFactory_handlePossibleFileOverviewJsDoc_489214454287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47336;
     Object term47488;

    public IRFactory_handlePossibleFileOverviewJsDoc_489214454287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47336 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term47336, term47336.getClass(), "sourceString", "");
        term47488 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(term47488, term47488.getClass(), "value", "                  ");
        setIntField(term47488, term47488.getClass(), "lineno", 0);
        setIntField(term47488, term47488.getClass(), "position", 0);
        setField(term47488, term47488.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Object[] args = new Object[1];
        args[0] = term47488;
        try {
            callMethod(klass, "handlePossibleFileOverviewJsDoc", argTypes, term47336, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


