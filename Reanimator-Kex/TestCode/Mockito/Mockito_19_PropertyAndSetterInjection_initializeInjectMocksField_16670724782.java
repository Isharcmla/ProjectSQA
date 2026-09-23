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
import static org.mockito.internal.configuration.injection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class PropertyAndSetterInjection_initializeInjectMocksField_16670724782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408;
     Object term414;
     Object term553;

    public PropertyAndSetterInjection_initializeInjectMocksField_16670724782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term408 = newInstance(Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection"));
        Object term409 = newInstance(Class.forName("org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter"));
        Object term410 = newInstance(Class.forName("org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter"));
        Object term411 = newInstance(Class.forName("org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter"));
        Object term412 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term413 = newInstance(Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection$1"));
        setField(term410, term410.getClass(), "next", term411);
        setField(term410, term410.getClass(), "mockUtil", term412);
        setField(term409, term409.getClass(), "next", term410);
        setField(term408, term408.getClass(), "mockCandidateFilter", term409);
        setField(term413, term413.getClass(), "this$0", term408);
        setField(term408, term408.getClass(), "notFinalOrStatic", term413);
        setField(term408, term408.getClass(), "nextStrategy", null);
        Class<? extends Object> term554 = Class.forName((String) "java.nio.ByteBufferAsFloatBufferRL");
        term414 = ((Class) term554).getDeclaredField((String) "$assertionsDisabled");
        ((Field) term414).setAccessible(true);
        term553 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.configuration.injection.PropertyAndSetterInjection");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term414;
        args[1] = term553;
        callMethod(klass, "initializeInjectMocksField", argTypes, term408, args);
    }

};


