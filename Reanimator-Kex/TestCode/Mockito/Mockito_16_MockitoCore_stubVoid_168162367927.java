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

public class MockitoCore_stubVoid_168162367927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;
     Object term85;

    public MockitoCore_stubVoid_168162367927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term81 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term82 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term83 = newInstance(Class.forName("org.mockito.internal.util.CreationValidator"));
        Object term84 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term80, term80.getClass(), "reporter", term81);
        setField(term82, term82.getClass(), "creationValidator", term83);
        setField(term80, term80.getClass(), "mockUtil", term82);
        setField(term80, term80.getClass(), "mockingProgress", term84);
        term85 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term85;
        try {
            callMethod(klass, "stubVoid", argTypes, term80, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


