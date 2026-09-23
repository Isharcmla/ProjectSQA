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

public class LightweightMessageFormatter_format_41366379952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29575;
     Object term29653;
     Object term30150;
     Object term30151;

    public LightweightMessageFormatter_format_41366379952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29575 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term29575, term29575.getClass(), "source", null);
        term29653 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term29653, term29653.getClass(), "sourceName", "");
        setIntField(term29653, term29653.getClass(), "lineNumber", 0);
        term30150 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term30150, term30150.getClass(), "excerpt", null);
        setField(term30150, term30150.getClass(), "source", null);
        setBooleanField(term30150, term30150.getClass(), "colorize", false);
        term30151 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term30151, term30151.getClass(), "type", null);
        setField(term30151, term30151.getClass(), "description", null);
        setField(term30151, term30151.getClass(), "sourceName", "");
        setField(term30151, term30151.getClass(), "node", null);
        setIntField(term30151, term30151.getClass(), "lineNumber", 0);
        setField(term30151, term30151.getClass(), "level", null);
        setIntField(term30151, term30151.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term29653;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term29575, args);
        assertTrue(recursiveEquals(term29575, term30150));
        assertTrue(recursiveEquals(term29653, term30151));
        assertTrue(recursiveEquals(retValue, ": ERROR - null\n"));
    }

};


