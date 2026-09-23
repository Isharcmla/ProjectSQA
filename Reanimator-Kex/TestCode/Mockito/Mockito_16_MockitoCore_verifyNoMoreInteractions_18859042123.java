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
import org.mockito.exceptions.misusing.NotAMockException;
import static org.mockito.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MockitoCore_verifyNoMoreInteractions_18859042123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;
     Object term50;

    public MockitoCore_verifyNoMoreInteractions_18859042123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term46 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term47 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term48 = newInstance(Class.forName("org.mockito.internal.util.CreationValidator"));
        Object term49 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term45, term45.getClass(), "reporter", term46);
        setField(term47, term47.getClass(), "creationValidator", term48);
        setField(term45, term45.getClass(), "mockUtil", term47);
        setField(term45, term45.getClass(), "mockingProgress", term49);
        term50 = (Object[]) newArray("java.lang.Object", 5);
        Object term51 = newInstance(Class.forName("java.lang.Object"));
        Object term52 = newInstance(Class.forName("java.lang.Object"));
        Object term53 = newInstance(Class.forName("java.lang.Object"));
        Object term54 = newInstance(Class.forName("java.lang.Object"));
        Object term55 = newInstance(Class.forName("java.lang.Object"));
        setElement(term50, 0, term51);
        setElement(term50, 1, term52);
        setElement(term50, 2, term53);
        setElement(term50, 3, term54);
        setElement(term50, 4, term55);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term50;
        try {
            callMethod(klass, "verifyNoMoreInteractions", argTypes, term45, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


