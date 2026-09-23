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

public class MockSettingsImpl_getExtraInterfaces_40712360416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149;

    public MockSettingsImpl_getExtraInterfaces_40712360416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        Object[] term150 = (Object[]) newArray("java.lang.Class", 4);
        Object term163 = newInstance(Class.forName("java.lang.Object"));
        Object term164 = newInstance(Class.forName("org.mockito.internal.util.MockName"));
        setField(term149, term149.getClass(), "extraInterfaces", term150);
        setField(term149, term149.getClass(), "name", "SzjVpOQTyS");
        setField(term149, term149.getClass(), "spiedInstance", term163);
        setField(term149, term149.getClass(), "defaultAnswer", null);
        setField(term164, term164.getClass(), "mockName", "MjGYSRKTNF");
        setBooleanField(term164, term164.getClass(), "surrogate", false);
        setField(term149, term149.getClass(), "mockName", term164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.MockSettingsImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtraInterfaces", argTypes, term149, args);
    }

};


