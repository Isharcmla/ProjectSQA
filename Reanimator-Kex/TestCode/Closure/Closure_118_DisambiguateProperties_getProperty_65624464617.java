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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class DisambiguateProperties_getProperty_65624464617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1705;

    public DisambiguateProperties_getProperty_65624464617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1706 = new HashMap();
        term1705 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term1705, term1705.getClass(), "compiler", null);
        setField(term1705, term1705.getClass(), "typeSystem", null);
        setField(term1705, term1705.getClass(), "invalidationMap", null);
        setField(term1705, term1705.getClass(), "propertiesToErrorFor", term1706);
        setField(term1705, term1705.getClass(), "properties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IoAlmYsBwc";
        try {
            callMethod(klass, "getProperty", argTypes, term1705, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


