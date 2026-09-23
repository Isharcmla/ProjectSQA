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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.Object;

public class ReferenceType_init_206908179451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6497;
     Object term6835;
     Object term6836;

    public ReferenceType_init_206908179451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6393 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term6497 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term6835 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term6835, term6835.getClass(), "_referencedType", null);
        setField(term6835, term6835.getClass(), "_anchorType", term6835);
        setField(term6835, term6835.getClass(), "_superClass", null);
        setField(term6835, term6835.getClass(), "_superInterfaces", null);
        setField(term6835, term6835.getClass(), "_bindings", null);
        setField(term6835, term6835.getClass(), "_canonicalName", null);
        setField(term6835, term6835.getClass(), "_class", null);
        setIntField(term6835, term6835.getClass(), "_hash", 0);
        setField(term6835, term6835.getClass(), "_valueHandler", null);
        setField(term6835, term6835.getClass(), "_typeHandler", null);
        setBooleanField(term6835, term6835.getClass(), "_asStatic", false);
        term6836 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term6836, term6836.getClass(), "_referencedType", null);
        setField(term6836, term6836.getClass(), "_anchorType", null);
        setField(term6836, term6836.getClass(), "_superClass", null);
        setField(term6836, term6836.getClass(), "_superInterfaces", null);
        setField(term6836, term6836.getClass(), "_bindings", null);
        setField(term6836, term6836.getClass(), "_canonicalName", null);
        setField(term6836, term6836.getClass(), "_class", null);
        setIntField(term6836, term6836.getClass(), "_hash", 0);
        setField(term6836, term6836.getClass(), "_valueHandler", null);
        setField(term6836, term6836.getClass(), "_typeHandler", null);
        setBooleanField(term6836, term6836.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.ReferenceType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = term6497;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6835));
        assertTrue(recursiveEquals(term6497, term6836));
    }

};


