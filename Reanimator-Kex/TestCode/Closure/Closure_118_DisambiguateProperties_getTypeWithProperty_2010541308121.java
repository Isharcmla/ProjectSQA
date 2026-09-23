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
import java.lang.Object;

public class DisambiguateProperties_getTypeWithProperty_2010541308121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41588;
     Object term41832;

    public DisambiguateProperties_getTypeWithProperty_2010541308121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41588 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term41722 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term41588, term41588.getClass(), "typeSystem", term41722);
        term41832 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term41832;
        try {
            callMethod(klass, "getTypeWithProperty", argTypes, term41588, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


