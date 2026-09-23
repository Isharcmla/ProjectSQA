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

public class POJOPropertyBuilder_explode_29335045213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38728;

    public POJOPropertyBuilder_explode_29335045213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38728 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term38870 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term38962 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term39104 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term39246 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term38728, term38728.getClass(), "_fields", null);
        setField(term38870, term38870.getClass(), "name", term38962);
        setBooleanField(term38870, term38870.getClass(), "isNameExplicit", false);
        setBooleanField(term38870, term38870.getClass(), "isVisible", false);
        setField(term38870, term38870.getClass(), "next", null);
        setField(term38728, term38728.getClass(), "_getters", term38870);
        setField(term39104, term39104.getClass(), "name", null);
        setBooleanField(term39104, term39104.getClass(), "isNameExplicit", false);
        setBooleanField(term39104, term39104.getClass(), "isVisible", false);
        setField(term39104, term39104.getClass(), "next", null);
        setField(term38728, term38728.getClass(), "_setters", term39104);
        setField(term38728, term38728.getClass(), "_ctorParameters", term39246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term38728, args);
    }

};


