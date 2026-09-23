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

public class DisambiguateProperties_renameProperties_121249259331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2666;
     Object term198438;

    public DisambiguateProperties_renameProperties_121249259331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2714 = new HashMap();
        term2666 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term2666, term2666.getClass(), "properties", term2714);
        HashMap term198439 = new HashMap();
        term198438 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setBooleanField(term198438, term198438.getClass(), "showInvalidationWarnings", false);
        setField(term198438, term198438.getClass(), "compiler", null);
        setField(term198438, term198438.getClass(), "typeSystem", null);
        setField(term198438, term198438.getClass(), "properties", term198439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "renameProperties", argTypes, term2666, args);
        assertTrue(recursiveEquals(term2666, term198438));
    }

};


