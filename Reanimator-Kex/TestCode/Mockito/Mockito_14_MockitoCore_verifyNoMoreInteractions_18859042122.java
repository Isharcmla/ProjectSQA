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

public class MockitoCore_verifyNoMoreInteractions_18859042122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44;
     Object term49;

    public MockitoCore_verifyNoMoreInteractions_18859042122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term45 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term46 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term47 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        Object term48 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term44, term44.getClass(), "reporter", term45);
        setField(term46, term46.getClass(), "creationValidator", term47);
        setField(term44, term44.getClass(), "mockUtil", term46);
        setField(term44, term44.getClass(), "mockingProgress", term48);
        term49 = (Object[]) newArray("java.lang.Object", 5);
        Object term50 = newInstance(Class.forName("java.lang.Object"));
        Object term51 = newInstance(Class.forName("java.lang.Object"));
        Object term52 = newInstance(Class.forName("java.lang.Object"));
        Object term53 = newInstance(Class.forName("java.lang.Object"));
        Object term54 = newInstance(Class.forName("java.lang.Object"));
        setElement(term49, 0, term50);
        setElement(term49, 1, term51);
        setElement(term49, 2, term52);
        setElement(term49, 3, term53);
        setElement(term49, 4, term54);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term49;
        try {
            callMethod(klass, "verifyNoMoreInteractions", argTypes, term44, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


