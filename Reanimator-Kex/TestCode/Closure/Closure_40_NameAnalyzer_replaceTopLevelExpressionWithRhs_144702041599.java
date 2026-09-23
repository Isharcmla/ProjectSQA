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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NameAnalyzer_replaceTopLevelExpressionWithRhs_144702041599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31040;
     Object term31145;

    public NameAnalyzer_replaceTopLevelExpressionWithRhs_144702041599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31040 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        term31145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31145, term31145.getClass(), "type", 115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term31145;
        args[1] = term31145;
        try {
            callMethod(klass, "replaceTopLevelExpressionWithRhs", argTypes, term31040, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


