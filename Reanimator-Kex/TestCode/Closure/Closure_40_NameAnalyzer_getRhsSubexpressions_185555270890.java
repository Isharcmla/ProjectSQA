package com.google.javascript.jscomp;

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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NameAnalyzer_getRhsSubexpressions_185555270890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24685;
     Object term24755;

    public NameAnalyzer_getRhsSubexpressions_185555270890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24685 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term24755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24755, term24755.getClass(), "type", 130);
        setField(term24755, term24755.getClass(), "first", term24755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24755;
        try {
            callMethod(klass, "getRhsSubexpressions", argTypes, term24685, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


