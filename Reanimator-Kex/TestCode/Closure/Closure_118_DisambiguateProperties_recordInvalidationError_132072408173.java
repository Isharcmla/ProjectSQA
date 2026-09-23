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

public class DisambiguateProperties_recordInvalidationError_132072408173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20803;
     Object term20899;
     Object term20906;
     Object term20907;

    public DisambiguateProperties_recordInvalidationError_132072408173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20803 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        term20899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        term20906 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term20906, term20906.getClass(), "compiler", null);
        setField(term20906, term20906.getClass(), "typeSystem", null);
        setField(term20906, term20906.getClass(), "invalidationMap", null);
        setField(term20906, term20906.getClass(), "propertiesToErrorFor", null);
        setField(term20906, term20906.getClass(), "properties", null);
        term20907 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setBooleanField(term20907, term20907.getClass(), "resolved", false);
        setField(term20907, term20907.getClass(), "resolveResult", null);
        setField(term20907, term20907.getClass(), "templateTypeMap", null);
        setBooleanField(term20907, term20907.getClass(), "inTemplatedCheckVisit", false);
        setField(term20907, term20907.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[2];
        args[0] = term20899;
        args[1] = null;
        callMethod(klass, "recordInvalidationError", argTypes, term20803, args);
        assertTrue(recursiveEquals(term20803, term20906));
        assertTrue(recursiveEquals(term20899, term20907));
    }

};


