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

public class TypeBindings_init_352540534295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97126;
     Object term97131;

    public TypeBindings_init_352540534295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term97298 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term97298, term97298.getClass(), "_names", null);
        setField(term97298, term97298.getClass(), "_types", null);
        term97126 = (Object[]) newArray("java.lang.String", 5);
        setElement(term97126, 0, "");
        setElement(term97126, 1, "");
        setElement(term97126, 2, "");
        setElement(term97126, 3, "");
        setElement(term97126, 4, "");
        term97131 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 5);
        Object term97556 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term97660 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term97764 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term97556, term97556.getClass(), "_hash", 0);
        setElement(term97131, 0, term97556);
        setIntField(term97660, term97660.getClass(), "_hash", 0);
        setElement(term97131, 1, term97660);
        setIntField(term97764, term97764.getClass(), "_hash", 0);
        setElement(term97131, 2, term97764);
        setElement(term97131, 3, term97764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term97126;
        args[1] = term97131;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


