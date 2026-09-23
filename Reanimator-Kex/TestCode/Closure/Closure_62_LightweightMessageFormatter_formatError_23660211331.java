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

public class LightweightMessageFormatter_formatError_23660211331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17617;
     Object term17695;
     Object term17785;
     Object term17786;

    public LightweightMessageFormatter_formatError_23660211331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17617 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term17617, term17617.getClass(), "source", null);
        term17695 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term17695, term17695.getClass(), "sourceName", null);
        term17785 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term17785, term17785.getClass(), "excerpt", null);
        setField(term17785, term17785.getClass(), "source", null);
        setBooleanField(term17785, term17785.getClass(), "colorize", false);
        term17786 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term17786, term17786.getClass(), "type", null);
        setField(term17786, term17786.getClass(), "description", null);
        setField(term17786, term17786.getClass(), "sourceName", null);
        setField(term17786, term17786.getClass(), "node", null);
        setIntField(term17786, term17786.getClass(), "lineNumber", 0);
        setField(term17786, term17786.getClass(), "level", null);
        setIntField(term17786, term17786.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term17695;
        Object retValue = callMethod(klass, "formatError", argTypes, term17617, args);
        assertTrue(recursiveEquals(term17617, term17785));
        assertTrue(recursiveEquals(term17695, term17786));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


