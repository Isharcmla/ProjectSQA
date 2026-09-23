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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ObjectIdInfo_init_11294663929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6234;
     Object term6270;
     Object term6306;
     Object term6342;

    public ObjectIdInfo_init_11294663929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6142 = Class.forName((String) "com.fasterxml.jackson.databind.util.ObjectBuffer");
        Object term6014 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        Object term6106 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term6014, term6014.getClass(), "_propertyName", term6106);
        setField(term6014, term6014.getClass(), "_scope", term6142);
        setField(term6014, term6014.getClass(), "_generator", null);
        setBooleanField(term6014, term6014.getClass(), "_alwaysAsId", false);
        term6234 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term6270 = Class.forName((String) "java.util.concurrent.LinkedBlockingQueue");
        term6306 = Class.forName((String) "java.lang.invoke.ClassSpecializer");
        term6342 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.WritableObjectId");
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
        args[0] = term6234;
        args[1] = term6270;
        args[2] = term6306;
        args[3] = term6342;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


