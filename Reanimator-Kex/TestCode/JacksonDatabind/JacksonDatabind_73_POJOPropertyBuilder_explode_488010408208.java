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

public class POJOPropertyBuilder_explode_488010408208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36290;
     Object term36432;

    public POJOPropertyBuilder_explode_488010408208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36290 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        term36432 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term36432, term36432.getClass(), "name", null);
        setBooleanField(term36432, term36432.getClass(), "isNameExplicit", true);
        setBooleanField(term36432, term36432.getClass(), "isVisible", false);
        setField(term36432, term36432.getClass(), "next", term36432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term36432;
        callMethod(klass, "_explode", argTypes, term36290, args);
    }

};


