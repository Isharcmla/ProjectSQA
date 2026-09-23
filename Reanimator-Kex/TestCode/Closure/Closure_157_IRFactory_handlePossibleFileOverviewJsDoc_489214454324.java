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

public class IRFactory_handlePossibleFileOverviewJsDoc_489214454324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54545;
     Object term54659;

    public IRFactory_handlePossibleFileOverviewJsDoc_489214454324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54545 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term54659 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(term54659, term54659.getClass(), "value", null);
        setIntField(term54659, term54659.getClass(), "lineno", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Object[] args = new Object[1];
        args[0] = term54659;
        try {
            callMethod(klass, "handlePossibleFileOverviewJsDoc", argTypes, term54545, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


