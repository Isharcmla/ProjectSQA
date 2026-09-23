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

public class MockSettingsImpl_getMockName_7843182315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100;

    public MockSettingsImpl_getMockName_7843182315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        Object[] term101 = (Object[]) newArray("java.lang.Class", 3);
        Object term114 = newInstance(Class.forName("java.lang.Object"));
        Object term115 = newInstance(Class.forName("org.mockito.internal.util.MockName"));
        setField(term100, term100.getClass(), "extraInterfaces", term101);
        setField(term100, term100.getClass(), "name", "jJCZpVmanW");
        setField(term100, term100.getClass(), "spiedInstance", term114);
        setField(term100, term100.getClass(), "defaultAnswer", null);
        setField(term115, term115.getClass(), "mockName", "EGtDIRbSSb");
        setBooleanField(term115, term115.getClass(), "surrogate", false);
        setField(term100, term100.getClass(), "mockName", term115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.MockSettingsImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMockName", argTypes, term100, args);
    }

};


