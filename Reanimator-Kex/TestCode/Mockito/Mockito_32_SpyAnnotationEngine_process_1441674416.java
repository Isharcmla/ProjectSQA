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
import java.lang.NullPointerException;
import static org.mockito.internal.configuration.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SpyAnnotationEngine_process_1441674416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345;
     Object term346;

    public SpyAnnotationEngine_process_1441674416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term345 = newInstance(Class.forName("org.mockito.internal.configuration.SpyAnnotationEngine"));
        term346 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.configuration.SpyAnnotationEngine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term346;
        try {
            callMethod(klass, "process", argTypes, term345, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


