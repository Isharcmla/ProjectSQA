package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeBindings_init_352540534509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202037;
     Object term202042;

    public TypeBindings_init_352540534509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term202209 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term202209, term202209.getClass(), "_names", null);
        setField(term202209, term202209.getClass(), "_types", null);
        term202037 = (Object[]) newArray("java.lang.String", 5);
        setElement(term202037, 0, "");
        setElement(term202037, 1, "");
        setElement(term202037, 2, "");
        setElement(term202037, 3, "");
        setElement(term202037, 4, "");
        term202042 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 5);
        Object term202465 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term202557 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term202649 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term202465, term202465.getClass(), "_hash", 0);
        setElement(term202042, 0, term202465);
        setIntField(term202557, term202557.getClass(), "_hash", 0);
        setElement(term202042, 1, term202557);
        setIntField(term202649, term202649.getClass(), "_hash", 0);
        setElement(term202042, 2, term202649);
        setElement(term202042, 3, term202649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term202037;
        args[1] = term202042;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


