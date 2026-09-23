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

public class DisambiguateProperties_getTypeWithProperty_2010541308213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95084;
     Object term95312;

    public DisambiguateProperties_getTypeWithProperty_2010541308213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95084 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term95218 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term95084, term95084.getClass(), "typeSystem", term95218);
        term95312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term95418 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplatizedType"));
        setField(term95312, term95312.getClass(), "referencedType", term95418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term95312;
        try {
            callMethod(klass, "getTypeWithProperty", argTypes, term95084, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


