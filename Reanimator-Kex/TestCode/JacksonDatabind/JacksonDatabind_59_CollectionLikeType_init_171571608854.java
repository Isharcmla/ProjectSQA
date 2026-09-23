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

public class CollectionLikeType_init_171571608854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6868;
     Object term7573;
     Object term7574;

    public CollectionLikeType_init_171571608854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6754 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term6868 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term7573 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term7573, term7573.getClass(), "_elementType", null);
        setField(term7573, term7573.getClass(), "_superClass", null);
        setField(term7573, term7573.getClass(), "_superInterfaces", null);
        setField(term7573, term7573.getClass(), "_bindings", null);
        setField(term7573, term7573.getClass(), "_canonicalName", null);
        setField(term7573, term7573.getClass(), "_class", null);
        setIntField(term7573, term7573.getClass(), "_hash", 0);
        setField(term7573, term7573.getClass(), "_valueHandler", null);
        setField(term7573, term7573.getClass(), "_typeHandler", null);
        setBooleanField(term7573, term7573.getClass(), "_asStatic", false);
        term7574 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term7574, term7574.getClass(), "_elementType", null);
        setField(term7574, term7574.getClass(), "_superClass", null);
        setField(term7574, term7574.getClass(), "_superInterfaces", null);
        setField(term7574, term7574.getClass(), "_bindings", null);
        setField(term7574, term7574.getClass(), "_canonicalName", null);
        setField(term7574, term7574.getClass(), "_class", null);
        setIntField(term7574, term7574.getClass(), "_hash", 0);
        setField(term7574, term7574.getClass(), "_valueHandler", null);
        setField(term7574, term7574.getClass(), "_typeHandler", null);
        setBooleanField(term7574, term7574.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = term6868;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7573));
        assertTrue(recursiveEquals(term6868, term7574));
    }

};


