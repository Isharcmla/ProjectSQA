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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class BasicBeanDescription_findPropertyFields_1404215125236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92889;

    public BasicBeanDescription_findPropertyFields_1404215125236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term93069 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term93069, term93069.getClass(), "_fields", null);
        Object term93197 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term93197, term93197.getClass(), "_fields", null);
        Object term93325 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term93467 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term93325, term93325.getClass(), "_fields", term93467);
        Object term93505 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term92941 = new ArrayList();
        ((ArrayList) term92941).add(term93069);
        ((ArrayList) term92941).add(term93197);
        ((ArrayList) term92941).add(term93325);
        ((ArrayList) term92941).add((Object)null);
        ((ArrayList) term92941).add((Object)null);
        ((ArrayList) term92941).add((Object)null);
        ((ArrayList) term92941).add((Object)null);
        ((ArrayList) term92941).add((Object)null);
        ((ArrayList) term92941).add((Object)null);
        ((ArrayList) term92941).add((Object)null);
        ((ArrayList) term92941).add((Object)null);
        ((ArrayList) term92941).add((Object)null);
        ((ArrayList) term92941).add((Object)null);
        ((ArrayList) term92941).add((Object)null);
        ((ArrayList) term92941).add((Object)null);
        ((ArrayList) term92941).add((Object)null);
        ((ArrayList) term92941).add(term93505);
        ((ArrayList) term92941).add((Object)null);
        ((ArrayList) term92941).add((Object)null);
        ((ArrayList) term92941).add((Object)null);
        term92889 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term92889, term92889.getClass(), "_properties", term92941);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        try {
            callMethod(klass, "_findPropertyFields", argTypes, term92889, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


