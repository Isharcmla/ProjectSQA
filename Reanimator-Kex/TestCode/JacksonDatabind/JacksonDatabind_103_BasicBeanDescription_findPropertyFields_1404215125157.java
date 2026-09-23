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

public class BasicBeanDescription_findPropertyFields_1404215125157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42016;

    public BasicBeanDescription_findPropertyFields_1404215125157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42196 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term42196, term42196.getClass(), "_fields", null);
        Object term42324 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term42324, term42324.getClass(), "_fields", null);
        Object term42362 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term42068 = new ArrayList();
        ((ArrayList) term42068).add(term42196);
        ((ArrayList) term42068).add(term42324);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add(term42362);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        ((ArrayList) term42068).add((Object)null);
        term42016 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term42016, term42016.getClass(), "_properties", term42068);
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
            callMethod(klass, "_findPropertyFields", argTypes, term42016, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


