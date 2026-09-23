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
import java.lang.Object;

public class POJOPropertyBuilder_explode_29335045233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48866;

    public POJOPropertyBuilder_explode_29335045233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48866 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term49008 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term49100 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term49242 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term49384 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term49476 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term48866, term48866.getClass(), "_fields", null);
        setField(term48866, term48866.getClass(), "_getters", null);
        setField(term49008, term49008.getClass(), "name", term49100);
        setBooleanField(term49008, term49008.getClass(), "isNameExplicit", false);
        setBooleanField(term49008, term49008.getClass(), "isVisible", false);
        setField(term49242, term49242.getClass(), "name", null);
        setBooleanField(term49242, term49242.getClass(), "isNameExplicit", false);
        setBooleanField(term49242, term49242.getClass(), "isVisible", false);
        setField(term49242, term49242.getClass(), "next", null);
        setField(term49008, term49008.getClass(), "next", term49242);
        setField(term48866, term48866.getClass(), "_setters", term49008);
        setField(term49384, term49384.getClass(), "name", term49476);
        setBooleanField(term49384, term49384.getClass(), "isNameExplicit", false);
        setBooleanField(term49384, term49384.getClass(), "isVisible", false);
        setField(term49384, term49384.getClass(), "next", term49384);
        setField(term48866, term48866.getClass(), "_ctorParameters", term49384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term48866, args);
    }

};


