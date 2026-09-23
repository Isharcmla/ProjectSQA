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
import org.mockito.exceptions.misusing.MissingMethodInvocationException;
import static org.mockito.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MockitoCore_when_58946338320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;
     Object term29;

    public MockitoCore_when_58946338320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term25 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term26 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term27 = newInstance(Class.forName("org.mockito.internal.util.CreationValidator"));
        Object term28 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term24, term24.getClass(), "reporter", term25);
        setField(term26, term26.getClass(), "creationValidator", term27);
        setField(term24, term24.getClass(), "mockUtil", term26);
        setField(term24, term24.getClass(), "mockingProgress", term28);
        term29 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term29;
        try {
            callMethod(klass, "when", argTypes, term24, args);
            assertTrue(false);
        }
        catch (MissingMethodInvocationException e) {
        }

    }

};


