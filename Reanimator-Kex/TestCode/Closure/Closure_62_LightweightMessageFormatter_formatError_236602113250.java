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

public class LightweightMessageFormatter_formatError_236602113250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215882;
     Object term215960;
     Object term218481;
     Object term218482;

    public LightweightMessageFormatter_formatError_236602113250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215882 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term215882, term215882.getClass(), "source", null);
        term215960 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term215960, term215960.getClass(), "sourceName", null);
        term218481 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term218481, term218481.getClass(), "excerpt", null);
        setField(term218481, term218481.getClass(), "source", null);
        setBooleanField(term218481, term218481.getClass(), "colorize", false);
        term218482 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term218482, term218482.getClass(), "type", null);
        setField(term218482, term218482.getClass(), "description", null);
        setField(term218482, term218482.getClass(), "sourceName", null);
        setField(term218482, term218482.getClass(), "node", null);
        setIntField(term218482, term218482.getClass(), "lineNumber", 0);
        setField(term218482, term218482.getClass(), "level", null);
        setIntField(term218482, term218482.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term215960;
        Object retValue = callMethod(klass, "formatError", argTypes, term215882, args);
        assertTrue(recursiveEquals(term215882, term218481));
        assertTrue(recursiveEquals(term215960, term218482));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


