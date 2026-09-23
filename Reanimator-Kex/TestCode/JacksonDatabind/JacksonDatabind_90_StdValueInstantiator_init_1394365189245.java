package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247200;

    public StdValueInstantiator_init_1394365189245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term247096 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term247236 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapLikeType");
        Class<? extends Object> term247402 = Class.forName((String) "java.lang.Object");
        Class<? extends Object> term247576 = Class.forName((String) "java.lang.invoke.BoundMethodHandle$Specializer$Factory");
        term247200 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term247366 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term247540 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term247200, term247200.getClass(), "_class", term247236);
        setField(term247366, term247366.getClass(), "_canonicalName", null);
        setField(term247366, term247366.getClass(), "_class", term247402);
        setField(term247540, term247540.getClass(), "_canonicalName", null);
        setField(term247540, term247540.getClass(), "_class", term247576);
        setField(term247366, term247366.getClass(), "_keyType", term247540);
        setField(term247200, term247200.getClass(), "_referencedType", term247366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term247200;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


