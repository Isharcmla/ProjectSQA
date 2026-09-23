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

public class LightweightMessageFormatter_formatError_23660211377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48303;
     Object term48381;
     Object term49372;
     Object term49373;

    public LightweightMessageFormatter_formatError_23660211377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48303 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term48303, term48303.getClass(), "source", null);
        setBooleanField(term48303, term48303.getClass(), "colorize", true);
        term48381 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term48381, term48381.getClass(), "sourceName", null);
        term49372 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term49372, term49372.getClass(), "excerpt", null);
        setField(term49372, term49372.getClass(), "source", null);
        setBooleanField(term49372, term49372.getClass(), "colorize", true);
        term49373 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term49373, term49373.getClass(), "type", null);
        setField(term49373, term49373.getClass(), "description", null);
        setField(term49373, term49373.getClass(), "sourceName", null);
        setField(term49373, term49373.getClass(), "node", null);
        setIntField(term49373, term49373.getClass(), "lineNumber", 0);
        setField(term49373, term49373.getClass(), "level", null);
        setIntField(term49373, term49373.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term48381;
        Object retValue = callMethod(klass, "formatError", argTypes, term48303, args);
        assertTrue(recursiveEquals(term48303, term49372));
        assertTrue(recursiveEquals(term48381, term49373));
        assertTrue(recursiveEquals(retValue, "\u001B[31mERROR\u001B[39m - null\n"));
    }

};


