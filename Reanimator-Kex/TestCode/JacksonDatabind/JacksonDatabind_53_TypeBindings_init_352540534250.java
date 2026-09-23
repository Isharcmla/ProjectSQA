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

public class TypeBindings_init_352540534250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80829;
     Object term80832;

    public TypeBindings_init_352540534250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term80986 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term80835 = (Object[]) newArray("java.lang.String", 0);
        Object[] term80836 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term80986, term80986.getClass(), "_names", term80835);
        setField(term80986, term80986.getClass(), "_types", term80836);
        term80829 = (Object[]) newArray("java.lang.String", 3);
        setElement(term80829, 0, "");
        setElement(term80829, 1, "");
        setElement(term80829, 2, "");
        term80832 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 3);
        Object term81166 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term81262 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setIntField(term81166, term81166.getClass(), "_hash", 0);
        setElement(term80832, 0, term81166);
        setIntField(term81262, term81262.getClass(), "_hash", 0);
        setElement(term80832, 1, term81262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term80829;
        args[1] = term80832;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


