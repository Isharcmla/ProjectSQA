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

public class POJOPropertyBuilder_explode_29335045167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20787;
     Object term21153;
     Object term21147;

    public POJOPropertyBuilder_explode_29335045167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20787 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term20929 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term21071 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term20787, term20787.getClass(), "_fields", null);
        setField(term20929, term20929.getClass(), "name", null);
        setBooleanField(term20929, term20929.getClass(), "isNameExplicit", false);
        setBooleanField(term20929, term20929.getClass(), "isVisible", false);
        setField(term20929, term20929.getClass(), "next", null);
        setField(term20787, term20787.getClass(), "_getters", term20929);
        setField(term20787, term20787.getClass(), "_setters", term21071);
        term21153 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term21154 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term21155 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term21153, term21153.getClass(), "_forSerialization", false);
        setField(term21153, term21153.getClass(), "_config", null);
        setField(term21153, term21153.getClass(), "_annotationIntrospector", null);
        setField(term21153, term21153.getClass(), "_name", null);
        setField(term21153, term21153.getClass(), "_internalName", null);
        setField(term21153, term21153.getClass(), "_fields", null);
        setField(term21153, term21153.getClass(), "_ctorParameters", null);
        setField(term21154, term21154.getClass(), "value", null);
        setField(term21154, term21154.getClass(), "next", null);
        setField(term21154, term21154.getClass(), "name", null);
        setBooleanField(term21154, term21154.getClass(), "isNameExplicit", false);
        setBooleanField(term21154, term21154.getClass(), "isVisible", false);
        setBooleanField(term21154, term21154.getClass(), "isMarkedIgnored", false);
        setField(term21153, term21153.getClass(), "_getters", term21154);
        setField(term21155, term21155.getClass(), "value", null);
        setField(term21155, term21155.getClass(), "next", null);
        setField(term21155, term21155.getClass(), "name", null);
        setBooleanField(term21155, term21155.getClass(), "isNameExplicit", false);
        setBooleanField(term21155, term21155.getClass(), "isVisible", false);
        setBooleanField(term21155, term21155.getClass(), "isMarkedIgnored", false);
        setField(term21153, term21153.getClass(), "_setters", term21155);
        HashMap term21148 = new HashMap();
        term21147 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term21147, term21147.getClass(), "this$0", term21148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "explode", argTypes, term20787, args);
        assertTrue(recursiveEquals(term20787, term21153));
        assertTrue(recursiveEquals(retValue, term21147));
    }

};


