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

public class LightweightMessageFormatter_format_41366379939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20829;
     Object term20907;
     Object term21151;
     Object term21152;

    public LightweightMessageFormatter_format_41366379939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20829 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term20829, term20829.getClass(), "source", null);
        term20907 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term20907, term20907.getClass(), "sourceName", "");
        setIntField(term20907, term20907.getClass(), "lineNumber", 0);
        term21151 = newInstance(Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter"));
        setField(term21151, term21151.getClass(), "excerpt", null);
        setField(term21151, term21151.getClass(), "source", null);
        setBooleanField(term21151, term21151.getClass(), "colorize", false);
        term21152 = newInstance(Class.forName("com.google.javascript.jscomp.JSError"));
        setField(term21152, term21152.getClass(), "type", null);
        setField(term21152, term21152.getClass(), "description", null);
        setField(term21152, term21152.getClass(), "sourceName", "");
        setField(term21152, term21152.getClass(), "node", null);
        setIntField(term21152, term21152.getClass(), "lineNumber", 0);
        setField(term21152, term21152.getClass(), "level", null);
        setIntField(term21152, term21152.getClass(), "charno", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LightweightMessageFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.JSError");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term20907;
        args[1] = false;
        Object retValue = callMethod(klass, "format", argTypes, term20829, args);
        assertTrue(recursiveEquals(term20829, term21151));
        assertTrue(recursiveEquals(term20907, term21152));
        assertTrue(recursiveEquals(retValue, ": ERROR - null\n"));
    }

};


