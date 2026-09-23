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

public class BasicBeanDescription_findPropertyFields_1404215125244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96752;

    public BasicBeanDescription_findPropertyFields_1404215125244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term96932 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term96932, term96932.getClass(), "_fields", null);
        Object term97060 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term97060, term97060.getClass(), "_fields", null);
        Object term97188 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term97188, term97188.getClass(), "_fields", null);
        Object term97322 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term97360 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term96804 = new ArrayList();
        ((ArrayList) term96804).add(term96932);
        ((ArrayList) term96804).add(term97060);
        ((ArrayList) term96804).add(term97188);
        ((ArrayList) term96804).add(term97322);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add(term97360);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        ((ArrayList) term96804).add((Object)null);
        term96752 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term96752, term96752.getClass(), "_properties", term96804);
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
            callMethod(klass, "_findPropertyFields", argTypes, term96752, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


