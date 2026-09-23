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
import java.lang.ClassCastException;
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class BasicBeanDescription_findPropertyFields_1404215125171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49395;

    public BasicBeanDescription_findPropertyFields_1404215125171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term49575 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term49575, term49575.getClass(), "_fields", null);
        Object term49703 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term49845 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object[] term49191 = (Object[]) newArray("java.lang.Object", 50);
        Object term49883 = newInstance(Class.forName("java.lang.Object"));
        setElement(term49191, 0, term49575);
        setElement(term49191, 1, term49703);
        setElement(term49191, 4, term49883);
        setField(term49845, term49845.getClass(), "value", term49191);
        setField(term49703, term49703.getClass(), "_fields", term49845);
        ArrayList term49447 = new ArrayList();
        ((ArrayList) term49447).add(term49575);
        ((ArrayList) term49447).add(term49703);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add(term49883);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        ((ArrayList) term49447).add((Object)null);
        term49395 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term49395, term49395.getClass(), "_properties", term49447);
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
            callMethod(klass, "_findPropertyFields", argTypes, term49395, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


