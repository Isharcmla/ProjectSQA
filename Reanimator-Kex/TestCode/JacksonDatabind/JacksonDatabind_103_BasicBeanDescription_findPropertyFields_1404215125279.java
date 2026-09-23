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

public class BasicBeanDescription_findPropertyFields_1404215125279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121266;

    public BasicBeanDescription_findPropertyFields_1404215125279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term121446 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term121446, term121446.getClass(), "_fields", null);
        Object term121574 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term121574, term121574.getClass(), "_fields", null);
        Object term121702 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term121702, term121702.getClass(), "_fields", null);
        Object term121830 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term121868 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term121318 = new ArrayList();
        ((ArrayList) term121318).add(term121446);
        ((ArrayList) term121318).add(term121574);
        ((ArrayList) term121318).add(term121702);
        ((ArrayList) term121318).add(term121830);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add(term121868);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        ((ArrayList) term121318).add((Object)null);
        term121266 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term121266, term121266.getClass(), "_properties", term121318);
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
            callMethod(klass, "_findPropertyFields", argTypes, term121266, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


