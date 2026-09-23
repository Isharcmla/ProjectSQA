package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.util.ArrayList;
import java.util.HashMap;

public class ExternalTypeHandler_builder_77108373813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547;

    public ExternalTypeHandler_builder_77108373813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term548 = new ArrayList();
        HashMap term552 = new HashMap();
        term547 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$Builder"));
        setField(term547, term547.getClass(), "_beanType", null);
        setField(term547, term547.getClass(), "_properties", term548);
        setField(term547, term547.getClass(), "_nameToPropertyIndex", term552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "builder", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term547));
    }

};


