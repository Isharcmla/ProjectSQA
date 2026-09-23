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

public class DisambiguateProperties_renameProperties_121249259317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121;

    public DisambiguateProperties_renameProperties_121249259317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setBooleanField(term121, term121.getClass(), "showInvalidationWarnings", true);
        setField(term121, term121.getClass(), "compiler", null);
        setField(term121, term121.getClass(), "typeSystem", null);
        setField(term121, term121.getClass(), "properties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "renameProperties", argTypes, term121, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


