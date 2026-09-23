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

public class MockitoCore_stub_60964484217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6;

    public MockitoCore_stub_60964484217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term7 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term8 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term9 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        Object term10 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term6, term6.getClass(), "reporter", term7);
        setField(term8, term8.getClass(), "creationValidator", term9);
        setField(term6, term6.getClass(), "mockUtil", term8);
        setField(term6, term6.getClass(), "mockingProgress", term10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "stub", argTypes, term6, args);
            assertTrue(false);
        }
        catch (MissingMethodInvocationException e) {
        }

    }

};


