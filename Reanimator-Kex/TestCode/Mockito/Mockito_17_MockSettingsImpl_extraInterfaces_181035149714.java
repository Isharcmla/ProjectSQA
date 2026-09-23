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
import org.mockito.exceptions.base.MockitoException;
import static org.mockito.internal.creation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MockSettingsImpl_extraInterfaces_181035149714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;
     Object term79;

    public MockSettingsImpl_extraInterfaces_181035149714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50 = newInstance(Class.forName("org.mockito.internal.creation.MockSettingsImpl"));
        Object[] term51 = (Object[]) newArray("java.lang.Class", 4);
        Object term64 = newInstance(Class.forName("java.lang.Object"));
        Object term65 = newInstance(Class.forName("org.mockito.internal.util.MockName"));
        setField(term50, term50.getClass(), "extraInterfaces", term51);
        setField(term50, term50.getClass(), "name", "MuLcgQHgqz");
        setField(term50, term50.getClass(), "spiedInstance", term64);
        setField(term50, term50.getClass(), "defaultAnswer", null);
        setField(term65, term65.getClass(), "mockName", "xxtlPwDYFs");
        setBooleanField(term65, term65.getClass(), "surrogate", false);
        setField(term50, term50.getClass(), "mockName", term65);
        term79 = (Object[]) newArray("java.lang.Class", 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.creation.MockSettingsImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Class"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term79;
        try {
            callMethod(klass, "extraInterfaces", argTypes, term50, args);
            assertTrue(false);
        }
        catch (MockitoException e) {
        }

    }

};


