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

public class LightweightMessageFormatter_format_413663799114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79929;
     Object term80007;
     Object term82381;
     Object term82382;

    public LightweightMessageFormatter_format_413663799114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79929 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term79929, term79929.getClass(), "source", null);
        term80007 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term80007, term80007.getClass(), "sourceName", null);
        term82381 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term82381, term82381.getClass(), "excerpt", null);
        setField(term82381, term82381.getClass(), "source", null);
        setBooleanField(term82381, term82381.getClass(), "colorize", false);
        term82382 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term82382, term82382.getClass(), "type", null);
        setField(term82382, term82382.getClass(), "description", null);
        setField(term82382, term82382.getClass(), "sourceName", null);
        setField(term82382, term82382.getClass(), "node", null);
        setIntField(term82382, term82382.getClass(), "lineNumber", 0);
        setField(term82382, term82382.getClass(), "level", null);
        setIntField(term82382, term82382.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term80007;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term79929, args);
        assertTrue(recursiveEquals(term79929, term82381));
        assertTrue(recursiveEquals(term80007, term82382));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


