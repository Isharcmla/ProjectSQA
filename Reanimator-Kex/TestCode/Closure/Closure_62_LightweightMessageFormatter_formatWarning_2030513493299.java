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

public class LightweightMessageFormatter_formatWarning_2030513493299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254642;
     Object term254720;
     Object term254832;
     Object term254833;

    public LightweightMessageFormatter_formatWarning_2030513493299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254642 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term254642, term254642.getClass(), "source", null);
        term254720 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term254720, term254720.getClass(), "sourceName", null);
        term254832 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term254832, term254832.getClass(), "excerpt", null);
        setField(term254832, term254832.getClass(), "source", null);
        setBooleanField(term254832, term254832.getClass(), "colorize", false);
        term254833 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term254833, term254833.getClass(), "type", null);
        setField(term254833, term254833.getClass(), "description", null);
        setField(term254833, term254833.getClass(), "sourceName", null);
        setField(term254833, term254833.getClass(), "node", null);
        setIntField(term254833, term254833.getClass(), "lineNumber", 0);
        setField(term254833, term254833.getClass(), "level", null);
        setIntField(term254833, term254833.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term254720;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term254642, args);
        assertTrue(recursiveEquals(term254642, term254832));
        assertTrue(recursiveEquals(term254720, term254833));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


