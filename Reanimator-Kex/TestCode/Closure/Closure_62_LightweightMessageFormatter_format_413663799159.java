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

public class LightweightMessageFormatter_format_413663799159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125224;
     Object term125302;
     Object term125387;
     Object term125388;

    public LightweightMessageFormatter_format_413663799159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125224 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term125224, term125224.getClass(), "source", null);
        term125302 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term125302, term125302.getClass(), "sourceName", null);
        term125387 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term125387, term125387.getClass(), "excerpt", null);
        setField(term125387, term125387.getClass(), "source", null);
        setBooleanField(term125387, term125387.getClass(), "colorize", false);
        term125388 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term125388, term125388.getClass(), "type", null);
        setField(term125388, term125388.getClass(), "description", null);
        setField(term125388, term125388.getClass(), "sourceName", null);
        setField(term125388, term125388.getClass(), "node", null);
        setIntField(term125388, term125388.getClass(), "lineNumber", 0);
        setField(term125388, term125388.getClass(), "level", null);
        setIntField(term125388, term125388.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term125302;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term125224, args);
        assertTrue(recursiveEquals(term125224, term125387));
        assertTrue(recursiveEquals(term125302, term125388));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


