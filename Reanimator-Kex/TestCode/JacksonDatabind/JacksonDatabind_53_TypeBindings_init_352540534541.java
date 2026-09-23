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

public class TypeBindings_init_352540534541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219703;
     Object term219709;

    public TypeBindings_init_352540534541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term219890 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term219890, term219890.getClass(), "_names", null);
        setField(term219890, term219890.getClass(), "_types", null);
        term219703 = (Object[]) newArray("java.lang.String", 8);
        setElement(term219703, 0, "");
        setElement(term219703, 1, "");
        setElement(term219703, 2, "");
        setElement(term219703, 3, "");
        setElement(term219703, 4, "");
        setElement(term219703, 5, "");
        setElement(term219703, 6, "");
        setElement(term219703, 7, "");
        term219709 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 8);
        Object term220200 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term220292 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term220384 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term220480 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term220584 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setIntField(term220200, term220200.getClass(), "_hash", 0);
        setElement(term219709, 0, term220200);
        setIntField(term220292, term220292.getClass(), "_hash", 0);
        setElement(term219709, 1, term220292);
        setElement(term219709, 2, term220200);
        setIntField(term220384, term220384.getClass(), "_hash", 0);
        setElement(term219709, 3, term220384);
        setIntField(term220480, term220480.getClass(), "_hash", 0);
        setElement(term219709, 4, term220480);
        setElement(term219709, 7, term220584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term219703;
        args[1] = term219709;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


