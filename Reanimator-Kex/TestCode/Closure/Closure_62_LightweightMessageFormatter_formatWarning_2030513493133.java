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

public class LightweightMessageFormatter_formatWarning_2030513493133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98897;
     Object term98975;
     Object term99196;
     Object term99197;

    public LightweightMessageFormatter_formatWarning_2030513493133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98897 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term98897, term98897.getClass(), "source", null);
        setBooleanField(term98897, term98897.getClass(), "colorize", true);
        term98975 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term98975, term98975.getClass(), "sourceName", "");
        setIntField(term98975, term98975.getClass(), "lineNumber", 1);
        term99196 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term99196, term99196.getClass(), "excerpt", null);
        setField(term99196, term99196.getClass(), "source", null);
        setBooleanField(term99196, term99196.getClass(), "colorize", true);
        term99197 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term99197, term99197.getClass(), "type", null);
        setField(term99197, term99197.getClass(), "description", null);
        setField(term99197, term99197.getClass(), "sourceName", "");
        setField(term99197, term99197.getClass(), "node", null);
        setIntField(term99197, term99197.getClass(), "lineNumber", 1);
        setField(term99197, term99197.getClass(), "level", null);
        setIntField(term99197, term99197.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term98975;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term98897, args);
        assertTrue(recursiveEquals(term98897, term99196));
        assertTrue(recursiveEquals(term98975, term99197));
        assertTrue(recursiveEquals(retValue, ":1: \u001B[35mWARNING\u001B[39m - null\n"));
    }

};


