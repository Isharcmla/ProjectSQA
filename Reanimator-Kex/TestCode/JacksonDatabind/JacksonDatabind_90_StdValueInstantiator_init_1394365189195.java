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

public class StdValueInstantiator_init_1394365189195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158523;

    public StdValueInstantiator_init_1394365189195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term158419 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term158559 = Class.forName((String) "com.fasterxml.jackson.databind.type.CollectionType");
        Class<? extends Object> term158737 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        term158523 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term158701 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term158881 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term158523, term158523.getClass(), "_class", term158559);
        setField(term158701, term158701.getClass(), "_canonicalName", null);
        setField(term158701, term158701.getClass(), "_class", term158737);
        setField(term158881, term158881.getClass(), "_canonicalName", "");
        setField(term158701, term158701.getClass(), "_referencedType", term158881);
        setField(term158523, term158523.getClass(), "_referencedType", term158701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term158523;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


