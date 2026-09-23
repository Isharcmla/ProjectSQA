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

public class TypeBindings_init_352540534323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108282;
     Object term108285;

    public TypeBindings_init_352540534323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term108450 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term108289 = (Object[]) newArray("java.lang.String", 0);
        Object[] term108290 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term108450, term108450.getClass(), "_names", term108289);
        setField(term108450, term108450.getClass(), "_types", term108290);
        term108282 = (Object[]) newArray("java.lang.String", 4);
        setElement(term108282, 0, "");
        setElement(term108282, 1, "");
        setElement(term108282, 2, "");
        setElement(term108282, 3, "");
        term108285 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term108630 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term108736 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term108828 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term108630, term108630.getClass(), "_hash", 0);
        setElement(term108285, 0, term108630);
        setIntField(term108736, term108736.getClass(), "_hash", 0);
        setElement(term108285, 1, term108736);
        setIntField(term108828, term108828.getClass(), "_hash", 0);
        setElement(term108285, 2, term108828);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term108282;
        args[1] = term108285;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


