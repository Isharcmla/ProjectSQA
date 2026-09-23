package org.mockito.internal.creation;

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
import static org.mockito.internal.creation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.internal.creation.EqualityUtils.*;
import java.lang.Object;

public class MockSettingsImpl_getSpiedInstance_96140619117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198;

    public MockSettingsImpl_getSpiedInstance_96140619117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        Object[] term199 = (Object[]) newArray("java.lang.Class", 1);
        Object term212 = newInstance(Class.forName("java.lang.Object"));
        Object term213 = newInstance(Class.forName("org.mockito.internal.util.MockName"));
        setField(term198, term198.getClass(), "extraInterfaces", term199);
        setField(term198, term198.getClass(), "name", "hRNSzYYIrc");
        setField(term198, term198.getClass(), "spiedInstance", term212);
        setField(term198, term198.getClass(), "defaultAnswer", null);
        setField(term213, term213.getClass(), "mockName", "RMFIsYGgne");
        setBooleanField(term213, term213.getClass(), "surrogate", true);
        setField(term198, term198.getClass(), "mockName", term213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.MockSettingsImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpiedInstance", argTypes, term198, args);
    }

};


