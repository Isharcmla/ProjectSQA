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

public class TypeBindings_init_352540534353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122464;
     Object term122469;

    public TypeBindings_init_352540534353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term122632 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term122632, term122632.getClass(), "_names", null);
        setField(term122632, term122632.getClass(), "_types", null);
        term122464 = (Object[]) newArray("java.lang.String", 4);
        setElement(term122464, 0, "");
        setElement(term122464, 1, "");
        setElement(term122464, 2, "");
        setElement(term122464, 3, "");
        term122469 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term122904 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term123008 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term123100 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term122904, term122904.getClass(), "_hash", 0);
        setElement(term122469, 0, term122904);
        setIntField(term123008, term123008.getClass(), "_hash", 0);
        setElement(term122469, 1, term123008);
        setIntField(term123100, term123100.getClass(), "_hash", 0);
        setElement(term122469, 2, term123100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term122464;
        args[1] = term122469;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


