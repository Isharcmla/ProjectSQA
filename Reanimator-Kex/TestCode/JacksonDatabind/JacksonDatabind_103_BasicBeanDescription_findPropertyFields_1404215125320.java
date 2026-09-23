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

public class BasicBeanDescription_findPropertyFields_1404215125320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149973;

    public BasicBeanDescription_findPropertyFields_1404215125320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term150153 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term150153, term150153.getClass(), "_fields", null);
        Object term150281 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term150281, term150281.getClass(), "_fields", null);
        Object term150409 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term150409, term150409.getClass(), "_fields", null);
        Object term150537 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term150537, term150537.getClass(), "_fields", null);
        Object term150667 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term150705 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term150025 = new ArrayList();
        ((ArrayList) term150025).add(term150153);
        ((ArrayList) term150025).add(term150281);
        ((ArrayList) term150025).add(term150409);
        ((ArrayList) term150025).add(term150537);
        ((ArrayList) term150025).add(term150667);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add(term150705);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        ((ArrayList) term150025).add((Object)null);
        term149973 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term149973, term149973.getClass(), "_properties", term150025);
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
            callMethod(klass, "_findPropertyFields", argTypes, term149973, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


