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

public class POJOPropertyBuilder_explode_29335045201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33046;

    public POJOPropertyBuilder_explode_29335045201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33046 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term33188 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term33280 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term33046, term33046.getClass(), "_fields", null);
        setField(term33046, term33046.getClass(), "_getters", null);
        setField(term33046, term33046.getClass(), "_setters", null);
        setField(term33188, term33188.getClass(), "name", term33280);
        setBooleanField(term33188, term33188.getClass(), "isNameExplicit", true);
        setField(term33046, term33046.getClass(), "_ctorParameters", term33188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term33046, args);
    }

};


