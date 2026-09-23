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

public class DisambiguateProperties_buildPropNames_16293660420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1786;

    public DisambiguateProperties_buildPropNames_16293660420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1787 = new HashMap();
        term1786 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term1786, term1786.getClass(), "compiler", null);
        setField(term1786, term1786.getClass(), "typeSystem", null);
        setField(term1786, term1786.getClass(), "invalidationMap", null);
        setField(term1786, term1786.getClass(), "propertiesToErrorFor", term1787);
        setField(term1786, term1786.getClass(), "properties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.graph.UnionFind");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "xrwlQZdwCp";
        try {
            callMethod(klass, "buildPropNames", argTypes, term1786, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


