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

public class DisambiguateProperties_getTypeWithProperty_2010541308165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61176;
     Object term61452;

    public DisambiguateProperties_getTypeWithProperty_2010541308165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61176 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term61310 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term61176, term61176.getClass(), "typeSystem", term61310);
        term61452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term61550 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PropertyMap"));
        setField(term61452, term61452.getClass(), "properties", term61550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term61452;
        try {
            callMethod(klass, "getTypeWithProperty", argTypes, term61176, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


