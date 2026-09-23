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
import java.lang.Object;
import java.lang.String;

public class ObjectIdInfo_init_68682645325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4327;

    public ObjectIdInfo_init_68682645325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4053 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        Class<? extends Object> term4331 = Class.forName((String) "com.fasterxml.jackson.annotation.SimpleObjectIdResolver");
        term4327 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        Object term4328 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term4328, term4328.getClass(), "_simpleName", "");
        setField(term4328, term4328.getClass(), "_namespace", null);
        setField(term4328, term4328.getClass(), "_encodedSimple", null);
        setField(term4327, term4327.getClass(), "_propertyName", term4328);
        setField(term4327, term4327.getClass(), "_generator", null);
        setField(term4327, term4327.getClass(), "_resolver", term4331);
        setField(term4327, term4327.getClass(), "_scope", null);
        setBooleanField(term4327, term4327.getClass(), "_alwaysAsId", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.ObjectIdInfo");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4327));
    }

};


