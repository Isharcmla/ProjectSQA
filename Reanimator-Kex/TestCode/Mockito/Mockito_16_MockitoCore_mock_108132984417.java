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
import java.lang.NullPointerException;
import static org.mockito.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MockitoCore_mock_108132984417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8;

    public MockitoCore_mock_108132984417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term9 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term10 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term11 = newInstance(Class.forName("org.mockito.internal.util.CreationValidator"));
        Object term12 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term8, term8.getClass(), "reporter", term9);
        setField(term10, term10.getClass(), "creationValidator", term11);
        setField(term8, term8.getClass(), "mockUtil", term10);
        setField(term8, term8.getClass(), "mockingProgress", term12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("org.mockito.MockSettings");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "mock", argTypes, term8, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


