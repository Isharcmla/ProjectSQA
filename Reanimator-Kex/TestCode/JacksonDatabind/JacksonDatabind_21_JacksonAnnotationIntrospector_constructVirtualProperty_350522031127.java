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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JacksonAnnotationIntrospector_constructVirtualProperty_350522031127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public JacksonAnnotationIntrospector_constructVirtualProperty_350522031127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.annotation.JsonAppend$Attr");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "_constructVirtualProperty", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


