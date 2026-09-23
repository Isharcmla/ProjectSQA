package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368619;

    public StdValueInstantiator_init_1394365189312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term368515 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term368655 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        Class<? extends Object> term368833 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        Class<? extends Object> term368961 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        term368619 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term368797 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term368925 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term369065 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term368619, term368619.getClass(), "_class", term368655);
        setField(term368797, term368797.getClass(), "_canonicalName", null);
        setField(term368797, term368797.getClass(), "_class", term368833);
        setField(term368925, term368925.getClass(), "_canonicalName", null);
        setField(term368925, term368925.getClass(), "_class", term368961);
        setField(term369065, term369065.getClass(), "_canonicalName", "");
        setField(term368925, term368925.getClass(), "_keyType", term369065);
        setField(term368797, term368797.getClass(), "_referencedType", term368925);
        setField(term368619, term368619.getClass(), "_referencedType", term368797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term368619;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


