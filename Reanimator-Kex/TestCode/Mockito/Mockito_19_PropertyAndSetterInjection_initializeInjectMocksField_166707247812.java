package org.mockito.internal.configuration.injection;

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
import static org.mockito.internal.configuration.injection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PropertyAndSetterInjection_initializeInjectMocksField_166707247812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2210;

    public PropertyAndSetterInjection_initializeInjectMocksField_166707247812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2210 = newInstance(Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection"));
        setField(term2210, term2210.getClass(), "mockCandidateFilter", null);
        setField(term2210, term2210.getClass(), "notFinalOrStatic", null);
        setField(term2210, term2210.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "initializeInjectMocksField", argTypes, term2210, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


