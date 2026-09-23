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
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.introspect.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class POJOPropertyBuilder_explode_29335045143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16630;
     Object term16801;
     Object term16795;

    public POJOPropertyBuilder_explode_29335045143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16630 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term16772 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term16630, term16630.getClass(), "_fields", null);
        setField(term16630, term16630.getClass(), "_getters", null);
        setField(term16630, term16630.getClass(), "_setters", term16772);
        term16801 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term16802 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term16801, term16801.getClass(), "_forSerialization", false);
        setField(term16801, term16801.getClass(), "_config", null);
        setField(term16801, term16801.getClass(), "_annotationIntrospector", null);
        setField(term16801, term16801.getClass(), "_name", null);
        setField(term16801, term16801.getClass(), "_internalName", null);
        setField(term16801, term16801.getClass(), "_fields", null);
        setField(term16801, term16801.getClass(), "_ctorParameters", null);
        setField(term16801, term16801.getClass(), "_getters", null);
        setField(term16802, term16802.getClass(), "value", null);
        setField(term16802, term16802.getClass(), "next", null);
        setField(term16802, term16802.getClass(), "name", null);
        setBooleanField(term16802, term16802.getClass(), "isNameExplicit", false);
        setBooleanField(term16802, term16802.getClass(), "isVisible", false);
        setBooleanField(term16802, term16802.getClass(), "isMarkedIgnored", false);
        setField(term16801, term16801.getClass(), "_setters", term16802);
        HashMap term16796 = new HashMap();
        term16795 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term16795, term16795.getClass(), "this$0", term16796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "explode", argTypes, term16630, args);
        assertTrue(recursiveEquals(term16630, term16801));
        assertTrue(recursiveEquals(retValue, term16795));
    }

};


