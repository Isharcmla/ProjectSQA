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

public class TypeBindings_init_352540534300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98997;
     Object term99002;

    public TypeBindings_init_352540534300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term99174 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term99174, term99174.getClass(), "_names", null);
        setField(term99174, term99174.getClass(), "_types", null);
        term98997 = (Object[]) newArray("java.lang.String", 6);
        setElement(term98997, 0, "");
        setElement(term98997, 1, "");
        setElement(term98997, 2, "");
        setElement(term98997, 3, "");
        setElement(term98997, 4, "");
        setElement(term98997, 5, "");
        term99002 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 6);
        Object term99446 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term99550 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term99642 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term99746 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term99446, term99446.getClass(), "_hash", 0);
        setElement(term99002, 0, term99446);
        setIntField(term99550, term99550.getClass(), "_hash", 0);
        setElement(term99002, 1, term99550);
        setIntField(term99642, term99642.getClass(), "_hash", 0);
        setElement(term99002, 2, term99642);
        setIntField(term99746, term99746.getClass(), "_hash", 0);
        setElement(term99002, 3, term99746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term98997;
        args[1] = term99002;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


