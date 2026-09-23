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

public class MockitoCore_when_58946338319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;
     Object term22;

    public MockitoCore_when_58946338319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term18 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term19 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term20 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        Object term21 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term17, term17.getClass(), "reporter", term18);
        setField(term19, term19.getClass(), "creationValidator", term20);
        setField(term17, term17.getClass(), "mockUtil", term19);
        setField(term17, term17.getClass(), "mockingProgress", term21);
        term22 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term22;
        try {
            callMethod(klass, "when", argTypes, term17, args);
            assertTrue(false);
        }
        catch (MissingMethodInvocationException e) {
        }

    }

};


