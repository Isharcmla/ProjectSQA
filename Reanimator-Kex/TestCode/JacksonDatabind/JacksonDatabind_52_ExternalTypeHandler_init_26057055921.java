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
import java.lang.Object;
import java.util.HashMap;

public class ExternalTypeHandler_init_26057055921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3139;
     Object term3146;
     Object term3150;

    public ExternalTypeHandler_init_26057055921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3011 = new HashMap();
        Object term2963 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        Object[] term2821 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        setField(term2963, term2963.getClass(), "_properties", term2821);
        setField(term2963, term2963.getClass(), "_nameToPropertyIndex", term3011);
        term3139 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        Object[] term2820 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        setField(term3139, term3139.getClass(), "_properties", term2820);
        setField(term3139, term3139.getClass(), "_nameToPropertyIndex", null);
        term3146 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        Object[] term3147 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        Object[] term3148 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3149 = (Object[]) newArray("com.fasterxml.jackson.databind.util.TokenBuffer", 0);
        setField(term3146, term3146.getClass(), "_properties", term3147);
        setField(term3146, term3146.getClass(), "_nameToPropertyIndex", null);
        setField(term3146, term3146.getClass(), "_typeIds", term3148);
        setField(term3146, term3146.getClass(), "_tokens", term3149);
        term3150 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler"));
        Object[] term3151 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty", 0);
        setField(term3150, term3150.getClass(), "_properties", term3151);
        setField(term3150, term3150.getClass(), "_nameToPropertyIndex", null);
        setField(term3150, term3150.getClass(), "_typeIds", null);
        setField(term3150, term3150.getClass(), "_tokens", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Object[] args = new Object[1];
        args[0] = term3139;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3146));
        assertTrue(recursiveEquals(term3139, term3150));
    }

};


