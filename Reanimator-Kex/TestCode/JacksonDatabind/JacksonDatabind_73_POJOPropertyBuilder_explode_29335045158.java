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

public class POJOPropertyBuilder_explode_29335045158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18633;
     Object term19266;
     Object term19260;

    public POJOPropertyBuilder_explode_29335045158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18633 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term18775 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term18633, term18633.getClass(), "_fields", null);
        setField(term18633, term18633.getClass(), "_getters", null);
        setField(term18775, term18775.getClass(), "name", null);
        setBooleanField(term18775, term18775.getClass(), "isNameExplicit", true);
        setField(term18633, term18633.getClass(), "_setters", term18775);
        term19266 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term19267 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term19266, term19266.getClass(), "_forSerialization", false);
        setField(term19266, term19266.getClass(), "_config", null);
        setField(term19266, term19266.getClass(), "_annotationIntrospector", null);
        setField(term19266, term19266.getClass(), "_name", null);
        setField(term19266, term19266.getClass(), "_internalName", null);
        setField(term19266, term19266.getClass(), "_fields", null);
        setField(term19266, term19266.getClass(), "_ctorParameters", null);
        setField(term19266, term19266.getClass(), "_getters", null);
        setField(term19267, term19267.getClass(), "value", null);
        setField(term19267, term19267.getClass(), "next", null);
        setField(term19267, term19267.getClass(), "name", null);
        setBooleanField(term19267, term19267.getClass(), "isNameExplicit", true);
        setBooleanField(term19267, term19267.getClass(), "isVisible", false);
        setBooleanField(term19267, term19267.getClass(), "isMarkedIgnored", false);
        setField(term19266, term19266.getClass(), "_setters", term19267);
        HashMap term19261 = new HashMap();
        term19260 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term19260, term19260.getClass(), "this$0", term19261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "explode", argTypes, term18633, args);
        assertTrue(recursiveEquals(term18633, term19266));
        assertTrue(recursiveEquals(retValue, term19260));
    }

};


