package org.mockito.internal;

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
import static org.mockito.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MockHandler_init_1270286540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public MockHandler_init_1270286540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        Object[] term2 = (Object[]) newArray("java.lang.Class", 5);
        Object term15 = newInstance(Class.forName("java.lang.Object"));
        Object term16 = newInstance(Class.forName("org.mockito.internal.util.MockName"));
        setField(term1, term1.getClass(), "extraInterfaces", term2);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "spiedInstance", term15);
        setField(term1, term1.getClass(), "defaultAnswer", null);
        setField(term16, term16.getClass(), "mockName", "sjlJAEtRrb");
        setBooleanField(term16, term16.getClass(), "surrogate", false);
        setField(term1, term1.getClass(), "mockName", term16);
        setBooleanField(term1, term1.getClass(), "serializable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.internal.creation.MockSettingsImpl");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


