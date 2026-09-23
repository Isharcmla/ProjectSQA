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

public class TypeBindings_init_352540534247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79821;
     Object term79825;

    public TypeBindings_init_352540534247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term79987 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term79829 = (Object[]) newArray("java.lang.String", 0);
        setField(term79987, term79987.getClass(), "_names", term79829);
        setField(term79987, term79987.getClass(), "_types", null);
        term79821 = (Object[]) newArray("java.lang.String", 4);
        setElement(term79821, 0, "");
        setElement(term79821, 1, "");
        setElement(term79821, 2, "");
        setElement(term79821, 3, "");
        term79825 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term80205 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term80301 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term80397 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term80205, term80205.getClass(), "_hash", 0);
        setElement(term79825, 0, term80205);
        setIntField(term80301, term80301.getClass(), "_hash", 0);
        setElement(term79825, 1, term80301);
        setIntField(term80397, term80397.getClass(), "_hash", 0);
        setElement(term79825, 2, term80397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term79821;
        args[1] = term79825;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


