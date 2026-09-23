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

public class MockSettingsImpl_isSerializable_74224457922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466;

    public MockSettingsImpl_isSerializable_74224457922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        Object[] term467 = (Object[]) newArray("java.lang.Class", 1);
        Object term480 = newInstance(Class.forName("java.lang.Object"));
        Object term481 = newInstance(Class.forName("org.mockito.internal.util.MockName"));
        setField(term466, term466.getClass(), "extraInterfaces", term467);
        setField(term466, term466.getClass(), "name", "pCTimMblYc");
        setField(term466, term466.getClass(), "spiedInstance", term480);
        setField(term466, term466.getClass(), "defaultAnswer", null);
        setField(term481, term481.getClass(), "mockName", "hNxWaHcfhY");
        setBooleanField(term481, term481.getClass(), "surrogate", true);
        setField(term466, term466.getClass(), "mockName", term481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.MockSettingsImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSerializable", argTypes, term466, args);
    }

};


