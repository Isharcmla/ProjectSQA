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

public class DisambiguateProperties_getTypeWithProperty_201054130816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96;
     Object term110;

    public DisambiguateProperties_getTypeWithProperty_201054130816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setBooleanField(term96, term96.getClass(), "showInvalidationWarnings", false);
        setField(term96, term96.getClass(), "compiler", null);
        setField(term96, term96.getClass(), "typeSystem", null);
        setField(term96, term96.getClass(), "properties", null);
        term110 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "EGtDIRbSSb";
        args[1] = term110;
        try {
            callMethod(klass, "getTypeWithProperty", argTypes, term96, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


