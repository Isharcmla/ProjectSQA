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

public class StdValueInstantiator_init_1394365189271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294502;

    public StdValueInstantiator_init_1394365189271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term294398 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term294538 = Class.forName((String) "com.fasterxml.jackson.databind.type.ResolvedRecursiveType");
        Class<? extends Object> term294716 = Class.forName((String) "com.fasterxml.jackson.databind.type.ResolvedRecursiveType");
        Class<? extends Object> term294844 = Class.forName((String) "com.fasterxml.jackson.databind.type.ResolvedRecursiveType");
        term294502 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term294680 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term294808 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term294964 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term294502, term294502.getClass(), "_class", term294538);
        setField(term294680, term294680.getClass(), "_canonicalName", null);
        setField(term294680, term294680.getClass(), "_class", term294716);
        setField(term294808, term294808.getClass(), "_canonicalName", null);
        setField(term294808, term294808.getClass(), "_class", term294844);
        setField(term294808, term294808.getClass(), "_keyType", term294964);
        setField(term294680, term294680.getClass(), "_referencedType", term294808);
        setField(term294502, term294502.getClass(), "_referencedType", term294680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term294502;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


