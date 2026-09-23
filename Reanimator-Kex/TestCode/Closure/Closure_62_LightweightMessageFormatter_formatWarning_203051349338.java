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

public class LightweightMessageFormatter_formatWarning_203051349338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20522;
     Object term20600;
     Object term21047;
     Object term21048;

    public LightweightMessageFormatter_formatWarning_203051349338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20522 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term20522, term20522.getClass(), "source", null);
        term20600 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term20600, term20600.getClass(), "sourceName", null);
        term21047 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term21047, term21047.getClass(), "excerpt", null);
        setField(term21047, term21047.getClass(), "source", null);
        setBooleanField(term21047, term21047.getClass(), "colorize", false);
        term21048 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term21048, term21048.getClass(), "type", null);
        setField(term21048, term21048.getClass(), "description", null);
        setField(term21048, term21048.getClass(), "sourceName", null);
        setField(term21048, term21048.getClass(), "node", null);
        setIntField(term21048, term21048.getClass(), "lineNumber", 0);
        setField(term21048, term21048.getClass(), "level", null);
        setIntField(term21048, term21048.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[1];
        args[0] = term20600;
        Object retValue = callMethod(klass, "formatWarning", argTypes, term20522, args);
        assertTrue(recursiveEquals(term20522, term21047));
        assertTrue(recursiveEquals(term20600, term21048));
        assertTrue(recursiveEquals(retValue, "WARNING - null\n"));
    }

};


