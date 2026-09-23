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

public class POJOPropertyBuilder_explode_29335045192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29262;

    public POJOPropertyBuilder_explode_29335045192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29262 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term29404 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term29546 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term29404, term29404.getClass(), "name", null);
        setBooleanField(term29404, term29404.getClass(), "isNameExplicit", false);
        setBooleanField(term29404, term29404.getClass(), "isVisible", false);
        setField(term29404, term29404.getClass(), "next", null);
        setField(term29262, term29262.getClass(), "_fields", term29404);
        setField(term29262, term29262.getClass(), "_getters", null);
        setField(term29262, term29262.getClass(), "_setters", null);
        setField(term29546, term29546.getClass(), "name", null);
        setBooleanField(term29546, term29546.getClass(), "isNameExplicit", false);
        setBooleanField(term29546, term29546.getClass(), "isVisible", true);
        setField(term29262, term29262.getClass(), "_ctorParameters", term29546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "explode", argTypes, term29262, args);
    }

};


