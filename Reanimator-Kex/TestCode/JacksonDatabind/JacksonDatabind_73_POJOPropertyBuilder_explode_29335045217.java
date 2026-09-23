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

public class POJOPropertyBuilder_explode_29335045217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40917;

    public POJOPropertyBuilder_explode_29335045217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40917 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term41059 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term41201 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term41293 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term40917, term40917.getClass(), "_fields", null);
        setField(term40917, term40917.getClass(), "_getters", null);
        setField(term41059, term41059.getClass(), "name", null);
        setBooleanField(term41059, term41059.getClass(), "isNameExplicit", false);
        setBooleanField(term41059, term41059.getClass(), "isVisible", false);
        setField(term41059, term41059.getClass(), "next", null);
        setField(term40917, term40917.getClass(), "_setters", term41059);
        setField(term41201, term41201.getClass(), "name", term41293);
        setBooleanField(term41201, term41201.getClass(), "isNameExplicit", true);
        setField(term40917, term40917.getClass(), "_ctorParameters", term41201);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term40917, args);
    }

};


