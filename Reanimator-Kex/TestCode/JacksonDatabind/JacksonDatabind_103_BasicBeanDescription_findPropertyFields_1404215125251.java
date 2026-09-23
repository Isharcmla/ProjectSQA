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

public class BasicBeanDescription_findPropertyFields_1404215125251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101330;

    public BasicBeanDescription_findPropertyFields_1404215125251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101510 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term101652 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term101770 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term101652, term101652.getClass(), "value", term101770);
        setField(term101510, term101510.getClass(), "_fields", term101652);
        Object term101808 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term101382 = new ArrayList();
        ((ArrayList) term101382).add(term101510);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add(term101808);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        ((ArrayList) term101382).add((Object)null);
        term101330 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term101330, term101330.getClass(), "_properties", term101382);
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
            callMethod(klass, "_findPropertyFields", argTypes, term101330, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


