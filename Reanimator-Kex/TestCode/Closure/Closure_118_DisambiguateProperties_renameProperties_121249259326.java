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
import java.util.HashMap;

public class DisambiguateProperties_renameProperties_121249259326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5947;
     Object term6465;

    public DisambiguateProperties_renameProperties_121249259326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5995 = new HashMap();
        term5947 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term5947, term5947.getClass(), "properties", term5995);
        HashMap term6466 = new HashMap();
        term6465 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term6465, term6465.getClass(), "compiler", null);
        setField(term6465, term6465.getClass(), "typeSystem", null);
        setField(term6465, term6465.getClass(), "invalidationMap", null);
        setField(term6465, term6465.getClass(), "propertiesToErrorFor", null);
        setField(term6465, term6465.getClass(), "properties", term6466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "renameProperties", argTypes, term5947, args);
        assertTrue(recursiveEquals(term5947, term6465));
    }

};


