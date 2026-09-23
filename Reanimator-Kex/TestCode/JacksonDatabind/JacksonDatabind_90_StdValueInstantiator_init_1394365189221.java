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

public class StdValueInstantiator_init_1394365189221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204059;

    public StdValueInstantiator_init_1394365189221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term203955 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term205428 = Class.forName((String) "java.util.ArrayPrefixHelpers$CumulateTask");
        Class term205419 = Array.newInstance(term205428, 0).getClass();
        Class term205404 = Array.newInstance(term205419, 0).getClass();
        Class term204095 = Array.newInstance(term205404, 0).getClass();
        Class<? extends Object> term204261 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        Class<? extends Object> term204427 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        term204059 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term204225 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term204391 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term204533 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term204059, term204059.getClass(), "_class", term204095);
        setField(term204225, term204225.getClass(), "_canonicalName", null);
        setField(term204225, term204225.getClass(), "_class", term204261);
        setField(term204391, term204391.getClass(), "_canonicalName", null);
        setField(term204391, term204391.getClass(), "_class", term204427);
        setField(term204391, term204391.getClass(), "_keyType", term204533);
        setField(term204225, term204225.getClass(), "_keyType", term204391);
        setField(term204059, term204059.getClass(), "_referencedType", term204225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term204059;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


