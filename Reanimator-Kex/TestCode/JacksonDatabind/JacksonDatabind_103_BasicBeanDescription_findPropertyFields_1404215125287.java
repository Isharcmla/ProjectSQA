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

public class BasicBeanDescription_findPropertyFields_1404215125287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128115;
     Object term128735;

    public BasicBeanDescription_findPropertyFields_1404215125287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term128799 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term128799, term128799.getClass(), "_fields", null);
        Object term128423 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term128565 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term128683 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term128565, term128565.getClass(), "value", term128683);
        setField(term128565, term128565.getClass(), "next", null);
        setField(term128423, term128423.getClass(), "_fields", term128565);
        setField(term128423, term128423.getClass(), "_name", null);
        Object[] term127880 = (Object[]) newArray("java.lang.Object", 11);
        setElement(term127880, 0, term128799);
        setElement(term127880, 1, term128423);
        setElement(term127880, 2, term127880);
        ArrayList term128167 = new ArrayList();
        ((ArrayList) term128167).add(term128799);
        ((ArrayList) term128167).add(term128423);
        ((ArrayList) term128167).add((Object)term127880);
        ((ArrayList) term128167).add((Object)null);
        ((ArrayList) term128167).add((Object)null);
        ((ArrayList) term128167).add((Object)null);
        ((ArrayList) term128167).add((Object)null);
        ((ArrayList) term128167).add((Object)null);
        ((ArrayList) term128167).add((Object)null);
        ((ArrayList) term128167).add((Object)null);
        ((ArrayList) term128167).add((Object)null);
        term128115 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term128115, term128115.getClass(), "_properties", term128167);
        term128735 = new ArrayList();
        ((ArrayList) term128735).add((Object)null);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
        ((ArrayList) term128735).add(term128799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term128735;
        args[1] = false;
        try {
            callMethod(klass, "_findPropertyFields", argTypes, term128115, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


