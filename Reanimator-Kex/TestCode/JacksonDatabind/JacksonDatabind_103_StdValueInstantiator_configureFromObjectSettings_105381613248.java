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

public class StdValueInstantiator_configureFromObjectSettings_105381613248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public StdValueInstantiator_configureFromObjectSettings_105381613248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.SettableBeanProperty", 5);
        term2 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.SettableBeanProperty", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams");
        argTypes[5] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty"), 0).getClass();
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term1;
        args[4] = null;
        args[5] = term2;
        try {
            callMethod(klass, "configureFromObjectSettings", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


