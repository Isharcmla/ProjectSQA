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

public class LightweightMessageFormatter_format_413663799320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269873;
     Object term269951;
     Object term270993;
     Object term270994;

    public LightweightMessageFormatter_format_413663799320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269873 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term269873, term269873.getClass(), "source", null);
        term269951 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term269951, term269951.getClass(), "sourceName", null);
        term270993 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term270993, term270993.getClass(), "excerpt", null);
        setField(term270993, term270993.getClass(), "source", null);
        setBooleanField(term270993, term270993.getClass(), "colorize", false);
        term270994 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term270994, term270994.getClass(), "type", null);
        setField(term270994, term270994.getClass(), "description", null);
        setField(term270994, term270994.getClass(), "sourceName", null);
        setField(term270994, term270994.getClass(), "node", null);
        setIntField(term270994, term270994.getClass(), "lineNumber", 0);
        setField(term270994, term270994.getClass(), "level", null);
        setIntField(term270994, term270994.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term269951;
        args[1] = true;
        Object retValue = callMethod(klass, "format", argTypes, term269873, args);
        assertTrue(recursiveEquals(term269873, term270993));
        assertTrue(recursiveEquals(term269951, term270994));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


