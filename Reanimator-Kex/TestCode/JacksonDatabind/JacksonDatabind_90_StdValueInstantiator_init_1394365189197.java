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

public class StdValueInstantiator_init_1394365189197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162652;

    public StdValueInstantiator_init_1394365189197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term162548 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term162688 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        Class<? extends Object> term163765 = Class.forName((String) "java.util.concurrent.CompletableFuture$Delayer");
        Class term163756 = Array.newInstance(term163765, 0).getClass();
        Class term163741 = Array.newInstance(term163756, 0).getClass();
        Class term162866 = Array.newInstance(term163741, 0).getClass();
        term162652 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term162830 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term162996 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term162652, term162652.getClass(), "_class", term162688);
        setField(term162830, term162830.getClass(), "_canonicalName", null);
        setField(term162830, term162830.getClass(), "_class", term162866);
        setField(term162830, term162830.getClass(), "_referencedType", term162996);
        setField(term162652, term162652.getClass(), "_referencedType", term162830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term162652;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


