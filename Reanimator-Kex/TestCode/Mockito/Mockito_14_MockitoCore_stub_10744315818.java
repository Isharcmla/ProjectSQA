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

public class MockitoCore_stub_10744315818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;
     Object term16;

    public MockitoCore_stub_10744315818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term12 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term13 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term14 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        Object term15 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term11, term11.getClass(), "reporter", term12);
        setField(term13, term13.getClass(), "creationValidator", term14);
        setField(term11, term11.getClass(), "mockUtil", term13);
        setField(term11, term11.getClass(), "mockingProgress", term15);
        term16 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16;
        try {
            callMethod(klass, "stub", argTypes, term11, args);
            assertTrue(false);
        }
        catch (MissingMethodInvocationException e) {
        }

    }

};


