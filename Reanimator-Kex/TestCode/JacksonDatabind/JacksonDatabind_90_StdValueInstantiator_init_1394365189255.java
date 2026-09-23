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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266823;

    public StdValueInstantiator_init_1394365189255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term266719 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term266859 = Class.forName((String) "java.lang.Class");
        Class<? extends Object> term267025 = Class.forName((String) "com.fasterxml.jackson.databind.type.ReferenceType");
        Class<? extends Object> term267191 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        Class<? extends Object> term267371 = Class.forName((String) "java.util.Calendar$CalendarAccessControlContext");
        term266823 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term266989 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term267155 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term267335 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term266823, term266823.getClass(), "_class", term266859);
        setField(term266989, term266989.getClass(), "_canonicalName", null);
        setField(term266989, term266989.getClass(), "_class", term267025);
        setField(term267155, term267155.getClass(), "_canonicalName", null);
        setField(term267155, term267155.getClass(), "_class", term267191);
        setField(term267335, term267335.getClass(), "_canonicalName", null);
        setField(term267335, term267335.getClass(), "_class", term267371);
        setField(term267155, term267155.getClass(), "_keyType", term267335);
        setField(term266989, term266989.getClass(), "_keyType", term267155);
        setField(term266823, term266823.getClass(), "_referencedType", term266989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term266823;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


