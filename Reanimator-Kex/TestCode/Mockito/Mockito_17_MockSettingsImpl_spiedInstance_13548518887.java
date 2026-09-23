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
import java.lang.Object;

public class MockSettingsImpl_spiedInstance_13548518887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318;
     Object term347;

    public MockSettingsImpl_spiedInstance_13548518887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        Object[] term319 = (Object[]) newArray("java.lang.Class", 2);
        Object term332 = newInstance(Class.forName("java.lang.Object"));
        Object term333 = newInstance(Class.forName("org.mockito.internal.util.MockName"));
        setField(term318, term318.getClass(), "extraInterfaces", term319);
        setField(term318, term318.getClass(), "name", "LQFpaHEwXR");
        setField(term318, term318.getClass(), "spiedInstance", term332);
        setField(term318, term318.getClass(), "defaultAnswer", null);
        setField(term333, term333.getClass(), "mockName", "oVcInYnLWB");
        setBooleanField(term333, term333.getClass(), "surrogate", true);
        setField(term318, term318.getClass(), "mockName", term333);
        term347 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.MockSettingsImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term347;
        callMethod(klass, "spiedInstance", argTypes, term318, args);
    }

};


