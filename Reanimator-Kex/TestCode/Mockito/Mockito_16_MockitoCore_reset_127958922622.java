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

public class MockitoCore_reset_127958922622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36;
     Object term41;

    public MockitoCore_reset_127958922622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term37 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term38 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term39 = newInstance(Class.forName("org.mockito.internal.util.CreationValidator"));
        Object term40 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term36, term36.getClass(), "reporter", term37);
        setField(term38, term38.getClass(), "creationValidator", term39);
        setField(term36, term36.getClass(), "mockUtil", term38);
        setField(term36, term36.getClass(), "mockingProgress", term40);
        term41 = (Object[]) newArray("java.lang.Object", 3);
        Object term42 = newInstance(Class.forName("java.lang.Object"));
        Object term43 = newInstance(Class.forName("java.lang.Object"));
        Object term44 = newInstance(Class.forName("java.lang.Object"));
        setElement(term41, 0, term42);
        setElement(term41, 1, term43);
        setElement(term41, 2, term44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term41;
        try {
            callMethod(klass, "reset", argTypes, term36, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


