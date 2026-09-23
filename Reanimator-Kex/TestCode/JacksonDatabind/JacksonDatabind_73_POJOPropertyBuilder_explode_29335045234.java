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

public class POJOPropertyBuilder_explode_29335045234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49680;

    public POJOPropertyBuilder_explode_29335045234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49680 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term49822 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term49914 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term50056 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term50198 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term50290 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term49680, term49680.getClass(), "_fields", null);
        setField(term49680, term49680.getClass(), "_getters", null);
        setField(term49822, term49822.getClass(), "name", term49914);
        setBooleanField(term49822, term49822.getClass(), "isNameExplicit", false);
        setBooleanField(term49822, term49822.getClass(), "isVisible", false);
        setField(term50056, term50056.getClass(), "name", null);
        setBooleanField(term50056, term50056.getClass(), "isNameExplicit", false);
        setBooleanField(term50056, term50056.getClass(), "isVisible", false);
        setField(term50056, term50056.getClass(), "next", null);
        setField(term49822, term49822.getClass(), "next", term50056);
        setField(term49680, term49680.getClass(), "_setters", term49822);
        setField(term50198, term50198.getClass(), "name", term50290);
        setBooleanField(term50198, term50198.getClass(), "isNameExplicit", true);
        setField(term49680, term49680.getClass(), "_ctorParameters", term50198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term49680, args);
    }

};


