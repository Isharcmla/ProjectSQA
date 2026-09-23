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

public class LightweightMessageFormatter_format_413663799290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245919;
     Object term245997;
     Object term247218;
     Object term247219;

    public LightweightMessageFormatter_format_413663799290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245919 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term245919, term245919.getClass(), "source", null);
        term245997 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term245997, term245997.getClass(), "sourceName", null);
        term247218 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term247218, term247218.getClass(), "excerpt", null);
        setField(term247218, term247218.getClass(), "source", null);
        setBooleanField(term247218, term247218.getClass(), "colorize", false);
        term247219 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term247219, term247219.getClass(), "type", null);
        setField(term247219, term247219.getClass(), "description", null);
        setField(term247219, term247219.getClass(), "sourceName", null);
        setField(term247219, term247219.getClass(), "node", null);
        setIntField(term247219, term247219.getClass(), "lineNumber", 0);
        setField(term247219, term247219.getClass(), "level", null);
        setIntField(term247219, term247219.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term245997;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term245919, args);
        assertTrue(recursiveEquals(term245919, term247218));
        assertTrue(recursiveEquals(term245997, term247219));
        assertTrue(recursiveEquals(retValue, "ERROR - null\n"));
    }

};


