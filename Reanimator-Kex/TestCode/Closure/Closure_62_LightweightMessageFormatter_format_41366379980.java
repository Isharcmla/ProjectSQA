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

public class LightweightMessageFormatter_format_41366379980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50252;
     Object term50330;
     Object term51066;
     Object term51067;

    public LightweightMessageFormatter_format_41366379980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50252 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term50252, term50252.getClass(), "source", null);
        term50330 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term50330, term50330.getClass(), "sourceName", "");
        setIntField(term50330, term50330.getClass(), "lineNumber", 0);
        term51066 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term51066, term51066.getClass(), "excerpt", null);
        setField(term51066, term51066.getClass(), "source", null);
        setBooleanField(term51066, term51066.getClass(), "colorize", false);
        term51067 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term51067, term51067.getClass(), "type", null);
        setField(term51067, term51067.getClass(), "description", null);
        setField(term51067, term51067.getClass(), "sourceName", "");
        setField(term51067, term51067.getClass(), "node", null);
        setIntField(term51067, term51067.getClass(), "lineNumber", 0);
        setField(term51067, term51067.getClass(), "level", null);
        setIntField(term51067, term51067.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term50330;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term50252, args);
        assertTrue(recursiveEquals(term50252, term51066));
        assertTrue(recursiveEquals(term50330, term51067));
        assertTrue(recursiveEquals(retValue, ": WARNING - null\n"));
    }

};


