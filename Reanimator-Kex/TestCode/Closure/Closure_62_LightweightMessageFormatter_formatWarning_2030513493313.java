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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class LightweightMessageFormatter_formatWarning_2030513493313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265961;
     Object term266039;
     Object term267064;
     Object term267065;

    public LightweightMessageFormatter_formatWarning_2030513493313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265961 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term265961, term265961.getClass(), "source", null);
        term266039 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term266039, term266039.getClass(), "sourceName", "");
        setIntField(term266039, term266039.getClass(), "lineNumber", 0);
        term267064 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term267064, term267064.getClass(), "excerpt", null);
        setField(term267064, term267064.getClass(), "source", null);
        setBooleanField(term267064, term267064.getClass(), "colorize", false);
        term267065 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term267065, term267065.getClass(), "type", null);
        setField(term267065, term267065.getClass(), "description", null);
        setField(term267065, term267065.getClass(), "sourceName", "");
        setField(term267065, term267065.getClass(), "node", null);
        setIntField(term267065, term267065.getClass(), "lineNumber", 0);
        setField(term267065, term267065.getClass(), "level", null);
        setIntField(term267065, term267065.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term266039;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term265961, args);
        assertTrue(recursiveEquals(term265961, term267064));
        assertTrue(recursiveEquals(term266039, term267065));
        assertTrue(recursiveEquals(retValue, ": WARNING - null\n"));
    }

};


