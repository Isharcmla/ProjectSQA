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

public class StdValueInstantiator_init_1394365189315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374892;

    public StdValueInstantiator_init_1394365189315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term374788 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term374928 = Class.forName((String) "kex.java.lang.AbstractStringBuilder");
        Class<? extends Object> term377339 = Class.forName((String) "java.nio.file.attribute.AclEntry");
        Class term377330 = Array.newInstance(term377339, 0).getClass();
        Class term377315 = Array.newInstance(term377330, 0).getClass();
        Class term375106 = Array.newInstance(term377315, 0).getClass();
        Class<? extends Object> term375286 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        term374892 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term375070 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term375250 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term375430 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term374892, term374892.getClass(), "_class", term374928);
        setField(term375070, term375070.getClass(), "_canonicalName", null);
        setField(term375070, term375070.getClass(), "_class", term375106);
        setField(term375250, term375250.getClass(), "_canonicalName", null);
        setField(term375250, term375250.getClass(), "_class", term375286);
        setField(term375430, term375430.getClass(), "_canonicalName", "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        setField(term375250, term375250.getClass(), "_elementType", term375430);
        setField(term375070, term375070.getClass(), "_referencedType", term375250);
        setField(term374892, term374892.getClass(), "_referencedType", term375070);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term374892;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


