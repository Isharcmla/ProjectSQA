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

public class TypeBindings_init_352540534415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153375;
     Object term153383;

    public TypeBindings_init_352540534415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term153581 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term153383 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 8);
        Object term154659 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term154711 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term154757 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term154809 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term154862 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term154922 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term154975 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term153581, term153581.getClass(), "_names", null);
        setIntField(term154659, term154659.getClass(), "_hash", 0);
        setElement(term153383, 0, term154659);
        setIntField(term154711, term154711.getClass(), "_hash", 0);
        setElement(term153383, 1, term154711);
        setIntField(term154757, term154757.getClass(), "_hash", 0);
        setElement(term153383, 2, term154757);
        setIntField(term154809, term154809.getClass(), "_hash", 0);
        setElement(term153383, 3, term154809);
        setIntField(term154862, term154862.getClass(), "_hash", 0);
        setElement(term153383, 4, term154862);
        setIntField(term154922, term154922.getClass(), "_hash", 0);
        setElement(term153383, 5, term154922);
        setIntField(term154975, term154975.getClass(), "_hash", 0);
        setElement(term153383, 6, term154975);
        setField(term153581, term153581.getClass(), "_types", term153383);
        term153375 = (Object[]) newArray("java.lang.String", 8);
        setElement(term153375, 0, "");
        setElement(term153375, 1, "");
        setElement(term153375, 2, "");
        setElement(term153375, 3, "");
        setElement(term153375, 4, "");
        setElement(term153375, 5, "");
        setElement(term153375, 6, "");
        setElement(term153375, 7, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term153375;
        args[1] = term153383;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


