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

public class StdValueInstantiator_init_1394365189157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98958;

    public StdValueInstantiator_init_1394365189157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term98854 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term99848 = Class.forName((String) "java.io.UncheckedIOException");
        Class term99839 = Array.newInstance(term99848, 0).getClass();
        Class term99824 = Array.newInstance(term99839, 0).getClass();
        Class term98994 = Array.newInstance(term99824, 0).getClass();
        Class term99172 = char.class;
        term98958 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term99136 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term99302 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term98958, term98958.getClass(), "_class", term98994);
        setField(term99136, term99136.getClass(), "_canonicalName", null);
        setField(term99136, term99136.getClass(), "_class", term99172);
        setField(term99136, term99136.getClass(), "_referencedType", term99302);
        setField(term98958, term98958.getClass(), "_referencedType", term99136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term98958;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


