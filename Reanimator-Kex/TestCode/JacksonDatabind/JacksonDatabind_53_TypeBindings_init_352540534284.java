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

public class TypeBindings_init_352540534284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92266;
     Object term92271;

    public TypeBindings_init_352540534284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term92430 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term92430, term92430.getClass(), "_names", null);
        setField(term92430, term92430.getClass(), "_types", null);
        term92266 = (Object[]) newArray("java.lang.String", 4);
        setElement(term92266, 0, "");
        setElement(term92266, 1, "");
        setElement(term92266, 2, "");
        setElement(term92266, 3, "");
        term92271 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term92686 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term92782 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term92886 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term92686, term92686.getClass(), "_hash", 0);
        setElement(term92271, 0, term92686);
        setIntField(term92782, term92782.getClass(), "_hash", 0);
        setElement(term92271, 1, term92782);
        setIntField(term92886, term92886.getClass(), "_hash", 0);
        setElement(term92271, 2, term92886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term92266;
        args[1] = term92271;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


