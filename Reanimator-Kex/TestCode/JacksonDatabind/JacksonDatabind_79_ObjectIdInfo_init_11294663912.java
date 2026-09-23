package com.fasterxml.jackson.databind.introspect;

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
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.introspect.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class ObjectIdInfo_init_11294663912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164;

    public ObjectIdInfo_init_11294663912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term165 = Class.forName((String) "com.fasterxml.jackson.annotation.SimpleObjectIdResolver");
        term164 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        setField(term164, term164.getClass(), "_propertyName", null);
        setField(term164, term164.getClass(), "_generator", null);
        setField(term164, term164.getClass(), "_resolver", term165);
        setField(term164, term164.getClass(), "_scope", null);
        setBooleanField(term164, term164.getClass(), "_alwaysAsId", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.ObjectIdInfo");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("java.lang.Class");
        argTypes[3] = Class.forName("java.lang.Class");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term164));
    }

};


