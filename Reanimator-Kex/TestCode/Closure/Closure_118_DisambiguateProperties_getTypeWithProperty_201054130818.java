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

public class DisambiguateProperties_getTypeWithProperty_201054130818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1739;
     Object term1763;

    public DisambiguateProperties_getTypeWithProperty_201054130818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1740 = new HashMap();
        term1739 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term1739, term1739.getClass(), "compiler", null);
        setField(term1739, term1739.getClass(), "typeSystem", null);
        setField(term1739, term1739.getClass(), "invalidationMap", null);
        setField(term1739, term1739.getClass(), "propertiesToErrorFor", term1740);
        setField(term1739, term1739.getClass(), "properties", null);
        term1763 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "dWRymuLBtr";
        args[1] = term1763;
        try {
            callMethod(klass, "getTypeWithProperty", argTypes, term1739, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


