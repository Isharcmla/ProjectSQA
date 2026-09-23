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

public class MockitoCore_stub_10744315819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18;
     Object term23;

    public MockitoCore_stub_10744315819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term19 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term20 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term21 = newInstance(Class.forName("org.mockito.internal.util.CreationValidator"));
        Object term22 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term18, term18.getClass(), "reporter", term19);
        setField(term20, term20.getClass(), "creationValidator", term21);
        setField(term18, term18.getClass(), "mockUtil", term20);
        setField(term18, term18.getClass(), "mockingProgress", term22);
        term23 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23;
        try {
            callMethod(klass, "stub", argTypes, term18, args);
            assertTrue(false);
        }
        catch (MissingMethodInvocationException e) {
        }

    }

};


