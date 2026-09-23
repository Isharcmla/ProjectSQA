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

public class TypeBindings_init_352540534309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103220;
     Object term103223;

    public TypeBindings_init_352540534309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103388 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term103227 = (Object[]) newArray("java.lang.String", 0);
        Object[] term103228 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term103388, term103388.getClass(), "_names", term103227);
        setField(term103388, term103388.getClass(), "_types", term103228);
        term103220 = (Object[]) newArray("java.lang.String", 4);
        setElement(term103220, 0, "");
        setElement(term103220, 1, "");
        setElement(term103220, 2, "");
        setElement(term103220, 3, "");
        term103223 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 4);
        Object term103584 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term103688 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term103780 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term103584, term103584.getClass(), "_hash", 0);
        setElement(term103223, 0, term103584);
        setIntField(term103688, term103688.getClass(), "_hash", 0);
        setElement(term103223, 1, term103688);
        setIntField(term103780, term103780.getClass(), "_hash", 0);
        setElement(term103223, 2, term103780);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term103220;
        args[1] = term103223;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


