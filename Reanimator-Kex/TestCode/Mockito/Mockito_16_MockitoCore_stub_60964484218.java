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

public class MockitoCore_stub_60964484218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;

    public MockitoCore_stub_60964484218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term14 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term15 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term16 = newInstance(Class.forName("org.mockito.internal.util.CreationValidator"));
        Object term17 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term13, term13.getClass(), "reporter", term14);
        setField(term15, term15.getClass(), "creationValidator", term16);
        setField(term13, term13.getClass(), "mockUtil", term15);
        setField(term13, term13.getClass(), "mockingProgress", term17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "stub", argTypes, term13, args);
            assertTrue(false);
        }
        catch (MissingMethodInvocationException e) {
        }

    }

};


