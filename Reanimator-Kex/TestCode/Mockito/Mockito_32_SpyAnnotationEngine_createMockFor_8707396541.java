package org.mockito.internal.configuration;

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
import static org.mockito.internal.configuration.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class SpyAnnotationEngine_createMockFor_8707396541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public SpyAnnotationEngine_createMockFor_8707396541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.mockito.internal.configuration.SpyAnnotationEngine"));
        Class<? extends Object> term130 = Class.forName((String) "java.io.ObjectInputStream$HandleTable$HandleList");
        term2 = ((Class) term130).getDeclaredField((String) "size");
        ((Field) term2).setAccessible(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.configuration.SpyAnnotationEngine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.annotation.Annotation");
        argTypes[1] = Class.forName("java.lang.reflect.Field");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2;
        callMethod(klass, "createMockFor", argTypes, term1, args);
    }

};


