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

public class ObjectIdInfo_init_68682645314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1107;

    public ObjectIdInfo_init_68682645314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1111 = Class.forName((String) "com.fasterxml.jackson.annotation.SimpleObjectIdResolver");
        term1107 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.ObjectIdInfo"));
        Object term1108 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term1108, term1108.getClass(), "_simpleName", "PAEBtnZtTD");
        setField(term1108, term1108.getClass(), "_namespace", null);
        setField(term1108, term1108.getClass(), "_encodedSimple", null);
        setField(term1107, term1107.getClass(), "_propertyName", term1108);
        setField(term1107, term1107.getClass(), "_generator", null);
        setField(term1107, term1107.getClass(), "_resolver", term1111);
        setField(term1107, term1107.getClass(), "_scope", null);
        setBooleanField(term1107, term1107.getClass(), "_alwaysAsId", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.ObjectIdInfo");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = "PAEBtnZtTD";
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1107));
    }

};


