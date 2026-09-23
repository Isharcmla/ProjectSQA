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

public class POJOPropertyBuilder_explode_29335045214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39434;

    public POJOPropertyBuilder_explode_29335045214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39434 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term39576 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term39718 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term39810 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term39952 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term39434, term39434.getClass(), "_fields", null);
        setField(term39576, term39576.getClass(), "name", null);
        setBooleanField(term39576, term39576.getClass(), "isNameExplicit", false);
        setBooleanField(term39576, term39576.getClass(), "isVisible", false);
        setField(term39718, term39718.getClass(), "name", term39810);
        setBooleanField(term39718, term39718.getClass(), "isNameExplicit", false);
        setBooleanField(term39718, term39718.getClass(), "isVisible", false);
        setField(term39718, term39718.getClass(), "next", null);
        setField(term39576, term39576.getClass(), "next", term39718);
        setField(term39434, term39434.getClass(), "_getters", term39576);
        setField(term39434, term39434.getClass(), "_setters", null);
        setField(term39434, term39434.getClass(), "_ctorParameters", term39952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term39434, args);
    }

};


