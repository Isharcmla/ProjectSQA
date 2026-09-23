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

public class DisambiguateProperties_getTypeWithProperty_2010541308199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84770;
     Object term85052;

    public DisambiguateProperties_getTypeWithProperty_2010541308199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84770 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term84904 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term84770, term84770.getClass(), "typeSystem", term84904);
        term85052 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term85150 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PropertyMap"));
        setField(term85052, term85052.getClass(), "implicitPrototypeFallback", null);
        setField(term85052, term85052.getClass(), "properties", term85150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = " ";
        args[1] = term85052;
        try {
            callMethod(klass, "getTypeWithProperty", argTypes, term84770, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


