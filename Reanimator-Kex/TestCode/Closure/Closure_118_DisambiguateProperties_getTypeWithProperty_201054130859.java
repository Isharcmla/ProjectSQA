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
import java.lang.Object;

public class DisambiguateProperties_getTypeWithProperty_201054130859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15520;
     Object term16278;

    public DisambiguateProperties_getTypeWithProperty_201054130859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15520 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term15654 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term15520, term15520.getClass(), "typeSystem", term15654);
        term16278 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term16279 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term16278, term16278.getClass(), "compiler", null);
        setField(term16279, term16279.getClass(), "invalidatingTypes", null);
        setField(term16279, term16279.getClass(), "registry", null);
        setField(term16278, term16278.getClass(), "typeSystem", term16279);
        setField(term16278, term16278.getClass(), "invalidationMap", null);
        setField(term16278, term16278.getClass(), "propertiesToErrorFor", null);
        setField(term16278, term16278.getClass(), "properties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "getTypeWithProperty", argTypes, term15520, args);
        assertTrue(recursiveEquals(term15520, term16278));
        assertTrue(recursiveEquals(retValue, null));
    }

};


