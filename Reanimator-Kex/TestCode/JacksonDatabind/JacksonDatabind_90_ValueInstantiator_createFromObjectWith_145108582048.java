package com.fasterxml.jackson.databind.deser;

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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ValueInstantiator_createFromObjectWith_145108582048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;

    public ValueInstantiator_createFromObjectWith_145108582048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.SettableBeanProperty", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableBeanProperty"), 0).getClass();
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term7;
        args[2] = null;
        try {
            callMethod(klass, "createFromObjectWith", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


