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
import java.util.MissingResourceException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.StringBuilder;

public class Compiler_parseSyntheticCode_823448345368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2566973;

    public Compiler_parseSyntheticCode_823448345368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term2567033 = new StringBuilder();
        term2566973 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term2566973, term2566973.getClass(), "options", null);
        setField(term2566973, term2566973.getClass(), "errorManager", null);
        setField(term2566973, term2566973.getClass(), "outStream", null);
        setField(term2566973, term2566973.getClass(), "debugLog", term2567033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = null;
        try {
            callMethod(klass, "parseSyntheticCode", argTypes, term2566973, args);
            assertTrue(false);
        }
        catch (MissingResourceException e) {
        }

    }

};


