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

public class MockSettingsImpl_serializable_32500905613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public MockSettingsImpl_serializable_32500905613() {
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
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.MockSettingsImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "serializable", argTypes, term1, args);
    }

};


