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

public class POJOPropertyBuilder_explode_29335045231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47325;

    public POJOPropertyBuilder_explode_29335045231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47325 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term47467 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term47559 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term47701 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term47843 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term47325, term47325.getClass(), "_fields", null);
        setField(term47325, term47325.getClass(), "_getters", null);
        setField(term47467, term47467.getClass(), "name", term47559);
        setBooleanField(term47467, term47467.getClass(), "isNameExplicit", false);
        setBooleanField(term47467, term47467.getClass(), "isVisible", false);
        setField(term47701, term47701.getClass(), "name", null);
        setBooleanField(term47701, term47701.getClass(), "isNameExplicit", false);
        setBooleanField(term47701, term47701.getClass(), "isVisible", false);
        setField(term47701, term47701.getClass(), "next", null);
        setField(term47467, term47467.getClass(), "next", term47701);
        setField(term47325, term47325.getClass(), "_setters", term47467);
        setField(term47843, term47843.getClass(), "name", term47559);
        setBooleanField(term47843, term47843.getClass(), "isNameExplicit", false);
        setBooleanField(term47843, term47843.getClass(), "isVisible", true);
        setField(term47325, term47325.getClass(), "_ctorParameters", term47843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term47325, args);
    }

};


